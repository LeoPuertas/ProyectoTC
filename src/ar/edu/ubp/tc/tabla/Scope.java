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

    public void define(Symbol symbol) {
        
        symbolMap.put(symbol.name, symbol);
    }

    
    public int getGenId(){
        return this.genId;
        
    } 
    
    public Symbol resolve(String name) {
        Symbol symbol = symbolMap.get(name);
        if (symbol != null) return symbol;
        if (enclosingScope != null) return enclosingScope.resolve(name);
        return null; 
    }
    
    public String getType(String name)
    {
        return resolve(name) != null ? resolve(name).type : "";
    }
    
    public Map getMap()
    {
        return symbolMap;
    }
    public Scope enclosingScope() {
        return enclosingScope;
    }

    public String toString() {
        String cadena = "";
        for(String x : symbolMap.keySet()){
                cadena +=  resolve(x).toString();
        }
        return "Contexto " + genId + ": "  + type + ": \n" + cadena + "";
    }
    
}






