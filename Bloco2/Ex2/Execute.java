@SuppressWarnings("CheckReturnValue")
public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double res = visit(ctx.expr());
      System.out.println(res);
      return res;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      Double n = Double.parseDouble(ctx.Number().getText());
      return n;
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double n1 = visit(ctx.expr(0));
      Double n2 = visit(ctx.expr(1));
      Double res = null;
      switch (ctx.op.getText()) {
         case "+" :
            res = n1 + n2;
            break;
         case "-" :
            res = n1 - n2;
            break;
         case "*" :
            res = n1 * n2;
            break;
         case "/" :
            res = n1 / n2;
            break;
      }
      return res;
   }
}
