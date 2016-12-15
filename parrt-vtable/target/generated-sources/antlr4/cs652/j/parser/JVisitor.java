// Generated from cs652/j/parser/J.g4 by ANTLR 4.5.1
package cs652.j.parser;

import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symbols.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(JParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpression(JParser.BlockExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(JParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#newDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDefinition(JParser.NewDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(JParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#callParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParameters(JParser.CallParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(JParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JParser.ParametersContext ctx);
}