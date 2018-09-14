/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.*;
import Modelos.*;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toshiba
 */
public class Facturas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Facturas
     */
    
    private Menu pane;
    
    public Facturas() {
        initComponents();
    }
    
    public Facturas(Menu pane) {
        initComponents();
        this.pane = pane;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFactura = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jbtnBuscar2 = new javax.swing.JButton();
        jbtnAñadir2 = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FacturasTable = new javax.swing.JTable();

        jpFactura.setAlignmentX(3.3F);
        jpFactura.setOpaque(false);
        jpFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Bodoni MT Black", 0, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 15, 27));
        jLabel23.setText("FACTURACIÓN");
        jpFactura.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 50));

        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        jpFactura.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 510, 40));

        jbtnBuscar2.setBackground(new java.awt.Color(102, 102, 102));
        jbtnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa-para-buscar.png"))); // NOI18N
        jbtnBuscar2.setToolTipText("");
        jbtnBuscar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        jbtnBuscar2.setContentAreaFilled(false);
        jbtnBuscar2.setOpaque(true);
        jpFactura.add(jbtnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 50, 40));

        jbtnAñadir2.setBackground(new java.awt.Color(102, 102, 102));
        jbtnAñadir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anadir.png"))); // NOI18N
        jbtnAñadir2.setToolTipText("");
        jbtnAñadir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        jbtnAñadir2.setContentAreaFilled(false);
        jbtnAñadir2.setOpaque(true);
        jbtnAñadir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAñadir2MouseClicked(evt);
            }
        });
        jpFactura.add(jbtnAñadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 50, 40));

        jbtnModificar.setBackground(new java.awt.Color(102, 102, 102));
        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anadir-punto-de-anclaje.png"))); // NOI18N
        jbtnModificar.setToolTipText("");
        jbtnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        jbtnModificar.setContentAreaFilled(false);
        jbtnModificar.setOpaque(true);
        jpFactura.add(jbtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 50, 40));

        jScrollPane2.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        FacturasTable.setBackground(new java.awt.Color(102, 102, 102));
        FacturasTable.setForeground(new java.awt.Color(255, 255, 255));
        FacturasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Correlativo", "Vivienda", "Dueño", "Mes"
            }
        ));
        FacturasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturasTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(FacturasTable);

        jpFactura.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 940, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    List<Recibos>  listarecibos = new LinkedList<Recibos>();
    DefaultTableModel model = new DefaultTableModel();
    private int IdRecibo = 0;
    
    
    //Residentes obj = new Residentes();
    Usuarios ob=  new Usuarios();
    Visitas o= new Visitas();
    NuevaFactura nueva = new NuevaFactura();
    
                    

    
    
     public void llenarTablaVwModelRecibos(){
        model =new DefaultTableModel();
        List<ViewModelRecibos> listaViewModelRecibos= new LinkedList<ViewModelRecibos>();
        FacturasTable.removeAll();
        DALRecibos dalRecibos = new DALRecibos();
      
        try {
            
            
            listaViewModelRecibos = dalRecibos.getViewModelRecibos();
            //DefaultTableModel model = new DefaultTableModel();
            String[] columnas = {"Código de Recibo",
                                "Código de Pago",
                                "idVivienda / IdResidente",
                                "Dueño / Residente",
                                "Descripción",
                                "Tipo Pago",
                                "Monto"};
            
            
            model.setColumnIdentifiers(columnas);
            
            
            for(ViewModelRecibos r : listaViewModelRecibos){
                
                Object[] o = new Object[7];
                o[0] = r.getIdRecibos();
                o[1] = r.getIdPago();
                o[2] = r.getIdVivienda()!=0?r.getIdVivienda():r.getIdResidente();
                o[3] = r.getNombreDueno()!=null?r.getNombreDueno():r.getNombreResidente();
                o[4] = r.getDescripcion();
                o[5] = r.getTipoPago();
                o[6] = r.getMonto();
                model.addRow(o);
            }
            
            FacturasTable.setModel(model);
            
            
        } catch (Exception ex) {
            
            System.out.println(ex.toString());
          //  Logger.getLogger(PnFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
     
     public void llenarTabla(){
        model =new DefaultTableModel();
        listarecibos = new LinkedList<Recibos>();
        FacturasTable.removeAll();
        DALRecibos recibos = new DALRecibos();
        DALVivienda viviendas = new DALVivienda();
        DALPagos pagos = new DALPagos();
        DALDueno dueno = new DALDueno();

        try {
            
            
            listarecibos = recibos.getRecibos();
            //DefaultTableModel model = new DefaultTableModel();
            String[] columnas = {"Código de Recibo",
                                "Código de Pago",
                                "Vivienda",
                                "Dueño",
                                "Descripción"};
            
            
            model.setColumnIdentifiers(columnas);
            
            
            for(Recibos r : listarecibos){
            
                Pagos pag = pagos.getPagos(r.getIdPago()).get(0);
                Viviendas vivien = viviendas.getViviendas(pag.getIdVivienda()).get(0);
                Modelos.Dueno duen = dueno.getDuenos(vivien.getIdDueno()).get(0);
                Object[] o = new Object[5];
                o[0] = r.getIdRecibos();
                o[1] = r.getIdPago();
                o[2] = pag.getIdVivienda();
                o[3] = duen.getNombre();
                o[4] = r.getDescripcion();
                model.addRow(o);
            }
            
            FacturasTable.setModel(model);
            
            
        } catch (Exception ex) {
            
            System.out.println(ex.toString());
          //  Logger.getLogger(PnFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
     
     public void limpiarformularios(){
        nueva.dispose();
        
    }
     
     
    private void jbtnAñadir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAñadir2MouseClicked
        // TODO add your handling code here:       
       
        
        pane.setNfac(nueva);      
        pane.limpiarformularios();
        nueva = new NuevaFactura();
        nueva.llenarComboBoxFacturas();
        //nueva = new NuevaFactura();
        nueva.setIdRecibo(0);     
        pane.getjDesktopPane1().removeAll();
        pane.getjDesktopPane1().add(nueva);
       
//        nueva.setVisible(true);
        this.setVisible(false);     
        nueva.setVisible(true);
        nueva.setTitle("FACTURAS");
        nueva.show();
     
        

    }//GEN-LAST:event_jbtnAñadir2MouseClicked

    private void FacturasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacturasTableMouseClicked
        // TODO add your handling code here:
        pane.limpiarformularios();
        pane.setNfac(nueva);
        nueva.llenarComboBoxFacturas();
        IdRecibo = (int) FacturasTable.getValueAt(FacturasTable.getSelectedRow(), 0);
        nueva.setIdRecibo(IdRecibo);
        pane.setNfac(nueva);
        nueva.setIdRecibo(IdRecibo);
        nueva.VistaModificar();
        pane.getjDesktopPane1().add(nueva);
   
        nueva.setVisible(true);
        this.setVisible(false);     
        nueva.setVisible(true);
        nueva.setTitle("FACTURAS");
        nueva.show();
        
    }//GEN-LAST:event_FacturasTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FacturasTable;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtnAñadir2;
    private javax.swing.JButton jbtnBuscar2;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JPanel jpFactura;
    // End of variables declaration//GEN-END:variables
}
