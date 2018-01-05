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
            inicio = new NodoD(d,inicio,null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new NodoD(d);
        }
    }
    
    public void agregarAlFinal(int d){
        if (!estaVacia()) {
            fin = new NodoD(d,null,fin);
            fin.anterior.siguiente = fin;
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
}
