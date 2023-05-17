package interfaces;

import entity.HidratosDeCarbono;
import java.util.List;
import javax.swing.JTable;

public interface HidratosDeCarbonoDAO {
    
    public HidratosDeCarbono getCarbById(int idAlimento);
     
    public int findCarbByName(String carb);
    
    public boolean createCarb(HidratosDeCarbono carb); 
    
    public HidratosDeCarbono updateCarb(HidratosDeCarbono carb);    
    
    public void deleteCarb(String carb, JTable carbsDataTable);
    
    public List<HidratosDeCarbono> showCarbsList();
    
}
