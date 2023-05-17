package views;

import views.loginviews.Login;
import views.frutasyverdurasviews.FrutasYVerdurasView;
import Controller.UserController;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import views.grasasviews.GrasasView;
import views.hidratosdecarbonoviews.HidratosDeCarbonoView;
import views.loginviews.Register;


public class Home extends javax.swing.JFrame {
    
    private boolean logged = false;


    public Home() {
        logged = false;
        initComponents();
//        setUsernameLabel();
        initContent();
        setLogo();
        LogStatus();    }
    
    private void initContent(){
        showJPanel(new HomePanel());
//        if(logged){
//            btnRegister.setVisible(false);
//            btnLogin.setText("Logout");
//        }        
    }
    
    private boolean LogStatus(){
        if(UserController.isLoggedIn()){
            setLogin();
            return logged = true;
        } else {
            setLogout();
            return logged = false;
        }
    }
    
    private void setLogin(){        
        welcomeLabel.setText("Bienvenido " + UserController.getCurrentUser());
        btnRegister.setVisible(false);
        btnLogin.setText("Cerrar Sesión");
        logged = true;
    }
    
    private void setLogout(){
        welcomeLabel.setText("Inicie sesion"); 
        btnRegister.setVisible(true);
        btnLogin.setText("Iniciar Sesión");
        logged = false;
    }

    
    public void showJPanel(JPanel panel){
        panel.setSize(750,560);
        panel.setLocation(0, 0);
        
        contentPanel.removeAll();
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
    
    private void setLogo(){
        Icon icon = logoLabel.getIcon();
        Image img = ((ImageIcon) icon).getImage();        
        Image newImg = img.getScaledInstance(160, 42, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImg);
        logoLabel.setIcon(newIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnFruits = new javax.swing.JButton();
        btnFat = new javax.swing.JButton();
        btnCarbs = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setBackground(new java.awt.Color(0, 102, 102));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(0, 102, 102));

        welcomeLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        welcomeLabel.setText("Bienvenido");

        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AlimentosLogo.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIcon)
                    .addComponent(welcomeLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        backPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 962, -1));

        menuPanel.setBackground(new java.awt.Color(0, 102, 102));

        btnInicio.setBackground(new java.awt.Color(0, 102, 102));
        btnInicio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnFruits.setBackground(new java.awt.Color(0, 102, 102));
        btnFruits.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnFruits.setForeground(new java.awt.Color(255, 255, 255));
        btnFruits.setText("Frutas y Verduras");
        btnFruits.setBorder(null);
        btnFruits.setBorderPainted(false);
        btnFruits.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFruits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFruitsActionPerformed(evt);
            }
        });

        btnFat.setBackground(new java.awt.Color(0, 102, 102));
        btnFat.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnFat.setForeground(new java.awt.Color(255, 255, 255));
        btnFat.setText("Grasas");
        btnFat.setBorder(null);
        btnFat.setBorderPainted(false);
        btnFat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatActionPerformed(evt);
            }
        });

        btnCarbs.setBackground(new java.awt.Color(0, 102, 102));
        btnCarbs.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCarbs.setForeground(new java.awt.Color(255, 255, 255));
        btnCarbs.setText("Hidratos de Carbono");
        btnCarbs.setBorder(null);
        btnCarbs.setBorderPainted(false);
        btnCarbs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarbsActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 102, 102));
        btnExit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("IniciarSesión");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(0, 102, 102));
        btnRegister.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registro");
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFruits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCarbs, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFruits, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarbs, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        backPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        backPanel.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 41, -1, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        showJPanel(new HomePanel());
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnFruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFruitsActionPerformed
        if(logged){
            showJPanel(new FrutasYVerdurasView());
        } else {
            JOptionPane.showMessageDialog(this, "El usuario no esta autenticado. Debe iniciar Sesión para continuar");
        }
    }//GEN-LAST:event_btnFruitsActionPerformed

    private void btnFatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatActionPerformed
        if(logged){
            showJPanel(new GrasasView());
        } else {
            JOptionPane.showMessageDialog(this, "El usuario no esta autenticado. Debe iniciar Sesión para continuar");
        }
    }//GEN-LAST:event_btnFatActionPerformed

    private void btnCarbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarbsActionPerformed
        if(logged){
            showJPanel(new HidratosDeCarbonoView());
        } else {
            JOptionPane.showMessageDialog(this, "El usuario no esta autenticado. Debe iniciar Sesión para continuar");
        }
    }//GEN-LAST:event_btnCarbsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(!logged){
            Login login = new Login();
            login.setVisible(true);
            this.dispose();

        } else {

            int option = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                //                    UserController.logout();
                //                    logged = false;
                setLogout();
                showJPanel(new HomePanel());
            }

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Register register = new Register();
        register.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton btnCarbs;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFat;
    private javax.swing.JButton btnFruits;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
