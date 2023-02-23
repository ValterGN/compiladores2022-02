// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MinhaGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PalavraChave=5, Tipo=6, OpArit=7, OpRel=8, 
		AChave=9, FChave=10, AParenteses=11, FParenteses=12, AComentario=13, FComentario=14, 
		WS=15, ID=16, ConstINT=17, ConstREAL=18, ConstSTRING=19, ErrorChar=20, 
		LAMBDA=21, Id=22, OpIgual=23;
	public static final int
		RULE_comando = 0, RULE_expressao = 1, RULE_declaracaoVar = 2, RULE_condicional = 3, 
		RULE_condicionalSenao = 4, RULE_repeticao = 5, RULE_expressaoLogica = 6, 
		RULE_expressaoLogicaString = 7, RULE_expressaoLogicaInt = 8, RULE_expressaoLogicaReal = 9, 
		RULE_atribuicao = 10, RULE_atribuicaoString = 11, RULE_atribuicaoInt = 12, 
		RULE_atribuicaoReal = 13, RULE_expressaoAritInt = 14, RULE_expressaoAritReal = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"comando", "expressao", "declaracaoVar", "condicional", "condicionalSenao", 
			"repeticao", "expressaoLogica", "expressaoLogicaString", "expressaoLogicaInt", 
			"expressaoLogicaReal", "atribuicao", "atribuicaoString", "atribuicaoInt", 
			"atribuicaoReal", "expressaoAritInt", "expressaoAritReal"
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
			"WS", "ID", "ConstINT", "ConstREAL", "ConstSTRING", "ErrorChar", "LAMBDA", 
			"Id", "OpIgual"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinhaGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comando);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				expressao();
				setState(33);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public DeclaracaoVarContext declaracaoVar() {
			return getRuleContext(DeclaracaoVarContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressao);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tipo:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				declaracaoVar();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				condicional();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				repeticao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				atribuicao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVarContext extends ParserRuleContext {
		public TerminalNode Tipo() { return getToken(MinhaGramaticaParser.Tipo, 0); }
		public TerminalNode Id() { return getToken(MinhaGramaticaParser.Id, 0); }
		public DeclaracaoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterDeclaracaoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitDeclaracaoVar(this);
		}
	}

	public final DeclaracaoVarContext declaracaoVar() throws RecognitionException {
		DeclaracaoVarContext _localctx = new DeclaracaoVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(Tipo);
			setState(45);
			match(Id);
			setState(46);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode AParenteses() { return getToken(MinhaGramaticaParser.AParenteses, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode FParenteses() { return getToken(MinhaGramaticaParser.FParenteses, 0); }
		public TerminalNode AChave() { return getToken(MinhaGramaticaParser.AChave, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FChave() { return getToken(MinhaGramaticaParser.FChave, 0); }
		public CondicionalSenaoContext condicionalSenao() {
			return getRuleContext(CondicionalSenaoContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			match(AParenteses);
			setState(50);
			expressaoLogica();
			setState(51);
			match(FParenteses);
			setState(52);
			match(AChave);
			setState(53);
			expressao();
			setState(54);
			match(FChave);
			setState(55);
			condicionalSenao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalSenaoContext extends ParserRuleContext {
		public TerminalNode AChave() { return getToken(MinhaGramaticaParser.AChave, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FChave() { return getToken(MinhaGramaticaParser.FChave, 0); }
		public TerminalNode LAMBDA() { return getToken(MinhaGramaticaParser.LAMBDA, 0); }
		public CondicionalSenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalSenao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterCondicionalSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitCondicionalSenao(this);
		}
	}

	public final CondicionalSenaoContext condicionalSenao() throws RecognitionException {
		CondicionalSenaoContext _localctx = new CondicionalSenaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicionalSenao);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__2);
				setState(58);
				match(AChave);
				setState(59);
				expressao();
				setState(60);
				match(FChave);
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(LAMBDA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode AParenteses() { return getToken(MinhaGramaticaParser.AParenteses, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode FParenteses() { return getToken(MinhaGramaticaParser.FParenteses, 0); }
		public TerminalNode AChave() { return getToken(MinhaGramaticaParser.AChave, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FChave() { return getToken(MinhaGramaticaParser.FChave, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__3);
			setState(66);
			match(AParenteses);
			setState(67);
			expressaoLogica();
			setState(68);
			match(FParenteses);
			setState(69);
			match(AChave);
			setState(70);
			expressao();
			setState(71);
			match(FChave);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode OpRel() { return getToken(MinhaGramaticaParser.OpRel, 0); }
		public ExpressaoLogicaStringContext expressaoLogicaString() {
			return getRuleContext(ExpressaoLogicaStringContext.class,0);
		}
		public ExpressaoLogicaIntContext expressaoLogicaInt() {
			return getRuleContext(ExpressaoLogicaIntContext.class,0);
		}
		public ExpressaoLogicaRealContext expressaoLogicaReal() {
			return getRuleContext(ExpressaoLogicaRealContext.class,0);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressaoLogica(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressaoLogica);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(ID);
				setState(74);
				match(OpRel);
				setState(75);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				expressaoLogicaString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				expressaoLogicaInt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				expressaoLogicaReal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaStringContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode OpRel() { return getToken(MinhaGramaticaParser.OpRel, 0); }
		public TerminalNode ConstSTRING() { return getToken(MinhaGramaticaParser.ConstSTRING, 0); }
		public ExpressaoLogicaStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressaoLogicaString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressaoLogicaString(this);
		}
	}

	public final ExpressaoLogicaStringContext expressaoLogicaString() throws RecognitionException {
		ExpressaoLogicaStringContext _localctx = new ExpressaoLogicaStringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressaoLogicaString);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ID);
				setState(82);
				match(OpRel);
				setState(83);
				match(ConstSTRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(ConstSTRING);
				setState(85);
				match(OpRel);
				setState(86);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(ID);
				setState(88);
				match(OpRel);
				setState(89);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaIntContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode OpRel() { return getToken(MinhaGramaticaParser.OpRel, 0); }
		public TerminalNode ConstINT() { return getToken(MinhaGramaticaParser.ConstINT, 0); }
		public ExpressaoLogicaIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressaoLogicaInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressaoLogicaInt(this);
		}
	}

	public final ExpressaoLogicaIntContext expressaoLogicaInt() throws RecognitionException {
		ExpressaoLogicaIntContext _localctx = new ExpressaoLogicaIntContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressaoLogicaInt);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(ID);
				setState(93);
				match(OpRel);
				setState(94);
				match(ConstINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(ConstINT);
				setState(96);
				match(OpRel);
				setState(97);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(ID);
				setState(99);
				match(OpRel);
				setState(100);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaRealContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode OpRel() { return getToken(MinhaGramaticaParser.OpRel, 0); }
		public TerminalNode ConstREAL() { return getToken(MinhaGramaticaParser.ConstREAL, 0); }
		public ExpressaoLogicaRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressaoLogicaReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressaoLogicaReal(this);
		}
	}

	public final ExpressaoLogicaRealContext expressaoLogicaReal() throws RecognitionException {
		ExpressaoLogicaRealContext _localctx = new ExpressaoLogicaRealContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressaoLogicaReal);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ID);
				setState(104);
				match(OpRel);
				setState(105);
				match(ConstREAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ConstREAL);
				setState(107);
				match(OpRel);
				setState(108);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(ID);
				setState(110);
				match(OpRel);
				setState(111);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoStringContext atribuicaoString() {
			return getRuleContext(AtribuicaoStringContext.class,0);
		}
		public AtribuicaoIntContext atribuicaoInt() {
			return getRuleContext(AtribuicaoIntContext.class,0);
		}
		public AtribuicaoRealContext atribuicaoReal() {
			return getRuleContext(AtribuicaoRealContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				atribuicaoString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				atribuicaoInt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				atribuicaoReal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoStringContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode OpIgual() { return getToken(MinhaGramaticaParser.OpIgual, 0); }
		public TerminalNode ConstSTRING() { return getToken(MinhaGramaticaParser.ConstSTRING, 0); }
		public AtribuicaoStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterAtribuicaoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitAtribuicaoString(this);
		}
	}

	public final AtribuicaoStringContext atribuicaoString() throws RecognitionException {
		AtribuicaoStringContext _localctx = new AtribuicaoStringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicaoString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(OpIgual);
			setState(121);
			match(ConstSTRING);
			setState(122);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoIntContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode OpIgual() { return getToken(MinhaGramaticaParser.OpIgual, 0); }
		public TerminalNode ConstINT() { return getToken(MinhaGramaticaParser.ConstINT, 0); }
		public ExpressaoAritIntContext expressaoAritInt() {
			return getRuleContext(ExpressaoAritIntContext.class,0);
		}
		public AtribuicaoIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterAtribuicaoInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitAtribuicaoInt(this);
		}
	}

	public final AtribuicaoIntContext atribuicaoInt() throws RecognitionException {
		AtribuicaoIntContext _localctx = new AtribuicaoIntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicaoInt);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(ID);
				setState(125);
				match(OpIgual);
				setState(126);
				match(ConstINT);
				setState(127);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				setState(129);
				match(OpIgual);
				setState(130);
				expressaoAritInt();
				setState(131);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoRealContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode OpIgual() { return getToken(MinhaGramaticaParser.OpIgual, 0); }
		public TerminalNode ConstREAL() { return getToken(MinhaGramaticaParser.ConstREAL, 0); }
		public ExpressaoAritRealContext expressaoAritReal() {
			return getRuleContext(ExpressaoAritRealContext.class,0);
		}
		public AtribuicaoRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterAtribuicaoReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitAtribuicaoReal(this);
		}
	}

	public final AtribuicaoRealContext atribuicaoReal() throws RecognitionException {
		AtribuicaoRealContext _localctx = new AtribuicaoRealContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atribuicaoReal);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(ID);
				setState(136);
				match(OpIgual);
				setState(137);
				match(ConstREAL);
				setState(138);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(ID);
				setState(140);
				match(OpIgual);
				setState(141);
				expressaoAritReal();
				setState(142);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoAritIntContext extends ParserRuleContext {
		public List<TerminalNode> ConstINT() { return getTokens(MinhaGramaticaParser.ConstINT); }
		public TerminalNode ConstINT(int i) {
			return getToken(MinhaGramaticaParser.ConstINT, i);
		}
		public TerminalNode OpArit() { return getToken(MinhaGramaticaParser.OpArit, 0); }
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public ExpressaoAritIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressaoAritInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressaoAritInt(this);
		}
	}

	public final ExpressaoAritIntContext expressaoAritInt() throws RecognitionException {
		ExpressaoAritIntContext _localctx = new ExpressaoAritIntContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressaoAritInt);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(ConstINT);
				setState(147);
				match(OpArit);
				setState(148);
				match(ConstINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(ID);
				setState(150);
				match(OpArit);
				setState(151);
				match(ConstINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(ConstINT);
				setState(153);
				match(OpArit);
				setState(154);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(ID);
				setState(156);
				match(OpArit);
				setState(157);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoAritRealContext extends ParserRuleContext {
		public List<TerminalNode> ConstREAL() { return getTokens(MinhaGramaticaParser.ConstREAL); }
		public TerminalNode ConstREAL(int i) {
			return getToken(MinhaGramaticaParser.ConstREAL, i);
		}
		public TerminalNode OpArit() { return getToken(MinhaGramaticaParser.OpArit, 0); }
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public ExpressaoAritRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressaoAritReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressaoAritReal(this);
		}
	}

	public final ExpressaoAritRealContext expressaoAritReal() throws RecognitionException {
		ExpressaoAritRealContext _localctx = new ExpressaoAritRealContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressaoAritReal);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(ConstREAL);
				setState(161);
				match(OpArit);
				setState(162);
				match(ConstREAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(ID);
				setState(164);
				match(OpArit);
				setState(165);
				match(ConstREAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(ConstREAL);
				setState(167);
				match(OpArit);
				setState(168);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(ID);
				setState(170);
				match(OpArit);
				setState(171);
				match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000%\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004@\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006P\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007[\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\bf\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\tq\b\t\u0001\n\u0001\n\u0001\n\u0003\n"+
		"v\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0086\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0091\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009f\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ad"+
		"\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u00b6\u0000"+
		"$\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004,\u0001"+
		"\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000"+
		"\u0000\nA\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eZ\u0001"+
		"\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014u\u0001\u0000\u0000\u0000\u0016w\u0001\u0000\u0000\u0000\u0018"+
		"\u0085\u0001\u0000\u0000\u0000\u001a\u0090\u0001\u0000\u0000\u0000\u001c"+
		"\u009e\u0001\u0000\u0000\u0000\u001e\u00ac\u0001\u0000\u0000\u0000 !\u0003"+
		"\u0002\u0001\u0000!\"\u0003\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000"+
		"#%\u0003\u0002\u0001\u0000$ \u0001\u0000\u0000\u0000$#\u0001\u0000\u0000"+
		"\u0000%\u0001\u0001\u0000\u0000\u0000&+\u0003\u0004\u0002\u0000\'+\u0003"+
		"\u0006\u0003\u0000(+\u0003\n\u0005\u0000)+\u0003\u0014\n\u0000*&\u0001"+
		"\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*)\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u0006"+
		"\u0000\u0000-.\u0005\u0016\u0000\u0000./\u0005\u0001\u0000\u0000/\u0005"+
		"\u0001\u0000\u0000\u000001\u0005\u0002\u0000\u000012\u0005\u000b\u0000"+
		"\u000023\u0003\f\u0006\u000034\u0005\f\u0000\u000045\u0005\t\u0000\u0000"+
		"56\u0003\u0002\u0001\u000067\u0005\n\u0000\u000078\u0003\b\u0004\u0000"+
		"8\u0007\u0001\u0000\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0005\t\u0000"+
		"\u0000;<\u0003\u0002\u0001\u0000<=\u0005\n\u0000\u0000=@\u0001\u0000\u0000"+
		"\u0000>@\u0005\u0015\u0000\u0000?9\u0001\u0000\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@\t\u0001\u0000\u0000\u0000AB\u0005\u0004\u0000\u0000BC\u0005"+
		"\u000b\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005\f\u0000\u0000EF\u0005"+
		"\t\u0000\u0000FG\u0003\u0002\u0001\u0000GH\u0005\n\u0000\u0000H\u000b"+
		"\u0001\u0000\u0000\u0000IJ\u0005\u0010\u0000\u0000JK\u0005\b\u0000\u0000"+
		"KP\u0005\u0010\u0000\u0000LP\u0003\u000e\u0007\u0000MP\u0003\u0010\b\u0000"+
		"NP\u0003\u0012\t\u0000OI\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\r\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0010\u0000\u0000RS\u0005\b\u0000\u0000S[\u0005\u0013\u0000"+
		"\u0000TU\u0005\u0013\u0000\u0000UV\u0005\b\u0000\u0000V[\u0005\u0010\u0000"+
		"\u0000WX\u0005\u0010\u0000\u0000XY\u0005\b\u0000\u0000Y[\u0005\u0010\u0000"+
		"\u0000ZQ\u0001\u0000\u0000\u0000ZT\u0001\u0000\u0000\u0000ZW\u0001\u0000"+
		"\u0000\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005\u0010\u0000\u0000"+
		"]^\u0005\b\u0000\u0000^f\u0005\u0011\u0000\u0000_`\u0005\u0011\u0000\u0000"+
		"`a\u0005\b\u0000\u0000af\u0005\u0010\u0000\u0000bc\u0005\u0010\u0000\u0000"+
		"cd\u0005\b\u0000\u0000df\u0005\u0010\u0000\u0000e\\\u0001\u0000\u0000"+
		"\u0000e_\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000f\u0011\u0001"+
		"\u0000\u0000\u0000gh\u0005\u0010\u0000\u0000hi\u0005\b\u0000\u0000iq\u0005"+
		"\u0012\u0000\u0000jk\u0005\u0012\u0000\u0000kl\u0005\b\u0000\u0000lq\u0005"+
		"\u0010\u0000\u0000mn\u0005\u0010\u0000\u0000no\u0005\b\u0000\u0000oq\u0005"+
		"\u0010\u0000\u0000pg\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000"+
		"pm\u0001\u0000\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rv\u0003\u0016"+
		"\u000b\u0000sv\u0003\u0018\f\u0000tv\u0003\u001a\r\u0000ur\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0015"+
		"\u0001\u0000\u0000\u0000wx\u0005\u0010\u0000\u0000xy\u0005\u0017\u0000"+
		"\u0000yz\u0005\u0013\u0000\u0000z{\u0005\u0001\u0000\u0000{\u0017\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0010\u0000\u0000}~\u0005\u0017\u0000\u0000"+
		"~\u007f\u0005\u0011\u0000\u0000\u007f\u0086\u0005\u0001\u0000\u0000\u0080"+
		"\u0081\u0005\u0010\u0000\u0000\u0081\u0082\u0005\u0017\u0000\u0000\u0082"+
		"\u0083\u0003\u001c\u000e\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085\u0080"+
		"\u0001\u0000\u0000\u0000\u0086\u0019\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\u0010\u0000\u0000\u0088\u0089\u0005\u0017\u0000\u0000\u0089\u008a"+
		"\u0005\u0012\u0000\u0000\u008a\u0091\u0005\u0001\u0000\u0000\u008b\u008c"+
		"\u0005\u0010\u0000\u0000\u008c\u008d\u0005\u0017\u0000\u0000\u008d\u008e"+
		"\u0003\u001e\u000f\u0000\u008e\u008f\u0005\u0001\u0000\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u0087\u0001\u0000\u0000\u0000\u0090\u008b"+
		"\u0001\u0000\u0000\u0000\u0091\u001b\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005\u0011\u0000\u0000\u0093\u0094\u0005\u0007\u0000\u0000\u0094\u009f"+
		"\u0005\u0011\u0000\u0000\u0095\u0096\u0005\u0010\u0000\u0000\u0096\u0097"+
		"\u0005\u0007\u0000\u0000\u0097\u009f\u0005\u0011\u0000\u0000\u0098\u0099"+
		"\u0005\u0011\u0000\u0000\u0099\u009a\u0005\u0007\u0000\u0000\u009a\u009f"+
		"\u0005\u0010\u0000\u0000\u009b\u009c\u0005\u0010\u0000\u0000\u009c\u009d"+
		"\u0005\u0007\u0000\u0000\u009d\u009f\u0005\u0010\u0000\u0000\u009e\u0092"+
		"\u0001\u0000\u0000\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009e\u0098"+
		"\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009f\u001d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0012\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0007\u0000\u0000\u00a2\u00ad\u0005\u0012\u0000\u0000\u00a3\u00a4"+
		"\u0005\u0010\u0000\u0000\u00a4\u00a5\u0005\u0007\u0000\u0000\u00a5\u00ad"+
		"\u0005\u0012\u0000\u0000\u00a6\u00a7\u0005\u0012\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0007\u0000\u0000\u00a8\u00ad\u0005\u0010\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0010\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ad"+
		"\u0005\u0010\u0000\u0000\u00ac\u00a0\u0001\u0000\u0000\u0000\u00ac\u00a3"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ad\u001f\u0001\u0000\u0000\u0000\f$*?OZep"+
		"u\u0085\u0090\u009e\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}