/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JOptionPane;
import Clases.Usuarios;

/**
 *
 * @author panay
 */
public class Registrar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registrar
     */
    Usuarios ob=  new Usuarios();
    public Registrar() {
        initComponents();
        jComboBox6.setModel(ob.Roles());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jtxtNombreUsu = new javax.swing.JTextField();
        jtxtContrasena = new javax.swing.JPasswordField();
        jbtnGuardarUsuario = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1145, 691));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(75, 123, 125));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox6.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox6.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 310, 30));

        jLabel44.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Rol");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, 50));

        jLabel42.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Nombre de usuario");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 50));

        jtxtNombreUsu.setBackground(new java.awt.Color(102, 102, 102));
        jtxtNombreUsu.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jtxtNombreUsu.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombreUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        jPanel2.add(jtxtNombreUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 310, 30));

        jtxtContrasena.setBackground(new java.awt.Color(51, 51, 51));
        jtxtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jtxtContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        jPanel2.add(jtxtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 310, 30));

        jbtnGuardarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jbtnGuardarUsuario.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jbtnGuardarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardarUsuario.setText("Registrar");
        jbtnGuardarUsuario.setBorder(null);
        jbtnGuardarUsuario.setContentAreaFilled(false);
        jbtnGuardarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnGuardarUsuarioMouseClicked(evt);
            }
        });
        jbtnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 190, 50));

        jLabel43.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Contraseña");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 50));

        jLabel41.setBackground(new java.awt.Color(153, 153, 153));
        jLabel41.setFont(new java.awt.Font("Bodoni MT Black", 0, 48)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("                 REGISTRARSE");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1020, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1145, 691));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int TipoRol=0;
    
    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
        // TODO add your handling code here:

        TipoRol = ob.idRol(jComboBox6.getSelectedItem());
    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jbtnGuardarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarUsuarioMouseClicked
        // TODO add your handling code here:
        if(jtxtNombreUsu.getText().isEmpty()|| jtxtContrasena.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Campos Vacios","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            ob.setNomUsuario(jtxtNombreUsu.getText());
            ob.setContrasena(jtxtContrasena.getText());
            ob.setIdRol(TipoRol);

            if(ob.guardarUsuario()){
                JOptionPane.showMessageDialog(this, "Usuarios guardado correctamente","CORRECTO", JOptionPane.INFORMATION_MESSAGE);

            }
            else{
                JOptionPane.showMessageDialog(this, "Error, usuario no creado", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jbtnGuardarUsuarioMouseClicked

    private void jbtnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnGuardarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnGuardarUsuario;
    private javax.swing.JPasswordField jtxtContrasena;
    private javax.swing.JTextField jtxtNombreUsu;
    // End of variables declaration//GEN-END:variables
}
