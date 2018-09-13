/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Conexion;
import Clases.DAL;
import Clases.DynamicButton;
import Clases.ObjetoCasas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author panay
 */
public class Croquis extends javax.swing.JInternalFrame {

    /**
     * Creates new form Croquis
     */
    private List<DynamicButton> Casas;
    private int indice=0;
    public Croquis() {
        initComponents();
        cargarcasas();
    }
private void cargarcasas(){
     try {
            List<ObjetoCasas> M=DAL.ObtenerCasas(Conexion.getConexion()); 
              Casas=new ArrayList<>();
            for(ObjetoCasas t : M){
          
            DynamicButton casa=new DynamicButton("Casa"+t.GetIdCasas());
            casa.Setnumerocasa(t.GetIdCasas());
            casa.Setestadocasa(t.GetIdEstado());
            casa.addActionListener((ActionEvent Arg0) -> {
                
                
               
                try {
                    DynamicButton neobject=(DynamicButton)(Arg0.getSource());
                    ObjetoCasas ll=DAL.ObtenerCasasPorId(Conexion.getConexion(), neobject.getnumerocasa());
                    JPanel a=ll.GetallData();
                   PanelInfo.removeAll();
                   PanelInfo.repaint();
                    a.setSize(PanelInfo.getSize());
                   
                    PanelInfo.add(a);
                   PanelInfo.updateUI();
                } catch (SQLException ex) {
                    Logger.getLogger(Croquis.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                // aquí el código que quieres ejecutar cuando el botón sea presionado
                
            });
            jPanel1.add(casa);
            indice++;
            Casas.add(casa);
            }
            
            jPanel1.updateUI();
        } catch (SQLException ex) {
            Logger.getLogger(Croquis.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        PanelInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new java.awt.GridLayout(0, 8));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        jLabel1.setText("Detalle Casa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
