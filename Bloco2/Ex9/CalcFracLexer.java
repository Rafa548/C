// Generated from CalcFrac.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalcFracLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u000f`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\t=\b\t\u000b\t\f\t>\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000bF\b\u000b\u000b\u000b"+
		"\f\u000bG\u0001\f\u0003\fK\b\f\u0001\f\u0001\f\u0001\r\u0004\rP\b\r\u000b"+
		"\r\f\rQ\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000eX\b\u000e\n"+
		"\u000e\f\u000e[\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001Y\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0003\u0001\u000009\u0002"+
		"\u0000AZaz\u0002\u0000\t\t  d\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001"+
		"\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005(\u0001\u0000\u0000"+
		"\u0000\u0007*\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000\u000b"+
		".\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000\u0000\u000f7\u0001\u0000"+
		"\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000\u0000"+
		"\u0015@\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019J"+
		"\u0001\u0000\u0000\u0000\u001bO\u0001\u0000\u0000\u0000\u001dU\u0001\u0000"+
		"\u0000\u0000\u001f \u0005p\u0000\u0000 !\u0005r\u0000\u0000!\"\u0005i"+
		"\u0000\u0000\"#\u0005n\u0000\u0000#$\u0005t\u0000\u0000$\u0002\u0001\u0000"+
		"\u0000\u0000%&\u0005-\u0000\u0000&\'\u0005>\u0000\u0000\'\u0004\u0001"+
		"\u0000\u0000\u0000()\u0005+\u0000\u0000)\u0006\u0001\u0000\u0000\u0000"+
		"*+\u0005-\u0000\u0000+\b\u0001\u0000\u0000\u0000,-\u0005*\u0000\u0000"+
		"-\n\u0001\u0000\u0000\u0000./\u0005:\u0000\u0000/\f\u0001\u0000\u0000"+
		"\u000001\u0005r\u0000\u000012\u0005e\u0000\u000023\u0005d\u0000\u0000"+
		"34\u0005u\u0000\u000045\u0005c\u0000\u000056\u0005e\u0000\u00006\u000e"+
		"\u0001\u0000\u0000\u000078\u0005(\u0000\u00008\u0010\u0001\u0000\u0000"+
		"\u00009:\u0005)\u0000\u0000:\u0012\u0001\u0000\u0000\u0000;=\u0007\u0000"+
		"\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0014\u0001\u0000\u0000"+
		"\u0000@A\u0003\u0013\t\u0000AB\u0005/\u0000\u0000BC\u0003\u0013\t\u0000"+
		"C\u0016\u0001\u0000\u0000\u0000DF\u0007\u0001\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000H\u0018\u0001\u0000\u0000\u0000IK\u0005\r\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0005\n\u0000\u0000M\u001a\u0001\u0000\u0000\u0000NP\u0007\u0002"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"ST\u0006\r\u0000\u0000T\u001c\u0001\u0000\u0000\u0000UY\u0005#\u0000\u0000"+
		"VX\t\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\n\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^_\u0006\u000e\u0000\u0000_\u001e\u0001\u0000\u0000\u0000"+
		"\u0006\u0000>GJQY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}