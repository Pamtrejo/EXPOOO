/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */

import Clases.Conexion;
import Clases.ValidacionesCampos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;
public class Dueno extends javax.swing.JInternalFrame {

    /**
     * Creates new form Duenos
     */
    public Dueno() {
        initComponents();this.ver();
        this.jTextField4.setVisible(false);
    }

    Conexion cn = new Conexion();
    public void ver(){
        try{
             Statement s = cn.getConexion().createStatement();
              ResultSet rs = s.executeQuery ("select IdDueno,nombre from dueno order by IdDueno DESC");
                int d =0;
              while (rs.next()) 
                    { 
                     d++;
                    }
                    Object datos[]=new Object[d];int i=0;
                    rs = s.executeQuery ("select IdDueno,nombre from dueno order by IdDueno DESC");
                   while (rs.next()) 
                    { 
                       datos[i]= rs.getString(1)+" - "+ rs.getString(2);i++;
                    }
                     this.jList1.setListData(datos); this.jList1.setVisible(true);
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex.getMessage());}
       
    }
    
     public void verlist(String aa) throws SQLException
            { 
                int g=0; String a=aa; String b="";
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
                 String strsql="select * from dueno where IdDueno = '"+b+"'";
                  Statement s = cn.getConexion().createStatement();
                ResultSet rs = s.executeQuery (strsql);boolean bu=false;
                while (rs.next()) 
                    { 
                         try{ this.jTextField1.setText(rs.getString(2));}catch(Exception ex) {}
                         try{ this.jTextField2.setText(rs.getString(3));}catch(Exception ex) {}
                         try{ this.jTextArea1.setText(rs.getString(4));}catch(Exception ex) {}
                         try{ this.jTextField3.setText(rs.getString(5));}catch(Exception ex) {}
                          try{ this.jTextField4.setText(rs.getString(1));}catch(Exception ex) {}
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1145, 691));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(75, 123, 125));
        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 123, 125));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 123, 125));
        jLabel2.setText("Teléfono");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(75, 123, 125));
        jLabel3.setText("Dirección");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(75, 123, 125));
        jLabel4.setText("Dui");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jButton1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(75, 123, 125));
        jButton1.setText("Guardar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, -1, -1));

        jButton2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(75, 123, 125));
        jButton2.setText("Editar");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, -1, -1));

        jButton4.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(75, 123, 125));
        jButton4.setText("Nuevo");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 570, -1, -1));

        jButton3.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(75, 123, 125));
        jButton3.setText("Eliminar");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 300, 40));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 300, 40));

        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 300, 40));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 300, 40));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
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
        jScrollPane2.setViewportView(jList1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 260));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 520, 300));

        jTextField4.setText("jTextField4");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Bodoni MT Black", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/duen.png"))); // NOI18N
        jLabel7.setText("                                DUEÑO");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-notas_1.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
     try{
         this.verlist(String.valueOf(this.jList1.getSelectedValue())); 
     }catch(Exception ex){}
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.jTextField1.setText(""); this.jTextField2.setText(""); this.jTextField3.setText("");
        this.jTextArea1.setText("");this.jTextField1.setFocusable(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Desea Eliminar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
        {
            String strsql="delete from dueno where IdDueno = "+this.jTextField4.getText()+"";
            if(cn.ejecutarsql(strsql)==true){
                JOptionPane.showMessageDialog(this, "Información eliminada");
                this.ver();
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la información");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Desea Editar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
        {
            String strsql="update dueno set nombre='"+this.jTextField1.getText()+"',telefono = '"+this.jTextField2.getText()+"',direccion = '"+this.jTextArea1.getText()+"',dui = '"+this.jTextField3.getText()+"' where iddueno = "+this.jTextField4.getText()+"";
            if(cn.ejecutarsql(strsql)==true){
                JOptionPane.showMessageDialog(this, "Información Procesada");
                this.ver();
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo modificar la información");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ValidacionesCampos validacionCampos = new ValidacionesCampos();
        
        boolean valido = validacionCampos.validarJTextFields(new JTextField[]{jTextField1,jTextField2,jTextField3}, new String[]{"Nombre de dueño", "Teléfono", "DUI"});
        
        if (valido == true){
            
        if(JOptionPane.showConfirmDialog(null, "Desea Agregar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
        {
            String strsql="insert into dueno values('"+this.jTextField1.getText()+"','"+this.jTextField2.getText()+"','"+this.jTextArea1.getText()+"','"+this.jTextField3.getText()+"')";
            if(cn.ejecutarsql(strsql)==true){
                JOptionPane.showMessageDialog(this, "Información Procesada");
                this.ver();
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
            }
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
