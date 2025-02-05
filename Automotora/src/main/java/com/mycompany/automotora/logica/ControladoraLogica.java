
package com.mycompany.automotora.logica;

import com.mycompany.automotora.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
    //agrego una instancia de ControladoraPersistencia para que pueda usar 
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String color, String matricula, String motor, int cantidadPuertas, String chasis, String padron) {
 
        //creo un nuevo automovil
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setCantidadPuertas(cantidadPuertas);
        auto.setMatricula(matricula);
        auto.setChasis(chasis);
        auto.setPadron(padron);
        auto.setMotor(motor);
        
        controlPersis.agregarAutomovil (auto);//solo le paso el objeto del resto se encarga la logica
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
        
   }

    public void borrarAuto(int idAuto) {
       controlPersis.borrarAuto (idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, 
            String marca, String color, String matricula, 
            String motor, String chasis, String padron, 
            int cantidadPuertas) {
        
        auto.setColor(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMatricula(matricula);
        auto.setMotor(motor);
        auto.setChasis(chasis);
        auto.setPadron(padron);
        auto.setCantidadPuertas(cantidadPuertas);
               
        //le pido a la persistencia para que modifique
        controlPersis.modificarAuto(auto);
    }
    
        
    }
    

