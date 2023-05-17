package Controller;


import entity.Grasas;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import services.GrasasImp;

public class GrasasController {
    
    private static GrasasImp grasasImp = new GrasasImp();
    
    
    public static boolean grasaClasificationValidator(String clasification, JPanel fatView) {
    boolean isValid = false;
    // Verificar si el producto corresponde a Grasas
        if (clasification.equals("Grasas")) {
            isValid = true;
        }
        if (isValid) {        
            return true;
        } else {
            JOptionPane.showMessageDialog(fatView, "El producto ingresado no corresponde a la clasificación Grasas", "Aviso", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static Grasas getGrasaById(int id){
        return grasasImp.getGrasaById(id);
    }
    
    
    public static boolean createGrasa(
            String origen,            
            int idGrasa,
            String nombreAlimento,            
            String clasificacion,
            double calorias,
            double proteinas,
            double grasa,
            double carbohidratos,
            JPanel fatView
    ){
        if(grasaClasificationValidator(clasificacion, fatView)){
            Grasas fat = new Grasas(origen, 0, nombreAlimento, 
                    clasificacion, calorias, proteinas, grasa, carbohidratos);            
            grasasImp.createGrasa(fat);
            return true;
        } return false;
    }
    
    public static Grasas updateGrasa(Grasas fat, JPanel fatForm){
        if(fat != null){
            System.out.println("2. Serecibe en el controlador");
            System.out.println("ID: " + fat.getNombreAlimento() + " Nombre: " + fat.getNombreAlimento());
            return grasasImp.updateGrasa(fat);
            
        } else {
            JOptionPane.showMessageDialog(fatForm, "Debe ingresar todos los campos");
            return null;
        }
    }
    
    public static void deleteGrasa(Grasas fat, JTable fatDataTable){
        grasasImp.deleteGrasa(fat.getNombreAlimento(), fatDataTable);        
    }           
    
    public static void tableModel(JTable fatDataTable){
        grasasImp.tableModel(fatDataTable);
    }
    
    
    public static void filterGrasa(String fat, JTable fatDataTable){
        System.out.println("Desde controller " + fat);
        grasasImp.filterGrasa(fat, fatDataTable);
    }
    
    public static void tableModelFiltered(JTable fatDataTable){
        grasasImp.tableModelFiltered(fatDataTable);
    }
    
}
