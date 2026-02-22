/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import controlador.ControlEventosUsuario;
import java.util.ArrayList;
import java.util.List;
import model.comprador;
import model.controlRegistro;
public class PantallaLogin extends javax.swing.JFrame {

     private controlRegistro controlRegistro;
   public static String user = "";
   String pass = "";

   
   FondoPanel fondo = new FondoPanel();
   
    public PantallaLogin() {
         this.controlRegistro = new controlRegistro();
         this.setContentPane(fondo);
            
          
       
        initComponents();
        
          ImageIcon icono = new ImageIcon(getClass().getResource("CARGA2-removebg-preview.png"));

        // Establecer el icono del marco
        setIconImage(icono.getImage());
        this.setLocationRelativeTo(null);
        
        TextPrompt prueba = new TextPrompt(" Usuario", txt_user);
        TextPrompt prueba2 = new TextPrompt(" Contraseña", txt_password);
        
        
        
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new FondoPanel();
        txt_user = new javax.swing.JTextField();
        Boton_inicio = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        registrate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(217, 211, 255));
        setLocationByPlatform(true);

        txt_user.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txt_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 0, 141), 2, true));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });

        Boton_inicio.setBackground(new java.awt.Color(217, 211, 255));
        Boton_inicio.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        Boton_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/espaciocreativo/img/Captura de pantalla 2024-04-30 231239.png"))); // NOI18N
        Boton_inicio.setText("Iniciar Sesión");
        Boton_inicio.setToolTipText("");
        Boton_inicio.setBorder(null);
        Boton_inicio.setBorderPainted(false);
        Boton_inicio.setContentAreaFilled(false);
        Boton_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_inicioActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 0, 141), 2, true));

        registrate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/espaciocreativo/img/Captura de pantalla 2024-05-01 032046.png"))); // NOI18N
        registrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrateMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/espaciocreativo/img/Captura de pantalla 2024-05-01 132422.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Captura de pantalla 2024-05-01 132426.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/CARGA2-removebg-preview.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Captura de pantalla 2024-05-01 155511.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Boton_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(156, 156, 156)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(registrate)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(Boton_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(registrate)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        Boton_inicio.getAccessibleContext().setAccessibleName("ISESION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_inicioActionPerformed
          user = txt_user.getText();
        pass = txt_password.getText();
        controlRegistro cr = new controlRegistro();
        ControlEventosUsuario ce = new ControlEventosUsuario();
         List<comprador> compradores = controlRegistro.cargarCompradores("compradores.txt");

       
        
             if(ce.verificarUsuario(user, pass,compradores)){
          SeccionCRUDArte scr = new SeccionCRUDArte(user);
          scr.ocultarBotones(); 
          if(user.equals("bb") && pass.equals("bb")){
            scr.mostrarBotones();
             }
            PantallaPrincipal c = new PantallaPrincipal(scr);
            c.setVisible(true);
            c.setLocationRelativeTo(null);
            this.setVisible(false);

        }
        
   
        
        
        
        
        
    }//GEN-LAST:event_Boton_inicioActionPerformed
 
    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void registrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrateMouseClicked
       controlRegistro control = new controlRegistro(); // Crear instancia de controlRegistro
       PantallaRegistro p = new PantallaRegistro();
       p.setVisible(true);
     
       this.setVisible(false);
    }//GEN-LAST:event_registrateMouseClicked

    public String getLoginUser(){
        return txt_user.getText();
        
        
       
    }
    
   
    
    
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
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  
     
                new PantallaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_inicio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel registrate;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables



 class FondoPanel extends JPanel{
       
       private Image imagen_fondo;
       @Override
       public void paint(Graphics g){
           imagen_fondo = new ImageIcon(getClass().getResource("fondo123.jpg")).getImage();
           g.drawImage(imagen_fondo,0,0, getWidth(), getHeight(), this);
           setOpaque(false);
           
           super.paint(g);
           
           
       }
   }

    


}
