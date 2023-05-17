package classes;


public class Alimento {
    
    private static int nextIdAlimento = 1;
    private int idAlimentos;
    private String nombreAlimento;
    private String clasificacion;
    private double calorias;
    private double proteinas;
    private double grasa;
    private double carbohidratos;

    public Alimento(int idAlimentos, String nombreAlimento, String clasificacion, double claorias, double proteinas, double grasa, double carbohidratos) {
        this.idAlimentos = nextIdAlimento;
        this.nombreAlimento = nombreAlimento;
        this.clasificacion = clasificacion;
        this.calorias = claorias;
        this.proteinas = proteinas;
        this.grasa = grasa;
        this.carbohidratos = carbohidratos;
        nextIdAlimento++;        
    }
    
    public Alimento(){
        
    }
    
    

    public int getIdAlimentos() {
        return idAlimentos;
    }

    public void setIdAlimentos(int idAlimentos) {
        this.idAlimentos = idAlimentos;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGrasa() {
        return grasa;
    }

    public void setGrasa(double grasa) {
        this.grasa = grasa;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }
    
    
    
    
    
    
    
}
