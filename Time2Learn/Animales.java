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
import javax.swing.JOptionPane;

/**
 *
 * @author Susy
 */
public class Animales extends javax.swing.JFrame {

    /**
     * Creates new form Animales1
     */
    public Animales() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Animals");        
        
        String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
        
        //Imagen Choose
        ImageIcon Choose = new ImageIcon(RutaImagenes + "Choose.png");
        Icon ImageChoose = new ImageIcon(Choose.getImage().getScaledInstance(lblChoose.getWidth(), lblChoose.getHeight(), Image.SCALE_DEFAULT));
        lblChoose.setIcon(ImageChoose);
        
        //Imagen Leon
        ImageIcon Leon = new ImageIcon(RutaImagenes + "Animales_Leon1.png");
        Icon ImageLeon = new ImageIcon(Leon.getImage().getScaledInstance(lblLeon.getWidth(), lblLeon.getHeight(), Image.SCALE_DEFAULT));
        lblLeon.setIcon(ImageLeon);
        
        //Imagen Gato
        ImageIcon Gato = new ImageIcon(RutaImagenes + "Animales_Gato1.png");
        Icon ImageGato = new ImageIcon(Gato.getImage().getScaledInstance(lblGato.getWidth(), lblGato.getHeight(), Image.SCALE_DEFAULT));
        lblGato.setIcon(ImageGato);
        
        //Imagen Perro
        ImageIcon Perro = new ImageIcon(RutaImagenes + "Animales_Perro1.png");
        Icon ImagePerro = new ImageIcon(Perro.getImage().getScaledInstance(lblPerro.getWidth(), lblPerro.getHeight(), Image.SCALE_DEFAULT));
        lblPerro.setIcon(ImagePerro);
        
        //Imagen Vaca
        ImageIcon Vaca = new ImageIcon(RutaImagenes + "Animales_Vaca1.png");
        Icon ImageVaca = new ImageIcon(Vaca.getImage().getScaledInstance(lblVaca.getWidth(), lblVaca.getHeight(), Image.SCALE_DEFAULT));
        lblVaca.setIcon(ImageVaca);
        
        //Imagen Elefante
        ImageIcon Elefante = new ImageIcon(RutaImagenes + "Animales_Elefante1.png");
        Icon ImageElefante = new ImageIcon(Elefante.getImage().getScaledInstance(lblElefante.getWidth(), lblElefante.getHeight(), Image.SCALE_DEFAULT));
        lblElefante.setIcon(ImageElefante);
        
        //Imagen Pez
        ImageIcon Pez = new ImageIcon(RutaImagenes + "Animales_Pez1.png");
        Icon ImagePez = new ImageIcon(Pez.getImage().getScaledInstance(lblPez.getWidth(), lblPez.getHeight(), Image.SCALE_DEFAULT));
        lblPez.setIcon(ImagePez);
        
        //Imagen Pajaro
        ImageIcon Pajaro = new ImageIcon(RutaImagenes + "Animales_Pajaro1.png");
        Icon ImagePajaro = new ImageIcon(Pajaro.getImage().getScaledInstance(lblPajaro.getWidth(), lblPajaro.getHeight(), Image.SCALE_DEFAULT));
        lblPajaro.setIcon(ImagePajaro);
        
        //Imagen Cerdo
        ImageIcon Cerdo = new ImageIcon(RutaImagenes + "Animales_Cerdo1.png");
        Icon ImageCerdo = new ImageIcon(Cerdo.getImage().getScaledInstance(lblCerdo.getWidth(), lblCerdo.getHeight(), Image.SCALE_DEFAULT));
        lblCerdo.setIcon(ImageCerdo);
        
        //Imagen Mono
        ImageIcon Mono = new ImageIcon(RutaImagenes + "Animales_Mono1.png");
        Icon ImageMono = new ImageIcon(Mono.getImage().getScaledInstance(lblMono.getWidth(), lblMono.getHeight(), Image.SCALE_DEFAULT));
        lblMono.setIcon(ImageMono);
        
        //Imagen Serpiente
        ImageIcon Serpiente = new ImageIcon(RutaImagenes + "Animales_Serpiente1.png");
        Icon ImageSerpiente = new ImageIcon(Serpiente.getImage().getScaledInstance(lblSerpiente.getWidth(), lblSerpiente.getHeight(), Image.SCALE_DEFAULT));
        lblSerpiente.setIcon(ImageSerpiente);
        
