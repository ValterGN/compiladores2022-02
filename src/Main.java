import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String filename = "./Codigo.txt";
        try{
            CharStream input = (CharStream) CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            Token token;
            while(!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
                System.out.println("    Lexema: " + token.getText());
                System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
                
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
