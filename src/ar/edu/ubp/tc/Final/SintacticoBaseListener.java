// Generated from C:\Users\PC\Desktop\PEF\JavaApplication5\src\javaapplication5\Sintactico.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc.Final;

import ar.edu.ubp.tc.tabla.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link SintacticoListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class SintacticoBaseListener implements SintacticoListener {
    
        SymbolTable st ;
         int decl_funcion = 0;
         int en_funcion = 0;
         int en_bloque = 0;
         int declarando = 0;
         boolean error = false;
    
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInstrucciones(@NotNull SintacticoParser.InstruccionesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstrucciones(@NotNull SintacticoParser.InstruccionesContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParametros_funcion_mal(@NotNull SintacticoParser.Parametros_funcion_malContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParametros_funcion_mal(@NotNull SintacticoParser.Parametros_funcion_malContext ctx) { 
            System.out.println("Error, parametros funcion. Linea : " + ctx.getStart().getLine());
            error = true;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAsignacion(@NotNull SintacticoParser.AsignacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAsignacion(@NotNull SintacticoParser.AsignacionContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarar_variable_mal_tipo(@NotNull SintacticoParser.Declarar_variable_mal_tipoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarar_variable_mal_tipo(@NotNull SintacticoParser.Declarar_variable_mal_tipoContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarar_variable_mal(@NotNull SintacticoParser.Declarar_variable_malContext ctx) { 
            declarando = 1;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarar_variable_mal(@NotNull SintacticoParser.Declarar_variable_malContext ctx) {
            
            System.out.println("Error, falta ','. Linea: " + ctx.getStart().getLine());
            error = true;
            declarando = 0;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturno(@NotNull SintacticoParser.ReturnoContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturno(@NotNull SintacticoParser.ReturnoContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperacion(@NotNull SintacticoParser.OperacionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperacion(@NotNull SintacticoParser.OperacionContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInstruccion(@NotNull SintacticoParser.InstruccionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstruccion(@NotNull SintacticoParser.InstruccionContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
        int decl_parametros = 0;
	@Override public void enterParametros_funcion_decl(@NotNull SintacticoParser.Parametros_funcion_declContext ctx) { 
            decl_parametros = 1;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
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

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFaltapuntoycoma(@NotNull SintacticoParser.FaltapuntoycomaContext ctx) {
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFaltapuntoycoma(@NotNull SintacticoParser.FaltapuntoycomaContext ctx) { 
            System.out.println("Error, falta ';'.Linea: " + ctx.getStart().getLine());
            error = true;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDatos(@NotNull SintacticoParser.DatosContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDatos(@NotNull SintacticoParser.DatosContext ctx) {
            if(declarando == 0  && ctx.ID() != null){
               
                if(st.currentScope().resolve(ctx.ID().toString()) != null)
                {
                  
                }
                else
                {
                    System.out.println("Error, variable " + ctx.ID().toString() + " no declarada. Linea " + ctx.getStart().getLine());
                    error = true;
                }
            }
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPara(@NotNull SintacticoParser.ParaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPara(@NotNull SintacticoParser.ParaContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFaltaparentesis(@NotNull SintacticoParser.FaltaparentesisContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFaltaparentesis(@NotNull SintacticoParser.FaltaparentesisContext ctx) {
            System.out.println("Error, falta " + (ctx.PARENTESISA() != null ? ")" : "(") + ". Linea " + ctx.getStart().getLine());
            error = true;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSi(@NotNull SintacticoParser.SiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSi(@NotNull SintacticoParser.SiContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSi_entonces(@NotNull SintacticoParser.Si_entoncesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSi_entonces(@NotNull SintacticoParser.Si_entoncesContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturno_mal(@NotNull SintacticoParser.Returno_malContext ctx) { 
            
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturno_mal(@NotNull SintacticoParser.Returno_malContext ctx) { 
            System.out.println("Error, falta " + (ctx.datos() != null ? "dato a retornar " : "';' ") + ". Linea " + ctx.getStart().getLine());
            error = true;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMientras(@NotNull SintacticoParser.MientrasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMientras(@NotNull SintacticoParser.MientrasContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFaltapuntoycoma2(@NotNull SintacticoParser.Faltapuntoycoma2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFaltapuntoycoma2(@NotNull SintacticoParser.Faltapuntoycoma2Context ctx) { 
            System.out.println("Error, falta ';'. Linea: " + ctx.getStart().getLine());
            error = true;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFuncion(@NotNull SintacticoParser.FuncionContext ctx) {
            en_funcion = 1;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
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
            
           /* if(ctx.parametros_funcion_decl() != null)
            { 
                func = new Function(ctx.ID().toString(), ctx.TIPODEDATO().toString(),ctx.parametros_funcion_decl().toString());
            }
            else
            {
                func = new Function(ctx.ID().toString(),ctx.TIPODEDATO().toString());
            }
            
            st.AddFunction(func);        
           */
           en_funcion = 0;
           //st.popScope();
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParametros_funcion(@NotNull SintacticoParser.Parametros_funcionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParametros_funcion(@NotNull SintacticoParser.Parametros_funcionContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBloque(@NotNull SintacticoParser.BloqueContext ctx) { 
            en_bloque = 1;
            if(decl_funcion == 0){
              st.pushScope();
            }
            else{
                decl_funcion = 0;
            }
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBloque(@NotNull SintacticoParser.BloqueContext ctx) {
            
            
            en_bloque = 0;
            st.popScope();
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarar_variables(@NotNull SintacticoParser.Declarar_variablesContext ctx) {
        declarando = 1; 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
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
                                       System.out.println("1Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y la variable " + v.asignacion().datos().ID().toString()
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
                                      System.out.println("xxxxxx4Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y " + v.asignacion().datos().getText() 
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
                                                    System.out.println("xxxxx5Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y la variable " + v.asignacion().operacion(i).datos(0).ID().toString()
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
                                                System.out.println("xxxxxx6Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y " + v.asignacion().operacion(i).datos(0).getText() 
                                                              + " es tipo " + tipoVar + ". Linea " + ctx.getStart().getLine());
                                                              error = true;
                                            }
                                       }
                                   }
                                   
                                   
                                   
                                   if(v.asignacion().operacion(i).datos(1) != null && v.asignacion().operacion(i).datos(1).ID() != null)
                                   {
                                      if(!st.verifType(type , sc.getType(v.asignacion().operacion(i).datos(1).ID().toString())))
                                                {
                                                    System.out.println("3Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y la variable " + v.asignacion().operacion(i).datos(1).ID().toString()
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
                                           System.out.println("xxxx7Error, tipos de datos incompatibles,  la variable " + v.ID().toString() +" es tipo " + type + " y " +  v.asignacion().operacion(i).datos(1).getText() 
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

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCodigo(@NotNull SintacticoParser.CodigoContext ctx) { 
            st = new SymbolTable();
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCodigo(@NotNull SintacticoParser.CodigoContext ctx) { 
           if(!error)
           {
                System.out.println("\n\n\n----------TABLA DE SIMBOLOS----------");
                System.out.println(st.imprimir());
                System.out.println("\n\n----------NO USADAS----------");
                System.out.println(st.notUsed());
                
           }

           
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
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
                                               System.out.println("1Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y la variable " + ctx.asignacion().datos().ID().toString()
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
                                              System.out.println("xxxxx1Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y " + ctx.asignacion().datos().getText() 
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
                                                            System.out.println("2Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y la variable " + ctx.asignacion().operacion(i).datos(0).ID().toString()
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
                                                        System.out.println("xxxxx2Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y " + ctx.asignacion().operacion(i).datos(0).getText() 
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
                                                            System.out.println("3Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y la variable " + ctx.asignacion().operacion(i).datos(1).ID().toString()
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
                                                   System.out.println("xxxxx3Error, tipos de datos incompatibles,  la variable " + ctx.ID().toString() +" es tipo " + type + " y " +  ctx.asignacion().operacion(i).datos(1).getText() 
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
             else
                 {
                     String operacion = ctx.variable_operacion().getText();
                     int cantParentesisA = operacion.length() - operacion.replace("(","").length(),
                         cantParentesisC = operacion.length() - operacion.replace(")","").length();
                     
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
                         //Codigo3Direcciones
                         //Ver si se puede hacer aca utilizando las operaciones_matematicas del g4
                         //Sino funcion hacer funcion en SymbolTable que reciba operacion y divida en operadores matematicos, teniendo en cuenta prioridad 
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
	@Override public void exitVariable_operacion(@NotNull SintacticoParser.Variable_operacionContext ctx) { }
	@Override public void enterDatos_opMatematica(@NotNull SintacticoParser.Datos_opMatematicaContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDatos_opMatematica(@NotNull SintacticoParser.Datos_opMatematicaContext ctx) { }
}