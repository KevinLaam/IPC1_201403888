/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyecto1.Seleccion;

/**
 *
 * @author Kevin Lam
 */
public class Tablero extends javax.swing.JFrame {

    /**
     * Creates new form Tablero
     * @param dimesiones
     */
    int dimesiones=0;
    CreaTablero tab;
    int dado = 0;
    public Tablero() {
        
//        initComponents();
//        
//        ImageIcon imagen = new ImageIcon("/proyecto1/Imagenes/1.jpg");
//        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblDado.getWidth(), lblDado.getHeight(), Image.SCALE_DEFAULT));
//        lblDado.setIcon(icono);
//        this.repaint();
//        
//        ImageIcon imagen2 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblV1J1.getWidth(), lblV1J1.getHeight(), Image.SCALE_DEFAULT));
//        lblV1J1.setIcon(icono2);
//        this.repaint();
//        
//        ImageIcon imagen3 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblV2J1.getWidth(), lblV2J1.getHeight(), Image.SCALE_DEFAULT));
//        lblV2J1.setIcon(icono3);
//        this.repaint();
//        ImageIcon imagen4 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(lblV3J1.getWidth(), lblV3J1.getHeight(), Image.SCALE_DEFAULT));
//        lblV3J1.setIcon(icono4);
//        this.repaint();
//        ImageIcon imagen5 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(lblV4J1.getWidth(), lblV4J1.getHeight(), Image.SCALE_DEFAULT));
//        lblV4J1.setIcon(icono5);
//        this.repaint();
//        ImageIcon imagen6 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(lblV5J1.getWidth(), lblV5J1.getHeight(), Image.SCALE_DEFAULT));
//        lblV5J1.setIcon(icono6);
//        this.repaint();
//        
//        ImageIcon imagen7 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(lblV1J22.getWidth(), lblV1J22.getHeight(), Image.SCALE_DEFAULT));
//        lblV1J22.setIcon(icono7);
//        this.repaint();
//        
//        ImageIcon imagen8 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(lblV2J22.getWidth(), lblV2J22.getHeight(), Image.SCALE_DEFAULT));
//        lblV2J22.setIcon(icono8);
//        this.repaint();
//        
//        ImageIcon imagen9 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(lblV3J22.getWidth(), lblV3J22.getHeight(), Image.SCALE_DEFAULT));
//        lblV3J22.setIcon(icono9);
//        this.repaint();
//        
//        ImageIcon imagen10 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono10 = new ImageIcon(imagen10.getImage().getScaledInstance(lblV4J22.getWidth(), lblV4J22.getHeight(), Image.SCALE_DEFAULT));
//        lblV4J22.setIcon(icono10);
//        this.repaint();
//        
//        ImageIcon imagen11= new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
//        Icon icono11 = new ImageIcon(imagen11.getImage().getScaledInstance(lblV5J22.getWidth(), lblV5J22.getHeight(), Image.SCALE_DEFAULT));
//        lblV5J22.setIcon(icono11);
//        this.repaint();
    }
    public Tablero(int dimensiones){
        initComponents();
        
        ImageIcon imagen = new ImageIcon("/proyecto1/Imagenes/1.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblDado.getWidth(), lblDado.getHeight(), Image.SCALE_DEFAULT));
        lblDado.setIcon(icono);
        this.repaint();
        
        ImageIcon imagen2 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblV1J1.getWidth(), lblV1J1.getHeight(), Image.SCALE_DEFAULT));
        lblV1J1.setIcon(icono2);
        this.repaint();
        
