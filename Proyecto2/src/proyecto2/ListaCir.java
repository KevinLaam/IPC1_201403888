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
public class ListaCir {
    NodoCir primero,ultimo;
    
    public ListaCir(){
        primero = ultimo = null;
    }
    
    public void ingresar(int d){
        NodoCir nuevo = new NodoCir();
        nuevo.dato = d;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }
    
    
}
