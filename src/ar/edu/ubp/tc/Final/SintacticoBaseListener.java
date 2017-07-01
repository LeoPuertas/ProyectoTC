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
                       }
                       else
                       {
                              s = new Symbol(v.ID().toString(),ctx.TIPODEDATO(i).toString());
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
            int cant = 0; String tipo; 
            Scope sc;
            Symbol s;
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
                              s = new Symbol(v.ID().toString(), ctx.TIPODEDATO().toString(), v.asignacion().datos().getText() );
                       }
                       else
                       {
                              s = new Symbol(v.ID().toString(),ctx.TIPODEDATO().toString());
                       }
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
           if(error)
           {
                System.out.println("-------------------");
                System.out.println(st.imprimir());
                System.out.println("------------------------------------------------------");
                System.out.println(st.toString());
                
                
           }
           System.out.println("------dasdasd-----------------------------------------");
           System.out.println(st.varNotUsed());
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
                   System.out.println("Error, funcion " + ctx.ID(0).toString() + " no esta declarada. Linea " + ctx.getStart().getLine());
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
            Scope sc;
            Symbol s;
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
                       if(ctx.asignacion()!= null)
                       {
                           s.setValue(ctx.asignacion().getText().replaceFirst(ctx.asignacion().ASIGNACION().toString(), ""));
                           if(ctx.asignacion().datos()!= null && ctx.asignacion().datos().ID() != null)
                           {
                               if(sc.resolve(ctx.asignacion().datos().ID().toString()) != null) sc.resolve(ctx.asignacion().datos().ID().toString()).setUsed() ;
                           }
                           if(ctx.asignacion().operacion() != null)
                           {
                               for(int i = 0; i < ctx.asignacion().operacion().size(); i++)
                               {
                                   if(ctx.asignacion().operacion(i).datos(0).ID() != null)
                                   {
                                       if(sc.resolve(ctx.asignacion().operacion(i).datos(0).ID().toString()) != null) sc.resolve(ctx.asignacion().operacion(i).datos(0).ID().toString()).setUsed();
                                       else System.out.println("Error, variable " +ctx.asignacion().operacion(i).datos(0).ID().toString() + " no declarada. Linea " + + ctx.getStart().getLine());
                                   }
                                   if(ctx.asignacion().operacion(i).datos(1) != null && ctx.asignacion().operacion(i).datos(1).ID() != null)
                                   {
                                      if(sc.resolve(ctx.asignacion().operacion(i).datos(1).ID().toString()) != null) sc.resolve(ctx.asignacion().operacion(i).datos(1).ID().toString()).setUsed(); 
                                      else System.out.println("Error, variable " +ctx.asignacion().operacion(i).datos(1).ID().toString() + " no declarada. Linea " + ctx.getStart().getLine()  );
                                   }
                               }
                           }
                        }
                   }
               }
            }
               
               /*if(ctx.asignacion() != null && ctx.asignacion().operacion() != null)
               {
                for(int i = 0; i < ctx.asignacion().operacion().size(); i++)
                {
                    for(int j = 0; j < ctx.asignacion().operacion(i).datos().size(); j++)
                    {  
                        if(ctx.asignacion().operacion(i).datos(j).ID() != null)
                        { 
                         s = sc.resolve(ctx.asignacion().operacion(i).datos(j).ID().toString());
                         if(s == null)
                         {
                             System.out.println("Error, variable" + ctx.asignacion().operacion(i).datos(j).ID().toString() + " no declarada");
                             error = true;
                         }
                        }
                    }
                }
               }
               
               else{
                   if(ctx.asignacion().datos() != null && ctx.asignacion().datos().ID() != null)
                   {
                     s = sc.resolve(ctx.asignacion().datos().ID().toString());
                         if(s == null)
                         {
                             System.out.println("Error, variable" + ctx.asignacion().datos().ID().toString() + " no declarada");
                             error = true;
                         }
                        }
                   }
               }
            else
            {
                System.out.println("Entraaa" + ctx.getStart().getLine());
            }*/
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
}