// Generated from cs652/j/parser/J.g4 by ANTLR 4.5.1
package cs652.j.parser;

import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symbols.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, WS=17, 
		STRING=18, FLOAT=19, INT=20, COMMENT=21, LINE_COMMENT=22;
	public static final int
		RULE_file = 0, RULE_expression = 1, RULE_whileStatement = 2, RULE_ifStatement = 3, 
		RULE_blockExpression = 4, RULE_elseStatement = 5, RULE_newDefinition = 6, 
		RULE_variableDeclaration = 7, RULE_assign = 8, RULE_callParameters = 9, 
		RULE_classDeclaration = 10, RULE_classBody = 11, RULE_fields = 12, RULE_methodDeclaration = 13, 
		RULE_methodBody = 14, RULE_type = 15, RULE_formalParameters = 16, RULE_parameters = 17;
	public static final String[] ruleNames = {
		"file", "expression", "whileStatement", "ifStatement", "blockExpression", 
		"elseStatement", "newDefinition", "variableDeclaration", "assign", "callParameters", 
		"classDeclaration", "classBody", "fields", "methodDeclaration", "methodBody", 
		"type", "formalParameters", "parameters"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "')'", "'return'", "'while'", "'if'", "'{'", 
		"'}'", "'else'", "'new'", "'='", "','", "'class'", "'extends'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "WS", "STRING", "FLOAT", "INT", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "J.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public List<WhileStatementContext> whileStatement() {
			return getRuleContexts(WhileStatementContext.class);
		}
		public WhileStatementContext whileStatement(int i) {
			return getRuleContext(WhileStatementContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(JParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			setState(48);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__10:
			case T__13:
			case ID:
			case STRING:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(43);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(36);
						classDeclaration();
						}
						break;
					case 2:
						{
						setState(37);
						expression();
						setState(38);
						match(T__0);
						}
						break;
					case 3:
						{
						setState(40);
						blockExpression();
						}
						break;
					case 4:
						{
						setState(41);
						whileStatement();
						}
						break;
					case 5:
						{
						setState(42);
						ifStatement();
						}
						break;
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0) );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JParser.ID, i);
		}
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public NewDefinitionContext newDefinition() {
			return getRuleContext(NewDefinitionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(JParser.STRING, 0); }
		public TerminalNode INT() { return getToken(JParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JParser.FLOAT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(ID);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(51);
					match(T__1);
					setState(52);
					match(ID);
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				match(T__2);
				setState(60);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0)) {
					{
					setState(59);
					callParameters();
					}
				}

				setState(62);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				newDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				match(T__4);
				setState(69);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				match(ID);
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						match(T__1);
						setState(72);
						expression();
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				match(ID);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(80);
				match(INT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(81);
				match(FLOAT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			match(T__2);
			setState(86);
			expression();
			setState(87);
			match(T__3);
			setState(92);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__10:
			case ID:
			case STRING:
			case FLOAT:
			case INT:
				{
				setState(88);
				expression();
				setState(89);
				match(T__0);
				}
				break;
			case T__7:
				{
				setState(91);
				blockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__6);
			setState(95);
			match(T__2);
			setState(96);
			expression();
			setState(97);
			match(T__3);
			setState(102);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__10:
			case ID:
			case STRING:
			case FLOAT:
			case INT:
				{
				setState(98);
				expression();
				setState(99);
				match(T__0);
				}
				break;
			case T__7:
				{
				setState(101);
				blockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(104);
				elseStatement();
				}
				break;
			case 2:
				{
				setState(105);
				blockExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__7);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(109);
				expression();
				setState(110);
				match(T__0);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__9);
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(120);
				expression();
				setState(121);
				match(T__0);
				}
				break;
			case 2:
				{
				setState(123);
				ifStatement();
				}
				break;
			case 3:
				{
				setState(124);
				blockExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JParser.ID, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public NewDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterNewDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitNewDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitNewDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDefinitionContext newDefinition() throws RecognitionException {
		NewDefinitionContext _localctx = new NewDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_newDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__10);
			setState(128);
			match(ID);
			setState(129);
			match(T__2);
			setState(131);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				setState(130);
				callParameters();
				}
			}

			setState(133);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JParser.ID, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			type();
			setState(136);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(139);
				match(T__1);
				setState(140);
				match(ID);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__11);
			setState(147);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterCallParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitCallParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParametersContext callParameters() throws RecognitionException {
		CallParametersContext _localctx = new CallParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expression();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(150);
				match(T__12);
				setState(151);
				expression();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__13);
			setState(158);
			match(ID);
			setState(161);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(159);
				match(T__14);
				setState(160);
				match(ID);
				}
			}

			setState(163);
			match(T__7);
			setState(165);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(164);
				classBody();
				}
			}

			setState(167);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<FieldsContext> fields() {
			return getRuleContexts(FieldsContext.class);
		}
		public FieldsContext fields(int i) {
			return getRuleContext(FieldsContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(171);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(169);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(170);
					fields();
					}
					break;
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			variableDeclaration();
			setState(176);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JParser.ID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			type();
			setState(179);
			match(ID);
			setState(180);
			formalParameters();
			setState(181);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__7);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(184);
				expression();
				setState(185);
				match(T__0);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__2);
			setState(198);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(197);
				parameters();
				}
			}

			setState(200);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JParser.ID, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			type();
			setState(203);
			match(ID);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(204);
				match(T__12);
				setState(205);
				type();
				setState(206);
				match(ID);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2.\n\2\r\2\16\2/\3\2\5\2\63\n"+
		"\2\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\3\3\3\3\3\3"+
		"\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5i\n\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\6\3\6\7\6s\n\6\f\6\16"+
		"\6v\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\b"+
		"\5\b\u0086\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16\n"+
		"\u0093\13\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u009b\n\13\f\13\16\13\u009e"+
		"\13\13\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\f\3\f\5\f\u00a8\n\f\3\f\3\f\3\r"+
		"\3\r\6\r\u00ae\n\r\r\r\16\r\u00af\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\7\20\u00be\n\20\f\20\16\20\u00c1\13\20\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\5\22\u00c9\n\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00d3\n\23\f\23\16\23\u00d6\13\23\3\23\2\2\24\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\u00ea\2\62\3\2\2\2\4T\3\2\2\2"+
		"\6V\3\2\2\2\b`\3\2\2\2\nn\3\2\2\2\fy\3\2\2\2\16\u0081\3\2\2\2\20\u0089"+
		"\3\2\2\2\22\u008c\3\2\2\2\24\u0097\3\2\2\2\26\u009f\3\2\2\2\30\u00ad\3"+
		"\2\2\2\32\u00b1\3\2\2\2\34\u00b4\3\2\2\2\36\u00b9\3\2\2\2 \u00c4\3\2\2"+
		"\2\"\u00c6\3\2\2\2$\u00cc\3\2\2\2&.\5\26\f\2\'(\5\4\3\2()\7\3\2\2).\3"+
		"\2\2\2*.\5\n\6\2+.\5\6\4\2,.\5\b\5\2-&\3\2\2\2-\'\3\2\2\2-*\3\2\2\2-+"+
		"\3\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2\61\63"+
		"\7\2\2\3\62-\3\2\2\2\62\61\3\2\2\2\63\3\3\2\2\2\649\7\22\2\2\65\66\7\4"+
		"\2\2\668\7\22\2\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2"+
		"\2\2;9\3\2\2\2<>\7\5\2\2=?\5\24\13\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@U\7"+
		"\6\2\2AU\5\b\5\2BU\5\6\4\2CU\5\20\t\2DU\5\22\n\2EU\5\16\b\2FG\7\7\2\2"+
		"GU\5\4\3\2HM\7\22\2\2IJ\7\4\2\2JL\5\4\3\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2NU\3\2\2\2OM\3\2\2\2PU\7\22\2\2QU\7\24\2\2RU\7\26\2\2SU\7"+
		"\25\2\2T\64\3\2\2\2TA\3\2\2\2TB\3\2\2\2TC\3\2\2\2TD\3\2\2\2TE\3\2\2\2"+
		"TF\3\2\2\2TH\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2"+
		"\2VW\7\b\2\2WX\7\5\2\2XY\5\4\3\2Y^\7\6\2\2Z[\5\4\3\2[\\\7\3\2\2\\_\3\2"+
		"\2\2]_\5\n\6\2^Z\3\2\2\2^]\3\2\2\2_\7\3\2\2\2`a\7\t\2\2ab\7\5\2\2bc\5"+
		"\4\3\2ch\7\6\2\2de\5\4\3\2ef\7\3\2\2fi\3\2\2\2gi\5\n\6\2hd\3\2\2\2hg\3"+
		"\2\2\2il\3\2\2\2jm\5\f\7\2km\5\n\6\2lj\3\2\2\2lk\3\2\2\2lm\3\2\2\2m\t"+
		"\3\2\2\2nt\7\n\2\2op\5\4\3\2pq\7\3\2\2qs\3\2\2\2ro\3\2\2\2sv\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\13\2\2x\13\3\2\2\2y\177\7"+
		"\f\2\2z{\5\4\3\2{|\7\3\2\2|\u0080\3\2\2\2}\u0080\5\b\5\2~\u0080\5\n\6"+
		"\2\177z\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082"+
		"\7\r\2\2\u0082\u0083\7\22\2\2\u0083\u0085\7\5\2\2\u0084\u0086\5\24\13"+
		"\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\7\6\2\2\u0088\17\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008b\7\22\2\2\u008b"+
		"\21\3\2\2\2\u008c\u0091\7\22\2\2\u008d\u008e\7\4\2\2\u008e\u0090\7\22"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\16"+
		"\2\2\u0095\u0096\5\4\3\2\u0096\23\3\2\2\2\u0097\u009c\5\4\3\2\u0098\u0099"+
		"\7\17\2\2\u0099\u009b\5\4\3\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\7\20\2\2\u00a0\u00a3\7\22\2\2\u00a1\u00a2\7\21\2"+
		"\2\u00a2\u00a4\7\22\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\7\n\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a6\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa"+
		"\27\3\2\2\2\u00ab\u00ae\5\34\17\2\u00ac\u00ae\5\32\16\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b3\7\3\2"+
		"\2\u00b3\33\3\2\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6\7\22\2\2\u00b6\u00b7"+
		"\5\"\22\2\u00b7\u00b8\5\36\20\2\u00b8\35\3\2\2\2\u00b9\u00bf\7\n\2\2\u00ba"+
		"\u00bb\5\4\3\2\u00bb\u00bc\7\3\2\2\u00bc\u00be\3\2\2\2\u00bd\u00ba\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\13\2\2\u00c3\37\3\2\2"+
		"\2\u00c4\u00c5\7\22\2\2\u00c5!\3\2\2\2\u00c6\u00c8\7\5\2\2\u00c7\u00c9"+
		"\5$\23\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\6\2\2\u00cb#\3\2\2\2\u00cc\u00cd\5 \21\2\u00cd\u00d4\7\22\2\2"+
		"\u00ce\u00cf\7\17\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\7\22\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d4\3\2\2\2\30-/\629>MT^hlt\177"+
		"\u0085\u0091\u009c\u00a3\u00a7\u00ad\u00af\u00bf\u00c8\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}