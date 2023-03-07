package br.ufla;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class MyListener implements MinhaGramaticaListener{
    Map<String, String> variaveis = new HashMap<>();

    @Override
    public void enterBloco(MinhaGramaticaParser.BlocoContext ctx) {

    }

    @Override
    public void exitBloco(MinhaGramaticaParser.BlocoContext ctx) {

    }

    @Override
    public void enterComando(MinhaGramaticaParser.ComandoContext ctx) {

    }

    @Override
    public void exitComando(MinhaGramaticaParser.ComandoContext ctx) {

    }

    @Override
    public void enterComentario(MinhaGramaticaParser.ComentarioContext ctx) {

    }

    @Override
    public void exitComentario(MinhaGramaticaParser.ComentarioContext ctx) {

    }

    @Override
    public void enterEntrada(MinhaGramaticaParser.EntradaContext ctx) {

    }

    @Override
    public void exitEntrada(MinhaGramaticaParser.EntradaContext ctx) {

    }

    @Override
    public void enterSaida(MinhaGramaticaParser.SaidaContext ctx) {

    }

    @Override
    public void exitSaida(MinhaGramaticaParser.SaidaContext ctx) {

    }

    @Override
    public void enterExpressao(MinhaGramaticaParser.ExpressaoContext ctx) {

    }

    @Override
    public void exitExpressao(MinhaGramaticaParser.ExpressaoContext ctx) {

    }

    @Override
    public void enterTermo(MinhaGramaticaParser.TermoContext ctx) {

    }

    @Override
    public void exitTermo(MinhaGramaticaParser.TermoContext ctx) {

    }

    @Override
    public void enterDeclaracaoVar(MinhaGramaticaParser.DeclaracaoVarContext ctx) {
        if(!variaveis.containsKey(ctx.ID().getText())){
            variaveis.put(ctx.ID().getText(), ctx.Tipo().getText());
        } else {
            System.out.println("Variável " + ctx.ID().getText() + " já foi declarada!!!");
        }
    }

    @Override
    public void exitDeclaracaoVar(MinhaGramaticaParser.DeclaracaoVarContext ctx) {

    }

    @Override
    public void enterCondicional(MinhaGramaticaParser.CondicionalContext ctx) {

    }

    @Override
    public void exitCondicional(MinhaGramaticaParser.CondicionalContext ctx) {

    }

    @Override
    public void enterCondicionalSenao(MinhaGramaticaParser.CondicionalSenaoContext ctx) {

    }

    @Override
    public void exitCondicionalSenao(MinhaGramaticaParser.CondicionalSenaoContext ctx) {

    }

    @Override
    public void enterRepeticao(MinhaGramaticaParser.RepeticaoContext ctx) {

    }

    @Override
    public void exitRepeticao(MinhaGramaticaParser.RepeticaoContext ctx) {

    }

    @Override
    public void enterFuncao(MinhaGramaticaParser.FuncaoContext ctx) {

    }

    @Override
    public void exitFuncao(MinhaGramaticaParser.FuncaoContext ctx) {

    }

    @Override
    public void enterParametros(MinhaGramaticaParser.ParametrosContext ctx) {

    }

    @Override
    public void exitParametros(MinhaGramaticaParser.ParametrosContext ctx) {

    }

    @Override
    public void enterCorpoFuncao(MinhaGramaticaParser.CorpoFuncaoContext ctx) {

    }

    @Override
    public void exitCorpoFuncao(MinhaGramaticaParser.CorpoFuncaoContext ctx) {

    }

    @Override
    public void enterProcedimento(MinhaGramaticaParser.ProcedimentoContext ctx) {

    }

    @Override
    public void exitProcedimento(MinhaGramaticaParser.ProcedimentoContext ctx) {

    }

    @Override
    public void enterCorpoProcedimento(MinhaGramaticaParser.CorpoProcedimentoContext ctx) {

    }

    @Override
    public void exitCorpoProcedimento(MinhaGramaticaParser.CorpoProcedimentoContext ctx) {

    }

    @Override
    public void enterAtribuicao(MinhaGramaticaParser.AtribuicaoContext ctx) {

    }

    @Override
    public void exitAtribuicao(MinhaGramaticaParser.AtribuicaoContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
