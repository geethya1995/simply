// Generated from G:/blah/src\grammars.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarsParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(grammarsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(grammarsParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(grammarsParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(grammarsParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(grammarsParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(grammarsParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#funcOut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncOut(grammarsParser.FuncOutContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#funcOutDtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncOutDtype(grammarsParser.FuncOutDtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(grammarsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(grammarsParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(grammarsParser.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(grammarsParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(grammarsParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(grammarsParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(grammarsParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(grammarsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(grammarsParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(grammarsParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(grammarsParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(grammarsParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(grammarsParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarsParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(grammarsParser.ReturnStmtContext ctx);
}