        //Imagen Oveja
        ImageIcon Oveja = new ImageIcon(RutaImagenes + "Animales_Oveja1.png");
        Icon ImageOveja = new ImageIcon(Oveja.getImage().getScaledInstance(lblOveja.getWidth(), lblOveja.getHeight(), Image.SCALE_DEFAULT));
        lblOveja.setIcon(ImageOveja);
        
        //Imagen Jirafa
        ImageIcon Jirafa = new ImageIcon(RutaImagenes + "Animales_Jirafa1.png");
        Icon ImageJirafa = new ImageIcon(Jirafa.getImage().getScaledInstance(lblJirafa.getWidth(), lblJirafa.getHeight(), Image.SCALE_DEFAULT));
        lblJirafa.setIcon(ImageJirafa);
        
        //Imagen Lobo
        ImageIcon Lobo = new ImageIcon(RutaImagenes + "Animales_Lobo1.png");
        Icon ImageLobo = new ImageIcon(Lobo.getImage().getScaledInstance(lblLobo.getWidth(), lblLobo.getHeight(), Image.SCALE_DEFAULT));
        lblLobo.setIcon(ImageLobo);
        
        //Imagen Tigre
        ImageIcon Tigre = new ImageIcon(RutaImagenes + "Animales_Tigre1.png");
        Icon ImageTigre = new ImageIcon(Tigre.getImage().getScaledInstance(lblTigre.getWidth(), lblTigre.getHeight(), Image.SCALE_DEFAULT));
        lblTigre.setIcon(ImageTigre);
        
        //Imagen Ballena
        ImageIcon Ballena = new ImageIcon(RutaImagenes + "Animales_Ballena1.png");
        Icon ImageBallena = new ImageIcon(Ballena.getImage().getScaledInstance(lblBallena.getWidth(), lblBallena.getHeight(), Image.SCALE_DEFAULT));
        lblBallena.setIcon(ImageBallena);
        
        //Imagen Tortuga
        ImageIcon Tortuga = new ImageIcon(RutaImagenes + "Animales_Tortuga1.png");
        Icon ImageTortuga = new ImageIcon(Tortuga.getImage().getScaledInstance(lblTortuga.getWidth(), lblTortuga.getHeight(), Image.SCALE_DEFAULT));
        lblTortuga.setIcon(ImageTortuga);
        
        //Imagen Abeja
        ImageIcon Abeja = new ImageIcon(RutaImagenes + "Animales_Abeja1.png");
        Icon ImageAbeja = new ImageIcon(Abeja.getImage().getScaledInstance(lblAbeja.getWidth(), lblAbeja.getHeight(), Image.SCALE_DEFAULT));
        lblAbeja.setIcon(ImageAbeja);
        
        //Imagen Oso
        ImageIcon Oso = new ImageIcon(RutaImagenes + "Animales_Oso1.png");
        Icon ImageOso = new ImageIcon(Oso.getImage().getScaledInstance(lblOso.getWidth(), lblOso.getHeight(), Image.SCALE_DEFAULT));
        lblOso.setIcon(ImageOso);
        
        //Imagen Gallo
        ImageIcon Gallo = new ImageIcon(RutaImagenes + "Animales_Gallo1.png");
        Icon ImageGallo = new ImageIcon(Gallo.getImage().getScaledInstance(lblGallo.getWidth(), lblGallo.getHeight(), Image.SCALE_DEFAULT));
        lblGallo.setIcon(ImageGallo);
        
        //Imagen Raton
        ImageIcon Raton = new ImageIcon(RutaImagenes + "Animales_Raton1.png");
        Icon ImageRaton = new ImageIcon(Raton.getImage().getScaledInstance(lblRaton.getWidth(), lblRaton.getHeight(), Image.SCALE_DEFAULT));
        lblRaton.setIcon(ImageRaton);
        
        //Imagen Pato
        ImageIcon Pato = new ImageIcon(RutaImagenes + "Animales_Pato1.png");
        Icon ImagePato = new ImageIcon(Pato.getImage().getScaledInstance(lblPato.getWidth(), lblPato.getHeight(), Image.SCALE_DEFAULT));
        lblPato.setIcon(ImagePato);
        
        //Imagen Conejo
        ImageIcon Conejo = new ImageIcon(RutaImagenes + "Animales_Conejo1.png");
        Icon ImageConejo = new ImageIcon(Conejo.getImage().getScaledInstance(lblConejo.getWidth(), lblConejo.getHeight(), Image.SCALE_DEFAULT));
        lblConejo.setIcon(ImageConejo);
        
