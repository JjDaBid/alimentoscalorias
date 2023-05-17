package services;

import entity.Grasas;
import interfaces.GrasasDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GrasasImp implements GrasasDAO {
    
    private List<Grasas> grasas;
    private List<Grasas> filteredList;

    public GrasasImp() {
        grasas = new ArrayList<>();
        filteredList = new ArrayList<>();
        
        Grasas grasa1 = new Grasas("Vegetal", 6, "Aceite de Oliva", "Grasas", 819, 0, 91,0);
        Grasas grasa2 = new Grasas("Vegetal", 7, "Aceite de Palma", "Grasas", 900, 0, 50, 50);
        Grasas grasa3 = new Grasas("Vegetal", 8, "Aceite de Coco", "Grasas", 862, 0, 87, 13);
        Grasas grasa4 = new Grasas("Animal", 9, "Mantequilla", "Grasas", 717, 0, 81, 0);
        Grasas grasa5 = new Grasas("Animal", 10, "Queso", "Grasas", 459, 9, 35, 27);
    
        grasas.add(grasa1);
        grasas.add(grasa2);
        grasas.add(grasa3);
        grasas.add(grasa4);
        grasas.add(grasa5);        
    }

    @Override
    public Grasas getGrasaById(int idAlimento) {
        Grasas grasa = new Grasas();

        for(int i = 0; i < grasas.size(); i++){
            if(grasas.get(i).getIdAlimentos() == idAlimento){
                grasa.setIdAlimentos(grasas.get(i).getIdAlimentos());                
                grasa.setOrigen(grasas.get(i).getOrigen());
                grasa.setNombreAlimento(grasas.get(i).getNombreAlimento());
                grasa.setClasificacion(grasas.get(i).getClasificacion());
                grasa.setProteinas(grasas.get(i).getProteinas());
                grasa.setGrasa(grasas.get(i).getGrasa());
                grasa.setCarbohidratos(grasas.get(i).getCarbohidratos());
                grasa.setCalorias(grasas.get(i).getCalorias());                
            }
    }        
    return grasa;
    }

    @Override
    public int findGrasaByName(String fat) {
         int n = -1;
        for(int i = 0; i<grasas.size(); i++){
            if(grasas.get(i).getNombreAlimento().equals(fat)){
                n = i;
                break;
            }
        }
        return n;
    }

    @Override
    public boolean createGrasa(Grasas fat) {
        if(findGrasaByName(fat.getNombreAlimento())==-1){
            grasas.add(fat);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Grasas updateGrasa(Grasas fat) {
        
        
        
        System.out.println("Desde Imp ID:" + fat.getIdAlimentos() + " Nombre: " + fat.getNombreAlimento());
        Grasas gr = null;        
        for(int i = 0; i < grasas.size(); i++){
            if(grasas.get(i).getIdAlimentos() == fat.getIdAlimentos()){
                gr = grasas.get(i);
                break;
            }
        }
            
        if(gr != null){
            System.out.println("Desde update antes" );
            System.out.println("ID: " + gr.getIdAlimentos() + " Producto: " + gr.getNombreAlimento() + " Tipo: " + gr.getOrigen() );
            gr.setNombreAlimento(fat.getNombreAlimento());
            gr.setClasificacion(fat.getClasificacion());
            gr.setCalorias(fat.getCalorias());
            gr.setGrasa(fat.getGrasa());
            gr.setCarbohidratos(fat.getCarbohidratos());
            gr.setProteinas(fat.getProteinas());
            gr.setOrigen(fat.getOrigen());
        }        
    
     return gr;
}
    
    @Override
    public void deleteGrasa(String fat, JTable fatDataTable){
        if(findGrasaByName(fat)!= -1){
            grasas.remove(findGrasaByName(fat));
            DefaultTableModel model = (DefaultTableModel) fatDataTable.getModel();
            model.setRowCount(0);
            tableModel(fatDataTable);            
        } else {
            
        }
    }
    
    @Override
    public List<Grasas> showGrasasList() { 
        return grasas;
    }
    
    public DefaultTableModel tableModel(JTable fatDataTable){        
        DefaultTableModel model = (DefaultTableModel)fatDataTable.getModel();
        try{            
           grasas.forEach((u) -> model.addRow(
                    new Object[]{
                        u.getIdAlimentos(),
                        u.getNombreAlimento(),
                        u.getOrigen(),                        
                        u.getProteinas(),
                        u.getGrasa(),                        
                        u.getCarbohidratos(),
                        u.getCalorias()                       
                }        
        ));             
        } catch (Exception e){
            
        }        
        return model;
    }
    
    public void filterGrasa(String fat, JTable fatDataTable){        
        filteredList.clear();
        for (Grasas fv : grasas) {
            if (fv.getNombreAlimento().equalsIgnoreCase(fat)) {
                filteredList.add(fv);
            }            
        }    
    DefaultTableModel model = (DefaultTableModel) fatDataTable.getModel();
    model.setRowCount(0);
    tableModelFiltered(fatDataTable);
    fatDataTable.repaint();
    }
    
    public DefaultTableModel tableModelFiltered(JTable fatDataTable){        
        DefaultTableModel model = (DefaultTableModel)fatDataTable.getModel();
        try{            
           filteredList.forEach((u) -> model.addRow(
                    new Object[]{
                        u.getIdAlimentos(),
                        u.getNombreAlimento(),
                        u.getOrigen(),                        
                        u.getProteinas(),
                        u.getGrasa(),                        
                        u.getCarbohidratos(),
                        u.getCalorias()                        
                }        
        ));             
        } catch (Exception e){
            
        }        
        return model;
    } 
    
}
