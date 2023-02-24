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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PalavraChave=12, Tipo=13, BOOLEAN=14, OpArit=15, OpRel=16, 
		AChave=17, FChave=18, AParenteses=19, FParenteses=20, AComentario=21, 
		FComentario=22, WS=23, ID=24, ConstINT=25, ConstREAL=26, ConstSTRING=27, 
		ErrorChar=28, LAMBDA=29;
	public static final int
		RULE_bloco = 0, RULE_comando = 1, RULE_comentario = 2, RULE_entrada = 3, 
		RULE_saida = 4, RULE_expressao = 5, RULE_termo = 6, RULE_declaracaoVar = 7, 
		RULE_condicional = 8, RULE_condicionalSenao = 9, RULE_repeticao = 10, 
		RULE_funcao = 11, RULE_parametros = 12, RULE_corpoFuncao = 13, RULE_procedimento = 14, 
		RULE_corpoProcedimento = 15, RULE_atribuicao = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"bloco", "comando", "comentario", "entrada", "saida", "expressao", "termo", 
			"declaracaoVar", "condicional", "condicionalSenao", "repeticao", "funcao", 
			"parametros", "corpoFuncao", "procedimento", "corpoProcedimento", "atribuicao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'IN'", "';'", "'OUT'", "'!'", "'if'", "'else'", "'while'", 
			"'func'", "'return'", "'proc'", null, null, null, null, null, "'{'", 
			"'}'", "'('", "')'", "'/*'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PalavraChave", "Tipo", "BOOLEAN", "OpArit", "OpRel", "AChave", "FChave", 
			"AParenteses", "FParenteses", "AComentario", "FComentario", "WS", "ID", 
			"ConstINT", "ConstREAL", "ConstSTRING", "ErrorChar", "LAMBDA"
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
	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				comando();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 18885456L) != 0 );
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
	public static class ComandoContext extends ParserRuleContext {
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
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
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
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				declaracaoVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				repeticao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				atribuicao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				entrada();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				saida();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				comentario();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(46);
				funcao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(47);
				procedimento();
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
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode AComentario() { return getToken(MinhaGramaticaParser.AComentario, 0); }
		public TerminalNode FComentario() { return getToken(MinhaGramaticaParser.FComentario, 0); }
		public List<TerminalNode> ConstSTRING() { return getTokens(MinhaGramaticaParser.ConstSTRING); }
		public TerminalNode ConstSTRING(int i) {
			return getToken(MinhaGramaticaParser.ConstSTRING, i);
		}
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(AComentario);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ConstSTRING) {
				{
				{
				setState(51);
				match(ConstSTRING);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(FComentario);
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
	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(T__0);
			setState(61);
			match(T__1);
			setState(62);
			match(T__2);
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
	public static class SaidaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitSaida(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__3);
			setState(65);
			match(T__0);
			setState(66);
			expressao();
			setState(67);
			match(T__2);
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
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<TerminalNode> AParenteses() { return getTokens(MinhaGramaticaParser.AParenteses); }
		public TerminalNode AParenteses(int i) {
			return getToken(MinhaGramaticaParser.AParenteses, i);
		}
		public List<TerminalNode> FParenteses() { return getTokens(MinhaGramaticaParser.FParenteses); }
		public TerminalNode FParenteses(int i) {
			return getToken(MinhaGramaticaParser.FParenteses, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> OpArit() { return getTokens(MinhaGramaticaParser.OpArit); }
		public TerminalNode OpArit(int i) {
			return getToken(MinhaGramaticaParser.OpArit, i);
		}
		public List<TerminalNode> OpRel() { return getTokens(MinhaGramaticaParser.OpRel); }
		public TerminalNode OpRel(int i) {
			return getToken(MinhaGramaticaParser.OpRel, i);
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
		enterRule(_localctx, 10, RULE_expressao);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AParenteses) {
				{
				{
				setState(69);
				match(AParenteses);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(75);
				match(T__4);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			termo();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(FParenteses);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					_la = _input.LA(1);
					if ( !(_la==OpArit || _la==OpRel) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(89);
					expressao();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ConstREAL() { return getToken(MinhaGramaticaParser.ConstREAL, 0); }
		public TerminalNode ConstINT() { return getToken(MinhaGramaticaParser.ConstINT, 0); }
		public TerminalNode ConstSTRING() { return getToken(MinhaGramaticaParser.ConstSTRING, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(MinhaGramaticaParser.BOOLEAN, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 251674624L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVarContext extends ParserRuleContext {
		public TerminalNode Tipo() { return getToken(MinhaGramaticaParser.Tipo, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
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
		enterRule(_localctx, 14, RULE_declaracaoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(Tipo);
			setState(98);
			match(ID);
			setState(99);
			match(T__2);
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FParenteses() { return getToken(MinhaGramaticaParser.FParenteses, 0); }
		public TerminalNode AChave() { return getToken(MinhaGramaticaParser.AChave, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
		enterRule(_localctx, 16, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__5);
			setState(102);
			match(AParenteses);
			setState(103);
			expressao();
			setState(104);
			match(FParenteses);
			setState(105);
			match(AChave);
			setState(106);
			bloco();
			setState(107);
			match(FChave);
			setState(108);
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
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
		enterRule(_localctx, 18, RULE_condicionalSenao);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__6);
				setState(111);
				match(AChave);
				setState(112);
				bloco();
				setState(113);
				match(FChave);
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FParenteses() { return getToken(MinhaGramaticaParser.FParenteses, 0); }
		public TerminalNode AChave() { return getToken(MinhaGramaticaParser.AChave, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
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
		enterRule(_localctx, 20, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__7);
			setState(119);
			match(AParenteses);
			setState(120);
			expressao();
			setState(121);
			match(FParenteses);
			setState(122);
			match(AChave);
			setState(123);
			bloco();
			setState(124);
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
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode Tipo() { return getToken(MinhaGramaticaParser.Tipo, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode AParenteses() { return getToken(MinhaGramaticaParser.AParenteses, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode FParenteses() { return getToken(MinhaGramaticaParser.FParenteses, 0); }
		public TerminalNode AChave() { return getToken(MinhaGramaticaParser.AChave, 0); }
		public CorpoFuncaoContext corpoFuncao() {
			return getRuleContext(CorpoFuncaoContext.class,0);
		}
		public TerminalNode FChave() { return getToken(MinhaGramaticaParser.FChave, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__8);
			setState(127);
			match(Tipo);
			setState(128);
			match(ID);
			setState(129);
			match(AParenteses);
			setState(130);
			parametros();
			setState(131);
			match(FParenteses);
			setState(132);
			match(AChave);
			setState(133);
			corpoFuncao();
			setState(134);
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
	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode Tipo() { return getToken(MinhaGramaticaParser.Tipo, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametros);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(Tipo);
				setState(137);
				match(ID);
				setState(138);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(Tipo);
				setState(140);
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
	public static class CorpoFuncaoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public CorpoFuncaoContext corpoFuncao() {
			return getRuleContext(CorpoFuncaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CorpoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterCorpoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitCorpoFuncao(this);
		}
	}

	public final CorpoFuncaoContext corpoFuncao() throws RecognitionException {
		CorpoFuncaoContext _localctx = new CorpoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_corpoFuncao);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				comando();
				setState(144);
				corpoFuncao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				comando();
				setState(147);
				match(T__9);
				setState(148);
				expressao();
				setState(149);
				match(T__2);
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
	public static class ProcedimentoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode AParenteses() { return getToken(MinhaGramaticaParser.AParenteses, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode FParenteses() { return getToken(MinhaGramaticaParser.FParenteses, 0); }
		public TerminalNode AChave() { return getToken(MinhaGramaticaParser.AChave, 0); }
		public CorpoProcedimentoContext corpoProcedimento() {
			return getRuleContext(CorpoProcedimentoContext.class,0);
		}
		public TerminalNode FChave() { return getToken(MinhaGramaticaParser.FChave, 0); }
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitProcedimento(this);
		}
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_procedimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__10);
			setState(154);
			match(ID);
			setState(155);
			match(AParenteses);
			setState(156);
			parametros();
			setState(157);
			match(FParenteses);
			setState(158);
			match(AChave);
			setState(159);
			corpoProcedimento();
			setState(160);
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
	public static class CorpoProcedimentoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public CorpoFuncaoContext corpoFuncao() {
			return getRuleContext(CorpoFuncaoContext.class,0);
		}
		public CorpoProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpoProcedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterCorpoProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitCorpoProcedimento(this);
		}
	}

	public final CorpoProcedimentoContext corpoProcedimento() throws RecognitionException {
		CorpoProcedimentoContext _localctx = new CorpoProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_corpoProcedimento);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				comando();
				setState(163);
				corpoFuncao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				comando();
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
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		enterRule(_localctx, 32, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(T__0);
			setState(170);
			expressao();
			setState(171);
			match(T__2);
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
		"\u0004\u0001\u001d\u00ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0004\u0000$\b\u0000\u000b"+
		"\u0000\f\u0000%\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u00028\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0005\u0005G\b\u0005\n\u0005\f\u0005J\t\u0005\u0001"+
		"\u0005\u0005\u0005M\b\u0005\n\u0005\f\u0005P\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005T\b\u0005\n\u0005\f\u0005W\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tu\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008e"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0098\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00a7\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0002\u0001\u0000\u000f\u0010\u0002\u0000\u000e\u000e\u0018"+
		"\u001b\u00ae\u0000#\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000"+
		"\u00042\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\b@\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000"+
		"\u000ea\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012t"+
		"\u0001\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016~\u0001\u0000"+
		"\u0000\u0000\u0018\u008d\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000"+
		"\u0000\u0000\u001c\u0099\u0001\u0000\u0000\u0000\u001e\u00a6\u0001\u0000"+
		"\u0000\u0000 \u00a8\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000"+
		"#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000\u0000\u0000\'1\u0003"+
		"\u000e\u0007\u0000(1\u0003\u0010\b\u0000)1\u0003\u0014\n\u0000*1\u0003"+
		" \u0010\u0000+1\u0003\u0006\u0003\u0000,1\u0003\b\u0004\u0000-1\u0003"+
		"\u0004\u0002\u0000.1\u0003\u0016\u000b\u0000/1\u0003\u001c\u000e\u0000"+
		"0\'\u0001\u0000\u0000\u00000(\u0001\u0000\u0000\u00000)\u0001\u0000\u0000"+
		"\u00000*\u0001\u0000\u0000\u00000+\u0001\u0000\u0000\u00000,\u0001\u0000"+
		"\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001"+
		"\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u000026\u0005\u0015\u0000"+
		"\u000035\u0005\u001b\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0016\u0000\u0000"+
		":\u0005\u0001\u0000\u0000\u0000;<\u0005\u0018\u0000\u0000<=\u0005\u0001"+
		"\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0005\u0003\u0000\u0000?\u0007"+
		"\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000AB\u0005\u0001\u0000"+
		"\u0000BC\u0003\n\u0005\u0000CD\u0005\u0003\u0000\u0000D\t\u0001\u0000"+
		"\u0000\u0000EG\u0005\u0013\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IN\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KM\u0005\u0005\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QU\u0003\f\u0006\u0000RT\u0005\u0014\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\\\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XY\u0007\u0000\u0000\u0000Y[\u0003\n\u0005\u0000ZX\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\u000b\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_`\u0007\u0001\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\r\u0000"+
		"\u0000bc\u0005\u0018\u0000\u0000cd\u0005\u0003\u0000\u0000d\u000f\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0006\u0000\u0000fg\u0005\u0013\u0000\u0000"+
		"gh\u0003\n\u0005\u0000hi\u0005\u0014\u0000\u0000ij\u0005\u0011\u0000\u0000"+
		"jk\u0003\u0000\u0000\u0000kl\u0005\u0012\u0000\u0000lm\u0003\u0012\t\u0000"+
		"m\u0011\u0001\u0000\u0000\u0000no\u0005\u0007\u0000\u0000op\u0005\u0011"+
		"\u0000\u0000pq\u0003\u0000\u0000\u0000qr\u0005\u0012\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000su\u0005\u001d\u0000\u0000tn\u0001\u0000\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000u\u0013\u0001\u0000\u0000\u0000vw\u0005\b\u0000"+
		"\u0000wx\u0005\u0013\u0000\u0000xy\u0003\n\u0005\u0000yz\u0005\u0014\u0000"+
		"\u0000z{\u0005\u0011\u0000\u0000{|\u0003\u0000\u0000\u0000|}\u0005\u0012"+
		"\u0000\u0000}\u0015\u0001\u0000\u0000\u0000~\u007f\u0005\t\u0000\u0000"+
		"\u007f\u0080\u0005\r\u0000\u0000\u0080\u0081\u0005\u0018\u0000\u0000\u0081"+
		"\u0082\u0005\u0013\u0000\u0000\u0082\u0083\u0003\u0018\f\u0000\u0083\u0084"+
		"\u0005\u0014\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085\u0086"+
		"\u0003\u001a\r\u0000\u0086\u0087\u0005\u0012\u0000\u0000\u0087\u0017\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089\u008a\u0005\u0018"+
		"\u0000\u0000\u008a\u008e\u0005\u0003\u0000\u0000\u008b\u008c\u0005\r\u0000"+
		"\u0000\u008c\u008e\u0005\u0018\u0000\u0000\u008d\u0088\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0019\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0003\u0002\u0001\u0000\u0090\u0091\u0003\u001a\r\u0000"+
		"\u0091\u0098\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0002\u0001\u0000"+
		"\u0093\u0094\u0005\n\u0000\u0000\u0094\u0095\u0003\n\u0005\u0000\u0095"+
		"\u0096\u0005\u0003\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097"+
		"\u008f\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0098"+
		"\u001b\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000b\u0000\u0000\u009a"+
		"\u009b\u0005\u0018\u0000\u0000\u009b\u009c\u0005\u0013\u0000\u0000\u009c"+
		"\u009d\u0003\u0018\f\u0000\u009d\u009e\u0005\u0014\u0000\u0000\u009e\u009f"+
		"\u0005\u0011\u0000\u0000\u009f\u00a0\u0003\u001e\u000f\u0000\u00a0\u00a1"+
		"\u0005\u0012\u0000\u0000\u00a1\u001d\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0003\u0002\u0001\u0000\u00a3\u00a4\u0003\u001a\r\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0003\u0002\u0001\u0000\u00a6\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u001f\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\u0018\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0001\u0000\u0000\u00aa\u00ab\u0003\n\u0005\u0000\u00ab\u00ac\u0005\u0003"+
		"\u0000\u0000\u00ac!\u0001\u0000\u0000\u0000\u000b%06HNU\\t\u008d\u0097"+
		"\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}