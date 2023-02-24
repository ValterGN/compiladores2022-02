// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinhaGramaticaParser}.
 */
public interface MinhaGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MinhaGramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MinhaGramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(MinhaGramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(MinhaGramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(MinhaGramaticaParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(MinhaGramaticaParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(MinhaGramaticaParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(MinhaGramaticaParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(MinhaGramaticaParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(MinhaGramaticaParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(MinhaGramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(MinhaGramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(MinhaGramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(MinhaGramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#declaracaoVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVar(MinhaGramaticaParser.DeclaracaoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#declaracaoVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVar(MinhaGramaticaParser.DeclaracaoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(MinhaGramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(MinhaGramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#condicionalSenao}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalSenao(MinhaGramaticaParser.CondicionalSenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#condicionalSenao}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalSenao(MinhaGramaticaParser.CondicionalSenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(MinhaGramaticaParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(MinhaGramaticaParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(MinhaGramaticaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(MinhaGramaticaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MinhaGramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MinhaGramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#corpoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterCorpoFuncao(MinhaGramaticaParser.CorpoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#corpoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitCorpoFuncao(MinhaGramaticaParser.CorpoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento(MinhaGramaticaParser.ProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento(MinhaGramaticaParser.ProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#corpoProcedimento}.
	 * @param ctx the parse tree
	 */
	void enterCorpoProcedimento(MinhaGramaticaParser.CorpoProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#corpoProcedimento}.
	 * @param ctx the parse tree
	 */
	void exitCorpoProcedimento(MinhaGramaticaParser.CorpoProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(MinhaGramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(MinhaGramaticaParser.AtribuicaoContext ctx);
}