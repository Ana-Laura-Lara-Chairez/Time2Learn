package Time2Learn;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dee Dee Gtz
 */
public class Instrumentos extends javax.swing.JFrame {
    
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    
    public Instrumentos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Professions");        
        
        //Icono de Menu
        ImageIcon Menu = new ImageIcon(RutaImagenes + "Icono_Menu.png");
        Icon ImageMenu = new ImageIcon(Menu.getImage().getScaledInstance(lblMenu.getWidth(), lblMenu.getHeight(), Image.SCALE_DEFAULT));
        lblMenu.setIcon(ImageMenu);
        
        //Imagen de Minimizar
        ImageIcon Minimizar = new ImageIcon(RutaImagenes + "Icono_Minimizar.png");
        Icon ImageMinimizar = new ImageIcon(Minimizar.getImage().getScaledInstance(lblMinimizar.getWidth(), lblMinimizar.getHeight(), Image.SCALE_DEFAULT));
        lblMinimizar.setIcon(ImageMinimizar);
        
        //Imagen de Cerrar
        ImageIcon Cerrar = new ImageIcon(RutaImagenes + "Icono_Cerrar.png");
        Icon ImageCerrar = new ImageIcon(Cerrar.getImage().getScaledInstance(lblCerrar.getWidth(), lblCerrar.getHeight(), Image.SCALE_DEFAULT));
        lblCerrar.setIcon(ImageCerrar);
        
        //Imagen Bateria
        ImageIcon Bateria = new ImageIcon(RutaImagenes + "Instrumentos_Bateria1.png");
        Icon ImageBateria = new ImageIcon(Bateria.getImage().getScaledInstance(lblBateria.getWidth(), lblBateria.getHeight(), Image.SCALE_DEFAULT));
        lblBateria.setIcon(ImageBateria);
        
        //Imagen Violin
        ImageIcon Violin = new ImageIcon(RutaImagenes + "Instrumentos_Violin1.png");
        Icon ImageViolin = new ImageIcon(Violin.getImage().getScaledInstance(lblViolin.getWidth(), lblViolin.getHeight(), Image.SCALE_DEFAULT));
        lblViolin.setIcon(ImageViolin);
        
        //Imagen Guitarra
        ImageIcon Guitarra = new ImageIcon(RutaImagenes + "Instrumentos_Guitarra1.png");
        Icon ImageGuitarra = new ImageIcon(Guitarra.getImage().getScaledInstance(lblGuitarra.getWidth(), lblGuitarra.getHeight(), Image.SCALE_DEFAULT));
        lblGuitarra.setIcon(ImageGuitarra);
        
        //Imagen Flauta
        ImageIcon Flauta = new ImageIcon(RutaImagenes + "Instrumentos_Flauta1.png");
        Icon ImageFlauta = new ImageIcon(Flauta.getImage().getScaledInstance(lblFlauta.getWidth(), lblFlauta.getHeight(), Image.SCALE_DEFAULT));
        lblFlauta.setIcon(ImageFlauta);
        
        //Imagen Piano
        ImageIcon Piano = new ImageIcon(RutaImagenes + "Instrumentos_Piano1.png");
        Icon ImagePiano = new ImageIcon(Piano.getImage().getScaledInstance(lblPiano.getWidth(), lblPiano.getHeight(), Image.SCALE_DEFAULT));
        lblPiano.setIcon(ImagePiano);
        
        //Imagen Trompeta
        ImageIcon Trompeta = new ImageIcon(RutaImagenes + "Instrumentos_Trompeta1.png");
        Icon ImageTrompeta = new ImageIcon(Trompeta.getImage().getScaledInstance(lblTrompeta.getWidth(), lblTrompeta.getHeight(), Image.SCALE_DEFAULT));
        lblTrompeta.setIcon(ImageTrompeta);
        
        //Imagen Saxofon
        ImageIcon Saxofon = new ImageIcon(RutaImagenes + "Instrumentos_Saxofon1.png");
        Icon ImageSaxofon = new ImageIcon(Saxofon.getImage().getScaledInstance(lblSaxofon.getWidth(), lblSaxofon.getHeight(), Image.SCALE_DEFAULT));
        lblSaxofon.setIcon(ImageSaxofon);
        
        //Imagen Acordeon
        ImageIcon Acordeon = new ImageIcon(RutaImagenes + "Instrumentos_Acordeon1.png");
        Icon ImageAcordeon = new ImageIcon(Acordeon.getImage().getScaledInstance(lblAcordeon.getWidth(), lblAcordeon.getHeight(), Image.SCALE_DEFAULT));
        lblAcordeon.setIcon(ImageAcordeon);
        
