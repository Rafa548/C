import HelloParser;
import HelloParser.ByeContext;
import HelloParser.GreetingsContext;
import HelloParser.PhraseContext;

package Ex1;
@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitPhrase(HelloParser.PhraseContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res;
      res = "Ola: ";
      for (int i = 0; i < ctx.ID().size(); i++) {
         res += ctx.ID(i).getText() + " ";
      }
      System.out.println(res);
      return res;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      String res ;
      res = "Bye: ";
      for (int i = 0; i < ctx.ID().size(); i++) {
         res += ctx.ID(i).getText() + " ";
      }
      System.out.println(res);
      return res;
   }
}
