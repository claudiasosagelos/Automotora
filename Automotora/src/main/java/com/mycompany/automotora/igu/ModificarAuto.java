
package com.mycompany.automotora.igu;

import com.mycompany.automotora.logica.Automovil;
import com.mycompany.automotora.logica.ControladoraLogica;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class ModificarAuto extends javax.swing.JFrame {
    
    
ControladoraLogica control = null;
   Automovil auto = new Automovil();
   
    public ModificarAuto(int idAuto) {
        
        control= new ControladoraLogica();
        
        initComponents();
        cargarDatos(idAuto);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtCantPuertas = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        txtPadron = new javax.swing.JTextField();
        txtChasis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("MODIFICACION DE AUTOMÓVILES");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 10, 410, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LNOVO\\Desktop\\chevy-impala-6889699_640.jpg")); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(480, 0, 240, 430);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ALTA DE AUTOMÓVILES");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(100, 10, 290, 32);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\LNOVO\\Desktop\\chevy-impala-6889699_640.jpg")); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(510, 0, 260, 430);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Modelo:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 60, 80, 24);

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2);
        jTextField2.setBounds(150, 60, 290, 32);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Color:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 130, 70, 19);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Modelo:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 70, 80, 19);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Marca:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 100, 80, 19);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Matricula:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 170, 90, 19);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cantidad de puertas:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(30, 300, 160, 20);

        txtModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel2.add(txtModelo);
        txtModelo.setBounds(130, 72, 310, 20);

        txtMarca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMarca);
        txtMarca.setBounds(130, 100, 310, 20);

        txtColor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        jPanel2.add(txtColor);
        txtColor.setBounds(130, 130, 310, 20);

        txtMatricula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMatricula);
        txtMatricula.setBounds(130, 170, 310, 20);

        txtCantPuertas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCantPuertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantPuertasActionPerformed(evt);
            }
        });
        jPanel2.add(txtCantPuertas);
        txtCantPuertas.setBounds(190, 300, 60, 20);

        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar);
        btnModificar.setBounds(300, 360, 140, 50);

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar);
        btnLimpiar.setBounds(70, 360, 140, 50);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Motor:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 210, 60, 19);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Padron:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 240, 60, 19);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Chasis:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(40, 270, 60, 19);

        txtMotor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotorActionPerformed(evt);
            }
        });
        jPanel2.add(txtMotor);
        txtMotor.setBounds(130, 210, 310, 20);

        txtPadron.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPadron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPadronActionPerformed(evt);
            }
        });
        jPanel2.add(txtPadron);
        txtPadron.setBounds(130, 240, 310, 20);

        txtChasis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtChasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChasisActionPerformed(evt);
            }
        });
        jPanel2.add(txtChasis);
        txtChasis.setBounds(130, 270, 310, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 720, 430);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void txtCantPuertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantPuertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantPuertasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         //todo los datos del auto 
        String modelo= txtModelo.getText();
        String marca= txtMarca.getText();
        String color= txtColor.getText();
        String matricula= txtMatricula.getText();
        String motor= txtMotor.getText();
        String chasis= txtChasis.getText();
        String padron= txtPadron.getText();

        int cantidadPuertas= Integer.parseInt(txtCantPuertas.getText());

        control.modificarAuto(auto, modelo, marca, color, matricula,motor,chasis, padron, cantidadPuertas);
        
        mostrarMensaje ("Edición realizada correctamente.", "info", "Edición exitosa.");
        
        
        ConsultaAutomoviles consul = new ConsultaAutomoviles();
        consul.setVisible(true);
        consul.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtMatricula.setText("");
        txtMotor.setText("");
        txtPadron.setText("");
        txtChasis.setText("");

        txtCantPuertas.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //IMPORTANTE PARA LOS MENSAJES ESTE METODOD
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
    JOptionPane optionPane = new JOptionPane(mensaje);
    if (tipo.equals("Info")){
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    }
    else if (tipo.equals("Error")){
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
    }
    JDialog dialog = optionPane.createDialog(titulo);
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
            } 
    private void txtMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotorActionPerformed

    private void txtPadronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadronActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPadronActionPerformed

    private void txtChasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChasisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChasisActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtCantPuertas;
    private javax.swing.JTextField txtChasis;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPadron;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int idAuto) {
        //busco el auto en la bd
        auto = control.traerAuto(idAuto);
        //seteo el auto en el formuloario
       txtModelo.setText(auto.getModelo());
       txtMarca.setText(auto.getMarca());
        txtColor.setText(auto.getColor());
        txtMatricula.setText(auto.getMatricula());
        txtMotor.setText(auto.getMotor());
        txtPadron.setText(auto.getPadron());
        txtChasis.setText(auto.getChasis());

//ACA TRAEMOS UN INT, POR LO QUE HAY QUE CONVERTIR EL INT A UN STRING
        
txtCantPuertas.setText(String.valueOf(auto.getCantidadPuertas()));
    }
}
