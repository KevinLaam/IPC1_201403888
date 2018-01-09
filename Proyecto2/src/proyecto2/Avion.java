/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Random;

/**
 *
 * @author Kevin Lam
 */
public class Avion {
     String tipo;
    
     int pasajeros;
     int turnosDesabordaje;
     int turnosMantenimiento;
    
    public Avion(){
        
        Random rnd = new Random();
        int valor = rnd.nextInt(3) + 1;
        switch (valor){
            case 1:    
                tipo = "pequeño";
                pasajeros = (int) (Math.random()*(10-5+1)+5);
                turnosDesabordaje = 1;
                turnosMantenimiento = (int) (Math.random()*(3-1+1)+1);
            break;
            case 2:
                tipo = "mediano";
                pasajeros = (int) (Math.random()*(25-15+1)+15);
               turnosDesabordaje = 2;
                turnosMantenimiento = (int) (Math.random()*(4-2+1)+2);
            break;
            case 3:
                tipo = "grande";
                pasajeros = (int) (Math.random()*(40-30+1)+30);
                turnosDesabordaje = 3;
                turnosMantenimiento = (int) (Math.random()*(6-3+1)+3);
            break;
            default: 
                tipo = "salio de rango";
                pasajeros = 0;
                turnosDesabordaje = 10;
                turnosMantenimiento = 100;
            break;
        }
           
    }
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
