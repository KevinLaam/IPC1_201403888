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
public class NodoD {
    public int dato;
    public NodoD anterior, siguiente;
    
    public NodoD(int d){
        this.dato = d;
        this.anterior = null;
        this.siguiente = null;
    }
    
    public NodoD(int d, NodoD a, NodoD s){
        dato = d;
        anterior = a;
        siguiente = s;
    }
    
}