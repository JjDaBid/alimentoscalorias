package views.grasasviews;


import Controller.GrasasController;
import entity.Grasas;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import services.FrutasYVerdurasImp;


public class GrasasView extends javax.swing.JPanel {

    public GrasasView() {
        initComponents();
        loadGrasas();
    }
    
    private void loadGrasas(){
        GrasasController.tableModel(fatDataTable);
    }
    
    private void filterGrasas(){
        GrasasController.filterGrasa(barraBusqueda.getText(), fatDataTable);
    }
    
    public void showJPanel(JPanel panel){
        panel.setSize(750,560);
        panel.setLocation(0, 0);
        
        background.removeAll();
        background.add(panel, BorderLayout.CENTER);
        background.revalidate();
        background.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pageTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fatDataTable = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        barraBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(700, 550));

        contentPanel.setPreferredSize(new java.awt.Dimension(650, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grasasBanner.jpg"))); // NOI18N

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pageTitle.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        pageTitle.setForeground(new java.awt.Color(0, 102, 102));
        pageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitle.setText("Grasas");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 402));

        fatDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Origen", "Proteína", "Carbohidrato", "Grasa", "Total Calorías"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fatDataTable.setGridColor(new java.awt.Color(255, 255, 255));
        fatDataTable.setSelectionBackground(new java.awt.Color(49, 175, 180));
        jScrollPane1.setViewportView(fatDataTable);

        btnView.setBackground(new java.awt.Color(49, 175, 180));
        btnView.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("Ver");
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(49, 175, 180));
        btnNew.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("Nuevo");
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(49, 175, 180));
        btnEdit.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Editar");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(49, 175, 180));
        btnDelete.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Eliminar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        barraBusqueda.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        barraBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barraBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barraBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barraBusquedaKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(49, 175, 180));
        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(backgroundLayout.createSequentialGroup()
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(pageTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageTitle)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barraBusqueda))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(0, 88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        if(fatDataTable.getSelectedRow() > -1){
            try{
                int idFat = (int)fatDataTable.getValueAt(fatDataTable.getSelectedRow(), 0); 
                GrasasController.getGrasaById(idFat);               
                showJPanel(new GrasasDetail(GrasasController.getGrasaById(idFat)));
            } catch (Exception e){
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el producto que desea Ver. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }    
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        showJPanel(new GrasasForm());
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(fatDataTable.getSelectedRow() > -1){
            try{
                int idFat = (int)fatDataTable.getValueAt(fatDataTable.getSelectedRow(), 0); 
                GrasasController.getGrasaById(idFat);               
                showJPanel(new GrasasForm(GrasasController.getGrasaById(idFat)));
            } catch (Exception e){
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el producto que desea Editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(fatDataTable.getSelectedRow() > -1){
            int option = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea Eliminar el Alimento?", "Confirmación", JOptionPane.YES_NO_OPTION);                
            if (option == JOptionPane.YES_OPTION) {
                try{
                    int idFat = (int)fatDataTable.getValueAt(fatDataTable.getSelectedRow(), 0); 
                    Grasas grasa = GrasasController.getGrasaById(idFat); 
                    GrasasController.deleteGrasa(grasa, fatDataTable);
                    javax.swing.JOptionPane.showMessageDialog(this, "Producto eliminado satisfactoriamente.  \n", "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e){
                    }
            }            
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el producto que desea Eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        filterGrasas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void barraBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraBusquedaKeyPressed
//         filterFruitsAndVegetables();
    }//GEN-LAST:event_barraBusquedaKeyPressed

    private void barraBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraBusquedaKeyReleased
        filterGrasas();
    }//GEN-LAST:event_barraBusquedaKeyReleased

    private void barraBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraBusquedaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_barraBusquedaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTable fatDataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pageTitle;
    // End of variables declaration//GEN-END:variables
}
