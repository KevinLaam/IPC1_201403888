/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
    
    
    
    
    public CreaTablero(int tam, JPanel fondo) {
        this.tam = tam;
        this.fondo = fondo;
        llenar(tam,tam);

    }
    
    
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
        ImageIcon  guerrtempo = new ImageIcon(getClass().getResource("\\Imagenes\\Wizard1-2.png"));
        Image t4 = guerrtempo.getImage();
        Image r4 = t4.getScaledInstance(tamBloqueX, tamBloqueY, Image.SCALE_SMOOTH);
        guerrero = new ImageIcon(r4); 
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

                }
            }    
        }
    
    }  
}
