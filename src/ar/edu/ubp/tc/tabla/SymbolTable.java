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
    protected ArrayList<String> allVar;
    protected int genId;

    public SymbolTable() {
        System.out.println("--------ERRORES--------");
        init();
    }

    protected void init() {
        scopeStack = new Stack<>();
        allScopes = new ArrayList<>();
        allFunction = new ArrayList<>();
        allVar = new ArrayList<>();
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
            if(a.defined == true)
            {
                a.setUsed();
                return true;
            }
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

    public void addVar(String var){
        allVar.add(var);
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
        sb.append("\n---------------FUNCIONES--------------\n");
        for(Function a : allFunction)
        {
            sb.append(a.toString());
        }
        sb.append("\n---------------CONTEXTOS--------------\n");
        for(int i = 0; i < allScopes.size(); i++){
            Scope aux = allScopes.get(i);
            while(aux != null)
            {
                sb.append(aux.toString());
                aux = aux.enclosingScope();
            }
            sb.append("--------------------------------------\n");
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
    
    
    public Boolean verifType(String tipo1, String tipo2)
    {
        if(!tipo1.equals(tipo2))
        {
            if(tipo1.equals("int") || tipo1.equals("double"))
            {
              if(tipo2.equals("int") || tipo2.equals("double"))
                  return true;
              else
                  return false;
            }
            else
                return false;
        }
        else 
            return true;
    }
    
    public String notUsed()
    {
        StringBuilder sb = new StringBuilder();
        
        for(Function f : allFunction)
        {
            if(!f.getUsed() && !f.getName().equals("main"))
            {
                sb.append("Advertencia, funcion " + f.getName() + " no usada.\n");
            }
        }
        for(String s : allVar)
        {
         String id = s.split(";")[0];
         int idScope = Integer.parseInt(s.split(";")[1]);
                if(allScopes.get(idScope-1).resolve(id) != null && allScopes.get(idScope-1).resolve(id).getUsed() == false)  
                {
                    sb.append("Advertencia, variable " + id + " Scope " + idScope + " no usada. \n");
                }
         }
        return sb.toString();
        
    }

}
