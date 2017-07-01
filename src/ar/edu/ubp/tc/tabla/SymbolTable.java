package ar.edu.ubp.tc.tabla;

import java.awt.BorderLayout;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class SymbolTable {

    protected Stack<Scope> scopeStack;
    protected ArrayList<Scope> allScopes;
    protected ArrayList<Function> allFunction;
    protected int genId;

    public SymbolTable() {
        System.out.println("--------Tabla de symbolos--------");
        init();
    }

    protected void init() {
        scopeStack = new Stack<>();
        allScopes = new ArrayList<>();
        allFunction = new ArrayList<>();
        genId = 0;

        Scope globals = new Scope(ScopeType.GLOBAL, nextGenId(), null);
        scopeStack.push(globals);
        allScopes.add(globals);
    }
    
    public void AddFunction(Function func){
        allFunction.add(func);
    }
    
    public Boolean setUsed(String name){
        for(Function a : allFunction) 
        {
          if(a.getName().equals(name))
          { 
            a.setUsed();
            return true;
          }
        }
        return false;
    }

    public Boolean setDefined(String name)
    {
        for(Function a : allFunction) 
        {
          if(a.getName().equals(name))
          {
              a.setDefined();
              return true;
          }
        }
        return false;
    }
    
    public Scope pushScope() {
       // System.out.println("Scope creado");
        Scope enclosingScope = scopeStack.peek();
        Scope scope = new Scope(ScopeType.LOCAL, nextGenId(), enclosingScope);
        scopeStack.push(scope);
        allScopes.add(scope);
        return scope;
    }

    public void popScope() {
        //if(scopeStack.size() > 0)
            scopeStack.pop();
        //else { System.out.println("Global"); }
    }

    public Scope currentScope() {
        if (scopeStack.size() > 0) {
            return scopeStack.peek();
        }
        //Log.error(this, "Unbalanced scope stack.");
        return allScopes.get(0);
    }

    public Scope getScope(int genId) {
        for (Scope scope : scopeStack) {
            if (scope.getGenId() == genId) return scope;
        }
        return null;
    }

    private int nextGenId() {
        genId++;
        return genId;
    }

    
    public String imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for(int i = 0; i < allScopes.size(); i++){
            Scope aux = allScopes.get(i);
            while(aux != null)
            {
                sb.append(aux.toString());
                aux = aux.enclosingScope();
            }
            sb.append("\n\n");
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Function a : allFunction)
        {
            sb.append(a.toString());
        }
//        for (Scope scope : scopeStack.subList(0, scopeStack.size() )) {
          for (int i=0; i < scopeStack.size(); i++){  
            sb.append(scopeStack.get(i).toString());
           
        }
        return sb.toString();
    }
    
    public String varNotUsed()
    {
        StringBuilder sb = new StringBuilder();
        for(Scope sc : allScopes)
        {
         for(int i = 0; i< sc.getMap().size(); i++)
         {
            ArrayList<String> keys = new ArrayList<>(sc.getMap().keySet());
            for(String name : keys)
            {
                if(sc.resolve(name) != null && sc.resolve(name).getUsed() == false)  
                    sb.append("Advertencia, variable " + name + " no usada. \n"); 
            }
        
            
        }
        }
        return sb.toString();
    }
}