        //Imagen Game
        ImageIcon Game = new ImageIcon(RutaImagenes + "Instrumentos1.png");
        Icon ImageGame = new ImageIcon(Game.getImage().getScaledInstance(lblInstrumentos.getWidth(), lblInstrumentos.getHeight(), Image.SCALE_DEFAULT));
        lblInstrumentos.setIcon(ImageGame);
        
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
        lblMenu = new javax.swing.JLabel();
        lblBateria = new javax.swing.JLabel();
        lblViolin = new javax.swing.JLabel();
        lblGuitarra = new javax.swing.JLabel();
        lblPiano = new javax.swing.JLabel();
        lblFlauta = new javax.swing.JLabel();
        lblAcordeon = new javax.swing.JLabel();
        lblSaxofon = new javax.swing.JLabel();
        lblTrompeta = new javax.swing.JLabel();
        lblInstrumentos = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();

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
        setPreferredSize(new java.awt.Dimension(1500, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMenu.setText("Menu");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        lblBateria.setText("lblBateria");
        lblBateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBateriaMouseClicked(evt);
            }
        });

        lblViolin.setText("lblViolin");
        lblViolin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViolin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViolinMouseClicked(evt);
            }
        });

        lblGuitarra.setText("lblGuitarra");
        lblGuitarra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuitarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuitarraMouseClicked(evt);
            }
        });

        lblPiano.setText("lblPiano");
        lblPiano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPiano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPianoMouseClicked(evt);
            }
        });

        lblFlauta.setText("lblFlauta");
        lblFlauta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFlauta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlautaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblFlautaMouseReleased(evt);
            }
        });

        lblAcordeon.setText("lblAcordeon");
        lblAcordeon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAcordeon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAcordeonMouseClicked(evt);
            }
        });

        lblSaxofon.setText("lblSaxofon");
        lblSaxofon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSaxofon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaxofonMouseClicked(evt);
            }
        });

        lblTrompeta.setText("lblTrompeta");
        lblTrompeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTrompeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrompetaMouseClicked(evt);
            }
        });

        lblInstrumentos.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N

        lblMinimizar.setText("Minimizar");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblCerrar.setText("Cerrar");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSaxofon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPiano, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblViolin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAcordeon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGuitarra, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrompeta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFlauta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1022, 1022, 1022)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(lblInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblViolin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrompeta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcordeon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGuitarra, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPiano, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaxofon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFlauta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Facil D = new Facil();
        D.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Dialogo.setSize(576, 259);
        Dialogo.setLocationRelativeTo(null);
        Dialogo.setVisible(true);
        Dialogo.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblBateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBateriaMouseClicked
        Instrumento_Bateria D = new Instrumento_Bateria();
        D.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblBateriaMouseClicked

    private void lblViolinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViolinMouseClicked
        Instrumento_Violin D = new Instrumento_Violin();
        D.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblViolinMouseClicked

    private void lblGuitarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuitarraMouseClicked
        Instrumento_Guitarra D = new Instrumento_Guitarra();
        D.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblGuitarraMouseClicked

    private void lblPianoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPianoMouseClicked
        Instrumento_Piano D = new Instrumento_Piano();
        D.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblPianoMouseClicked

    private void lblFlautaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlautaMouseClicked
        Instrumento_Flauta D = new Instrumento_Flauta();
        D.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblFlautaMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

    private void lblAcordeonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcordeonMouseClicked
        Instrumento_Acordeon A = new Instrumento_Acordeon();
        A.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblAcordeonMouseClicked

    private void lblSaxofonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaxofonMouseClicked
        Instrumento_Saxofon S = new Instrumento_Saxofon();
        S.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblSaxofonMouseClicked

    private void lblTrompetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrompetaMouseClicked
        Instrumento_Trompeta T = new Instrumento_Trompeta();
        T.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblTrompetaMouseClicked

    private void lblFlautaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlautaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFlautaMouseReleased

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
            java.util.logging.Logger.getLogger(Instrumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Instrumentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcordeon;
    private javax.swing.JLabel lblBateria;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblFlauta;
    private javax.swing.JLabel lblGuitarra;
    private javax.swing.JLabel lblInstrumentos;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPiano;
    private javax.swing.JLabel lblSaxofon;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblTrompeta;
    private javax.swing.JLabel lblViolin;
    // End of variables declaration//GEN-END:variables
}
