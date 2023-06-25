import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

@SuppressWarnings("CheckReturnValue")
public class Execute extends FracLangBaseVisitor<Fraction> {

   Map<String,Fraction> SymbolTable = new HashMap<String,Fraction>();
   Scanner in = new Scanner(System.in);

   @Override public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      Fraction res = visit(ctx.expr());
      if (res!=null){
         System.out.println(res.toString());
      }
      return res;
   }

   @Override public Fraction visitAssignment(FracLangParser.AssignmentContext ctx) {
      Fraction res = visit(ctx.expr());
      String id = ctx.ID().getText();
      if (res!=null){
         SymbolTable.put(id, res);
      }
      return res;
   }

   @Override public Fraction visitExprFrac(FracLangParser.ExprFracContext ctx) {
      String input = ctx.Fraction().getText();
      //System.out.println(input);
      Fraction res = null;
      try {
         int num = Integer.parseInt(input.split("/")[0]);
         int den = Integer.parseInt(input.split("/")[1]);
         res = new Fraction(num, den);
      }
      catch (Exception PatternSyntaxException){
         res = new Fraction(Integer.parseInt(input));
      };
      
      return res;
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      String id = ctx.ID().getText();
      Fraction res = null;
      if (SymbolTable.containsKey(id)){
         res = SymbolTable.get(id);
      }
      return res;
   }
   @Override public Fraction visitExprUnary(FracLangParser.ExprUnaryContext ctx) {
      Fraction n1 = visit(ctx.expr());
      Fraction res = null;
      switch (ctx.op.getText()){
         case "+":
              res = n1;
              break;
         case "-":
            int num = n1.Num();
            int den = n1.Den();
            res = new Fraction(-num, den);
            break;
      }
      return res;
   }

   @Override public Fraction visitExprSomSub(FracLangParser.ExprSomSubContext ctx) {
      Fraction n1 = visit(ctx.expr(0));
      Fraction n2 = visit(ctx.expr(1));
      Fraction res = null;
      if (n1 !=null & n2 !=null){
         switch (ctx.op.getText()){
            case "+":
                  res = new Fraction(n1.Num()*n2.Den()+n2.Num()*n1.Den(),n1.Den()*n2.Den());
                  break;
                  //System.out.println(res);
            case "-":
                  res = new Fraction(n1.Num()*n2.Den()-n2.Num()*n1.Den(),n1.Den()*n2.Den());
                  break;
                  //System.out.println(res);
         }
      }
      return res;
   }

   @Override public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      Fraction n1 = visit(ctx.expr(0));
      Fraction n2 = visit(ctx.expr(1));
      Fraction res = null;
      if (n1 !=null & n2 !=null){
         switch (ctx.op.getText()){
         case "*":
               res = new Fraction(n1.Num()*n2.Num(),n1.Den()*n2.Den());
               break;
               //System.out.println(res);
         case ":":
               res = new Fraction(n1.Num()/n1.Den(),n2.Num()/n2.Den());
               break;
               //System.out.println(res);
         }
      }
      return res;
   }

   @Override public Fraction visitExprRead(FracLangParser.ExprReadContext ctx) {
      String res = ctx.String().getText();
      res = res.substring(1, res.length()-1) ;
      System.out.print(res + ":");
      String input = in.nextLine();
      Fraction rest = null;
      if (input != null) {
         try {
            int num = Integer.parseInt(input.split("/")[0]);
            int den = Integer.parseInt(input.split("/")[1]);
            rest = new Fraction(num, den);
            SymbolTable.put(res,rest);
         }
         catch (Exception PatternSyntaxException){
            rest = new Fraction(Integer.parseInt(input));
            SymbolTable.put(res,rest);
         };
      }
      
      return rest;
   }

   @Override public Fraction visitExprReduce(FracLangParser.ExprReduceContext ctx) {
      Fraction res = visit(ctx.expr());
      int n1 = res.Num();
      int n2 = res.Den();
      int n1_1 = res.Num();
      int n2_2 = res.Den();  

      while (n2_2 != 0){
         int temp = n1_1 % n2_2;
         n1_1 = n2_2;
         n2_2 = temp;
      }
      
      int mdc = n1_1;
      Fraction final_res = new Fraction(n1/mdc,n2/mdc);
      return final_res;
   }

   @Override public Fraction visitExprPar(FracLangParser.ExprParContext ctx) {
      Fraction res = visit(ctx.expr());
      return res;
   }
}
