/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Lam
 */
public class Movimiento extends Thread {
     public int cantidad = 0;
    public int direccion=0;
    public CreaTablero tab = null;

    public Movimiento(int direccion,int cantidad, CreaTablero tab) {
        this.direccion=direccion;
        this.cantidad = cantidad;
        this.tab = tab;

    }

    public void mover(int direccion,int cantidad) {
        switch (direccion) {
            case 6:
                derecha(cantidad);
                break;
            case 4:
                izquierda(cantidad);
                break;
            case 8:
                arriba(cantidad);
                break;
            case 2:
                abajo(cantidad);
                break;
        }
    }
    public void derecha(int cantidad){
        try {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar()) {
            //regresar el jugador a la posicion 0
            cantidad = 0;
            tab.vec[tab.posjugy][tab.tam-1] = 0;
            tab.vecLabel[tab.posjugy][tab.tam-1].setIcon(null);
            tab.posjugx = 0;
            tab.vec[tab.posjugy][tab.posjugx]=1;
            tab.repintar();
            return;
        }
        // mover una posicion
        tab.vecLabel[tab.posjugy][tab.posjugx].setIcon(null);
        tab.vec[tab.posjugy][tab.posjugx] = 0;
        tab.repintar();
        //simula el movimiento hacia adelante
        tab.posjugx = tab.posjugx+1;
        tab.vec[tab.posjugy][tab.posjugx] = 1;
        tab.repintar();
        cantidad--;
        Thread.sleep(500); 
        mover(direccion,cantidad);
        } catch (InterruptedException ex) {

            Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void izquierda(int cantidad){
        try {
        if (cantidad <= 0) {

            return;
        }
        if (comprobariz()) {
            //regresar el jugador a la posicion 0

            cantidad = 0;
//            tab.vec[tab.posjugy][tab.tam-1] = 0;
//            tab.vecLabel[tab.posjugy][tab.tam-1].setIcon(null);
//            tab.posjugx = 0;
//            tab.posjugy = 0;
//            tab.vec[0][0]=1;
//            tab.repintar();
            tab.vec[tab.posjugy][0] = 0;
            tab.vecLabel[tab.posjugy][0].setIcon(null);
            tab.posjugx=tab.tam-1;
            tab.vec[tab.posjugy][tab.posjugx] = 1;
            tab.repintar();

            return;
        }

        // mover una posicion
        tab.vecLabel[tab.posjugy][tab.posjugx].setIcon(null);
        tab.vec[tab.posjugy][tab.posjugx] = 0;
        tab.repintar();

        //simula el movimiento hacia adelante
        tab.posjugx = tab.posjugx-1;
//        if(tab.posjugx<0){
//            tab.posjugx=tab.tam-1;
//            cantidad=0;
//        }
        tab.vec[tab.posjugy][tab.posjugx] = 1;
        tab.repintar();
        cantidad--;
        
            Thread.sleep(500);
            
        mover(direccion,cantidad);
        } catch (InterruptedException ex) {
            Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    public void arriba(int cantidad){
        try {
        if (cantidad <= 0) {
            return;
        }
        
        if (comprobarar()) {
            //regresar el jugador a la posicion 0
            cantidad = 0;
            tab.vec[0][tab.posjugx] = 0;
            tab.vecLabel[0][tab.posjugx].setIcon(null);
            //tab.posjugx = 0;
            tab.posjugy = tab.tam-1;
            tab.vec[tab.posjugy][tab.posjugx]=1;
            tab.repintar();
            return;
        }

        // mover una posicion
        tab.vecLabel[tab.posjugy][tab.posjugx].setIcon(null);
        tab.vec[tab.posjugy][tab.posjugx] = 0;
        tab.repintar();
        //simula el movimiento hacia adelante
        tab.posjugy = tab.posjugy-1;
        tab.vec[tab.posjugy][tab.posjugx] = 1;
        tab.repintar();
        cantidad--;
        Thread.sleep(500); 
        mover(direccion,cantidad);
        } catch (InterruptedException ex) {

            Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }      
    
    public void abajo(int cantidad){
        try {
        if (cantidad <= 0) {
            return;
        }
        
        if (comprobarab()) {
            //regresar el jugador a la posicion 0
            cantidad = 0;
            tab.vec[tab.tam-1][tab.posjugx] = 0;
            tab.vecLabel[tab.tam-1][tab.posjugx].setIcon(null);
            //tab.posjugx = 0;
            tab.posjugy = 0;
            tab.vec[0][tab.posjugx]=1;
            tab.repintar();
            return;
        }

        // mover una posicion
        tab.vecLabel[tab.posjugy][tab.posjugx].setIcon(null);
        tab.vec[tab.posjugy][tab.posjugx] = 0;
        tab.repintar();
        //simula el movimiento hacia adelante
        tab.posjugy = tab.posjugy+1;
        tab.vec[tab.posjugy][tab.posjugx] = 1;
        tab.repintar();
        cantidad--;
        Thread.sleep(500); 
        mover(direccion,cantidad);
        } catch (InterruptedException ex) {

            Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }  
    
    
    public boolean comprobariz(){
        //if (tab.posjugx >= tab.tam-1) {
                    
        if (tab.posjugx <=0) {
            return true;
        }
        return false;
    }   
    public boolean comprobar(){
        //if (tab.posjugx >= tab.tam-1) {
        if (tab.posjugx >= tab.tam-1) {
            return true;
        }
        return false;
    }

    public boolean comprobarar(){
        //if (tab.posjugx >= tab.tam-1) {
                    
        if (tab.posjugy <= 0) {
            return true;
        }
        return false;
    }
    
    public boolean comprobarab(){
        //if (tab.posjugx >= tab.tam-1) {
                    
        if (tab.posjugy >= tab.tam-1) {
            return true;
        }
        return false;
    }
    public void run(){
        mover(direccion,cantidad);

    }
    
}
