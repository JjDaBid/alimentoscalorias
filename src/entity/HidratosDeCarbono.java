package entity;

import classes.Alimento;

public class HidratosDeCarbono extends Alimento{
    
    private String tipo;
    private String tienenGluten;

    public HidratosDeCarbono(String tipo, String tienenGluten, int idAlimentos, String nombreAlimento, String clasificacion, double calorias, double proteinas, double grasa, double carbohidratos) {
        super(idAlimentos, nombreAlimento, clasificacion, calorias, proteinas, grasa, carbohidratos);
        this.tipo = tipo;
        this.tienenGluten = tienenGluten;
    }

    public HidratosDeCarbono() {
    }
        
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTienenGluten() {
        return tienenGluten;
    }

    public void setTienenGluten(String tienenGluten) {
        this.tienenGluten = tienenGluten;
    }
    
    
    
}
