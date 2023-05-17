package Controller;

import entity.HidratosDeCarbono;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import services.HidratosDeCarbonoImp;

public class HidratosDeCarbonoController {
    
    public static HidratosDeCarbonoImp hidratosDeCarbonoImp = new HidratosDeCarbonoImp();
    
    public static boolean clasificationValidator(String clasification, JPanel carbsView) {
    boolean isValid = false;
    // Verificar si el producto corresponde a Carbohidratos
        if (clasification.equals("Hidratos de Carbono")) {
            isValid = true;
        }
        if (isValid) {        
            return true;
        } else {
            JOptionPane.showMessageDialog(carbsView, "El producto ingresado no corresponde a la clasificación Hidratos de Carbono");
            return false;
        }
    }
    
    public static HidratosDeCarbono getCarbById(int id){
        return hidratosDeCarbonoImp.getCarbById(id);
    }
    
    public static boolean createCarb(
            String tipo,
            String tieneGluten,        
            int idFruta,
            String nombreAlimento,            
            String clasificacion,
            double calorias,
            double proteinas,
            double grasa,
            double carbohidratos,
            JPanel carbsView
    ){
        if(clasificationValidator(clasificacion, carbsView)== true){
            HidratosDeCarbono hc = new HidratosDeCarbono(tipo, tieneGluten, 0, nombreAlimento, 
                    clasificacion, calorias, proteinas, grasa, carbohidratos);            
            hidratosDeCarbonoImp.createCarb(hc);
            return true;            
        } return false;
    }
    
    public static HidratosDeCarbono updateCarb(HidratosDeCarbono carb, JPanel carbsView){
        if(carb != null){
            return hidratosDeCarbonoImp.updateCarb(carb);
        } else {
            JOptionPane.showMessageDialog(carbsView, "Debe ingresar todos los campos");
            return null;
        }
    }
    
    public static void deleteCarb(HidratosDeCarbono carbs, JTable carbsDataTable){
        hidratosDeCarbonoImp.deleteCarb(carbs.getNombreAlimento(), carbsDataTable);        
    }           
    
    public static void tableModel(JTable carbsDataTable){
        hidratosDeCarbonoImp.tableModel(carbsDataTable);
    }
    
    
    public static void filterCarbs(String carbs, JTable carbsDataTable){
        System.out.println("Desde controller " + carbs);
        hidratosDeCarbonoImp.filterCarb(carbs, carbsDataTable);
    }
    
    public static void tableModelFiltered(JTable carbsDataTable){
        hidratosDeCarbonoImp.tableModelFiltered(carbsDataTable);
    }
        
}
