package interfaces;

import entity.Grasas;
import java.util.List;
import javax.swing.JTable;

public interface GrasasDAO {
    
    public Grasas getGrasaById(int idAlimento);
     
    public int findGrasaByName(String fat);
    
    public boolean createGrasa(Grasas grasa); 
    
    public Grasas updateGrasa(Grasas grasa);    
        
    public void deleteGrasa(String fat, JTable fatDataTable);
    
    public List<Grasas> showGrasasList();
    
}
