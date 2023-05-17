package Controller;

import entity.FrutasYVerduras;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import services.FrutasYVerdurasImp;

public class FrutasYVerdurasController {
    
    private static FrutasYVerdurasImp frutasYVerdurasImp = new FrutasYVerdurasImp();    
    
    public static boolean clasificationValidator(String clasification, JPanel fruitsView) {
    boolean isValid = false;
    // Verificar si el producto corresponde a Frutas y Verduras
        if (clasification.equals("Frutas y Verduras")) {
            isValid = true;
        }
        if (isValid) {        
            return true;
        } else {
            JOptionPane.showMessageDialog(fruitsView, "El producto ingresado no corresponde a la clasificación Frutas y Verduras", "Aviso", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static FrutasYVerduras getFruitOrVegetableById(int id){
        return frutasYVerdurasImp.getFruitOrVegetableById(id);
    }
        
    public static boolean createFruitOrVegetable(
            String tipo,
            String naturaleza,
            int idFruta,
            String nombreAlimento,            
            String clasificacion,
            double calorias,
            double proteinas,
            double grasa,
            double carbohidratos,
            JPanel fruitsView
    ){
        if(clasificationValidator(clasificacion, fruitsView) == true){
            FrutasYVerduras frutaVerdura = new FrutasYVerduras(tipo, naturaleza, 0, nombreAlimento, 
                    clasificacion, calorias, proteinas, grasa, carbohidratos);            
            frutasYVerdurasImp.createFruitOrVegetable(frutaVerdura);
            return true;           
        } return false;
    }
    
    public static FrutasYVerduras updateFruitOrVegetable(FrutasYVerduras fruitOrVegetable, JPanel fruitsForm){
        if(fruitOrVegetable != null){
            return frutasYVerdurasImp.updateFruitOrVegetable(fruitOrVegetable);
        } else {
            JOptionPane.showMessageDialog(fruitsForm, "Debe ingresar todos los campos");
            return null;
        }
    }
    
    public static void deleteFruitOrVegetable(FrutasYVerduras fruitOrVegetable, JTable fruitsDataTable){
        frutasYVerdurasImp.deleteFruitOrVegetable(fruitOrVegetable.getNombreAlimento(), fruitsDataTable);        
    }           
    
    public static void tableModel(JTable fruitsDataTable){
        frutasYVerdurasImp.tableModel(fruitsDataTable);
    }
    
    public static void filterFruitOrVegetable(String fruitOrVegetable, JTable fruitsDataTable){
        System.out.println("Desde controller " + fruitOrVegetable);
        frutasYVerdurasImp.filterFruitOrVegetable(fruitOrVegetable, fruitsDataTable);
    }
    
    public static void tableModelFiltered(JTable fruitsDataTable){
        frutasYVerdurasImp.tableModelFiltered(fruitsDataTable);
    }
    
}
