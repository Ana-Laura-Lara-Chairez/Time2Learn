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
public class Animales_Jungla extends javax.swing.JFrame {

    public Animales_Jungla() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Animals");        
        
        String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
        
        //Imagen Choose
        ImageIcon Choose = new ImageIcon(RutaImagenes + "Animales_Jungla1.png");
        Icon ImageChoose = new ImageIcon(Choose.getImage().getScaledInstance(lblChoose.getWidth(), lblChoose.getHeight(), Image.SCALE_DEFAULT));
        lblChoose.setIcon(ImageChoose);
        
        //Imagen Leon
        ImageIcon Leon = new ImageIcon(RutaImagenes + "Animales_Leon1.png");
        Icon ImageLeon = new ImageIcon(Leon.getImage().getScaledInstance(lblLeon.getWidth(), lblLeon.getHeight(), Image.SCALE_DEFAULT));
        lblLeon.setIcon(ImageLeon);
        
        //Imagen Elefante
        ImageIcon Elefante = new ImageIcon(RutaImagenes + "Animales_Elefante1.png");
        Icon ImageElefante = new ImageIcon(Elefante.getImage().getScaledInstance(lblElefante.getWidth(), lblElefante.getHeight(), Image.SCALE_DEFAULT));
        lblElefante.setIcon(ImageElefante);
        
        //Imagen Mono
        ImageIcon Mono = new ImageIcon(RutaImagenes + "Animales_Mono1.png");
        Icon ImageMono = new ImageIcon(Mono.getImage().getScaledInstance(lblMono.getWidth(), lblMono.getHeight(), Image.SCALE_DEFAULT));
        lblMono.setIcon(ImageMono);
        
        //Imagen Serpiente
        ImageIcon Serpiente = new ImageIcon(RutaImagenes + "Animales_Serpiente1.png");
        Icon ImageSerpiente = new ImageIcon(Serpiente.getImage().getScaledInstance(lblSerpiente.getWidth(), lblSerpiente.getHeight(), Image.SCALE_DEFAULT));
        lblSerpiente.setIcon(ImageSerpiente);
        
        //Imagen Tigre
        ImageIcon Tigre = new ImageIcon(RutaImagenes + "Animales_Tigre1.png");
        Icon ImageTigre = new ImageIcon(Tigre.getImage().getScaledInstance(lblTigre.getWidth(), lblTigre.getHeight(), Image.SCALE_DEFAULT));
        lblTigre.setIcon(ImageTigre);
        
        //Imagen Jirafa
        ImageIcon Jirafa = new ImageIcon(RutaImagenes + "Animales_Jirafa1.png");
        Icon ImageJirafa = new ImageIcon(Jirafa.getImage().getScaledInstance(lblJirafa.getWidth(), lblJirafa.getHeight(), Image.SCALE_DEFAULT));
        lblJirafa.setIcon(ImageJirafa);
        
        //Imagen Cebra
        ImageIcon Cebra = new ImageIcon(RutaImagenes + "Animales_Cebra1.png");
        Icon ImageCebra = new ImageIcon(Cebra.getImage().getScaledInstance(lblSebra.getWidth(), lblSebra.getHeight(), Image.SCALE_DEFAULT));
        lblSebra.setIcon(ImageCebra);
        
        //Imagen Koala
        ImageIcon Koala = new ImageIcon(RutaImagenes + "Animales_Koala1.png");
        Icon ImageKoala = new ImageIcon(Koala.getImage().getScaledInstance(lblKoala.getWidth(), lblKoala.getHeight(), Image.SCALE_DEFAULT));
        lblKoala.setIcon(ImageKoala);
        
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
        lblLeon = new javax.swing.JLabel();
        lblElefante = new javax.swing.JLabel();
        lblMono = new javax.swing.JLabel();
        lblSerpiente = new javax.swing.JLabel();
        lblTigre = new javax.swing.JLabel();
        lblJirafa = new javax.swing.JLabel();
        lblSebra = new javax.swing.JLabel();
        lblKoala = new javax.swing.JLabel();
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

        lblLeon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLeon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLeonMouseClicked(evt);
            }
        });

        lblElefante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblElefante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElefanteMouseClicked(evt);
            }
        });

        lblMono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMonoMouseClicked(evt);
            }
        });

        lblSerpiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSerpiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSerpienteMouseClicked(evt);
            }
        });

        lblTigre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTigre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTigreMouseClicked(evt);
            }
        });

        lblJirafa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJirafa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJirafaMouseClicked(evt);
            }
        });

        lblSebra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSebra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSebraMouseClicked(evt);
            }
        });

        lblKoala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblKoala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKoalaMouseClicked(evt);
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
                                .addGap(230, 230, 230)
                                .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1000, 1000, 1000)
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTigre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblKoala, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblSebra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblJirafa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLeon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblElefante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblMono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblSerpiente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSerpiente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElefante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLeon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJirafa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSebra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKoala, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTigre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(321, 321, 321))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLeonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeonMouseClicked
        Animales_Leon L = new Animales_Leon();
        L.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblLeonMouseClicked

    private void lblElefanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElefanteMouseClicked
        Animales_Elefante G = new Animales_Elefante();
        G.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblElefanteMouseClicked

    private void lblMonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMonoMouseClicked
        Animales_Mono P = new Animales_Mono();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblMonoMouseClicked

    private void lblSerpienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSerpienteMouseClicked
        Animales_Serpiente V = new Animales_Serpiente();
        V.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblSerpienteMouseClicked

    private void lblTigreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTigreMouseClicked
        Animales_Tigre P = new Animales_Tigre();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblTigreMouseClicked

    private void lblJirafaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJirafaMouseClicked
        Animales_Jirafa C = new Animales_Jirafa();
        C.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblJirafaMouseClicked

    private void lblSebraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSebraMouseClicked
        Animales_Cebra S = new Animales_Cebra();
        S.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblSebraMouseClicked

    private void lblKoalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKoalaMouseClicked
        Animales_Koala O = new Animales_Koala();
        O.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblKoalaMouseClicked

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
            java.util.logging.Logger.getLogger(Animales_Jungla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animales_Jungla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animales_Jungla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animales_Jungla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Animales_Jungla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblElefante;
    private javax.swing.JLabel lblJirafa;
    private javax.swing.JLabel lblKoala;
    private javax.swing.JLabel lblLeon;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMono;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSebra;
    private javax.swing.JLabel lblSerpiente;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblTigre;
    // End of variables declaration//GEN-END:variables
}
