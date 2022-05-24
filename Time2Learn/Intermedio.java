/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time2Learn;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dee Dee Gtz
 */
public class Intermedio extends javax.swing.JFrame {

    public Intermedio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Medium");        
        
        String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";

        ImageIcon Menu = new ImageIcon(RutaImagenes + "Icono_Menu.png");
        Icon ImageMenu = new ImageIcon(Menu.getImage().getScaledInstance(lblMenu.getWidth(), lblMenu.getHeight(), Image.SCALE_DEFAULT));
        lblMenu.setIcon(ImageMenu);
        
         ImageIcon Comida = new ImageIcon(RutaImagenes + "Piramide.png");
        Icon ImageComida = new ImageIcon(Comida.getImage().getScaledInstance(lblComida.getWidth(), lblComida.getHeight(), Image.SCALE_DEFAULT));
        lblComida.setIcon(ImageComida);
        
        ImageIcon Ropa = new ImageIcon(RutaImagenes + "Ropa.png");
        Icon ImageRopa = new ImageIcon(Ropa.getImage().getScaledInstance(lblRopa.getWidth(), lblRopa.getHeight(), Image.SCALE_DEFAULT));
        lblRopa.setIcon(ImageRopa);
        
        ImageIcon Figuras = new ImageIcon(RutaImagenes + "Figura.png");
        Icon ImageFiguras = new ImageIcon(Figuras.getImage().getScaledInstance(lblFiguras.getWidth(), lblFiguras.getHeight(), Image.SCALE_DEFAULT));
        lblFiguras.setIcon(ImageFiguras);
        
        ImageIcon Clima = new ImageIcon(RutaImagenes + "Clima1.png");
        Icon ImageClima = new ImageIcon(Clima.getImage().getScaledInstance(lblClima.getWidth(), lblClima.getHeight(), Image.SCALE_DEFAULT));
        lblClima.setIcon(ImageClima);
        
        ImageIcon Estaciones = new ImageIcon(RutaImagenes + "Estaciones1.png");
        Icon ImageEstaciones = new ImageIcon(Estaciones.getImage().getScaledInstance(lblSeasons.getWidth(), lblSeasons.getHeight(), Image.SCALE_DEFAULT));
        lblSeasons.setIcon(ImageEstaciones);
        
        ImageIcon Days = new ImageIcon(RutaImagenes + "Dias de la Semana1.png");
        Icon ImageDays = new ImageIcon(Days.getImage().getScaledInstance(lblDays.getWidth(), lblDays.getHeight(), Image.SCALE_DEFAULT));
        lblDays.setIcon(ImageDays);
        
