/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time2Learn;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Dee Dee Gtz
 */
public class Comida_Frutas extends javax.swing.JFrame {
        String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
        String RutaAudios = "C:/Time 2 Learn/src/Audios/Comida/";
        
    public Comida_Frutas() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Food");        
        
        
        //Imagen Comida_Frutas
        ImageIcon Frutas = new ImageIcon(RutaImagenes + "Comida_Frutas.png");
        Icon ImageFrutas = new ImageIcon(Frutas.getImage().getScaledInstance(lblFrutas.getWidth(), lblFrutas.getHeight(), Image.SCALE_DEFAULT));
        lblFrutas.setIcon(ImageFrutas);
        
        //Imagen Manzana
        ImageIcon Manzana = new ImageIcon(RutaImagenes + "Comida_Manzana.png");
        Icon ImageManzana = new ImageIcon(Manzana.getImage().getScaledInstance(lblManzana.getWidth(), lblManzana.getHeight(), Image.SCALE_DEFAULT));
        lblManzana.setIcon(ImageManzana);
        
        //Imagen Naranja
        ImageIcon Naranja = new ImageIcon(RutaImagenes + "Comida_Naranja.png");
        Icon ImageNaranja = new ImageIcon(Naranja.getImage().getScaledInstance(lblNaranja.getWidth(), lblNaranja.getHeight(), Image.SCALE_DEFAULT));
        lblNaranja.setIcon(ImageNaranja);
        
        //Imagen Uva
        ImageIcon Uva = new ImageIcon(RutaImagenes + "Comida_Uva.png");
        Icon ImageUva = new ImageIcon(Uva.getImage().getScaledInstance(lblUva.getWidth(), lblUva.getHeight(), Image.SCALE_DEFAULT));
        lblUva.setIcon(ImageUva);
        
        //Imagen Platano
        ImageIcon Platano = new ImageIcon(RutaImagenes + "Comida_Platano.png");
        Icon ImagePlatano = new ImageIcon(Platano.getImage().getScaledInstance(lblPlatano.getWidth(), lblPlatano.getHeight(), Image.SCALE_DEFAULT));
        lblPlatano.setIcon(ImagePlatano);
        
        //Imagen Sandia
        ImageIcon Sandia = new ImageIcon(RutaImagenes + "Comida_Sandia.png");
        Icon ImageSandia = new ImageIcon(Sandia.getImage().getScaledInstance(lblSandia.getWidth(), lblSandia.getHeight(), Image.SCALE_DEFAULT));
        lblSandia.setIcon(ImageSandia);
        
        //Imagen Fresa
        ImageIcon Fresa = new ImageIcon(RutaImagenes + "Comida_Fresa.png");
        Icon ImageFresa = new ImageIcon(Fresa.getImage().getScaledInstance(lblFresa.getWidth(), lblFresa.getHeight(), Image.SCALE_DEFAULT));
        lblFresa.setIcon(ImageFresa);
        
        //Imagen Durazno
        ImageIcon Durazno = new ImageIcon(RutaImagenes + "Comida_Durazno.png");
        Icon ImageDurazno = new ImageIcon(Durazno.getImage().getScaledInstance(lblDurazno.getWidth(), lblDurazno.getHeight(), Image.SCALE_DEFAULT));
        lblDurazno.setIcon(ImageDurazno);
        
        //Imagen Mango
        ImageIcon Mango = new ImageIcon(RutaImagenes + "Comida_Mango.png");
        Icon ImageMango = new ImageIcon(Mango.getImage().getScaledInstance(lblMango.getWidth(), lblMango.getHeight(), Image.SCALE_DEFAULT));
        lblMango.setIcon(ImageMango);
        
        //Imagen Piña
        ImageIcon Piña = new ImageIcon(RutaImagenes + "Comida_Piña.png");
        Icon ImagePiña = new ImageIcon(Piña.getImage().getScaledInstance(lblPiña.getWidth(), lblPiña.getHeight(), Image.SCALE_DEFAULT));
        lblPiña.setIcon(ImagePiña);
        
        //Imagen de Siguiente
        ImageIcon Siguiente = new ImageIcon(RutaImagenes + "Icono_Siguiente.png");
        Icon ImageSiguiente = new ImageIcon(Siguiente.getImage().getScaledInstance(lblSiguiente.getWidth(), lblSiguiente.getHeight(), Image.SCALE_DEFAULT));
        lblSiguiente.setIcon(ImageSiguiente);
        
