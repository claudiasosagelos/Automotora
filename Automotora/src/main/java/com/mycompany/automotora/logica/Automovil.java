
package com.mycompany.automotora.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String modelo;
    private String marca;
    private String color;
    private String matricula;
    private String motor;
    private String Padron;
    private String Chasis; 
    private int cantidadPuertas;

    public Automovil() {
    }

    public Automovil(int id, String modelo, String marca, String color, String matricula, String motor, String Padron, String Chasis, int cantidadPuertas) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.motor = motor;
        this.Padron = Padron;
        this.Chasis = Chasis;
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPadron() {
        return Padron;
    }

    public void setPadron(String Padron) {
        this.Padron = Padron;
    }

    public String getChasis() {
        return Chasis;
    }

    public void setChasis(String Chasis) {
        this.Chasis = Chasis;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
      
    
}