        ImageIcon Adjetivos = new ImageIcon(RutaImagenes + "Adjetivos1.png");
        Icon ImageAdjetivos = new ImageIcon(Adjetivos.getImage().getScaledInstance(lblAdjetivos.getWidth(), lblAdjetivos.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivos.setIcon(ImageAdjetivos);
        
        /*ImageIcon Jarra = new ImageIcon(ruta + "Jarra del Buen Beber.png");
        Icon ImageJarra = new ImageIcon(Jarra.getImage().getScaledInstance(lblJarra.getWidth(), lblJarra.getHeight(), Image.SCALE_DEFAULT));
        lblJarra.setIcon(ImageJarra);*/
        
        ImageIcon Nivel = new ImageIcon(RutaImagenes + "Nivel Medio.png");
        Icon ImageNivel = new ImageIcon(Nivel.getImage().getScaledInstance(lblNivel.getWidth(), lblNivel.getHeight(), Image.SCALE_DEFAULT));
        lblNivel.setIcon(ImageNivel);
        
        //Imagen de Cerrar
        ImageIcon Cerrar = new ImageIcon(RutaImagenes + "Icono_Cerrar.png");
        Icon ImageCerrar = new ImageIcon(Cerrar.getImage().getScaledInstance(lblCerrar.getWidth(), lblCerrar.getHeight(), Image.SCALE_DEFAULT));
        lblCerrar.setIcon(ImageCerrar);
        
        //Imagen de Minimizar
        ImageIcon Minimizar = new ImageIcon(RutaImagenes + "Icono_Minimizar.png");
        Icon ImageMinimizar = new ImageIcon(Minimizar.getImage().getScaledInstance(lblMinizar.getWidth(), lblMinizar.getHeight(), Image.SCALE_DEFAULT));
        lblMinizar.setIcon(ImageMinimizar);
        
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
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMinizar = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblComida = new javax.swing.JLabel();
        lblRopa = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        lblClima = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFiguras = new javax.swing.JLabel();
        lblSeasons = new javax.swing.JLabel();
        lblDays = new javax.swing.JLabel();
        lblAdjetivos = new javax.swing.JLabel();

        Dialogo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Dialogo.setAlwaysOnTop(true);
        Dialogo.setModalExclusionType(null);
        Dialogo.setUndecorated(true);
        Dialogo.setResizable(false);
        Dialogo.setType(java.awt.Window.Type.POPUP);
        Dialogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DialogoKeyPressed(evt);
            }
        });
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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mensaje_Salir.png"))); // NOI18N
        Dialogo.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        lblMinizar.setText("Minimizar");
        lblMinizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinizarMouseClicked(evt);
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

        lblComida.setText("Food");
        lblComida.setToolTipText("");
        lblComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComidaMouseClicked(evt);
            }
        });

        lblRopa.setText("Clothes");
        lblRopa.setToolTipText("");
        lblRopa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRopa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRopaMouseClicked(evt);
            }
        });

        lblNivel.setText("Nivel Intermedio");
        lblNivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNivelMouseClicked(evt);
            }
        });

        lblClima.setText("Weather");
        lblClima.setToolTipText("");
        lblClima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClimaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblFiguras.setText("Shapes");
        lblFiguras.setToolTipText("");
        lblFiguras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFiguras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFigurasMouseClicked(evt);
            }
        });

        lblSeasons.setText("Seasons of Year");
        lblSeasons.setToolTipText("");
        lblSeasons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSeasons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSeasonsMouseClicked(evt);
            }
        });

        lblDays.setText("Days of Week");
        lblDays.setToolTipText("");
        lblDays.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDaysMouseClicked(evt);
            }
        });

        lblAdjetivos.setText("Adjetives");
        lblAdjetivos.setToolTipText("");
        lblAdjetivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdjetivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdjetivosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357)
                .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248)
                .addComponent(lblMinizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1888, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(lblFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblSeasons, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabel1)
                                .addGap(667, 667, 667)))
                        .addComponent(lblAdjetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(lblComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblClima, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblClima, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52))
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMinizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSeasons, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAdjetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, 990));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRopaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRopaMouseClicked
        Ropa R = new Ropa();
        R.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblRopaMouseClicked

    private void lblNivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNivelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNivelMouseClicked

    private void lblClimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClimaMouseClicked
        Clima t = new Clima();
        t.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblClimaMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Niveles v = new Niveles();
        v.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblMinizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Dialogo.setSize(576, 259);
        Dialogo.setLocationRelativeTo(null);
        Dialogo.setVisible(true);
        Dialogo.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblFigurasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFigurasMouseClicked
        Figuras C = new Figuras();
        C.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblFigurasMouseClicked

    private void lblSeasonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeasonsMouseClicked
        Estaciones C = new Estaciones();
        C.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblSeasonsMouseClicked

    private void lblDaysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDaysMouseClicked
        DiasSemana_Domingo C = new DiasSemana_Domingo();
        C.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblDaysMouseClicked

    private void lblComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComidaMouseClicked
        Piramide P = new Piramide();
        P.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblComidaMouseClicked

    private void lblAdjetivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdjetivosMouseClicked
        Adjetivos P = new Adjetivos();
        P.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblAdjetivosMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

    private void DialogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DialogoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            SplashSalir v = new SplashSalir();
            v.setVisible(true);

            Dialogo.dispose();
            this.dispose();
        }
    }//GEN-LAST:event_DialogoKeyPressed

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
            java.util.logging.Logger.getLogger(Intermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intermedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdjetivos;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblFiguras;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinizar;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblRopa;
    private javax.swing.JLabel lblSeasons;
    private javax.swing.JLabel lblSi;
    // End of variables declaration//GEN-END:variables
}
