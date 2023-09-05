// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MetaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, EPS=6, USING=7, INATTR=8, OUTATTR=9, 
		GRAMMAR=10, SKIPE=11, ARROW=12, SEMI=13, REGEX=14, UPPER=15, LOWER=16, 
		OF=17, OR=18, IS=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "EPS", "USING", "INATTR", "OUTATTR", 
			"GRAMMAR", "SKIPE", "ARROW", "SEMI", "REGEX", "UPPER", "LOWER", "OF", 
			"OR", "IS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'['", "']'", "','", "'EPS'", "'using'", null, null, 
			"'grammar'", "'skip'", "'->'", "';'", null, null, null, "':'", "'|'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "EPS", "USING", "INATTR", "OUTATTR", 
			"GRAMMAR", "SKIPE", "ARROW", "SEMI", "REGEX", "UPPER", "LOWER", "OF", 
			"OR", "IS", "WS"
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


	public MetaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Meta.g4"; }

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
		"\u0004\u0000\u0014\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0004\u0007@\b\u0007\u000b\u0007\f\u0007A\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0004\bH\b\b\u000b\b\f\bI\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rb\b\r\n\r\f\re\t\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000ek\b\u000e\n\u000e\f\u000en\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000fr\b\u000f\n\u000f\f\u000fu\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0004\u0013~\b\u0013\u000b\u0013\f\u0013\u007f\u0001\u0013"+
		"\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014\u0001\u0000\u0007\u0001\u0000))\u0001\u0000}}\u0001\u0000\"\""+
		"\u0001\u0000AZ\u0004\u0000..AZ__az\u0001\u0000az\u0003\u0000\t\n\r\r "+
		" \u0088\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000"+
		"\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000"+
		"\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001"+
		"\u0000\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000"+
		"\u0000\u0011E\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000\u0015"+
		"U\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019]\u0001"+
		"\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000\u001dh\u0001\u0000\u0000"+
		"\u0000\u001fo\u0001\u0000\u0000\u0000!v\u0001\u0000\u0000\u0000#x\u0001"+
		"\u0000\u0000\u0000%z\u0001\u0000\u0000\u0000\'}\u0001\u0000\u0000\u0000"+
		")*\u0005<\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005>\u0000\u0000"+
		",\u0004\u0001\u0000\u0000\u0000-.\u0005[\u0000\u0000.\u0006\u0001\u0000"+
		"\u0000\u0000/0\u0005]\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005,"+
		"\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005E\u0000\u000045\u0005P"+
		"\u0000\u000056\u0005S\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005u"+
		"\u0000\u000089\u0005s\u0000\u00009:\u0005i\u0000\u0000:;\u0005n\u0000"+
		"\u0000;<\u0005g\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=?\u0005(\u0000"+
		"\u0000>@\b\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0005)\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EG\u0005"+
		"{\u0000\u0000FH\b\u0001\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0005}\u0000\u0000L\u0012\u0001\u0000\u0000"+
		"\u0000MN\u0005g\u0000\u0000NO\u0005r\u0000\u0000OP\u0005a\u0000\u0000"+
		"PQ\u0005m\u0000\u0000QR\u0005m\u0000\u0000RS\u0005a\u0000\u0000ST\u0005"+
		"r\u0000\u0000T\u0014\u0001\u0000\u0000\u0000UV\u0005s\u0000\u0000VW\u0005"+
		"k\u0000\u0000WX\u0005i\u0000\u0000XY\u0005p\u0000\u0000Y\u0016\u0001\u0000"+
		"\u0000\u0000Z[\u0005-\u0000\u0000[\\\u0005>\u0000\u0000\\\u0018\u0001"+
		"\u0000\u0000\u0000]^\u0005;\u0000\u0000^\u001a\u0001\u0000\u0000\u0000"+
		"_c\u0005\"\u0000\u0000`b\b\u0002\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\"\u0000"+
		"\u0000g\u001c\u0001\u0000\u0000\u0000hl\u0007\u0003\u0000\u0000ik\u0007"+
		"\u0004\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u001e\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000os\u0007\u0005\u0000\u0000pr\u0007"+
		"\u0004\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t \u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vw\u0005:\u0000\u0000w\"\u0001\u0000\u0000"+
		"\u0000xy\u0005|\u0000\u0000y$\u0001\u0000\u0000\u0000z{\u0005=\u0000\u0000"+
		"{&\u0001\u0000\u0000\u0000|~\u0007\u0006\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0006\u0013\u0000\u0000\u0082(\u0001\u0000\u0000\u0000\u0007\u0000"+
		"AIcls\u007f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}