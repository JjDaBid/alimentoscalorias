package services;

import entity.HidratosDeCarbono;
import interfaces.HidratosDeCarbonoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HidratosDeCarbonoImp implements HidratosDeCarbonoDAO {
    
    private List<HidratosDeCarbono> carbohidratos;
    private List<HidratosDeCarbono> filteredList;
      
    public HidratosDeCarbonoImp() {        
        carbohidratos = new ArrayList<>();
        filteredList = new ArrayList<>();
        
        HidratosDeCarbono carbohidrato1 = new HidratosDeCarbono("Fibra", "Con Gluten", 11, "Pan de Trigo", "Hidratos de Carbono", 220.0, 3.5, 8, 33.5);
        HidratosDeCarbono carbohidrato2 = new HidratosDeCarbono("Fibra", "Con Gluten", 12, "Pan de Cebada", "Hidratos de Carbono", 220.0, 3.5, 8, 33.5);
        HidratosDeCarbono carbohidrato3 = new HidratosDeCarbono("Almidon", "Sin Glúten", 13, "Papa Criolla", "Hidratos de Carbono", 77.0, 2.0, 1.5, 17.0);
        HidratosDeCarbono carbohidrato4 = new HidratosDeCarbono("Fibra", "Sin Gluten", 14, "Pasta de Arroz", "Hidratos de Carbono", 160.0, 1.5, 7.0, 31.0);
        HidratosDeCarbono carbohidrato5 = new HidratosDeCarbono("Fibra", "Sin Gluten", 15, "Pan de Maíz", "Hidratos de Carbono", 247.0, 10.0, 7.5, 41.0);
    
        carbohidratos.add(carbohidrato1);
        carbohidratos.add(carbohidrato2);
        carbohidratos.add(carbohidrato3);
        carbohidratos.add(carbohidrato4);
        carbohidratos.add(carbohidrato5);
    }
    
    
    

    @Override
    public HidratosDeCarbono getCarbById(int idAlimento) {
        HidratosDeCarbono hc = new HidratosDeCarbono();

        for(int i = 0; i < carbohidratos.size(); i++){
            if(carbohidratos.get(i).getIdAlimentos() == idAlimento){
                hc.setIdAlimentos(carbohidratos.get(i).getIdAlimentos());
                hc.setTipo(carbohidratos.get(i).getTipo());
                hc.setTienenGluten(carbohidratos.get(i).getTienenGluten());
                hc.setNombreAlimento(carbohidratos.get(i).getNombreAlimento());
                hc.setClasificacion(carbohidratos.get(i).getClasificacion());
                hc.setProteinas(carbohidratos.get(i).getProteinas());
                hc.setGrasa(carbohidratos.get(i).getGrasa());
                hc.setCarbohidratos(carbohidratos.get(i).getCarbohidratos());
                hc.setCalorias(carbohidratos.get(i).getCalorias());                
            }
    }        
    return hc;
    }
       
    @Override
    public int findCarbByName(String carb) {
        int n = -1;
        for(int i = 0; i<carbohidratos.size(); i++){
            if(carbohidratos.get(i).getNombreAlimento().equals(carb)){
                n = i;
                break;
            }
        }
        return n;
    }

    @Override
    public boolean createCarb(HidratosDeCarbono carb) {
        if(findCarbByName(carb.getNombreAlimento())==-1){
            carbohidratos.add(carb);            
            return true;
        } else {
            return false;
        }
    }

    @Override
    public HidratosDeCarbono updateCarb(HidratosDeCarbono carb) {
        HidratosDeCarbono hc = null;
        for(int i = 0; i < carbohidratos.size(); i++){
            if(carbohidratos.get(i).getIdAlimentos() == carb.getIdAlimentos()){
                hc = carbohidratos.get(i);
                break;
            }
        }        
        if(hc != null){            
            hc.setNombreAlimento(carb.getNombreAlimento());
            hc.setClasificacion(carb.getClasificacion());
            hc.setCalorias(carb.getCalorias());
            hc.setGrasa(carb.getGrasa());
            hc.setCarbohidratos(carb.getCarbohidratos());
            hc.setProteinas(carb.getProteinas());
            hc.setTipo(carb.getTipo());
            hc.setTienenGluten(carb.getTienenGluten());        
        }
    return hc;
    }

    @Override
    public void deleteCarb(String carb, JTable carbsDataTable) {
        if(findCarbByName(carb)!= -1){
            carbohidratos.remove(findCarbByName(carb));
            DefaultTableModel model = (DefaultTableModel) carbsDataTable.getModel();
            model.setRowCount(0);
            tableModel(carbsDataTable);
            
        } else {
            
        }
    }

    @Override
    public List<HidratosDeCarbono> showCarbsList() {
        return carbohidratos;
    }
    
    public DefaultTableModel tableModel(JTable carbsDataTable){        
        DefaultTableModel model = (DefaultTableModel)carbsDataTable.getModel();
        try{            
           carbohidratos.forEach((u) -> model.addRow(
                    new Object[]{
                        u.getIdAlimentos(),
                        u.getNombreAlimento(),
                        u.getTipo(),
                        u.getTienenGluten(),
                        u.getProteinas(),
                        u.getGrasa(),                        
                        u.getCarbohidratos(),
                        u.getCalorias(),                        
                }        
        ));             
        } catch (Exception e){
            
        }        
        return model;
    }
    
    public void filterCarb(String carb, JTable carbsDataTable){        
        filteredList.clear();
        for (HidratosDeCarbono hc : carbohidratos) {
            if (hc.getNombreAlimento().equalsIgnoreCase(carb)) {
                filteredList.add(hc);
            }            
        }    
    DefaultTableModel model = (DefaultTableModel) carbsDataTable.getModel();
    model.setRowCount(0);
    tableModelFiltered(carbsDataTable);
    carbsDataTable.repaint();
    }    
    
    public DefaultTableModel tableModelFiltered(JTable carbsDataTable){        
        DefaultTableModel model = (DefaultTableModel)carbsDataTable.getModel();
        try{            
           filteredList.forEach((u) -> model.addRow(
                    new Object[]{
                        u.getIdAlimentos(),
                        u.getNombreAlimento(),
                        u.getTipo(),
                        u.getTienenGluten(),
                        u.getProteinas(),
                        u.getGrasa(),                        
                        u.getCarbohidratos(),
                        u.getCalorias(),                        
                }        
        ));             
        } catch (Exception e){
            
        }        
        return model;
    }
  
}
