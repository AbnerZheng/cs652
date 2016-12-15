// Generated from cs652/j/parser/J.g4 by ANTLR 4.5.1
package cs652.j.parser;

import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symtab.*;

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
	 * Enter a parse tree produced by {@link JParser#statementOfMain}.
	 * @param ctx the parse tree
	 */
	void enterStatementOfMain(JParser.StatementOfMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#statementOfMain}.
	 * @param ctx the parse tree
	 */
	void exitStatementOfMain(JParser.StatementOfMainContext ctx);
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
	 * Enter a parse tree produced by the {@code labelMethod}
	 * labeled alternative in {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLabelMethod(JParser.LabelMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelMethod}
	 * labeled alternative in {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLabelMethod(JParser.LabelMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelField}
	 * labeled alternative in {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLabelField(JParser.LabelFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelField}
	 * labeled alternative in {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLabelField(JParser.LabelFieldContext ctx);
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
	 * Enter a parse tree produced by {@link JParser#fieldsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldsDeclaration(JParser.FieldsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#fieldsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldsDeclaration(JParser.FieldsDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code labelOfAdd}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabelOfAdd(JParser.LabelOfAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelOfAdd}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabelOfAdd(JParser.LabelOfAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelOfMult}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabelOfMult(JParser.LabelOfMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelOfMult}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabelOfMult(JParser.LabelOfMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelOfNew}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabelOfNew(JParser.LabelOfNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelOfNew}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabelOfNew(JParser.LabelOfNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelOfAssign}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabelOfAssign(JParser.LabelOfAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelOfAssign}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabelOfAssign(JParser.LabelOfAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelOfPrintf}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabelOfPrintf(JParser.LabelOfPrintfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelOfPrintf}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabelOfPrintf(JParser.LabelOfPrintfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelOfCall}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabelOfCall(JParser.LabelOfCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelOfCall}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabelOfCall(JParser.LabelOfCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelOfPrimary}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLabelOfPrimary(JParser.LabelOfPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelOfPrimary}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLabelOfPrimary(JParser.LabelOfPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lableOfFieldVisit}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLableOfFieldVisit(JParser.LableOfFieldVisitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lableOfFieldVisit}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLableOfFieldVisit(JParser.LableOfFieldVisitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelParExpression}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLabelParExpression(JParser.LabelParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelParExpression}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLabelParExpression(JParser.LabelParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelThis}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLabelThis(JParser.LabelThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelThis}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLabelThis(JParser.LabelThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelInt}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLabelInt(JParser.LabelIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelInt}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLabelInt(JParser.LabelIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelFloat}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLabelFloat(JParser.LabelFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelFloat}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLabelFloat(JParser.LabelFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelString}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLabelString(JParser.LabelStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelString}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLabelString(JParser.LabelStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelID}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLabelID(JParser.LabelIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelID}
	 * labeled alternative in {@link JParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLabelID(JParser.LabelIDContext ctx);
}