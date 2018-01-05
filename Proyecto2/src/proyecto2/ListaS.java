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
public class ListaS {

    public NodoS inicio, fin;

    public ListaS() {
        inicio = fin = null;
    }

    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarAlInicio(int d) {
        inicio = new NodoS(d, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public void agregarAlFinal(int d) {
        if (!estaVacia()) {
            fin = fin.siguiente = new NodoS(d);
        } else {
            inicio = fin = new NodoS(d);
        }
    }

    public int borrarDelinicio() {
        int d = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return d;
    }
    
    public int borrarDelFinal(){
        int d = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            NodoS temporal = inicio;
            while (temporal.siguiente != fin){
            
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return d;
    }

}
