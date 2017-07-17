// Generated from C:\Users\PC\Desktop\PEF\JavaApplication5\src\ar\edu\u005Cubp\tc\Final\Sintactico.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc.Final;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SintacticoParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENTERO=1, FLOTANTE=2, TIPODEDATO=3, TIPO_INT=4, TIPO_FLOAT=5, TIPO_DOUBLE=6, 
		TIPO_BOOL=7, TIPO_CHAR=8, CARACTER=9, CADENA=10, PARA=11, SI=12, MIENTRAS=13, 
		HACER=14, SINO=15, SWITC=16, CASO=17, RETURNO=18, ID=19, OPLOGICAS=20, 
		COMPARACIONES=21, OPMATEMATICAS=22, ASIGNACION=23, PUNTOYCOMA=24, COMA=25, 
		CORCHETEA=26, CORCHETEC=27, PARENTESISA=28, PARENTESISC=29, LLAVEA=30, 
		LLAVEC=31, VALOR=32, TRUEFALSE=33, WS=34;
	public static final String[] tokenNames = {
		"<INVALID>", "ENTERO", "FLOTANTE", "TIPODEDATO", "'int'", "'float'", "'double'", 
		"'bool'", "'char'", "CARACTER", "CADENA", "'for'", "'if'", "'while'", 
		"'do'", "'else'", "'switch'", "'case'", "'return'", "ID", "OPLOGICAS", 
		"COMPARACIONES", "OPMATEMATICAS", "ASIGNACION", "';'", "','", "'['", "']'", 
		"'('", "')'", "'{'", "'}'", "VALOR", "TRUEFALSE", "WS"
	};
	public static final int
		RULE_codigo = 0, RULE_instrucciones = 1, RULE_declaracion = 2, RULE_instruccion = 3, 
		RULE_faltapuntoycoma = 4, RULE_faltapuntoycoma2 = 5, RULE_faltaparentesis = 6, 
		RULE_faltaparentesis2 = 7, RULE_datos = 8, RULE_operacion = 9, RULE_datos_opMatematica = 10, 
		RULE_variable_operacion = 11, RULE_operacion_matematica = 12, RULE_asignacion = 13, 
		RULE_variable = 14, RULE_parametros_funcion = 15, RULE_parametros_funcion_mal = 16, 
		RULE_declarar_variables = 17, RULE_declarar_funcion = 18, RULE_declarar_variable_mal = 19, 
		RULE_declarar_variable_mal_tipo = 20, RULE_parametros_funcion_decl = 21, 
		RULE_funcion = 22, RULE_llamada_funcion = 23, RULE_llamada_funcion_mal = 24, 
		RULE_bloque = 25, RULE_bloque_mal = 26, RULE_returno = 27, RULE_returno_mal = 28, 
		RULE_condicion = 29, RULE_estructuras_de_control = 30, RULE_si = 31, RULE_mientras = 32, 
		RULE_para = 33, RULE_sino = 34, RULE_si_entonces = 35;
	public static final String[] ruleNames = {
		"codigo", "instrucciones", "declaracion", "instruccion", "faltapuntoycoma", 
		"faltapuntoycoma2", "faltaparentesis", "faltaparentesis2", "datos", "operacion", 
		"datos_opMatematica", "variable_operacion", "operacion_matematica", "asignacion", 
		"variable", "parametros_funcion", "parametros_funcion_mal", "declarar_variables", 
		"declarar_funcion", "declarar_variable_mal", "declarar_variable_mal_tipo", 
		"parametros_funcion_decl", "funcion", "llamada_funcion", "llamada_funcion_mal", 
		"bloque", "bloque_mal", "returno", "returno_mal", "condicion", "estructuras_de_control", 
		"si", "mientras", "para", "sino", "si_entonces"
	};

	@Override
	public String getGrammarFileName() { return "Sintactico.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SintacticoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodigoContext extends ParserRuleContext {
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72); instrucciones();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TIPODEDATO || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); declaracion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Declarar_variablesContext declarar_variables() {
			return getRuleContext(Declarar_variablesContext.class,0);
		}
		public FaltaparentesisContext faltaparentesis() {
			return getRuleContext(FaltaparentesisContext.class,0);
		}
		public Declarar_funcionContext declarar_funcion() {
			return getRuleContext(Declarar_funcionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(SintacticoParser.PUNTOYCOMA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FaltapuntoycomaContext faltapuntoycoma() {
			return getRuleContext(FaltapuntoycomaContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); funcion();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(80); declarar_variables();
					}
					break;

				case 2:
					{
					setState(81); declarar_funcion();
					}
					break;

				case 3:
					{
					setState(82); variable();
					}
					break;
				}
				setState(85); match(PUNTOYCOMA);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); faltapuntoycoma();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88); faltaparentesis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public Declarar_variablesContext declarar_variables() {
			return getRuleContext(Declarar_variablesContext.class,0);
		}
		public Faltapuntoycoma2Context faltapuntoycoma2() {
			return getRuleContext(Faltapuntoycoma2Context.class,0);
		}
		public Estructuras_de_controlContext estructuras_de_control() {
			return getRuleContext(Estructuras_de_controlContext.class,0);
		}
		public Faltaparentesis2Context faltaparentesis2() {
			return getRuleContext(Faltaparentesis2Context.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(SintacticoParser.PUNTOYCOMA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(91); declarar_variables();
					}
					break;

				case 2:
					{
					setState(92); variable();
					}
					break;

				case 3:
					{
					setState(93); llamada_funcion();
					}
					break;

				case 4:
					{
					setState(94); operacion();
					}
					break;
				}
				setState(97); match(PUNTOYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); estructuras_de_control();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); faltapuntoycoma2();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); faltaparentesis2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaltapuntoycomaContext extends ParserRuleContext {
		public Declarar_variablesContext declarar_variables() {
			return getRuleContext(Declarar_variablesContext.class,0);
		}
		public Declarar_funcionContext declarar_funcion() {
			return getRuleContext(Declarar_funcionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FaltapuntoycomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltapuntoycoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterFaltapuntoycoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitFaltapuntoycoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitFaltapuntoycoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaltapuntoycomaContext faltapuntoycoma() throws RecognitionException {
		FaltapuntoycomaContext _localctx = new FaltapuntoycomaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_faltapuntoycoma);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); declarar_variables();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); declarar_funcion();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Faltapuntoycoma2Context extends ParserRuleContext {
		public Declarar_variablesContext declarar_variables() {
			return getRuleContext(Declarar_variablesContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Faltapuntoycoma2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltapuntoycoma2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterFaltapuntoycoma2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitFaltapuntoycoma2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitFaltapuntoycoma2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Faltapuntoycoma2Context faltapuntoycoma2() throws RecognitionException {
		Faltapuntoycoma2Context _localctx = new Faltapuntoycoma2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_faltapuntoycoma2);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); declarar_variables();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); variable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); llamada_funcion();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112); operacion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaltaparentesisContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public Declarar_variablesContext declarar_variables() {
			return getRuleContext(Declarar_variablesContext.class,0);
		}
		public TerminalNode ID() { return getToken(SintacticoParser.ID, 0); }
		public TerminalNode TIPODEDATO() { return getToken(SintacticoParser.TIPODEDATO, 0); }
		public Parametros_funcionContext parametros_funcion() {
			return getRuleContext(Parametros_funcionContext.class,0);
		}
		public Parametros_funcion_declContext parametros_funcion_decl() {
			return getRuleContext(Parametros_funcion_declContext.class,0);
		}
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(SintacticoParser.PUNTOYCOMA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public FaltaparentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltaparentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterFaltaparentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitFaltaparentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitFaltaparentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaltaparentesisContext faltaparentesis() throws RecognitionException {
		FaltaparentesisContext _localctx = new FaltaparentesisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_faltaparentesis);
		int _la;
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(TIPODEDATO);
				setState(116); match(ID);
				setState(118);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(117); parametros_funcion();
					}
				}

				setState(120); match(PARENTESISC);
				setState(121); match(PUNTOYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); match(TIPODEDATO);
				setState(123); match(ID);
				setState(125);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(124); declarar_variables();
					}
				}

				setState(127); match(PARENTESISC);
				setState(128); bloque();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129); match(TIPODEDATO);
				setState(130); match(ID);
				setState(132);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(131); parametros_funcion_decl();
					}
				}

				setState(134); match(PARENTESISC);
				setState(135); bloque();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136); match(TIPODEDATO);
				setState(137); match(ID);
				setState(138); match(PARENTESISA);
				setState(140);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(139); parametros_funcion();
					}
				}

				setState(142); match(PUNTOYCOMA);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143); match(TIPODEDATO);
				setState(144); match(ID);
				setState(145); match(PARENTESISA);
				setState(147);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(146); declarar_variables();
					}
				}

				setState(149); bloque();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150); match(TIPODEDATO);
				setState(151); match(ID);
				setState(152); match(PARENTESISA);
				setState(154);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(153); parametros_funcion_decl();
					}
				}

				setState(156); bloque();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Faltaparentesis2Context extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public TerminalNode MIENTRAS() { return getToken(SintacticoParser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public TerminalNode ASIGNACION() { return getToken(SintacticoParser.ASIGNACION, 0); }
		public TerminalNode PARA() { return getToken(SintacticoParser.PARA, 0); }
		public TerminalNode ID(int i) {
			return getToken(SintacticoParser.ID, i);
		}
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(SintacticoParser.PUNTOYCOMA, i);
		}
		public TerminalNode SI() { return getToken(SintacticoParser.SI, 0); }
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(SintacticoParser.PUNTOYCOMA); }
		public List<TerminalNode> COMA() { return getTokens(SintacticoParser.COMA); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(SintacticoParser.ID); }
		public TerminalNode COMA(int i) {
			return getToken(SintacticoParser.COMA, i);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ENTERO() { return getToken(SintacticoParser.ENTERO, 0); }
		public TerminalNode SINO() { return getToken(SintacticoParser.SINO, 0); }
		public Faltaparentesis2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltaparentesis2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterFaltaparentesis2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitFaltaparentesis2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitFaltaparentesis2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Faltaparentesis2Context faltaparentesis2() throws RecognitionException {
		Faltaparentesis2Context _localctx = new Faltaparentesis2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_faltaparentesis2);
		int _la;
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); match(ID);
				setState(168);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(160); match(ID);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(161); match(COMA);
						setState(162); match(ID);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170); match(PARENTESISC);
				setState(171); match(PUNTOYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				switch (_input.LA(1)) {
				case MIENTRAS:
					{
					setState(172); match(MIENTRAS);
					setState(173); condicion();
					setState(174); match(PARENTESISC);
					}
					break;
				case PARA:
					{
					setState(176); match(PARA);
					setState(177); match(ID);
					setState(178); match(ASIGNACION);
					setState(179);
					_la = _input.LA(1);
					if ( !(_la==ENTERO || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(180); match(PUNTOYCOMA);
					setState(181); condicion();
					setState(182); match(PUNTOYCOMA);
					setState(183); variable();
					setState(184); match(PARENTESISC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case OPMATEMATICAS:
				case TRUEFALSE:
					{
					setState(188); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(189); bloque();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); match(ID);
				setState(193); match(PARENTESISA);
				setState(202);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(194); match(ID);
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(195); match(COMA);
						setState(196); match(ID);
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(204); match(PUNTOYCOMA);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				switch (_input.LA(1)) {
				case MIENTRAS:
					{
					setState(205); match(MIENTRAS);
					setState(206); match(PARENTESISA);
					setState(207); condicion();
					}
					break;
				case PARA:
					{
					setState(208); match(PARA);
					setState(209); match(PARENTESISA);
					setState(210); match(ID);
					setState(211); match(ASIGNACION);
					setState(212);
					_la = _input.LA(1);
					if ( !(_la==ENTERO || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(213); match(PUNTOYCOMA);
					setState(214); condicion();
					setState(215); match(PUNTOYCOMA);
					setState(216); variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case OPMATEMATICAS:
				case TRUEFALSE:
					{
					setState(220); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(221); bloque();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224); match(SI);
				setState(225); match(PARENTESISA);
				setState(226); condicion();
				setState(229);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case OPMATEMATICAS:
				case TRUEFALSE:
					{
					setState(227); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(228); bloque();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(231); match(SINO);
					setState(234);
					switch (_input.LA(1)) {
					case ENTERO:
					case FLOTANTE:
					case TIPODEDATO:
					case CARACTER:
					case PARA:
					case SI:
					case MIENTRAS:
					case ID:
					case OPMATEMATICAS:
					case TRUEFALSE:
						{
						setState(232); instruccion();
						}
						break;
					case LLAVEA:
						{
						setState(233); bloque();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238); match(SI);
				setState(239); condicion();
				setState(240); match(PARENTESISC);
				setState(243);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case OPMATEMATICAS:
				case TRUEFALSE:
					{
					setState(241); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(242); bloque();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(250);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(245); match(SINO);
					setState(248);
					switch (_input.LA(1)) {
					case ENTERO:
					case FLOTANTE:
					case TIPODEDATO:
					case CARACTER:
					case PARA:
					case SI:
					case MIENTRAS:
					case ID:
					case OPMATEMATICAS:
					case TRUEFALSE:
						{
						setState(246); instruccion();
						}
						break;
					case LLAVEA:
						{
						setState(247); bloque();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SintacticoParser.ID, 0); }
		public TerminalNode CARACTER() { return getToken(SintacticoParser.CARACTER, 0); }
		public Llamada_funcion_malContext llamada_funcion_mal() {
			return getRuleContext(Llamada_funcion_malContext.class,0);
		}
		public TerminalNode FLOTANTE() { return getToken(SintacticoParser.FLOTANTE, 0); }
		public TerminalNode TRUEFALSE() { return getToken(SintacticoParser.TRUEFALSE, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(SintacticoParser.ENTERO, 0); }
		public DatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterDatos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitDatos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitDatos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatosContext datos() throws RecognitionException {
		DatosContext _localctx = new DatosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_datos);
		int _la;
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); llamada_funcion();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); llamada_funcion_mal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << CARACTER) | (1L << ID) | (1L << TRUEFALSE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public List<DatosContext> datos() {
			return getRuleContexts(DatosContext.class);
		}
		public DatosContext datos(int i) {
			return getRuleContext(DatosContext.class,i);
		}
		public TerminalNode OPMATEMATICAS() { return getToken(SintacticoParser.OPMATEMATICAS, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operacion);
		int _la;
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); datos();
				setState(260); match(OPMATEMATICAS);
				setState(262);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(261); datos();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << CARACTER) | (1L << ID) | (1L << TRUEFALSE))) != 0)) {
					{
					setState(264); datos();
					}
				}

				setState(267); match(OPMATEMATICAS);
				setState(268); datos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datos_opMatematicaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SintacticoParser.ID, 0); }
		public TerminalNode CARACTER() { return getToken(SintacticoParser.CARACTER, 0); }
		public TerminalNode FLOTANTE() { return getToken(SintacticoParser.FLOTANTE, 0); }
		public TerminalNode ENTERO() { return getToken(SintacticoParser.ENTERO, 0); }
		public Datos_opMatematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datos_opMatematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterDatos_opMatematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitDatos_opMatematica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitDatos_opMatematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datos_opMatematicaContext datos_opMatematica() throws RecognitionException {
		Datos_opMatematicaContext _localctx = new Datos_opMatematicaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_datos_opMatematica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << CARACTER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_operacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SintacticoParser.ID, 0); }
		public List<Operacion_matematicaContext> operacion_matematica() {
			return getRuleContexts(Operacion_matematicaContext.class);
		}
		public TerminalNode ASIGNACION() { return getToken(SintacticoParser.ASIGNACION, 0); }
		public Operacion_matematicaContext operacion_matematica(int i) {
			return getRuleContext(Operacion_matematicaContext.class,i);
		}
		public TerminalNode OPMATEMATICAS() { return getToken(SintacticoParser.OPMATEMATICAS, 0); }
		public Variable_operacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterVariable_operacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitVariable_operacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitVariable_operacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_operacionContext variable_operacion() throws RecognitionException {
		Variable_operacionContext _localctx = new Variable_operacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(ID);
			setState(274); match(ASIGNACION);
			setState(275); operacion_matematica();
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(276); match(OPMATEMATICAS);
				setState(277); operacion_matematica();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operacion_matematicaContext extends ParserRuleContext {
		public TerminalNode OPMATEMATICAS(int i) {
			return getToken(SintacticoParser.OPMATEMATICAS, i);
		}
		public List<TerminalNode> PARENTESISC() { return getTokens(SintacticoParser.PARENTESISC); }
		public List<Operacion_matematicaContext> operacion_matematica() {
			return getRuleContexts(Operacion_matematicaContext.class);
		}
		public TerminalNode PARENTESISA(int i) {
			return getToken(SintacticoParser.PARENTESISA, i);
		}
		public Datos_opMatematicaContext datos_opMatematica(int i) {
			return getRuleContext(Datos_opMatematicaContext.class,i);
		}
		public List<Datos_opMatematicaContext> datos_opMatematica() {
			return getRuleContexts(Datos_opMatematicaContext.class);
		}
		public TerminalNode PARENTESISC(int i) {
			return getToken(SintacticoParser.PARENTESISC, i);
		}
		public Operacion_matematicaContext operacion_matematica(int i) {
			return getRuleContext(Operacion_matematicaContext.class,i);
		}
		public List<TerminalNode> PARENTESISA() { return getTokens(SintacticoParser.PARENTESISA); }
		public List<TerminalNode> OPMATEMATICAS() { return getTokens(SintacticoParser.OPMATEMATICAS); }
		public Operacion_matematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_matematica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterOperacion_matematica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitOperacion_matematica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitOperacion_matematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacion_matematicaContext operacion_matematica() throws RecognitionException {
		Operacion_matematicaContext _localctx = new Operacion_matematicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operacion_matematica);
		int _la;
		try {
			int _alt;
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARENTESISA) {
					{
					{
					setState(280); match(PARENTESISA);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(286); datos_opMatematica();
						setState(287); match(OPMATEMATICAS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(291); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				setState(295);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(293); datos_opMatematica();
					}
					break;

				case 2:
					{
					setState(294); operacion_matematica();
					}
					break;
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297); match(PARENTESISC);
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(304);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(303); operacion_matematica();
					}
					break;
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306); match(PARENTESISC);
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(312); datos_opMatematica();
						setState(313); match(OPMATEMATICAS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(317); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				setState(321);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(319); datos_opMatematica();
					}
					break;

				case 2:
					{
					setState(320); operacion_matematica();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323); match(OPMATEMATICAS);
				setState(326);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(324); datos_opMatematica();
					}
					break;

				case 2:
					{
					setState(325); operacion_matematica();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ASIGNACION() { return getToken(SintacticoParser.ASIGNACION, 0); }
		public DatosContext datos() {
			return getRuleContext(DatosContext.class,0);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignacion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(ASIGNACION);
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(332); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(331); operacion();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(334); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;

			case 2:
				{
				setState(336); datos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SintacticoParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Variable_operacionContext variable_operacion() {
			return getRuleContext(Variable_operacionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		int _la;
		try {
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339); match(ID);
				setState(341);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(340); asignacion();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); variable_operacion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_funcionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SintacticoParser.ID); }
		public TerminalNode COMA(int i) {
			return getToken(SintacticoParser.COMA, i);
		}
		public TerminalNode TIPODEDATO(int i) {
			return getToken(SintacticoParser.TIPODEDATO, i);
		}
		public TerminalNode ID(int i) {
			return getToken(SintacticoParser.ID, i);
		}
		public Parametros_funcion_malContext parametros_funcion_mal() {
			return getRuleContext(Parametros_funcion_malContext.class,0);
		}
		public List<TerminalNode> TIPODEDATO() { return getTokens(SintacticoParser.TIPODEDATO); }
		public List<TerminalNode> COMA() { return getTokens(SintacticoParser.COMA); }
		public Parametros_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterParametros_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitParametros_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitParametros_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_funcionContext parametros_funcion() throws RecognitionException {
		Parametros_funcionContext _localctx = new Parametros_funcionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros_funcion);
		int _la;
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(346); match(TIPODEDATO);
				setState(348);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(347); match(ID);
					}
				}

				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(350); match(COMA);
					setState(351); match(TIPODEDATO);
					setState(353);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(352); match(ID);
						}
					}

					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); parametros_funcion_mal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_funcion_malContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SintacticoParser.ID); }
		public TerminalNode COMA(int i) {
			return getToken(SintacticoParser.COMA, i);
		}
		public TerminalNode TIPODEDATO(int i) {
			return getToken(SintacticoParser.TIPODEDATO, i);
		}
		public TerminalNode ID(int i) {
			return getToken(SintacticoParser.ID, i);
		}
		public List<TerminalNode> TIPODEDATO() { return getTokens(SintacticoParser.TIPODEDATO); }
		public List<TerminalNode> COMA() { return getTokens(SintacticoParser.COMA); }
		public Parametros_funcion_malContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_funcion_mal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterParametros_funcion_mal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitParametros_funcion_mal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitParametros_funcion_mal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_funcion_malContext parametros_funcion_mal() throws RecognitionException {
		Parametros_funcion_malContext _localctx = new Parametros_funcion_malContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parametros_funcion_mal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(TIPODEDATO);
			setState(365);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(364); match(ID);
				}
			}

			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(367); match(COMA);
				setState(368); match(TIPODEDATO);
				setState(370);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(369); match(ID);
					}
				}

				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(377); match(TIPODEDATO);
			setState(379);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(378); match(ID);
				}
			}

			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(381); match(COMA);
				setState(382); match(TIPODEDATO);
				setState(384);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(383); match(ID);
					}
				}

				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarar_variablesContext extends ParserRuleContext {
		public TerminalNode COMA(int i) {
			return getToken(SintacticoParser.COMA, i);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Declarar_variable_malContext declarar_variable_mal() {
			return getRuleContext(Declarar_variable_malContext.class,0);
		}
		public TerminalNode TIPODEDATO() { return getToken(SintacticoParser.TIPODEDATO, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public List<TerminalNode> COMA() { return getTokens(SintacticoParser.COMA); }
		public Declarar_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterDeclarar_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitDeclarar_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitDeclarar_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_variablesContext declarar_variables() throws RecognitionException {
		Declarar_variablesContext _localctx = new Declarar_variablesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarar_variables);
		int _la;
		try {
			setState(401);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391); match(TIPODEDATO);
				setState(392); variable();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(393); match(COMA);
					setState(394); variable();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400); declarar_variable_mal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarar_funcionContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public TerminalNode ID() { return getToken(SintacticoParser.ID, 0); }
		public TerminalNode TIPODEDATO() { return getToken(SintacticoParser.TIPODEDATO, 0); }
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public Parametros_funcionContext parametros_funcion() {
			return getRuleContext(Parametros_funcionContext.class,0);
		}
		public Declarar_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterDeclarar_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitDeclarar_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitDeclarar_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_funcionContext declarar_funcion() throws RecognitionException {
		Declarar_funcionContext _localctx = new Declarar_funcionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declarar_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); match(TIPODEDATO);
			setState(404); match(ID);
			setState(405); match(PARENTESISA);
			setState(407);
			_la = _input.LA(1);
			if (_la==TIPODEDATO) {
				{
				setState(406); parametros_funcion();
				}
			}

			setState(409); match(PARENTESISC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarar_variable_malContext extends ParserRuleContext {
		public TerminalNode COMA(int i) {
			return getToken(SintacticoParser.COMA, i);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode TIPODEDATO() { return getToken(SintacticoParser.TIPODEDATO, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public List<TerminalNode> COMA() { return getTokens(SintacticoParser.COMA); }
		public Declarar_variable_malContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_variable_mal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterDeclarar_variable_mal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitDeclarar_variable_mal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitDeclarar_variable_mal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_variable_malContext declarar_variable_mal() throws RecognitionException {
		Declarar_variable_malContext _localctx = new Declarar_variable_malContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declarar_variable_mal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(TIPODEDATO);
			setState(412); variable();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(413); match(COMA);
				setState(414); variable();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420); variable();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(421); match(COMA);
				setState(422); variable();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarar_variable_mal_tipoContext extends ParserRuleContext {
		public TerminalNode TIPO_CHAR() { return getToken(SintacticoParser.TIPO_CHAR, 0); }
		public TerminalNode ENTERO(int i) {
			return getToken(SintacticoParser.ENTERO, i);
		}
		public List<TerminalNode> ASIGNACION() { return getTokens(SintacticoParser.ASIGNACION); }
		public TerminalNode TIPO_BOOL() { return getToken(SintacticoParser.TIPO_BOOL, 0); }
		public TerminalNode TIPO_FLOAT() { return getToken(SintacticoParser.TIPO_FLOAT, 0); }
		public TerminalNode CARACTER(int i) {
			return getToken(SintacticoParser.CARACTER, i);
		}
		public TerminalNode ID(int i) {
			return getToken(SintacticoParser.ID, i);
		}
		public List<TerminalNode> FLOTANTE() { return getTokens(SintacticoParser.FLOTANTE); }
		public TerminalNode FLOTANTE(int i) {
			return getToken(SintacticoParser.FLOTANTE, i);
		}
		public TerminalNode ASIGNACION(int i) {
			return getToken(SintacticoParser.ASIGNACION, i);
		}
		public TerminalNode COMA() { return getToken(SintacticoParser.COMA, 0); }
		public List<TerminalNode> ID() { return getTokens(SintacticoParser.ID); }
		public List<TerminalNode> CARACTER() { return getTokens(SintacticoParser.CARACTER); }
		public TerminalNode TRUEFALSE(int i) {
			return getToken(SintacticoParser.TRUEFALSE, i);
		}
		public TerminalNode TIPO_INT() { return getToken(SintacticoParser.TIPO_INT, 0); }
		public List<TerminalNode> TRUEFALSE() { return getTokens(SintacticoParser.TRUEFALSE); }
		public TerminalNode TIPO_DOUBLE() { return getToken(SintacticoParser.TIPO_DOUBLE, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(SintacticoParser.ENTERO); }
		public Declarar_variable_mal_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_variable_mal_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterDeclarar_variable_mal_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitDeclarar_variable_mal_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitDeclarar_variable_mal_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_variable_mal_tipoContext declarar_variable_mal_tipo() throws RecognitionException {
		Declarar_variable_mal_tipoContext _localctx = new Declarar_variable_mal_tipoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declarar_variable_mal_tipo);
		int _la;
		try {
			setState(468);
			switch (_input.LA(1)) {
			case TIPO_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(428); match(TIPO_INT);
				setState(429); match(ID);
				{
				setState(430); match(ASIGNACION);
				setState(431);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOTANTE) | (1L << CARACTER) | (1L << TRUEFALSE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;
			case TIPO_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); match(TIPO_CHAR);
				setState(433); match(ID);
				setState(436);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(434); match(ASIGNACION);
					setState(435);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUEFALSE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(442);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(438); match(COMA);
					setState(439); match(ID);
					setState(440); match(ASIGNACION);
					setState(441);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUEFALSE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				break;
			case TIPO_FLOAT:
			case TIPO_DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				_la = _input.LA(1);
				if ( !(_la==TIPO_FLOAT || _la==TIPO_DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(445); match(ID);
				setState(448);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(446); match(ASIGNACION);
					setState(447);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << CARACTER) | (1L << TRUEFALSE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(454);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(450); match(COMA);
					setState(451); match(ID);
					setState(452); match(ASIGNACION);
					setState(453);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << CARACTER) | (1L << TRUEFALSE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				break;
			case TIPO_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(456); match(TIPO_BOOL);
				setState(457); match(ID);
				setState(460);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(458); match(ASIGNACION);
					setState(459);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << CARACTER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(466);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(462); match(COMA);
					setState(463); match(ID);
					setState(464); match(ASIGNACION);
					setState(465);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << CARACTER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_funcion_declContext extends ParserRuleContext {
		public TerminalNode COMA(int i) {
			return getToken(SintacticoParser.COMA, i);
		}
		public TerminalNode TIPODEDATO(int i) {
			return getToken(SintacticoParser.TIPODEDATO, i);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> TIPODEDATO() { return getTokens(SintacticoParser.TIPODEDATO); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public List<TerminalNode> COMA() { return getTokens(SintacticoParser.COMA); }
		public Parametros_funcion_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_funcion_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterParametros_funcion_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitParametros_funcion_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitParametros_funcion_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_funcion_declContext parametros_funcion_decl() throws RecognitionException {
		Parametros_funcion_declContext _localctx = new Parametros_funcion_declContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parametros_funcion_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(470); match(TIPODEDATO);
			setState(471); variable();
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(473); match(COMA);
				setState(474); match(TIPODEDATO);
				setState(475); variable();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public TerminalNode ID() { return getToken(SintacticoParser.ID, 0); }
		public Bloque_malContext bloque_mal() {
			return getRuleContext(Bloque_malContext.class,0);
		}
		public TerminalNode TIPODEDATO() { return getToken(SintacticoParser.TIPODEDATO, 0); }
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public Parametros_funcion_declContext parametros_funcion_decl() {
			return getRuleContext(Parametros_funcion_declContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481); match(TIPODEDATO);
			setState(482); match(ID);
			setState(483); match(PARENTESISA);
			setState(485);
			_la = _input.LA(1);
			if (_la==TIPODEDATO) {
				{
				setState(484); parametros_funcion_decl();
				}
			}

			setState(487); match(PARENTESISC);
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(488); bloque_mal();
				}
				break;

			case 2:
				{
				setState(489); bloque();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public List<TerminalNode> ID() { return getTokens(SintacticoParser.ID); }
		public Llamada_funcion_malContext llamada_funcion_mal() {
			return getRuleContext(Llamada_funcion_malContext.class,0);
		}
		public TerminalNode COMA(int i) {
			return getToken(SintacticoParser.COMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(SintacticoParser.ID, i);
		}
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public List<TerminalNode> COMA() { return getTokens(SintacticoParser.COMA); }
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_llamada_funcion);
		int _la;
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); match(ID);
				setState(493); match(PARENTESISA);
				setState(502);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(494); match(ID);
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(495); match(COMA);
						setState(496); match(ID);
						}
						}
						setState(501);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(504); match(PARENTESISC);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505); llamada_funcion_mal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_funcion_malContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public List<TerminalNode> ID() { return getTokens(SintacticoParser.ID); }
		public TerminalNode COMA(int i) {
			return getToken(SintacticoParser.COMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(SintacticoParser.ID, i);
		}
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public List<TerminalNode> COMA() { return getTokens(SintacticoParser.COMA); }
		public Llamada_funcion_malContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion_mal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterLlamada_funcion_mal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitLlamada_funcion_mal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitLlamada_funcion_mal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcion_malContext llamada_funcion_mal() throws RecognitionException {
		Llamada_funcion_malContext _localctx = new Llamada_funcion_malContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_llamada_funcion_mal);
		int _la;
		try {
			int _alt;
			setState(553);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508); match(ID);
				setState(517);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(509); match(ID);
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(510); match(COMA);
						setState(511); match(ID);
						}
						}
						setState(516);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(519); match(PARENTESISC);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520); match(ID);
				setState(521); match(PARENTESISA);
				setState(538);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(522); match(ID);
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(523); match(COMA);
						setState(524); match(ID);
						}
						}
						setState(529);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(530); match(ID);
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(531); match(COMA);
						setState(532); match(ID);
						}
						}
						setState(537);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(540); match(PARENTESISC);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541); match(ID);
				setState(542); match(PARENTESISA);
				setState(551);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(543); match(ID);
					setState(548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(544); match(COMA);
							setState(545); match(ID);
							}
							} 
						}
						setState(550);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public ReturnoContext returno() {
			return getRuleContext(ReturnoContext.class,0);
		}
		public TerminalNode LLAVEA() { return getToken(SintacticoParser.LLAVEA, 0); }
		public TerminalNode LLAVEC() { return getToken(SintacticoParser.LLAVEC, 0); }
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(LLAVEA);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TIPODEDATO) | (1L << CARACTER) | (1L << PARA) | (1L << SI) | (1L << MIENTRAS) | (1L << ID) | (1L << OPMATEMATICAS) | (1L << TRUEFALSE))) != 0)) {
				{
				{
				setState(556); instruccion();
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			_la = _input.LA(1);
			if (_la==RETURNO) {
				{
				setState(562); returno();
				}
			}

			setState(565); match(LLAVEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloque_malContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public ReturnoContext returno() {
			return getRuleContext(ReturnoContext.class,0);
		}
		public TerminalNode LLAVEA() { return getToken(SintacticoParser.LLAVEA, 0); }
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Bloque_malContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_mal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterBloque_mal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitBloque_mal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitBloque_mal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_malContext bloque_mal() throws RecognitionException {
		Bloque_malContext _localctx = new Bloque_malContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bloque_mal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567); match(LLAVEA);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(568); instruccion();
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(575);
			_la = _input.LA(1);
			if (_la==RETURNO) {
				{
				setState(574); returno();
				}
			}

			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(577); instruccion();
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnoContext extends ParserRuleContext {
		public Returno_malContext returno_mal() {
			return getRuleContext(Returno_malContext.class,0);
		}
		public DatosContext datos() {
			return getRuleContext(DatosContext.class,0);
		}
		public TerminalNode RETURNO() { return getToken(SintacticoParser.RETURNO, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(SintacticoParser.PUNTOYCOMA, 0); }
		public ReturnoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterReturno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitReturno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitReturno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnoContext returno() throws RecognitionException {
		ReturnoContext _localctx = new ReturnoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returno);
		try {
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583); match(RETURNO);
				setState(584); datos();
				setState(585); match(PUNTOYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587); returno_mal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Returno_malContext extends ParserRuleContext {
		public DatosContext datos() {
			return getRuleContext(DatosContext.class,0);
		}
		public TerminalNode RETURNO() { return getToken(SintacticoParser.RETURNO, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(SintacticoParser.PUNTOYCOMA, 0); }
		public Returno_malContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returno_mal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterReturno_mal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitReturno_mal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitReturno_mal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Returno_malContext returno_mal() throws RecognitionException {
		Returno_malContext _localctx = new Returno_malContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returno_mal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); match(RETURNO);
			setState(593);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(591); datos();
				}
				break;

			case 2:
				{
				setState(592); match(PUNTOYCOMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public List<TerminalNode> OPLOGICAS() { return getTokens(SintacticoParser.OPLOGICAS); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public List<DatosContext> datos() {
			return getRuleContexts(DatosContext.class);
		}
		public TerminalNode OPLOGICAS(int i) {
			return getToken(SintacticoParser.OPLOGICAS, i);
		}
		public DatosContext datos(int i) {
			return getRuleContext(DatosContext.class,i);
		}
		public TerminalNode TRUEFALSE() { return getToken(SintacticoParser.TRUEFALSE, 0); }
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public TerminalNode COMPARACIONES() { return getToken(SintacticoParser.COMPARACIONES, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if (_la==PARENTESISA) {
				{
				setState(595); match(PARENTESISA);
				}
			}

			setState(599);
			_la = _input.LA(1);
			if (_la==OPLOGICAS) {
				{
				setState(598); match(OPLOGICAS);
				}
			}

			setState(606);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(601); match(TRUEFALSE);
				}
				break;

			case 2:
				{
				{
				setState(602); datos();
				}
				setState(603); match(COMPARACIONES);
				{
				setState(604); datos();
				}
				}
				break;
			}
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(608); match(OPLOGICAS);
				setState(609); condicion();
				}
				break;
			}
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(612); match(PARENTESISC);
				}
				break;
			}
			setState(617);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(615); match(OPLOGICAS);
				setState(616); condicion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Estructuras_de_controlContext extends ParserRuleContext {
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public Si_entoncesContext si_entonces() {
			return getRuleContext(Si_entoncesContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Estructuras_de_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuras_de_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterEstructuras_de_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitEstructuras_de_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitEstructuras_de_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estructuras_de_controlContext estructuras_de_control() throws RecognitionException {
		Estructuras_de_controlContext _localctx = new Estructuras_de_controlContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_estructuras_de_control);
		try {
			setState(629);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				switch (_input.LA(1)) {
				case SI:
					{
					setState(619); si();
					}
					break;
				case MIENTRAS:
					{
					setState(620); mientras();
					}
					break;
				case PARA:
					{
					setState(621); para();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(626);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case OPMATEMATICAS:
				case TRUEFALSE:
					{
					setState(624); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(625); bloque();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(628); si_entonces();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode SI() { return getToken(SintacticoParser.SI, 0); }
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); match(SI);
			setState(632); match(PARENTESISA);
			setState(633); condicion();
			setState(634); match(PARENTESISC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public TerminalNode MIENTRAS() { return getToken(SintacticoParser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636); match(MIENTRAS);
			setState(637); match(PARENTESISA);
			setState(638); condicion();
			setState(639); match(PARENTESISC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARENTESISC() { return getToken(SintacticoParser.PARENTESISC, 0); }
		public List<TerminalNode> ID() { return getTokens(SintacticoParser.ID); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(SintacticoParser.ASIGNACION, 0); }
		public TerminalNode PARA() { return getToken(SintacticoParser.PARA, 0); }
		public TerminalNode ID(int i) {
			return getToken(SintacticoParser.ID, i);
		}
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(SintacticoParser.PUNTOYCOMA, i);
		}
		public TerminalNode PARENTESISA() { return getToken(SintacticoParser.PARENTESISA, 0); }
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(SintacticoParser.PUNTOYCOMA); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(SintacticoParser.ENTERO, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); match(PARA);
			setState(642); match(PARENTESISA);
			setState(643); match(ID);
			setState(644); match(ASIGNACION);
			setState(645);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(646); match(PUNTOYCOMA);
			setState(647); condicion();
			setState(648); match(PUNTOYCOMA);
			setState(649); variable();
			setState(650); match(PARENTESISC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(SintacticoParser.SINO, 0); }
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); match(SINO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Si_entoncesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public Si_entoncesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_entonces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).enterSi_entonces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SintacticoListener ) ((SintacticoListener)listener).exitSi_entonces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SintacticoVisitor ) return ((SintacticoVisitor<? extends T>)visitor).visitSi_entonces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Si_entoncesContext si_entonces() throws RecognitionException {
		Si_entoncesContext _localctx = new Si_entoncesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_si_entonces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); si();
			setState(657);
			switch (_input.LA(1)) {
			case ENTERO:
			case FLOTANTE:
			case TIPODEDATO:
			case CARACTER:
			case PARA:
			case SI:
			case MIENTRAS:
			case ID:
			case OPMATEMATICAS:
			case TRUEFALSE:
				{
				setState(655); instruccion();
				}
				break;
			case LLAVEA:
				{
				setState(656); bloque();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659); sino();
			setState(662);
			switch (_input.LA(1)) {
			case ENTERO:
			case FLOTANTE:
			case TIPODEDATO:
			case CARACTER:
			case PARA:
			case SI:
			case MIENTRAS:
			case ID:
			case OPMATEMATICAS:
			case TRUEFALSE:
				{
				setState(660); instruccion();
				}
				break;
			case LLAVEA:
				{
				setState(661); bloque();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u029b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2L\n\2\r\2\16\2M\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4V\n\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\3\5\3\5\5\5b\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\7\5\7t\n"+
		"\7\3\b\3\b\3\b\5\by\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0087\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0096\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u009d\n\b\3\b\5\b\u00a0"+
		"\n\b\3\t\3\t\3\t\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\5\t\u00ab\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bd"+
		"\n\t\3\t\3\t\5\t\u00c1\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c8\n\t\f\t\16\t"+
		"\u00cb\13\t\5\t\u00cd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00dd\n\t\3\t\3\t\5\t\u00e1\n\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00e8\n\t\3\t\3\t\3\t\5\t\u00ed\n\t\5\t\u00ef\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00f6\n\t\3\t\3\t\3\t\5\t\u00fb\n\t\5\t\u00fd\n\t\5\t\u00ff\n\t"+
		"\3\n\3\n\3\n\5\n\u0104\n\n\3\13\3\13\3\13\5\13\u0109\n\13\3\13\5\13\u010c"+
		"\n\13\3\13\3\13\5\13\u0110\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0119"+
		"\n\r\3\16\7\16\u011c\n\16\f\16\16\16\u011f\13\16\3\16\3\16\3\16\6\16\u0124"+
		"\n\16\r\16\16\16\u0125\3\16\3\16\5\16\u012a\n\16\3\16\7\16\u012d\n\16"+
		"\f\16\16\16\u0130\13\16\3\16\5\16\u0133\n\16\3\16\7\16\u0136\n\16\f\16"+
		"\16\16\u0139\13\16\3\16\3\16\3\16\6\16\u013e\n\16\r\16\16\16\u013f\3\16"+
		"\3\16\5\16\u0144\n\16\3\16\3\16\3\16\5\16\u0149\n\16\5\16\u014b\n\16\3"+
		"\17\3\17\6\17\u014f\n\17\r\17\16\17\u0150\3\17\5\17\u0154\n\17\3\20\3"+
		"\20\5\20\u0158\n\20\3\20\5\20\u015b\n\20\3\21\3\21\5\21\u015f\n\21\3\21"+
		"\3\21\3\21\5\21\u0164\n\21\7\21\u0166\n\21\f\21\16\21\u0169\13\21\3\21"+
		"\5\21\u016c\n\21\3\22\3\22\5\22\u0170\n\22\3\22\3\22\3\22\5\22\u0175\n"+
		"\22\7\22\u0177\n\22\f\22\16\22\u017a\13\22\3\22\3\22\5\22\u017e\n\22\3"+
		"\22\3\22\3\22\5\22\u0183\n\22\7\22\u0185\n\22\f\22\16\22\u0188\13\22\3"+
		"\23\3\23\3\23\3\23\7\23\u018e\n\23\f\23\16\23\u0191\13\23\3\23\5\23\u0194"+
		"\n\23\3\24\3\24\3\24\3\24\5\24\u019a\n\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\7\25\u01a2\n\25\f\25\16\25\u01a5\13\25\3\25\3\25\3\25\7\25\u01aa\n\25"+
		"\f\25\16\25\u01ad\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01b7"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u01bd\n\26\3\26\3\26\3\26\3\26\5\26\u01c3"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u01c9\n\26\3\26\3\26\3\26\3\26\5\26\u01cf"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u01d5\n\26\5\26\u01d7\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u01df\n\27\f\27\16\27\u01e2\13\27\3\30\3\30\3"+
		"\30\3\30\5\30\u01e8\n\30\3\30\3\30\3\30\5\30\u01ed\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u01f4\n\31\f\31\16\31\u01f7\13\31\5\31\u01f9\n\31\3\31"+
		"\3\31\5\31\u01fd\n\31\3\32\3\32\3\32\3\32\7\32\u0203\n\32\f\32\16\32\u0206"+
		"\13\32\5\32\u0208\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0210\n\32\f"+
		"\32\16\32\u0213\13\32\3\32\3\32\3\32\7\32\u0218\n\32\f\32\16\32\u021b"+
		"\13\32\5\32\u021d\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0225\n\32\f"+
		"\32\16\32\u0228\13\32\5\32\u022a\n\32\5\32\u022c\n\32\3\33\3\33\7\33\u0230"+
		"\n\33\f\33\16\33\u0233\13\33\3\33\5\33\u0236\n\33\3\33\3\33\3\34\3\34"+
		"\7\34\u023c\n\34\f\34\16\34\u023f\13\34\3\34\5\34\u0242\n\34\3\34\7\34"+
		"\u0245\n\34\f\34\16\34\u0248\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u024f"+
		"\n\35\3\36\3\36\3\36\5\36\u0254\n\36\3\37\5\37\u0257\n\37\3\37\5\37\u025a"+
		"\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u0261\n\37\3\37\3\37\5\37\u0265\n"+
		"\37\3\37\5\37\u0268\n\37\3\37\3\37\5\37\u026c\n\37\3 \3 \3 \5 \u0271\n"+
		" \3 \3 \5 \u0275\n \3 \5 \u0278\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\5%\u0294\n%\3%\3%\3%"+
		"\5%\u0299\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFH\2\n\4\2\3\3\25\25\6\2\3\4\13\13\25\25##\5\2\3\4\13"+
		"\13\25\25\5\2\4\4\13\13##\4\2\3\4##\3\2\7\b\5\2\3\3\13\13##\4\2\3\4\13"+
		"\13\u02f5\2K\3\2\2\2\4O\3\2\2\2\6[\3\2\2\2\bh\3\2\2\2\nm\3\2\2\2\fs\3"+
		"\2\2\2\16\u009f\3\2\2\2\20\u00fe\3\2\2\2\22\u0103\3\2\2\2\24\u010f\3\2"+
		"\2\2\26\u0111\3\2\2\2\30\u0113\3\2\2\2\32\u014a\3\2\2\2\34\u014c\3\2\2"+
		"\2\36\u015a\3\2\2\2 \u016b\3\2\2\2\"\u016d\3\2\2\2$\u0193\3\2\2\2&\u0195"+
		"\3\2\2\2(\u019d\3\2\2\2*\u01d6\3\2\2\2,\u01d8\3\2\2\2.\u01e3\3\2\2\2\60"+
		"\u01fc\3\2\2\2\62\u022b\3\2\2\2\64\u022d\3\2\2\2\66\u0239\3\2\2\28\u024e"+
		"\3\2\2\2:\u0250\3\2\2\2<\u0256\3\2\2\2>\u0277\3\2\2\2@\u0279\3\2\2\2B"+
		"\u027e\3\2\2\2D\u0283\3\2\2\2F\u028e\3\2\2\2H\u0290\3\2\2\2JL\5\4\3\2"+
		"KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OP\5\6\4\2P\5\3\2\2"+
		"\2Q\\\5.\30\2RV\5$\23\2SV\5&\24\2TV\5\36\20\2UR\3\2\2\2US\3\2\2\2UT\3"+
		"\2\2\2VW\3\2\2\2WX\7\32\2\2X\\\3\2\2\2Y\\\5\n\6\2Z\\\5\16\b\2[Q\3\2\2"+
		"\2[U\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\7\3\2\2\2]b\5$\23\2^b\5\36\20\2_b\5"+
		"\60\31\2`b\5\24\13\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2"+
		"cd\7\32\2\2di\3\2\2\2ei\5> \2fi\5\f\7\2gi\5\20\t\2ha\3\2\2\2he\3\2\2\2"+
		"hf\3\2\2\2hg\3\2\2\2i\t\3\2\2\2jn\5$\23\2kn\5&\24\2ln\5\36\20\2mj\3\2"+
		"\2\2mk\3\2\2\2ml\3\2\2\2n\13\3\2\2\2ot\5$\23\2pt\5\36\20\2qt\5\60\31\2"+
		"rt\5\24\13\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\r\3\2\2\2uv\7\5"+
		"\2\2vx\7\25\2\2wy\5 \21\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\37\2\2{\u00a0"+
		"\7\32\2\2|}\7\5\2\2}\177\7\25\2\2~\u0080\5$\23\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\37\2\2\u0082\u00a0\5\64\33"+
		"\2\u0083\u0084\7\5\2\2\u0084\u0086\7\25\2\2\u0085\u0087\5,\27\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\37"+
		"\2\2\u0089\u00a0\5\64\33\2\u008a\u008b\7\5\2\2\u008b\u008c\7\25\2\2\u008c"+
		"\u008e\7\36\2\2\u008d\u008f\5 \21\2\u008e\u008d\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u00a0\7\32\2\2\u0091\u0092\7\5\2\2\u0092"+
		"\u0093\7\25\2\2\u0093\u0095\7\36\2\2\u0094\u0096\5$\23\2\u0095\u0094\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a0\5\64\33\2\u0098"+
		"\u0099\7\5\2\2\u0099\u009a\7\25\2\2\u009a\u009c\7\36\2\2\u009b\u009d\5"+
		",\27\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\5\64\33\2\u009fu\3\2\2\2\u009f|\3\2\2\2\u009f\u0083\3\2\2\2\u009f"+
		"\u008a\3\2\2\2\u009f\u0091\3\2\2\2\u009f\u0098\3\2\2\2\u00a0\17\3\2\2"+
		"\2\u00a1\u00aa\7\25\2\2\u00a2\u00a7\7\25\2\2\u00a3\u00a4\7\33\2\2\u00a4"+
		"\u00a6\7\25\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00a2\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\37"+
		"\2\2\u00ad\u00ff\7\32\2\2\u00ae\u00af\7\17\2\2\u00af\u00b0\5<\37\2\u00b0"+
		"\u00b1\7\37\2\2\u00b1\u00bd\3\2\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\7"+
		"\25\2\2\u00b4\u00b5\7\31\2\2\u00b5\u00b6\t\2\2\2\u00b6\u00b7\7\32\2\2"+
		"\u00b7\u00b8\5<\37\2\u00b8\u00b9\7\32\2\2\u00b9\u00ba\5\36\20\2\u00ba"+
		"\u00bb\7\37\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00b2\3"+
		"\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c1\5\b\5\2\u00bf\u00c1\5\64\33\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00ff\3\2\2\2\u00c2\u00c3\7\25"+
		"\2\2\u00c3\u00cc\7\36\2\2\u00c4\u00c9\7\25\2\2\u00c5\u00c6\7\33\2\2\u00c6"+
		"\u00c8\7\25\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00c4\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00ff\7\32"+
		"\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d1\7\36\2\2\u00d1\u00dd\5<\37\2\u00d2"+
		"\u00d3\7\r\2\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\7\25\2\2\u00d5\u00d6\7"+
		"\31\2\2\u00d6\u00d7\t\2\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00d9\5<\37\2\u00d9"+
		"\u00da\7\32\2\2\u00da\u00db\5\36\20\2\u00db\u00dd\3\2\2\2\u00dc\u00cf"+
		"\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e1\5\b\5\2\u00df"+
		"\u00e1\5\64\33\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00ff\3"+
		"\2\2\2\u00e2\u00e3\7\16\2\2\u00e3\u00e4\7\36\2\2\u00e4\u00e7\5<\37\2\u00e5"+
		"\u00e8\5\b\5\2\u00e6\u00e8\5\64\33\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00ee\3\2\2\2\u00e9\u00ec\7\21\2\2\u00ea\u00ed\5\b\5\2\u00eb"+
		"\u00ed\5\64\33\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ef\3"+
		"\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ff\3\2\2\2\u00f0"+
		"\u00f1\7\16\2\2\u00f1\u00f2\5<\37\2\u00f2\u00f5\7\37\2\2\u00f3\u00f6\5"+
		"\b\5\2\u00f4\u00f6\5\64\33\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00fc\3\2\2\2\u00f7\u00fa\7\21\2\2\u00f8\u00fb\5\b\5\2\u00f9\u00fb\5"+
		"\64\33\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f7\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00a1\3\2"+
		"\2\2\u00fe\u00bc\3\2\2\2\u00fe\u00c2\3\2\2\2\u00fe\u00dc\3\2\2\2\u00fe"+
		"\u00e2\3\2\2\2\u00fe\u00f0\3\2\2\2\u00ff\21\3\2\2\2\u0100\u0104\5\60\31"+
		"\2\u0101\u0104\5\62\32\2\u0102\u0104\t\3\2\2\u0103\u0100\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\23\3\2\2\2\u0105\u0106\5\22\n"+
		"\2\u0106\u0108\7\30\2\2\u0107\u0109\5\22\n\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u0110\3\2\2\2\u010a\u010c\5\22\n\2\u010b\u010a\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\30\2\2\u010e"+
		"\u0110\5\22\n\2\u010f\u0105\3\2\2\2\u010f\u010b\3\2\2\2\u0110\25\3\2\2"+
		"\2\u0111\u0112\t\4\2\2\u0112\27\3\2\2\2\u0113\u0114\7\25\2\2\u0114\u0115"+
		"\7\31\2\2\u0115\u0118\5\32\16\2\u0116\u0117\7\30\2\2\u0117\u0119\5\32"+
		"\16\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\31\3\2\2\2\u011a\u011c"+
		"\7\36\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u0123\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121"+
		"\5\26\f\2\u0121\u0122\7\30\2\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u012a\5\26\f\2\u0128\u012a\5\32\16\2\u0129\u0127\3\2\2"+
		"\2\u0129\u0128\3\2\2\2\u012a\u012e\3\2\2\2\u012b\u012d\7\37\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\5\32\16\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\3\2\2\2\u0134\u0136\7\37"+
		"\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u014b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\5\26"+
		"\f\2\u013b\u013c\7\30\2\2\u013c\u013e\3\2\2\2\u013d\u013a\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2"+
		"\2\2\u0141\u0144\5\26\f\2\u0142\u0144\5\32\16\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\u014b\3\2\2\2\u0145\u0148\7\30\2\2\u0146\u0149\5"+
		"\26\f\2\u0147\u0149\5\32\16\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2"+
		"\u0149\u014b\3\2\2\2\u014a\u011d\3\2\2\2\u014a\u013d\3\2\2\2\u014a\u0145"+
		"\3\2\2\2\u014b\33\3\2\2\2\u014c\u0153\7\31\2\2\u014d\u014f\5\24\13\2\u014e"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0154\5\22\n\2\u0153\u014e\3\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\35\3\2\2\2\u0155\u0157\7\25\2\2\u0156\u0158\5\34"+
		"\17\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u015b\5\30\r\2\u015a\u0155\3\2\2\2\u015a\u0159\3\2\2\2\u015b\37\3\2\2"+
		"\2\u015c\u015e\7\5\2\2\u015d\u015f\7\25\2\2\u015e\u015d\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0167\3\2\2\2\u0160\u0161\7\33\2\2\u0161\u0163\7"+
		"\5\2\2\u0162\u0164\7\25\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u0160\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016c\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016c\5\"\22\2\u016b\u015c\3\2\2\2\u016b\u016a\3\2\2\2\u016c!\3\2\2\2"+
		"\u016d\u016f\7\5\2\2\u016e\u0170\7\25\2\2\u016f\u016e\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0178\3\2\2\2\u0171\u0172\7\33\2\2\u0172\u0174\7\5\2\2"+
		"\u0173\u0175\7\25\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0171\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\7\5"+
		"\2\2\u017c\u017e\7\25\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0186\3\2\2\2\u017f\u0180\7\33\2\2\u0180\u0182\7\5\2\2\u0181\u0183\7"+
		"\25\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u017f\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187#\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\5\2\2\u018a\u018f"+
		"\5\36\20\2\u018b\u018c\7\33\2\2\u018c\u018e\5\36\20\2\u018d\u018b\3\2"+
		"\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0194\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194\5(\25\2\u0193\u0189\3\2"+
		"\2\2\u0193\u0192\3\2\2\2\u0194%\3\2\2\2\u0195\u0196\7\5\2\2\u0196\u0197"+
		"\7\25\2\2\u0197\u0199\7\36\2\2\u0198\u019a\5 \21\2\u0199\u0198\3\2\2\2"+
		"\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7\37\2\2\u019c\'"+
		"\3\2\2\2\u019d\u019e\7\5\2\2\u019e\u01a3\5\36\20\2\u019f\u01a0\7\33\2"+
		"\2\u01a0\u01a2\5\36\20\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a6\u01ab\5\36\20\2\u01a7\u01a8\7\33\2\2\u01a8\u01aa\5\36\20\2"+
		"\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac)\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7\6\2\2\u01af"+
		"\u01b0\7\25\2\2\u01b0\u01b1\7\31\2\2\u01b1\u01d7\t\5\2\2\u01b2\u01b3\7"+
		"\n\2\2\u01b3\u01b6\7\25\2\2\u01b4\u01b5\7\31\2\2\u01b5\u01b7\t\6\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bc\3\2\2\2\u01b8\u01b9\7\33"+
		"\2\2\u01b9\u01ba\7\25\2\2\u01ba\u01bb\7\31\2\2\u01bb\u01bd\t\6\2\2\u01bc"+
		"\u01b8\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01d7\3\2\2\2\u01be\u01bf\t\7"+
		"\2\2\u01bf\u01c2\7\25\2\2\u01c0\u01c1\7\31\2\2\u01c1\u01c3\t\b\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c8\3\2\2\2\u01c4\u01c5\7\33"+
		"\2\2\u01c5\u01c6\7\25\2\2\u01c6\u01c7\7\31\2\2\u01c7\u01c9\t\b\2\2\u01c8"+
		"\u01c4\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01d7\3\2\2\2\u01ca\u01cb\7\t"+
		"\2\2\u01cb\u01ce\7\25\2\2\u01cc\u01cd\7\31\2\2\u01cd\u01cf\t\t\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d4\3\2\2\2\u01d0\u01d1\7\33"+
		"\2\2\u01d1\u01d2\7\25\2\2\u01d2\u01d3\7\31\2\2\u01d3\u01d5\t\t\2\2\u01d4"+
		"\u01d0\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01ae\3\2"+
		"\2\2\u01d6\u01b2\3\2\2\2\u01d6\u01be\3\2\2\2\u01d6\u01ca\3\2\2\2\u01d7"+
		"+\3\2\2\2\u01d8\u01d9\7\5\2\2\u01d9\u01da\5\36\20\2\u01da\u01e0\3\2\2"+
		"\2\u01db\u01dc\7\33\2\2\u01dc\u01dd\7\5\2\2\u01dd\u01df\5\36\20\2\u01de"+
		"\u01db\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1-\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7\5\2\2\u01e4\u01e5"+
		"\7\25\2\2\u01e5\u01e7\7\36\2\2\u01e6\u01e8\5,\27\2\u01e7\u01e6\3\2\2\2"+
		"\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\7\37\2\2\u01ea\u01ed"+
		"\5\66\34\2\u01eb\u01ed\5\64\33\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2"+
		"\2\u01ed/\3\2\2\2\u01ee\u01ef\7\25\2\2\u01ef\u01f8\7\36\2\2\u01f0\u01f5"+
		"\7\25\2\2\u01f1\u01f2\7\33\2\2\u01f2\u01f4\7\25\2\2\u01f3\u01f1\3\2\2"+
		"\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fd\7\37\2\2\u01fb\u01fd\5\62\32\2\u01fc\u01ee"+
		"\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\61\3\2\2\2\u01fe\u0207\7\25\2\2\u01ff"+
		"\u0204\7\25\2\2\u0200\u0201\7\33\2\2\u0201\u0203\7\25\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u01ff\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u022c\7\37\2\2\u020a\u020b\7\25\2\2\u020b"+
		"\u021c\7\36\2\2\u020c\u0211\7\25\2\2\u020d\u020e\7\33\2\2\u020e\u0210"+
		"\7\25\2\2\u020f\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2"+
		"\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0219"+
		"\7\25\2\2\u0215\u0216\7\33\2\2\u0216\u0218\7\25\2\2\u0217\u0215\3\2\2"+
		"\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021d"+
		"\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u020c\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u022c\7\37\2\2\u021f\u0220\7\25\2\2\u0220\u0229\7"+
		"\36\2\2\u0221\u0226\7\25\2\2\u0222\u0223\7\33\2\2\u0223\u0225\7\25\2\2"+
		"\u0224\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u0221\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u01fe\3\2\2\2\u022b\u020a\3\2"+
		"\2\2\u022b\u021f\3\2\2\2\u022c\63\3\2\2\2\u022d\u0231\7 \2\2\u022e\u0230"+
		"\5\b\5\2\u022f\u022e\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0236\58"+
		"\35\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0238\7!\2\2\u0238\65\3\2\2\2\u0239\u023d\7 \2\2\u023a\u023c\5\b\5\2"+
		"\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0242\58\35\2\u0241"+
		"\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0246\3\2\2\2\u0243\u0245\5\b"+
		"\5\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\67\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\7\24\2"+
		"\2\u024a\u024b\5\22\n\2\u024b\u024c\7\32\2\2\u024c\u024f\3\2\2\2\u024d"+
		"\u024f\5:\36\2\u024e\u0249\3\2\2\2\u024e\u024d\3\2\2\2\u024f9\3\2\2\2"+
		"\u0250\u0253\7\24\2\2\u0251\u0254\5\22\n\2\u0252\u0254\7\32\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254;\3\2\2\2"+
		"\u0255\u0257\7\36\2\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259"+
		"\3\2\2\2\u0258\u025a\7\26\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2"+
		"\u025a\u0260\3\2\2\2\u025b\u0261\7#\2\2\u025c\u025d\5\22\n\2\u025d\u025e"+
		"\7\27\2\2\u025e\u025f\5\22\n\2\u025f\u0261\3\2\2\2\u0260\u025b\3\2\2\2"+
		"\u0260\u025c\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0263\7\26\2\2\u0263\u0265"+
		"\5<\37\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266"+
		"\u0268\7\37\2\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026b\3"+
		"\2\2\2\u0269\u026a\7\26\2\2\u026a\u026c\5<\37\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c=\3\2\2\2\u026d\u0271\5@!\2\u026e\u0271\5B\"\2\u026f"+
		"\u0271\5D#\2\u0270\u026d\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2"+
		"\2\u0271\u0274\3\2\2\2\u0272\u0275\5\b\5\2\u0273\u0275\5\64\33\2\u0274"+
		"\u0272\3\2\2\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0278\5H"+
		"%\2\u0277\u0270\3\2\2\2\u0277\u0276\3\2\2\2\u0278?\3\2\2\2\u0279\u027a"+
		"\7\16\2\2\u027a\u027b\7\36\2\2\u027b\u027c\5<\37\2\u027c\u027d\7\37\2"+
		"\2\u027dA\3\2\2\2\u027e\u027f\7\17\2\2\u027f\u0280\7\36\2\2\u0280\u0281"+
		"\5<\37\2\u0281\u0282\7\37\2\2\u0282C\3\2\2\2\u0283\u0284\7\r\2\2\u0284"+
		"\u0285\7\36\2\2\u0285\u0286\7\25\2\2\u0286\u0287\7\31\2\2\u0287\u0288"+
		"\t\2\2\2\u0288\u0289\7\32\2\2\u0289\u028a\5<\37\2\u028a\u028b\7\32\2\2"+
		"\u028b\u028c\5\36\20\2\u028c\u028d\7\37\2\2\u028dE\3\2\2\2\u028e\u028f"+
		"\7\21\2\2\u028fG\3\2\2\2\u0290\u0293\5@!\2\u0291\u0294\5\b\5\2\u0292\u0294"+
		"\5\64\33\2\u0293\u0291\3\2\2\2\u0293\u0292\3\2\2\2\u0294\u0295\3\2\2\2"+
		"\u0295\u0298\5F$\2\u0296\u0299\5\b\5\2\u0297\u0299\5\64\33\2\u0298\u0296"+
		"\3\2\2\2\u0298\u0297\3\2\2\2\u0299I\3\2\2\2hMU[ahmsx\177\u0086\u008e\u0095"+
		"\u009c\u009f\u00a7\u00aa\u00bc\u00c0\u00c9\u00cc\u00dc\u00e0\u00e7\u00ec"+
		"\u00ee\u00f5\u00fa\u00fc\u00fe\u0103\u0108\u010b\u010f\u0118\u011d\u0125"+
		"\u0129\u012e\u0132\u0137\u013f\u0143\u0148\u014a\u0150\u0153\u0157\u015a"+
		"\u015e\u0163\u0167\u016b\u016f\u0174\u0178\u017d\u0182\u0186\u018f\u0193"+
		"\u0199\u01a3\u01ab\u01b6\u01bc\u01c2\u01c8\u01ce\u01d4\u01d6\u01e0\u01e7"+
		"\u01ec\u01f5\u01f8\u01fc\u0204\u0207\u0211\u0219\u021c\u0226\u0229\u022b"+
		"\u0231\u0235\u023d\u0241\u0246\u024e\u0253\u0256\u0259\u0260\u0264\u0267"+
		"\u026b\u0270\u0274\u0277\u0293\u0298";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}