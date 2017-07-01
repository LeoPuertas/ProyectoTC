package ar.edu.ubp.tc.tabla;
 
import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {

    private final int genId;
    private ScopeType type;
    public Scope enclosingScope;
    protected Map<String, Symbol> symbolMap = new LinkedHashMap<String, Symbol>();

    public Scope(ScopeType type, final int genId, Scope enclosingScope) {
        this.type = type;
        this.genId = genId;
        this.enclosingScope = enclosingScope;
    }

    /** 
     * Define a new variable in the current scope 
     * This is the entry point for adding new variables
     */
/*    public void define(String name, ArrayList<String> parameters) {
        String params = Strings.asString(parameters, true, ".");
        Symbol symbol = new Symbol(null, name + params, null);
        define(symbol);
    }*/

    /** Define a symbol in the current scope */
    public void define(Symbol symbol) {
        //symbol.setScope(this);
        symbolMap.put(symbol.name, symbol);
    }

    
    public int getGenId(){
        return this.genId;
        
    } 
    /**
     * Look up the symbol name in this scope and, if not found, 
     * progressively search the enclosing scopes. 
     * Return null if not found in any applicable scope.
     */
    public Symbol resolve(String name) {
        Symbol symbol = symbolMap.get(name);
        if (symbol != null) return symbol;
        if (enclosingScope != null) return enclosingScope.resolve(name);
        return null; // not found
    }
    
    public Map getMap()
    {
        return symbolMap;
    }
    /**
     * Lookup a variable starting in the current scope.
     * This is the entry point for lookups
     */
  /*  public Symbol resolve(String name, ArrayList<String> parameters) {
        String params = Strings.asString(parameters, true, ".");
        return resolve(name + params);
    }*/

    /** Where to look next for symbols */
    public Scope enclosingScope() {
        return enclosingScope;
    }

    public String toString() {
        String cadena = "";
        for(String x : symbolMap.keySet()){
                cadena +=  resolve(x).toString();
        }
        return "Scope " + type + ": " + cadena + "\n";
    }
    
}