        //Imagen Caballo
        ImageIcon Caballo = new ImageIcon(RutaImagenes + "Animales_Caballo1.png");
        Icon ImageCaballo = new ImageIcon(Caballo.getImage().getScaledInstance(lblCaballo.getWidth(), lblCaballo.getHeight(), Image.SCALE_DEFAULT));
        lblCaballo.setIcon(ImageCaballo);
        
        //Imagen Rana
        ImageIcon Rana = new ImageIcon(RutaImagenes + "Animales_Rana1.png");
        Icon ImageRana = new ImageIcon(Rana.getImage().getScaledInstance(lblRana.getWidth(), lblRana.getHeight(), Image.SCALE_DEFAULT));
        lblRana.setIcon(ImageRana);
        
        ImageIcon Menu = new ImageIcon(RutaImagenes + "Icono_Menu.png");
        Icon ImageMenu = new ImageIcon(Menu.getImage().getScaledInstance(lblMenu.getWidth(), lblMenu.getHeight(), Image.SCALE_DEFAULT));
        lblMenu.setIcon(ImageMenu);
        
        ImageIcon Mando = new ImageIcon(RutaImagenes + "/Mando.png");
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
        lblGato = new javax.swing.JLabel();
        lblPerro = new javax.swing.JLabel();
        lblVaca = new javax.swing.JLabel();
        lblElefante = new javax.swing.JLabel();
        lblPez = new javax.swing.JLabel();
        lblCerdo = new javax.swing.JLabel();
        lblMono = new javax.swing.JLabel();
        lblSerpiente = new javax.swing.JLabel();
        lblOveja = new javax.swing.JLabel();
        lblJirafa = new javax.swing.JLabel();
        lblLobo = new javax.swing.JLabel();
        lblTigre = new javax.swing.JLabel();
        lblBallena = new javax.swing.JLabel();
        lblPajaro = new javax.swing.JLabel();
        lblTortuga = new javax.swing.JLabel();
        lblAbeja = new javax.swing.JLabel();
        lblOso = new javax.swing.JLabel();
        lblGallo = new javax.swing.JLabel();
        lblRaton = new javax.swing.JLabel();
        lblPato = new javax.swing.JLabel();
        lblConejo = new javax.swing.JLabel();
        lblRana = new javax.swing.JLabel();
        lblCaballo = new javax.swing.JLabel();
        lblChoose = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblMando = new javax.swing.JLabel();

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

        lblVaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVacaMouseClicked(evt);
            }
        });

        lblElefante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblElefante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElefanteMouseClicked(evt);
            }
        });

        lblPez.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPez.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPezMouseClicked(evt);
            }
        });

        lblCerdo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerdoMouseClicked(evt);
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

        lblOveja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOveja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOvejaMouseClicked(evt);
            }
        });

        lblJirafa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJirafa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJirafaMouseClicked(evt);
            }
        });

        lblLobo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLobo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoboMouseClicked(evt);
            }
        });

        lblTigre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTigre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTigreMouseClicked(evt);
            }
        });

        lblBallena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBallena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBallenaMouseClicked(evt);
            }
        });

        lblPajaro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPajaro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPajaroMouseClicked(evt);
            }
        });
        lblPajaro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblPajaroKeyPressed(evt);
            }
        });

        lblTortuga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTortuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTortugaMouseClicked(evt);
            }
        });

        lblAbeja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAbeja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAbejaMouseClicked(evt);
            }
        });

        lblOso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOsoMouseClicked(evt);
            }
        });

        lblGallo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGallo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGalloMouseClicked(evt);
            }
        });

        lblRaton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRaton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRatonMouseClicked(evt);
            }
        });

        lblPato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPatoMouseClicked(evt);
            }
        });

        lblConejo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConejo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConejoMouseClicked(evt);
            }
        });

        lblRana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRanaMouseClicked(evt);
            }
        });

        lblCaballo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCaballo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCaballoMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272)
                        .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPez, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lblOveja, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lblSerpiente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lblCerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lblMono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblLeon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lblGato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lblPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lblVaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(lblElefante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblJirafa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRana, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCaballo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblPato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblRaton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblPajaro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblBallena, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblLobo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(lblTigre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblOso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGallo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTortuga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAbeja, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(446, 446, 446))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblElefante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLeon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSerpiente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOveja, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPez, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTigre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLobo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBallena, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPajaro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJirafa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblTortuga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblAbeja, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblOso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRana, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGallo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCaballo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLeonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeonMouseClicked
        Animales_Leon L = new Animales_Leon();
        L.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblLeonMouseClicked

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

    private void lblVacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVacaMouseClicked
        Animales_Vaca V = new Animales_Vaca();
        V.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblVacaMouseClicked

    private void lblElefanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElefanteMouseClicked
        Animales_Elefante E = new Animales_Elefante();
        E.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblElefanteMouseClicked

    private void lblPezMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPezMouseClicked
        Animales_Pez P = new Animales_Pez();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblPezMouseClicked

    private void lblCerdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerdoMouseClicked
        Animales_Cerdo C = new Animales_Cerdo();
        C.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblCerdoMouseClicked

    private void lblMonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMonoMouseClicked
        Animales_Mono M = new Animales_Mono();
        M.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblMonoMouseClicked

    private void lblSerpienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSerpienteMouseClicked
        Animales_Serpiente S = new Animales_Serpiente();
        S.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblSerpienteMouseClicked

    private void lblOvejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOvejaMouseClicked
        Animales_Oveja O = new Animales_Oveja();
        O.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblOvejaMouseClicked

    private void lblJirafaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJirafaMouseClicked
        Animales_Jirafa J = new Animales_Jirafa();
        J.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblJirafaMouseClicked

    private void lblLoboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoboMouseClicked
        Animales_Lobo P = new Animales_Lobo();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblLoboMouseClicked

    private void lblTigreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTigreMouseClicked
        Animales_Tigre T = new Animales_Tigre();
        T.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblTigreMouseClicked

    private void lblBallenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBallenaMouseClicked
        Animales_Ballena B = new Animales_Ballena();
        B.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblBallenaMouseClicked

    private void lblPajaroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPajaroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPajaroKeyPressed

    private void lblPajaroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPajaroMouseClicked
        Animales_Pajaro P = new Animales_Pajaro();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblPajaroMouseClicked

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

    private void lblMandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMandoMouseClicked
        Animales_Juego1 a = new Animales_Juego1();
        a.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblMandoMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

    private void lblTortugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTortugaMouseClicked
        Animales_Tortuga A = new Animales_Tortuga();
        A.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblTortugaMouseClicked

    private void lblAbejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAbejaMouseClicked
        Animales_Abeja A = new Animales_Abeja();
        A.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblAbejaMouseClicked

    private void lblOsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOsoMouseClicked
        Animales_Oso O = new Animales_Oso();
        O.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblOsoMouseClicked

    private void lblGalloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGalloMouseClicked
        Animales_Gallo G = new Animales_Gallo();
        G.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblGalloMouseClicked

    private void lblRatonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRatonMouseClicked
        Animales_Raton R = new Animales_Raton();
        R.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblRatonMouseClicked

    private void lblPatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatoMouseClicked
        Animales_Pato P = new Animales_Pato();
        P.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblPatoMouseClicked

    private void lblConejoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConejoMouseClicked
        Animales_Conejo C = new Animales_Conejo();
        C.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblConejoMouseClicked

    private void lblRanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRanaMouseClicked
        Animales_Rana R = new Animales_Rana();
        R.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblRanaMouseClicked

    private void lblCaballoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCaballoMouseClicked
        Animales_Caballo C = new Animales_Caballo();
        C.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblCaballoMouseClicked

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
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbeja;
    private javax.swing.JLabel lblBallena;
    private javax.swing.JLabel lblCaballo;
    private javax.swing.JLabel lblCerdo;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblConejo;
    private javax.swing.JLabel lblElefante;
    private javax.swing.JLabel lblGallo;
    private javax.swing.JLabel lblGato;
    private javax.swing.JLabel lblJirafa;
    private javax.swing.JLabel lblLeon;
    private javax.swing.JLabel lblLobo;
    private javax.swing.JLabel lblMando;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMono;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblOso;
    private javax.swing.JLabel lblOveja;
    private javax.swing.JLabel lblPajaro;
    private javax.swing.JLabel lblPato;
    private javax.swing.JLabel lblPerro;
    private javax.swing.JLabel lblPez;
    private javax.swing.JLabel lblRana;
    private javax.swing.JLabel lblRaton;
    private javax.swing.JLabel lblSerpiente;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblTigre;
    private javax.swing.JLabel lblTortuga;
    private javax.swing.JLabel lblVaca;
    // End of variables declaration//GEN-END:variables
}
