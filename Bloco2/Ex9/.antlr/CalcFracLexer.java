// Generated from /home/rafael/Documentos/OneDrive/Documentos/Uni-Cadeiras/2-ano/2-semestre/C/Bloco2/Ex9/CalcFrac.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcFracLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Integer=10, Fraction=11, Var=12, NEWLINE=13, WS=14, COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"Integer", "Fraction", "Var", "NEWLINE", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'->'", "'+'", "'-'", "'*'", "':'", "'reduce'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Integer", 
			"Fraction", "Var", "NEWLINE", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CalcFracLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalcFrac.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13?\n\13\r\13\16\13@\3\f\3\f\3\f\3\f\3\r"+
		"\6\rH\n\r\r\r\16\rI\3\16\5\16M\n\16\3\16\3\16\3\17\6\17R\n\17\r\17\16"+
		"\17S\3\17\3\17\3\20\3\20\7\20Z\n\20\f\20\16\20]\13\20\3\20\3\20\3\20\3"+
		"\20\3[\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21\3\2\5\3\2\62;\4\2C\\c|\4\2\13\13\"\"\2f\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5\'\3\2\2\2\7*\3\2\2"+
		"\2\t,\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17\62\3\2\2\2\219\3\2\2\2\23;\3"+
		"\2\2\2\25>\3\2\2\2\27B\3\2\2\2\31G\3\2\2\2\33L\3\2\2\2\35Q\3\2\2\2\37"+
		"W\3\2\2\2!\"\7r\2\2\"#\7t\2\2#$\7k\2\2$%\7p\2\2%&\7v\2\2&\4\3\2\2\2\'"+
		"(\7/\2\2()\7@\2\2)\6\3\2\2\2*+\7-\2\2+\b\3\2\2\2,-\7/\2\2-\n\3\2\2\2."+
		"/\7,\2\2/\f\3\2\2\2\60\61\7<\2\2\61\16\3\2\2\2\62\63\7t\2\2\63\64\7g\2"+
		"\2\64\65\7f\2\2\65\66\7w\2\2\66\67\7e\2\2\678\7g\2\28\20\3\2\2\29:\7*"+
		"\2\2:\22\3\2\2\2;<\7+\2\2<\24\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>"+
		"\3\2\2\2@A\3\2\2\2A\26\3\2\2\2BC\5\25\13\2CD\7\61\2\2DE\5\25\13\2E\30"+
		"\3\2\2\2FH\t\3\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\32\3\2\2\2"+
		"KM\7\17\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\f\2\2O\34\3\2\2\2PR\t\4"+
		"\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\b\17\2\2V\36"+
		"\3\2\2\2W[\7%\2\2XZ\13\2\2\2YX\3\2\2\2Z]\3\2\2\2[\\\3\2\2\2[Y\3\2\2\2"+
		"\\^\3\2\2\2][\3\2\2\2^_\7\f\2\2_`\3\2\2\2`a\b\20\2\2a \3\2\2\2\b\2@IL"+
		"S[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}