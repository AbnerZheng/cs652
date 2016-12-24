// Generated from cs652/j/parser/J.g4 by ANTLR 4.5.1
package cs652.j.parser;

import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symtab.*;

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
	 * Visit a parse tree produced by {@link JParser#statementOfMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementOfMain(JParser.StatementOfMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JParser.BlockStatementContext ctx);
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
	 * Visit a parse tree produced by {@link JParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelMethod}
	 * labeled alternative in {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelMethod(JParser.LabelMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelField}
	 * labeled alternative in {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelField(JParser.LabelFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#fieldsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsDeclaration(JParser.FieldsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(JParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelOfAdd}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelOfAdd(JParser.LabelOfAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelOfMult}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelOfMult(JParser.LabelOfMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelOfNew}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelOfNew(JParser.LabelOfNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelOfAssign}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelOfAssign(JParser.LabelOfAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelOfPrintf}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelOfPrintf(JParser.LabelOfPrintfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelOfCall}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelOfCall(JParser.LabelOfCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelOfPrimary}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelOfPrimary(JParser.LabelOfPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lableOfFieldVisit}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLableOfFieldVisit(JParser.LableOfFieldVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelParExpression}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelParExpression(JParser.LabelParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelThis}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelThis(JParser.LabelThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelInt}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelInt(JParser.LabelIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelFloat}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelFloat(JParser.LabelFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelString}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelString(JParser.LabelStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelID}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelID(JParser.LabelIDContext ctx);
}