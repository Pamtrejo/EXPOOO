/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.EncriptarContrasena;
import Clases.Recuperar;
import Clases.Usuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author panay
 */
public class RecuperarContra extends javax.swing.JFrame {

    /**
     * Creates new form RecuperarContra
     */
    public RecuperarContra() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jtxtNueva = new javax.swing.JTextField();
        CambiarContra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtRepetir = new javax.swing.JTextField();
        jtxtNombre1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNueva.setBackground(new java.awt.Color(102, 102, 102));
        jtxtNueva.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jtxtNueva.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 300, 40));

        CambiarContra.setBackground(new java.awt.Color(255, 255, 255));
        CambiarContra.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        CambiarContra.setForeground(new java.awt.Color(75, 123, 125));
        CambiarContra.setText("Cambiar");
        CambiarContra.setContentAreaFilled(false);
        CambiarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiarContraMouseClicked(evt);
            }
        });
        CambiarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarContraActionPerformed(evt);
            }
        });
        jPanel1.add(CambiarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 130, 50));

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 123, 125));
        jLabel2.setText("Repetir contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 123, 125));
        jLabel1.setText("Nombre de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(75, 123, 125));
        jLabel4.setText("Nueva contraseña ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jtxtRepetir.setBackground(new java.awt.Color(102, 102, 102));
        jtxtRepetir.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jtxtRepetir.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxtRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 300, 40));

        jtxtNombre1.setBackground(new java.awt.Color(102, 102, 102));
        jtxtNombre1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jtxtNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombre1KeyTyped(evt);
            }
        });
        jPanel1.add(jtxtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 300, 40));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Modern No. 20", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(75, 123, 125));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RECU.png"))); // NOI18N
        jLabel12.setText("                                   VISITAS");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tarea-finalizada.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNuevaActionPerformed

    private void CambiarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CambiarContraActionPerformed

    private void CambiarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiarContraMouseClicked
        // TODO add your handling code here:

        if(jtxtNueva.getText().equals("")|| jtxtRepetir.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos");
        }else if (jtxtRepetir.getText().equals(jtxtNueva.getText())){
            String contrasenia = EncriptarContrasena.md5(jtxtRepetir.getText());
            Usuarios aut = new Usuarios();
            aut.setNomUsuario(jtxtNombre1.getText());
            aut.setContrasena(contrasenia);
            aut.ActualizaContra();
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente");
            this.hide();
            System.out.println(contrasenia);
            new Login1().show();
        }else if(!jtxtRepetir.getText().equals(jtxtNueva.getText()))
        JOptionPane.showMessageDialog(this, "Los campos no coinciden");

    }//GEN-LAST:event_CambiarContraMouseClicked

    private void jtxtNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombre1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            jtxtNombre1.setCursor(null);
        }
        else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=37
                || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
                || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            jtxtNombre1.setCursor(null);
        
        }
    }//GEN-LAST:event_jtxtNombre1KeyTyped

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
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtNombre1;
    private javax.swing.JTextField jtxtNueva;
    private javax.swing.JTextField jtxtRepetir;
    // End of variables declaration//GEN-END:variables
}