        ImageIcon imagen3 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblV2J1.getWidth(), lblV2J1.getHeight(), Image.SCALE_DEFAULT));
        lblV2J1.setIcon(icono3);
        this.repaint();
        ImageIcon imagen4 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(lblV3J1.getWidth(), lblV3J1.getHeight(), Image.SCALE_DEFAULT));
        lblV3J1.setIcon(icono4);
        this.repaint();
        ImageIcon imagen5 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(lblV4J1.getWidth(), lblV4J1.getHeight(), Image.SCALE_DEFAULT));
        lblV4J1.setIcon(icono5);
        this.repaint();
        ImageIcon imagen6 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(lblV5J1.getWidth(), lblV5J1.getHeight(), Image.SCALE_DEFAULT));
        lblV5J1.setIcon(icono6);
        this.repaint();
        
        ImageIcon imagen7 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(lblV1J22.getWidth(), lblV1J22.getHeight(), Image.SCALE_DEFAULT));
        lblV1J22.setIcon(icono7);
        this.repaint();
        
        ImageIcon imagen8 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(lblV2J22.getWidth(), lblV2J22.getHeight(), Image.SCALE_DEFAULT));
        lblV2J22.setIcon(icono8);
        this.repaint();
        
        ImageIcon imagen9 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono9 = new ImageIcon(imagen9.getImage().getScaledInstance(lblV3J22.getWidth(), lblV3J22.getHeight(), Image.SCALE_DEFAULT));
        lblV3J22.setIcon(icono9);
        this.repaint();
        
        ImageIcon imagen10 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono10 = new ImageIcon(imagen10.getImage().getScaledInstance(lblV4J22.getWidth(), lblV4J22.getHeight(), Image.SCALE_DEFAULT));
        lblV4J22.setIcon(icono10);
        this.repaint();
        
        ImageIcon imagen11= new ImageIcon(".\\src\\proyecto1\\Imagenes\\vida.png");
        Icon icono11 = new ImageIcon(imagen11.getImage().getScaledInstance(lblV5J22.getWidth(), lblV5J22.getHeight(), Image.SCALE_DEFAULT));
        lblV5J22.setIcon(icono11);
        this.repaint();
        
        fondo.removeAll();
        fondo.repaint();
        tab = new CreaTablero(dimensiones,fondo);
        //JOptionPane.showMessageDialog(null,dimensiones);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtrecibenombre1 = new javax.swing.JTextField();
        txts1 = new javax.swing.JTextField();
        txts2 = new javax.swing.JTextField();
        txts3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRecibeNombreJ2 = new javax.swing.JTextField();
        txts12 = new javax.swing.JTextField();
        txts22 = new javax.swing.JTextField();
        txts32 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDado = new javax.swing.JLabel();
        btnTirar = new javax.swing.JButton();
        lblV2J1 = new javax.swing.JLabel();
        lblV1J1 = new javax.swing.JLabel();
        lblV5J1 = new javax.swing.JLabel();
        lblV3J1 = new javax.swing.JLabel();
        lblV4J1 = new javax.swing.JLabel();
        lblV1J2 = new javax.swing.JLabel();
        lblV1J3 = new javax.swing.JLabel();
        lblV2J22 = new javax.swing.JLabel();
        lblV1J22 = new javax.swing.JLabel();
        lblV3J22 = new javax.swing.JLabel();
        lblV4J22 = new javax.swing.JLabel();
        lblV5J22 = new javax.swing.JLabel();
        btnArriba = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnAbajo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEDIEVIL");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jLabel1.setText("Jugador 1:");

        txtrecibenombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrecibenombre1ActionPerformed(evt);
            }
        });

        txts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txts1ActionPerformed(evt);
            }
        });

        txts2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txts2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Jugador 2:");

        txtRecibeNombreJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecibeNombreJ2ActionPerformed(evt);
            }
        });

        txts32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txts32ActionPerformed(evt);
            }
        });

        jLabel3.setText("Vidas");

        jLabel4.setText("Vidas");

        lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1/Imagenes/1.jpg"))); // NOI18N

        btnTirar.setText("TIRAR");
        btnTirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarActionPerformed(evt);
            }
        });

        btnArriba.setText("Arriba");
        btnArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaActionPerformed(evt);
            }
        });

        btnIzquierda.setText("Izquierda");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });

        btnDerecha.setText("Derecha");
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });

        btnAbajo.setText("Abajo");
        btnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtrecibenombre1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRecibeNombreJ2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txts1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txts2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txts3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txts12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txts22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txts32, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblV1J2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblV1J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblV2J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblV3J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblV4J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(14, 14, 14)
                                                .addComponent(lblV1J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblV2J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(lblV3J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblV4J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lblV5J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblV5J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnArriba)
                                    .addComponent(btnTirar)
                                    .addComponent(btnAbajo))
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIzquierda)
                .addGap(76, 76, 76)
                .addComponent(btnDerecha)
                .addGap(61, 61, 61))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(565, Short.MAX_VALUE)
                    .addComponent(lblV1J3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(271, 271, 271)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtrecibenombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txts1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txts3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblV1J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblV2J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblV5J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblV3J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblV4J1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtRecibeNombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txts12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txts22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txts32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblV1J2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblV1J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblV2J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblV3J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblV4J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblV5J22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTirar)
                                .addGap(26, 26, 26)
                                .addComponent(btnArriba))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzquierda)
                    .addComponent(btnDerecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAbajo)
                .addGap(9, 9, 9))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lblV1J3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(516, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrecibenombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrecibenombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrecibenombre1ActionPerformed

    public JTextField getjTxtRecibeNombreJ2() {
        return txtRecibeNombreJ2;
    }

    public void setTxtRecibeNombreJ2(String txtRecibeNombreJ2) {
        this.txtRecibeNombreJ2.setText(txtRecibeNombreJ2);
    }

    public JTextField getTxts12() {
        return txts12;
    }

    public void setTxts12(String txts12) {
        this.txts12.setText(txts12);
    }

    public JTextField getTxts22() {
        return txts22;
    }

    public void setTxts22(String txts22) {
        this.txts22.setText(txts22);
    }

    public JTextField getTxts32() {
        return txts32;
    }

    public void setTxts32(String txts32) {
        this.txts32.setText(txts32);
    }

    public JTextField getTxtrecibenombre1() {
        return txtrecibenombre1;
    }

    public void setTxtrecibenombre1(String txtrecibenombre1) {
        this.txtrecibenombre1.setText(txtrecibenombre1);
    }

    public JTextField getTxts1() {
        return txts1;
    }

    public void setTxts1(String txts1) {
        this.txts1.setText(txts1);
    }

    public JTextField getTxts2() {
        return txts2;
    }

    public void setTxts2(String txts2) {
        this.txts2.setText(txts2);
    }

    public JTextField getTxts3() {
        return txts3;
    }

    public void setTxts3(String txts3) {
        this.txts3.setText(txts3);
    }

    private void txts2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txts2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txts2ActionPerformed

    private void txts32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txts32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txts32ActionPerformed

    private void btnTirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarActionPerformed
//         ImageIcon imagen = new ImageIcon(".\\src\\proyecto1\\Imagenes\\3.jpg");
//        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblDado.getWidth(),lblDado.getHeight(), Image.SCALE_DEFAULT));
//        lblDado.setIcon(icono);
//        this.repaint();        
        Random rnd = new Random();
        dado = rnd.nextInt(6) + 1;
        this.repaint();
        lblDado.setIcon(frdados(dado));

        //lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1/Imagenes/2.jpg")));
    }//GEN-LAST:event_btnTirarActionPerformed

    private void txtRecibeNombreJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecibeNombreJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecibeNombreJ2ActionPerformed

    private void txts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txts1ActionPerformed

    private void btnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoActionPerformed
        // TODO add your handling code here:
         if (!tableroCreado) {
            System.out.println("Tablero no creado");
            return;
        }
        Movimiento mov = new Movimiento(2,dado,tab);
        mov.start();
    }//GEN-LAST:event_btnAbajoActionPerformed
     public boolean tableroCreado = false;
    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        // TODO add your handling code here:
        if (!tableroCreado) {
            System.out.println("Tablero no creado");
            return;
        }

        Movimiento mov = new Movimiento(6,dado,tab);
        mov.start();
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaActionPerformed
        // TODO add your handling code here:
        if (!tableroCreado) {
            System.out.println("Tablero no creado");
            return;
        }

        Movimiento mov = new Movimiento(8,dado,tab);
        mov.start();
    }//GEN-LAST:event_btnArribaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        // TODO add your handling code here:
        if (!tableroCreado) {
            System.out.println("Tablero no creado");
            return;
        }
        Movimiento mov = new Movimiento(4,dado,tab);
        mov.start();
    }//GEN-LAST:event_btnIzquierdaActionPerformed
    Icon ricono;
    ImageIcon imagen;

    public Icon frdados(int o) {

        switch (o) {
            case 1:
                imagen = new ImageIcon(".\\src\\proyecto1\\Imagenes\\1.jpg");
                break;
            case 2:
                imagen = new ImageIcon(".\\src\\proyecto1\\Imagenes\\2.jpg");
                break;
            case 3:
                imagen = new ImageIcon(".\\src\\proyecto1\\Imagenes\\3.jpg");
                break;
            case 4:
                imagen = new ImageIcon(".\\src\\proyecto1\\Imagenes\\4.jpg");
                break;
            case 5:
                imagen = new ImageIcon(".\\src\\proyecto1\\Imagenes\\5.jpg");
                break;
            case 6:
                imagen = new ImageIcon(".\\src\\proyecto1\\Imagenes\\6.jpg");
                break;
        }
        ricono = new ImageIcon(imagen.getImage().getScaledInstance(lblDado.getWidth(), lblDado.getHeight(), Image.SCALE_DEFAULT));
        return ricono;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbajo;
    private javax.swing.JButton btnArriba;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnTirar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblV1J1;
    private javax.swing.JLabel lblV1J2;
    private javax.swing.JLabel lblV1J22;
    private javax.swing.JLabel lblV1J3;
    private javax.swing.JLabel lblV2J1;
    private javax.swing.JLabel lblV2J22;
    private javax.swing.JLabel lblV3J1;
    private javax.swing.JLabel lblV3J22;
    private javax.swing.JLabel lblV4J1;
    private javax.swing.JLabel lblV4J22;
    private javax.swing.JLabel lblV5J1;
    private javax.swing.JLabel lblV5J22;
    private javax.swing.JTextField txtRecibeNombreJ2;
    private javax.swing.JTextField txtrecibenombre1;
    private javax.swing.JTextField txts1;
    private javax.swing.JTextField txts12;
    private javax.swing.JTextField txts2;
    private javax.swing.JTextField txts22;
    private javax.swing.JTextField txts3;
    private javax.swing.JTextField txts32;
    // End of variables declaration//GEN-END:variables
}
