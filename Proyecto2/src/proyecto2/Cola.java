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
public class Cola {
    NodoCo inicio,fin;
    int tama;
    
    public Cola(){
        inicio = fin = null;
        tama = 0;
    }
    
    //esta vacia
    public boolean estaVacia(){
        return inicio == null;
    }
    //insertar
    public void insertar(int d){
        NodoCo nuevo = new NodoCo(d);
        if (estaVacia()) {
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
    }
    //quitar elemento
    public int quitar(){
        int auxiliar = inicio.dato;
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
