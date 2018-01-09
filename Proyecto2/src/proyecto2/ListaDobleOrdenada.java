/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Lam
 */
public class ListaDobleOrdenada {
    NodoListaOrdenada inicio,fin;
    
    public ListaDobleOrdenada(){
        inicio = fin = null;
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void agregarAlInicio(int d){
        if (!estaVacia()) {
            NodoListaOrdenada aux = inicio;
            inicio = new NodoListaOrdenada(d);
            inicio.siguiente = aux;
            aux.anterior = inicio;
        }else{
            inicio = fin = new NodoListaOrdenada(d);
        }
    }
    
    public void agregarAlFinal(int d){
        if (!estaVacia()) {
            NodoListaOrdenada aux = fin;
            fin = new NodoListaOrdenada(d);
            fin.anterior = aux;
            aux.siguiente = fin;
        }else{
            inicio = fin = new NodoListaOrdenada(d);
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
     public NodoListaOrdenada obtenerNodoD(int dato){
        NodoListaOrdenada aux = inicio;
        while (aux.siguiente!=null){
            if(aux.dato==dato)
                return aux;
            aux = aux.siguiente;
        }
        return null;
    }
    //PARA GRAFICAR
    String nombre;
    GraficaDobleOrdenada grafica;
    File file;
    public void graficarLista(){

        
        nombre = "Escritorios de registro";
        grafica = new GraficaDobleOrdenada();
        
        try 
        {
            grafica.graficar(inicio, nombre);

        } 
        catch (IOException ex) {
            Logger.getLogger(ListaS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    public void abrir_grafica(){
        try 
        {
        file = new File(nombre + ".jpg");
        Desktop.getDesktop().open(file);
        } 
        catch (IOException ex) {
            Logger.getLogger(ListaS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
