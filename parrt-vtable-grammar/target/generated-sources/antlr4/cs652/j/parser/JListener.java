// Generated from cs652/j/parser/J.g4 by ANTLR 4.5.1
package cs652.j.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JParser}.
 */
public interface JListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JParser.PrimaryContext ctx);
}