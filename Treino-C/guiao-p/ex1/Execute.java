import java.lang.invoke.CallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Execute extends StrLangBaseVisitor<String> {

   Map<String,String> SymbolTable = new HashMap<String,String>();
   Scanner in = new Scanner(System.in);

   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitCommand(StrLangParser.CommandContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      String res = visit(ctx.expr());
      if (res!=null){
         if (SymbolTable.containsKey(res)) {
            System.out.println(SymbolTable.get(res));
         }
         if (res.equals("")){
            System.out.println("Var not defined");
            System.exit(0);
         }
         else{
            System.out.println(res);
         }
      }
      return res;
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      String var = ctx.Var().getText();
      String value = visit(ctx.expr());
      if (value != null){
         SymbolTable.put(var, value);
      }
      return value;
   }

   @Override public String visitExprVar(StrLangParser.ExprVarContext ctx) {
      String var = ctx.Var().getText();
      String res = "";
      if (SymbolTable.containsKey(var)){
         res = SymbolTable.get(var);
      }
      return res;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = ctx.String().getText();
      res = res.substring(1, res.length()-1);
      return res;
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      String res = visit(ctx.expr());
      System.out.print(res);
      String prompt = in.nextLine();
      return prompt;
   }

   @Override public String visitExprConcatRemove(StrLangParser.ExprConcatRemoveContext ctx) {
      String res = "";
      String s1 = visit(ctx.expr(0));
      String s2 = visit(ctx.expr(1));
      if (s1!= null & s2!=null){
         switch (ctx.op.getText()){
            case "+":
                  res = s1 + s2;
                  break;
            case "-":
                  res = s1.replace(s2, "");
                  break;
         }
      }
      return res;
   }

   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) {
      String res = visit(ctx.expr());
      res = res.trim();
      return res;
   }

   @Override public String visitExprReplace(StrLangParser.ExprReplaceContext ctx) {
      String res = "";
      String s1 = visit(ctx.expr(0));
      String s2 = visit(ctx.expr(1));
      String s3 = visit(ctx.expr(2));
      res = s1.replace(s2, s3);
      return res;
   }

   @Override public String visitExprParen(StrLangParser.ExprParenContext ctx) {
      String res = visit(ctx.expr());
      return res;
   }
}
