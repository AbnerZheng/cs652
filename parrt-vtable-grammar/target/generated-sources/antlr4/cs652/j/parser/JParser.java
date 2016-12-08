// Generated from cs652/j/parser/J.g4 by ANTLR 4.5.1
package cs652.j.parser;
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
		public TerminalNode EOF() { return getToken(JParser.EOF, 0); }
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
			setState(50);
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
				setState(47);
				match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
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
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(ID);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(53);
					match(T__1);
					setState(54);
					match(ID);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(T__2);
				setState(62);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0)) {
					{
					setState(61);
					callParameters();
					}
				}

				setState(64);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				newDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				match(T__4);
				setState(71);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				match(ID);
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						match(T__1);
						setState(74);
						expression();
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(80);
				match(ID);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(81);
				match(STRING);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(82);
				match(INT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(83);
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
			setState(86);
			match(T__5);
			setState(87);
			match(T__2);
			setState(88);
			expression();
			setState(89);
			match(T__3);
			setState(94);
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
				setState(90);
				expression();
				setState(91);
				match(T__0);
				}
				break;
			case T__7:
				{
				setState(93);
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
			setState(96);
			match(T__6);
			setState(97);
			match(T__2);
			setState(98);
			expression();
			setState(99);
			match(T__3);
			setState(104);
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
				setState(100);
				expression();
				setState(101);
				match(T__0);
				}
				break;
			case T__7:
				{
				setState(103);
				blockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(106);
				elseStatement();
				}
				break;
			case 2:
				{
				setState(107);
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
			setState(110);
			match(T__7);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(111);
				expression();
				setState(112);
				match(T__0);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
			setState(121);
			match(T__9);
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(122);
				expression();
				setState(123);
				match(T__0);
				}
				break;
			case 2:
				{
				setState(125);
				ifStatement();
				}
				break;
			case 3:
				{
				setState(126);
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
			setState(129);
			match(T__10);
			setState(130);
			match(ID);
			setState(131);
			match(T__2);
			setState(133);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				setState(132);
				callParameters();
				}
			}

			setState(135);
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
			setState(137);
			type();
			setState(138);
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
			setState(140);
			match(ID);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(141);
				match(T__1);
				setState(142);
				match(ID);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(T__11);
			setState(149);
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
			setState(151);
			expression();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(152);
				match(T__12);
				setState(153);
				expression();
				}
				}
				setState(158);
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
			setState(159);
			match(T__13);
			setState(160);
			match(ID);
			setState(163);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(161);
				match(T__14);
				setState(162);
				match(ID);
				}
			}

			setState(165);
			match(T__7);
			setState(167);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(166);
				classBody();
				}
			}

			setState(169);
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
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(173);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(171);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(172);
					fields();
					}
					break;
				}
				}
				setState(175); 
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
			setState(177);
			variableDeclaration();
			setState(178);
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
			setState(180);
			type();
			setState(181);
			match(ID);
			setState(182);
			formalParameters();
			setState(183);
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
			setState(185);
			match(T__7);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << ID) | (1L << STRING) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(186);
				expression();
				setState(187);
				match(T__0);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
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
			setState(196);
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
			setState(198);
			match(T__2);
			setState(200);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(199);
				parameters();
				}
			}

			setState(202);
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
			setState(204);
			type();
			setState(205);
			match(ID);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(206);
				match(T__12);
				setState(207);
				type();
				setState(208);
				match(ID);
				}
				}
				setState(214);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00da\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2.\n\2\r\2\16\2/\3\2\3\2\3\2"+
		"\5\2\65\n\2\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\5\3A\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3\3\3\3\3"+
		"\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\5\3\5\5\5o\n\5\3\6\3\6\3\6\3\6\7\6u\n"+
		"\6\f\6\16\6x\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3"+
		"\b\3\b\3\b\5\b\u0088\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0092\n\n"+
		"\f\n\16\n\u0095\13\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u009d\n\13\f\13\16"+
		"\13\u00a0\13\13\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\f\3\f\5\f\u00aa\n\f\3"+
		"\f\3\f\3\r\3\r\6\r\u00b0\n\r\r\r\16\r\u00b1\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00c0\n\20\f\20\16\20\u00c3\13"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u00cb\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00d5\n\23\f\23\16\23\u00d8\13\23\3\23\2\2\24"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\u00ec\2\64\3\2\2\2\4V"+
		"\3\2\2\2\6X\3\2\2\2\bb\3\2\2\2\np\3\2\2\2\f{\3\2\2\2\16\u0083\3\2\2\2"+
		"\20\u008b\3\2\2\2\22\u008e\3\2\2\2\24\u0099\3\2\2\2\26\u00a1\3\2\2\2\30"+
		"\u00af\3\2\2\2\32\u00b3\3\2\2\2\34\u00b6\3\2\2\2\36\u00bb\3\2\2\2 \u00c6"+
		"\3\2\2\2\"\u00c8\3\2\2\2$\u00ce\3\2\2\2&.\5\26\f\2\'(\5\4\3\2()\7\3\2"+
		"\2).\3\2\2\2*.\5\n\6\2+.\5\6\4\2,.\5\b\5\2-&\3\2\2\2-\'\3\2\2\2-*\3\2"+
		"\2\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2"+
		"\61\62\7\2\2\3\62\65\3\2\2\2\63\65\7\2\2\3\64-\3\2\2\2\64\63\3\2\2\2\65"+
		"\3\3\2\2\2\66;\7\22\2\2\678\7\4\2\28:\7\22\2\29\67\3\2\2\2:=\3\2\2\2;"+
		"9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>@\7\5\2\2?A\5\24\13\2@?\3\2\2"+
		"\2@A\3\2\2\2AB\3\2\2\2BW\7\6\2\2CW\5\b\5\2DW\5\6\4\2EW\5\20\t\2FW\5\22"+
		"\n\2GW\5\16\b\2HI\7\7\2\2IW\5\4\3\2JO\7\22\2\2KL\7\4\2\2LN\5\4\3\2MK\3"+
		"\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PW\3\2\2\2QO\3\2\2\2RW\7\22\2\2SW"+
		"\7\24\2\2TW\7\26\2\2UW\7\25\2\2V\66\3\2\2\2VC\3\2\2\2VD\3\2\2\2VE\3\2"+
		"\2\2VF\3\2\2\2VG\3\2\2\2VH\3\2\2\2VJ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2"+
		"\2\2VU\3\2\2\2W\5\3\2\2\2XY\7\b\2\2YZ\7\5\2\2Z[\5\4\3\2[`\7\6\2\2\\]\5"+
		"\4\3\2]^\7\3\2\2^a\3\2\2\2_a\5\n\6\2`\\\3\2\2\2`_\3\2\2\2a\7\3\2\2\2b"+
		"c\7\t\2\2cd\7\5\2\2de\5\4\3\2ej\7\6\2\2fg\5\4\3\2gh\7\3\2\2hk\3\2\2\2"+
		"ik\5\n\6\2jf\3\2\2\2ji\3\2\2\2kn\3\2\2\2lo\5\f\7\2mo\5\n\6\2nl\3\2\2\2"+
		"nm\3\2\2\2no\3\2\2\2o\t\3\2\2\2pv\7\n\2\2qr\5\4\3\2rs\7\3\2\2su\3\2\2"+
		"\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\13"+
		"\2\2z\13\3\2\2\2{\u0081\7\f\2\2|}\5\4\3\2}~\7\3\2\2~\u0082\3\2\2\2\177"+
		"\u0082\5\b\5\2\u0080\u0082\5\n\6\2\u0081|\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\r\3\2\2\2\u0083\u0084\7\r\2\2\u0084\u0085\7\22\2"+
		"\2\u0085\u0087\7\5\2\2\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\6\2\2\u008a\17\3\2\2"+
		"\2\u008b\u008c\5 \21\2\u008c\u008d\7\22\2\2\u008d\21\3\2\2\2\u008e\u0093"+
		"\7\22\2\2\u008f\u0090\7\4\2\2\u0090\u0092\7\22\2\2\u0091\u008f\3\2\2\2"+
		"\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\16\2\2\u0097\u0098\5\4\3\2"+
		"\u0098\23\3\2\2\2\u0099\u009e\5\4\3\2\u009a\u009b\7\17\2\2\u009b\u009d"+
		"\5\4\3\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\25\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\20\2"+
		"\2\u00a2\u00a5\7\22\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a6\7\22\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\n"+
		"\2\2\u00a8\u00aa\5\30\r\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\13\2\2\u00ac\27\3\2\2\2\u00ad\u00b0\5\34"+
		"\17\2\u00ae\u00b0\5\32\16\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\31\3\2\2"+
		"\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7\3\2\2\u00b5\33\3\2\2\2\u00b6\u00b7"+
		"\5 \21\2\u00b7\u00b8\7\22\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\5\36\20"+
		"\2\u00ba\35\3\2\2\2\u00bb\u00c1\7\n\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be"+
		"\7\3\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c5\7\13\2\2\u00c5\37\3\2\2\2\u00c6\u00c7\7\22\2\2\u00c7"+
		"!\3\2\2\2\u00c8\u00ca\7\5\2\2\u00c9\u00cb\5$\23\2\u00ca\u00c9\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\6\2\2\u00cd#\3"+
		"\2\2\2\u00ce\u00cf\5 \21\2\u00cf\u00d6\7\22\2\2\u00d0\u00d1\7\17\2\2\u00d1"+
		"\u00d2\5 \21\2\u00d2\u00d3\7\22\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3"+
		"\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"%\3\2\2\2\u00d8\u00d6\3\2\2\2\30-/\64;@OV`jnv\u0081\u0087\u0093\u009e"+
		"\u00a5\u00a9\u00af\u00b1\u00c1\u00ca\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}