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
	 * Enter a parse tree produced by {@link JParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpression(JParser.BlockExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpression(JParser.BlockExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(JParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(JParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#newDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNewDefinition(JParser.NewDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#newDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNewDefinition(JParser.NewDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void enterCallParameters(JParser.CallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void exitCallParameters(JParser.CallParametersContext ctx);
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
	 * Enter a parse tree produced by {@link JParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(JParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(JParser.FieldsContext ctx);
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
	 * Enter a parse tree produced by {@link JParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JParser.TypeContext ctx);
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
	 * Enter a parse tree produced by {@link JParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(JParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(JParser.ParametersContext ctx);
}