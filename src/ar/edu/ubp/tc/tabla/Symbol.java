package ar.edu.ubp.tc.tabla;

public class Symbol {

    protected String name;
    protected String type;
    protected String value;
    protected Boolean init;
    protected Boolean used;
    
    public Symbol(String name, String type, String value) {
        this.name  = name;
        this.type  = type;
        this.value = value;
        this.init = true;
        this.used = false;
    }
    
    public void setValue(String value){
        this.value = value;
        this.init = true;
    }
    
    public Boolean getInit(){
        return this.init;
    }
    
    public Symbol(String name, String type) {
        this.name  = name;
        this.type  = type;
        this.init  = false;
        this.used = false;
    }


    public String getName() {
        return name;
    }

    public void setUsed(){
        if(this.init)
            this.used = true;
        else
            System.out.println("Error, variable " + this.name + " no inicializada, no se puede usar.");
    }
      public String toString() {
        return '<' + name + ":" + type + " | Valor:" + value + " | Usada: " + used + " > \n";
    }
    
      public Boolean getUsed()
      {
          return this.used;
      }
    
}
