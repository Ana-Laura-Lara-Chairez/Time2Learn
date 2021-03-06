/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time2Learn;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Dee Dee Gtz
 */
public class Animales_Mascotas extends javax.swing.JFrame {

    public Animales_Mascotas() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Animals");        
        
        String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
        
        //Imagen Choose
        ImageIcon Choose = new ImageIcon(RutaImagenes + "Animales_Mascotas1.png");
        Icon ImageChoose = new ImageIcon(Choose.getImage().getScaledInstance(lblChoose.getWidth(), lblChoose.getHeight(), Image.SCALE_DEFAULT));
        lblChoose.setIcon(ImageChoose);
        
        //Imagen Tortuga
        ImageIcon Tortuga = new ImageIcon(RutaImagenes + "Animales_Tortuga1.png");
        Icon ImageTortuga = new ImageIcon(Tortuga.getImage().getScaledInstance(lblTortuga.getWidth(), lblTortuga.getHeight(), Image.SCALE_DEFAULT));
        lblTortuga.setIcon(ImageTortuga);
        
        //Imagen Gato
        ImageIcon Gato = new ImageIcon(RutaImagenes + "Animales_Gato1.png");
        Icon ImageGato = new ImageIcon(Gato.getImage().getScaledInstance(lblGato.getWidth(), lblGato.getHeight(), Image.SCALE_DEFAULT));
        lblGato.setIcon(ImageGato);
        
        //Imagen Perro
        ImageIcon Perro = new ImageIcon(RutaImagenes + "Animales_Perro1.png");
        Icon ImagePerro = new ImageIcon(Perro.getImage().getScaledInstance(lblPerro.getWidth(), lblPerro.getHeight(), Image.SCALE_DEFAULT));
        lblPerro.setIcon(ImagePerro);
        
        //Imagen Pajaro
        ImageIcon Pajaro = new ImageIcon(RutaImagenes + "Animales_Pajaro1.png");
        Icon ImagePajaro = new ImageIcon(Pajaro.getImage().getScaledInstance(lblPajaro.getWidth(), lblPajaro.getHeight(), Image.SCALE_DEFAULT));
        lblPajaro.setIcon(ImagePajaro);
        
        //Imagen Pez
        ImageIcon Pez = new ImageIcon(RutaImagenes + "Animales_Pez1.png");
        Icon ImagePez = new ImageIcon(Pez.getImage().getScaledInstance(lblPez.getWidth(), lblPez.getHeight(), Image.SCALE_DEFAULT));
        lblPez.setIcon(ImagePez);
        
        //Imagen Conejo
        ImageIcon Conejo = new ImageIcon(RutaImagenes + "Animales_Conejo1.png");
        Icon ImageConejo = new ImageIcon(Conejo.getImage().getScaledInstance(lblConejo.getWidth(), lblConejo.getHeight(), Image.SCALE_DEFAULT));
        lblConejo.setIcon(ImageConejo);
        
        //Imagen Hamster
        ImageIcon Hamster = new ImageIcon(RutaImagenes + "Animales_Hamster1.png");
        Icon ImageHamster = new ImageIcon(Hamster.getImage().getScaledInstance(lblHamster.getWidth(), lblHamster.getHeight(), Image.SCALE_DEFAULT));
        lblHamster.setIcon(ImageHamster);
        
        //Imagen Perico
        ImageIcon Perico = new ImageIcon(RutaImagenes + "Animales_Perico1.png");
        Icon ImagePerico = new ImageIcon(Perico.getImage().getScaledInstance(lblPerico.getWidth(), lblPerico.getHeight(), Image.SCALE_DEFAULT));
        lblPerico.setIcon(ImagePerico);
        
        ImageIcon Menu = new ImageIcon(RutaImagenes + "Icono_Menu.png");
        Icon ImageMenu = new ImageIcon(Menu.getImage().getScaledInstance(lblMenu.getWidth(), lblMenu.getHeight(), Image.SCALE_DEFAULT));
        lblMenu.setIcon(ImageMenu);
        
        ImageIcon Regresar = new ImageIcon(RutaImagenes + "Icono_Regresar.png");
        Icon ImageRegresar = new ImageIcon(Regresar.getImage().getScaledInstance(lblRegresar.getWidth(), lblRegresar.getHeight(), Image.SCALE_DEFAULT));
        lblRegresar.setIcon(ImageRegresar);
        
        //Imagen de Minimizar
        ImageIcon Minimizar = new ImageIcon(RutaImagenes + "Icono_Minimizar.png");
        Icon ImageMinimizar = new ImageIcon(Minimizar.getImage().getScaledInstance(lblMinimizar.getWidth(), lblMinimizar.getHeight(), Image.SCALE_DEFAULT));
        lblMinimizar.setIcon(ImageMinimizar);
        
