// Generated from CalcFrac.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcFracParser}.
 */
public interface CalcFracListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcFracParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcFracParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcFracParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcFracParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalcFracParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcFracParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalcFracParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcFracParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CalcFracParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcFracParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CalcFracParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcFracParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalcFracParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcFracParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalcFracParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CalcFracParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CalcFracParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(CalcFracParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(CalcFracParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRational}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRational(CalcFracParser.ExprRationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRational}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRational(CalcFracParser.ExprRationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnaryMinus}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryMinus(CalcFracParser.ExprUnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnaryMinus}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryMinus(CalcFracParser.ExprUnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(CalcFracParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(CalcFracParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(CalcFracParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(CalcFracParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(CalcFracParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link CalcFracParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(CalcFracParser.ExprMultDivModContext ctx);
}