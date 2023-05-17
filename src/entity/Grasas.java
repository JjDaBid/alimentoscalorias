package entity;

import classes.Alimento;

public class Grasas extends Alimento{
    
    private String Origen;

    public Grasas(String Origen, int idAlimentos, String nombreAlimento, String clasificacion, double calorias, double proteinas, double grasa, double carbohidratos) {
        super(idAlimentos, nombreAlimento, clasificacion, calorias, proteinas, grasa, carbohidratos);
        this.Origen = Origen;
    }

    public Grasas() {
    }
    
    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }
    
    
}
