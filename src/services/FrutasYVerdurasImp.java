package services;

import entity.FrutasYVerduras;
import interfaces.FrutasYVerdurasDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrutasYVerdurasImp implements FrutasYVerdurasDAO{
    
    private List<FrutasYVerduras> frutasYverduras;
    private List<FrutasYVerduras> filteredList;
    
    public FrutasYVerdurasImp() {
        frutasYverduras = new ArrayList<>();
        filteredList = new ArrayList<>();
        
        FrutasYVerduras frutasyverduras1 = new FrutasYVerduras("Fruta", "Orgánico", 1, "Maracuyá", "Frutas y Verduras", 17 ,0.4, 0.13, 4.21);
        FrutasYVerduras frutasyverduras2 = new FrutasYVerduras("Fruta", "Orgánico", 2, "Manzana", "Frutas y Verduras", 72 ,0.36, 0.23, 19.06);
        FrutasYVerduras frutasyverduras3 = new FrutasYVerduras("Fruta", "Orgánico", 3, "Melocoton", "Frutas y Verduras", 38 ,0.89, 0.24, 9.35);
        FrutasYVerduras frutasyverduras4 = new FrutasYVerduras("Verdura", "Orgánico", 4, "Habichuela", "Frutas y Verduras", 17 ,34, 0.13, 7.84);
        FrutasYVerduras frutasyverduras5 = new FrutasYVerduras("Verdura", "Orgánico", 4, "Habichuela", "Frutas y Verduras", 17 ,34, 0.13, 7.84);

        frutasYverduras.add(frutasyverduras1);
        frutasYverduras.add(frutasyverduras2);
        frutasYverduras.add(frutasyverduras3);
        frutasYverduras.add(frutasyverduras4);
        frutasYverduras.add(frutasyverduras5);
    }
    
    @Override
    public FrutasYVerduras getFruitOrVegetableById(int idAlimento){         
        FrutasYVerduras fv = new FrutasYVerduras();

        for(int i = 0; i < frutasYverduras.size(); i++){
            if(frutasYverduras.get(i).getIdAlimentos() == idAlimento){
                fv.setIdAlimentos(frutasYverduras.get(i).getIdAlimentos());
                fv.setTipo(frutasYverduras.get(i).getTipo());
                fv.setEsOrganico(frutasYverduras.get(i).getNaturaleza());
                fv.setNombreAlimento(frutasYverduras.get(i).getNombreAlimento());
                fv.setClasificacion(frutasYverduras.get(i).getClasificacion());
                fv.setProteinas(frutasYverduras.get(i).getProteinas());
                fv.setGrasa(frutasYverduras.get(i).getGrasa());
                fv.setCarbohidratos(frutasYverduras.get(i).getCarbohidratos());
                fv.setCalorias(frutasYverduras.get(i).getCalorias());                
            }
    }        
    return fv;
    }   
    
    @Override
    public int findFruitOrVegetableByName(String fruitOrVegetable){
        int n = -1;
        for(int i = 0; i<frutasYverduras.size(); i++){
            if(frutasYverduras.get(i).getNombreAlimento().equals(fruitOrVegetable)){
                n = i;
                break;
            }
        }
        return n;
    }
    
    @Override
    public boolean createFruitOrVegetable(FrutasYVerduras fruitOrVegetable) {
        if(findFruitOrVegetableByName(fruitOrVegetable.getNombreAlimento())==-1){
            frutasYverduras.add(fruitOrVegetable);            
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public FrutasYVerduras updateFruitOrVegetable(FrutasYVerduras fruitOrVegetable){   
        FrutasYVerduras fv = null;
        for(int i = 0; i < frutasYverduras.size(); i++){
            if(frutasYverduras.get(i).getIdAlimentos() == fruitOrVegetable.getIdAlimentos()){
                fv = frutasYverduras.get(i);
                break;
            }
        }        
        if(fv != null){            
            fv.setNombreAlimento(fruitOrVegetable.getNombreAlimento());
            fv.setClasificacion(fruitOrVegetable.getClasificacion());
            fv.setCalorias(fruitOrVegetable.getCalorias());
            fv.setGrasa(fruitOrVegetable.getGrasa());
            fv.setCarbohidratos(fruitOrVegetable.getCarbohidratos());
            fv.setProteinas(fruitOrVegetable.getProteinas());
            fv.setTipo(fruitOrVegetable.getTipo());
            fv.setEsOrganico(fruitOrVegetable.getNaturaleza());        
        }
    return fv;  
    }
    
    @Override
    public void deleteFruitOrVegetable(String fruitOrVegetable, JTable fruitsDataTable){
        if(findFruitOrVegetableByName(fruitOrVegetable)!= -1){
            frutasYverduras.remove(findFruitOrVegetableByName(fruitOrVegetable));
            DefaultTableModel model = (DefaultTableModel) fruitsDataTable.getModel();
            model.setRowCount(0);
            tableModel(fruitsDataTable);
            
        } else {
            
        }
    }
    
    @Override
    public List<FrutasYVerduras> showFruitsAndVegetablesList() { 
        return frutasYverduras;
    }
    
    public DefaultTableModel tableModel(JTable fruitsDataTable){        
        DefaultTableModel model = (DefaultTableModel)fruitsDataTable.getModel();
        try{            
           frutasYverduras.forEach((u) -> model.addRow(
                    new Object[]{
                        u.getIdAlimentos(),
                        u.getNombreAlimento(),
                        u.getTipo(),
                        u.getNaturaleza(),
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
        
    
    public void filterFruitOrVegetable(String fruitOrVegetable, JTable fruitsDataTable){        
        filteredList.clear();
        for (FrutasYVerduras fv : frutasYverduras) {
            if (fv.getNombreAlimento().equalsIgnoreCase(fruitOrVegetable)) {
                filteredList.add(fv);
            }            
        }    
    DefaultTableModel model = (DefaultTableModel) fruitsDataTable.getModel();
    model.setRowCount(0);
    tableModelFiltered(fruitsDataTable);
    fruitsDataTable.repaint();
    }    
    
    public DefaultTableModel tableModelFiltered(JTable fruitsDataTable){        
        DefaultTableModel model = (DefaultTableModel)fruitsDataTable.getModel();
        try{            
           filteredList.forEach((u) -> model.addRow(
                    new Object[]{
                        u.getIdAlimentos(),
                        u.getNombreAlimento(),
                        u.getTipo(),
                        u.getNaturaleza(),
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
