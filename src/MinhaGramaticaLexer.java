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
public class MinhaGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PalavraChave=1, Tipo=2, OpArit=3, OpRel=4, AChave=5, FChave=6, AParenteses=7, 
		FParenteses=8, AComentario=9, FComentario=10, Id=11, ConstINT=12, ConstREAL=13, 
		ConstSTRING=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PalavraChave", "Tipo", "OpArit", "OpRel", "AChave", "FChave", "AParenteses", 
			"FParenteses", "AComentario", "FComentario", "Id", "ConstINT", "ConstREAL", 
			"ConstSTRING", "WS", "LETRA", "ALFANUM", "DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'{'", "'}'", "'('", "')'", "'/*'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PalavraChave", "Tipo", "OpArit", "OpRel", "AChave", "FChave", 
			"AParenteses", "FParenteses", "AComentario", "FComentario", "Id", "ConstINT", 
			"ConstREAL", "ConstSTRING", "WS"
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


	public MinhaGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

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
		"\u0004\u0000\u000f\u00a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000E\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Z\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002`\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0005\n}\b\n\n\n\f\n\u0080\t\n\u0001\u000b\u0004\u000b\u0083\b\u000b"+
		"\u000b\u000b\f\u000b\u0084\u0001\f\u0004\f\u0088\b\f\u000b\f\f\f\u0089"+
		"\u0001\f\u0001\f\u0004\f\u008e\b\f\u000b\f\f\f\u008f\u0001\r\u0001\r\u0004"+
		"\r\u0094\b\r\u000b\r\f\r\u0095\u0001\r\u0001\r\u0001\u000e\u0005\u000e"+
		"\u009b\b\u000e\n\u000e\f\u000e\u009e\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0000"+
		"\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0000!\u0000#\u0000\u0001\u0000\u0006\u0004\u0000"+
		"%%*+--//\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0001\u000009\u00ba\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001D\u0001\u0000\u0000"+
		"\u0000\u0003Y\u0001\u0000\u0000\u0000\u0005_\u0001\u0000\u0000\u0000\u0007"+
		"j\u0001\u0000\u0000\u0000\tl\u0001\u0000\u0000\u0000\u000bn\u0001\u0000"+
		"\u0000\u0000\rp\u0001\u0000\u0000\u0000\u000fr\u0001\u0000\u0000\u0000"+
		"\u0011t\u0001\u0000\u0000\u0000\u0013w\u0001\u0000\u0000\u0000\u0015z"+
		"\u0001\u0000\u0000\u0000\u0017\u0082\u0001\u0000\u0000\u0000\u0019\u0087"+
		"\u0001\u0000\u0000\u0000\u001b\u0091\u0001\u0000\u0000\u0000\u001d\u009c"+
		"\u0001\u0000\u0000\u0000\u001f\u00a1\u0001\u0000\u0000\u0000!\u00a3\u0001"+
		"\u0000\u0000\u0000#\u00a5\u0001\u0000\u0000\u0000%&\u0005i\u0000\u0000"+
		"&E\u0005f\u0000\u0000\'(\u0005e\u0000\u0000()\u0005l\u0000\u0000)*\u0005"+
		"s\u0000\u0000*E\u0005e\u0000\u0000+,\u0005w\u0000\u0000,-\u0005h\u0000"+
		"\u0000-.\u0005i\u0000\u0000./\u0005l\u0000\u0000/E\u0005e\u0000\u0000"+
		"01\u0005f\u0000\u000012\u0005u\u0000\u000023\u0005n\u0000\u00003E\u0005"+
		"c\u0000\u000045\u0005p\u0000\u000056\u0005r\u0000\u000067\u0005o\u0000"+
		"\u00007E\u0005c\u0000\u000089\u0005r\u0000\u00009:\u0005e\u0000\u0000"+
		":;\u0005t\u0000\u0000;<\u0005u\u0000\u0000<=\u0005r\u0000\u0000=E\u0005"+
		"n\u0000\u0000>?\u0005I\u0000\u0000?E\u0005N\u0000\u0000@A\u0005O\u0000"+
		"\u0000AB\u0005U\u0000\u0000BE\u0005T\u0000\u0000CE\u0005;\u0000\u0000"+
		"D%\u0001\u0000\u0000\u0000D\'\u0001\u0000\u0000\u0000D+\u0001\u0000\u0000"+
		"\u0000D0\u0001\u0000\u0000\u0000D4\u0001\u0000\u0000\u0000D8\u0001\u0000"+
		"\u0000\u0000D>\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000E\u0002\u0001\u0000\u0000\u0000FG\u0005i\u0000\u0000"+
		"GH\u0005n\u0000\u0000HZ\u0005t\u0000\u0000IJ\u0005d\u0000\u0000JK\u0005"+
		"o\u0000\u0000KL\u0005u\u0000\u0000LM\u0005b\u0000\u0000MN\u0005l\u0000"+
		"\u0000NZ\u0005e\u0000\u0000OP\u0005b\u0000\u0000PQ\u0005o\u0000\u0000"+
		"QR\u0005o\u0000\u0000RZ\u0005l\u0000\u0000ST\u0005s\u0000\u0000TU\u0005"+
		"t\u0000\u0000UV\u0005r\u0000\u0000VW\u0005i\u0000\u0000WX\u0005n\u0000"+
		"\u0000XZ\u0005g\u0000\u0000YF\u0001\u0000\u0000\u0000YI\u0001\u0000\u0000"+
		"\u0000YO\u0001\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000Z\u0004\u0001"+
		"\u0000\u0000\u0000[`\u0007\u0000\u0000\u0000\\]\u0005*\u0000\u0000]`\u0005"+
		"*\u0000\u0000^`\u0005=\u0000\u0000_[\u0001\u0000\u0000\u0000_\\\u0001"+
		"\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`\u0006\u0001\u0000\u0000"+
		"\u0000ak\u0007\u0001\u0000\u0000bc\u0005>\u0000\u0000ck\u0005=\u0000\u0000"+
		"de\u0005<\u0000\u0000ek\u0005=\u0000\u0000fg\u0005=\u0000\u0000gk\u0005"+
		"=\u0000\u0000hi\u0005!\u0000\u0000ik\u0005=\u0000\u0000ja\u0001\u0000"+
		"\u0000\u0000jb\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000jf\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000k\b\u0001\u0000\u0000\u0000"+
		"lm\u0005{\u0000\u0000m\n\u0001\u0000\u0000\u0000no\u0005}\u0000\u0000"+
		"o\f\u0001\u0000\u0000\u0000pq\u0005(\u0000\u0000q\u000e\u0001\u0000\u0000"+
		"\u0000rs\u0005)\u0000\u0000s\u0010\u0001\u0000\u0000\u0000tu\u0005/\u0000"+
		"\u0000uv\u0005*\u0000\u0000v\u0012\u0001\u0000\u0000\u0000wx\u0005*\u0000"+
		"\u0000xy\u0005/\u0000\u0000y\u0014\u0001\u0000\u0000\u0000z~\u0003\u001f"+
		"\u000f\u0000{}\u0003!\u0010\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0016\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0003#\u0011\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0018\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0003#\u0011\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0005.\u0000\u0000\u008c\u008e\u0003#\u0011\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u001a\u0001\u0000"+
		"\u0000\u0000\u0091\u0093\u0005\"\u0000\u0000\u0092\u0094\u0003!\u0010"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005\"\u0000\u0000"+
		"\u0098\u001c\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0002\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0006\u000e\u0000\u0000\u00a0\u001e\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0007\u0003\u0000\u0000\u00a2 \u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0007\u0004\u0000\u0000\u00a4\"\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0007\u0005\u0000\u0000\u00a6$\u0001\u0000\u0000\u0000\u000b\u0000DY"+
		"_j~\u0084\u0089\u008f\u0095\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}