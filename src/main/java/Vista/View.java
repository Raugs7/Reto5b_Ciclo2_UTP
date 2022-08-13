/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.util.List;
import Controlador.ReportesController;
import Modelo.vo.*;
import Modelo.dao.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
/**
 *
 * @author SKAPHE
 */
public class View extends javax.swing.JFrame {
    private String repitaCaracter(Character caracter, Integer veces) {
    String respuesta = "";
    for (int i = 0; i < veces; i++) {
    respuesta += caracter;
    }
    return respuesta;
    }
    
    private static ReportesController ReportesController;
    private static LiderVo LiderVo;
    private static LiderDao LiderDao;

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        this.ReportesController = new ReportesController();
        this.LiderVo = new LiderVo();
        this.LiderDao = new LiderDao();        
        
    }
    
    public void informelider(){
        
        try{
            LinkedList<LiderVo> lideres = (LinkedList<LiderVo>) ReportesController.listarLideres();
            String columns[] = {"id", "nombre", "apellido", "ciudad"};
            DefaultTableModel  tbModel = (DefaultTableModel) tablaInforme1.getModel();
            for (String col : columns) {
                tbModel.addColumn(col);
            }
            
            for (LiderVo lider : lideres){
                String id = lider.getID();
                String primer_Apellido = lider.getPrimer_Apellido();
                String ciudad = lider.getCiudad();
                String nombre = lider.getNombre();
                String rows[] = {id, nombre, primer_Apellido, ciudad};
                tbModel.addRow(rows);
            }
           
            tituloInforme.setText("Informe de líderes");
            
            /**areaResultado2.setText(String.valueOf(lideres));
            
            for(LiderVo lider: lideres){             
                areaResultado2.setText(String.valueOf(lideres));               
                Object[] data = {lider};
                DefaultTableModel tableModel = new DefaultTableModel(data,2);
                tableModel.addRow(data);
                tablaInforme1.setModel(tableModel);
                
                
            } **/
            
        } catch (Exception e){
                tituloInforme.setText("Error: +" + e);
                e.printStackTrace();
                }                           
    
    }    
    
    public void informeproyectos(){
        
        try{
            tituloInforme.setText("Informe de proyectos");
            List<ProyectosVo> proyectos = ReportesController.listarProyectos();
            String columns[] = {"id", "Constructora", "# Habitaciones", "Ciudad"};
            DefaultTableModel  tbModel = (DefaultTableModel) tablaInforme1.getModel();
            for (String col : columns) {
                tbModel.addColumn(col);
            }
            
            for (ProyectosVo proyecto : proyectos){
                String id = proyecto.getID_Proyecto();
                String constructora = proyecto.getConstructora();
                String habitaciones = proyecto.getNumero_Habitaciones();
                String ciudad = proyecto.getCiudad();
                String rows[] = {id, constructora, habitaciones, ciudad};
                tbModel.addRow(rows);
            }                                  
            
            
            
            /**for(ProyectosVo proyecto: proyectos){
                tituloInforme.setText("Informe de proyectos");
                areaResultado2.setText(String.valueOf(proyecto));
            }**/
            
        } catch (Exception e){
                tituloInforme.setText("Error: +" + e);
                e.printStackTrace();
                }                           
    
    }    
    
    public void informeproveedores(){
        
        try{
            tituloInforme.setText("Informe de proveedores");
            List<ProveedoresVo> proveedores = ReportesController.listarProveedores();
            String columns[] = {"ID", "Constructora", "Banco vinculado"};
            DefaultTableModel  tbModel = (DefaultTableModel) tablaInforme1.getModel();
            for (String col : columns) {
                tbModel.addColumn(col);
            }
            
            for (ProveedoresVo proveedor : proveedores){
                String id = proveedor.getID_compra();
                String constructora = proveedor.getConstructora();
                String banco = proveedor.getBanco_vinculado();
                String rows[] = {id, constructora, banco};
                tbModel.addRow(rows);
            }  
            
        } catch (Exception e){
                tituloInforme.setText("Error: +" + e);
                e.printStackTrace();
                }                           
    
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        informe1btn = new javax.swing.JButton();
        informe2btn = new javax.swing.JButton();
        informe3btn = new javax.swing.JButton();
        limpiarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tituloInforme = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaInforme1 = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIENVENIDO A LA SECCIÓN DE INFORMES");

        jLabel2.setText("Haga clic sobre el informe que desee ver");

        informe1btn.setText("Informe 1");
        informe1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informe1btnActionPerformed(evt);
            }
        });

        informe2btn.setText("Informe 2");
        informe2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informe2btnActionPerformed(evt);
            }
        });

        informe3btn.setText("Informe 3");
        informe3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informe3btnActionPerformed(evt);
            }
        });

        limpiarbtn.setText("Limpiar");
        limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtnActionPerformed(evt);
            }
        });

        tituloInforme.setBackground(new java.awt.Color(242, 242, 242));
        tituloInforme.setBorder(null);
        tituloInforme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(tituloInforme);

        tablaInforme1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaInforme1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(informe1btn)
                                .addGap(18, 18, 18)
                                .addComponent(informe2btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(informe3btn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiarbtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(informe1btn)
                    .addComponent(informe2btn)
                    .addComponent(informe3btn)
                    .addComponent(limpiarbtn))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void informe1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informe1btnActionPerformed
        limpiarCampos();
        // TODO add your handling code here:
        informelider();
        
    }//GEN-LAST:event_informe1btnActionPerformed

    private void informe2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informe2btnActionPerformed
        // TODO add your handling code here:
        
            limpiarCampos();
            informeproyectos();
        
    }//GEN-LAST:event_informe2btnActionPerformed

    private void informe3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informe3btnActionPerformed
        // TODO add your handling code here:
        
            limpiarCampos();
            informeproveedores();
    }//GEN-LAST:event_informe3btnActionPerformed

    private void limpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtnActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_limpiarbtnActionPerformed

    
    private void limpiarCampos() {        
        tituloInforme.setText("");        
        DefaultTableModel model_info;
        //JTable variable name is jTable1_info....
        model_info=(DefaultTableModel)tablaInforme1.getModel();
        //Clear all the column name on jtable jpanel-4
        model_info.setColumnCount(0);
        ((DefaultTableModel)tablaInforme1.getModel()).setNumRows(0);
        
    }
    
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton informe1btn;
    private javax.swing.JButton informe2btn;
    private javax.swing.JButton informe3btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton limpiarbtn;
    private javax.swing.JTable tablaInforme1;
    private javax.swing.JTextPane tituloInforme;
    // End of variables declaration//GEN-END:variables
}
