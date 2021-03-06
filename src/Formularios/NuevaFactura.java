package Formularios;


import Clases.DALDueno;
import Clases.DALPagos;
import Clases.DALRecibos;
import Clases.DALVivienda;
import Clases.DALresidentes;
import Clases.DALmembresia;
import Modelos.Membre;
import Modelos.Pagos;
import Modelos.Recibos;
import Modelos.Residentes;
import Modelos.ViewModelRecibos;
import Modelos.Viviendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class NuevaFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevaFactura
     */
    public NuevaFactura() {
        initComponents();
    }
    
    List<Recibos>  listarecibos = new LinkedList<Recibos>();
    DefaultTableModel model = new DefaultTableModel();
    private int IdRecibo = 0;
    private int IdVivienda = 0;
    private int IdResidente = 0;

    public int getIdRecibo() {
        return IdRecibo;
    }

    public void setIdRecibo(int IdRecibo) {
        this.IdRecibo = IdRecibo;
    }

    public int getIdVivienda() {
        return IdVivienda;
    }

    public void setIdVivienda(int IdVivienda) {
        this.IdVivienda = IdVivienda;
    }

    public int getIdResidente() {
        return IdResidente;
    }

    public void setIdResidente(int IdResidente) {
        this.IdResidente = IdResidente;
    }
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpNuevaFactura = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        lbMembresia = new javax.swing.JLabel();
        jLblTipoPago = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLblResidente = new javax.swing.JLabel();
        jComboBoxMembresia = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jComboBoxTipoPago = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jComboBoxResidente = new javax.swing.JComboBox<>();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpNuevaFactura.setBackground(new java.awt.Color(255, 255, 255));
        jpNuevaFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setBackground(new java.awt.Color(94, 111, 118));
        jLabel49.setFont(new java.awt.Font("Modern No. 20", 1, 50)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("PAGO MEMBRESÍA");
        jLabel49.setOpaque(true);
        jpNuevaFactura.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1360, 70));

        jComboBox7.setForeground(new java.awt.Color(75, 123, 125));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpNuevaFactura.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 300, 30));

        lbMembresia.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        lbMembresia.setForeground(new java.awt.Color(75, 123, 125));
        lbMembresia.setText("Membresia");
        jpNuevaFactura.add(lbMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLblTipoPago.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLblTipoPago.setForeground(new java.awt.Color(75, 123, 125));
        jLblTipoPago.setText("Tipo Pago");
        jpNuevaFactura.add(jLblTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, -1, -1));

        jLabel57.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(75, 123, 125));
        jLabel57.setText("Descripción:");
        jpNuevaFactura.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jLabel58.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(75, 123, 125));
        jLabel58.setText("Monto($):");
        jpNuevaFactura.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        jLabel59.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(75, 123, 125));
        jLabel59.setText("Fecha:");
        jpNuevaFactura.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        jpNuevaFactura.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 300, 50));

        jTextField15.setEnabled(false);
        jpNuevaFactura.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 300, 30));

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField16.setText("0.00");
        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField16FocusLost(evt);
            }
        });
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField16KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField16KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });
        jpNuevaFactura.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 300, 30));

        jTextField17.setEnabled(false);
        jpNuevaFactura.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 300, 30));

        jLabel60.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(75, 123, 125));
        jLabel60.setText("GUARDAR PAGO");
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });
        jpNuevaFactura.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 123, 125));
        jLabel1.setText("Estado:");
        jpNuevaFactura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(75, 123, 125));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cancelado", "Vencido" }));
        jpNuevaFactura.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 300, 30));

        jLblResidente.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLblResidente.setForeground(new java.awt.Color(75, 123, 125));
        jLblResidente.setText("Residente");
        jpNuevaFactura.add(jLblResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jComboBoxMembresia.setForeground(new java.awt.Color(75, 123, 125));
        jComboBoxMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpNuevaFactura.add(jComboBoxMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 300, 30));

        jLabel54.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(75, 123, 125));
        jLabel54.setText("Dueño:");
        jpNuevaFactura.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jComboBoxTipoPago.setForeground(new java.awt.Color(75, 123, 125));
        jComboBoxTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensualidad", "Membresia" }));
        jpNuevaFactura.add(jComboBoxTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 420, -1));

        jLabel52.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(75, 123, 125));
        jLabel52.setText("Número de casa:");
        jpNuevaFactura.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jComboBoxResidente.setBackground(new java.awt.Color(102, 102, 102));
        jComboBoxResidente.setForeground(new java.awt.Color(75, 123, 125));
        jComboBoxResidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpNuevaFactura.add(jComboBoxResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 300, 30));

        getContentPane().add(jpNuevaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void ocultarCampos(String modo){
        
        if(modo.equals("Residente")){
            jTextField15.setVisible(true);
            jComboBox7.setVisible(true);
            jLabel54.setVisible(true);
            jLabel52.setVisible(true);
            jLblResidente.setVisible(false);
            jComboBoxResidente.setVisible(false);
            jComboBoxMembresia.setVisible(false);
            lbMembresia.setVisible(false);
        }else if(modo.equals("Vivienda")){
            jTextField15.setVisible(false);
            jComboBox7.setVisible(false);
            jLabel52.setVisible(false);
            jLabel54.setVisible(false);
            jLblResidente.setVisible(true);
            jComboBoxResidente.setVisible(true);
            jComboBoxMembresia.setVisible(true);
            lbMembresia.setVisible(true);
        }
    }
    
    public void llenarComboBoxResidente() throws SQLException{
        DALresidentes dalResidentes = new DALresidentes();
        List<Residentes> residentes = new LinkedList<Residentes>();
        residentes = dalResidentes.getResidentes();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(Residentes rsd : residentes){
        model.addElement(rsd.getIdResidente()+" "+rsd.getNombre().trim());
        }
        
        jComboBoxResidente.setModel(model);
    }
    
    public void llenarComboBoxMembresia() throws SQLException{
     DALmembresia dalMembresia = new DALmembresia();
        List<Membre> listaMembresia = new LinkedList<Membre>();
        listaMembresia = dalMembresia.getMembresia();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        for(Membre mb : listaMembresia){
        model.addElement(mb.getIdMembresia()+" "+mb.getTipo().trim());
        }
        
        jComboBoxMembresia.setModel(model);
    }
    
    public void llenarComboBoxFacturas(){
        ocultarCampos("Residente");
        
        DALVivienda vivienda = new DALVivienda();
        List<Viviendas> listavivienda = new LinkedList<Viviendas>();
        //jpNuevaFactura nueva = new jpNuevaFactura();
        
        try {    
            llenarComboBoxResidente();
            llenarComboBoxMembresia();
            listavivienda = vivienda.getViviendas();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for(Viviendas v : listavivienda){            
                model.addElement(v.getIdVivienda());                           
            }
            
            jComboBox7.setModel(model);
            
            DALDueno daldueno = new DALDueno();
                    try {
                        
                        Viviendas vn = vivienda.getViviendas(Integer.parseInt(jComboBox7.getSelectedItem().toString())).get(0);
                        Modelos.Dueno dueno = daldueno.getDuenos(vn.getIdDueno()).get(0);
                        
                        
                        
                        jTextField15.setText(dueno.getNombre()+ " " + dueno.getDUI());
                                if(IdRecibo==0)
                        jTextField16.setText(Double.toString(vn.getCuota()));
                        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                        Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                        String fechaParaSQL = df.format(date);
                        jTextField17.setText(fechaParaSQL);
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(NuevaFactura.class.getName()).log(Level.SEVERE, null, ex);
                    }
            jComboBox7.addActionListener(new ActionListener(){
            
                public void actionPerformed(ActionEvent e){
                    
                    DALDueno daldueno = new DALDueno();
                    try {
                        Viviendas vn = vivienda.getViviendas(Integer.parseInt(jComboBox7.getSelectedItem().toString())).get(0);
                        Modelos.Dueno dueno = daldueno.getDuenos(vn.getIdDueno()).get(0);
                        jTextField15.setText(dueno.getNombre()+ " " + dueno.getDUI());
                        jTextField16.setText(Double.toString(vn.getCuota()));
                    } catch (SQLException ex) {
//                        Logger.getLogger(jpNuevaFactura.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                    Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                    String fechaParaSQL = df.format(date);

                    jTextField17.setText(fechaParaSQL);    
                }
            });
            
            jComboBoxTipoPago.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
              
                  if(jComboBoxTipoPago.getSelectedItem().toString().trim().equals("Mensualidad")){
               
                      ocultarCampos("Residente");
                      DALVivienda vivienda = new DALVivienda();
                         DALDueno daldueno = new DALDueno();
                          Viviendas vn ;
                      try {
                          vn = vivienda.getViviendas(Integer.parseInt(jComboBox7.getSelectedItem().toString())).get(0);
                          Modelos.Dueno dueno = daldueno.getDuenos(vn.getIdDueno()).get(0);
                        jTextField15.setText(dueno.getNombre()+ " " + dueno.getDUI());
                        jTextField16.setText(Double.toString(vn.getCuota()));
                      } catch (SQLException ex) {
                          Logger.getLogger(NuevaFactura.class.getName()).log(Level.SEVERE, null, ex);
                      }
                        
                      
                  }else{
                      ocultarCampos("Vivienda");
                      
                  String str = jComboBoxMembresia.getSelectedItem().toString().trim().replaceAll("\\D+","");
                  
                  DALmembresia dalMembresia = new DALmembresia();
                  
                  try {
                      Membre membre = dalMembresia.getMembresia(Integer.parseInt(str)).get(0);
                      jTextField16.setText(Double.toString(membre.getValor()));
                  } catch (SQLException ex) {
                      Logger.getLogger(NuevaFactura.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  }
                  
              }
            });
            
            jComboBoxMembresia.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
              
                  String str = jComboBoxMembresia.getSelectedItem().toString().trim().replaceAll("\\D+","");
                  
                  DALmembresia dalMembresia = new DALmembresia();
                  
                  try {
                      Membre membre = dalMembresia.getMembresia(Integer.parseInt(str)).get(0);
                      jTextField16.setText(Double.toString(membre.getValor()));
                  } catch (SQLException ex) {
                      Logger.getLogger(NuevaFactura.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
              }
            });
            
            jComboBoxResidente.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
              
                  String str = jComboBoxResidente.getSelectedItem().toString().trim().replaceAll("\\D+","");
              
                  DALresidentes dalResidentes = new DALresidentes();
                  
                  
                  try {
                      Residentes residentes = dalResidentes.getResidentes(Integer.parseInt(str)).get(0);
                  DALmembresia dalMembresia = new DALmembresia();
                      Membre membre = dalMembresia.getMembresia(residentes.getIdMembresia()).get(0);
                      jTextField16.setText(Double.toString(membre.getValor()));
                      jComboBoxMembresia.setSelectedItem(membre.getIdMembresia()+" "+membre.getTipo());
                      System.out.println(membre.getIdMembresia()+"-"+membre.getTipo());
                  } catch (SQLException ex) {
                      Logger.getLogger(NuevaFactura.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
              }
            });
            
            
                         
        } catch (SQLException ex) {
            
         Logger.getLogger(NuevaFactura.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        jComboBoxTipoPago.setSelectedItem("Membresia");
        jComboBoxTipoPago.setEnabled(false);
        jComboBoxMembresia.setEnabled(false);
        jTextField16.setEnabled(false);
        
    }
    
    public boolean ConfirmarIngreso(String mensaje, String Titulo){
        boolean seConfirma = true;
        if (JOptionPane.showConfirmDialog(null, mensaje, Titulo,
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        // yes option
        } else {
        seConfirma = false;
        }
            return seConfirma;
        }
            
    public void VistaModificar(){
        
//            IdRecibo = (int) FacturasTable.getValueAt(FacturasTable.getSelectedRow(), 0);
        jLabel49.setText("Modificar CODIGO: "+IdRecibo);
        jLabel60.setText("Modificar Factura");
        jComboBox7.enable(false);
        jComboBoxTipoPago.enable(false);
        jComboBoxMembresia.enable(false);
        jComboBoxResidente.enable(false);
        DALRecibos dalRecibos = new DALRecibos();
        DALPagos dalPagos = new DALPagos();
        Pagos pagos;
        ViewModelRecibos viewModelRecibos = new ViewModelRecibos();
        Recibos recibo;
        DALVivienda dalVivienda = new DALVivienda();
        Viviendas vivienda;
        DALDueno daldueno = new DALDueno();
        try {
            recibo = dalRecibos.getRecibos(IdRecibo).get(0);
            viewModelRecibos = dalRecibos.getViewModelRecibos(IdRecibo);
           pagos = dalPagos.getPagos(recibo.getIdPago()).get(0);

            jComboBox7.setSelectedItem(viewModelRecibos.getIdVivienda());
            if(viewModelRecibos.getIdResidente()!=0){
            jComboBoxMembresia.setSelectedItem(viewModelRecibos.getIdMembresia()+" "+viewModelRecibos.getTipoMembresia().trim());
            jComboBoxResidente.setSelectedItem(viewModelRecibos.getIdResidente()+" "+viewModelRecibos.getNombreResidente().trim());
            }
     
            jTextArea3.setText(viewModelRecibos.getDescripcion());
            jTextField16.setText(String.format("%.2f", viewModelRecibos.getMonto()).replace(",","."));
            jComboBoxTipoPago.setSelectedItem(viewModelRecibos.getTipoPago());
            jComboBox1.setSelectedItem(viewModelRecibos.getEstadoPago());
            if(viewModelRecibos.getIdVivienda()!=0){
             Viviendas vn = dalVivienda.getViviendas(pagos.getIdVivienda()).get(0);
             Modelos.Dueno dueno = daldueno.getDuenos(viewModelRecibos.getIdDueno()).get(0);
             jTextField15.setText(viewModelRecibos.getNombreDueno());
                ocultarCampos("Residente");
//                Modelos.Dueno dueno = daldueno.getDuenos(viewModelRecibos.getIdDueno()).get(0);
                jTextField15.setText(dueno.getNombre()+" "+dueno.getDUI());
            }else{
                ocultarCampos("Vivienda");
            }
            // TODO add your handling code here:
        } catch (SQLException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.toString());
        }
  
        this.dispose();
        }
       
    private void jTextField16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusLost
        // TODO add your handling code here:

        double valor = Double.parseDouble(jTextField16.getText().trim());
        if(valor>922337203685477.58)
        jTextField16.setText("922337203685473.00");
        if(jTextField16.getText().trim().equals("."))
        jTextField16.setText("0.00");

        jTextField16.setText(String.format("%.2f",Double.parseDouble(jTextField16.getText())).replace(",","."));
    }//GEN-LAST:event_jTextField16FocusLost

    private void jTextField16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyPressed
        int c = evt.getKeyCode();
        if(c!=8 && c!=127 && c!=37 && c!=38 && c!=39 && c!=40 ){
            evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16KeyPressed

    private void jTextField16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyReleased
        // TODO add your handling code here:

        int c = evt.getKeyCode();
        if(jTextField16.getText().trim().equals("")){
            jTextField16.setText("0.00");
        }
    }//GEN-LAST:event_jTextField16KeyReleased

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
        
            getToolkit().beep();
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Ingrese solo números.");
        }
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        // TODO add your handling code here:

        if(!jTextArea3.getText().toString().trim().equals("") && jTextArea3.getText().toString().trim().length()<=100){
            if(ConfirmarIngreso("Desea Guardar la información", "Atención")){

                DALRecibos dalRecibos = new DALRecibos();
                Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
                try {
                    if(IdRecibo==0){
                        dalRecibos.SPInsertarRecibos(Integer.parseInt(jComboBox7.getSelectedItem().toString()),jTextArea3.getText().toString(), Double.parseDouble(jTextField16.getText()), date, jComboBox1.getSelectedItem().toString(),jComboBoxTipoPago.getSelectedItem().toString(),jComboBoxMembresia.getSelectedItem().toString(),jComboBoxResidente.getSelectedItem().toString().trim());
                        JOptionPane.showMessageDialog(null, "El registro se guardó correctamente");
                    }else{
                        dalRecibos.SPModificarRecibos(IdRecibo,jTextArea3.getText().toString(),Double.parseDouble(jTextField16.getText()), jComboBox1.getSelectedItem().toString());
                        JOptionPane.showMessageDialog(null, "El registro se actualizó correctamente");
                    }
                        
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
                    System.out.println(ex.toString());
                    // Logger.getLogger(PnDetFacturacion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }else{
            jTextArea3.setText("");
            JOptionPane.showMessageDialog(null, "Ingresar un valor en campo descripción y que sea menor o igual a 100 caracteres");
        }
    }//GEN-LAST:event_jLabel60MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBoxMembresia;
    private javax.swing.JComboBox<String> jComboBoxResidente;
    private javax.swing.JComboBox<String> jComboBoxTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLblResidente;
    private javax.swing.JLabel jLblTipoPago;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JPanel jpNuevaFactura;
    private javax.swing.JLabel lbMembresia;
    // End of variables declaration//GEN-END:variables
}
