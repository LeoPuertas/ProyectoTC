

package ar.edu.ubp.tc.tabla;

import ar.edu.ubp.tc.Final.SintacticoBaseListener;
import ar.edu.ubp.tc.Final.SintacticoParser;
import ar.edu.ubp.tc.Final.SintacticoLexer;
import ar.edu.ubp.tc.*;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 *
 * @author lab3
 */
public class Main {
    public static void main(String args[]){
        try{
            //levantamos el archivo a procesar
            FileInputStream stream=new FileInputStream("CodigoFuenteEjemplo.c");
            //creamos un ANTLRInputStream pasándole el stream del archivo
            ANTLRInputStream antlrStream=new ANTLRInputStream(stream);
            //Creamos un lexer
            SintacticoLexer lexer=  new SintacticoLexer(antlrStream);
            //levantamos los tokens
            CommonTokenStream tokens=new CommonTokenStream(lexer);
            //Creamos el parser
            SintacticoParser parser=new SintacticoParser(tokens);
            //Instanciamos la clase que implementa el escuchas
            SintacticoBaseListener listener = new SintacticoBaseListener();
            //le pasamos al parser el listener (podríamos manejar varios escuchas).
            parser.addParseListener(listener);
            //Aramamos un árbol iniciando el proceso. para esto el generador
            //de código crea un método dentro del parser con el nombre del símbolo
            //inicial. Debemos invocar ese método.
            ParseTree tree = parser.codigo();
            //Podríamos imprimir el árbol por consola.
            System.out.println("arbol:" + tree.toStringTree(parser));
        }catch(Exception e){
            //cualquier error, capturamos la exception.
            e.printStackTrace();
        }
    }
}
