package br.ufla;// Generated from java-escape by ANTLR 4.11.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, PalavraChave=5, Tipo=6, OpArit=7, OpRel=8, 
		AChave=9, FChave=10, AParenteses=11, FParenteses=12, AComentario=13, FComentario=14, 
		WS=15, ID=16, ConstINT=17, ConstREAL=18, ConstSTRING=19, ErrorChar=20, 
		LAMBDA=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "LETRA", "ALFANUM", "DIGITO", "PalavraChave", 
			"Tipo", "OpArit", "OpRel", "AChave", "FChave", "AParenteses", "FParenteses", 
			"AComentario", "FComentario", "WS", "ID", "ConstINT", "ConstREAL", "ConstSTRING", 
			"ErrorChar", "LAMBDA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'else'", "'while'", null, null, null, null, "'{'", 
			"'}'", "'('", "')'", "'/*'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PalavraChave", "Tipo", "OpArit", "OpRel", 
			"AChave", "FChave", "AParenteses", "FParenteses", "AComentario", "FComentario", 
			"WS", "ID", "ConstINT", "ConstREAL", "ConstSTRING", "ErrorChar", "LAMBDA"
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
		"\u0004\u0000\u0015\u00c7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"g\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b|\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0082\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u008d\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0005\u0011\u009e\b\u0011"+
		"\n\u0011\f\u0011\u00a1\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00a7\b\u0012\n\u0012\f\u0012\u00aa\t\u0012\u0001\u0013"+
		"\u0004\u0013\u00ad\b\u0013\u000b\u0013\f\u0013\u00ae\u0001\u0014\u0004"+
		"\u0014\u00b2\b\u0014\u000b\u0014\f\u0014\u00b3\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u00b8\b\u0014\u000b\u0014\f\u0014\u00b9\u0001\u0015\u0001"+
		"\u0015\u0004\u0015\u00be\b\u0015\u000b\u0015\f\u0015\u00bf\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0000\u0000"+
		"\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0000"+
		"\r\u0000\u000f\u0005\u0011\u0006\u0013\u0007\u0015\b\u0017\t\u0019\n\u001b"+
		"\u000b\u001d\f\u001f\r!\u000e#\u000f%\u0010\'\u0011)\u0012+\u0013-\u0014"+
		"/\u0015\u0001\u0000\u0006\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u0000"+
		"09\u0004\u0000%%*+--//\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u00da\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011"+
		"\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00056\u0001\u0000"+
		"\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000"+
		"\u000bC\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000ff\u0001"+
		"\u0000\u0000\u0000\u0011{\u0001\u0000\u0000\u0000\u0013\u0081\u0001\u0000"+
		"\u0000\u0000\u0015\u008c\u0001\u0000\u0000\u0000\u0017\u008e\u0001\u0000"+
		"\u0000\u0000\u0019\u0090\u0001\u0000\u0000\u0000\u001b\u0092\u0001\u0000"+
		"\u0000\u0000\u001d\u0094\u0001\u0000\u0000\u0000\u001f\u0096\u0001\u0000"+
		"\u0000\u0000!\u0099\u0001\u0000\u0000\u0000#\u009f\u0001\u0000\u0000\u0000"+
		"%\u00a4\u0001\u0000\u0000\u0000\'\u00ac\u0001\u0000\u0000\u0000)\u00b1"+
		"\u0001\u0000\u0000\u0000+\u00bb\u0001\u0000\u0000\u0000-\u00c3\u0001\u0000"+
		"\u0000\u0000/\u00c5\u0001\u0000\u0000\u000012\u0005;\u0000\u00002\u0002"+
		"\u0001\u0000\u0000\u000034\u0005i\u0000\u000045\u0005f\u0000\u00005\u0004"+
		"\u0001\u0000\u0000\u000067\u0005e\u0000\u000078\u0005l\u0000\u000089\u0005"+
		"s\u0000\u00009:\u0005e\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005"+
		"w\u0000\u0000<=\u0005h\u0000\u0000=>\u0005i\u0000\u0000>?\u0005l\u0000"+
		"\u0000?@\u0005e\u0000\u0000@\b\u0001\u0000\u0000\u0000AB\u0007\u0000\u0000"+
		"\u0000B\n\u0001\u0000\u0000\u0000CD\u0007\u0001\u0000\u0000D\f\u0001\u0000"+
		"\u0000\u0000EF\u0007\u0002\u0000\u0000F\u000e\u0001\u0000\u0000\u0000"+
		"GH\u0005i\u0000\u0000Hg\u0005f\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005"+
		"l\u0000\u0000KL\u0005s\u0000\u0000Lg\u0005e\u0000\u0000MN\u0005w\u0000"+
		"\u0000NO\u0005h\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005l\u0000\u0000"+
		"Qg\u0005e\u0000\u0000RS\u0005f\u0000\u0000ST\u0005u\u0000\u0000TU\u0005"+
		"n\u0000\u0000Ug\u0005c\u0000\u0000VW\u0005p\u0000\u0000WX\u0005r\u0000"+
		"\u0000XY\u0005o\u0000\u0000Yg\u0005c\u0000\u0000Z[\u0005r\u0000\u0000"+
		"[\\\u0005e\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005u\u0000\u0000^_\u0005"+
		"r\u0000\u0000_g\u0005n\u0000\u0000`a\u0005I\u0000\u0000ag\u0005N\u0000"+
		"\u0000bc\u0005O\u0000\u0000cd\u0005U\u0000\u0000dg\u0005T\u0000\u0000"+
		"eg\u0005;\u0000\u0000fG\u0001\u0000\u0000\u0000fI\u0001\u0000\u0000\u0000"+
		"fM\u0001\u0000\u0000\u0000fR\u0001\u0000\u0000\u0000fV\u0001\u0000\u0000"+
		"\u0000fZ\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fb\u0001\u0000"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0010\u0001\u0000\u0000\u0000"+
		"hi\u0005i\u0000\u0000ij\u0005n\u0000\u0000j|\u0005t\u0000\u0000kl\u0005"+
		"d\u0000\u0000lm\u0005o\u0000\u0000mn\u0005u\u0000\u0000no\u0005b\u0000"+
		"\u0000op\u0005l\u0000\u0000p|\u0005e\u0000\u0000qr\u0005b\u0000\u0000"+
		"rs\u0005o\u0000\u0000st\u0005o\u0000\u0000t|\u0005l\u0000\u0000uv\u0005"+
		"s\u0000\u0000vw\u0005t\u0000\u0000wx\u0005r\u0000\u0000xy\u0005i\u0000"+
		"\u0000yz\u0005n\u0000\u0000z|\u0005g\u0000\u0000{h\u0001\u0000\u0000\u0000"+
		"{k\u0001\u0000\u0000\u0000{q\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000"+
		"\u0000|\u0012\u0001\u0000\u0000\u0000}\u0082\u0007\u0003\u0000\u0000~"+
		"\u007f\u0005*\u0000\u0000\u007f\u0082\u0005*\u0000\u0000\u0080\u0082\u0005"+
		"=\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0014\u0001\u0000\u0000"+
		"\u0000\u0083\u008d\u0007\u0004\u0000\u0000\u0084\u0085\u0005>\u0000\u0000"+
		"\u0085\u008d\u0005=\u0000\u0000\u0086\u0087\u0005<\u0000\u0000\u0087\u008d"+
		"\u0005=\u0000\u0000\u0088\u0089\u0005=\u0000\u0000\u0089\u008d\u0005="+
		"\u0000\u0000\u008a\u008b\u0005!\u0000\u0000\u008b\u008d\u0005=\u0000\u0000"+
		"\u008c\u0083\u0001\u0000\u0000\u0000\u008c\u0084\u0001\u0000\u0000\u0000"+
		"\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0016\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005{\u0000\u0000\u008f\u0018\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005}\u0000\u0000\u0091\u001a\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005(\u0000\u0000\u0093\u001c\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		")\u0000\u0000\u0095\u001e\u0001\u0000\u0000\u0000\u0096\u0097\u0005/\u0000"+
		"\u0000\u0097\u0098\u0005*\u0000\u0000\u0098 \u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005*\u0000\u0000\u009a\u009b\u0005/\u0000\u0000\u009b\"\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0007\u0005\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006"+
		"\u0011\u0000\u0000\u00a3$\u0001\u0000\u0000\u0000\u00a4\u00a8\u0003\t"+
		"\u0004\u0000\u00a5\u00a7\u0003\u000b\u0005\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9&\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\r\u0006\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af(\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\r\u0006\u0000\u00b1"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005.\u0000\u0000\u00b6\u00b8"+
		"\u0003\r\u0006\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba*\u0001\u0000\u0000\u0000\u00bb\u00bd\u0005\""+
		"\u0000\u0000\u00bc\u00be\u0003\u000b\u0005\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005\"\u0000\u0000\u00c2,\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\t\u0000\u0000\u0000\u00c4.\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c60\u0001\u0000\u0000\u0000\u000b"+
		"\u0000f{\u0081\u008c\u009f\u00a8\u00ae\u00b3\u00b9\u00bf\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}