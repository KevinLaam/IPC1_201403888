/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Kevin Lam
 */
public class Avion {
    private String tipo;
    private int probabilidad;
    private int pasajeros;
    private int turnosDesabordaje;
    private int turnosMantenimiento;
    
    public Avion(){
        
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getTurnosDesabordaje() {
        return turnosDesabordaje;
    }

    public void setTurnosDesabordaje(int turnosDesabordaje) {
        this.turnosDesabordaje = turnosDesabordaje;
    }

    public int getTurnosMantenimiento() {
        return turnosMantenimiento;
    }

    public void setTurnosMantenimiento(int turnosMantenimiento) {
        this.turnosMantenimiento = turnosMantenimiento;
    }
    
}
