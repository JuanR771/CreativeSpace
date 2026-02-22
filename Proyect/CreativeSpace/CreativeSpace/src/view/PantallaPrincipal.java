
package view;

import controlador.ControlEventosPrincipal;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PantallaPrincipal extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    private SeccionNoticia seccionNoticia;
    
    public PantallaPrincipal(SeccionCRUDArte scr) {
      ControlEventosPrincipal cep = null;
      cep = new ControlEventosPrincipal();
   

        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        
        PantallaCrearNoticia sn2 = new PantallaCrearNoticia();
      seccionNoticia = sn2.getSeccionNoticia();
        seccionNoticia.setBounds(0, 100, 387, 352);
        jPanel1.add(seccionNoticia);
      
        
        
        SeccionNotificacion snt = new SeccionNotificacion();
        snt.setBounds(800,1,382, 95);
        jPanel1.add(snt);
        
        SeccionInforme si = null;
        try {
            si = new SeccionInforme();
        } catch (IOException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        SeccionReservas sr = null;
        try {
            sr = new SeccionReservas();
        } catch (IOException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Ajusta las coordenadas y el tamaño para el botón "Informe"
        int xInforme = 0;
        int yInforme = jPanel1.getHeight() - sn2.getSeccionNoticia().getHeight(); // Coloca la parte inferior del componente en la parte inferior del panel
        int anchoMitadPanel = jPanel1.getWidth() / 2;
        si.setBounds(xInforme, yInforme, anchoMitadPanel, 352);
        jPanel1.add(si);

        // Ajusta las coordenadas y el tamaño para el botón "Reservas" (al lado del botón "Informe")
        int xReservas = si.getWidth(); // Coloca el botón "Reservas" en la segunda mitad del panel
        int yReservas = jPanel1.getHeight() - sn2.getSeccionNoticia().getHeight(); // Coloca la parte inferior del componente en la parte inferior del panel
        sr.setBounds(0, yReservas, anchoMitadPanel, 352);
        jPanel1.add(sr);
     

        scr.setBounds(440,150,800, 800);
        jPanel1.add(scr);
        

         noticiaslabel.setText("<html>" + cep.mostrarNoticias().replace("\n", "<br/>") + "</html>");
           
    }
       

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        noticiaslabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        noticiaslabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(noticiaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(712, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(noticiaslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
   

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               SeccionCRUDArte scr = new SeccionCRUDArte("user");
                new PantallaPrincipal(scr).setVisible(true);
                
                
                // Crear instancias de SeccionNoticia y agregarlas a PantallaPrincipal
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel noticiaslabel;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel{
       
       private Image imagen_fondo;
       @Override
       public void paint(Graphics g){
           imagen_fondo = new ImageIcon(getClass().getResource("/espaciocreativo/img/fondoPP.jpg")).getImage();
           g.drawImage(imagen_fondo,0,0, getWidth(), getHeight(), this);
           setOpaque(false);
           
           super.paint(g);
           
           
       }
   }

}
