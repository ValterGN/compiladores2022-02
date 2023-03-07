package br.ufla;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void  main (String[] args){
        String filename = "./Fatorial.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MinhaGramaticaParser parser = new MinhaGramaticaParser(tokens);

            ParseTree ast = parser.bloco();

            MyListener listener = new MyListener();
            ParseTreeWalker walker = new ParseTreeWalker();

            System.out.println(ast.toStringTree());

            walker.walk(listener, ast);
//            Token token;
//            while (!lexer._hitEOF){
//                token = lexer.nextToken();
//                System.out.println("Token: "+ token.toString());
//                System.out.print("\tLexema: "+ token.getText());
//                System.out.println("\tClasse: "+lexer.getVocabulary().getDisplayName(token.getType()));
//            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}