// Generated from C:\Users\PC\Desktop\PEF\JavaApplication5\src\javaapplication5\Sintactico.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc.Final;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SintacticoParser}.
 */
public interface SintacticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SintacticoParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(@NotNull SintacticoParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(@NotNull SintacticoParser.InstruccionesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#parametros_funcion_mal}.
	 * @param ctx the parse tree
	 */
	void enterParametros_funcion_mal(@NotNull SintacticoParser.Parametros_funcion_malContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#parametros_funcion_mal}.
	 * @param ctx the parse tree
	 */
	void exitParametros_funcion_mal(@NotNull SintacticoParser.Parametros_funcion_malContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(@NotNull SintacticoParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(@NotNull SintacticoParser.AsignacionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#declarar_variable_mal_tipo}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_variable_mal_tipo(@NotNull SintacticoParser.Declarar_variable_mal_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#declarar_variable_mal_tipo}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_variable_mal_tipo(@NotNull SintacticoParser.Declarar_variable_mal_tipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#declarar_variable_mal}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_variable_mal(@NotNull SintacticoParser.Declarar_variable_malContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#declarar_variable_mal}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_variable_mal(@NotNull SintacticoParser.Declarar_variable_malContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#returno}.
	 * @param ctx the parse tree
	 */
	void enterReturno(@NotNull SintacticoParser.ReturnoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#returno}.
	 * @param ctx the parse tree
	 */
	void exitReturno(@NotNull SintacticoParser.ReturnoContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(@NotNull SintacticoParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(@NotNull SintacticoParser.OperacionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(@NotNull SintacticoParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(@NotNull SintacticoParser.InstruccionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#parametros_funcion_decl}.
	 * @param ctx the parse tree
	 */
	void enterParametros_funcion_decl(@NotNull SintacticoParser.Parametros_funcion_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#parametros_funcion_decl}.
	 * @param ctx the parse tree
	 */
	void exitParametros_funcion_decl(@NotNull SintacticoParser.Parametros_funcion_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#faltapuntoycoma}.
	 * @param ctx the parse tree
	 */
	void enterFaltapuntoycoma(@NotNull SintacticoParser.FaltapuntoycomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#faltapuntoycoma}.
	 * @param ctx the parse tree
	 */
	void exitFaltapuntoycoma(@NotNull SintacticoParser.FaltapuntoycomaContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#datos}.
	 * @param ctx the parse tree
	 */
	void enterDatos(@NotNull SintacticoParser.DatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#datos}.
	 * @param ctx the parse tree
	 */
	void exitDatos(@NotNull SintacticoParser.DatosContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(@NotNull SintacticoParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(@NotNull SintacticoParser.ParaContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#faltaparentesis}.
	 * @param ctx the parse tree
	 */
	void enterFaltaparentesis(@NotNull SintacticoParser.FaltaparentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#faltaparentesis}.
	 * @param ctx the parse tree
	 */
	void exitFaltaparentesis(@NotNull SintacticoParser.FaltaparentesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(@NotNull SintacticoParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(@NotNull SintacticoParser.SiContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#si_entonces}.
	 * @param ctx the parse tree
	 */
	void enterSi_entonces(@NotNull SintacticoParser.Si_entoncesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#si_entonces}.
	 * @param ctx the parse tree
	 */
	void exitSi_entonces(@NotNull SintacticoParser.Si_entoncesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#returno_mal}.
	 * @param ctx the parse tree
	 */
	void enterReturno_mal(@NotNull SintacticoParser.Returno_malContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#returno_mal}.
	 * @param ctx the parse tree
	 */
	void exitReturno_mal(@NotNull SintacticoParser.Returno_malContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(@NotNull SintacticoParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(@NotNull SintacticoParser.MientrasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#faltapuntoycoma2}.
	 * @param ctx the parse tree
	 */
	void enterFaltapuntoycoma2(@NotNull SintacticoParser.Faltapuntoycoma2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#faltapuntoycoma2}.
	 * @param ctx the parse tree
	 */
	void exitFaltapuntoycoma2(@NotNull SintacticoParser.Faltapuntoycoma2Context ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(@NotNull SintacticoParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(@NotNull SintacticoParser.FuncionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void enterParametros_funcion(@NotNull SintacticoParser.Parametros_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void exitParametros_funcion(@NotNull SintacticoParser.Parametros_funcionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(@NotNull SintacticoParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(@NotNull SintacticoParser.BloqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#declarar_variables}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_variables(@NotNull SintacticoParser.Declarar_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#declarar_variables}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_variables(@NotNull SintacticoParser.Declarar_variablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(@NotNull SintacticoParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(@NotNull SintacticoParser.CodigoContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(@NotNull SintacticoParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(@NotNull SintacticoParser.SinoContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#estructuras_de_control}.
	 * @param ctx the parse tree
	 */
	void enterEstructuras_de_control(@NotNull SintacticoParser.Estructuras_de_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#estructuras_de_control}.
	 * @param ctx the parse tree
	 */
	void exitEstructuras_de_control(@NotNull SintacticoParser.Estructuras_de_controlContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(@NotNull SintacticoParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(@NotNull SintacticoParser.DeclaracionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(@NotNull SintacticoParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(@NotNull SintacticoParser.Llamada_funcionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#faltaparentesis2}.
	 * @param ctx the parse tree
	 */
	void enterFaltaparentesis2(@NotNull SintacticoParser.Faltaparentesis2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#faltaparentesis2}.
	 * @param ctx the parse tree
	 */
	void exitFaltaparentesis2(@NotNull SintacticoParser.Faltaparentesis2Context ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#declarar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_funcion(@NotNull SintacticoParser.Declarar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#declarar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_funcion(@NotNull SintacticoParser.Declarar_funcionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#llamada_funcion_mal}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion_mal(@NotNull SintacticoParser.Llamada_funcion_malContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#llamada_funcion_mal}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion_mal(@NotNull SintacticoParser.Llamada_funcion_malContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(@NotNull SintacticoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(@NotNull SintacticoParser.CondicionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#bloque_mal}.
	 * @param ctx the parse tree
	 */
	void enterBloque_mal(@NotNull SintacticoParser.Bloque_malContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#bloque_mal}.
	 * @param ctx the parse tree
	 */
	void exitBloque_mal(@NotNull SintacticoParser.Bloque_malContext ctx);

	/**
	 * Enter a parse tree produced by {@link SintacticoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull SintacticoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintacticoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull SintacticoParser.VariableContext ctx);
}