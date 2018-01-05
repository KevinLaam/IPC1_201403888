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
public class NodoS {
    public int dato;
    public NodoS siguiente;
        
        public NodoS(int d){
            this.dato = d;
        }
        public NodoS(int d, NodoS s){
            this.dato = d;
            this.siguiente = s;
        }
        
    
}
