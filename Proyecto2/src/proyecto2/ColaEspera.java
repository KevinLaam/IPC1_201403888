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
public class ColaEspera {
    
    NodoColaEspera inicio,fin;
    int tama;
    
    
    public ColaEspera(){
        inicio = fin = null;
        tama = 0;
    }
    
    //esta vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    //insertar
    public void insertar(Pasajero d){
        NodoColaEspera nuevo = new NodoColaEspera(d);
        if (estaVacia()) {
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
    }
    //quitar elemento
    public NodoColaEspera quitar(){
        
        NodoColaEspera auxiliar = inicio;
        inicio = inicio.siguiente;
        tama--;
        return auxiliar;
    }
    
    public int inicioCola(){
        return inicio.dato;
    }
    
    public int tamaCola(){
        return tama;
    }
    
}
