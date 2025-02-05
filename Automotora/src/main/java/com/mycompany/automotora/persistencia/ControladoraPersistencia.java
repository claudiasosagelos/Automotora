
package com.mycompany.automotora.persistencia;

import com.mycompany.automotora.logica.Automovil;
import com.mycompany.automotora.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ControladoraPersistencia {
    
    //creo una insancia con AutomovilJpaController
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
//no creo el metodo auto
    public void agregarAutomovil(Automovil auto) {

        //podemos hacer uso del todos los metodos de jpacontrollers
 
        autoJpa.create(auto);//ahora si puedo ejectuta y dar de alta
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
        
  }

    //apretar la sugerencia de try/catch
    public void borrarAuto(int idAuto) {
       
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane optionPane = new JOptionPane("El automovil se borró correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Borrado exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    public Automovil traerAuto(int idAuto) {
       return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
       
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
