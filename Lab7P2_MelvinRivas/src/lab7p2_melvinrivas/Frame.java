/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_melvinrivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l3306
 */
public class Frame extends javax.swing.JFrame {

    

    /**
     * Creates new form Frame
     */
    
    public static ArrayList <producto> produ = new ArrayList();
    DefaultTableModel modelo = new DefaultTableModel();
    public Frame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop = new javax.swing.JPopupMenu();
        Limpiar_Tablapop = new javax.swing.JMenuItem();
        Limpiar_Arbolpop = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        buscador = new javax.swing.JTextField();
        Boton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cargar = new javax.swing.JMenuItem();
        crear = new javax.swing.JMenuItem();
        Windows = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        Limpiar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        Limpiar_Tablapop.setText("Clean Tabla");
        Limpiar_Tablapop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar_TablapopActionPerformed(evt);
            }
        });
        pop.add(Limpiar_Tablapop);

        Limpiar_Arbolpop.setText("Clean Tree");
        pop.add(Limpiar_Arbolpop);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(arbol);

        Tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Category", "Price", "Aisle", "Bin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        buscador.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });

        Boton.setText("Enter");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(Boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        jMenu1.setText("File");

        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jMenu1.add(cargar);

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        jMenu1.add(crear);

        jMenuBar1.add(jMenu1);

        Windows.setText("Windows");

        jMenu3.setText("Clear");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Clear command line");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        Limpiar.setText("Clear table");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jMenu3.add(Limpiar);

        Windows.add(jMenu3);

        jMenuItem2.setText("Refresh tree");
        Windows.add(jMenuItem2);

        jMenuBar1.add(Windows);

        Help.setText("Help");

        jMenuItem1.setText("Declaracion de productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem1);

        jMenuItem3.setText("Commando del programa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem3);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorActionPerformed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        // TODO add your handling code here:
            cargartabla();
    }//GEN-LAST:event_BotonActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
        
      
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter capa = 
                    new FileNameExtensionFilter(
                            "Archivos de Texto", "txt");
            FileNameExtensionFilter capa2 = 
                new FileNameExtensionFilter(
                        "Imagenes", "jpg", "png", "bmp");
            jfc.setFileFilter(capa);
            jfc.addChoosableFileFilter(capa2);            
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {
        String busca = jfc.getSelectedFile().toString();
        administracio_persona ap = new administracio_persona(busca);
         ap.cargarArchivo();
        produ.addAll(ap.getListaPersonas());
        //a x3
        for (int i = 0; i < produ.size(); i++) {
            
            modelo = (DefaultTableModel) Tabla.getModel();
            Object[] k = {produ.get(i).getId(),produ.get(i).getName(),
            produ.get(i).getCategory(),produ.get(i).price,
            produ.get(i).aisle, produ.get(i).getBin()};
            modelo.addRow(k);
        }
        //a
        //a x2
            } //fin if
            
        } catch (Exception e) {
            
        }

        
    }//GEN-LAST:event_cargarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:
         JFileChooser fileChooser = new JFileChooser();
         
        BufferedWriter bw = null;
        int seleccion = fileChooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileWriter writer = new FileWriter(file + ".txt");
            bw = new BufferedWriter(writer);
                for (int i = 0; i < produ.size(); i++) {
                bw.write(produ.get(i).getId()+ ",");
                bw.write(produ.get(i).getName() + ",");
                bw.write(produ.get(i).getCategory()+ ",");
                bw.write(produ.get(i).getPrice()+ ",");
                bw.write(produ.get(i).getAisle()+ ",");
                bw.write(produ.get(i).getBin()+ ",");
            }
                bw.flush();
                writer.close();
                JOptionPane.showMessageDialog(this, "Archivo creado exitosamente");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al crear el archivo");
            }
        }

    }//GEN-LAST:event_crearActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
                
        Limpiar_Tabla();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void Limpiar_TablapopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar_TablapopActionPerformed
        // TODO add your handling code here:
        Limpiar_Tabla();
        
    }//GEN-LAST:event_Limpiar_TablapopActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        
           if (evt.isMetaDown()) {
            pop.show(evt.getComponent(),
                    evt.getX(), evt.getY());

        }


    }//GEN-LAST:event_TablaMouseClicked

    private void arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolMouseClicked
        // TODO add your handling code here:

        if (evt.isMetaDown()) {
            pop.show(evt.getComponent(),
                    evt.getX(), evt.getY());

        }

    }//GEN-LAST:event_arbolMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:

        if (evt.isMetaDown()) {
            pop.show(evt.getComponent(),
                    evt.getX(), evt.getY());
//a
        }     
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(this, "Los productos cuentan con sus respectivo (Codigo, Nombre"
                + ", Categoria, precio, pasillo y posicion de ubicacion)");
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:}
        
        JOptionPane.showMessageDialog(this, "Lista:  \nClear table = Borra todos los datos de la tabla"
                + "\nRefresh Tree = Reiniciara el arbol volviendolo a cargar"
                + "\nCargar = Podra insertar cualquier archivo de tipo txt para ser evaluado"
                + "\nCrear = Podra crear cualquier tipo de carpeta en la ubicacion de preferencia ");
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    
   
      public void cargartabla(){
      
                  // TODO add your handling code here:
        String busca = buscador.getText();
        administracio_persona ap = new administracio_persona(busca);
        ap.cargarArchivo();
        produ.addAll(ap.getListaPersonas());
        //ax4
        for (int i = 0; i < produ.size(); i++) {
            
            modelo = (DefaultTableModel) Tabla.getModel();
            Object[] k = { produ.get(i).getId(),produ.get(i).getName(),
            produ.get(i).getCategory(),produ.get(i).price,
            produ.get(i).aisle, produ.get(i).getBin()};
            modelo.addRow(k);
        }
        //a
      
      }
      public void Limpiar_Tabla(){
      
            DefaultTableModel modeli = (DefaultTableModel) Tabla.getModel();
        modeli.setRowCount(0);
        Tabla.setModel(modeli);
          
      }
     
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem Limpiar;
    private javax.swing.JMenuItem Limpiar_Arbolpop;
    private javax.swing.JMenuItem Limpiar_Tablapop;
    private javax.swing.JTable Tabla;
    private javax.swing.JMenu Windows;
    private javax.swing.JTree arbol;
    private javax.swing.JTextField buscador;
    private javax.swing.JMenuItem cargar;
    private javax.swing.JMenuItem crear;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu pop;
    // End of variables declaration//GEN-END:variables
}
