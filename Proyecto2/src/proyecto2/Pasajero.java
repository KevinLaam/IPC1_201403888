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
public class Pasajero {
    int cantidadMaletas  ;
    int cantidadDocumentos;
    int numeroTurnos;
    
     public Pasajero (){
         cantidadMaletas = (int) (Math.random()*(4-1+1)+1); ;
         cantidadDocumentos = (int) (Math.random()*(10-1+1)+1);
         numeroTurnos = (int) (Math.random()*(3-1+1)+1) ;
     }
    
    public int getCantidadMaletas() {
        return cantidadMaletas;
    }

    public void setCantidadMaletas(int cantidadMaletas) {
        this.cantidadMaletas = cantidadMaletas;
    }

    public int getCantidadDocumentos() {
        return cantidadDocumentos;
    }

    public void setCantidadDocumentos(int cantidadDocumentos) {
        this.cantidadDocumentos = cantidadDocumentos;
    }

    public int getNumeroTurnos() {
        return numeroTurnos;
    }

    public void setNumeroTurnos(int numeroTurnos) {
        this.numeroTurnos = numeroTurnos;
    }
    
    
    
}
