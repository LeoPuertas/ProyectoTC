// Generated from C:\Users\PC\Desktop\PEF\JavaApplication5\src\ar\edu\u005Cubp\tc\Final\Sintactico.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc.Final;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SintacticoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SintacticoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SintacticoParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(@NotNull SintacticoParser.InstruccionesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#parametros_funcion_mal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_funcion_mal(@NotNull SintacticoParser.Parametros_funcion_malContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(@NotNull SintacticoParser.AsignacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#declarar_variable_mal_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_variable_mal_tipo(@NotNull SintacticoParser.Declarar_variable_mal_tipoContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#declarar_variable_mal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_variable_mal(@NotNull SintacticoParser.Declarar_variable_malContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#returno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturno(@NotNull SintacticoParser.ReturnoContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(@NotNull SintacticoParser.OperacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(@NotNull SintacticoParser.InstruccionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#parametros_funcion_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_funcion_decl(@NotNull SintacticoParser.Parametros_funcion_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#operacion_matematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_matematica(@NotNull SintacticoParser.Operacion_matematicaContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#faltapuntoycoma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltapuntoycoma(@NotNull SintacticoParser.FaltapuntoycomaContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#datos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatos(@NotNull SintacticoParser.DatosContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(@NotNull SintacticoParser.ParaContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#faltaparentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaparentesis(@NotNull SintacticoParser.FaltaparentesisContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#variable_operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_operacion(@NotNull SintacticoParser.Variable_operacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(@NotNull SintacticoParser.SiContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#si_entonces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi_entonces(@NotNull SintacticoParser.Si_entoncesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#returno_mal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturno_mal(@NotNull SintacticoParser.Returno_malContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(@NotNull SintacticoParser.MientrasContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#faltapuntoycoma2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltapuntoycoma2(@NotNull SintacticoParser.Faltapuntoycoma2Context ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(@NotNull SintacticoParser.FuncionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#parametros_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_funcion(@NotNull SintacticoParser.Parametros_funcionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(@NotNull SintacticoParser.BloqueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#declarar_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_variables(@NotNull SintacticoParser.Declarar_variablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(@NotNull SintacticoParser.CodigoContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(@NotNull SintacticoParser.SinoContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#estructuras_de_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuras_de_control(@NotNull SintacticoParser.Estructuras_de_controlContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(@NotNull SintacticoParser.DeclaracionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(@NotNull SintacticoParser.Llamada_funcionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#faltaparentesis2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltaparentesis2(@NotNull SintacticoParser.Faltaparentesis2Context ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#datos_opMatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatos_opMatematica(@NotNull SintacticoParser.Datos_opMatematicaContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#declarar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_funcion(@NotNull SintacticoParser.Declarar_funcionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#llamada_funcion_mal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion_mal(@NotNull SintacticoParser.Llamada_funcion_malContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(@NotNull SintacticoParser.CondicionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#bloque_mal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_mal(@NotNull SintacticoParser.Bloque_malContext ctx);

	/**
	 * Visit a parse tree produced by {@link SintacticoParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull SintacticoParser.VariableContext ctx);
}