// Generated from G:/blah/src\grammars.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarsParser}.
 */
public interface grammarsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarsParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grammarsParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grammarsParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(grammarsParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(grammarsParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(grammarsParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(grammarsParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(grammarsParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(grammarsParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(grammarsParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(grammarsParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(grammarsParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(grammarsParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#funcOut}.
	 * @param ctx the parse tree
	 */
	void enterFuncOut(grammarsParser.FuncOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#funcOut}.
	 * @param ctx the parse tree
	 */
	void exitFuncOut(grammarsParser.FuncOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#funcOutDtype}.
	 * @param ctx the parse tree
	 */
	void enterFuncOutDtype(grammarsParser.FuncOutDtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#funcOutDtype}.
	 * @param ctx the parse tree
	 */
	void exitFuncOutDtype(grammarsParser.FuncOutDtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(grammarsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(grammarsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(grammarsParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(grammarsParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(grammarsParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(grammarsParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(grammarsParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(grammarsParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(grammarsParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(grammarsParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grammarsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grammarsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(grammarsParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(grammarsParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(grammarsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(grammarsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(grammarsParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(grammarsParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(grammarsParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(grammarsParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(grammarsParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(grammarsParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(grammarsParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(grammarsParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(grammarsParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(grammarsParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarsParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(grammarsParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarsParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(grammarsParser.ReturnStmtContext ctx);
}