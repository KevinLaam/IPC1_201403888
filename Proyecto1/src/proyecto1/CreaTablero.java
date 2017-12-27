/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Lam
 */
public class CreaTablero {
     public int tam = 0;
    public JPanel fondo = null;

    //pos guerrero
    public int posjugx = 0;
    public int posjugy = 0;
    public int tamBloqueX = 0;
    public int tamBloqueY = 0;

    //public int[] vec;
    public int[][] vec;
    public JLabel[][] vecLabel;
    public ImageIcon guerrero;
    public ImageIcon guerrero2;
    public ImageIcon bomba;
    public ImageIcon vida;
    
    
    
    
    public CreaTablero(int tam, JPanel fondo) {
        this.tam = tam;
        this.fondo = fondo;
        llenar(tam,tam);

    }
    
    Random rx = new Random();
    Random ry = new Random();
    int prx=0;
    int pry=0;
    public void llenar(int x, int y){
        //nos da el tamaño del bloque en x
        tamBloqueX = 500/x;
        tamBloqueY= 500/y;
        vec = new int [y][x];
        vecLabel = new JLabel[y][x];
 
            for (int i = 0; i < y; i++) {
                for(int i2=0;i2<x;i2++)
                {
                    vec[i][i2] = 0;
                }
            }
            vec[0][0]=1; 
            vec[tam-1][tam-1]=6;
            for(int b=1;b<=(this.tam*this.tam*0.10);b++){
                pry=ry.nextInt(tam-1)+1;
                prx=rx.nextInt(tam-1)+1;
                if(vec[pry][prx]==1 || vec[pry][prx]==5 || vec[pry][prx]==6){
                    b--; 
                }
                else{
                    vec[pry][prx]=5;
                }

            }
            for(int c=1;c<=(this.tam*this.tam*0.05);c++){
                pry= ry.nextInt(tam-1)+1;
                prx=rx.nextInt(tam-1)+1;
                if(vec[pry][prx]==1 || vec[pry][prx]==5 || vec[pry][prx]==4 || vec[pry][prx]==6){
                    c--; 
                }
                else{
                    vec[pry][prx]=4;
                }
            }
  
        ImageIcon  guerrtempo = new ImageIcon(getClass().getResource("\\Imagenes\\Wizard1-2.png"));
        Image t4 = guerrtempo.getImage();
        Image r4 = t4.getScaledInstance(tamBloqueX, tamBloqueY, Image.SCALE_SMOOTH);
        guerrero = new ImageIcon(r4); 

        ImageIcon  guerrtempo2 = new ImageIcon(getClass().getResource("\\Imagenes\\Wizard1-2-Copy.png"));
        Image t42 = guerrtempo2.getImage();
        Image r42 = t42.getScaledInstance(tamBloqueX, tamBloqueY, Image.SCALE_SMOOTH);
        guerrero2 = new ImageIcon(r42);         
        
        
        ImageIcon  bombatempo = new ImageIcon(getClass().getResource("\\Imagenes\\bomba.jpg"));
        Image tbomba4 = bombatempo.getImage();
        Image rbomba4 = tbomba4.getScaledInstance(tamBloqueX, tamBloqueY, Image.SCALE_SMOOTH);
        bomba = new ImageIcon(rbomba4);         

        ImageIcon  vidatempo = new ImageIcon(getClass().getResource("\\Imagenes\\vida.png"));
        Image tvida4 = vidatempo.getImage();
        Image rvida4 = tvida4.getScaledInstance(tamBloqueX, tamBloqueY, Image.SCALE_SMOOTH);
        vida = new ImageIcon(rvida4);           
        
        repintar();              
        }
        
  
    public void repintar(){
        for (int i = 0; i < tam; i++) {
           
            for(int i2=0;i2<tam;i2++)
            {
                //vacio
       
                JLabel tablero;
                if (vec[i][i2]==0) {
                    tablero = new JLabel();
                    //para que el label no tenga fondo 
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i2*tamBloqueX, i*tamBloqueY, tamBloqueX, tamBloqueY);
                    vecLabel[i][i2] = tablero;
                    fondo.add(vecLabel[i][i2], BorderLayout.CENTER);
                    fondo.repaint();

                }//guerrero
                else if(vec[i][i2]==1){
                    tablero = new JLabel(guerrero);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i2*tamBloqueX, i*tamBloqueY, tamBloqueX, tamBloqueY);
                    vecLabel[i][i2] = tablero;
                    fondo.add(vecLabel[i][i2], BorderLayout.CENTER);
                    fondo.repaint();
                }//bomba
                else if(vec[i][i2]==5){
                    tablero = new JLabel(bomba);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i2*tamBloqueX, i*tamBloqueY, tamBloqueX, tamBloqueY);
                    vecLabel[i][i2] = tablero;
                    fondo.add(vecLabel[i][i2], BorderLayout.CENTER);
                    fondo.repaint();
                }//vida     
                else if(vec[i][i2]==4){
                    tablero = new JLabel(vida);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i2*tamBloqueX, i*tamBloqueY, tamBloqueX, tamBloqueY);
                    vecLabel[i][i2] = tablero;
                    fondo.add(vecLabel[i][i2], BorderLayout.CENTER);
                    fondo.repaint();
                } 
                else if(vec[i][i2]==6){
                    tablero = new JLabel(guerrero2);
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                    tablero.setBounds(i2*tamBloqueX, i*tamBloqueY, tamBloqueX, tamBloqueY);
                    vecLabel[i][i2] = tablero;
                    fondo.add(vecLabel[i][i2], BorderLayout.CENTER);
                    fondo.repaint();
                } 
            }    
        }
    
    }  
}
