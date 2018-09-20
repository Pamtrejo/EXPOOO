/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Conexion;
import Modelos.Residentes;
import Clases.DALresidentes;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author juan
 */
public class Fresidentes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Fresidentes
     */
    public Fresidentes() {
        initComponents();this.ver();this.llenarcombo1();this.llenarcombo2();this.jLabel3.setVisible(false);
        this.jLabel9.setVisible(false);this.jLabel10.setVisible(false);
        this.jLabel5.setText("");this.jLabel6.setText("");
    }

    Conexion cn = new Conexion();
 List<Residentes> listaresidentes  = new LinkedList<Residentes>();
 
 public void ver(){
       try{
            DALresidentes dal = new  DALresidentes();
         listaresidentes = dal.getResidentes();
         Object datos[]=new Object[listaresidentes.size()];
          for(int i=0; i < listaresidentes.size();i++){
              datos[i]= listaresidentes.get(i).getIdResidente()+" - "+ listaresidentes.get(i).getNombre();
         }
          this.jList1.setListData(datos); this.jList1.setVisible(true);
         
        }catch(Exception ex){  JOptionPane.showMessageDialog(this, ex.getMessage());}  
    }
 
  public void ver2(int id){
       try{
            DALresidentes dal = new  DALresidentes();
         listaresidentes = dal.getResidentes(id);
         
         this.jTextField1.setText(listaresidentes.get(0).getNombre());
        this.jLabel3.setText(String.valueOf(listaresidentes.get(0).getIdResidente()));
       this.jTextField2.setText(listaresidentes.get(0).getDescripcion());
       this.jLabel9.setText(String.valueOf(listaresidentes.get(0).getIdMembresia()));
        this.jLabel10.setText(String.valueOf(listaresidentes.get(0).getIdTipoResidente()));
        
        this.viendomebre(); this.viendoreside();
        }catch(Exception ex){  JOptionPane.showMessageDialog(this, ex.getMessage());}  
    }
    
  public void llenarcombo1(){
      try{
         Statement s = cn.getConexion().createStatement();
              ResultSet rs = s.executeQuery ("select * from Membresia");
                int d =0;
              while (rs.next()) 
                    { 
                    this.jComboBox1.addItem(String.valueOf(rs.getInt(1))+"-"+rs.getString(2));
                    }
      }catch(Exception ex){}
       
  }
  
   public void llenarcombo2(){
      try{
         Statement s = cn.getConexion().createStatement();
              ResultSet rs = s.executeQuery ("select * from TipoResidente");
                int d =0;
              while (rs.next()) 
                    { 
                    this.jComboBox2.addItem(String.valueOf(rs.getInt(1))+"-"+rs.getString(2));
                    }
      }catch(Exception ex){}
       
  }
   
   public void viendomebre(){
      try{
         Statement s = cn.getConexion().createStatement();
              ResultSet rs = s.executeQuery ("select tipomembresia from Membresia where idmembresia = "+this.jLabel9.getText());
               while (rs.next()) 
                    { 
                    this.jLabel5.setText(rs.getString(1));
                    }
      }catch(Exception ex){}
       
  }
   
    public void viendoreside(){
      try{
         Statement s = cn.getConexion().createStatement();
              ResultSet rs = s.executeQuery ("select tiporesidente from tiporesidente where IdTipoResidente = "+this.jLabel10.getText());
               while (rs.next()) 
                    { 
                    this.jLabel6.setText(rs.getString(1));
                    }
      }catch(Exception ex){}
       
  }
   public String[] sacarid(String a){
        String[]val = a.split("-");
        return val;
   }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtnImprimirVisitas = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 684));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(1370, 710));
        jPanel3.setPreferredSize(new java.awt.Dimension(1350, 650));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        jButton1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(75, 123, 125));
        jButton1.setText("Guardar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 140, 45));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 40));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 300, 40));

        jButton2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(75, 123, 125));
        jButton2.setText("Editar");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 130, 45));

        jButton3.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(75, 123, 125));
        jButton3.setText("Eliminar");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 160, 45));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(75, 123, 125));
        jButton4.setText("Nuevo");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 170, 50));

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 300, 40));

        jLabel8.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(75, 123, 125));
        jLabel8.setText("Tipo Residentes");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 40));

        jComboBox2.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 300, 40));

        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        jLabel9.setText("jLabel9");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, -1));

        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        jbtnImprimirVisitas.setBackground(new java.awt.Color(51, 51, 51));
        jbtnImprimirVisitas.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jbtnImprimirVisitas.setForeground(new java.awt.Color(75, 123, 125));
        jbtnImprimirVisitas.setText("Reporte");
        jbtnImprimirVisitas.setBorder(null);
        jbtnImprimirVisitas.setContentAreaFilled(false);
        jbtnImprimirVisitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnImprimirVisitasMouseClicked(evt);
            }
        });
        jbtnImprimirVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImprimirVisitasActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnImprimirVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 590, 190, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-notas_1.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reportar (1).png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 500, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(75, 123, 125));
        jLabel18.setText("Membresia");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 50));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(75, 123, 125));
        jLabel20.setText("Nombre Residente");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 50));

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 123, 125));
        jLabel2.setText("Descripción");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 390, 30));

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 4));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jList1.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(75, 123, 125));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 420, 190));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 460, 270));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Modern No. 20", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(75, 123, 125));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resi.png"))); // NOI18N
        jLabel12.setText("                                   VISITAS");
        jLabel12.setOpaque(true);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try{
            int g=0; String a=this.jList1.getSelectedValue().toString(); String b="";
            for(int i=1; i < a.length();i++)
            {
                if(!a.substring(g,i).equals(" "))
                {
                    b += a.substring(g, i);
                }
                else
                {
                    i = a.length();
                }
                g++;
            }
            this.jLabel2.setText(b); int vb=0;
            vb = Integer.parseInt(b);
            this.ver2(vb);

        }catch(Exception ex){}
    }//GEN-LAST:event_jList1MouseClicked

    private void jbtnImprimirVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImprimirVisitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnImprimirVisitasActionPerformed

    private void jbtnImprimirVisitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnImprimirVisitasMouseClicked
        // TODO add your handling code here:
        String path="";
        try{
            path=getClass().getResource("/Reportes/Residentesyduenos.jasper").getPath();
            path=URLDecoder.decode(path, "UTF-8");
            Connection cn = Conexion.getConexion();
            Map parametros=new HashMap();
            JasperReport reporte=(JasperReport)JRLoader.loadObject(path);
            JasperPrint imprimir= JasperFillManager.fillReport(reporte,parametros,cn);
            JasperViewer visor=new JasperViewer(imprimir,false);
            visor.setTitle("Reporte de visitas");
            visor.setVisible(true);
        }catch(Exception ex){
            System.out.println(ex.getMessage());

        }
    }//GEN-LAST:event_jbtnImprimirVisitasMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.jLabel3.setText(""); this.jLabel4.setText("");
        this.jTextField1.setText(""); this.jTextField2.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(this.jLabel3.getText().length()>0){
            if(JOptionPane.showConfirmDialog(null, "Desea Eliminar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
            {
                String strsql="delete from Residentes where IdResidente="+this.jLabel3.getText()+"";

                if(cn.ejecutarsql(strsql)==true){
                    JOptionPane.showMessageDialog(this, "Información Procesada");
                    this.ver();
                }
                else{
                    JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(this.jLabel3.getText().length()>0){
            if(JOptionPane.showConfirmDialog(null, "Desea Modificar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
            {
                String strsql="update Residentes set nombre = '"+this.jTextField1.getText()+"',descripcion = '"+this.jTextField2.getText()+"',IdMembresia ="+this.sacarid(this.jComboBox1.getSelectedItem().toString())[0]+",IdTipoResidente="+this.sacarid(this.jComboBox2.getSelectedItem().toString())[0]+" where IdResidente = "+this.jLabel3.getText()+"";

                if(cn.ejecutarsql(strsql)==true){
                    JOptionPane.showMessageDialog(this, "Información Procesada");
                    this.ver();
                }
                else{
                    JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.jLabel3.getText().length()>0){
            if(JOptionPane.showConfirmDialog(null, "Desea Agregar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
            {
                String strsql="insert into Residentes values('"+this.jTextField1.getText()+"','"+this.jTextField2.getText()+"',"+this.sacarid((String)this.jComboBox1.getSelectedItem())[0]+","+this.sacarid((String)this.jComboBox2.getSelectedItem())[0]+")";
                if(cn.ejecutarsql(strsql)==true){
                    JOptionPane.showMessageDialog(this, "Información Procesada");
                    this.ver();
                }
                else{
                    JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                }
            }
        }
        else{

        }
        // JOptionPane.showMessageDialog(this, this.jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnImprimirVisitas;
    private java.awt.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
