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
public class Transportes extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";

    public Transportes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Transports");   
        
        lblAvion1.setVisible(false);
        lblBarco1.setVisible(false);
        lblBici1.setVisible(false);
        lblCamion1.setVisible(false);
        lblCarro1.setVisible(false);
        lblMoto1.setVisible(false);
        
        ImageIcon Avion = new ImageIcon(RutaImagenes + "Memorama_Avion1.png");
        Icon ImageAvion = new ImageIcon(Avion.getImage().getScaledInstance(lblAvion.getWidth(), lblAvion.getHeight(), Image.SCALE_DEFAULT));
        lblAvion.setIcon(ImageAvion);
        
        ImageIcon Avion2 = new ImageIcon(RutaImagenes + "Memorama_Avion2.png");
        Icon ImageAvion2 = new ImageIcon(Avion2.getImage().getScaledInstance(lblAvion1.getWidth(), lblAvion1.getHeight(), Image.SCALE_DEFAULT));
        lblAvion1.setIcon(ImageAvion2);
        
        ImageIcon Barco = new ImageIcon(RutaImagenes + "Memorama_Barco1.png");
        Icon ImageBarco = new ImageIcon(Barco.getImage().getScaledInstance(lblBarco.getWidth(), lblBarco.getHeight(), Image.SCALE_DEFAULT));
        lblBarco.setIcon(ImageBarco);
        
        ImageIcon Barco2 = new ImageIcon(RutaImagenes + "Memorama_Barco2.png");
        Icon ImageBarco2 = new ImageIcon(Barco2.getImage().getScaledInstance(lblBarco1.getWidth(), lblBarco1.getHeight(), Image.SCALE_DEFAULT));
        lblBarco1.setIcon(ImageBarco2);
        
        ImageIcon Bici = new ImageIcon(RutaImagenes + "Memorama_Bici1.png");
        Icon ImageBici = new ImageIcon(Bici.getImage().getScaledInstance(lblBici.getWidth(), lblBici.getHeight(), Image.SCALE_DEFAULT));
        lblBici.setIcon(ImageBici);
        
        ImageIcon Bici2 = new ImageIcon(RutaImagenes + "Memorama_Bici2.png");
        Icon ImageBici2 = new ImageIcon(Bici2.getImage().getScaledInstance(lblBici1.getWidth(), lblBici1.getHeight(), Image.SCALE_DEFAULT));
        lblBici1.setIcon(ImageBici2);
        
        ImageIcon Camion = new ImageIcon(RutaImagenes + "Memorama_Camion1.png");
        Icon ImageCamion = new ImageIcon(Camion.getImage().getScaledInstance(lblCamion.getWidth(), lblCamion.getHeight(), Image.SCALE_DEFAULT));
        lblCamion.setIcon(ImageCamion);
        
        ImageIcon Camion2 = new ImageIcon(RutaImagenes + "Memorama_Camion2.png");
        Icon ImageCamion2 = new ImageIcon(Camion2.getImage().getScaledInstance(lblCamion1.getWidth(), lblCamion1.getHeight(), Image.SCALE_DEFAULT));
        lblCamion1.setIcon(ImageCamion2);
        
        ImageIcon Carro = new ImageIcon(RutaImagenes + "Memorama_Carro2.png");
        Icon ImageCarro = new ImageIcon(Carro.getImage().getScaledInstance(lblCarro.getWidth(), lblCarro.getHeight(), Image.SCALE_DEFAULT));
        lblCarro.setIcon(ImageCarro);
        
        ImageIcon Carro2 = new ImageIcon(RutaImagenes + "Memorama_Carro1.png");
        Icon ImageCarro2 = new ImageIcon(Carro2.getImage().getScaledInstance(lblCarro1.getWidth(), lblCarro1.getHeight(), Image.SCALE_DEFAULT));
        lblCarro1.setIcon(ImageCarro2);
        
        ImageIcon Moto = new ImageIcon(RutaImagenes + "Memorama_Moto1.png");
        Icon ImageMoto = new ImageIcon(Moto.getImage().getScaledInstance(lblMoto.getWidth(), lblMoto.getHeight(), Image.SCALE_DEFAULT));
        lblMoto.setIcon(ImageMoto);
        
        ImageIcon Moto2 = new ImageIcon(RutaImagenes + "Memorama_Moto2.png");
        Icon ImageMoto2 = new ImageIcon(Moto2.getImage().getScaledInstance(lblMoto1.getWidth(), lblMoto1.getHeight(), Image.SCALE_DEFAULT));
        lblMoto1.setIcon(ImageMoto2);
        
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
        
        //Icono de Cerrar
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
        lblNo3 = new javax.swing.JLabel();
        lblSi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAvion = new javax.swing.JLabel();
        lblAvion1 = new javax.swing.JLabel();
        lblBarco = new javax.swing.JLabel();
        lblBarco1 = new javax.swing.JLabel();
        lblBici = new javax.swing.JLabel();
        lblBici1 = new javax.swing.JLabel();
        lblCamion = new javax.swing.JLabel();
        lblCamion1 = new javax.swing.JLabel();
        lblCarro = new javax.swing.JLabel();
        lblCarro1 = new javax.swing.JLabel();
        lblMoto = new javax.swing.JLabel();
        lblMoto1 = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();

        Dialogo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Dialogo.setAlwaysOnTop(true);
        Dialogo.setModalExclusionType(null);
        Dialogo.setUndecorated(true);
        Dialogo.setResizable(false);
        Dialogo.setType(java.awt.Window.Type.POPUP);
        Dialogo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNo3MouseClicked(evt);
            }
        });
        Dialogo.getContentPane().add(lblNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 60, 40));

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblAvion.setText("jLabel1");
        lblAvion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAvion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAvionMouseClicked(evt);
            }
        });

        lblAvion1.setText("jLabel1");

        lblBarco.setText("jLabel1");
        lblBarco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBarco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBarcoMouseClicked(evt);
            }
        });

        lblBarco1.setText("jLabel1");
        lblBarco1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBarco1MouseClicked(evt);
            }
        });

        lblBici.setText("jLabel1");
        lblBici.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBiciMouseClicked(evt);
            }
        });

        lblBici1.setText("jLabel1");
        lblBici1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBici1MouseClicked(evt);
            }
        });

        lblCamion.setText("jLabel1");
        lblCamion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCamion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCamionMouseClicked(evt);
            }
        });

        lblCamion1.setText("jLabel1");
        lblCamion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCamion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCamion1MouseClicked(evt);
            }
        });

        lblCarro.setText("jLabel1");
        lblCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarroMouseClicked(evt);
            }
        });

        lblCarro1.setText("jLabel1");
        lblCarro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarro1MouseClicked(evt);
            }
        });

        lblMoto.setText("jLabel1");
        lblMoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMotoMouseClicked(evt);
            }
        });

        lblMoto1.setText("jLabel1");
        lblMoto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoto1MouseClicked(evt);
            }
        });

        lblMenu.setText("Menu");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

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
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblAvion1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblBarco1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBici, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblBici1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(180, 180, 180)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCarro1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCamion1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(603, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvion1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCamion1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBarco1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarro1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBici, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBici1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAvionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvionMouseClicked
        lblAvion1.setVisible(true);
    }//GEN-LAST:event_lblAvionMouseClicked

    private void lblBarcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarcoMouseClicked
        lblBarco1.setVisible(true);
    }//GEN-LAST:event_lblBarcoMouseClicked

    private void lblBarco1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarco1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBarco1MouseClicked

    private void lblBiciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBiciMouseClicked
        lblBici1.setVisible(true);
    }//GEN-LAST:event_lblBiciMouseClicked

    private void lblBici1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBici1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBici1MouseClicked

    private void lblCamionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCamionMouseClicked
        lblCamion1.setVisible(true);
    }//GEN-LAST:event_lblCamionMouseClicked

    private void lblCamion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCamion1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCamion1MouseClicked

    private void lblCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarroMouseClicked
        lblCarro1.setVisible(true);
    }//GEN-LAST:event_lblCarroMouseClicked

    private void lblCarro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarro1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCarro1MouseClicked

    private void lblMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMotoMouseClicked
        lblMoto1.setVisible(true);
    }//GEN-LAST:event_lblMotoMouseClicked

    private void lblMoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoto1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMoto1MouseClicked

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

    private void lblNo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNo3MouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNo3MouseClicked

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
            java.util.logging.Logger.getLogger(Transportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAvion;
    private javax.swing.JLabel lblAvion1;
    private javax.swing.JLabel lblBarco;
    private javax.swing.JLabel lblBarco1;
    private javax.swing.JLabel lblBici;
    private javax.swing.JLabel lblBici1;
    private javax.swing.JLabel lblCamion;
    private javax.swing.JLabel lblCamion1;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblCarro1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMoto;
    private javax.swing.JLabel lblMoto1;
    private javax.swing.JLabel lblNo3;
    private javax.swing.JLabel lblSi;
    // End of variables declaration//GEN-END:variables
}

