
package com.mycompany.automotora.igu;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAltaAuto = new javax.swing.JButton();
        btnConsultaEdiBaja = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONSECIONARIA VEHÍCULOS DEL VALLE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 503, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LNOVO\\Desktop\\chevy-impala-6889699_640.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(510, 0, 320, 430);

        btnAltaAuto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAltaAuto.setText("ALTA AUTOMOVILES");
        btnAltaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaAutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAltaAuto);
        btnAltaAuto.setBounds(110, 100, 250, 60);

        btnConsultaEdiBaja.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultaEdiBaja.setText("CONSULTA, EDICION Y BAJA");
        btnConsultaEdiBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaEdiBajaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaEdiBaja);
        btnConsultaEdiBaja.setBounds(110, 190, 250, 60);

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(110, 290, 250, 60);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaAutoActionPerformed
        AltaAutomovil alta = new AltaAutomovil();
        alta.setVisible(true);
        alta.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnAltaAutoActionPerformed

    private void btnConsultaEdiBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaEdiBajaActionPerformed
       
        //creo una instancia conectando con ConsultaAutomoviles
        ConsultaAutomoviles consu = new ConsultaAutomoviles();
        consu.setVisible(true);
        consu.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnConsultaEdiBajaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        

    }//GEN-LAST:event_btnSalirActionPerformed

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaAuto;
    private javax.swing.JButton btnConsultaEdiBaja;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
