// Generated from cs652/j/parser/J.g4 by ANTLR 4.5.1
package cs652.j.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, WS=17, 
		STRING=18, FLOAT=19, INT=20, COMMENT=21, LINE_COMMENT=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "WS", "STRING", 
		"FLOAT", "INT", "EXP", "COMMENT", "LINE_COMMENT"
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


	public JLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "J.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21j\n\21\r\21\16\21k\3\21\7\21o\n"+
		"\21\f\21\16\21r\13\21\3\22\6\22u\n\22\r\22\16\22v\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\7\23\177\n\23\f\23\16\23\u0082\13\23\3\23\3\23\3\24\5\24\u0087"+
		"\n\24\3\24\3\24\3\24\3\24\5\24\u008d\n\24\3\24\5\24\u0090\n\24\3\24\3"+
		"\24\3\24\5\24\u0095\n\24\3\25\5\25\u0098\n\25\3\25\6\25\u009b\n\25\r\25"+
		"\16\25\u009c\3\26\3\26\5\26\u00a1\n\26\3\26\3\26\3\27\3\27\3\27\3\27\7"+
		"\27\u00a9\n\27\f\27\16\27\u00ac\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\7\30\u00b7\n\30\f\30\16\30\u00ba\13\30\3\30\3\30\3\30\3"+
		"\30\3\u00aa\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\27/\30\3\2\n\5\2C\\aac"+
		"|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\2$$\3\2\62;\4\2GGgg\4\2--//\3\2"+
		"\f\f\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r@\3"+
		"\2\2\2\17F\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27R\3\2\2\2\31"+
		"V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37`\3\2\2\2!i\3\2\2\2#t\3\2\2\2%z\3"+
		"\2\2\2\'\u0094\3\2\2\2)\u0097\3\2\2\2+\u009e\3\2\2\2-\u00a4\3\2\2\2/\u00b2"+
		"\3\2\2\2\61\62\7=\2\2\62\4\3\2\2\2\63\64\7\60\2\2\64\6\3\2\2\2\65\66\7"+
		"*\2\2\66\b\3\2\2\2\678\7+\2\28\n\3\2\2\29:\7t\2\2:;\7g\2\2;<\7v\2\2<="+
		"\7w\2\2=>\7t\2\2>?\7p\2\2?\f\3\2\2\2@A\7y\2\2AB\7j\2\2BC\7k\2\2CD\7n\2"+
		"\2DE\7g\2\2E\16\3\2\2\2FG\7k\2\2GH\7h\2\2H\20\3\2\2\2IJ\7}\2\2J\22\3\2"+
		"\2\2KL\7\177\2\2L\24\3\2\2\2MN\7g\2\2NO\7n\2\2OP\7u\2\2PQ\7g\2\2Q\26\3"+
		"\2\2\2RS\7p\2\2ST\7g\2\2TU\7y\2\2U\30\3\2\2\2VW\7?\2\2W\32\3\2\2\2XY\7"+
		".\2\2Y\34\3\2\2\2Z[\7e\2\2[\\\7n\2\2\\]\7c\2\2]^\7u\2\2^_\7u\2\2_\36\3"+
		"\2\2\2`a\7g\2\2ab\7z\2\2bc\7v\2\2cd\7g\2\2de\7p\2\2ef\7f\2\2fg\7u\2\2"+
		"g \3\2\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lp\3\2\2\2"+
		"mo\t\3\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\"\3\2\2\2rp\3\2\2"+
		"\2su\t\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\22"+
		"\2\2y$\3\2\2\2z\u0080\7$\2\2{\177\n\5\2\2|}\7^\2\2}\177\7$\2\2~{\3\2\2"+
		"\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7$\2\2\u0084&\3\2\2\2\u0085"+
		"\u0087\7/\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\5)\25\2\u0089\u008a\7\60\2\2\u008a\u008c\5)\25\2\u008b"+
		"\u008d\5+\26\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0095\3\2"+
		"\2\2\u008e\u0090\7/\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\5)\25\2\u0092\u0093\5+\26\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0086\3\2\2\2\u0094\u008f\3\2\2\2\u0095(\3\2\2\2\u0096\u0098"+
		"\7/\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u009b\t\6\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d*\3\2\2\2\u009e\u00a0\t\7\2\2\u009f\u00a1"+
		"\t\b\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\5)\25\2\u00a3,\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7,\2\2"+
		"\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\b\27\3\2\u00b1.\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4"+
		"\7\61\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\n\t\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\b\30\3\2\u00be\60\3\2\2\2\21\2kpv~\u0080\u0086\u008c\u008f\u0094"+
		"\u0097\u009c\u00a0\u00aa\u00b8\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}