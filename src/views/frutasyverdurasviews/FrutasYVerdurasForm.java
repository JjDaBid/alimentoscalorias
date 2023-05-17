package views.frutasyverdurasviews;

import Controller.FrutasYVerdurasController;
import entity.FrutasYVerduras;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class FrutasYVerdurasForm extends javax.swing.JPanel {
    
    boolean isEdition = false; 
    FrutasYVerduras edicionFrutasYVerduras;

    public FrutasYVerdurasForm() {
        initComponents();
        initStyles();
        setListeners();        
    }
    
    public FrutasYVerdurasForm(FrutasYVerduras frutasYVerduras) {
        initComponents();
        isEdition = true;
        edicionFrutasYVerduras = frutasYVerduras;
        initStyles();
        setListeners();   
    }
    
    private void initStyles(){
        txtImagen.setVisible(false);
        if(isEdition){
            pageTitle.setText("Editar Frutas y Verduras");
            btnInsert.setText("Actualizar");
            txtImagen.setVisible(true);
            
            if(edicionFrutasYVerduras != null){
                txtImagen.setText("Edicion Alimento " + edicionFrutasYVerduras.getNombreAlimento());
                cmbTipo.setSelectedItem(edicionFrutasYVerduras.getTipo());
                cmbOrganic.setSelectedItem(edicionFrutasYVerduras.getNaturaleza());
                txtNombre.setText(edicionFrutasYVerduras.getNombreAlimento());
                cmbClasification.setSelectedItem(edicionFrutasYVerduras.getClasificacion());
                txtProteinas.setText(String.valueOf(edicionFrutasYVerduras.getProteinas()));
                txtGrasa.setText(String.valueOf(edicionFrutasYVerduras.getGrasa()));
                txtCarbohidratos.setText(String.valueOf(edicionFrutasYVerduras.getCarbohidratos()));
                txtCalorias.setText(String.valueOf(edicionFrutasYVerduras.getCalorias()));
            }
        }        
    }
     
    private void setListeners(){
        txtProteinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProteinasKeyReleased(evt);
            }
        });
        txtGrasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrasaKeyReleased(evt);
            }
        });
        txtCarbohidratos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCarbohidratosKeyReleased(evt);
            }
        });        
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                if (!Character.isLetter(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        });
    }
    
    private void setImage(){
        String selection = cmbTipo.getSelectedItem().toString();
        ImageIcon newIcon = null;
        if(selection.equals("Fruta")){
            newIcon = new ImageIcon(getClass().getResource("/images/fruticas.jpg"));
        } else if (selection.equals("Verdura")){
            newIcon = new ImageIcon(getClass().getResource("/images/verduritas.jpg"));            
        }         
        txtImagen.setIcon(newIcon);
        txtImagen.setVisible(true);
    }
    
    private double calculateCalories(){
        double totalCalories = 0;
        double proteins = 0;
        double fat = 0;
        double carbs = 0;
        try {
            proteins = Double.parseDouble(txtProteinas.getText());
        } catch (NumberFormatException ex) {
            txtProteinas.setText("0.0");
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor numérico en Proteínas.");
        }
        try {
            fat = Double.parseDouble(txtGrasa.getText());
        } catch (NumberFormatException ex) {
            txtGrasa.setText("0.0");
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor numérico en Grasa.");
        }
        try {
            carbs = Double.parseDouble(txtCarbohidratos.getText());
        } catch (NumberFormatException ex) {
            txtCarbohidratos.setText("0.0");
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor numérico en Carbohidratos.");
        }        
        totalCalories = (proteins*4) + (fat*9) +(carbs*4);
        return totalCalories;
    }                                 

    private void txtGrasaKeyReleased(java.awt.event.KeyEvent evt) {                                    
        txtCalorias.setText(Double.toString(calculateCalories()));
    }                                   

    private void txtCarbohidratosKeyReleased(java.awt.event.KeyEvent evt) {                                              
        txtCalorias.setText(Double.toString(calculateCalories()));
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        pageTitle = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbOrganic = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        cmbClasification = new javax.swing.JComboBox<>();
        txtCalorias = new javax.swing.JTextField();
        txtProteinas = new javax.swing.JTextField();
        txtGrasa = new javax.swing.JTextField();
        txtCarbohidratos = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        txtImagen = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(750, 560));

        background.setMinimumSize(new java.awt.Dimension(750, 560));

        imagePanel.setPreferredSize(new java.awt.Dimension(750, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FrutasBanner.jpg"))); // NOI18N

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(750, 410));

        pageTitle.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        pageTitle.setForeground(new java.awt.Color(0, 102, 102));
        pageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitle.setText("Frutas y Verduras");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruta", "Verdura" }));
        cmbTipo.setSelectedIndex(-1);
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        cmbOrganic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orgánico", "Transgénico" }));
        cmbOrganic.setSelectedIndex(-1);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        cmbClasification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frutas y Verduras", "Grasas", "Hidratos de Carbono" }));
        cmbClasification.setSelectedIndex(-1);

        txtCalorias.setEnabled(false);

        txtProteinas.setText("0.0");
        txtProteinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProteinasKeyReleased(evt);
            }
        });

        txtGrasa.setText("0.0");

        txtCarbohidratos.setText("0.0");

        btnInsert.setBackground(new java.awt.Color(49, 175, 180));
        btnInsert.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insertar");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tipo:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Naturaleza:");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Clasificación:");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Proteínas:");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Grasas:");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Carbohidratos:");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Total Calorías:");

        jLabel10.setText("gramos");

        jLabel11.setText("gramos");

        jLabel12.setText("gramos");

        btnClean.setBackground(new java.awt.Color(49, 175, 180));
        btnClean.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnClean.setForeground(new java.awt.Color(255, 255, 255));
        btnClean.setText("Limpiar");
        btnClean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        txtImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fruticas.jpg"))); // NOI18N
        txtImagen.setText("Registro Nuevo Alimento");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pageTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbOrganic, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
                                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbClasification, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addComponent(txtProteinas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addComponent(txtGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addComponent(txtCarbohidratos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel12))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(pageTitle)
                        .addGap(18, 18, 18)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbOrganic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbClasification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtProteinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCarbohidratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(32, 32, 32)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClean)
                            .addComponent(btnInsert))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addGap(30, 30, 30))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
    String tipo = (String)cmbTipo.getSelectedItem();
    String organico = (String)cmbOrganic.getSelectedItem();
    String nombre = txtNombre.getText();
    String clasificacion = (String)cmbClasification.getSelectedItem();
    String proteinas = txtProteinas.getText();
    String grasa = txtGrasa.getText();
    String carbohidratos = txtCarbohidratos.getText();
    String calorias = txtCalorias.getText();

        if(tipo == null || organico == null || nombre.isEmpty() || clasificacion == null || calorias.isEmpty() || proteinas.isEmpty() || grasa.isEmpty() || carbohidratos.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocus();
            return;
        } else {        
            if(FrutasYVerdurasController.clasificationValidator(clasificacion, this)){
                FrutasYVerduras fv = isEdition ? edicionFrutasYVerduras : new FrutasYVerduras();
                fv.setTipo(tipo);
                fv.setEsOrganico(organico);
                fv.setNombreAlimento(nombre);
                fv.setClasificacion(clasificacion);
                fv.setProteinas(Double.parseDouble(proteinas));
                fv.setGrasa(Double.parseDouble(grasa));
                fv.setCarbohidratos(Double.parseDouble(carbohidratos));
                fv.setCalorias(Double.parseDouble(calorias));

                try {
                    if(!isEdition) {
                        FrutasYVerdurasController.createFruitOrVegetable(
                            tipo,
                            organico,
                            0,
                            nombre,
                            clasificacion,
                            Double.parseDouble(calorias),
                            Double.parseDouble(proteinas),
                            Double.parseDouble(grasa),
                            Double.parseDouble(carbohidratos),
                            this
                        );            
                        javax.swing.JOptionPane.showMessageDialog(this, "Producto registrado exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        FrutasYVerdurasController.updateFruitOrVegetable(fv, this);
                        javax.swing.JOptionPane.showMessageDialog(this, "Producto actualizado exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    }

                    if(!isEdition){
                        cleanForm();
                    }

                } catch(Exception e) {
                    String errorMsg = isEdition ? "actualizar" : "Registrar";
                    javax.swing.JOptionPane.showMessageDialog(this, "Error al " + errorMsg + " el producto. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                }

            } else {

            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtProteinasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProteinasKeyReleased
        txtCalorias.setText(Double.toString(calculateCalories()));
    }//GEN-LAST:event_txtProteinasKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        cleanForm();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        setImage();
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void cleanForm(){
        cmbTipo.setSelectedIndex(0);
        cmbOrganic.setSelectedIndex(0);
        txtNombre.setText("");
        cmbClasification.setSelectedIndex(0);
        txtProteinas.setText("0.0");
        txtGrasa.setText("0.0");
        txtCarbohidratos.setText("0.0"); 
        txtCalorias.setText("0.0");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnInsert;
    private javax.swing.JComboBox<String> cmbClasification;
    private javax.swing.JComboBox<String> cmbOrganic;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JTextField txtCalorias;
    private javax.swing.JTextField txtCarbohidratos;
    private javax.swing.JTextField txtGrasa;
    private javax.swing.JLabel txtImagen;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProteinas;
    // End of variables declaration//GEN-END:variables
}
