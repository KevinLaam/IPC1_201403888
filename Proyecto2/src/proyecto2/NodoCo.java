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
public class NodoCo {
    
    NodoCo siguiente;
    
    Pasajero pasajero;
    
    public NodoCo(Pasajero d){
        pasajero = d;
        siguiente = null;
    }
}
