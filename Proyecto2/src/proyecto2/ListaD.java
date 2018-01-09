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
    Avion avion ;
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
    
   
     public NodoD obtenerNodoD(int dato){
        NodoD aux = inicio;
        while (aux.siguiente!=null){
            if(aux.dato==dato)
                
                return aux;
            aux = aux.siguiente;
        }
        return null;
    }
     
     public NodoD eliminarCualquierLado(int id){
         NodoD aux = inicio;
         if (inicio == fin) {
             inicio = fin = null;
             return aux;
         }else{ 
            while(true){
                if(aux.dato == id){
                    if(aux == inicio){
                        if(aux.siguiente == fin){
                    aux.siguiente.anterior = null;
                    inicio = fin = aux.siguiente;
                    return aux;
                        }else{
                        return eliminarAlInicio();
                        }
                    }else if(aux == fin){
                        if(aux.anterior == inicio){
                    aux.anterior.siguiente = null;
                    inicio = fin = aux.anterior;
                        }else{
                        
                        return eliminarDelFinal();
                        }
                    return aux;
                    }else{
                    NodoD ayudante = aux;
                    aux.anterior.siguiente = ayudante.siguiente;
                    aux.siguiente.anterior = ayudante.anterior;
                    return aux;
                    }
                }  
                if(aux.siguiente == null) break;
                aux = aux.siguiente;
            }
         }
         return null;
     }
     
      public NodoD eliminarAlInicio(){
        NodoD dato = inicio;
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return dato;
    }
    
    public NodoD eliminarDelFinal(){
        NodoD d = fin;
        if (inicio == fin) {
            inicio = fin = null;
        }else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return d;
    }
}
