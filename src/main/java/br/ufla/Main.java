package br.ufla;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            CharStream entrada = CharStreams.fromFileName(args[0]);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(entrada);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MinhaGramaticaParser parser = new MinhaGramaticaParser(tokens);

            ParseTree ast = parser.inicio();

            System.out.println(ast.toStringTree());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}