@SuppressWarnings("CheckReturnValue")
public class Execute extends StrLangBaseVisitor<String> {

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
      
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprinput(StrLangParser.ExprinputContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprVar(StrLangParser.ExprVarContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
