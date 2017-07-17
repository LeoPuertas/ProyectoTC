// Generated from C:\Users\PC\Desktop\PEF\JavaApplication5\src\ar\edu\u005Cubp\tc\Final\Sintactico.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc.Final;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SintacticoLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ENTERO", "FLOTANTE", "TIPODEDATO", "'int'", "'float'", "'double'", "'bool'", 
		"'char'", "CARACTER", "CADENA", "'for'", "'if'", "'while'", "'do'", "'else'", 
		"'switch'", "'case'", "'return'", "ID", "OPLOGICAS", "COMPARACIONES", 
		"OPMATEMATICAS", "ASIGNACION", "';'", "','", "'['", "']'", "'('", "')'", 
		"'{'", "'}'", "VALOR", "TRUEFALSE", "WS"
	};
	public static final String[] ruleNames = {
		"NUMERO", "LETRA", "SIGNO", "ENTERO", "FLOTANTE", "TIPODEDATO", "TIPO_INT", 
		"TIPO_FLOAT", "TIPO_DOUBLE", "TIPO_BOOL", "TIPO_CHAR", "CARACTER", "CADENA", 
		"PARA", "SI", "MIENTRAS", "HACER", "SINO", "SWITC", "CASO", "RETURNO", 
		"ID", "OPLOGICAS", "COMPARACIONES", "OPMATEMATICAS", "ASIGNACION", "PUNTOYCOMA", 
		"COMA", "CORCHETEA", "CORCHETEC", "PARENTESISA", "PARENTESISC", "LLAVEA", 
		"LLAVEC", "VALOR", "TRUEFALSE", "WS"
	};


	public SintacticoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sintactico.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0128\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\5\5U\n"+
		"\5\3\5\6\5X\n\5\r\5\16\5Y\3\6\3\6\3\6\6\6_\n\6\r\6\16\6`\5\6c\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00a3\n\16\f\16\16"+
		"\16\u00a6\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\5\27\u00d4\n\27\3\27\3\27\3\27\6\27\u00d9\n"+
		"\27\r\27\16\27\u00da\5\27\u00dd\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00e4"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ef\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00f6\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0101\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\5$\u0118\n$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u0123\n%\3&\3&\3&\3&\2\2\'\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21"+
		"\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/"+
		"\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$\3\2\b\3\2\62"+
		";\4\2C\\c|\4\2--//\4\2>>@@\6\2\'\',-//\61\61\5\2\f\f\17\17\"\"\u0145\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O"+
		"\3\2\2\2\7Q\3\2\2\2\tT\3\2\2\2\13[\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2"+
		"\21\u0084\3\2\2\2\23\u008a\3\2\2\2\25\u0091\3\2\2\2\27\u0096\3\2\2\2\31"+
		"\u009b\3\2\2\2\33\u009f\3\2\2\2\35\u00a9\3\2\2\2\37\u00ad\3\2\2\2!\u00b0"+
		"\3\2\2\2#\u00b6\3\2\2\2%\u00b9\3\2\2\2\'\u00be\3\2\2\2)\u00c5\3\2\2\2"+
		"+\u00ca\3\2\2\2-\u00d3\3\2\2\2/\u00e3\3\2\2\2\61\u00ee\3\2\2\2\63\u00f5"+
		"\3\2\2\2\65\u0100\3\2\2\2\67\u0102\3\2\2\29\u0104\3\2\2\2;\u0106\3\2\2"+
		"\2=\u0108\3\2\2\2?\u010a\3\2\2\2A\u010c\3\2\2\2C\u010e\3\2\2\2E\u0110"+
		"\3\2\2\2G\u0117\3\2\2\2I\u0122\3\2\2\2K\u0124\3\2\2\2MN\t\2\2\2N\4\3\2"+
		"\2\2OP\t\3\2\2P\6\3\2\2\2QR\t\4\2\2R\b\3\2\2\2SU\5\7\4\2TS\3\2\2\2TU\3"+
		"\2\2\2UW\3\2\2\2VX\5\3\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\n"+
		"\3\2\2\2[b\5\t\5\2\\^\7\60\2\2]_\5\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2ac\3\2\2\2b\\\3\2\2\2bc\3\2\2\2c\f\3\2\2\2de\7k\2\2ef\7p\2\2"+
		"f\177\7v\2\2gh\7x\2\2hi\7q\2\2ij\7k\2\2j\177\7f\2\2kl\7h\2\2lm\7n\2\2"+
		"mn\7q\2\2no\7c\2\2o\177\7v\2\2pq\7f\2\2qr\7q\2\2rs\7w\2\2st\7d\2\2tu\7"+
		"n\2\2u\177\7g\2\2vw\7d\2\2wx\7q\2\2xy\7q\2\2y\177\7n\2\2z{\7e\2\2{|\7"+
		"j\2\2|}\7c\2\2}\177\7t\2\2~d\3\2\2\2~g\3\2\2\2~k\3\2\2\2~p\3\2\2\2~v\3"+
		"\2\2\2~z\3\2\2\2\177\16\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2"+
		"\u0082\u0083\7v\2\2\u0083\20\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086\7"+
		"n\2\2\u0086\u0087\7q\2\2\u0087\u0088\7c\2\2\u0088\u0089\7v\2\2\u0089\22"+
		"\3\2\2\2\u008a\u008b\7f\2\2\u008b\u008c\7q\2\2\u008c\u008d\7w\2\2\u008d"+
		"\u008e\7d\2\2\u008e\u008f\7n\2\2\u008f\u0090\7g\2\2\u0090\24\3\2\2\2\u0091"+
		"\u0092\7d\2\2\u0092\u0093\7q\2\2\u0093\u0094\7q\2\2\u0094\u0095\7n\2\2"+
		"\u0095\26\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7j\2\2\u0098\u0099\7"+
		"c\2\2\u0099\u009a\7t\2\2\u009a\30\3\2\2\2\u009b\u009c\7)\2\2\u009c\u009d"+
		"\5\5\3\2\u009d\u009e\7)\2\2\u009e\32\3\2\2\2\u009f\u00a4\7$\2\2\u00a0"+
		"\u00a3\5\5\3\2\u00a1\u00a3\5\3\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7$\2\2\u00a8\34\3\2\2\2"+
		"\u00a9\u00aa\7h\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\36\3\2"+
		"\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7h\2\2\u00af \3\2\2\2\u00b0\u00b1"+
		"\7y\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"$\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd&\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7y\2\2\u00c0"+
		"\u00c1\7k\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7j\2\2"+
		"\u00c4(\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7u\2"+
		"\2\u00c8\u00c9\7g\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7"+
		"g\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0,\3\2\2\2\u00d1\u00d4\5\5\3\2\u00d2\u00d4\7a\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00dc\3\2\2\2\u00d5\u00d9\5\5\3\2\u00d6"+
		"\u00d9\5\3\2\2\u00d7\u00d9\7a\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd.\3\2\2\2\u00de\u00df\7(\2\2\u00df\u00e4\7(\2\2\u00e0\u00e1"+
		"\7~\2\2\u00e1\u00e4\7~\2\2\u00e2\u00e4\7#\2\2\u00e3\u00de\3\2\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7?\2\2"+
		"\u00e6\u00ef\7?\2\2\u00e7\u00e8\7#\2\2\u00e8\u00ef\7?\2\2\u00e9\u00ea"+
		"\7>\2\2\u00ea\u00ef\7?\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ef\7?\2\2\u00ed"+
		"\u00ef\t\5\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00e9\3\2"+
		"\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\62\3\2\2\2\u00f0\u00f6"+
		"\t\6\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f6\7-\2\2\u00f3\u00f4\7/\2\2\u00f4"+
		"\u00f6\7/\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\64\3\2\2\2\u00f7\u0101\7?\2\2\u00f8\u00f9\7/\2\2\u00f9\u0101"+
		"\7?\2\2\u00fa\u00fb\7-\2\2\u00fb\u0101\7?\2\2\u00fc\u00fd\7,\2\2\u00fd"+
		"\u0101\7?\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0101\7?\2\2\u0100\u00f7\3\2"+
		"\2\2\u0100\u00f8\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fc\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\66\3\2\2\2\u0102\u0103\7=\2\2\u01038\3\2\2\2\u0104"+
		"\u0105\7.\2\2\u0105:\3\2\2\2\u0106\u0107\7]\2\2\u0107<\3\2\2\2\u0108\u0109"+
		"\7_\2\2\u0109>\3\2\2\2\u010a\u010b\7*\2\2\u010b@\3\2\2\2\u010c\u010d\7"+
		"+\2\2\u010dB\3\2\2\2\u010e\u010f\7}\2\2\u010fD\3\2\2\2\u0110\u0111\7\177"+
		"\2\2\u0111F\3\2\2\2\u0112\u0118\5\t\5\2\u0113\u0118\5\13\6\2\u0114\u0118"+
		"\5\31\r\2\u0115\u0118\5\33\16\2\u0116\u0118\5I%\2\u0117\u0112\3\2\2\2"+
		"\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118H\3\2\2\2\u0119\u011a\7v\2\2\u011a\u011b\7t\2\2\u011b\u011c"+
		"\7w\2\2\u011c\u0123\7g\2\2\u011d\u011e\7h\2\2\u011e\u011f\7c\2\2\u011f"+
		"\u0120\7n\2\2\u0120\u0121\7u\2\2\u0121\u0123\7g\2\2\u0122\u0119\3\2\2"+
		"\2\u0122\u011d\3\2\2\2\u0123J\3\2\2\2\u0124\u0125\t\7\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\b&\2\2\u0127L\3\2\2\2\24\2TY`b~\u00a2\u00a4\u00d3"+
		"\u00d8\u00da\u00dc\u00e3\u00ee\u00f5\u0100\u0117\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}