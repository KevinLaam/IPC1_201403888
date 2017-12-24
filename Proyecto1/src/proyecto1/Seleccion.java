/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Lam
 */
public class Seleccion extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Seleccion() {
        initComponents();
        
        ImageIcon imagen = new ImageIcon(".\\src\\proyecto1\\Imagenes\\Wizard1-2.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(btn1J1.getWidth(),btn1J1.getHeight(), Image.SCALE_DEFAULT));
        btn1J1.setIcon(icono);
        this.repaint(); 
        
        
        ImageIcon imagen3 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\42029088-ilustraci-n-de-dibujos-animados-de-un-antiguo-guerrero-vikingo-con-un-hacha.jpg");
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(btn3J1.getWidth(),btn3J1.getHeight(), Image.SCALE_DEFAULT));
        btn3J1.setIcon(icono3);
        this.repaint(); 
       
        
        ImageIcon imagen2 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\1221-grande - Copy.jpg");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(btn2J1.getWidth(),btn2J1.getHeight(), Image.SCALE_DEFAULT));
        btn2J1.setIcon(icono2);
        this.repaint(); 
        
        ImageIcon imagen4 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\Wizard1-2 - Copy.png");
        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(btn1J2.getWidth(),btn1J2.getHeight(), Image.SCALE_DEFAULT));
        btn1J2.setIcon(icono4);
        this.repaint();
        
        ImageIcon imagen5 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\1221-grande.jpg");
        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(btn2J2.getWidth(),btn2J2.getHeight(), Image.SCALE_DEFAULT));
        btn2J2.setIcon(icono5);
        this.repaint();
        
        ImageIcon imagen6 = new ImageIcon(".\\src\\proyecto1\\Imagenes\\guerrero.jpg");
        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(btn3J2.getWidth(),btn3J2.getHeight(), Image.SCALE_DEFAULT));
        btn3J2.setIcon(icono6);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nJugador1 = new javax.swing.JTextField();
        nJugador2 = new javax.swing.JTextField();
        btn3J1 = new javax.swing.JButton();
        btn2J1 = new javax.swing.JButton();
        btn1J2 = new javax.swing.JButton();
        btn3J2 = new javax.swing.JButton();
        btn2J2 = new javax.swing.JButton();
        btn1J1 = new javax.swing.JButton();
        jugar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtper1 = new javax.swing.JTextField();
        txtper2 = new javax.swing.JTextField();
        txtper3 = new javax.swing.JTextField();
        txtPer1J2 = new javax.swing.JTextField();
        txtPer2J2 = new javax.swing.JTextField();
        txtPer3J2 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEDIEVIL");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Seleccione sus personajes");

        jLabel4.setText("Nombre Jugador 1:");

        jLabel5.setText("Nombre Jugador 2:");

        btn3J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3J1ActionPerformed(evt);
            }
        });

        btn2J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2J1ActionPerformed(evt);
            }
        });

        btn1J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1J2ActionPerformed(evt);
            }
        });

        btn3J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3J2ActionPerformed(evt);
            }
        });

        btn2J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2J2ActionPerformed(evt);
            }
        });

        btn1J1.setBorder(null);
        btn1J1.setBorderPainted(false);
        btn1J1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1J1.setPreferredSize(new java.awt.Dimension(100, 100));
        btn1J1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1/Imagenes/Wizard1-2.png"))); // NOI18N
        btn1J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1J1ActionPerformed(evt);
            }
        });

        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        jLabel6.setText("Orden Seleccionado:");

        jLabel10.setText("Orden Seleccionado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(nJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 2, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(nJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(btn1J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(btn2J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn3J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn1J1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn2J1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn3J1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtper1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtper2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtper3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(16, 16, 16)
                        .addComponent(txtPer1J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPer2J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPer3J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1J1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2J1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3J1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtper1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtper2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtper3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1J2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPer1J2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer2J2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPer3J2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jugar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        Tablero tablero = new Tablero();
        tablero.setVisible(true);
        this.setVisible(false);
        
        tablero.setTxtrecibenombre1(nJugador1.getText());
        tablero.setTxts1(txtper1.getText());
        tablero.setTxts2(txtper2.getText());
        tablero.setTxts3(txtper3.getText());
        
        tablero.setTxtRecibeNombreJ2(nJugador2.getText());
        tablero.setTxts12(txtPer1J2.getText());
        tablero.setTxts22(txtPer2J2.getText());
        tablero.setTxts32(txtPer3J2.getText());
        
        
        
    }//GEN-LAST:event_jugarActionPerformed

    private void btn1J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1J1ActionPerformed
         if (txtper1.getText().equals("")) {
             txtper1.setText("Mago");
        }else if(txtper2.getText().equals("")){
             txtper2.setText("Mago");
        }else if(txtper3.getText().equals("")){
             txtper3.setText("Mago");
        }          
    }//GEN-LAST:event_btn1J1ActionPerformed

    private void btn3J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3J1ActionPerformed
        // TODO add your handling code here:
        if (txtper1.getText().equals("")) {
             txtper1.setText("Guerrero");
        }else if(txtper2.getText().equals("")){
             txtper2.setText("Guerrero");
        }else if(txtper3.getText().equals("")){
             txtper3.setText("Guerrero");
        }
    }//GEN-LAST:event_btn3J1ActionPerformed

    private void btn2J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2J1ActionPerformed
        // TODO add your handling code here:
        if (txtper1.getText().equals("")) {
             txtper1.setText("Princesa");
        }else if(txtper2.getText().equals("")){
             txtper2.setText("Princesa");
        }else if(txtper3.getText().equals("")){
             txtper3.setText("Princesa");
        }
    }//GEN-LAST:event_btn2J1ActionPerformed

    private void btn1J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1J2ActionPerformed
        // TODO add your handling code here:
        if (txtPer1J2.getText().equals("")) {
             txtPer1J2.setText("Mago");
        }else if(txtPer2J2.getText().equals("")){
             txtPer2J2.setText("Mago");
        }else if(txtPer3J2.getText().equals("")){
             txtPer3J2.setText("Mago");
        }    
    }//GEN-LAST:event_btn1J2ActionPerformed

    private void btn2J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2J2ActionPerformed
        // TODO add your handling code here:
        if (txtPer1J2.getText().equals("")) {
             txtPer1J2.setText("Princesa");
        }else if(txtPer2J2.getText().equals("")){
             txtPer2J2.setText("Princesa");
        }else if(txtPer3J2.getText().equals("")){
             txtPer3J2.setText("Princesa");
        } 
    }//GEN-LAST:event_btn2J2ActionPerformed

    private void btn3J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3J2ActionPerformed
        // TODO add your handling code here:
        if (txtPer1J2.getText().equals("")) {
             txtPer1J2.setText("Guerrero");
        }else if(txtPer2J2.getText().equals("")){
             txtPer2J2.setText("Guerrero");
        }else if(txtPer3J2.getText().equals("")){
             txtPer3J2.setText("Guerrero");
        } 
    }//GEN-LAST:event_btn3J2ActionPerformed

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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1J1;
    private javax.swing.JButton btn1J2;
    private javax.swing.JButton btn2J1;
    private javax.swing.JButton btn2J2;
    private javax.swing.JButton btn3J1;
    private javax.swing.JButton btn3J2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jugar;
    private javax.swing.JTextField nJugador1;
    private javax.swing.JTextField nJugador2;
    private javax.swing.JTextField txtPer1J2;
    private javax.swing.JTextField txtPer2J2;
    private javax.swing.JTextField txtPer3J2;
    private javax.swing.JTextField txtper1;
    private javax.swing.JTextField txtper2;
    private javax.swing.JTextField txtper3;
    // End of variables declaration//GEN-END:variables
}
