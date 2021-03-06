package Time2Learn;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dee Dee Gtz
 */
public class Profesiones extends javax.swing.JFrame {
    
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    String RutaAudios = "C:/Time 2 Learn/src/Audios/Profesiones/";
    
    public Profesiones() {
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
        
        //Imagen Teacher
        ImageIcon Teacher = new ImageIcon(RutaImagenes + "Profesiones_Maestro.png");
        Icon ImageTeacher = new ImageIcon(Teacher.getImage().getScaledInstance(lblTeacher.getWidth(), lblTeacher.getHeight(), Image.SCALE_DEFAULT));
        lblTeacher.setIcon(ImageTeacher);
        
        //Imagen Artista
        ImageIcon Artista = new ImageIcon(RutaImagenes + "Profesiones_Artista.png");
        Icon ImageArtista = new ImageIcon(Artista.getImage().getScaledInstance(lblArtist.getWidth(), lblArtist.getHeight(), Image.SCALE_DEFAULT));
        lblArtist.setIcon(ImageArtista);
        
        //Imagen Astronauta
        ImageIcon Astronauta = new ImageIcon(RutaImagenes + "Profesiones_Astronauta.png");
        Icon ImageAstronauta = new ImageIcon(Astronauta.getImage().getScaledInstance(lblAstronaut.getWidth(), lblAstronaut.getHeight(), Image.SCALE_DEFAULT));
        lblAstronaut.setIcon(ImageAstronauta);
        
        //Imagen Bombero
        ImageIcon Bombero = new ImageIcon(RutaImagenes + "Profesiones_Bombero.png");
        Icon ImageBombero = new ImageIcon(Bombero.getImage().getScaledInstance(lblBombero.getWidth(), lblBombero.getHeight(), Image.SCALE_DEFAULT));
        lblBombero.setIcon(ImageBombero);
        
        //Imagen Cocinero
        ImageIcon Cocinero = new ImageIcon(RutaImagenes + "Profesiones_Cocinero.png");
        Icon ImageCocinero = new ImageIcon(Cocinero.getImage().getScaledInstance(lblCocinero.getWidth(), lblCocinero.getHeight(), Image.SCALE_DEFAULT));
        lblCocinero.setIcon(ImageCocinero);
        
        //Imagen Doctor
        ImageIcon Doctor = new ImageIcon(RutaImagenes + "Profesiones_Doctor.png");
        Icon ImageDoctor = new ImageIcon(Doctor.getImage().getScaledInstance(lblDoctor.getWidth(), lblDoctor.getHeight(), Image.SCALE_DEFAULT));
        lblDoctor.setIcon(ImageDoctor);
        
        //Imagen Policia
        ImageIcon Policia = new ImageIcon(RutaImagenes + "Profesiones_Policia.png");
        Icon ImagePolicia = new ImageIcon(Policia.getImage().getScaledInstance(lblPolicia.getWidth(), lblPolicia.getHeight(), Image.SCALE_DEFAULT));
        lblPolicia.setIcon(ImagePolicia);
        
        //Imagen Trabajador
        ImageIcon Trabajador = new ImageIcon(RutaImagenes + "Profesiones_Trabajador.png");
        Icon ImageTrabajador = new ImageIcon(Trabajador.getImage().getScaledInstance(lblTrabajador.getWidth(), lblTrabajador.getHeight(), Image.SCALE_DEFAULT));
        lblTrabajador.setIcon(ImageTrabajador);
        
        //Imagen Game
        ImageIcon Game = new ImageIcon(RutaImagenes + "Mando.png");
        Icon ImageGame = new ImageIcon(Game.getImage().getScaledInstance(lblGame.getWidth(), lblGame.getHeight(), Image.SCALE_DEFAULT));
        lblGame.setIcon(ImageGame);
        
        //Icono
        setIconImage(Toolkit.getDefaultToolkit().getImage(RutaImagenes + "Icono.png"));
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
        lblTeacher = new javax.swing.JLabel();
        lblArtist = new javax.swing.JLabel();
        lblAstronaut = new javax.swing.JLabel();
        lblBombero = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblCocinero = new javax.swing.JLabel();
        lblPolicia = new javax.swing.JLabel();
        lblTrabajador = new javax.swing.JLabel();
        lblChoose = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblGame = new javax.swing.JLabel();

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
        setPreferredSize(new java.awt.Dimension(4250, 1381));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMenu.setText("Menu");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        lblTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTeacherMouseClicked(evt);
            }
        });

        lblArtist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblArtist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArtistMouseClicked(evt);
            }
        });

        lblAstronaut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAstronaut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAstronautMouseClicked(evt);
            }
        });

        lblBombero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBombero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBomberoMouseClicked(evt);
            }
        });

        lblDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDoctorMouseClicked(evt);
            }
        });

        lblCocinero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCocinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCocineroMouseClicked(evt);
            }
        });

        lblPolicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPolicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPoliciaMouseClicked(evt);
            }
        });

        lblTrabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrabajadorMouseClicked(evt);
            }
        });

        lblChoose.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblChoose.setText("                Choose One");

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

        lblGame.setText("Game");
        lblGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblAstronaut, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblBombero, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblGame, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(900, 900, 900)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGame, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblArtist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAstronaut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBombero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(401, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Dificil D = new Dificil();
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

    private void lblTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTeacherMouseClicked
        String Archivo = RutaAudios + "Teacher.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblTeacherMouseClicked

    private void lblArtistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArtistMouseClicked
        String Archivo = RutaAudios + "Artist.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblArtistMouseClicked

    private void lblAstronautMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAstronautMouseClicked
        String Archivo = RutaAudios + "Astronaut.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblAstronautMouseClicked

    private void lblBomberoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBomberoMouseClicked
        String Archivo = RutaAudios + "Fire Fitgher.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblBomberoMouseClicked

    private void lblDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoctorMouseClicked
        String Archivo = RutaAudios + "Doctor.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblDoctorMouseClicked

    private void lblCocineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCocineroMouseClicked
        String Archivo = RutaAudios + "Chef.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblCocineroMouseClicked

    private void lblPoliciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPoliciaMouseClicked
        String Archivo = RutaAudios + "Police.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblPoliciaMouseClicked

    private void lblTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrabajadorMouseClicked
        String Archivo = RutaAudios + "Construction Worked.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblTrabajadorMouseClicked

    private void lblGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGameMouseClicked
        
        Profesiones_Game v = new Profesiones_Game();
        v.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblGameMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

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
            java.util.logging.Logger.getLogger(Profesiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblAstronaut;
    private javax.swing.JLabel lblBombero;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblCocinero;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblGame;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPolicia;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblTeacher;
    private javax.swing.JLabel lblTrabajador;
    // End of variables declaration//GEN-END:variables
}
