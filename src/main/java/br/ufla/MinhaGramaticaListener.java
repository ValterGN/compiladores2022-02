package br.ufla;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinhaGramaticaParser}.
 */
public interface MinhaGramaticaListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(MinhaGramaticaParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(MinhaGramaticaParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressaoLogicaString}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaString(MinhaGramaticaParser.ExpressaoLogicaStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressaoLogicaString}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaString(MinhaGramaticaParser.ExpressaoLogicaStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressaoLogicaInt}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaInt(MinhaGramaticaParser.ExpressaoLogicaIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressaoLogicaInt}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaInt(MinhaGramaticaParser.ExpressaoLogicaIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressaoLogicaReal}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaReal(MinhaGramaticaParser.ExpressaoLogicaRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressaoLogicaReal}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaReal(MinhaGramaticaParser.ExpressaoLogicaRealContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#atribuicaoString}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoString(MinhaGramaticaParser.AtribuicaoStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#atribuicaoString}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoString(MinhaGramaticaParser.AtribuicaoStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#atribuicaoInt}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoInt(MinhaGramaticaParser.AtribuicaoIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#atribuicaoInt}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoInt(MinhaGramaticaParser.AtribuicaoIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#atribuicaoReal}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoReal(MinhaGramaticaParser.AtribuicaoRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#atribuicaoReal}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoReal(MinhaGramaticaParser.AtribuicaoRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressaoAritInt}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritInt(MinhaGramaticaParser.ExpressaoAritIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressaoAritInt}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritInt(MinhaGramaticaParser.ExpressaoAritIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressaoAritReal}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritReal(MinhaGramaticaParser.ExpressaoAritRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressaoAritReal}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritReal(MinhaGramaticaParser.ExpressaoAritRealContext ctx);
}