        //Imagen de Regresar
        ImageIcon Regresar = new ImageIcon(RutaImagenes + "Icono_Regresar.png");
        Icon ImageRegresar = new ImageIcon(Regresar.getImage().getScaledInstance(lblRegresar.getWidth(), lblRegresar.getHeight(), Image.SCALE_DEFAULT));
        lblRegresar.setIcon(ImageRegresar);
        
        //Imagen de Menu
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
        lblRegresar = new javax.swing.JLabel();
        lblManzana = new javax.swing.JLabel();
        lblNaranja = new javax.swing.JLabel();
        lblUva = new javax.swing.JLabel();
        lblPlatano = new javax.swing.JLabel();
        lblSandia = new javax.swing.JLabel();
        lblFresa = new javax.swing.JLabel();
        lblDurazno = new javax.swing.JLabel();
        lblMango = new javax.swing.JLabel();
        lblPiña = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblFrutas = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();

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
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        lblManzana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblManzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManzanaMouseClicked(evt);
            }
        });

        lblNaranja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNaranja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNaranjaMouseClicked(evt);
            }
        });

        lblUva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUvaMouseClicked(evt);
            }
        });

        lblPlatano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlatano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlatanoMouseClicked(evt);
            }
        });

        lblSandia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSandia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSandiaMouseClicked(evt);
            }
        });

        lblFresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFresaMouseClicked(evt);
            }
        });

        lblDurazno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDurazno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDuraznoMouseClicked(evt);
            }
        });

        lblMango.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMango.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMangoMouseClicked(evt);
            }
        });

        lblPiña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPiña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPiñaMouseClicked(evt);
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

        lblFrutas.setBackground(new java.awt.Color(204, 204, 255));
        lblFrutas.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblFrutas.setText("Frutas");

        lblSiguiente.setText("Siguiente");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lblFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblDurazno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblMango, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblUva, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(lblFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblPiña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblPlatano, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblSandia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDurazno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMango, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUva, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlatano, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSandia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPiña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblManzanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManzanaMouseClicked
        //Audio del Manzana
        String Archivo = RutaAudios + "Manzana.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
    }//GEN-LAST:event_lblManzanaMouseClicked

    private void lblNaranjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNaranjaMouseClicked
        //Audio del Naranja
        String Archivo = RutaAudios + "Naranja.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblNaranjaMouseClicked

    private void lblUvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUvaMouseClicked
        //Audio del Uva
        String Archivo = RutaAudios + "Uva.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblUvaMouseClicked

    private void lblPlatanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlatanoMouseClicked
        //Audio del Platano
        String Archivo = RutaAudios + "Platano.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblPlatanoMouseClicked

    private void lblSandiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSandiaMouseClicked
        //Audio del Sandia
        String Archivo = RutaAudios + "Sandia.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblSandiaMouseClicked

    private void lblFresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFresaMouseClicked
        //Audio de la Fresa
        String Archivo = RutaAudios + "Fresa.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblFresaMouseClicked

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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

    private void lblDuraznoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDuraznoMouseClicked
        //Audio del Durazno
        String Archivo = RutaAudios + "Durazno.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblDuraznoMouseClicked

    private void lblMangoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMangoMouseClicked
        //Audio del Mango
        String Archivo = RutaAudios + "Mango.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblMangoMouseClicked

    private void lblPiñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPiñaMouseClicked
        //Audio del Piña
        String Archivo = RutaAudios + "Piña.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblPiñaMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        Comida_Comida C = new Comida_Comida();
        C.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        Comida_Verduras C = new Comida_Verduras();
        C.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblSiguienteMouseClicked

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
            java.util.logging.Logger.getLogger(Comida_Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comida_Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comida_Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comida_Frutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Comida_Frutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDurazno;
    private javax.swing.JLabel lblFresa;
    private javax.swing.JLabel lblFrutas;
    private javax.swing.JLabel lblMango;
    private javax.swing.JLabel lblManzana;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNaranja;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPiña;
    private javax.swing.JLabel lblPlatano;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSandia;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblUva;
    // End of variables declaration//GEN-END:variables
}