        //Imagen de Cerrar
        ImageIcon Cerrar = new ImageIcon(RutaImagenes + "Icono_Cerrar.png");
        Icon ImageCerrar = new ImageIcon(Cerrar.getImage().getScaledInstance(lblCerrar.getWidth(), lblCerrar.getHeight(), Image.SCALE_DEFAULT));
        lblCerrar.setIcon(ImageCerrar);
        
        //Icono
        setIconImage(Toolkit.getDefaultToolkit().getImage(RutaImagenes + "Icono.png"));
    }
    
     public void lanzarSplash(){ 
        SplashSalir S = new SplashSalir();
        S.setVisible(true);
        
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialogo = new javax.swing.JDialog();
        lblNo = new javax.swing.JLabel();
        lblSi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTortuga = new javax.swing.JLabel();
        lblGato = new javax.swing.JLabel();
        lblPerro = new javax.swing.JLabel();
        lblPajaro = new javax.swing.JLabel();
        lblPez = new javax.swing.JLabel();
        lblConejo = new javax.swing.JLabel();
        lblHamster = new javax.swing.JLabel();
        lblPerico = new javax.swing.JLabel();
        lblChoose = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();

        Dialogo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Dialogo.setAlwaysOnTop(true);
        Dialogo.setModalExclusionType(null);
        Dialogo.setUndecorated(true);
        Dialogo.setResizable(false);
        Dialogo.setType(java.awt.Window.Type.POPUP);
        Dialogo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNoMouseClicked(evt);
            }
        });
        Dialogo.getContentPane().add(lblNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 60, 40));

        lblSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiMouseClicked(evt);
            }
        });
        Dialogo.getContentPane().add(lblSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 60, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mensaje_Salir.png"))); // NOI18N
        Dialogo.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTortuga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTortuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTortugaMouseClicked(evt);
            }
        });

        lblGato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGatoMouseClicked(evt);
            }
        });

        lblPerro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPerro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerroMouseClicked(evt);
            }
        });

        lblPajaro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPajaro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPajaroMouseClicked(evt);
            }
        });

        lblPez.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPez.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPezMouseClicked(evt);
            }
        });

        lblConejo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConejo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConejoMouseClicked(evt);
            }
        });

        lblHamster.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHamster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHamsterMouseClicked(evt);
            }
        });

        lblPerico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPerico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPericoMouseClicked(evt);
            }
        });

        lblMenu.setText("Menu");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        lblCerrar.setText("Cerrar");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblMinimizar.setText("Minimizar");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(812, 812, 812)
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPez, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblPerico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblHamster, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTortuga, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblGato, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblPajaro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPajaro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGato, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTortuga, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHamster, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPez, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(321, 321, 321))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTortugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTortugaMouseClicked
        Animales_Tortuga T = new Animales_Tortuga();
        T.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblTortugaMouseClicked

    private void lblGatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGatoMouseClicked
        Animales_Gato G = new Animales_Gato();
        G.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblGatoMouseClicked

    private void lblPerroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerroMouseClicked
        Animales_Perro P = new Animales_Perro();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblPerroMouseClicked

    private void lblPajaroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPajaroMouseClicked
        Animales_Pajaro P = new Animales_Pajaro();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblPajaroMouseClicked

    private void lblPezMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPezMouseClicked
        Animales_Pez P = new Animales_Pez();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblPezMouseClicked

    private void lblConejoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConejoMouseClicked
        Animales_Conejo C = new Animales_Conejo();
        C.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblConejoMouseClicked

    private void lblHamsterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHamsterMouseClicked
        Animales_Hamster H = new Animales_Hamster();
        H.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblHamsterMouseClicked

    private void lblPericoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPericoMouseClicked
        Animales_Perico P = new Animales_Perico();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblPericoMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Facil D = new Facil();
        D.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Dialogo.setSize(576, 259);
        Dialogo.setLocationRelativeTo(null);
        Dialogo.setVisible(true);
        Dialogo.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        Animales2 a = new Animales2();
        a.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

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
            java.util.logging.Logger.getLogger(Animales_Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animales_Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animales_Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animales_Mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animales_Mascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblConejo;
    private javax.swing.JLabel lblGato;
    private javax.swing.JLabel lblHamster;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPajaro;
    private javax.swing.JLabel lblPerico;
    private javax.swing.JLabel lblPerro;
    private javax.swing.JLabel lblPez;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblTortuga;
    // End of variables declaration//GEN-END:variables
}
