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
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author Dee Dee Gtz
 */
public class Adjetivos extends javax.swing.JFrame {
        String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
        String RutaAudios = "C:/Time 2 Learn/src/Audios/Adjetivos/";
    
    public Adjetivos() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Adjetives");        
        
        
        //Imagen Choose
        ImageIcon Choose = new ImageIcon(RutaImagenes + "Adjetivos2.png");
        Icon ImageChoose = new ImageIcon(Choose.getImage().getScaledInstance(lblAdjetivos.getWidth(), lblAdjetivos.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivos.setIcon(ImageChoose);
        
        //Imagen Leon
        ImageIcon Leon = new ImageIcon(RutaImagenes + "Adjetivos_Alto2.png");
        Icon ImageLeon = new ImageIcon(Leon.getImage().getScaledInstance(lblAlto.getWidth(), lblAlto.getHeight(), Image.SCALE_DEFAULT));
        lblAlto.setIcon(ImageLeon);
        
        //Imagen Gato
        ImageIcon Gato = new ImageIcon(RutaImagenes + "Adjetivos_Corto2.png");
        Icon ImageGato = new ImageIcon(Gato.getImage().getScaledInstance(lblBajo.getWidth(), lblBajo.getHeight(), Image.SCALE_DEFAULT));
        lblBajo.setIcon(ImageGato);
        
        //Imagen Perro
        ImageIcon Perro = new ImageIcon(RutaImagenes + "Adjetivos_Joven2.png");
        Icon ImagePerro = new ImageIcon(Perro.getImage().getScaledInstance(lblJoven.getWidth(), lblJoven.getHeight(), Image.SCALE_DEFAULT));
        lblJoven.setIcon(ImagePerro);
        
        //Imagen Vaca
        ImageIcon Vaca = new ImageIcon(RutaImagenes + "Adjetivos_Viejo2.png");
        Icon ImageVaca = new ImageIcon(Vaca.getImage().getScaledInstance(lblViejo.getWidth(), lblViejo.getHeight(), Image.SCALE_DEFAULT));
        lblViejo.setIcon(ImageVaca);
        
        //Imagen Elefante
        ImageIcon Elefante = new ImageIcon(RutaImagenes + "Adjetivos_Sucio2.png");
        Icon ImageElefante = new ImageIcon(Elefante.getImage().getScaledInstance(lblSucio.getWidth(), lblSucio.getHeight(), Image.SCALE_DEFAULT));
        lblSucio.setIcon(ImageElefante);
        
        //Imagen Pez
        ImageIcon Pez = new ImageIcon(RutaImagenes + "Adjetivos_Limpio2.png");
        Icon ImagePez = new ImageIcon(Pez.getImage().getScaledInstance(lblLimpio.getWidth(), lblLimpio.getHeight(), Image.SCALE_DEFAULT));
        lblLimpio.setIcon(ImagePez);
        
        //Imagen Pajaro
        ImageIcon Pajaro = new ImageIcon(RutaImagenes + "Adjetivos_Grande2.png");
        Icon ImagePajaro = new ImageIcon(Pajaro.getImage().getScaledInstance(lblGrande.getWidth(), lblGrande.getHeight(), Image.SCALE_DEFAULT));
        lblGrande.setIcon(ImagePajaro);
        
        //Imagen Cerdo
        ImageIcon Cerdo = new ImageIcon(RutaImagenes + "Adjetivos_Rapido2.png");
        Icon ImageCerdo = new ImageIcon(Cerdo.getImage().getScaledInstance(lblRapido.getWidth(), lblRapido.getHeight(), Image.SCALE_DEFAULT));
        lblRapido.setIcon(ImageCerdo);
        
        //Imagen Mono
        ImageIcon Mono = new ImageIcon(RutaImagenes + "Adjetivos_Lento2.png");
        Icon ImageMono = new ImageIcon(Mono.getImage().getScaledInstance(lblLento.getWidth(), lblLento.getHeight(), Image.SCALE_DEFAULT));
        lblLento.setIcon(ImageMono);
        
        //Imagen Serpiente
        ImageIcon Serpiente = new ImageIcon(RutaImagenes + "Adjetivos_Caliente2.png");
        Icon ImageSerpiente = new ImageIcon(Serpiente.getImage().getScaledInstance(lblCaliente.getWidth(), lblCaliente.getHeight(), Image.SCALE_DEFAULT));
        lblCaliente.setIcon(ImageSerpiente);
        
        //Imagen Oveja
        ImageIcon Oveja = new ImageIcon(RutaImagenes + "Adjetivos_Frio2.png");
        Icon ImageOveja = new ImageIcon(Oveja.getImage().getScaledInstance(lblFrio.getWidth(), lblFrio.getHeight(), Image.SCALE_DEFAULT));
        lblFrio.setIcon(ImageOveja);
        
        //Imagen Jirafa
        ImageIcon Jirafa = new ImageIcon(RutaImagenes + "Adjetivos_Feliz2.png");
        Icon ImageJirafa = new ImageIcon(Jirafa.getImage().getScaledInstance(lblFeliz.getWidth(), lblFeliz.getHeight(), Image.SCALE_DEFAULT));
        lblFeliz.setIcon(ImageJirafa);
        
        //Imagen Pulpo
        ImageIcon Pulpo = new ImageIcon(RutaImagenes + "Adjetivos_Triste2.png");
        Icon ImagePulpo = new ImageIcon(Pulpo.getImage().getScaledInstance(lblTriste.getWidth(), lblTriste.getHeight(), Image.SCALE_DEFAULT));
        lblTriste.setIcon(ImagePulpo);
        
        //Imagen Tigre
        ImageIcon Tigre = new ImageIcon(RutaImagenes + "Adjetivos_Malo2.png");
        Icon ImageTigre = new ImageIcon(Tigre.getImage().getScaledInstance(lblMalo.getWidth(), lblMalo.getHeight(), Image.SCALE_DEFAULT));
        lblMalo.setIcon(ImageTigre);
        
        //Imagen Ballena
        ImageIcon Ballena = new ImageIcon(RutaImagenes + "Adjetivos_Bueno2.png");
        Icon ImageBallena = new ImageIcon(Ballena.getImage().getScaledInstance(lblBueno.getWidth(), lblBueno.getHeight(), Image.SCALE_DEFAULT));
        lblBueno.setIcon(ImageBallena);
        
        //Imagen Pequeño
        ImageIcon Pequeño = new ImageIcon(RutaImagenes + "Adjetivos_Pequeño2.png");
        Icon ImagePequeño = new ImageIcon(Pequeño.getImage().getScaledInstance(lblPequeño.getWidth(), lblPequeño.getHeight(), Image.SCALE_DEFAULT));
        lblPequeño.setIcon(ImagePequeño);
        
        //Imagen Gordo
        ImageIcon Gordo = new ImageIcon(RutaImagenes + "Adjetivos_Gordo2.png");
        Icon ImageGordo = new ImageIcon(Gordo.getImage().getScaledInstance(lblGordo.getWidth(), lblGordo.getHeight(), Image.SCALE_DEFAULT));
        lblGordo.setIcon(ImageGordo);
        
        //Imagen Delgado
        ImageIcon Delgado = new ImageIcon(RutaImagenes + "Adjetivos_Delgado2.png");
        Icon ImageDelgado = new ImageIcon(Delgado.getImage().getScaledInstance(lblDelgado.getWidth(), lblDelgado.getHeight(), Image.SCALE_DEFAULT));
        lblDelgado.setIcon(ImageDelgado);
        
        ImageIcon Menu = new ImageIcon(RutaImagenes + "Icono_Menu.png");
        Icon ImageMenu = new ImageIcon(Menu.getImage().getScaledInstance(lblMenu.getWidth(), lblMenu.getHeight(), Image.SCALE_DEFAULT));
        lblMenu.setIcon(ImageMenu);
        
        ImageIcon Mando = new ImageIcon(RutaImagenes + "Mando2.png");
        Icon ImageMando = new ImageIcon(Mando.getImage().getScaledInstance(lblMando.getWidth(), lblMando.getHeight(), Image.SCALE_DEFAULT));
        lblMando.setIcon(ImageMando);
        
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
        lblAlto = new javax.swing.JLabel();
        lblBajo = new javax.swing.JLabel();
        lblJoven = new javax.swing.JLabel();
        lblViejo = new javax.swing.JLabel();
        lblSucio = new javax.swing.JLabel();
        lblLimpio = new javax.swing.JLabel();
        lblRapido = new javax.swing.JLabel();
        lblLento = new javax.swing.JLabel();
        lblCaliente = new javax.swing.JLabel();
        lblFrio = new javax.swing.JLabel();
        lblFeliz = new javax.swing.JLabel();
        lblTriste = new javax.swing.JLabel();
        lblMalo = new javax.swing.JLabel();
        lblBueno = new javax.swing.JLabel();
        lblGrande = new javax.swing.JLabel();
        lblPequeño = new javax.swing.JLabel();
        lblGordo = new javax.swing.JLabel();
        lblDelgado = new javax.swing.JLabel();
        lblAdjetivos = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblMando = new javax.swing.JLabel();
        lblAdjetivo = new javax.swing.JLabel();

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mensaje_Salir.png"))); // NOI18N
        Dialogo.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblAlto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAlto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAltoMouseClicked(evt);
            }
        });

        lblBajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBajoMouseClicked(evt);
            }
        });

        lblJoven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJoven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJovenMouseClicked(evt);
            }
        });

        lblViejo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViejo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViejoMouseClicked(evt);
            }
        });

        lblSucio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSucio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSucioMouseClicked(evt);
            }
        });

        lblLimpio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLimpio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpioMouseClicked(evt);
            }
        });

        lblRapido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRapido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRapidoMouseClicked(evt);
            }
        });

        lblLento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLentoMouseClicked(evt);
            }
        });

        lblCaliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCaliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCalienteMouseClicked(evt);
            }
        });

        lblFrio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFrio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFrioMouseClicked(evt);
            }
        });

        lblFeliz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFeliz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFelizMouseClicked(evt);
            }
        });

        lblTriste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTriste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTristeMouseClicked(evt);
            }
        });

        lblMalo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaloMouseClicked(evt);
            }
        });

        lblBueno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBueno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuenoMouseClicked(evt);
            }
        });

        lblGrande.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGrandeMouseClicked(evt);
            }
        });
        lblGrande.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblGrandeKeyPressed(evt);
            }
        });

        lblPequeño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPequeño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPequeñoMouseClicked(evt);
            }
        });

        lblGordo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGordo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGordoMouseClicked(evt);
            }
        });

        lblDelgado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDelgado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDelgadoMouseClicked(evt);
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

        lblMando.setText("Mando");
        lblMando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMandoMouseClicked(evt);
            }
        });

        lblAdjetivo.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblAdjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdjetivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblLimpio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblFrio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblCaliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblLento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblJoven, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblViejo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblSucio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFeliz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lblGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblBueno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(lblTriste, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(lblMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAdjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDelgado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblGordo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblMando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307)
                        .addComponent(lblAdjetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdjetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSucio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblViejo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJoven, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCaliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFrio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLimpio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTriste, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBueno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFeliz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblGordo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblDelgado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(lblAdjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAltoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAltoMouseClicked
        String Archivo = RutaAudios + "Alto.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
        //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Alto.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblAltoMouseClicked

    private void lblBajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBajoMouseClicked
        String Archivo = RutaAudios + "Bajo.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
        //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Corto.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblBajoMouseClicked

    private void lblJovenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJovenMouseClicked
        String Archivo = RutaAudios + "Joven.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
         //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Joven.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblJovenMouseClicked

    private void lblViejoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViejoMouseClicked
        String Archivo = RutaAudios + "Viejo.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
         //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Viejo.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblViejoMouseClicked

    private void lblSucioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSucioMouseClicked
        String Archivo = RutaAudios + "Sucio.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
         //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Sucio.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblSucioMouseClicked

    private void lblLimpioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpioMouseClicked
        String Archivo = RutaAudios + "Limpio.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
         //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Limpio.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblLimpioMouseClicked

    private void lblRapidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRapidoMouseClicked
        String Archivo = RutaAudios + "Rapido.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
        //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Rapido.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblRapidoMouseClicked

    private void lblLentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLentoMouseClicked
        String Archivo = RutaAudios + "Lento.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
        //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Lento.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblLentoMouseClicked

    private void lblCalienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCalienteMouseClicked
        String Archivo = RutaAudios + "Caliente.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
        //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Caliente.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblCalienteMouseClicked

    private void lblFrioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFrioMouseClicked
        String Archivo = RutaAudios + "Frio.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
                //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Frio.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblFrioMouseClicked

    private void lblFelizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFelizMouseClicked
        String Archivo = RutaAudios + "Feliz.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
        //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Feliz.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblFelizMouseClicked

    private void lblTristeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTristeMouseClicked
        String Archivo = RutaAudios + "Triste.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
                //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Triste.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblTristeMouseClicked

    private void lblMaloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaloMouseClicked
        String Archivo = RutaAudios + "Malo.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
                //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Malo.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblMaloMouseClicked

    private void lblBuenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuenoMouseClicked
        String Archivo = RutaAudios + "Bueno.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
                //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Bueno.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblBuenoMouseClicked

    private void lblGrandeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblGrandeKeyPressed
    }//GEN-LAST:event_lblGrandeKeyPressed

    private void lblGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGrandeMouseClicked
        String Archivo = RutaAudios + "Grande.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
                //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Grande.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblGrandeMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Intermedio D = new Intermedio();
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

    private void lblMandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMandoMouseClicked
        Adjetivos_Game1 a = new Adjetivos_Game1();
        a.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblMandoMouseClicked

    private void lblPequeñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPequeñoMouseClicked
        String Archivo = RutaAudios + "Pequeño.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
        //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Pequeño.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblPequeñoMouseClicked

    private void lblGordoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGordoMouseClicked
        String Archivo = RutaAudios + "Gordo.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
               //Imagen del Adjetivo
               
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Gordo.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblGordoMouseClicked

    private void lblDelgadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDelgadoMouseClicked
        String Archivo = RutaAudios + "Delgado.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
        
        //Imagen del Adjetivo
        ImageIcon Adjetivo = new ImageIcon(RutaImagenes + "Adjetivos_Delgado.png");
        Icon ImageAdjetivo = new ImageIcon(Adjetivo.getImage().getScaledInstance(lblAdjetivo.getWidth(), lblAdjetivo.getHeight(), Image.SCALE_DEFAULT));
        lblAdjetivo.setIcon(ImageAdjetivo);
    }//GEN-LAST:event_lblDelgadoMouseClicked

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
            java.util.logging.Logger.getLogger(Adjetivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adjetivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adjetivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adjetivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Adjetivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdjetivo;
    private javax.swing.JLabel lblAdjetivos;
    private javax.swing.JLabel lblAlto;
    private javax.swing.JLabel lblBajo;
    private javax.swing.JLabel lblBueno;
    private javax.swing.JLabel lblCaliente;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDelgado;
    private javax.swing.JLabel lblFeliz;
    private javax.swing.JLabel lblFrio;
    private javax.swing.JLabel lblGordo;
    private javax.swing.JLabel lblGrande;
    private javax.swing.JLabel lblJoven;
    private javax.swing.JLabel lblLento;
    private javax.swing.JLabel lblLimpio;
    private javax.swing.JLabel lblMalo;
    private javax.swing.JLabel lblMando;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPequeño;
    private javax.swing.JLabel lblRapido;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblSucio;
    private javax.swing.JLabel lblTriste;
    private javax.swing.JLabel lblViejo;
    // End of variables declaration//GEN-END:variables
}
