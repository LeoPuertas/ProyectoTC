// Generated from C:\Users\PC\Desktop\PEF\JavaApplication5\src\javaapplication5\Sintactico.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc.Final;

import ar.edu.ubp.tc.tabla.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SintacticoBaseListener implements SintacticoListener {
    
        SymbolTable st ;
         int decl_funcion = 0;
         int en_funcion = 0;
         int en_bloque = 0;
         int declarando = 0;
         int decl_parametros = 0;
         boolean error = false;
    
	@Override public void enterInstrucciones(@NotNull SintacticoParser.InstruccionesContext ctx) { }
	@Override public void exitInstrucciones(@NotNull SintacticoParser.InstruccionesContext ctx) { }
	@Override public void enterParametros_funcion_mal(@NotNull SintacticoParser.Parametros_funcion_malContext ctx) { }
	@Override public void exitParametros_funcion_mal(@NotNull SintacticoParser.Parametros_funcion_malContext ctx) { 
            System.out.println("Error, parametros funcion. Linea : " + ctx.getStart().getLine());
            error = true;
        }
	@Override public void enterAsignacion(@NotNull SintacticoParser.AsignacionContext ctx) { }
	@Override public void exitAsignacion(@NotNull SintacticoParser.AsignacionContext ctx) { }
	@Override public void enterDeclarar_variable_mal_tipo(@NotNull SintacticoParser.Declarar_variable_mal_tipoContext ctx) { }
	@Override public void exitDeclarar_variable_mal_tipo(@NotNull SintacticoParser.Declarar_variable_mal_tipoContext ctx) { }
	@Override public void enterDeclarar_variable_mal(@NotNull SintacticoParser.Declarar_variable_malContext ctx) { 
            declarando = 1;
        }
	@Override public void exitDeclarar_variable_mal(@NotNull SintacticoParser.Declarar_variable_malContext ctx) {
            
            System.out.println("Error, falta ','. Linea: " + ctx.getStart().getLine());
            error = true;
            declarando = 0;
        }
	@Override public void enterReturno(@NotNull SintacticoParser.ReturnoContext ctx) { }
	@Override public void exitReturno(@NotNull SintacticoParser.ReturnoContext ctx) { 
        
            if(ctx.datos().ID() != null)
            {
                Scope sc = st.currentScope();
                if(sc.resolve(ctx.datos().ID().toString()) != null) 
                    sc.resolve(ctx.datos().ID().toString()).setUsed() ;
            }
        }
        
	@Override public void enterOperacion(@NotNull SintacticoParser.OperacionContext ctx) { }
	@Override public void exitOperacion(@NotNull SintacticoParser.OperacionContext ctx) { }
	@Override public void enterInstruccion(@NotNull SintacticoParser.InstruccionContext ctx) { }
	@Override public void exitInstruccion(@NotNull SintacticoParser.InstruccionContext ctx) { }
	@Override public void enterParametros_funcion_decl(@NotNull SintacticoParser.Parametros_funcion_declContext ctx) { 
            decl_parametros = 1;
        }
	@Override public void exitParametros_funcion_decl(@NotNull SintacticoParser.Parametros_funcion_declContext ctx) {
                    Scope sc ;
                    Symbol s;
                    int i = 0;
                    for (SintacticoParser.VariableContext v : ctx.variable()) {
                       
                        if(i == 0)
                        {
                            sc = st.pushScope();
                            decl_funcion = 1;
                        }
                        else
                        {
                            sc = st.currentScope();
                        }
                       
                       if(v.asignacion() != null)
                       {
                              s = new Symbol(v.ID().toString(), ctx.TIPODEDATO(i).toString(), v.asignacion().datos().getText() );
                              st.addVar(v.ID().toString() + ";" + sc.getGenId());
                       }
                       else
                       {
                              s = new Symbol(v.ID().toString(),ctx.TIPODEDATO(i).toString());
                              st.addVar(v.ID().toString() + ";" + sc.getGenId());
                       }
                       sc.define(s);
                       i++;
                    }        
                    
                    decl_parametros = 0;
        }
        @Override public void enterFaltapuntoycoma(@NotNull SintacticoParser.FaltapuntoycomaContext ctx) { }
	@Override public void exitFaltapuntoycoma(@NotNull SintacticoParser.FaltapuntoycomaContext ctx) { 
            System.out.println("Error, falta ';'.Linea: " + ctx.getStart().getLine());
            error = true;
        }
	@Override public void enterDatos(@NotNull SintacticoParser.DatosContext ctx) { }
	@Override public void exitDatos(@NotNull SintacticoParser.DatosContext ctx) {
            if(declarando == 0  && ctx.ID() != null)
            {   
                if(st.currentScope().resolve(ctx.ID().toString()) == null)
                {
                    System.out.println("Error, variable " + ctx.ID().toString() + " no declarada. Linea " + ctx.getStart().getLine());
                    error = true;
                }
            }
        }
	@Override public void enterPara(@NotNull SintacticoParser.ParaContext ctx) { }
	@Override public void exitPara(@NotNull SintacticoParser.ParaContext ctx) { }
        @Override public void enterFaltaparentesis(@NotNull SintacticoParser.FaltaparentesisContext ctx) { }
	@Override public void exitFaltaparentesis(@NotNull SintacticoParser.FaltaparentesisContext ctx) {
            System.out.println("Error, falta " + (ctx.PARENTESISA() != null ? ")" : "(") + ". Linea " + ctx.getStart().getLine());
            error = true;
        }
        @Override public void enterSi(@NotNull SintacticoParser.SiContext ctx) { }
	@Override public void exitSi(@NotNull SintacticoParser.SiContext ctx) { }
        @Override public void enterSi_entonces(@NotNull SintacticoParser.Si_entoncesContext ctx) { }
	@Override public void exitSi_entonces(@NotNull SintacticoParser.Si_entoncesContext ctx) { }
        @Override public void enterReturno_mal(@NotNull SintacticoParser.Returno_malContext ctx) {}
	@Override public void exitReturno_mal(@NotNull SintacticoParser.Returno_malContext ctx) { 
            System.out.println("Error, falta " + (ctx.datos() == null ? "dato a retornar " : "';' ") + ". Linea " + ctx.getStart().getLine());
            error = true;
        }
	@Override public void enterMientras(@NotNull SintacticoParser.MientrasContext ctx) { }
	@Override public void exitMientras(@NotNull SintacticoParser.MientrasContext ctx) { }
    @Override public void enterFaltapuntoycoma2(@NotNull SintacticoParser.Faltapuntoycoma2Context ctx) { }
	@Override public void exitFaltapuntoycoma2(@NotNull SintacticoParser.Faltapuntoycoma2Context ctx) { 
            System.out.println("Error, falta ';'. Linea: " + ctx.getStart().getLine());
            error = true;
        }
        @Override public void enterFuncion(@NotNull SintacticoParser.FuncionContext ctx) {
            en_funcion = 1;
        }
	@Override public void exitFuncion(@NotNull SintacticoParser.FuncionContext ctx) {         
            Function func;
            if(!st.setDefined(ctx.ID().toString()) && !ctx.ID().toString().equals("main"))
            {
                System.out.println("Error, la funcion " + ctx.ID().toString() + " no se encuentra declarada. Linea " + ctx.getStart().getLine());
                error = true;
            }
            else
                if(ctx.ID().toString().equals("main"))
                {
                    Function main = new Function(ctx.ID().toString(), ctx.TIPODEDATO().toString());
                    st.AddFunction(main);
                    st.setDefined(ctx.ID().toString());
                }
           en_funcion = 0;
        }

	@Override public void enterParametros_funcion(@NotNull SintacticoParser.Parametros_funcionContext ctx) { }
	@Override public void exitParametros_funcion(@NotNull SintacticoParser.Parametros_funcionContext ctx) { }
	@Override public void enterBloque(@NotNull SintacticoParser.BloqueContext ctx) { 
            en_bloque = 1;
            if(decl_funcion == 0){
              st.pushScope();
            }
            else{
                decl_funcion = 0;
            }
        }
	@Override public void exitBloque(@NotNull SintacticoParser.BloqueContext ctx) {            
            en_bloque = 0;
            st.popScope();
        }
	@Override public void enterDeclarar_variables(@NotNull SintacticoParser.Declarar_variablesContext ctx) {
            declarando = 1; 
        }
	@Override public void exitDeclarar_variables(@NotNull SintacticoParser.Declarar_variablesContext ctx) {
            int cant = 0; String type = ctx.TIPODEDATO().getText(); boolean errorTipo = true;
            Scope sc;
            Symbol s = null;
            if(en_funcion == 0)
                sc = st.getScope(1);
            else
                sc = st.currentScope();
            
            for (SintacticoParser.VariableContext v : ctx.variable()) {
                if(sc.resolve(v.ID().toString()) != null)
                {
                    System.out.println("Error, la variable: " + v.ID() + " existe. Linea " + ctx.getStart().getLine());
                    error = true;
                }   
                else
                {
                     if(v.asignacion() != null)
                       {
                           
                           if(v.asignacion().datos()!= null && v.asignacion().datos().ID() != null)
                           {
                                   if(!st.verifType(type, sc.getType(v.asignacion().datos().ID().toString())))
                                   {
                                       System.out.println("Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y la variable " + v.asignacion().datos().ID().toString()
                                       + " es tipo " + sc.getType(v.asignacion().datos().ID().toString()) + ". Linea " + ctx.getStart().getLine());
                                       error = true;
                                   }
                               
                           }
                           else
                           {
                               if(v.asignacion().datos()!= null && (v.asignacion().datos().llamada_funcion() == null && v.asignacion().datos().llamada_funcion_mal() == null))
                               {
                                   
                                   String tipoVar = "";
                                  if(v.asignacion().datos().CARACTER() != null)
                                      tipoVar = "char";
                                  if(v.asignacion().datos().ENTERO() != null)
                                      tipoVar = "int";
                                  if(v.asignacion().datos().FLOTANTE() != null)
                                      tipoVar = "double";
                                  if(v.asignacion().datos().TRUEFALSE() != null)
                                      tipoVar = "bool";
                                  errorTipo = st.verifType(type, tipoVar);
                                  if(errorTipo == false)
                                  {
                                      System.out.println("Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y " + v.asignacion().datos().getText() 
                                                    + " es tipo " + tipoVar + ". Linea " + ctx.getStart().getLine());
                                                    error = true;
                                  }
                               }
                           }
                           if(v.asignacion().operacion() != null)
                           {
                               for(int i = 0; i < v.asignacion().operacion().size(); i++)
                               {
                                   if(v.asignacion().operacion(i).datos(0).ID() != null)
                                   {
                                           if(!st.verifType(type, sc.getType(v.asignacion().operacion(i).datos(0).ID().toString())))
                                                {
                                                    System.out.println("Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y la variable " + v.asignacion().operacion(i).datos(0).ID().toString()
                                                    + " es tipo " + sc.getType(v.asignacion().operacion(i).datos(0).ID().toString())+ ". Linea " + ctx.getStart().getLine());
                                                    error = true;
                                                 }
                                   }
                                   else
                                   {
                                       if(v.asignacion().operacion(i).datos(0).llamada_funcion() == null && v.asignacion().operacion(i).datos(0).llamada_funcion_mal() == null)
                                       {
                                            errorTipo = true;
                                            String tipoVar = "";
                                            if(v.asignacion().operacion(i).datos(0).CARACTER() != null)
                                                tipoVar = "char";
                                            if(v.asignacion().operacion(i).datos(0).ENTERO() != null)
                                                tipoVar = "int";
                                            if(v.asignacion().operacion(i).datos(0).FLOTANTE() != null)
                                                tipoVar = "double";
                                            if(v.asignacion().operacion(i).datos(0).TRUEFALSE() != null)
                                                tipoVar = "bool";
                                            errorTipo = st.verifType(type, tipoVar);
                                            if(errorTipo == false)
                                            {
                                                System.out.println("Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y " + v.asignacion().operacion(i).datos(0).getText() 
                                                              + " es tipo " + tipoVar + ". Linea " + ctx.getStart().getLine());
                                                              error = true;
                                            }
                                       }
                                   }
                                   
                                   
                                   
                                   if(v.asignacion().operacion(i).datos(1) != null && v.asignacion().operacion(i).datos(1).ID() != null)
                                   {
                                      if(!st.verifType(type , sc.getType(v.asignacion().operacion(i).datos(1).ID().toString())))
                                                {
                                                    System.out.println("Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y la variable " + v.asignacion().operacion(i).datos(1).ID().toString()
                                                    + " es tipo " + sc.getType(v.asignacion().operacion(i).datos(1).ID().toString())+ ". Linea " + ctx.getStart().getLine());
                                                    error = true;
                                                }
                                   }
                                   else
                                   {
                                     if(v.asignacion().operacion(i).datos(1) != null && v.asignacion().operacion(i).datos(1).llamada_funcion() == null && v.asignacion().operacion(i).datos(1).llamada_funcion_mal() == null)
                                     {
                                       errorTipo = true;
                                       String tipoVar = "";
                                       if( v.asignacion().operacion(i).datos(1).CARACTER() != null)
                                           tipoVar = "char";
                                       if( v.asignacion().operacion(i).datos(1).ENTERO() != null)
                                           tipoVar = "int";
                                       if( v.asignacion().operacion(i).datos(1).FLOTANTE() != null)
                                           tipoVar = "double";
                                       if(v.asignacion().operacion(i).datos(1).TRUEFALSE() != null)
                                           tipoVar = "bool";
                                       errorTipo = st.verifType(type, tipoVar);
                                       if(errorTipo == false)
                                       {
                                           System.out.println("Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y " +  v.asignacion().operacion(i).datos(1).getText() 
                                                         + " es tipo " + tipoVar + ". Linea " + ctx.getStart().getLine());
                                                         error = true;
                                       }
                                     }
                                   }
                               }
                           }
                           if(errorTipo == true)
                           {
                               s = new Symbol(v.ID().toString(), ctx.TIPODEDATO().toString(), v.asignacion().datos().getText() );
                               st.addVar(v.ID().toString() + ";" + sc.getGenId());
                           }
                        }
                       else
                       {
                              s = new Symbol(v.ID().toString(),ctx.TIPODEDATO().toString());
                              st.addVar(v.ID().toString() + ";" + sc.getGenId());
                       }
                     if(errorTipo == true && s != null)
                        sc.define(s);
                }
                 
            }
            declarando = 0;
        }
        @Override public void enterCodigo(@NotNull SintacticoParser.CodigoContext ctx) { 
            st = new SymbolTable();
        }
	@Override public void exitCodigo(@NotNull SintacticoParser.CodigoContext ctx) { 
           if(!error)
           {
                System.out.println("\n\n\n----------TABLA DE SIMBOLOS----------");
                System.out.println(st.imprimir());
                System.out.println("\n\n----------NO USADAS----------");
                System.out.println(st.notUsed());
           }     
                try {
                BufferedWriter out = new BufferedWriter(new FileWriter("3Direcciones" + hashCode() + ".txt"));
                out.write(aux);
                out.close();
                }
                catch (IOException e)
                {
                    System.out.println("Error al grabar el codigo de 3 direcciones. ");       
                }            
                
           

           
        }
        @Override public void enterSino(@NotNull SintacticoParser.SinoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSino(@NotNull SintacticoParser.SinoContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEstructuras_de_control(@NotNull SintacticoParser.Estructuras_de_controlContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEstructuras_de_control(@NotNull SintacticoParser.Estructuras_de_controlContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaracion(@NotNull SintacticoParser.DeclaracionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaracion(@NotNull SintacticoParser.DeclaracionContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLlamada_funcion(@NotNull SintacticoParser.Llamada_funcionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLlamada_funcion(@NotNull SintacticoParser.Llamada_funcionContext ctx) { 
               if(ctx.ID(0) != null && !st.setUsed(ctx.ID(0).toString())){
                   System.out.println("Error, funcion " + ctx.ID(0).toString() + " no esta declarada o definida. Linea " + ctx.getStart().getLine());
                   error = true;
               }
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFaltaparentesis2(@NotNull SintacticoParser.Faltaparentesis2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFaltaparentesis2(@NotNull SintacticoParser.Faltaparentesis2Context ctx) {
              System.out.println("Error, falta " + (ctx.PARENTESISA() != null ? ")" : "(") + ". Linea " + ctx.getStart().getLine());   
              error = true;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarar_funcion(@NotNull SintacticoParser.Declarar_funcionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarar_funcion(@NotNull SintacticoParser.Declarar_funcionContext ctx) {
            Function func;
            if(ctx.parametros_funcion() != null)
            { 
                func = new Function(ctx.ID().toString(), ctx.TIPODEDATO().toString(),ctx.parametros_funcion().toString());
            }
            else
            {
                func = new Function(ctx.ID().toString(),ctx.TIPODEDATO().toString());
            }
            
            st.AddFunction(func);
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLlamada_funcion_mal(@NotNull SintacticoParser.Llamada_funcion_malContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLlamada_funcion_mal(@NotNull SintacticoParser.Llamada_funcion_malContext ctx) { 
            System.out.println("Error, falta " + (ctx.PARENTESISA() != null ? (ctx.PARENTESISC() != null ? "," : ")") : "(") + ". Linea " + ctx.getStart().getLine());
            error = true;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondicion(@NotNull SintacticoParser.CondicionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondicion(@NotNull SintacticoParser.CondicionContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBloque_mal(@NotNull SintacticoParser.Bloque_malContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBloque_mal(@NotNull SintacticoParser.Bloque_malContext ctx) { 
            System.out.println("Error, falta '}' . Linea " + ctx.getStop().getLine());
            error = true;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariable(@NotNull SintacticoParser.VariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariable(@NotNull SintacticoParser.VariableContext ctx) {
           
             if(ctx.variable_operacion() == null)
               {
                    Scope sc;
                    Symbol s;
                    String type;
                    if(declarando == 0)
                    {
                       if(en_funcion == 0)
                       {
                        sc = st.getScope(1);
                       }
                       else
                       {
                          sc = st.currentScope();
                       }
                       s = sc.resolve(ctx.ID().toString());

                       if(s == null && decl_parametros == 0)
                       {
                          System.out.println("Error, variable " + ctx.ID().toString() + " no declarada. Linea " + ctx.getStart().getLine());
                          error = true;
                       }
                       else
                       {
                           if(s != null){
                               type = sc.getType(ctx.ID().toString());
                               if(ctx.asignacion()!= null)
                               {
                                   s.setValue(ctx.asignacion().getText().replaceFirst(ctx.asignacion().ASIGNACION().toString(), ""));
                                   if(ctx.asignacion().datos()!= null && ctx.asignacion().datos().ID() != null)
                                   {
                                       if(sc.resolve(ctx.asignacion().datos().ID().toString()) != null) 
                                       {
                                           sc.resolve(ctx.asignacion().datos().ID().toString()).setUsed() ;
                                           if(!st.verifType(type, sc.getType(ctx.asignacion().datos().ID().toString())))
                                           {
                                               System.out.println("Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y la variable " + ctx.asignacion().datos().ID().toString()
                                               + " es tipo " + sc.getType(ctx.asignacion().datos().ID().toString()) + ". Linea " + ctx.getStart().getLine());
                                               error = true;
                                           }
                                       }
                                   }
                                   else
                                   {
                                       if(ctx.asignacion().datos()!= null && (ctx.asignacion().datos().llamada_funcion() == null && ctx.asignacion().datos().llamada_funcion_mal() == null))
                                       {
                                           boolean errorTipo = true;
                                           String tipoVar = "";
                                          if(ctx.asignacion().datos().CARACTER() != null)
                                              tipoVar = "char";
                                          if(ctx.asignacion().datos().ENTERO() != null)
                                              tipoVar = "int";
                                          if(ctx.asignacion().datos().FLOTANTE() != null)
                                              tipoVar = "double";
                                          if(ctx.asignacion().datos().TRUEFALSE() != null)
                                              tipoVar = "bool";
                                          errorTipo = st.verifType(type, tipoVar);
                                          if(errorTipo == false)
                                          {
                                              System.out.println("Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y " + ctx.asignacion().datos().getText() 
                                                            + " es tipo " + tipoVar + ". Linea " + ctx.getStart().getLine());
                                                            error = true;
                                          }
                                       }
                                   }
                                   if(ctx.asignacion().operacion() != null)
                                   {
                                       for(int i = 0; i < ctx.asignacion().operacion().size(); i++)
                                       {
                                           if(ctx.asignacion().operacion(i).datos(0).ID() != null)
                                           {
                                               if(sc.resolve(ctx.asignacion().operacion(i).datos(0).ID().toString()) != null) 
                                               {
                                                   sc.resolve(ctx.asignacion().operacion(i).datos(0).ID().toString()).setUsed();
                                                   if(!st.verifType(type, sc.getType(ctx.asignacion().operacion(i).datos(0).ID().toString())))
                                                        {
                                                            System.out.println("Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y la variable " + ctx.asignacion().operacion(i).datos(0).ID().toString()
                                                            + " es tipo " + sc.getType(ctx.asignacion().operacion(i).datos(0).ID().toString())+ ". Linea " + ctx.getStart().getLine());
                                                            error = true;
                                                         }
                                               }
                                               else {
                                                   System.out.println("Error, variable " +ctx.asignacion().operacion(i).datos(0).ID().toString() + " no declarada. Linea " + + ctx.getStart().getLine());
                                                   error = true;
                                               }
                                           }
                                           else
                                           {
                                               if(ctx.asignacion().operacion(i).datos(0).llamada_funcion() == null && ctx.asignacion().operacion(i).datos(0).llamada_funcion_mal() == null)
                                               {
                                                    boolean errorTipo = true;
                                                    String tipoVar = "";
                                                    if(ctx.asignacion().operacion(i).datos(0).CARACTER() != null)
                                                        tipoVar = "char";
                                                    if(ctx.asignacion().operacion(i).datos(0).ENTERO() != null)
                                                        tipoVar = "int";
                                                    if(ctx.asignacion().operacion(i).datos(0).FLOTANTE() != null)
                                                        tipoVar = "double";
                                                    if(ctx.asignacion().operacion(i).datos(0).TRUEFALSE() != null)
                                                        tipoVar = "bool";
                                                    errorTipo = st.verifType(type, tipoVar);
                                                    if(errorTipo == false)
                                                    {
                                                        System.out.println("Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y " + ctx.asignacion().operacion(i).datos(0).getText() 
                                                                      + " es tipo " + tipoVar + ". Linea " + ctx.getStart().getLine());
                                                                      error = true;
                                                    }
                                               }
                                           }



                                           if(ctx.asignacion().operacion(i).datos(1) != null && ctx.asignacion().operacion(i).datos(1).ID() != null)
                                           {
                                              if(sc.resolve(ctx.asignacion().operacion(i).datos(1).ID().toString()) != null) 
                                              {
                                                  sc.resolve(ctx.asignacion().operacion(i).datos(1).ID().toString()).setUsed();
                                                  if(!st.verifType(type , sc.getType(ctx.asignacion().operacion(i).datos(1).ID().toString())))
                                                        {
                                                            System.out.println("Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y la variable " + ctx.asignacion().operacion(i).datos(1).ID().toString()
                                                            + " es tipo " + sc.getType(ctx.asignacion().operacion(i).datos(1).ID().toString())+ ". Linea " + ctx.getStart().getLine());
                                                            error = true;
                                                         }

                                              } 
                                              else {
                                                     System.out.println("Error, variable " +ctx.asignacion().operacion(i).datos(1).ID().toString() + " no declarada. Linea " + ctx.getStart().getLine()  );
                                                     error = true;
                                                    }
                                           }
                                           else
                                           {
                                             if(ctx.asignacion().operacion(i).datos(1) != null && ctx.asignacion().operacion(i).datos(1).llamada_funcion() == null && ctx.asignacion().operacion(i).datos(1).llamada_funcion_mal() == null)
                                             {
                                               boolean errorTipo = true;
                                               String tipoVar = "";
                                               if( ctx.asignacion().operacion(i).datos(1).CARACTER() != null)
                                                   tipoVar = "char";
                                               if( ctx.asignacion().operacion(i).datos(1).ENTERO() != null)
                                                   tipoVar = "int";
                                               if( ctx.asignacion().operacion(i).datos(1).FLOTANTE() != null)
                                                   tipoVar = "double";
                                               if(ctx.asignacion().operacion(i).datos(1).TRUEFALSE() != null)
                                                   tipoVar = "bool";
                                               errorTipo = st.verifType(type, tipoVar);
                                               if(errorTipo == false)
                                               {
                                                   System.out.println("Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y " +  ctx.asignacion().operacion(i).datos(1).getText() 
                                                                 + " es tipo " + tipoVar + ". Linea " + ctx.getStart().getLine());
                                                                 error = true;
                                               }
                                             }
                                           }
                                       }
                                   }
                                }
                           }
                       }
                    }
                    
                  
                    
                    
                    
                    
                    
                 }
             
             
         }
        


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) {
        
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
        
        @Override public void enterOperacion_matematica(@NotNull SintacticoParser.Operacion_matematicaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperacion_matematica(@NotNull SintacticoParser.Operacion_matematicaContext ctx) { }
	@Override public void enterVariable_operacion(@NotNull SintacticoParser.Variable_operacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
        String aux = "";
	@Override public void exitVariable_operacion(@NotNull SintacticoParser.Variable_operacionContext ctx) {
            aux += "\n" + ctx.getText() + "\n" ;
            String variable = "" ;
            String operacion3Direcciones = ctx.getText();
            String codTresDireciones = ctx.ID().toString() + ctx.ASIGNACION().toString();
            //Verificar parentesis
            if(operacion3Direcciones.contains("("))
            {
                int cantParentesisA = operacion3Direcciones.length() - operacion3Direcciones.replace("(","").length(),
                         cantParentesisC = operacion3Direcciones.length() - operacion3Direcciones.replace(")","").length();
                          
                if(cantParentesisA != cantParentesisC )
                     {
                         if(cantParentesisA > cantParentesisC)
                            System.out.println("Error, falta ')'. Linea " + ctx.start.getLine());
                         else
                             System.out.println("Error, falta '('. Linea " + ctx.start.getLine());
                         error = true;
                     }
                else
                {
                    
                }
                
            }
           
            
            int x = 1;
            for(int i = 0; i < ctx.operacion_matematica().size(); i ++)
            {
               if(ctx.operacion_matematica(i).datos_opMatematica().size() > 2)
                    {
                        for( int j = 0; j < ctx.operacion_matematica(i).datos_opMatematica().size() ; j = j+2)
                        {
                           
                            String aux2 = "t" + x + " = " + ctx.operacion_matematica(i).datos_opMatematica(j).getText() + " " + ctx.operacion_matematica(i).OPMATEMATICAS(j/2).getText() + " " ;
                            
                            if(ctx.operacion_matematica(i).datos_opMatematica(j + 1) != null) 
                                aux2 += ctx.operacion_matematica(i).datos_opMatematica(j + 1).getText();
                                               
                            if(j > 0)
                            {
                                aux2 = "t" + x + " = " + " t" + (x-1) + " " + ctx.operacion_matematica(i).OPMATEMATICAS(j/2).getText() + " " + ctx.operacion_matematica(i).datos_opMatematica(j).getText();
                            }
                            aux +=  "\n" + aux2 + "\n";
                            x++;
                        }
                    }
      
                    if(ctx.operacion_matematica(i).datos_opMatematica().size() == 2)
                    {
                        
                        String aux2 = "t" + x + " = " + ctx.operacion_matematica(i).datos_opMatematica(0).getText() + " " + ctx.operacion_matematica(i).OPMATEMATICAS(0).getText() + " " + ctx.operacion_matematica(i).datos_opMatematica(1).getText();
                        aux += "\n" + aux2 + "\n";
                        x++;
                    }
                   
                    if(ctx.operacion_matematica(i).datos_opMatematica().size() == 1 && i == 0)
                    {
                       //String aux2 = "t" + x + " = " + ctx.operacion_matematica(i).datos_opMatematica(0).getText() ;//+ " " + ctx.operacion_matematica(i).OPMATEMATICAS(0).getText() + " " + ctx.operacion_matematica(i).datos_opMatematica(1).getText();
                        variable = ctx.operacion_matematica(i).datos_opMatematica(0).getText();
                        
                    }
                    
             //   } 
               
                   if(ctx.operacion_matematica(i).operacion_matematica() != null)
                    if(ctx.operacion_matematica(i).operacion_matematica().size() > 0)
                    {
                        
                        for(int z = 0; z <ctx.operacion_matematica(i).operacion_matematica().size(); z++ )
                        {   for(int y = 0; y <= ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica().size() ; y = y + 2)
                            {
                                
                                if(variable == "")
                                   aux += "\n" + "t" + x + " = t" + (x-1) + " " + ctx.operacion_matematica(i).operacion_matematica(z).OPMATEMATICAS(0).getText() + " " 
                                           + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(0).getText() + "\n";
                                else
                                {
                                    if(ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(y+1) != null)
                                    {//aux += "\n" + "t" + x + " = " + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(y).getText() + " " + ctx.operacion_matematica(i).operacion_matematica(z).OPMATEMATICAS(y/2).getText() + " " + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(y+1).getText() + "\n";
                                         if(y > 0) 
                                         { System.out.println("y > 0" + y + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica().size()); 
                                            aux += "\n" + "t" + x + " = " + "t" +(x-1) + " " + ctx.operacion_matematica(i).operacion_matematica(z).OPMATEMATICAS(y/2).getText() + " " 
                                                    + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(y).getText() + "\n";
                                         }
                                         else
                                         {
                                             
                                           aux += "\n" + "t" + x + " = " + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(y).getText() + " " + ctx.operacion_matematica(i).operacion_matematica(z).OPMATEMATICAS(y/2).getText() 
                                                   + " " + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(y+1).getText() + "\n";
                                         }
                                    }
                                    else
                                    {
                                       
                                        if(ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica().size() != 2)
                                        {
                                            if(ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica().size() % 2 == 0)
                                             {
                                                    aux += "\n" + "t" + (x) + " = t" + (x-1) + " " + ctx.operacion_matematica(i).operacion_matematica(z).OPMATEMATICAS(y/2).getText() + " " 
                                                         + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(y-1).getText()+ "\n";
                                             }
                                            else
                                            {
                                                aux += "\n" + "t" + (x) + " = t" + (x-1) + " " + ctx.operacion_matematica(i).operacion_matematica(z).OPMATEMATICAS(y/2).getText() + " " 
                                                        + ctx.operacion_matematica(i).operacion_matematica(z).datos_opMatematica(y).getText()+ "\n"; 
                                            }
                                        }
                                        
                                    }
                                }
                                x++;
                            }
                        
                            
                        }
  
                    }
                    
            }
            int cantOperaciones = ctx.operacion_matematica(0).OPMATEMATICAS().size();
            //System.out.println("x " + x + " cant " + cantOperaciones+ " " + ctx.operacion_matematica().size());
          
            if( cantOperaciones == 1)
            {
               if(variable != "")
               {
                   if(x > 2)
                   {
                      aux += "\nt" + (x) + " = " + variable + " " + ctx.operacion_matematica(0).OPMATEMATICAS(0).getText() + " t" + (x-1) + "\n"; 
                      aux += "\nx = t" + (x) + "\n"; 
                   }
                   else 
                   if (x == 2)
                   {
                        aux += "\nt" + (x) + " = " + variable + " " + ctx.operacion_matematica(0).OPMATEMATICAS(0).getText() + " t" + (x-1) + "\n"; 
                        aux += "\nx = t" + x + "\n"; 
                   }
               }
               else
               {
                  if(ctx.operacion_matematica().size() > 1)
                  {  
                      aux += "\n" + ctx.ID().getText() + " = " + " t" + (x-2) + " " + ctx.operacion_matematica(0).OPMATEMATICAS(cantOperaciones-1).getText() + " t" + (x-1);
                  }
                   if(ctx.operacion_matematica().size() == 1)
                   {
                       aux += "\n" + ctx.ID().getText() + " = "+ " t" + (x-1);
                   }
               }
            }
            else
            {
                 aux += "\n" + ctx.ID().getText() + " = "+ " t" + (x-1);
              
              /*
                
               
                else
                    if(x > 2 && ctx.operacion_matematica().size() > 1)
                    { aux += "\n" + ctx.ID().getText() + " = " + " t" + (x-2) + " " + ctx.operacion_matematica(0).OPMATEMATICAS(cantOperaciones-1).getText() + " t" + (x-1);
                    System.out.println("entra");
                    }
                     else if(x > 2 && ctx.operacion_matematica().size() == 1)
                              aux += "\n" + ctx.ID().getText() + " = " + " t" + (x-1);
                else if (x == 2 && variable == "")
                    aux += "\n" + ctx.ID().getText() + " = " + " t" + (x-1) + " " + ctx.operacion_matematica(0).OPMATEMATICAS(cantOperaciones-1).getText() + " t" + (x);
                else if (x == 2 && variable != "")
                {
                    
                    aux += "\nt" + (x) + " = " + " t" + (x-2) + " " + ctx.operacion_matematica(0).operacion_matematica(0).OPMATEMATICAS(cantOperaciones-1).getText() + " t" + (x-1) + "\n";
                    aux += "\n" + ctx.ID().getText() + " = " + variable + " " + ctx.operacion_matematica(0).OPMATEMATICAS(0).toString() + " t" + (x); 
                }
                else
                    aux += "\n" + ctx.ID().getText() + " = " + " t" + (x-1) ;
            }
            else
            {
                if(x >= 2)
                    aux += "\n" + ctx.ID().getText() + " = " + " t" + (x-2) + " " + ctx.operacion_matematica(0).OPMATEMATICAS(cantOperaciones - 1).getText() + " t" + (x-1);
                else
                    aux += "\n" + ctx.ID().getText() + " = " + " t" + (x-1) ;
            }
            
            */
            }
           aux+= "\n------------------------"; 
            
        }
	@Override public void enterDatos_opMatematica(@NotNull SintacticoParser.Datos_opMatematicaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDatos_opMatematica(@NotNull SintacticoParser.Datos_opMatematicaContext ctx) { }
}