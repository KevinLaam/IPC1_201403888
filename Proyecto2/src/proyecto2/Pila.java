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
public class Pila {
    
    private NodoP cima;
    int tama;
    public Pila(){
        cima = null;
        tama = 0;
    }
    
    //metodo para saber si pila esta vacia
    public boolean estaVacia(){
        return cima == null;
    }
    //metodo insertar elemento en la pila push
    public void empujar(int d){
        NodoP nuevo = new NodoP(d);
        nuevo.siguiente = cima;
        cima = nuevo;
        tama++;
    }
    //sacar dato de la pila pop
    public int sacar(){
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tama--;
        return auxiliar;
    }
    //saber queien esta en la cima
    public int cima(){
        return cima.dato;
    }
    //tamaño de la pila
    public int tamaPila(){
        return tama;
    }
    //vaciar pila
    public void limpiar(){
        while(!estaVacia()){
            sacar();
        }
    }
    
    
}
