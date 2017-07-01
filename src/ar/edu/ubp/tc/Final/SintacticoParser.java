// Generated from C:\Users\PC\Desktop\PEF\JavaApplication5\src\javaapplication5\Sintactico.g4 by ANTLR 4.2.2
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
		RULE_faltaparentesis2 = 7, RULE_datos = 8, RULE_operacion = 9, RULE_asignacion = 10, 
		RULE_variable = 11, RULE_parametros_funcion = 12, RULE_parametros_funcion_mal = 13, 
		RULE_declarar_variables = 14, RULE_declarar_funcion = 15, RULE_declarar_variable_mal = 16, 
		RULE_declarar_variable_mal_tipo = 17, RULE_parametros_funcion_decl = 18, 
		RULE_funcion = 19, RULE_llamada_funcion = 20, RULE_llamada_funcion_mal = 21, 
		RULE_bloque = 22, RULE_bloque_mal = 23, RULE_returno = 24, RULE_returno_mal = 25, 
		RULE_condicion = 26, RULE_estructuras_de_control = 27, RULE_si = 28, RULE_mientras = 29, 
		RULE_para = 30, RULE_sino = 31, RULE_si_entonces = 32;
	public static final String[] ruleNames = {
		"codigo", "instrucciones", "declaracion", "instruccion", "faltapuntoycoma", 
		"faltapuntoycoma2", "faltaparentesis", "faltaparentesis2", "datos", "operacion", 
		"asignacion", "variable", "parametros_funcion", "parametros_funcion_mal", 
		"declarar_variables", "declarar_funcion", "declarar_variable_mal", "declarar_variable_mal_tipo", 
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
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); instrucciones();
				}
				}
				setState(69); 
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
			setState(71); declaracion();
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
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); funcion();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(74); declarar_variables();
					}
					break;

				case 2:
					{
					setState(75); declarar_funcion();
					}
					break;

				case 3:
					{
					setState(76); variable();
					}
					break;
				}
				setState(79); match(PUNTOYCOMA);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); faltapuntoycoma();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82); faltaparentesis();
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
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(85); declarar_variables();
					}
					break;

				case 2:
					{
					setState(86); variable();
					}
					break;

				case 3:
					{
					setState(87); llamada_funcion();
					}
					break;

				case 4:
					{
					setState(88); operacion();
					}
					break;
				}
				setState(91); match(PUNTOYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); estructuras_de_control();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); faltapuntoycoma2();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); faltaparentesis2();
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
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); declarar_variables();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); declarar_funcion();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); variable();
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
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); declarar_variables();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); variable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); llamada_funcion();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106); operacion();
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
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(TIPODEDATO);
				setState(110); match(ID);
				setState(112);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(111); parametros_funcion();
					}
				}

				setState(114); match(PARENTESISC);
				setState(115); match(PUNTOYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(TIPODEDATO);
				setState(117); match(ID);
				setState(119);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(118); declarar_variables();
					}
				}

				setState(121); match(PARENTESISC);
				setState(122); bloque();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); match(TIPODEDATO);
				setState(124); match(ID);
				setState(126);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(125); parametros_funcion_decl();
					}
				}

				setState(128); match(PARENTESISC);
				setState(129); bloque();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130); match(TIPODEDATO);
				setState(131); match(ID);
				setState(132); match(PARENTESISA);
				setState(134);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(133); parametros_funcion();
					}
				}

				setState(136); match(PUNTOYCOMA);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137); match(TIPODEDATO);
				setState(138); match(ID);
				setState(139); match(PARENTESISA);
				setState(141);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(140); declarar_variables();
					}
				}

				setState(143); bloque();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144); match(TIPODEDATO);
				setState(145); match(ID);
				setState(146); match(PARENTESISA);
				setState(148);
				_la = _input.LA(1);
				if (_la==TIPODEDATO) {
					{
					setState(147); parametros_funcion_decl();
					}
				}

				setState(150); bloque();
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
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(ID);
				setState(162);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(154); match(ID);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(155); match(COMA);
						setState(156); match(ID);
						}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(164); match(PARENTESISC);
				setState(165); match(PUNTOYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				switch (_input.LA(1)) {
				case MIENTRAS:
					{
					setState(166); match(MIENTRAS);
					setState(167); condicion();
					setState(168); match(PARENTESISC);
					}
					break;
				case PARA:
					{
					setState(170); match(PARA);
					setState(171); match(ID);
					setState(172); match(ASIGNACION);
					setState(173);
					_la = _input.LA(1);
					if ( !(_la==ENTERO || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(174); match(PUNTOYCOMA);
					setState(175); condicion();
					setState(176); match(PUNTOYCOMA);
					setState(177); variable();
					setState(178); match(PARENTESISC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case TRUEFALSE:
					{
					setState(182); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(183); bloque();
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
				setState(186); match(ID);
				setState(187); match(PARENTESISA);
				setState(196);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(188); match(ID);
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(189); match(COMA);
						setState(190); match(ID);
						}
						}
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(198); match(PUNTOYCOMA);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				switch (_input.LA(1)) {
				case MIENTRAS:
					{
					setState(199); match(MIENTRAS);
					setState(200); match(PARENTESISA);
					setState(201); condicion();
					}
					break;
				case PARA:
					{
					setState(202); match(PARA);
					setState(203); match(PARENTESISA);
					setState(204); match(ID);
					setState(205); match(ASIGNACION);
					setState(206);
					_la = _input.LA(1);
					if ( !(_la==ENTERO || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(207); match(PUNTOYCOMA);
					setState(208); condicion();
					setState(209); match(PUNTOYCOMA);
					setState(210); variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(216);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case TRUEFALSE:
					{
					setState(214); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(215); bloque();
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
				setState(218); match(SI);
				setState(219); match(PARENTESISA);
				setState(220); condicion();
				setState(223);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case TRUEFALSE:
					{
					setState(221); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(222); bloque();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(225); match(SINO);
					setState(228);
					switch (_input.LA(1)) {
					case ENTERO:
					case FLOTANTE:
					case TIPODEDATO:
					case CARACTER:
					case PARA:
					case SI:
					case MIENTRAS:
					case ID:
					case TRUEFALSE:
						{
						setState(226); instruccion();
						}
						break;
					case LLAVEA:
						{
						setState(227); bloque();
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
				setState(232); match(SI);
				setState(233); condicion();
				setState(234); match(PARENTESISC);
				setState(237);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case TRUEFALSE:
					{
					setState(235); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(236); bloque();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(239); match(SINO);
					setState(242);
					switch (_input.LA(1)) {
					case ENTERO:
					case FLOTANTE:
					case TIPODEDATO:
					case CARACTER:
					case PARA:
					case SI:
					case MIENTRAS:
					case ID:
					case TRUEFALSE:
						{
						setState(240); instruccion();
						}
						break;
					case LLAVEA:
						{
						setState(241); bloque();
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
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); llamada_funcion();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); llamada_funcion_mal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); datos();
			setState(254); match(OPMATEMATICAS);
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(255); datos();
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(ASIGNACION);
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(260); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(259); operacion();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(262); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;

			case 2:
				{
				setState(264); datos();
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
		enterRule(_localctx, 22, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(ID);
			setState(269);
			_la = _input.LA(1);
			if (_la==ASIGNACION) {
				{
				setState(268); asignacion();
				}
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
		enterRule(_localctx, 24, RULE_parametros_funcion);
		int _la;
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(271); match(TIPODEDATO);
				setState(273);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(272); match(ID);
					}
				}

				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(275); match(COMA);
					setState(276); match(TIPODEDATO);
					setState(278);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(277); match(ID);
						}
					}

					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285); parametros_funcion_mal();
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
		enterRule(_localctx, 26, RULE_parametros_funcion_mal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(TIPODEDATO);
			setState(290);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(289); match(ID);
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(292); match(COMA);
				setState(293); match(TIPODEDATO);
				setState(295);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(294); match(ID);
					}
				}

				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(302); match(TIPODEDATO);
			setState(304);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(303); match(ID);
				}
			}

			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(306); match(COMA);
				setState(307); match(TIPODEDATO);
				setState(309);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(308); match(ID);
					}
				}

				}
				}
				setState(315);
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
		enterRule(_localctx, 28, RULE_declarar_variables);
		int _la;
		try {
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); match(TIPODEDATO);
				setState(317); variable();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(318); match(COMA);
					setState(319); variable();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); declarar_variable_mal();
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
		enterRule(_localctx, 30, RULE_declarar_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(TIPODEDATO);
			setState(329); match(ID);
			setState(330); match(PARENTESISA);
			setState(332);
			_la = _input.LA(1);
			if (_la==TIPODEDATO) {
				{
				setState(331); parametros_funcion();
				}
			}

			setState(334); match(PARENTESISC);
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
		enterRule(_localctx, 32, RULE_declarar_variable_mal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(TIPODEDATO);
			setState(337); variable();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(338); match(COMA);
				setState(339); variable();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345); variable();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(346); match(COMA);
				setState(347); variable();
				}
				}
				setState(352);
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
		enterRule(_localctx, 34, RULE_declarar_variable_mal_tipo);
		int _la;
		try {
			setState(393);
			switch (_input.LA(1)) {
			case TIPO_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); match(TIPO_INT);
				setState(354); match(ID);
				{
				setState(355); match(ASIGNACION);
				setState(356);
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
				setState(357); match(TIPO_CHAR);
				setState(358); match(ID);
				setState(361);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(359); match(ASIGNACION);
					setState(360);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TRUEFALSE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(367);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(363); match(COMA);
					setState(364); match(ID);
					setState(365); match(ASIGNACION);
					setState(366);
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
				setState(369);
				_la = _input.LA(1);
				if ( !(_la==TIPO_FLOAT || _la==TIPO_DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(370); match(ID);
				setState(373);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(371); match(ASIGNACION);
					setState(372);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << CARACTER) | (1L << TRUEFALSE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(379);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(375); match(COMA);
					setState(376); match(ID);
					setState(377); match(ASIGNACION);
					setState(378);
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
				setState(381); match(TIPO_BOOL);
				setState(382); match(ID);
				setState(385);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(383); match(ASIGNACION);
					setState(384);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << CARACTER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(391);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(387); match(COMA);
					setState(388); match(ID);
					setState(389); match(ASIGNACION);
					setState(390);
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
		enterRule(_localctx, 36, RULE_parametros_funcion_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(395); match(TIPODEDATO);
			setState(396); variable();
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(398); match(COMA);
				setState(399); match(TIPODEDATO);
				setState(400); variable();
				}
				}
				setState(405);
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
		enterRule(_localctx, 38, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(TIPODEDATO);
			setState(407); match(ID);
			setState(408); match(PARENTESISA);
			setState(410);
			_la = _input.LA(1);
			if (_la==TIPODEDATO) {
				{
				setState(409); parametros_funcion_decl();
				}
			}

			setState(412); match(PARENTESISC);
			setState(415);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(413); bloque_mal();
				}
				break;

			case 2:
				{
				setState(414); bloque();
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
		enterRule(_localctx, 40, RULE_llamada_funcion);
		int _la;
		try {
			setState(431);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417); match(ID);
				setState(418); match(PARENTESISA);
				setState(427);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(419); match(ID);
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(420); match(COMA);
						setState(421); match(ID);
						}
						}
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(429); match(PARENTESISC);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430); llamada_funcion_mal();
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
		enterRule(_localctx, 42, RULE_llamada_funcion_mal);
		int _la;
		try {
			int _alt;
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433); match(ID);
				setState(442);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(434); match(ID);
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(435); match(COMA);
						setState(436); match(ID);
						}
						}
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(444); match(PARENTESISC);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445); match(ID);
				setState(446); match(PARENTESISA);
				setState(463);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(447); match(ID);
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(448); match(COMA);
						setState(449); match(ID);
						}
						}
						setState(454);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(455); match(ID);
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(456); match(COMA);
						setState(457); match(ID);
						}
						}
						setState(462);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(465); match(PARENTESISC);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466); match(ID);
				setState(467); match(PARENTESISA);
				setState(476);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(468); match(ID);
					setState(473);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(469); match(COMA);
							setState(470); match(ID);
							}
							} 
						}
						setState(475);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 44, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); match(LLAVEA);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << TIPODEDATO) | (1L << CARACTER) | (1L << PARA) | (1L << SI) | (1L << MIENTRAS) | (1L << ID) | (1L << TRUEFALSE))) != 0)) {
				{
				{
				setState(481); instruccion();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			_la = _input.LA(1);
			if (_la==RETURNO) {
				{
				setState(487); returno();
				}
			}

			setState(490); match(LLAVEC);
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
		enterRule(_localctx, 46, RULE_bloque_mal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(LLAVEA);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493); instruccion();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(500);
			_la = _input.LA(1);
			if (_la==RETURNO) {
				{
				setState(499); returno();
				}
			}

			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502); instruccion();
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 48, RULE_returno);
		try {
			setState(513);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508); match(RETURNO);
				setState(509); datos();
				setState(510); match(PUNTOYCOMA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512); returno_mal();
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
		enterRule(_localctx, 50, RULE_returno_mal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); match(RETURNO);
			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(516); datos();
				}
				break;

			case 2:
				{
				setState(517); match(PUNTOYCOMA);
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
		enterRule(_localctx, 52, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if (_la==PARENTESISA) {
				{
				setState(520); match(PARENTESISA);
				}
			}

			setState(524);
			_la = _input.LA(1);
			if (_la==OPLOGICAS) {
				{
				setState(523); match(OPLOGICAS);
				}
			}

			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(526); match(TRUEFALSE);
				}
				break;

			case 2:
				{
				{
				setState(527); datos();
				}
				setState(528); match(COMPARACIONES);
				{
				setState(529); datos();
				}
				}
				break;
			}
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(533); match(OPLOGICAS);
				setState(534); condicion();
				}
				break;
			}
			setState(538);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(537); match(PARENTESISC);
				}
				break;
			}
			setState(542);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(540); match(OPLOGICAS);
				setState(541); condicion();
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
		enterRule(_localctx, 54, RULE_estructuras_de_control);
		try {
			setState(554);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				switch (_input.LA(1)) {
				case SI:
					{
					setState(544); si();
					}
					break;
				case MIENTRAS:
					{
					setState(545); mientras();
					}
					break;
				case PARA:
					{
					setState(546); para();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(551);
				switch (_input.LA(1)) {
				case ENTERO:
				case FLOTANTE:
				case TIPODEDATO:
				case CARACTER:
				case PARA:
				case SI:
				case MIENTRAS:
				case ID:
				case TRUEFALSE:
					{
					setState(549); instruccion();
					}
					break;
				case LLAVEA:
					{
					setState(550); bloque();
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
				setState(553); si_entonces();
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
		enterRule(_localctx, 56, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); match(SI);
			setState(557); match(PARENTESISA);
			setState(558); condicion();
			setState(559); match(PARENTESISC);
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
		enterRule(_localctx, 58, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561); match(MIENTRAS);
			setState(562); match(PARENTESISA);
			setState(563); condicion();
			setState(564); match(PARENTESISC);
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
		enterRule(_localctx, 60, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566); match(PARA);
			setState(567); match(PARENTESISA);
			setState(568); match(ID);
			setState(569); match(ASIGNACION);
			setState(570);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(571); match(PUNTOYCOMA);
			setState(572); condicion();
			setState(573); match(PUNTOYCOMA);
			setState(574); variable();
			setState(575); match(PARENTESISC);
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
		enterRule(_localctx, 62, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(SINO);
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
		enterRule(_localctx, 64, RULE_si_entonces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); si();
			setState(582);
			switch (_input.LA(1)) {
			case ENTERO:
			case FLOTANTE:
			case TIPODEDATO:
			case CARACTER:
			case PARA:
			case SI:
			case MIENTRAS:
			case ID:
			case TRUEFALSE:
				{
				setState(580); instruccion();
				}
				break;
			case LLAVEA:
				{
				setState(581); bloque();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(584); sino();
			setState(587);
			switch (_input.LA(1)) {
			case ENTERO:
			case FLOTANTE:
			case TIPODEDATO:
			case CARACTER:
			case PARA:
			case SI:
			case MIENTRAS:
			case ID:
			case TRUEFALSE:
				{
				setState(585); instruccion();
				}
				break;
			case LLAVEA:
				{
				setState(586); bloque();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0250\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2F\n\2\r\2\16\2G\3\3\3\3\3\4\3\4\3\4\3\4\5\4P\n\4\3"+
		"\4\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5c\n\5\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\5"+
		"\bs\n\b\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0089\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0090\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t"+
		"\7\t\u00a0\n\t\f\t\16\t\u00a3\13\t\5\t\u00a5\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b7\n\t\3\t\3\t\5\t\u00bb"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c2\n\t\f\t\16\t\u00c5\13\t\5\t\u00c7\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d7\n"+
		"\t\3\t\3\t\5\t\u00db\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e2\n\t\3\t\3\t\3\t"+
		"\5\t\u00e7\n\t\5\t\u00e9\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f0\n\t\3\t\3\t"+
		"\3\t\5\t\u00f5\n\t\5\t\u00f7\n\t\5\t\u00f9\n\t\3\n\3\n\3\n\5\n\u00fe\n"+
		"\n\3\13\3\13\3\13\5\13\u0103\n\13\3\f\3\f\6\f\u0107\n\f\r\f\16\f\u0108"+
		"\3\f\5\f\u010c\n\f\3\r\3\r\5\r\u0110\n\r\3\16\3\16\5\16\u0114\n\16\3\16"+
		"\3\16\3\16\5\16\u0119\n\16\7\16\u011b\n\16\f\16\16\16\u011e\13\16\3\16"+
		"\5\16\u0121\n\16\3\17\3\17\5\17\u0125\n\17\3\17\3\17\3\17\5\17\u012a\n"+
		"\17\7\17\u012c\n\17\f\17\16\17\u012f\13\17\3\17\3\17\5\17\u0133\n\17\3"+
		"\17\3\17\3\17\5\17\u0138\n\17\7\17\u013a\n\17\f\17\16\17\u013d\13\17\3"+
		"\20\3\20\3\20\3\20\7\20\u0143\n\20\f\20\16\20\u0146\13\20\3\20\5\20\u0149"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u014f\n\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u0157\n\22\f\22\16\22\u015a\13\22\3\22\3\22\3\22\7\22\u015f\n\22"+
		"\f\22\16\22\u0162\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016c"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u0172\n\23\3\23\3\23\3\23\3\23\5\23\u0178"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u017e\n\23\3\23\3\23\3\23\3\23\5\23\u0184"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u018a\n\23\5\23\u018c\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u0194\n\24\f\24\16\24\u0197\13\24\3\25\3\25\3"+
		"\25\3\25\5\25\u019d\n\25\3\25\3\25\3\25\5\25\u01a2\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u01a9\n\26\f\26\16\26\u01ac\13\26\5\26\u01ae\n\26\3\26"+
		"\3\26\5\26\u01b2\n\26\3\27\3\27\3\27\3\27\7\27\u01b8\n\27\f\27\16\27\u01bb"+
		"\13\27\5\27\u01bd\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01c5\n\27\f"+
		"\27\16\27\u01c8\13\27\3\27\3\27\3\27\7\27\u01cd\n\27\f\27\16\27\u01d0"+
		"\13\27\5\27\u01d2\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01da\n\27\f"+
		"\27\16\27\u01dd\13\27\5\27\u01df\n\27\5\27\u01e1\n\27\3\30\3\30\7\30\u01e5"+
		"\n\30\f\30\16\30\u01e8\13\30\3\30\5\30\u01eb\n\30\3\30\3\30\3\31\3\31"+
		"\7\31\u01f1\n\31\f\31\16\31\u01f4\13\31\3\31\5\31\u01f7\n\31\3\31\7\31"+
		"\u01fa\n\31\f\31\16\31\u01fd\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u0204"+
		"\n\32\3\33\3\33\3\33\5\33\u0209\n\33\3\34\5\34\u020c\n\34\3\34\5\34\u020f"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u0216\n\34\3\34\3\34\5\34\u021a\n"+
		"\34\3\34\5\34\u021d\n\34\3\34\3\34\5\34\u0221\n\34\3\35\3\35\3\35\5\35"+
		"\u0226\n\35\3\35\3\35\5\35\u022a\n\35\3\35\5\35\u022d\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3\"\3\"\3\"\5\"\u0249\n\"\3\"\3\"\3\"\5\"\u024e\n\"\3\"\2\2#\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\t\4"+
		"\2\3\3\25\25\6\2\3\4\13\13\25\25##\5\2\4\4\13\13##\4\2\3\4##\3\2\7\b\5"+
		"\2\3\3\13\13##\4\2\3\4\13\13\u029e\2E\3\2\2\2\4I\3\2\2\2\6U\3\2\2\2\b"+
		"b\3\2\2\2\ng\3\2\2\2\fm\3\2\2\2\16\u0099\3\2\2\2\20\u00f8\3\2\2\2\22\u00fd"+
		"\3\2\2\2\24\u00ff\3\2\2\2\26\u0104\3\2\2\2\30\u010d\3\2\2\2\32\u0120\3"+
		"\2\2\2\34\u0122\3\2\2\2\36\u0148\3\2\2\2 \u014a\3\2\2\2\"\u0152\3\2\2"+
		"\2$\u018b\3\2\2\2&\u018d\3\2\2\2(\u0198\3\2\2\2*\u01b1\3\2\2\2,\u01e0"+
		"\3\2\2\2.\u01e2\3\2\2\2\60\u01ee\3\2\2\2\62\u0203\3\2\2\2\64\u0205\3\2"+
		"\2\2\66\u020b\3\2\2\28\u022c\3\2\2\2:\u022e\3\2\2\2<\u0233\3\2\2\2>\u0238"+
		"\3\2\2\2@\u0243\3\2\2\2B\u0245\3\2\2\2DF\5\4\3\2ED\3\2\2\2FG\3\2\2\2G"+
		"E\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IJ\5\6\4\2J\5\3\2\2\2KV\5(\25\2LP\5\36\20"+
		"\2MP\5 \21\2NP\5\30\r\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2PQ\3\2\2\2QR\7\32"+
		"\2\2RV\3\2\2\2SV\5\n\6\2TV\5\16\b\2UK\3\2\2\2UO\3\2\2\2US\3\2\2\2UT\3"+
		"\2\2\2V\7\3\2\2\2W\\\5\36\20\2X\\\5\30\r\2Y\\\5*\26\2Z\\\5\24\13\2[W\3"+
		"\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2]^\7\32\2\2^c\3\2\2\2_"+
		"c\58\35\2`c\5\f\7\2ac\5\20\t\2b[\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2"+
		"c\t\3\2\2\2dh\5\36\20\2eh\5 \21\2fh\5\30\r\2gd\3\2\2\2ge\3\2\2\2gf\3\2"+
		"\2\2h\13\3\2\2\2in\5\36\20\2jn\5\30\r\2kn\5*\26\2ln\5\24\13\2mi\3\2\2"+
		"\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\r\3\2\2\2op\7\5\2\2pr\7\25\2\2qs\5\32"+
		"\16\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\37\2\2u\u009a\7\32\2\2vw\7\5\2"+
		"\2wy\7\25\2\2xz\5\36\20\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\37\2\2|\u009a"+
		"\5.\30\2}~\7\5\2\2~\u0080\7\25\2\2\177\u0081\5&\24\2\u0080\177\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\37\2\2\u0083\u009a"+
		"\5.\30\2\u0084\u0085\7\5\2\2\u0085\u0086\7\25\2\2\u0086\u0088\7\36\2\2"+
		"\u0087\u0089\5\32\16\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u009a\7\32\2\2\u008b\u008c\7\5\2\2\u008c\u008d\7\25\2\2"+
		"\u008d\u008f\7\36\2\2\u008e\u0090\5\36\20\2\u008f\u008e\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009a\5.\30\2\u0092\u0093\7\5"+
		"\2\2\u0093\u0094\7\25\2\2\u0094\u0096\7\36\2\2\u0095\u0097\5&\24\2\u0096"+
		"\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\5."+
		"\30\2\u0099o\3\2\2\2\u0099v\3\2\2\2\u0099}\3\2\2\2\u0099\u0084\3\2\2\2"+
		"\u0099\u008b\3\2\2\2\u0099\u0092\3\2\2\2\u009a\17\3\2\2\2\u009b\u00a4"+
		"\7\25\2\2\u009c\u00a1\7\25\2\2\u009d\u009e\7\33\2\2\u009e\u00a0\7\25\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\37\2\2\u00a7\u00f9\7"+
		"\32\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\5\66\34\2\u00aa\u00ab\7\37\2"+
		"\2\u00ab\u00b7\3\2\2\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\7\25\2\2\u00ae"+
		"\u00af\7\31\2\2\u00af\u00b0\t\2\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\5"+
		"\66\34\2\u00b2\u00b3\7\32\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\7\37\2"+
		"\2\u00b5\u00b7\3\2\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00bb\5\b\5\2\u00b9\u00bb\5.\30\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00f9\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00c6\7"+
		"\36\2\2\u00be\u00c3\7\25\2\2\u00bf\u00c0\7\33\2\2\u00c0\u00c2\7\25\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00f9\7\32\2\2\u00c9\u00ca\7"+
		"\17\2\2\u00ca\u00cb\7\36\2\2\u00cb\u00d7\5\66\34\2\u00cc\u00cd\7\r\2\2"+
		"\u00cd\u00ce\7\36\2\2\u00ce\u00cf\7\25\2\2\u00cf\u00d0\7\31\2\2\u00d0"+
		"\u00d1\t\2\2\2\u00d1\u00d2\7\32\2\2\u00d2\u00d3\5\66\34\2\u00d3\u00d4"+
		"\7\32\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d7\3\2\2\2\u00d6\u00c9\3\2\2\2"+
		"\u00d6\u00cc\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00db\5\b\5\2\u00d9\u00db"+
		"\5.\30\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00f9\3\2\2\2\u00dc"+
		"\u00dd\7\16\2\2\u00dd\u00de\7\36\2\2\u00de\u00e1\5\66\34\2\u00df\u00e2"+
		"\5\b\5\2\u00e0\u00e2\5.\30\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e8\3\2\2\2\u00e3\u00e6\7\21\2\2\u00e4\u00e7\5\b\5\2\u00e5\u00e7\5"+
		".\30\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e3\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f9\3\2\2\2\u00ea\u00eb\7\16"+
		"\2\2\u00eb\u00ec\5\66\34\2\u00ec\u00ef\7\37\2\2\u00ed\u00f0\5\b\5\2\u00ee"+
		"\u00f0\5.\30\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f6\3\2"+
		"\2\2\u00f1\u00f4\7\21\2\2\u00f2\u00f5\5\b\5\2\u00f3\u00f5\5.\30\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f1\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u009b\3\2\2\2\u00f8"+
		"\u00b6\3\2\2\2\u00f8\u00bc\3\2\2\2\u00f8\u00d6\3\2\2\2\u00f8\u00dc\3\2"+
		"\2\2\u00f8\u00ea\3\2\2\2\u00f9\21\3\2\2\2\u00fa\u00fe\5*\26\2\u00fb\u00fe"+
		"\5,\27\2\u00fc\u00fe\t\3\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\23\3\2\2\2\u00ff\u0100\5\22\n\2\u0100\u0102\7\30"+
		"\2\2\u0101\u0103\5\22\n\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\25\3\2\2\2\u0104\u010b\7\31\2\2\u0105\u0107\5\24\13\2\u0106\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u010c\5\22\n\2\u010b\u0106\3\2\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\27\3\2\2\2\u010d\u010f\7\25\2\2\u010e\u0110\5\26\f\2\u010f"+
		"\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\31\3\2\2\2\u0111\u0113\7\5\2"+
		"\2\u0112\u0114\7\25\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u011c\3\2\2\2\u0115\u0116\7\33\2\2\u0116\u0118\7\5\2\2\u0117\u0119\7"+
		"\25\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0115\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0121\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\5\34\17\2\u0120"+
		"\u0111\3\2\2\2\u0120\u011f\3\2\2\2\u0121\33\3\2\2\2\u0122\u0124\7\5\2"+
		"\2\u0123\u0125\7\25\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u012d\3\2\2\2\u0126\u0127\7\33\2\2\u0127\u0129\7\5\2\2\u0128\u012a\7"+
		"\25\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\7\5\2\2\u0131"+
		"\u0133\7\25\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u013b\3"+
		"\2\2\2\u0134\u0135\7\33\2\2\u0135\u0137\7\5\2\2\u0136\u0138\7\25\2\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0134\3\2"+
		"\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\35\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7\5\2\2\u013f\u0144\5\30\r"+
		"\2\u0140\u0141\7\33\2\2\u0141\u0143\5\30\r\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0149\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0149\5\"\22\2\u0148\u013e\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\37\3\2\2\2\u014a\u014b\7\5\2\2\u014b\u014c\7\25\2"+
		"\2\u014c\u014e\7\36\2\2\u014d\u014f\5\32\16\2\u014e\u014d\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\37\2\2\u0151!\3\2\2\2"+
		"\u0152\u0153\7\5\2\2\u0153\u0158\5\30\r\2\u0154\u0155\7\33\2\2\u0155\u0157"+
		"\5\30\r\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u0160"+
		"\5\30\r\2\u015c\u015d\7\33\2\2\u015d\u015f\5\30\r\2\u015e\u015c\3\2\2"+
		"\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161#"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\6\2\2\u0164\u0165\7\25\2\2"+
		"\u0165\u0166\7\31\2\2\u0166\u018c\t\4\2\2\u0167\u0168\7\n\2\2\u0168\u016b"+
		"\7\25\2\2\u0169\u016a\7\31\2\2\u016a\u016c\t\5\2\2\u016b\u0169\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016c\u0171\3\2\2\2\u016d\u016e\7\33\2\2\u016e\u016f"+
		"\7\25\2\2\u016f\u0170\7\31\2\2\u0170\u0172\t\5\2\2\u0171\u016d\3\2\2\2"+
		"\u0171\u0172\3\2\2\2\u0172\u018c\3\2\2\2\u0173\u0174\t\6\2\2\u0174\u0177"+
		"\7\25\2\2\u0175\u0176\7\31\2\2\u0176\u0178\t\7\2\2\u0177\u0175\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u017d\3\2\2\2\u0179\u017a\7\33\2\2\u017a\u017b"+
		"\7\25\2\2\u017b\u017c\7\31\2\2\u017c\u017e\t\7\2\2\u017d\u0179\3\2\2\2"+
		"\u017d\u017e\3\2\2\2\u017e\u018c\3\2\2\2\u017f\u0180\7\t\2\2\u0180\u0183"+
		"\7\25\2\2\u0181\u0182\7\31\2\2\u0182\u0184\t\b\2\2\u0183\u0181\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184\u0189\3\2\2\2\u0185\u0186\7\33\2\2\u0186\u0187"+
		"\7\25\2\2\u0187\u0188\7\31\2\2\u0188\u018a\t\b\2\2\u0189\u0185\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0163\3\2\2\2\u018b\u0167"+
		"\3\2\2\2\u018b\u0173\3\2\2\2\u018b\u017f\3\2\2\2\u018c%\3\2\2\2\u018d"+
		"\u018e\7\5\2\2\u018e\u018f\5\30\r\2\u018f\u0195\3\2\2\2\u0190\u0191\7"+
		"\33\2\2\u0191\u0192\7\5\2\2\u0192\u0194\5\30\r\2\u0193\u0190\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\'\3\2\2\2"+
		"\u0197\u0195\3\2\2\2\u0198\u0199\7\5\2\2\u0199\u019a\7\25\2\2\u019a\u019c"+
		"\7\36\2\2\u019b\u019d\5&\24\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2"+
		"\u019d\u019e\3\2\2\2\u019e\u01a1\7\37\2\2\u019f\u01a2\5\60\31\2\u01a0"+
		"\u01a2\5.\30\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2)\3\2\2\2"+
		"\u01a3\u01a4\7\25\2\2\u01a4\u01ad\7\36\2\2\u01a5\u01aa\7\25\2\2\u01a6"+
		"\u01a7\7\33\2\2\u01a7\u01a9\7\25\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3"+
		"\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b2\7\37\2\2\u01b0\u01b2\5,\27\2\u01b1\u01a3\3\2\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2+\3\2\2\2\u01b3\u01bc\7\25\2\2\u01b4\u01b9\7\25\2"+
		"\2\u01b5\u01b6\7\33\2\2\u01b6\u01b8\7\25\2\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bd\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01b4\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01e1\7\37\2\2\u01bf\u01c0\7\25\2\2\u01c0\u01d1\7"+
		"\36\2\2\u01c1\u01c6\7\25\2\2\u01c2\u01c3\7\33\2\2\u01c3\u01c5\7\25\2\2"+
		"\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ce\7\25\2\2"+
		"\u01ca\u01cb\7\33\2\2\u01cb\u01cd\7\25\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d1\u01c1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01e1\7\37\2\2\u01d4\u01d5\7\25\2\2\u01d5\u01de\7\36\2\2\u01d6"+
		"\u01db\7\25\2\2\u01d7\u01d8\7\33\2\2\u01d8\u01da\7\25\2\2\u01d9\u01d7"+
		"\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01d6\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e1\3\2\2\2\u01e0\u01b3\3\2\2\2\u01e0\u01bf\3\2\2\2\u01e0"+
		"\u01d4\3\2\2\2\u01e1-\3\2\2\2\u01e2\u01e6\7 \2\2\u01e3\u01e5\5\b\5\2\u01e4"+
		"\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\5\62\32\2\u01ea"+
		"\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7!"+
		"\2\2\u01ed/\3\2\2\2\u01ee\u01f2\7 \2\2\u01ef\u01f1\5\b\5\2\u01f0\u01ef"+
		"\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\5\62\32\2\u01f6\u01f5\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01fa\5\b\5\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\61\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7\24\2\2\u01ff\u0200"+
		"\5\22\n\2\u0200\u0201\7\32\2\2\u0201\u0204\3\2\2\2\u0202\u0204\5\64\33"+
		"\2\u0203\u01fe\3\2\2\2\u0203\u0202\3\2\2\2\u0204\63\3\2\2\2\u0205\u0208"+
		"\7\24\2\2\u0206\u0209\5\22\n\2\u0207\u0209\7\32\2\2\u0208\u0206\3\2\2"+
		"\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\65\3\2\2\2\u020a\u020c"+
		"\7\36\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2"+
		"\u020d\u020f\7\26\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0215"+
		"\3\2\2\2\u0210\u0216\7#\2\2\u0211\u0212\5\22\n\2\u0212\u0213\7\27\2\2"+
		"\u0213\u0214\5\22\n\2\u0214\u0216\3\2\2\2\u0215\u0210\3\2\2\2\u0215\u0211"+
		"\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0218\7\26\2\2\u0218\u021a\5\66\34"+
		"\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d"+
		"\7\37\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0220\3\2\2\2"+
		"\u021e\u021f\7\26\2\2\u021f\u0221\5\66\34\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\67\3\2\2\2\u0222\u0226\5:\36\2\u0223\u0226\5<\37"+
		"\2\u0224\u0226\5> \2\u0225\u0222\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0224"+
		"\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u022a\5\b\5\2\u0228\u022a\5.\30\2\u0229"+
		"\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u022d\5B"+
		"\"\2\u022c\u0225\3\2\2\2\u022c\u022b\3\2\2\2\u022d9\3\2\2\2\u022e\u022f"+
		"\7\16\2\2\u022f\u0230\7\36\2\2\u0230\u0231\5\66\34\2\u0231\u0232\7\37"+
		"\2\2\u0232;\3\2\2\2\u0233\u0234\7\17\2\2\u0234\u0235\7\36\2\2\u0235\u0236"+
		"\5\66\34\2\u0236\u0237\7\37\2\2\u0237=\3\2\2\2\u0238\u0239\7\r\2\2\u0239"+
		"\u023a\7\36\2\2\u023a\u023b\7\25\2\2\u023b\u023c\7\31\2\2\u023c\u023d"+
		"\t\2\2\2\u023d\u023e\7\32\2\2\u023e\u023f\5\66\34\2\u023f\u0240\7\32\2"+
		"\2\u0240\u0241\5\30\r\2\u0241\u0242\7\37\2\2\u0242?\3\2\2\2\u0243\u0244"+
		"\7\21\2\2\u0244A\3\2\2\2\u0245\u0248\5:\36\2\u0246\u0249\5\b\5\2\u0247"+
		"\u0249\5.\30\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024d\5@!\2\u024b\u024e\5\b\5\2\u024c\u024e\5.\30\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024c\3\2\2\2\u024eC\3\2\2\2ZGOU[bgmry\u0080\u0088\u008f"+
		"\u0096\u0099\u00a1\u00a4\u00b6\u00ba\u00c3\u00c6\u00d6\u00da\u00e1\u00e6"+
		"\u00e8\u00ef\u00f4\u00f6\u00f8\u00fd\u0102\u0108\u010b\u010f\u0113\u0118"+
		"\u011c\u0120\u0124\u0129\u012d\u0132\u0137\u013b\u0144\u0148\u014e\u0158"+
		"\u0160\u016b\u0171\u0177\u017d\u0183\u0189\u018b\u0195\u019c\u01a1\u01aa"+
		"\u01ad\u01b1\u01b9\u01bc\u01c6\u01ce\u01d1\u01db\u01de\u01e0\u01e6\u01ea"+
		"\u01f2\u01f6\u01fb\u0203\u0208\u020b\u020e\u0215\u0219\u021c\u0220\u0225"+
		"\u0229\u022c\u0248\u024d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}