@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitPhrase(HelloParser.PhraseContext ctx) {
      String res = null;
      return null;
      //return visitChildren(ctx);
      //return res;
   }

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = null;
      System.out.println("Olá: " + ctx.ID.getText());
      return null;
      //return visitChildren(ctx);
      //return res;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      String res = null;
      System.out.println("Adeus: " + ctx.ID.getText());
      return null;
      //return visitChildren(ctx);
      //return res;
   }
}
