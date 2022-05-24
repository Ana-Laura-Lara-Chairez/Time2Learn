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
import javax.swing.JOptionPane;

/**
 *
 * @author anabel
 */
public class Colores extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    String RutaAudios = "C:/Time 2 Learn/src/Audios/";
    /**
     * Creates new form Colores
     */
    public Colores() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Colors");     
        
        //Imagen de la Base del Pastel
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_Base.jpg");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);
        
        //Imagen de Rojo
        ImageIcon Rojo = new ImageIcon(RutaImagenes + "Colores_Rojo1.png");
        Icon ImageRojo = new ImageIcon(Rojo.getImage().getScaledInstance(lblRojo.getWidth(), lblRojo.getHeight(), Image.SCALE_DEFAULT));
        lblRojo.setIcon(ImageRojo);
        
        //Imagen de Azul
        ImageIcon Azul = new ImageIcon(RutaImagenes + "Colores_Azul1.png");
        Icon ImageAzul = new ImageIcon(Azul.getImage().getScaledInstance(lblAzul.getWidth(), lblAzul.getHeight(), Image.SCALE_DEFAULT));
        lblAzul.setIcon(ImageAzul);
        
        //Imagen de Morado
        ImageIcon Morado = new ImageIcon(RutaImagenes + "Colores_Morado1.png");
        Icon ImageMorado = new ImageIcon(Morado.getImage().getScaledInstance(lblMorado.getWidth(), lblMorado.getHeight(), Image.SCALE_DEFAULT));
        lblMorado.setIcon(ImageMorado);
        
        //Imagen de Rosa
        ImageIcon Rosa = new ImageIcon(RutaImagenes + "Colores_Rosa1.png");
        Icon ImageRosa = new ImageIcon(Rosa.getImage().getScaledInstance(lblRosa.getWidth(), lblRosa.getHeight(), Image.SCALE_DEFAULT));
        lblRosa.setIcon(ImageRosa);
        
        //Imagen de Amarrillo
        ImageIcon Amarrillo = new ImageIcon(RutaImagenes + "Colores_Amarillo1.png");
        Icon ImageAmarrillo = new ImageIcon(Amarrillo.getImage().getScaledInstance(lblAmarillo.getWidth(), lblAmarillo.getHeight(), Image.SCALE_DEFAULT));
        lblAmarillo.setIcon(ImageAmarrillo);
        
        //Imagen de Verde
        ImageIcon Verde = new ImageIcon(RutaImagenes + "Colores_Verde1.png");
        Icon ImageVerde = new ImageIcon(Verde.getImage().getScaledInstance(lblVerde.getWidth(), lblVerde.getHeight(), Image.SCALE_DEFAULT));
        lblVerde.setIcon(ImageVerde);
        
        //Imagen de Naranja
        ImageIcon Naranja = new ImageIcon(RutaImagenes + "Colores_Naranja1.png");
        Icon ImageNaranja = new ImageIcon(Naranja.getImage().getScaledInstance(lblNaranja.getWidth(), lblNaranja.getHeight(), Image.SCALE_DEFAULT));
        lblNaranja.setIcon(ImageNaranja);
        
        //Imagen de Todo
        ImageIcon Todo = new ImageIcon(RutaImagenes + "Todo.png");
        Icon ImageTodo = new ImageIcon(Todo.getImage().getScaledInstance(lblTodo.getWidth(), lblTodo.getHeight(), Image.SCALE_DEFAULT));
        lblTodo.setIcon(ImageTodo);
        
        //Imagen de Colores
        ImageIcon Colores = new ImageIcon(RutaImagenes + "Colors.png");
        Icon ImageColores = new ImageIcon(Colores.getImage().getScaledInstance(lblColores.getWidth(), lblColores.getHeight(), Image.SCALE_DEFAULT));
        lblColores.setIcon(ImageColores);
        
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
        lblBase = new javax.swing.JLabel();
        lblRojo = new javax.swing.JLabel();
        lblAzul = new javax.swing.JLabel();
        lblMorado = new javax.swing.JLabel();
        lblRosa = new javax.swing.JLabel();
        lblAmarillo = new javax.swing.JLabel();
        lblVerde = new javax.swing.JLabel();
        lblNaranja = new javax.swing.JLabel();
        lblTodo = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblColores = new javax.swing.JLabel();

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

        lblBase.setText("jLabel1");

        lblRojo.setText("Rojo");
        lblRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRojoMouseClicked(evt);
            }
        });

        lblAzul.setText("Azul");
        lblAzul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAzulMouseClicked(evt);
            }
        });

        lblMorado.setText("Morado");
        lblMorado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMorado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoradoMouseClicked(evt);
            }
        });

        lblRosa.setText("Rosa");
        lblRosa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRosaMouseClicked(evt);
            }
        });

        lblAmarillo.setText("Amarillo");
        lblAmarillo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAmarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAmarilloMouseClicked(evt);
            }
        });

        lblVerde.setText("Verde");
        lblVerde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerdeMouseClicked(evt);
            }
        });

        lblNaranja.setText("Naranja");
        lblNaranja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNaranja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNaranjaMouseClicked(evt);
            }
        });

        lblTodo.setText("Todo");
        lblTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTodoMouseClicked(evt);
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

        lblColores.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(lblVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lblColores, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(lblAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblMorado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblBase, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(lblBase, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblColores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(lblAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMorado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRosa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(lblTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void lblTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTodoMouseClicked
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_All.png");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);

        String Archivo = RutaAudios + "Colores/All.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblTodoMouseClicked

    private void lblNaranjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNaranjaMouseClicked
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_Naranja.png");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);

        String Archivo = RutaAudios + "Colores/Orange.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblNaranjaMouseClicked

    private void lblVerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerdeMouseClicked
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_Verde.png");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);

        String Archivo = RutaAudios + "Colores/Green.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblVerdeMouseClicked

    private void lblAmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmarilloMouseClicked
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_Amarillo.png");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);

        String Archivo = RutaAudios + "Colores/Yellow.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblAmarilloMouseClicked

    private void lblRosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRosaMouseClicked
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_Rosa.png");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);

        String Archivo = RutaAudios + "Colores/Pink.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblRosaMouseClicked

    private void lblMoradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoradoMouseClicked
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_Morado.png");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);

        String Archivo = RutaAudios + "Colores/Purple.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblMoradoMouseClicked

    private void lblAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAzulMouseClicked
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_Azul.png");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);

        String Archivo = RutaAudios + "Colores/Blue.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblAzulMouseClicked

    private void lblRojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRojoMouseClicked
        ImageIcon Base = new ImageIcon(RutaImagenes + "Colores_Rojo.png");
        Icon ImageBase = new ImageIcon(Base.getImage().getScaledInstance(lblBase.getWidth(), lblBase.getHeight(), Image.SCALE_DEFAULT));
        lblBase.setIcon(ImageBase);

        String Archivo = RutaAudios + "Colores/Red.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblRojoMouseClicked

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
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAmarillo;
    private javax.swing.JLabel lblAzul;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblColores;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMorado;
    private javax.swing.JLabel lblNaranja;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblRojo;
    private javax.swing.JLabel lblRosa;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblTodo;
    private javax.swing.JLabel lblVerde;
    // End of variables declaration//GEN-END:variables
}
