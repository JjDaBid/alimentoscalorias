package entity;

import classes.Alimento;

public class FrutasYVerduras extends Alimento {
    
    private String tipo;
    private String naturaleza;

    public FrutasYVerduras(String tipo, String naturaleza, int idAlimentos, String nombreAlimento, String clasificacion, double calorias, double proteinas, double grasa, double carbohidratos) {
        super(idAlimentos, nombreAlimento, clasificacion, calorias, proteinas, grasa, carbohidratos);
        this.tipo = tipo;
        this.naturaleza = naturaleza;
    }

    public FrutasYVerduras(){
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setEsOrganico(String naturaleza) {
        this.naturaleza = naturaleza;
    }
        
}
