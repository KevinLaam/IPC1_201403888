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
public class ListaD {
    NodoD inicio, fin;
    
    public ListaD(){
        inicio = fin = null;
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void agregarAlInicio(int d){
        if (!estaVacia()) {
            NodoD aux = inicio;
            inicio = new NodoD(d);
            inicio.siguiente = aux;
            aux.anterior = inicio;
        }else{
            inicio = fin = new NodoD(d);
        }
    }
    
    public void agregarAlFinal(int d){
        if (!estaVacia()) {
            NodoD aux = fin;
            fin = new NodoD(d);
            fin.anterior = aux;
            aux.siguiente = fin;
        }else{
            inicio = fin = new NodoD(d);
        }
    }
    
    public int eliminarAlInicio(){
        int dato = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return dato;
    }
    
    public int eliminarDelFinal(){
        int d = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return d;
    }
     public NodoD obtenerNodoD(int dato){
        NodoD aux = inicio;
        while (aux.siguiente!=null){
            if(aux.dato==dato)
                return aux;
            aux = aux.siguiente;
        }
        return null;
    }
}
