/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controlador.ControlEventosPrincipal;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author RozoJ
 */
public class PantallaCrearObra extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    private final List<String> materiales = new ArrayList<>();
    
    public PantallaCrearObra() {
       this.setContentPane(fondo); 
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setSize(1252, 735);
        this.setLocationRelativeTo(null);
     
         buttonGroup1.add(cuadrobtn);
         buttonGroup1.add(esculturabtn);
         buttonGroup1.add(instalabtn);
         
                       field1.setVisible(false);
                 field2.setVisible(false);
                field3.setVisible(false);
                field4.setVisible(false);
                field5.setVisible(false);
                field6.setVisible(false);
                añadirbtn.setVisible(false);
                 extralabel1.setVisible(false);
                extralabel2.setVisible(false);
                labeltitulo.setVisible(false);
                 fechalabel.setVisible(false);
                preciolabel.setVisible(false);
                 descripcionlabel.setVisible(false);
                 extralabel3.setVisible(false);
              
                 extralabel6.setVisible(false);
                  extralabel4.setVisible(false);
                   extralabel5.setVisible(false);
                 
                    field7.setVisible(false);
                    field8.setVisible(false);
                    field9.setVisible(false);
                    field10.setVisible(false);
         
         instalabtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(instalabtn.isSelected()){
            
                        field1.setVisible(true);
                 field2.setVisible(true);
                field3.setVisible(true);
                field4.setVisible(true);
                field5.setVisible(true);
                field6.setVisible(true);
                añadirbtn.setVisible(true);
                 extralabel1.setVisible(true);
                extralabel2.setVisible(true);
                labeltitulo.setVisible(true);
                 fechalabel.setVisible(true);
                preciolabel.setVisible(true);
                 descripcionlabel.setVisible(true);
                 descripcionlabel.setText("Descripción");
                 extralabel1.setText("Nombre");
                 extralabel2.setText("Precio");
                 extralabel3.setVisible(false);
                 extralabel3.setText("Duracion");
                 extralabel4.setText("Formato");
                 extralabel5.setText("Color");
                 extralabel6.setVisible(false);
                  extralabel4.setVisible(false);
                   extralabel5.setVisible(false);
                 
                    field7.setVisible(false);
                    field8.setVisible(false);
                    field9.setVisible(false);
                    field10.setVisible(false);
                }
            }
        });
         
               esculturabtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(esculturabtn.isSelected()){
                 field1.setVisible(true);
                 field2.setVisible(true);
                field3.setVisible(true);
                field4.setVisible(true);
                field5.setVisible(true);
                field6.setVisible(true);
                añadirbtn.setVisible(false);
                 extralabel1.setVisible(true);
                extralabel2.setVisible(true);
                labeltitulo.setVisible(true);
                 fechalabel.setVisible(true);
                preciolabel.setVisible(true);
                 descripcionlabel.setVisible(true);
                 descripcionlabel.setText("Material");
                 extralabel1.setText("Peso");
                 extralabel2.setText("Tamaño");
                 extralabel3.setVisible(true);
                 extralabel3.setText("Duracion");
                 extralabel4.setText("Formato");
                 extralabel5.setText("Color");
                 extralabel6.setVisible(false);
                  extralabel4.setVisible(true);
                   extralabel5.setVisible(true);
                 
                    field7.setVisible(true);
                    field8.setVisible(true);
                    field9.setVisible(true);
                    field10.setVisible(false);
                        }
            }
        });
               
              cuadrobtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                              if(cuadrobtn.isSelected()){
                 field1.setVisible(true);
                 field2.setVisible(true);
                field3.setVisible(true);
                field4.setVisible(true);
                field5.setVisible(true);
                field6.setVisible(true);
                añadirbtn.setVisible(false);
                 extralabel1.setVisible(true);
                extralabel2.setVisible(true);
                labeltitulo.setVisible(true);
                 fechalabel.setVisible(true);
                preciolabel.setVisible(true);
                 descripcionlabel.setVisible(true);
                 descripcionlabel.setText("Dimensiones");
                 extralabel1.setText("Tecnica");
                 extralabel2.setText("Tema");
                 extralabel3.setVisible(true);
                 extralabel3.setText("Clasificación");
                 extralabel4.setText("Resolución");
                 extralabel5.setText("FormatoArchivo");
                 extralabel6.setText("Dimensiones");
                  extralabel4.setVisible(true);
                   extralabel5.setVisible(true);
                    extralabel6.setVisible(true);
                    field7.setVisible(true);
                    field8.setVisible(true);
                    field9.setVisible(true);
                    field10.setVisible(true);
                        }
            }
        });
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new FondoPanel();
        instalabtn = new javax.swing.JCheckBox();
        esculturabtn = new javax.swing.JCheckBox();
        cuadrobtn = new javax.swing.JCheckBox();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field4 = new javax.swing.JTextField();
        preciolabel = new javax.swing.JLabel();
        labeltitulo = new javax.swing.JLabel();
        fechalabel = new javax.swing.JLabel();
        descripcionlabel = new javax.swing.JLabel();
        extralabel3 = new javax.swing.JLabel();
        extralabel4 = new javax.swing.JLabel();
        extralabel5 = new javax.swing.JLabel();
        extralabel6 = new javax.swing.JLabel();
        field7 = new javax.swing.JTextField();
        field8 = new javax.swing.JTextField();
        field9 = new javax.swing.JTextField();
        field10 = new javax.swing.JTextField();
        field5 = new javax.swing.JTextField();
        field6 = new javax.swing.JTextField();
        extralabel1 = new javax.swing.JLabel();
        extralabel2 = new javax.swing.JLabel();
        añadirbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        preciolabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N

        labeltitulo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N

        fechalabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        fechalabel.setText("  ");

        descripcionlabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        descripcionlabel.setText("Descripción:");

        extralabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        extralabel3.setText("Clasificación:");

        extralabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        extralabel4.setText("Resolución:");

        extralabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        extralabel5.setText("Formato del archivo:");

        extralabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        extralabel6.setText("Dimensiones:");

        extralabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        extralabel1.setText("Nombre del material:");

        extralabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        extralabel2.setText("Precio del material:");

        añadirbtn.setText("Añadir Material");
        añadirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirbtnActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/espaciocreativo/img/Captura de pantalla 2024-05-17 221645.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(descripcionlabel)
                                    .addGap(244, 244, 244)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(añadirbtn)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(extralabel1)
                                    .addComponent(extralabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cuadrobtn)
                                    .addComponent(instalabtn)))
                            .addComponent(esculturabtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(217, 217, 217)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(labeltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(fechalabel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                    .addComponent(preciolabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(field2)
                                                    .addComponent(field3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                    .addComponent(field1))))
                                        .addGap(111, 111, 111)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(extralabel5)
                                            .addComponent(extralabel4)
                                            .addComponent(extralabel6)
                                            .addComponent(extralabel3))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(field8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                                .addComponent(field9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(field10)))
                                        .addGap(0, 143, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(292, 292, 292)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(instalabtn)
                .addGap(18, 18, 18)
                .addComponent(cuadrobtn)
                .addGap(18, 18, 18)
                .addComponent(esculturabtn)
                .addGap(247, 247, 247)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labeltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(preciolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechalabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extralabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extralabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extralabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extralabel6))))
                .addGap(36, 36, 36)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionlabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(extralabel1)
                            .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(extralabel2)
                            .addComponent(field6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(añadirbtn))
                .addGap(327, 327, 327))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(548, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirbtnActionPerformed
        String nombre_material = field5.getText();
        String precio_material = field6.getText();
        field5.setText(" ");
        field6.setText(" ");
        
        materiales.add(nombre_material+","+precio_material);
    }//GEN-LAST:event_añadirbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(instalabtn.isSelected()){
       try {
        ControlEventosPrincipal ce = new ControlEventosPrincipal();
        Float precio = Float.valueOf(field2.getText());
        String fechaTexto = field3.getText().trim();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = formatoFecha.parse(fechaTexto);
        ce.CrearObraInstalacion(precio, field1.getText(), fechaDate, field4.getText(), materiales);
        JOptionPane.showMessageDialog(null, "|Instalacion creada!.", "Error de Formato de Precio", JOptionPane.PLAIN_MESSAGE);
    } catch (ParseException ex) {
        Logger.getLogger(PantallaCrearObra.class.getName()).log(Level.SEVERE, "Fecha inválida. Por favor, ingrese la fecha en formato dd/MM/yyyy.", ex);
        JOptionPane.showMessageDialog(null, "Fecha inválida. Por favor, ingrese la fecha en formato dd/MM/yyyy.", "Error de Formato de Fecha", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException ex) {
        Logger.getLogger(PantallaCrearObra.class.getName()).log(Level.SEVERE, "Formato de precio inválido", ex);
        JOptionPane.showMessageDialog(null, "Formato de precio inválido. Por favor, ingrese un número válido.", "Error de Formato de Precio", JOptionPane.ERROR_MESSAGE);
    }
       
      }
      
            if(cuadrobtn.isSelected()){
                   try {
        Float precio = Float.parseFloat(field2.getText());
        ControlEventosPrincipal ce = new ControlEventosPrincipal();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); // Actualizamos el formato a dd/MM/yyyy
        String fechaTexto = field3.getText().trim();
        Date fechaDate = formatoFecha.parse(fechaTexto);
        int dimensiones = Integer.parseInt(field4.getText());
        int resolucion = Integer.parseInt(field8.getText());
        int dimensionesImagen = Integer.parseInt(field10.getText());

        ce.CrearObraCuadro(precio, field1.getText(), fechaDate, dimensiones, field5.getText(), field6.getText(), field7.getText(), resolucion, field9.getText(), dimensionesImagen);
    } catch (ParseException ex) {
        Logger.getLogger(PantallaCrearObra.class.getName()).log(Level.SEVERE, "Fecha inválida. Por favor, ingrese la fecha en formato dd/MM/yyyy.", ex);
        JOptionPane.showMessageDialog(null, "Fecha inválida. Por favor, ingrese la fecha en formato dd/MM/yyyy.", "Error de Formato de Fecha", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException ex) {
        Logger.getLogger(PantallaCrearObra.class.getName()).log(Level.SEVERE, "Formato de número inválido", ex);
        JOptionPane.showMessageDialog(null, "Formato de número inválido. Por favor, ingrese un número válido.", "Error de Formato de Número", JOptionPane.ERROR_MESSAGE);
    }
                
         
       
      }
            
             if(esculturabtn.isSelected()){
      try {
        ControlEventosPrincipal ce = new ControlEventosPrincipal();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); // Actualizamos el formato a dd/MM/yyyy
        String fechaTexto = field3.getText().trim();
        Date fechaDate = formatoFecha.parse(fechaTexto);
        Float precio = Float.parseFloat(field2.getText());
        int peso = Integer.parseInt(field5.getText());
        int duracion = Integer.parseInt(field7.getText());

        ce.CrearObraEscultura(precio, field1.getText(), fechaDate, field4.getText(), peso, field6.getText(), duracion, field8.getText(), field9.getText());
    } catch (ParseException ex) {
        Logger.getLogger(PantallaCrearObra.class.getName()).log(Level.SEVERE, "Fecha inválida. Por favor, ingrese la fecha en formato dd/MM/yyyy.", ex);
        JOptionPane.showMessageDialog(null, "Fecha inválida. Por favor, ingrese la fecha en formato dd/MM/yyyy.", "Error de Formato de Fecha", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException ex) {
        Logger.getLogger(PantallaCrearObra.class.getName()).log(Level.SEVERE, "Formato de número inválido", ex);
        JOptionPane.showMessageDialog(null, "Formato de número inválido. Por favor, ingrese un número válido.", "Error de Formato de Número", JOptionPane.ERROR_MESSAGE);
    }
          
                
         
       
      }
    }//GEN-LAST:event_jButton1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(PantallaCrearObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCrearObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCrearObra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cuadrobtn;
    private javax.swing.JLabel descripcionlabel;
    private javax.swing.JCheckBox esculturabtn;
    private javax.swing.JLabel extralabel1;
    private javax.swing.JLabel extralabel2;
    private javax.swing.JLabel extralabel3;
    private javax.swing.JLabel extralabel4;
    private javax.swing.JLabel extralabel5;
    private javax.swing.JLabel extralabel6;
    private javax.swing.JLabel fechalabel;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field10;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field4;
    private javax.swing.JTextField field5;
    private javax.swing.JTextField field6;
    private javax.swing.JTextField field7;
    private javax.swing.JTextField field8;
    private javax.swing.JTextField field9;
    private javax.swing.JCheckBox instalabtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JLabel preciolabel;
    // End of variables declaration//GEN-END:variables
 class FondoPanel extends JPanel{
       
       private Image imagen_fondo;
       @Override
       public void paint(Graphics g){
           imagen_fondo = new ImageIcon(getClass().getResource("/espaciocreativo/img/fondoCrearObra.jpg")).getImage();
           g.drawImage(imagen_fondo,0,0, getWidth(), getHeight(), this);
           setOpaque(false);
           
           super.paint(g);
           
           
       }
   }

}
