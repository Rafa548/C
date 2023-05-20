@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalcFracBaseVisitor<Fraction> {


   @Override public Fraction visitProgram(CalcFracParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitStat(CalcFracParser.StatContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitPrint(CalcFracParser.PrintContext ctx) {
      Fraction res = null;
      res = visit(ctx.expr());
      System.out.println(res);
      return res;
      //return res;
   }

   @Override public Fraction visitAssign(CalcFracParser.AssignContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprAddSub(CalcFracParser.ExprAddSubContext ctx) {
      Fraction n1 = visit(ctx.expr(0));
      Fraction n2 = visit(ctx.expr(1));
      
      if(ctx.op.getText().equals("+")) {
         return Fraction.add(n1, n2, false);
      }
      else
         return Fraction.sub(n1, n2, false);
   }

   @Override public Fraction visitExprParent(CalcFracParser.ExprParentContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprRational(CalcFracParser.ExprRationalContext ctx) {
      Fraction res = null;
      String s = ctx.getText();
      String[] parts = s.split("/");
      int n = Integer.parseInt(parts[0]);
      int d = Integer.parseInt(parts[1]);
      res = new Fraction(n, d, false);
      return res;
   }

   @Override public Fraction visitExprUnaryMinus(CalcFracParser.ExprUnaryMinusContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprInteger(CalcFracParser.ExprIntegerContext ctx) {
      Fraction res = null;
      res = new Fraction(Integer.parseInt(ctx.getText()));   
      return res;
      //return res;
   }

   @Override public Fraction visitExprReduce(CalcFracParser.ExprReduceContext ctx) {
      Fraction res = null;
      res = visit(ctx.expr()).reduce();
      return res;
   }

   @Override public Fraction visitExprMultDivMod(CalcFracParser.ExprMultDivModContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }
}
