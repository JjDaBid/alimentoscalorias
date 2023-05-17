package interfaces;

import entity.FrutasYVerduras;
import java.util.List;
import javax.swing.JTable;


public interface FrutasYVerdurasDAO{  
    
    public FrutasYVerduras getFruitOrVegetableById(int idAlimento);
     
    public int findFruitOrVegetableByName(String fruitOrVegetable);
    
    public boolean createFruitOrVegetable(FrutasYVerduras fruitOrVegetable); 
    
    public FrutasYVerduras updateFruitOrVegetable(FrutasYVerduras fruitOrVegetable);    
    
    public void deleteFruitOrVegetable(String fruitOrVegetable, JTable fruitsDataTable);
    
    public List<FrutasYVerduras> showFruitsAndVegetablesList();    
    
    
}
