
package com.mycompany.automotora.igu;

import com.mycompany.automotora.logica.Automovil;
import com.mycompany.automotora.logica.ControladoraLogica;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaAutomoviles extends javax.swing.JFrame {
       ControladoraLogica control = new ControladoraLogica();

   
    public ConsultaAutomoviles() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel.setBackground(new java.awt.Color(153, 153, 153));
        Jpanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONSULTA  DE AUTOMÓVILES");
        Jpanel.add(jLabel1);
        jLabel1.setBounds(200, 10, 370, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LNOVO\\Desktop\\chevy-impala-6889699_640.jpg")); // NOI18N
        Jpanel.add(jLabel2);
        jLabel2.setBounds(770, 0, 180, 430);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        tablaAutos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutos);

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Jpanel.add(jPanel2);
        jPanel2.setBounds(10, 50, 750, 380);

        getContentPane().add(Jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
  //controlar que mi tabla no este vacia
        if (tablaAutos.getRowCount() > 0) {
            
            // valido que se selecciono una fila
            if (tablaAutos.getSelectedRow() != -1) {
                
                //aca va el modificar
    int idAuto = Integer.parseInt( String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));
    
    ModificarAuto modif = new ModificarAuto(idAuto);
    modif.setVisible(true);
    modif.setLocationRelativeTo(null);
    
    
    //para que la ventana se cierra cuando ya no la uso
    this.dispose();
    
    
            }
            else {
             mostrarMensaje ("No selecciono un registro para modificar", "Error", "Error al modificar");

            }
        }
        else {
        mostrarMensaje ("La tabla esta vacia, no se puede modificar", "Error", "Error al modificar");

        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //controlar que mi tabla no este vacia
        if (tablaAutos.getRowCount() > 0) {
            
            // valido que se selecciono una fila
            if (tablaAutos.getSelectedRow() != -1) {
                
                //obtener el id del auto que quiero borrar, NOS PIDE HACER UN CASTEO..no lo hacemos
                int idAuto = Integer.parseInt(
                        String.valueOf(
                          tablaAutos.getValueAt
        (tablaAutos.getSelectedRow(), 0)));
                
                control.borrarAuto(idAuto);
                mostrarMensaje ("Auto borrado corrrectamente", "Info", "Borrado Exitoso");
                
                cargarTabla();
            }
            else {
             mostrarMensaje ("No selecciono un registro para eliminar", "Error", "Error al eliminar");

            }
        }
        else {
        mostrarMensaje ("La tabla esta vacia, no se puede eliminar", "Error", "Error al eliminar");

        }
        
        

    }//GEN-LAST:event_btnEliminarActionPerformed
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
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //funcion q sirve para usar mas de una vez, ej si queremos poner otro boton
        //metodo lo crea abajo del todo
        cargarTabla();



    }//GEN-LAST:event_formWindowOpened

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutos;
    // End of variables declaration//GEN-END:variables

    //metodo crado, si ponemos un boton actualizar ej. llamamos a este metodo
    private void cargarTabla() {
        
        //para que la tabla no sea editable
        DefaultTableModel modeloTabla = new DefaultTableModel () {
            
            
        @Override//da la opcion
        public boolean isCellEditable(int row, int column){
                return false;
        }
        
    };
        //ponemos titulos a las columnas array
        String titulos[] = { "Id", "Modelo", "Marca", "Color", "Matricula", "Motor", "Padron", "Chasis", "Puertas"};
        modeloTabla.setColumnIdentifiers(titulos);
                
         //traer autos desde la base de datos
         List<Automovil> listaAutomoviles=control.traerAutos();
         
         //setear los datos de la tabla (recorrer)
         //si mi lista es distinta de vacia ..entonces la recorremos
         if (listaAutomoviles !=null){
             for (Automovil auto: listaAutomoviles){
                 Object[] objet  ={auto.getId(), auto.getModelo(),auto.getMarca(),
                     auto.getColor(), auto.getMatricula(), auto.getMotor(), auto.getPadron(), 
                     auto.getChasis(), 
                     auto.getCantidadPuertas()};
                         
                         modeloTabla.addRow(objet);
                 
             }
         }

      
        tablaAutos.setModel(modeloTabla);
    
}
}