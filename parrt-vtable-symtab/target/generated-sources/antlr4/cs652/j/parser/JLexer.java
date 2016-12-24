// Generated from cs652/j/parser/J.g4 by ANTLR 4.5.1
package cs652.j.parser;

import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symtab.*;

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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, ID=26, WS=27, STRING=28, FLOAT=29, INT=30, COMMENT=31, LINE_COMMENT=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"ID", "WS", "STRING", "FLOAT", "INT", "EXP", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'return'", "';'", "'{'", "'}'", "'class'", 
		"'extends'", "'('", "')'", "','", "'void'", "'int'", "'float'", "'.'", 
		"'printf'", "'new'", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "'this'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "WS", "STRING", "FLOAT", "INT", "COMMENT", "LINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\6\33\u00a3\n\33\r\33\16\33\u00a4\3\33\7\33\u00a8\n\33\f"+
		"\33\16\33\u00ab\13\33\3\34\6\34\u00ae\n\34\r\34\16\34\u00af\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\7\35\u00b8\n\35\f\35\16\35\u00bb\13\35\3\35\3\35"+
		"\3\36\5\36\u00c0\n\36\3\36\3\36\3\36\3\36\5\36\u00c6\n\36\3\36\5\36\u00c9"+
		"\n\36\3\36\3\36\3\36\5\36\u00ce\n\36\3\37\5\37\u00d1\n\37\3\37\6\37\u00d4"+
		"\n\37\r\37\16\37\u00d5\3 \3 \5 \u00da\n \3 \3 \3!\3!\3!\3!\7!\u00e2\n"+
		"!\f!\16!\u00e5\13!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00f0\n\"\f\"\16"+
		"\"\u00f3\13\"\3\"\3\"\3\"\3\"\3\u00e3\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2A!C\"\3\2\n\5\2C\\aac|\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\2$$\3\2\62;\4\2GGgg\4\2--//\3\2\f\f"+
		"\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5H\3\2\2\2\7"+
		"M\3\2\2\2\tS\3\2\2\2\13Z\3\2\2\2\r\\\3\2\2\2\17^\3\2\2\2\21`\3\2\2\2\23"+
		"f\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35y\3\2\2\2"+
		"\37}\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u008c\3\2\2\2\'\u0090\3\2"+
		"\2\2)\u0092\3\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\u0098\3\2\2\2\61\u009a"+
		"\3\2\2\2\63\u009c\3\2\2\2\65\u00a2\3\2\2\2\67\u00ad\3\2\2\29\u00b3\3\2"+
		"\2\2;\u00cd\3\2\2\2=\u00d0\3\2\2\2?\u00d7\3\2\2\2A\u00dd\3\2\2\2C\u00eb"+
		"\3\2\2\2EF\7k\2\2FG\7h\2\2G\4\3\2\2\2HI\7g\2\2IJ\7n\2\2JK\7u\2\2KL\7g"+
		"\2\2L\6\3\2\2\2MN\7y\2\2NO\7j\2\2OP\7k\2\2PQ\7n\2\2QR\7g\2\2R\b\3\2\2"+
		"\2ST\7t\2\2TU\7g\2\2UV\7v\2\2VW\7w\2\2WX\7t\2\2XY\7p\2\2Y\n\3\2\2\2Z["+
		"\7=\2\2[\f\3\2\2\2\\]\7}\2\2]\16\3\2\2\2^_\7\177\2\2_\20\3\2\2\2`a\7e"+
		"\2\2ab\7n\2\2bc\7c\2\2cd\7u\2\2de\7u\2\2e\22\3\2\2\2fg\7g\2\2gh\7z\2\2"+
		"hi\7v\2\2ij\7g\2\2jk\7p\2\2kl\7f\2\2lm\7u\2\2m\24\3\2\2\2no\7*\2\2o\26"+
		"\3\2\2\2pq\7+\2\2q\30\3\2\2\2rs\7.\2\2s\32\3\2\2\2tu\7x\2\2uv\7q\2\2v"+
		"w\7k\2\2wx\7f\2\2x\34\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|\36\3\2\2\2}"+
		"~\7h\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7c\2\2\u0081\u0082\7"+
		"v\2\2\u0082 \3\2\2\2\u0083\u0084\7\60\2\2\u0084\"\3\2\2\2\u0085\u0086"+
		"\7r\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7h\2\2\u008b$\3\2\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7y\2\2\u008f&\3\2\2\2\u0090\u0091\7,\2\2\u0091"+
		"(\3\2\2\2\u0092\u0093\7\61\2\2\u0093*\3\2\2\2\u0094\u0095\7\'\2\2\u0095"+
		",\3\2\2\2\u0096\u0097\7-\2\2\u0097.\3\2\2\2\u0098\u0099\7/\2\2\u0099\60"+
		"\3\2\2\2\u009a\u009b\7?\2\2\u009b\62\3\2\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7j\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0\64\3\2\2\2\u00a1"+
		"\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\t\3\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\66\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\t\4\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\b\34\2\2\u00b28\3\2\2\2\u00b3\u00b9\7$\2\2"+
		"\u00b4\u00b8\n\5\2\2\u00b5\u00b6\7^\2\2\u00b6\u00b8\7$\2\2\u00b7\u00b4"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7$"+
		"\2\2\u00bd:\3\2\2\2\u00be\u00c0\7/\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5=\37\2\u00c2\u00c3\7\60\2\2"+
		"\u00c3\u00c5\5=\37\2\u00c4\u00c6\5? \2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00ce\3\2\2\2\u00c7\u00c9\7/\2\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5=\37\2\u00cb\u00cc\5?"+
		" \2\u00cc\u00ce\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce"+
		"<\3\2\2\2\u00cf\u00d1\7/\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d4\t\6\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6>\3\2\2\2\u00d7\u00d9"+
		"\t\7\2\2\u00d8\u00da\t\b\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\5=\37\2\u00dc@\3\2\2\2\u00dd\u00de\7\61\2\2"+
		"\u00de\u00df\7,\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\13\2\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7\u00e8\7\61"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b!\3\2\u00eaB\3\2\2\2\u00eb\u00ec"+
		"\7\61\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\n\t\2\2"+
		"\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\f\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\b\"\3\2\u00f7D\3\2\2\2\21\2\u00a4\u00a9\u00af"+
		"\u00b7\u00b9\u00bf\u00c5\u00c8\u00cd\u00d0\u00d5\u00d9\u00e3\u00f1\4\b"+
		"\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}