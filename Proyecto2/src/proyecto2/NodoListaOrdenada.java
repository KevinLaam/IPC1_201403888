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
public class NodoListaOrdenada {
    public int dato;
    Pasajero pasajero = new Pasajero();
    public char id;
    public NodoListaOrdenada anterior, siguiente;
    public ColaEscritorio colaLD;
    public Pila pilaLD;
    
    public NodoListaOrdenada(int d){
        this.dato = d;
        this.anterior = null;
        this.siguiente = null;
        this.colaLD = new ColaEscritorio();
        this.pilaLD = new Pila();
        this.id = (char) (97+d);
        
    }
    
    public NodoListaOrdenada(int d, NodoListaOrdenada a, NodoListaOrdenada s){
        dato = d;
        anterior = a;
        siguiente = s;
        this.colaLD = new ColaEscritorio();
        this.pilaLD = new Pila();
    }
    
}
