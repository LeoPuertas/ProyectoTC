/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.ubp.tc.tabla;
import java.util.*;


/**
 *
 * @author PC
 */
public class Function {
    
    protected String name;
    protected String type;
    protected Boolean declared;
    protected Boolean defined;
    protected Boolean used;
    protected List<String> arguments;
    
    public Function(String name, String type, String parametros){
        this.name = name;
        this.type = type;
        this.declared = true;
        int cant = parametros.contains(",") ?parametros.split(",").length : 0; 
        for(int i = 0; i < cant ;i++)
        {
            arguments.add(parametros.split(",")[i]);
        }
    }
    
    public Function(String name, String type){
        this.name = name;
        this.type = type;
        this.declared = true;
        this.arguments = null;
        
    }
    
    public void setUsed(){
        this.used = true;
    }
    
    public String getName() {
        return name;
    }
    
    public void setDefined(){
        this.defined = true;
    }
    
    public List<String> getList(){
        return this.arguments;
    }
    
    public String toString(){
        return "Funcion: " + this.name + " Definida: " + this.defined + " Usada: " + this.used + " \n";
    }
}
