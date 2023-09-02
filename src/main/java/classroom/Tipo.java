package classroom;

public enum Tipo {
	DISCIPLINAR("DISCIPLINAR"),FUNDAMENTACION("FUNDAMENTACION"),ELECTIVA("ELECTIVA");
	
    private String nombre;
    
    private Tipo(String nombre) {
    	this.nombre=nombre;
    }
    
    public String getNombre() {
    	return nombre;
    }
    
	}
