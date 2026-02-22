/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SPLASH extends javax.swing.JFrame {

   private Color mTransaparent;

    public SPLASH() {   
        
        mTransaparent = new Color(0,0,0,0);
        setUndecorated(true);
         setBackground(mTransaparent);
        initComponents();
        setLocationRelativeTo(null);
       
        
        ImageDecore mFondo = new ImageDecore(panelback, "CARGA2-removebg-preview.png");
        panelback.add(mFondo).repaint();
        panelback.setOpaque(false);
        panelback.setBorder(null);
        panelback.setBackground(mTransaparent);
       
      
         this.setLocationRelativeTo(null);
        ProgessBarIniciado();
                
    }

 public class ImageDecore extends javax.swing.JLabel {
    private int width; 
    private int height;
    private String path;
    
    public ImageDecore(JPanel jPanel, String path) {
        this.path = path;
        this.width = jPanel.getWidth();
        this.height = jPanel.getHeight();
        this.setSize(width, height);
    }
    
    public void paint(Graphics graphics) {
        ImageIcon img = new ImageIcon(getClass().getResource(path));
        graphics.drawImage(img.getImage(), 0, 0, width, height, null);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PBcarga = new javax.swing.JProgressBar();
        panelback = new javax.swing.JPanel();

        PBcarga.setBackground(new java.awt.Color(102, 102, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        javax.swing.GroupLayout panelbackLayout = new javax.swing.GroupLayout(panelback);
        panelback.setLayout(panelbackLayout);
        panelbackLayout.setHorizontalGroup(
            panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        panelbackLayout.setVerticalGroup(
            panelbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        Runnable mRun = () -> {
            
            SPLASH mSplash = new SPLASH();
            mSplash.setVisible(true);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
            
            mSplash.dispose();
            new PantallaLogin().setVisible(true);
            
          
          
        };
        
        Thread mHiloSplash = new Thread(mRun);
        mHiloSplash.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar PBcarga;
    private javax.swing.JPanel panelback;
    // End of variables declaration//GEN-END:variables

   
   private void ProgessBarIniciado(){
       Timer mTimer= new Timer(45, (ActionEvent e) ->{
           
           PBcarga.setValue(PBcarga.getValue() +1);
       
           PBcarga.setStringPainted(true);
           PBcarga.setString("Cargando..." + PBcarga.getValue() + "%");
          
           
           
       
           
       });
       
       mTimer.start();
   }

}
