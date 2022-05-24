/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time2Learn;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dee Dee Gtz
 */
public class Animales_Juego7 extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    
    public Animales_Juego7() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Juego Animales");  
        
        lblSiguiente.setVisible(false);
        
        //Imagen Mono
        ImageIcon Mono = new ImageIcon(RutaImagenes + "Animales_Tortuga1.png");
        Icon ImageMono = new ImageIcon(Mono.getImage().getScaledInstance(lblMono.getWidth(), lblMono.getHeight(), Image.SCALE_DEFAULT));
        lblMono.setIcon(ImageMono);
        
        //Imagen Paisaje1
        ImageIcon Paisaje1 = new ImageIcon(RutaImagenes + "Paisajes_Granja.jpg");
        Icon ImagePaisaje1 = new ImageIcon(Paisaje1.getImage().getScaledInstance(lblPaisaje1.getWidth(), lblPaisaje1.getHeight(), Image.SCALE_DEFAULT));
        lblPaisaje1.setIcon(ImagePaisaje1);
        
        //Imagen Paisaje2
        ImageIcon Paisaje2 = new ImageIcon(RutaImagenes + "Paisajes_Casa.jpg");
        Icon ImagePaisaje2 = new ImageIcon(Paisaje2.getImage().getScaledInstance(lblPaisaje2.getWidth(), lblPaisaje2.getHeight(), Image.SCALE_DEFAULT));
        lblPaisaje2.setIcon(ImagePaisaje2);
        
        //Imagen Paisaje3
        ImageIcon Paisaje3 = new ImageIcon(RutaImagenes + "Paisajes_Mar.jpg");
        Icon ImagePaisaje3 = new ImageIcon(Paisaje3.getImage().getScaledInstance(lblPaisaje3.getWidth(), lblPaisaje3.getHeight(), Image.SCALE_DEFAULT));
        lblPaisaje3.setIcon(ImagePaisaje3);
        
        //Imagen Paisaje4
        ImageIcon Paisaje4 = new ImageIcon(RutaImagenes + "Paisajes_Bosque.jpg");
        Icon ImagePaisaje4 = new ImageIcon(Paisaje4.getImage().getScaledInstance(lblPaisaje4.getWidth(), lblPaisaje4.getHeight(), Image.SCALE_DEFAULT));
        lblPaisaje4.setIcon(ImagePaisaje4);
        
        ImageIcon Siguiente = new ImageIcon(RutaImagenes + "Icono_Siguiente.png");
        Icon ImageSiguiente = new ImageIcon(Siguiente.getImage().getScaledInstance(lblSiguiente.getWidth(), lblSiguiente.getHeight(), Image.SCALE_DEFAULT));
        lblSiguiente.setIcon(ImageSiguiente);
        
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
    
    void Incorrecto (){
        Incorrect.setSize(300, 120);
        Incorrect.setLocationRelativeTo(null);
        Incorrect.setVisible(true);
        Incorrect.setBackground(new Color (0, 0, 0, 0));
    }
    
    void Correcto (){
        
        String SQL;
        Conexion mibasededatos = new Conexion();
        Connection con=mibasededatos.getConnection();
        Statement st;
        
        Registro v = new Registro();
             //UPDATE `puntaje` SET `Animales` = '1' WHERE `puntaje`.`Nombre` = 'Usuario2'

        SQL = "UPDATE `puntaje` SET `Animales` = '" + 7 + "' WHERE `puntaje`.`Nombre` = '" + v.Nombre + "'";  
        
        try {
            st = con.createStatement();
            st.executeUpdate(SQL);
            con.close();
            st.close();
           //System.out.println("Insertado con exito");
           ImageIcon Mensaje3 = new ImageIcon(RutaImagenes + "Carita.png");
           Icon ImageMensaje3 = new ImageIcon(Mensaje3.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
           JOptionPane.showMessageDialog(null, "Your progress has been uploaded " + v.Nombre, "Good!!", JOptionPane.INFORMATION_MESSAGE, ImageMensaje3);
                    
        }catch (SQLException e){
            
            System.out.println("Error en la conexion"+ SQL + "y el error es "+ e);
            JOptionPane.showMessageDialog(null, "Ha habido un error al subir su progreso " + v.Nombre + ". El error es "+ e );
        }
        
        ImageIcon Mensaje = new ImageIcon(RutaImagenes + "Correcto.png");
        Icon ImageMensaje = new ImageIcon(Mensaje.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
        
        Right.setSize(300, 120);
        Right.setLocationRelativeTo(null);
        Right.setVisible(true);
        Right.setBackground(new Color (0, 0, 0, 0));
        
        lblSiguiente.setVisible(true);
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
        Incorrect = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Right = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Congratulation = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMono = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblPaisaje1 = new javax.swing.JLabel();
        lblPaisaje2 = new javax.swing.JLabel();
        lblPaisaje3 = new javax.swing.JLabel();
        lblPaisaje4 = new javax.swing.JLabel();

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

        Incorrect.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Incorrect.setAlwaysOnTop(true);
        Incorrect.setModalExclusionType(null);
        Incorrect.setUndecorated(true);
        Incorrect.setResizable(false);
        Incorrect.setType(java.awt.Window.Type.POPUP);
        Incorrect.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IncorrectKeyPressed(evt);
            }
        });
        Incorrect.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Incorrect.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 84, 50, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Incorrect.png"))); // NOI18N
        Incorrect.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Right.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Right.setAlwaysOnTop(true);
        Right.setModalExclusionType(null);
        Right.setUndecorated(true);
        Right.setResizable(false);
        Right.setType(java.awt.Window.Type.POPUP);
        Right.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RightKeyPressed(evt);
            }
        });
        Right.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Right.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 84, 50, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Right.png"))); // NOI18N
        Right.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Congratulation.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Congratulation.setAlwaysOnTop(true);
        Congratulation.setModalExclusionType(null);
        Congratulation.setUndecorated(true);
        Congratulation.setResizable(false);
        Congratulation.setType(java.awt.Window.Type.POPUP);
        Congratulation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CongratulationKeyPressed(evt);
            }
        });
        Congratulation.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        Congratulation.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 50, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Congratulations.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        Congratulation.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 120));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMono.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblMonoMouseDragged(evt);
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

        lblSiguiente.setText("Siguiente");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });

        lblMenu.setText("Menu");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        lblPaisaje1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPaisaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPaisaje1MouseClicked(evt);
            }
        });

        lblPaisaje2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPaisaje2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPaisaje2MouseClicked(evt);
            }
        });

        lblPaisaje3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPaisaje3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPaisaje3MouseClicked(evt);
            }
        });

        lblPaisaje4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPaisaje4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPaisaje4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 240, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(lblMono, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 846, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaisaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaisaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaisaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaisaje4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblMono, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPaisaje4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaisaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaisaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaisaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(lblSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, 1730, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMonoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMonoMouseDragged
        /*
        int x = 0, y = 0;
        if (evt.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
            //lblMono.setText("(" + evt.getX() + "," + evt.getY() + ")");
            lblMono.setLocation(evt.getPoint());
            lblMono.repaint();
        }

        if(evt.getX() == 630 && evt.getY() == -110 || evt.getX() == 630 && evt.getY() == -109 || evt.getX() == 630 && evt.getY() == -108 || evt.getX() == 630 && evt.getY() == -107 || evt.getX() == 630 && evt.getY() == -106 || evt.getX() == 630 && evt.getY() == -105 || evt.getX() == 630 && evt.getY() == -104 || evt.getX() == 630 && evt.getY() == -103 || evt.getX() == 630 && evt.getY() == -102 || evt.getX() == 630 && evt.getY() == -101 || evt.getX() == 630 && evt.getY() == -100 || evt.getX() == 630 && evt.getY() == -99 || evt.getX() == 630 && evt.getY() == -98 || evt.getX() == 630 && evt.getY() == -97 || evt.getX() == 630 && evt.getY() == -96 || evt.getX() == 630 && evt.getY() == -95 || evt.getX() == 630 && evt.getY() == -94 || evt.getX() == 630 && evt.getY() == -93 || evt.getX() == 630 && evt.getY() == -92 || evt.getX() == 630 && evt.getY() == -91 || evt.getX() == 630 && evt.getY() == -90 || evt.getX() == 630 && evt.getY() == -89 || evt.getX() == 630 && evt.getY() == -88 || evt.getX() == 630 && evt.getY() == -87 || evt.getX() == 630 && evt.getY() == -86 || evt.getX() == 630 && evt.getY() == -85 || evt.getX() == 630 && evt.getY() == -84 || evt.getX() == 630 && evt.getY() == -83 || evt.getX() == 630 && evt.getY() == -82 || evt.getX() == 630 && evt.getY() == -81 || evt.getX() == 630 && evt.getY() == -80 || evt.getX() == 630 && evt.getY() == -79 || evt.getX() == 630 && evt.getY() == -78 || evt.getX() == 630 && evt.getY() == -77 || evt.getX() == 630 && evt.getY() == -76 || evt.getX() == 630 && evt.getY() == -75 || evt.getX() == 630 && evt.getY() == -74 || evt.getX() == 630 && evt.getY() == -73 || evt.getX() == 630 && evt.getY() == -72 || evt.getX() == 630 && evt.getY() == -71 || evt.getX() == 630 && evt.getY() == -70 || evt.getX() == 630 && evt.getY() == -69 || evt.getX() == 630 && evt.getY() == -68 || evt.getX() == 630 && evt.getY() == -67 || evt.getX() == 630 && evt.getY() == -66 || evt.getX() == 630 && evt.getY() == -65 || evt.getX() == 630 && evt.getY() == -64 || evt.getX() == 630 && evt.getY() == -63 || evt.getX() == 630 && evt.getY() == -62 || evt.getX() == 630 && evt.getY() == -61 || evt.getX() == 630 && evt.getY() == -60 || evt.getX() == 630 && evt.getY() == -59 || evt.getX() == 630 && evt.getY() == -58 || evt.getX() == 630 && evt.getY() == -57 || evt.getX() == 630 && evt.getY() == -56 || evt.getX() == 630 && evt.getY() == -55 || evt.getX() == 630 && evt.getY() == -54 || evt.getX() == 630 && evt.getY() == -53 || evt.getX() == 630 && evt.getY() == -52 || evt.getX() == 630 && evt.getY() == -51 || evt.getX() == 630 && evt.getY() == -50 || evt.getX() == 630 && evt.getY() == -49 || evt.getX() == 630 && evt.getY() == -48 || evt.getX() == 630 && evt.getY() == -47 || evt.getX() == 630 && evt.getY() == -46 || evt.getX() == 630 && evt.getY() == -45 || evt.getX() == 630 && evt.getY() == -44 || evt.getX() == 630 && evt.getY() == -43 || evt.getX() == 630 && evt.getY() == -42 || evt.getX() == 630 && evt.getY() == -41 || evt.getX() == 630 && evt.getY() == -40 || evt.getX() == 630 && evt.getY() == -39 || evt.getX() == 630 && evt.getY() == -38 || evt.getX() == 630 && evt.getY() == -37 || evt.getX() == 630 && evt.getY() == -36 || evt.getX() == 630 && evt.getY() == -35 || evt.getX() == 630 && evt.getY() == -34 || evt.getX() == 630 && evt.getY() == -33 || evt.getX() == 630 && evt.getY() == -32 || evt.getX() == 630 && evt.getY() == -31 || evt.getX() == 630 && evt.getY() == -30 || evt.getX() == 630 && evt.getY() == -29 || evt.getX() == 630 && evt.getY() == -28 || evt.getX() == 630 && evt.getY() == -27 || evt.getX() == 630 && evt.getY() == -26 || evt.getX() == 630 && evt.getY() == -25 || evt.getX() == 630 && evt.getY() == -24 || evt.getX() == 630 && evt.getY() == -23 || evt.getX() == 630 && evt.getY() == -22 || evt.getX() == 630 && evt.getY() == -21 || evt.getX() == 630 && evt.getY() == -20 || evt.getX() == 630 && evt.getY() == -19 || evt.getX() == 630 && evt.getY() == -18 || evt.getX() == 630 && evt.getY() == -17 || evt.getX() == 630 && evt.getY() == -16 || evt.getX() == 630 && evt.getY() == -15 || evt.getX() == 630 && evt.getY() == -14 || evt.getX() == 630 && evt.getY() == -13 || evt.getX() == 630 && evt.getY() == -12 || evt.getX() == 630 && evt.getY() == -11 || evt.getX() == 630 && evt.getY() == -10 || evt.getX() == 630 && evt.getY() == -9 || evt.getX() == 630 && evt.getY() == -8 || evt.getX() == 630 && evt.getY() == -7 || evt.getX() == 630 && evt.getY() == -6 || evt.getX() == 630 && evt.getY() == -5 || evt.getX() == 630 && evt.getY() == -4 || evt.getX() == 630 && evt.getY() == -3 || evt.getX() == 630 && evt.getY() == -2 || evt.getX() == 630 && evt.getY() == -1 || evt.getX() == 630 && evt.getY() == 0 || evt.getX() == 630 && evt.getY() == 1 || evt.getX() == 630 && evt.getY() == 2 || evt.getX() == 630 && evt.getY() == 3 || evt.getX() == 630 && evt.getY() == 4 || evt.getX() == 630 && evt.getY() == 5 || evt.getX() == 630 && evt.getY() == 6 || evt.getX() == 630 && evt.getY() == 7 || evt.getX() == 630 && evt.getY() == 8 || evt.getX() == 630 && evt.getY() == 9 || evt.getX() == 630 && evt.getY() == 10 || evt.getX() == 630 && evt.getY() == 11 || evt.getX() == 630 && evt.getY() == 12 || evt.getX() == 630 && evt.getY() == 13 || evt.getX() == 630 && evt.getY() == 14 || evt.getX() == 630 && evt.getY() == 15 || evt.getX() == 630 && evt.getY() == 16 || evt.getX() == 630 && evt.getY() == 17 || evt.getX() == 630 && evt.getY() == 18 || evt.getX() == 630 && evt.getY() == 19 || evt.getX() == 630 && evt.getY() == 20 || evt.getX() == 630 && evt.getY() == 21 || evt.getX() == 630 && evt.getY() == 22 || evt.getX() == 630 && evt.getY() == 23 || evt.getX() == 630 && evt.getY() == 24 || evt.getX() == 630 && evt.getY() == 25 || evt.getX() == 630 && evt.getY() == 26 || evt.getX() == 630 && evt.getY() == 27 || evt.getX() == 630 && evt.getY() == 28 || evt.getX() == 630 && evt.getY() == 29 || evt.getX() == 630 && evt.getY() == 30 || evt.getX() == 630 && evt.getY() == 31 || evt.getX() == 630 && evt.getY() == 32 || evt.getX() == 630 && evt.getY() == 33 || evt.getX() == 630 && evt.getY() == 34 || evt.getX() == 630 && evt.getY() == 35 || evt.getX() == 630 && evt.getY() == 36 || evt.getX() == 630 && evt.getY() == 37 || evt.getX() == 630 && evt.getY() == 38 || evt.getX() == 630 && evt.getY() == 39 || evt.getX() == 630 && evt.getY() == 40 || evt.getX() == 630 && evt.getY() == 41 || evt.getX() == 630 && evt.getY() == 42 || evt.getX() == 630 && evt.getY() == 43 || evt.getX() == 630 && evt.getY() == 44 || evt.getX() == 630 && evt.getY() == 45 || evt.getX() == 630 && evt.getY() == 46 || evt.getX() == 630 && evt.getY() == 47 || evt.getX() == 630 && evt.getY() == 48 || evt.getX() == 630 && evt.getY() == 49 || evt.getX() == 630 && evt.getY() == 50 || evt.getX() == 630 && evt.getY() == 51 || evt.getX() == 630 && evt.getY() == 52 || evt.getX() == 630 && evt.getY() == 53 || evt.getX() == 630 && evt.getY() == 54 || evt.getX() == 630 && evt.getY() == 55 || evt.getX() == 630 && evt.getY() == 56 || evt.getX() == 630 && evt.getY() == 57 || evt.getX() == 630 && evt.getY() == 58 || evt.getX() == 630 && evt.getY() == 59 || evt.getX() == 630 && evt.getY() == 60 || evt.getX() == 630 && evt.getY() == 61 || evt.getX() == 630 && evt.getY() == 62 || evt.getX() == 630 && evt.getY() == 63 || evt.getX() == 630 && evt.getY() == 64 || evt.getX() == 630 && evt.getY() == 65 || evt.getX() == 630 && evt.getY() == 66 || evt.getX() == 630 && evt.getY() == 67 || evt.getX() == 630 && evt.getY() == 68 || evt.getX() == 630 && evt.getY() == 69 || evt.getX() == 630 && evt.getY() == 70 || evt.getX() == 630 && evt.getY() == 71 || evt.getX() == 630 && evt.getY() == 72 || evt.getX() == 630 && evt.getY() == 73 || evt.getX() == 630 && evt.getY() == 74 || evt.getX() == 630 && evt.getY() == 75 || evt.getX() == 630 && evt.getY() == 76 || evt.getX() == 630 && evt.getY() == 77 || evt.getX() == 630 && evt.getY() == 78 || evt.getX() == 630 && evt.getY() == 79 || evt.getX() == 630 && evt.getY() == 80 || evt.getX() == 630 && evt.getY() == 81 || evt.getX() == 630 && evt.getY() == 82 || evt.getX() == 630 && evt.getY() == 83 || evt.getX() == 630 && evt.getY() == 84 || evt.getX() == 630 && evt.getY() == 85 || evt.getX() == 630 && evt.getY() == 86 || evt.getX() == 630 && evt.getY() == 87 || evt.getX() == 630 && evt.getY() == 88 || evt.getX() == 630 && evt.getY() == 89 || evt.getX() == 630 && evt.getY() == 90 || evt.getX() == 630 && evt.getY() == 91 || evt.getX() == 630 && evt.getY() == 92 || evt.getX() == 630 && evt.getY() == 93 || evt.getX() == 630 && evt.getY() == 94 || evt.getX() == 630 && evt.getY() == 95 || evt.getX() == 630 && evt.getY() == 96 || evt.getX() == 630 && evt.getY() == 97 || evt.getX() == 630 && evt.getY() == 98 || evt.getX() == 630 && evt.getY() == 99 || evt.getX() == 630 && evt.getY() == 100 || evt.getX() == 630 && evt.getY() == 101 || evt.getX() == 630 && evt.getY() == 102 || evt.getX() == 630 && evt.getY() == 103 || evt.getX() == 630 && evt.getY() == 104 || evt.getX() == 630 && evt.getY() == 105 || evt.getX() == 630 && evt.getY() == 106 || evt.getX() == 630 && evt.getY() == 107 || evt.getX() == 630 && evt.getY() == 108 || evt.getX() == 630 && evt.getY() == 109 || evt.getX() == 630 && evt.getY() == 110 || evt.getX() == 630 && evt.getY() == 111 || evt.getX() == 630 && evt.getY() == 112 || evt.getX() == 630 && evt.getY() == 113 || evt.getX() == 630 && evt.getY() == 114 || evt.getX() == 630 && evt.getY() == 115 || evt.getX() == 630 && evt.getY() == 116 || evt.getX() == 630 && evt.getY() == 117 || evt.getX() == 630 && evt.getY() == 118 || evt.getX() == 630 && evt.getY() == 119 || evt.getX() == 630 && evt.getY() == 120 || evt.getX() == 630 && evt.getY() == 121 || evt.getX() == 630 && evt.getY() == 122 || evt.getX() == 630 && evt.getY() == 123 || evt.getX() == 630 && evt.getY() == 124 || evt.getX() == 630 && evt.getY() == 125 || evt.getX() == 630 && evt.getY() == 126 || evt.getX() == 630 && evt.getY() == 127 || evt.getX() == 630 && evt.getY() == 128 || evt.getX() == 630 && evt.getY() == 129 || evt.getX() == 630 && evt.getY() == 130 || evt.getX() == 630 && evt.getY() == 131 || evt.getX() == 630 && evt.getY() == 132 || evt.getX() == 630 && evt.getY() == 133 || evt.getX() == 630 && evt.getY() == 134 || evt.getX() == 630 && evt.getY() == 135 || evt.getX() == 630 && evt.getY() == 136 || evt.getX() == 630 && evt.getY() == 137 || evt.getX() == 630 && evt.getY() == 138 || evt.getX() == 630 && evt.getY() == 139 || evt.getX() == 630 && evt.getY() == 140 ||
           evt.getX() == 630 && evt.getY() == -110 || evt.getX() == 631 && evt.getY() == -110 || evt.getX() == 632 && evt.getY() == -110 || evt.getX() == 633 && evt.getY() == -110 || evt.getX() == 634 && evt.getY() == -110 || evt.getX() == 635 && evt.getY() == -110 || evt.getX() == 636 && evt.getY() == -110 || evt.getX() == 637 && evt.getY() == -110 || evt.getX() == 638 && evt.getY() == -110 || evt.getX() == 639 && evt.getY() == -110 || evt.getX() == 640 && evt.getY() == -110 || evt.getX() == 641 && evt.getY() == -110 || evt.getX() == 642 && evt.getY() == -110 || evt.getX() == 643 && evt.getY() == -110 || evt.getX() == 644 && evt.getY() == -110 || evt.getX() == 645 && evt.getY() == -110 || evt.getX() == 646 && evt.getY() == -110 || evt.getX() == 647 && evt.getY() == -110 || evt.getX() == 648 && evt.getY() == -110 || evt.getX() == 649 && evt.getY() == -110 || evt.getX() == 650 && evt.getY() == -110 || evt.getX() == 651 && evt.getY() == -110 || evt.getX() == 652 && evt.getY() == -110 || evt.getX() == 653 && evt.getY() == -110 || evt.getX() == 654 && evt.getY() == -110 || evt.getX() == 655 && evt.getY() == -110 || evt.getX() == 656 && evt.getY() == -110 || evt.getX() == 657 && evt.getY() == -110 || evt.getX() == 658 && evt.getY() == -110 || evt.getX() == 659 && evt.getY() == -110 || evt.getX() == 660 && evt.getY() == -110 || evt.getX() == 661 && evt.getY() == -110 || evt.getX() == 662 && evt.getY() == -110 || evt.getX() == 663 && evt.getY() == -110 || evt.getX() == 664 && evt.getY() == -110 || evt.getX() == 665 && evt.getY() == -110 || evt.getX() == 666 && evt.getY() == -110 || evt.getX() == 667 && evt.getY() == -110 || evt.getX() == 668 && evt.getY() == -110 || evt.getX() == 669 && evt.getY() == -110 || evt.getX() == 670 && evt.getY() == -110 || evt.getX() == 671 && evt.getY() == -110 || evt.getX() == 672 && evt.getY() == -110 || evt.getX() == 673 && evt.getY() == -110 || evt.getX() == 674 && evt.getY() == -110 || evt.getX() == 675 && evt.getY() == -110 || evt.getX() == 676 && evt.getY() == -110 || evt.getX() == 677 && evt.getY() == -110 || evt.getX() == 678 && evt.getY() == -110 || evt.getX() == 679 && evt.getY() == -110 || evt.getX() == 680 && evt.getY() == -110 || evt.getX() == 681 && evt.getY() == -110 || evt.getX() == 682 && evt.getY() == -110 || evt.getX() == 683 && evt.getY() == -110 || evt.getX() == 684 && evt.getY() == -110 || evt.getX() == 685 && evt.getY() == -110 || evt.getX() == 686 && evt.getY() == -110 || evt.getX() == 687 && evt.getY() == -110 || evt.getX() == 688 && evt.getY() == -110 || evt.getX() == 689 && evt.getY() == -110 || evt.getX() == 690 && evt.getY() == -110 || evt.getX() == 691 && evt.getY() == -110 || evt.getX() == 692 && evt.getY() == -110 || evt.getX() == 693 && evt.getY() == -110 || evt.getX() == 694 && evt.getY() == -110 || evt.getX() == 695 && evt.getY() == -110 || evt.getX() == 696 && evt.getY() == -110 || evt.getX() == 697 && evt.getY() == -110 || evt.getX() == 698 && evt.getY() == -110 || evt.getX() == 699 && evt.getY() == -110 || evt.getX() == 700 && evt.getY() == -110 || evt.getX() == 701 && evt.getY() == -110 || evt.getX() == 702 && evt.getY() == -110 || evt.getX() == 703 && evt.getY() == -110 || evt.getX() == 704 && evt.getY() == -110 || evt.getX() == 705 && evt.getY() == -110 || evt.getX() == 706 && evt.getY() == -110 || evt.getX() == 707 && evt.getY() == -110 || evt.getX() == 708 && evt.getY() == -110 || evt.getX() == 709 && evt.getY() == -110 || evt.getX() == 710 && evt.getY() == -110 || evt.getX() == 711 && evt.getY() == -110 || evt.getX() == 712 && evt.getY() == -110 || evt.getX() == 713 && evt.getY() == -110 || evt.getX() == 714 && evt.getY() == -110 || evt.getX() == 715 && evt.getY() == -110 || evt.getX() == 716 && evt.getY() == -110 || evt.getX() == 717 && evt.getY() == -110 || evt.getX() == 718 && evt.getY() == -110 || evt.getX() == 719 && evt.getY() == -110 || evt.getX() == 720 && evt.getY() == -110 || evt.getX() == 721 && evt.getY() == -110 || evt.getX() == 722 && evt.getY() == -110 || evt.getX() == 723 && evt.getY() == -110 || evt.getX() == 724 && evt.getY() == -110 || evt.getX() == 725 && evt.getY() == -110 || evt.getX() == 726 && evt.getY() == -110 || evt.getX() == 727 && evt.getY() == -110 || evt.getX() == 728 && evt.getY() == -110 || evt.getX() == 729 && evt.getY() == -110 || evt.getX() == 730 && evt.getY() == -110 || evt.getX() == 731 && evt.getY() == -110 || evt.getX() == 732 && evt.getY() == -110 || evt.getX() == 733 && evt.getY() == -110 || evt.getX() == 734 && evt.getY() == -110 || evt.getX() == 735 && evt.getY() == -110 || evt.getX() == 736 && evt.getY() == -110 || evt.getX() == 737 && evt.getY() == -110 || evt.getX() == 738 && evt.getY() == -110 || evt.getX() == 739 && evt.getY() == -110 || evt.getX() == 740 && evt.getY() == -110 || evt.getX() == 741 && evt.getY() == -110 || evt.getX() == 742 && evt.getY() == -110 || evt.getX() == 743 && evt.getY() == -110 || evt.getX() == 744 && evt.getY() == -110 || evt.getX() == 745 && evt.getY() == -110 || evt.getX() == 746 && evt.getY() == -110 || evt.getX() == 747 && evt.getY() == -110 || evt.getX() == 748 && evt.getY() == -110 || evt.getX() == 749 && evt.getY() == -110 || evt.getX() == 750 && evt.getY() == -110 || evt.getX() == 751 && evt.getY() == -110 || evt.getX() == 752 && evt.getY() == -110 || evt.getX() == 753 && evt.getY() == -110 || evt.getX() == 754 && evt.getY() == -110 || evt.getX() == 755 && evt.getY() == -110 || evt.getX() == 756 && evt.getY() == -110 || evt.getX() == 757 && evt.getY() == -110 || evt.getX() == 758 && evt.getY() == -110 || evt.getX() == 759 && evt.getY() == -110 || evt.getX() == 760 && evt.getY() == -110 || evt.getX() == 761 && evt.getY() == -110 || evt.getX() == 762 && evt.getY() == -110 || evt.getX() == 763 && evt.getY() == -110 || evt.getX() == 764 && evt.getY() == -110 || evt.getX() == 765 && evt.getY() == -110 || evt.getX() == 766 && evt.getY() == -110 || evt.getX() == 767 && evt.getY() == -110 || evt.getX() == 768 && evt.getY() == -110 || evt.getX() == 769 && evt.getY() == -110 || evt.getX() == 770 && evt.getY() == -110 || evt.getX() == 771 && evt.getY() == -110 || evt.getX() == 772 && evt.getY() == -110 || evt.getX() == 773 && evt.getY() == -110 || evt.getX() == 774 && evt.getY() == -110 || evt.getX() == 775 && evt.getY() == -110 || evt.getX() == 776 && evt.getY() == -110 || evt.getX() == 777 && evt.getY() == -110 || evt.getX() == 778 && evt.getY() == -110 || evt.getX() == 779 && evt.getY() == -110 || evt.getX() == 780 && evt.getY() == -110 || evt.getX() == 781 && evt.getY() == -110 || evt.getX() == 782 && evt.getY() == -110 || evt.getX() == 783 && evt.getY() == -110 || evt.getX() == 784 && evt.getY() == -110 || evt.getX() == 785 && evt.getY() == -110 || evt.getX() == 786 && evt.getY() == -110 || evt.getX() == 787 && evt.getY() == -110 || evt.getX() == 788 && evt.getY() == -110 || evt.getX() == 789 && evt.getY() == -110 || evt.getX() == 790 && evt.getY() == -110 || evt.getX() == 791 && evt.getY() == -110 || evt.getX() == 792 && evt.getY() == -110 || evt.getX() == 793 && evt.getY() == -110 || evt.getX() == 794 && evt.getY() == -110 || evt.getX() == 795 && evt.getY() == -110 || evt.getX() == 796 && evt.getY() == -110 || evt.getX() == 797 && evt.getY() == -110 || evt.getX() == 798 && evt.getY() == -110 || evt.getX() == 799 && evt.getY() == -110 || evt.getX() == 800 && evt.getY() == -110 || evt.getX() == 801 && evt.getY() == -110 || evt.getX() == 802 && evt.getY() == -110 || evt.getX() == 803 && evt.getY() == -110 || evt.getX() == 804 && evt.getY() == -110 || evt.getX() == 805 && evt.getY() == -110 || evt.getX() == 806 && evt.getY() == -110 || evt.getX() == 807 && evt.getY() == -110 || evt.getX() == 808 && evt.getY() == -110 || evt.getX() == 809 && evt.getY() == -110 || evt.getX() == 810 && evt.getY() == -110 || evt.getX() == 811 && evt.getY() == -110 || evt.getX() == 812 && evt.getY() == -110 || evt.getX() == 813 && evt.getY() == -110 || evt.getX() == 814 && evt.getY() == -110 || evt.getX() == 815 && evt.getY() == -110 || evt.getX() == 816 && evt.getY() == -110 || evt.getX() == 817 && evt.getY() == -110 || evt.getX() == 818 && evt.getY() == -110 || evt.getX() == 819 && evt.getY() == -110 || evt.getX() == 820 && evt.getY() == -110 || evt.getX() == 821 && evt.getY() == -110 || evt.getX() == 822 && evt.getY() == -110 || evt.getX() == 823 && evt.getY() == -110 || evt.getX() == 824 && evt.getY() == -110 || evt.getX() == 825 && evt.getY() == -110 || evt.getX() == 826 && evt.getY() == -110 || evt.getX() == 827 && evt.getY() == -110 || evt.getX() == 828 && evt.getY() == -110 || evt.getX() == 829 && evt.getY() == -110 || evt.getX() == 830 && evt.getY() == -110 || evt.getX() == 831 && evt.getY() == -110 || evt.getX() == 832 && evt.getY() == -110 || evt.getX() == 833 && evt.getY() == -110 || evt.getX() == 834 && evt.getY() == -110 || evt.getX() == 835 && evt.getY() == -110 || evt.getX() == 836 && evt.getY() == -110 || evt.getX() == 837 && evt.getY() == -110 || evt.getX() == 838 && evt.getY() == -110 || evt.getX() == 839 && evt.getY() == -110 || evt.getX() == 840 && evt.getY() == -110 || evt.getX() == 841 && evt.getY() == -110 || evt.getX() == 842 && evt.getY() == -110 || evt.getX() == 843 && evt.getY() == -110 || evt.getX() == 844 && evt.getY() == -110 || evt.getX() == 845 && evt.getY() == -110 || evt.getX() == 846 && evt.getY() == -110 || evt.getX() == 847 && evt.getY() == -110 || evt.getX() == 848 && evt.getY() == -110 || evt.getX() == 849 && evt.getY() == -110 || evt.getX() == 850 && evt.getY() == -110 || evt.getX() == 851 && evt.getY() == -110 || evt.getX() == 852 && evt.getY() == -110 || evt.getX() == 853 && evt.getY() == -110 || evt.getX() == 854 && evt.getY() == -110 || evt.getX() == 855 && evt.getY() == -110 || evt.getX() == 856 && evt.getY() == -110 || evt.getX() == 857 && evt.getY() == -110 || evt.getX() == 858 && evt.getY() == -110 || evt.getX() == 859 && evt.getY() == -110 || evt.getX() == 860 && evt.getY() == -110 || evt.getX() == 861 && evt.getY() == -110 || evt.getX() == 862 && evt.getY() == -110 || evt.getX() == 863 && evt.getY() == -110 || evt.getX() == 864 && evt.getY() == -110 || evt.getX() == 865 && evt.getY() == -110 || evt.getX() == 866 && evt.getY() == -110 || evt.getX() == 867 && evt.getY() == -110 || evt.getX() == 868 && evt.getY() == -110 || evt.getX() == 869 && evt.getY() == -110 || evt.getX() == 870 && evt.getY() == -110 || evt.getX() == 871 && evt.getY() == -110 || evt.getX() == 872 && evt.getY() == -110 || evt.getX() == 873 && evt.getY() == -110 || evt.getX() == 874 && evt.getY() == -110 || evt.getX() == 875 && evt.getY() == -110 || evt.getX() == 876 && evt.getY() == -110 || evt.getX() == 877 && evt.getY() == -110 || evt.getX() == 878 && evt.getY() == -110 || evt.getX() == 879 && evt.getY() == -110 || evt.getX() == 880 && evt.getY() == -110 || evt.getX() == 881 && evt.getY() == -110 || evt.getX() == 882 && evt.getY() == -110 || evt.getX() == 883 && evt.getY() == -110 || evt.getX() == 884 && evt.getY() == -110 || evt.getX() == 885 && evt.getY() == -110 || evt.getX() == 886 && evt.getY() == -110 || evt.getX() == 887 && evt.getY() == -110 || evt.getX() == 888 && evt.getY() == -110 || evt.getX() == 889 && evt.getY() == -110 || evt.getX() == 890 && evt.getY() == -110 || evt.getX() == 891 && evt.getY() == -110 || evt.getX() == 892 && evt.getY() == -110 || evt.getX() == 893 && evt.getY() == -110 || evt.getX() == 894 && evt.getY() == -110 || evt.getX() == 895 && evt.getY() == -110 || evt.getX() == 896 && evt.getY() == -110 || evt.getX() == 897 && evt.getY() == -110 || evt.getX() == 898 && evt.getY() == -110 || evt.getX() == 899 && evt.getY() == -110 || evt.getX() == 900 && evt.getY() == -110 || evt.getX() == 901 && evt.getY() == -110 || evt.getX() == 902 && evt.getY() == -110 || evt.getX() == 903 && evt.getY() == -110 || evt.getX() == 904 && evt.getY() == -110 || evt.getX() == 905 && evt.getY() == -110 || evt.getX() == 906 && evt.getY() == -110 || evt.getX() == 907 && evt.getY() == -110 || evt.getX() == 908 && evt.getY() == -110 || evt.getX() == 909 && evt.getY() == -110 || evt.getX() == 910 && evt.getY() == -110 || evt.getX() == 911 && evt.getY() == -110 || evt.getX() == 912 && evt.getY() == -110 || evt.getX() == 913 && evt.getY() == -110 || evt.getX() == 914 && evt.getY() == -110 || evt.getX() == 915 && evt.getY() == -110 || evt.getX() == 916 && evt.getY() == -110 || evt.getX() == 917 && evt.getY() == -110 || evt.getX() == 918 && evt.getY() == -110 || evt.getX() == 919 && evt.getY() == -110 || evt.getX() == 920 && evt.getY() == -110 || evt.getX() == 921 && evt.getY() == -110 || evt.getX() == 922 && evt.getY() == -110 || evt.getX() == 923 && evt.getY() == -110 || evt.getX() == 924 && evt.getY() == -110 || evt.getX() == 925 && evt.getY() == -110 || evt.getX() == 926 && evt.getY() == -110 || evt.getX() == 927 && evt.getY() == -110 || evt.getX() == 928 && evt.getY() == -110 || evt.getX() == 929 && evt.getY() == -110 || evt.getX() == 930 && evt.getY() == -110 || evt.getX() == 931 && evt.getY() == -110 || evt.getX() == 932 && evt.getY() == -110 || evt.getX() == 933 && evt.getY() == -110 || evt.getX() == 934 && evt.getY() == -110 || evt.getX() == 935 && evt.getY() == -110 || evt.getX() == 936 && evt.getY() == -110 || evt.getX() == 937 && evt.getY() == -110 || evt.getX() == 938 && evt.getY() == -110 || evt.getX() == 939 && evt.getY() == -110 || evt.getX() == 940 && evt.getY() == -110 || evt.getX() == 941 && evt.getY() == -110 || evt.getX() == 942 && evt.getY() == -110 || evt.getX() == 943 && evt.getY() == -110 || evt.getX() == 944 && evt.getY() == -110 || evt.getX() == 945 && evt.getY() == -110 || evt.getX() == 946 && evt.getY() == -110 || evt.getX() == 947 && evt.getY() == -110 || evt.getX() == 948 && evt.getY() == -110 || evt.getX() == 949 && evt.getY() == -110 || evt.getX() == 950 && evt.getY() == -110 || evt.getX() == 951 && evt.getY() == -110 || evt.getX() == 952 && evt.getY() == -110 || evt.getX() == 953 && evt.getY() == -110 || evt.getX() == 954 && evt.getY() == -110 || evt.getX() == 955 && evt.getY() == -110 || evt.getX() == 956 && evt.getY() == -110 || evt.getX() == 957 && evt.getY() == -110 || evt.getX() == 958 && evt.getY() == -110 || evt.getX() == 959 && evt.getY() == -110 || evt.getX() == 960 && evt.getY() == -110 || evt.getX() == 961 && evt.getY() == -110 || evt.getX() == 962 && evt.getY() == -110 || evt.getX() == 963 && evt.getY() == -110 || evt.getX() == 964 && evt.getY() == -110 || evt.getX() == 965 && evt.getY() == -110 || evt.getX() == 966 && evt.getY() == -110 || evt.getX() == 967 && evt.getY() == -110 || evt.getX() == 968 && evt.getY() == -110 || evt.getX() == 969 && evt.getY() == -110 || evt.getX() == 970 && evt.getY() == -110 || evt.getX() == 971 && evt.getY() == -110 || evt.getX() == 972 && evt.getY() == -110 || evt.getX() == 973 && evt.getY() == -110 || evt.getX() == 974 && evt.getY() == -110 || evt.getX() == 975 && evt.getY() == -110 || evt.getX() == 976 && evt.getY() == -110 || evt.getX() == 977 && evt.getY() == -110 || evt.getX() == 978 && evt.getY() == -110 || evt.getX() == 979 && evt.getY() == -110 || evt.getX() == 980 && evt.getY() == -110 || evt.getX() == 981 && evt.getY() == -110 || evt.getX() == 982 && evt.getY() == -110 || evt.getX() == 983 && evt.getY() == -110 || evt.getX() == 984 && evt.getY() == -110 || evt.getX() == 985 && evt.getY() == -110 || evt.getX() == 986 && evt.getY() == -110 || evt.getX() == 987 && evt.getY() == -110 || evt.getX() == 988 && evt.getY() == -110 || evt.getX() == 989 && evt.getY() == -110 || evt.getX() == 990 && evt.getY() == -110 || evt.getX() == 991 && evt.getY() == -110 || evt.getX() == 992 && evt.getY() == -110 || evt.getX() == 993 && evt.getY() == -110 || evt.getX() == 994 && evt.getY() == -110 || evt.getX() == 995 && evt.getY() == -110 || evt.getX() == 996 && evt.getY() == -110 || evt.getX() == 997 && evt.getY() == -110 || evt.getX() == 998 && evt.getY() == -110 || evt.getX() == 999 && evt.getY() == -110 || evt.getX() == 1000 && evt.getY() == -110 || evt.getX() == 1001 && evt.getY() == -110 || evt.getX() == 1002 && evt.getY() == -110 || evt.getX() == 1003 && evt.getY() == -110 || evt.getX() == 1004 && evt.getY() == -110 || evt.getX() == 1005 && evt.getY() == -110 || evt.getX() == 1006 && evt.getY() == -110 || evt.getX() == 1007 && evt.getY() == -110 || evt.getX() == 1008 && evt.getY() == -110 || evt.getX() == 1009 && evt.getY() == -110 || evt.getX() == 1010 && evt.getY() == -110 || evt.getX() == 1011 && evt.getY() == -110 || evt.getX() == 1012 && evt.getY() == -110 || evt.getX() == 1013 && evt.getY() == -110 || evt.getX() == 1014 && evt.getY() == -110 || evt.getX() == 1015 && evt.getY() == -110 || evt.getX() == 1016 && evt.getY() == -110 || evt.getX() == 1017 && evt.getY() == -110 || evt.getX() == 1018 && evt.getY() == -110 || evt.getX() == 1019 && evt.getY() == -110 || evt.getX() == 1020 && evt.getY() == -110 || evt.getX() == 1021 && evt.getY() == -110 || evt.getX() == 1022 && evt.getY() == -110 || evt.getX() == 1023 && evt.getY() == -110 || evt.getX() == 1024 && evt.getY() == -110 || evt.getX() == 1025 && evt.getY() == -110 || evt.getX() == 1026 && evt.getY() == -110 || evt.getX() == 1027 && evt.getY() == -110 || evt.getX() == 1028 && evt.getY() == -110 || evt.getX() == 1029 && evt.getY() == -110 || evt.getX() == 1030 && evt.getY() == -110 || evt.getX() == 1031 && evt.getY() == -110 || evt.getX() == 1032 && evt.getY() == -110 || evt.getX() == 1033 && evt.getY() == -110 || evt.getX() == 1034 && evt.getY() == -110 || evt.getX() == 1035 && evt.getY() == -110 || evt.getX() == 1036 && evt.getY() == -110 || evt.getX() == 1037 && evt.getY() == -110 || evt.getX() == 1038 && evt.getY() == -110 || evt.getX() == 1039 && evt.getY() == -110 || evt.getX() == 1040 && evt.getY() == -110 || evt.getX() == 1041 && evt.getY() == -110 || evt.getX() == 1042 && evt.getY() == -110 || evt.getX() == 1043 && evt.getY() == -110 || evt.getX() == 1044 && evt.getY() == -110 || evt.getX() == 1045 && evt.getY() == -110 || evt.getX() == 1046 && evt.getY() == -110 || evt.getX() == 1047 && evt.getY() == -110 || evt.getX() == 1048 && evt.getY() == -110 || evt.getX() == 1049 && evt.getY() == -110 || evt.getX() == 1050 && evt.getY() == -110 || evt.getX() == 1051 && evt.getY() == -110 || evt.getX() == 1052 && evt.getY() == -110 || evt.getX() == 1053 && evt.getY() == -110 || evt.getX() == 1054 && evt.getY() == -110 || evt.getX() == 1055 && evt.getY() == -110 || evt.getX() == 1056 && evt.getY() == -110 || evt.getX() == 1057 && evt.getY() == -110 || evt.getX() == 1058 && evt.getY() == -110 || evt.getX() == 1059 && evt.getY() == -110 || evt.getX() == 1060 && evt.getY() == -110 || evt.getX() == 1061 && evt.getY() == -110 || evt.getX() == 1062 && evt.getY() == -110 || evt.getX() == 1063 && evt.getY() == -110 || evt.getX() == 1064 && evt.getY() == -110 || evt.getX() == 1065 && evt.getY() == -110 || evt.getX() == 1066 && evt.getY() == -110 || evt.getX() == 1067 && evt.getY() == -110 || evt.getX() == 1068 && evt.getY() == -110 || evt.getX() == 1069 && evt.getY() == -110 || evt.getX() == 1070 && evt.getY() == -110 || evt.getX() == 1071 && evt.getY() == -110 || evt.getX() == 1072 && evt.getY() == -110 || evt.getX() == 1073 && evt.getY() == -110 || evt.getX() == 1074 && evt.getY() == -110 || evt.getX() == 1075 && evt.getY() == -110 || evt.getX() == 1076 && evt.getY() == -110 || evt.getX() == 1077 && evt.getY() == -110 || evt.getX() == 1078 && evt.getY() == -110 || evt.getX() == 1079 && evt.getY() == -110 || evt.getX() == 1080 && evt.getY() == -110 || evt.getX() == 1081 && evt.getY() == -110 || evt.getX() == 1082 && evt.getY() == -110 || evt.getX() == 1083 && evt.getY() == -110 || evt.getX() == 1084 && evt.getY() == -110 || evt.getX() == 1085 && evt.getY() == -110 || evt.getX() == 1086 && evt.getY() == -110 || evt.getX() == 1087 && evt.getY() == -110 || evt.getX() == 1088 && evt.getY() == -110 || evt.getX() == 1089 && evt.getY() == -110 || evt.getX() == 1090 && evt.getY() == -110 || evt.getX() == 1091 && evt.getY() == -110 || evt.getX() == 1092 && evt.getY() == -110 || evt.getX() == 1093 && evt.getY() == -110 || evt.getX() == 1094 && evt.getY() == -110 || evt.getX() == 1095 && evt.getY() == -110 || evt.getX() == 1096 && evt.getY() == -110 || evt.getX() == 1097 && evt.getY() == -110 || evt.getX() == 1098 && evt.getY() == -110 || evt.getX() == 1099 && evt.getY() == -110 || evt.getX() == 1100 && evt.getY() == -110 || evt.getX() == 1101 && evt.getY() == -110 || evt.getX() == 1102 && evt.getY() == -110 || evt.getX() == 1103 && evt.getY() == -110 || evt.getX() == 1104 && evt.getY() == -110 || evt.getX() == 1105 && evt.getY() == -110 || evt.getX() == 1106 && evt.getY() == -110 || evt.getX() == 1107 && evt.getY() == -110 || evt.getX() == 1108 && evt.getY() == -110 || evt.getX() == 1109 && evt.getY() == -110 || evt.getX() == 1110 && evt.getY() == -110 || evt.getX() == 1111 && evt.getY() == -110 || evt.getX() == 1112 && evt.getY() == -110 || evt.getX() == 1113 && evt.getY() == -110 || evt.getX() == 1114 && evt.getY() == -110 || evt.getX() == 1115 && evt.getY() == -110 || evt.getX() == 1116 && evt.getY() == -110 || evt.getX() == 1117 && evt.getY() == -110 || evt.getX() == 1118 && evt.getY() == -110 || evt.getX() == 1119 && evt.getY() == -110 || evt.getX() == 1120 && evt.getY() == -110 || evt.getX() == 1121 && evt.getY() == -110 || evt.getX() == 1122 && evt.getY() == -110 || evt.getX() == 1123 && evt.getY() == -110 || evt.getX() == 1124 && evt.getY() == -110 || evt.getX() == 1125 && evt.getY() == -110 || evt.getX() == 1126 && evt.getY() == -110 || evt.getX() == 1127 && evt.getY() == -110 || evt.getX() == 1128 && evt.getY() == -110 || evt.getX() == 1129 && evt.getY() == -110 || evt.getX() == 1130 && evt.getY() == -110 || 
           evt.getX() == 630 && evt.getY() == 140 || evt.getX() == 631 && evt.getY() == 140 || evt.getX() == 632 && evt.getY() == 140 || evt.getX() == 633 && evt.getY() == 140 || evt.getX() == 634 && evt.getY() == 140 || evt.getX() == 635 && evt.getY() == 140 || evt.getX() == 636 && evt.getY() == 140 || evt.getX() == 637 && evt.getY() == 140 || evt.getX() == 638 && evt.getY() == 140 || evt.getX() == 639 && evt.getY() == 140 || evt.getX() == 640 && evt.getY() == 140 || evt.getX() == 641 && evt.getY() == 140 || evt.getX() == 642 && evt.getY() == 140 || evt.getX() == 643 && evt.getY() == 140 || evt.getX() == 644 && evt.getY() == 140 || evt.getX() == 645 && evt.getY() == 140 || evt.getX() == 646 && evt.getY() == 140 || evt.getX() == 647 && evt.getY() == 140 || evt.getX() == 648 && evt.getY() == 140 || evt.getX() == 649 && evt.getY() == 140 || evt.getX() == 650 && evt.getY() == 140 || evt.getX() == 651 && evt.getY() == 140 || evt.getX() == 652 && evt.getY() == 140 || evt.getX() == 653 && evt.getY() == 140 || evt.getX() == 654 && evt.getY() == 140 || evt.getX() == 655 && evt.getY() == 140 || evt.getX() == 656 && evt.getY() == 140 || evt.getX() == 657 && evt.getY() == 140 || evt.getX() == 658 && evt.getY() == 140 || evt.getX() == 659 && evt.getY() == 140 || evt.getX() == 660 && evt.getY() == 140 || evt.getX() == 661 && evt.getY() == 140 || evt.getX() == 662 && evt.getY() == 140 || evt.getX() == 663 && evt.getY() == 140 || evt.getX() == 664 && evt.getY() == 140 || evt.getX() == 665 && evt.getY() == 140 || evt.getX() == 666 && evt.getY() == 140 || evt.getX() == 667 && evt.getY() == 140 || evt.getX() == 668 && evt.getY() == 140 || evt.getX() == 669 && evt.getY() == 140 || evt.getX() == 670 && evt.getY() == 140 || evt.getX() == 671 && evt.getY() == 140 || evt.getX() == 672 && evt.getY() == 140 || evt.getX() == 673 && evt.getY() == 140 || evt.getX() == 674 && evt.getY() == 140 || evt.getX() == 675 && evt.getY() == 140 || evt.getX() == 676 && evt.getY() == 140 || evt.getX() == 677 && evt.getY() == 140 || evt.getX() == 678 && evt.getY() == 140 || evt.getX() == 679 && evt.getY() == 140 || evt.getX() == 680 && evt.getY() == 140 || evt.getX() == 681 && evt.getY() == 140 || evt.getX() == 682 && evt.getY() == 140 || evt.getX() == 683 && evt.getY() == 140 || evt.getX() == 684 && evt.getY() == 140 || evt.getX() == 685 && evt.getY() == 140 || evt.getX() == 686 && evt.getY() == 140 || evt.getX() == 687 && evt.getY() == 140 || evt.getX() == 688 && evt.getY() == 140 || evt.getX() == 689 && evt.getY() == 140 || evt.getX() == 690 && evt.getY() == 140 || evt.getX() == 691 && evt.getY() == 140 || evt.getX() == 692 && evt.getY() == 140 || evt.getX() == 693 && evt.getY() == 140 || evt.getX() == 694 && evt.getY() == 140 || evt.getX() == 695 && evt.getY() == 140 || evt.getX() == 696 && evt.getY() == 140 || evt.getX() == 697 && evt.getY() == 140 || evt.getX() == 698 && evt.getY() == 140 || evt.getX() == 699 && evt.getY() == 140 || evt.getX() == 700 && evt.getY() == 140 || evt.getX() == 701 && evt.getY() == 140 || evt.getX() == 702 && evt.getY() == 140 || evt.getX() == 703 && evt.getY() == 140 || evt.getX() == 704 && evt.getY() == 140 || evt.getX() == 705 && evt.getY() == 140 || evt.getX() == 706 && evt.getY() == 140 || evt.getX() == 707 && evt.getY() == 140 || evt.getX() == 708 && evt.getY() == 140 || evt.getX() == 709 && evt.getY() == 140 || evt.getX() == 710 && evt.getY() == 140 || evt.getX() == 711 && evt.getY() == 140 || evt.getX() == 712 && evt.getY() == 140 || evt.getX() == 713 && evt.getY() == 140 || evt.getX() == 714 && evt.getY() == 140 || evt.getX() == 715 && evt.getY() == 140 || evt.getX() == 716 && evt.getY() == 140 || evt.getX() == 717 && evt.getY() == 140 || evt.getX() == 718 && evt.getY() == 140 || evt.getX() == 719 && evt.getY() == 140 || evt.getX() == 720 && evt.getY() == 140 || evt.getX() == 721 && evt.getY() == 140 || evt.getX() == 722 && evt.getY() == 140 || evt.getX() == 723 && evt.getY() == 140 || evt.getX() == 724 && evt.getY() == 140 || evt.getX() == 725 && evt.getY() == 140 || evt.getX() == 726 && evt.getY() == 140 || evt.getX() == 727 && evt.getY() == 140 || evt.getX() == 728 && evt.getY() == 140 || evt.getX() == 729 && evt.getY() == 140 || evt.getX() == 730 && evt.getY() == 140 || evt.getX() == 731 && evt.getY() == 140 || evt.getX() == 732 && evt.getY() == 140 || evt.getX() == 733 && evt.getY() == 140 || evt.getX() == 734 && evt.getY() == 140 || evt.getX() == 735 && evt.getY() == 140 || evt.getX() == 736 && evt.getY() == 140 || evt.getX() == 737 && evt.getY() == 140 || evt.getX() == 738 && evt.getY() == 140 || evt.getX() == 739 && evt.getY() == 140 || evt.getX() == 740 && evt.getY() == 140 || evt.getX() == 741 && evt.getY() == 140 || evt.getX() == 742 && evt.getY() == 140 || evt.getX() == 743 && evt.getY() == 140 || evt.getX() == 744 && evt.getY() == 140 || evt.getX() == 745 && evt.getY() == 140 || evt.getX() == 746 && evt.getY() == 140 || evt.getX() == 747 && evt.getY() == 140 || evt.getX() == 748 && evt.getY() == 140 || evt.getX() == 749 && evt.getY() == 140 || evt.getX() == 750 && evt.getY() == 140 || evt.getX() == 751 && evt.getY() == 140 || evt.getX() == 752 && evt.getY() == 140 || evt.getX() == 753 && evt.getY() == 140 || evt.getX() == 754 && evt.getY() == 140 || evt.getX() == 755 && evt.getY() == 140 || evt.getX() == 756 && evt.getY() == 140 || evt.getX() == 757 && evt.getY() == 140 || evt.getX() == 758 && evt.getY() == 140 || evt.getX() == 759 && evt.getY() == 140 || evt.getX() == 760 && evt.getY() == 140 || evt.getX() == 761 && evt.getY() == 140 || evt.getX() == 762 && evt.getY() == 140 || evt.getX() == 763 && evt.getY() == 140 || evt.getX() == 764 && evt.getY() == 140 || evt.getX() == 765 && evt.getY() == 140 || evt.getX() == 766 && evt.getY() == 140 || evt.getX() == 767 && evt.getY() == 140 || evt.getX() == 768 && evt.getY() == 140 || evt.getX() == 769 && evt.getY() == 140 || evt.getX() == 770 && evt.getY() == 140 || evt.getX() == 771 && evt.getY() == 140 || evt.getX() == 772 && evt.getY() == 140 || evt.getX() == 773 && evt.getY() == 140 || evt.getX() == 774 && evt.getY() == 140 || evt.getX() == 775 && evt.getY() == 140 || evt.getX() == 776 && evt.getY() == 140 || evt.getX() == 777 && evt.getY() == 140 || evt.getX() == 778 && evt.getY() == 140 || evt.getX() == 779 && evt.getY() == 140 || evt.getX() == 780 && evt.getY() == 140 || evt.getX() == 781 && evt.getY() == 140 || evt.getX() == 782 && evt.getY() == 140 || evt.getX() == 783 && evt.getY() == 140 || evt.getX() == 784 && evt.getY() == 140 || evt.getX() == 785 && evt.getY() == 140 || evt.getX() == 786 && evt.getY() == 140 || evt.getX() == 787 && evt.getY() == 140 || evt.getX() == 788 && evt.getY() == 140 || evt.getX() == 789 && evt.getY() == 140 || evt.getX() == 790 && evt.getY() == 140 || evt.getX() == 791 && evt.getY() == 140 || evt.getX() == 792 && evt.getY() == 140 || evt.getX() == 793 && evt.getY() == 140 || evt.getX() == 794 && evt.getY() == 140 || evt.getX() == 795 && evt.getY() == 140 || evt.getX() == 796 && evt.getY() == 140 || evt.getX() == 797 && evt.getY() == 140 || evt.getX() == 798 && evt.getY() == 140 || evt.getX() == 799 && evt.getY() == 140 || evt.getX() == 800 && evt.getY() == 140 || evt.getX() == 801 && evt.getY() == 140 || evt.getX() == 802 && evt.getY() == 140 || evt.getX() == 803 && evt.getY() == 140 || evt.getX() == 804 && evt.getY() == 140 || evt.getX() == 805 && evt.getY() == 140 || evt.getX() == 806 && evt.getY() == 140 || evt.getX() == 807 && evt.getY() == 140 || evt.getX() == 808 && evt.getY() == 140 || evt.getX() == 809 && evt.getY() == 140 || evt.getX() == 810 && evt.getY() == 140 || evt.getX() == 811 && evt.getY() == 140 || evt.getX() == 812 && evt.getY() == 140 || evt.getX() == 813 && evt.getY() == 140 || evt.getX() == 814 && evt.getY() == 140 || evt.getX() == 815 && evt.getY() == 140 || evt.getX() == 816 && evt.getY() == 140 || evt.getX() == 817 && evt.getY() == 140 || evt.getX() == 818 && evt.getY() == 140 || evt.getX() == 819 && evt.getY() == 140 || evt.getX() == 820 && evt.getY() == 140 || evt.getX() == 821 && evt.getY() == 140 || evt.getX() == 822 && evt.getY() == 140 || evt.getX() == 823 && evt.getY() == 140 || evt.getX() == 824 && evt.getY() == 140 || evt.getX() == 825 && evt.getY() == 140 || evt.getX() == 826 && evt.getY() == 140 || evt.getX() == 827 && evt.getY() == 140 || evt.getX() == 828 && evt.getY() == 140 || evt.getX() == 829 && evt.getY() == 140 || evt.getX() == 830 && evt.getY() == 140 || evt.getX() == 831 && evt.getY() == 140 || evt.getX() == 832 && evt.getY() == 140 || evt.getX() == 833 && evt.getY() == 140 || evt.getX() == 834 && evt.getY() == 140 || evt.getX() == 835 && evt.getY() == 140 || evt.getX() == 836 && evt.getY() == 140 || evt.getX() == 837 && evt.getY() == 140 || evt.getX() == 838 && evt.getY() == 140 || evt.getX() == 839 && evt.getY() == 140 || evt.getX() == 840 && evt.getY() == 140 || evt.getX() == 841 && evt.getY() == 140 || evt.getX() == 842 && evt.getY() == 140 || evt.getX() == 843 && evt.getY() == 140 || evt.getX() == 844 && evt.getY() == 140 || evt.getX() == 845 && evt.getY() == 140 || evt.getX() == 846 && evt.getY() == 140 || evt.getX() == 847 && evt.getY() == 140 || evt.getX() == 848 && evt.getY() == 140 || evt.getX() == 849 && evt.getY() == 140 || evt.getX() == 850 && evt.getY() == 140 || evt.getX() == 851 && evt.getY() == 140 || evt.getX() == 852 && evt.getY() == 140 || evt.getX() == 853 && evt.getY() == 140 || evt.getX() == 854 && evt.getY() == 140 || evt.getX() == 855 && evt.getY() == 140 || evt.getX() == 856 && evt.getY() == 140 || evt.getX() == 857 && evt.getY() == 140 || evt.getX() == 858 && evt.getY() == 140 || evt.getX() == 859 && evt.getY() == 140 || evt.getX() == 860 && evt.getY() == 140 || evt.getX() == 861 && evt.getY() == 140 || evt.getX() == 862 && evt.getY() == 140 || evt.getX() == 863 && evt.getY() == 140 || evt.getX() == 864 && evt.getY() == 140 || evt.getX() == 865 && evt.getY() == 140 || evt.getX() == 866 && evt.getY() == 140 || evt.getX() == 867 && evt.getY() == 140 || evt.getX() == 868 && evt.getY() == 140 || evt.getX() == 869 && evt.getY() == 140 || evt.getX() == 870 && evt.getY() == 140 || evt.getX() == 871 && evt.getY() == 140 || evt.getX() == 872 && evt.getY() == 140 || evt.getX() == 873 && evt.getY() == 140 || evt.getX() == 874 && evt.getY() == 140 || evt.getX() == 875 && evt.getY() == 140 || evt.getX() == 876 && evt.getY() == 140 || evt.getX() == 877 && evt.getY() == 140 || evt.getX() == 878 && evt.getY() == 140 || evt.getX() == 879 && evt.getY() == 140 || evt.getX() == 880 && evt.getY() == 140 || evt.getX() == 881 && evt.getY() == 140 || evt.getX() == 882 && evt.getY() == 140 || evt.getX() == 883 && evt.getY() == 140 || evt.getX() == 884 && evt.getY() == 140 || evt.getX() == 885 && evt.getY() == 140 || evt.getX() == 886 && evt.getY() == 140 || evt.getX() == 887 && evt.getY() == 140 || evt.getX() == 888 && evt.getY() == 140 || evt.getX() == 889 && evt.getY() == 140 || evt.getX() == 890 && evt.getY() == 140 || evt.getX() == 891 && evt.getY() == 140 || evt.getX() == 892 && evt.getY() == 140 || evt.getX() == 893 && evt.getY() == 140 || evt.getX() == 894 && evt.getY() == 140 || evt.getX() == 895 && evt.getY() == 140 || evt.getX() == 896 && evt.getY() == 140 || evt.getX() == 897 && evt.getY() == 140 || evt.getX() == 898 && evt.getY() == 140 || evt.getX() == 899 && evt.getY() == 140 || evt.getX() == 900 && evt.getY() == 140 || evt.getX() == 901 && evt.getY() == 140 || evt.getX() == 902 && evt.getY() == 140 || evt.getX() == 903 && evt.getY() == 140 || evt.getX() == 904 && evt.getY() == 140 || evt.getX() == 905 && evt.getY() == 140 || evt.getX() == 906 && evt.getY() == 140 || evt.getX() == 907 && evt.getY() == 140 || evt.getX() == 908 && evt.getY() == 140 || evt.getX() == 909 && evt.getY() == 140 || evt.getX() == 910 && evt.getY() == 140 || evt.getX() == 911 && evt.getY() == 140 || evt.getX() == 912 && evt.getY() == 140 || evt.getX() == 913 && evt.getY() == 140 || evt.getX() == 914 && evt.getY() == 140 || evt.getX() == 915 && evt.getY() == 140 || evt.getX() == 916 && evt.getY() == 140 || evt.getX() == 917 && evt.getY() == 140 || evt.getX() == 918 && evt.getY() == 140 || evt.getX() == 919 && evt.getY() == 140 || evt.getX() == 920 && evt.getY() == 140 || evt.getX() == 921 && evt.getY() == 140 || evt.getX() == 922 && evt.getY() == 140 || evt.getX() == 923 && evt.getY() == 140 || evt.getX() == 924 && evt.getY() == 140 || evt.getX() == 925 && evt.getY() == 140 || evt.getX() == 926 && evt.getY() == 140 || evt.getX() == 927 && evt.getY() == 140 || evt.getX() == 928 && evt.getY() == 140 || evt.getX() == 929 && evt.getY() == 140 || evt.getX() == 930 && evt.getY() == 140 || evt.getX() == 931 && evt.getY() == 140 || evt.getX() == 932 && evt.getY() == 140 || evt.getX() == 933 && evt.getY() == 140 || evt.getX() == 934 && evt.getY() == 140 || evt.getX() == 935 && evt.getY() == 140 || evt.getX() == 936 && evt.getY() == 140 || evt.getX() == 937 && evt.getY() == 140 || evt.getX() == 938 && evt.getY() == 140 || evt.getX() == 939 && evt.getY() == 140 || evt.getX() == 940 && evt.getY() == 140 || evt.getX() == 941 && evt.getY() == 140 || evt.getX() == 942 && evt.getY() == 140 || evt.getX() == 943 && evt.getY() == 140 || evt.getX() == 944 && evt.getY() == 140 || evt.getX() == 945 && evt.getY() == 140 || evt.getX() == 946 && evt.getY() == 140 || evt.getX() == 947 && evt.getY() == 140 || evt.getX() == 948 && evt.getY() == 140 || evt.getX() == 949 && evt.getY() == 140 || evt.getX() == 950 && evt.getY() == 140 || evt.getX() == 951 && evt.getY() == 140 || evt.getX() == 952 && evt.getY() == 140 || evt.getX() == 953 && evt.getY() == 140 || evt.getX() == 954 && evt.getY() == 140 || evt.getX() == 955 && evt.getY() == 140 || evt.getX() == 956 && evt.getY() == 140 || evt.getX() == 957 && evt.getY() == 140 || evt.getX() == 958 && evt.getY() == 140 || evt.getX() == 959 && evt.getY() == 140 || evt.getX() == 960 && evt.getY() == 140 || evt.getX() == 961 && evt.getY() == 140 || evt.getX() == 962 && evt.getY() == 140 || evt.getX() == 963 && evt.getY() == 140 || evt.getX() == 964 && evt.getY() == 140 || evt.getX() == 965 && evt.getY() == 140 || evt.getX() == 966 && evt.getY() == 140 || evt.getX() == 967 && evt.getY() == 140 || evt.getX() == 968 && evt.getY() == 140 || evt.getX() == 969 && evt.getY() == 140 || evt.getX() == 970 && evt.getY() == 140 || evt.getX() == 971 && evt.getY() == 140 || evt.getX() == 972 && evt.getY() == 140 || evt.getX() == 973 && evt.getY() == 140 || evt.getX() == 974 && evt.getY() == 140 || evt.getX() == 975 && evt.getY() == 140 || evt.getX() == 976 && evt.getY() == 140 || evt.getX() == 977 && evt.getY() == 140 || evt.getX() == 978 && evt.getY() == 140 || evt.getX() == 979 && evt.getY() == 140 || evt.getX() == 980 && evt.getY() == 140 || evt.getX() == 981 && evt.getY() == 140 || evt.getX() == 982 && evt.getY() == 140 || evt.getX() == 983 && evt.getY() == 140 || evt.getX() == 984 && evt.getY() == 140 || evt.getX() == 985 && evt.getY() == 140 || evt.getX() == 986 && evt.getY() == 140 || evt.getX() == 987 && evt.getY() == 140 || evt.getX() == 988 && evt.getY() == 140 || evt.getX() == 989 && evt.getY() == 140 || evt.getX() == 990 && evt.getY() == 140 || evt.getX() == 991 && evt.getY() == 140 || evt.getX() == 992 && evt.getY() == 140 || evt.getX() == 993 && evt.getY() == 140 || evt.getX() == 994 && evt.getY() == 140 || evt.getX() == 995 && evt.getY() == 140 || evt.getX() == 996 && evt.getY() == 140 || evt.getX() == 997 && evt.getY() == 140 || evt.getX() == 998 && evt.getY() == 140 || evt.getX() == 999 && evt.getY() == 140 || evt.getX() == 1000 && evt.getY() == 140 || evt.getX() == 1001 && evt.getY() == 140 || evt.getX() == 1002 && evt.getY() == 140 || evt.getX() == 1003 && evt.getY() == 140 || evt.getX() == 1004 && evt.getY() == 140 || evt.getX() == 1005 && evt.getY() == 140 || evt.getX() == 1006 && evt.getY() == 140 || evt.getX() == 1007 && evt.getY() == 140 || evt.getX() == 1008 && evt.getY() == 140 || evt.getX() == 1009 && evt.getY() == 140 || evt.getX() == 1010 && evt.getY() == 140 || evt.getX() == 1011 && evt.getY() == 140 || evt.getX() == 1012 && evt.getY() == 140 || evt.getX() == 1013 && evt.getY() == 140 || evt.getX() == 1014 && evt.getY() == 140 || evt.getX() == 1015 && evt.getY() == 140 || evt.getX() == 1016 && evt.getY() == 140 || evt.getX() == 1017 && evt.getY() == 140 || evt.getX() == 1018 && evt.getY() == 140 || evt.getX() == 1019 && evt.getY() == 140 || evt.getX() == 1020 && evt.getY() == 140 || evt.getX() == 1021 && evt.getY() == 140 || evt.getX() == 1022 && evt.getY() == 140 || evt.getX() == 1023 && evt.getY() == 140 || evt.getX() == 1024 && evt.getY() == 140 || evt.getX() == 1025 && evt.getY() == 140 || evt.getX() == 1026 && evt.getY() == 140 || evt.getX() == 1027 && evt.getY() == 140 || evt.getX() == 1028 && evt.getY() == 140 || evt.getX() == 1029 && evt.getY() == 140 || evt.getX() == 1030 && evt.getY() == 140 || evt.getX() == 1031 && evt.getY() == 140 || evt.getX() == 1032 && evt.getY() == 140 || evt.getX() == 1033 && evt.getY() == 140 || evt.getX() == 1034 && evt.getY() == 140 || evt.getX() == 1035 && evt.getY() == 140 || evt.getX() == 1036 && evt.getY() == 140 || evt.getX() == 1037 && evt.getY() == 140 || evt.getX() == 1038 && evt.getY() == 140 || evt.getX() == 1039 && evt.getY() == 140 || evt.getX() == 1040 && evt.getY() == 140 || evt.getX() == 1041 && evt.getY() == 140 || evt.getX() == 1042 && evt.getY() == 140 || evt.getX() == 1043 && evt.getY() == 140 || evt.getX() == 1044 && evt.getY() == 140 || evt.getX() == 1045 && evt.getY() == 140 || evt.getX() == 1046 && evt.getY() == 140 || evt.getX() == 1047 && evt.getY() == 140 || evt.getX() == 1048 && evt.getY() == 140 || evt.getX() == 1049 && evt.getY() == 140 || evt.getX() == 1050 && evt.getY() == 140 || evt.getX() == 1051 && evt.getY() == 140 || evt.getX() == 1052 && evt.getY() == 140 || evt.getX() == 1053 && evt.getY() == 140 || evt.getX() == 1054 && evt.getY() == 140 || evt.getX() == 1055 && evt.getY() == 140 || evt.getX() == 1056 && evt.getY() == 140 || evt.getX() == 1057 && evt.getY() == 140 || evt.getX() == 1058 && evt.getY() == 140 || evt.getX() == 1059 && evt.getY() == 140 || evt.getX() == 1060 && evt.getY() == 140 || evt.getX() == 1061 && evt.getY() == 140 || evt.getX() == 1062 && evt.getY() == 140 || evt.getX() == 1063 && evt.getY() == 140 || evt.getX() == 1064 && evt.getY() == 140 || evt.getX() == 1065 && evt.getY() == 140 || evt.getX() == 1066 && evt.getY() == 140 || evt.getX() == 1067 && evt.getY() == 140 || evt.getX() == 1068 && evt.getY() == 140 || evt.getX() == 1069 && evt.getY() == 140 || evt.getX() == 1070 && evt.getY() == 140 || evt.getX() == 1071 && evt.getY() == 140 || evt.getX() == 1072 && evt.getY() == 140 || evt.getX() == 1073 && evt.getY() == 140 || evt.getX() == 1074 && evt.getY() == 140 || evt.getX() == 1075 && evt.getY() == 140 || evt.getX() == 1076 && evt.getY() == 140 || evt.getX() == 1077 && evt.getY() == 140 || evt.getX() == 1078 && evt.getY() == 140 || evt.getX() == 1079 && evt.getY() == 140 || evt.getX() == 1080 && evt.getY() == 140 || evt.getX() == 1081 && evt.getY() == 140 || evt.getX() == 1082 && evt.getY() == 140 || evt.getX() == 1083 && evt.getY() == 140 || evt.getX() == 1084 && evt.getY() == 140 || evt.getX() == 1085 && evt.getY() == 140 || evt.getX() == 1086 && evt.getY() == 140 || evt.getX() == 1087 && evt.getY() == 140 || evt.getX() == 1088 && evt.getY() == 140 || evt.getX() == 1089 && evt.getY() == 140 || evt.getX() == 1090 && evt.getY() == 140 || evt.getX() == 1091 && evt.getY() == 140 || evt.getX() == 1092 && evt.getY() == 140 || evt.getX() == 1093 && evt.getY() == 140 || evt.getX() == 1094 && evt.getY() == 140 || evt.getX() == 1095 && evt.getY() == 140 || evt.getX() == 1096 && evt.getY() == 140 || evt.getX() == 1097 && evt.getY() == 140 || evt.getX() == 1098 && evt.getY() == 140 || evt.getX() == 1099 && evt.getY() == 140 || evt.getX() == 1100 && evt.getY() == 140 || evt.getX() == 1101 && evt.getY() == 140 || evt.getX() == 1102 && evt.getY() == 140 || evt.getX() == 1103 && evt.getY() == 140 || evt.getX() == 1104 && evt.getY() == 140 || evt.getX() == 1105 && evt.getY() == 140 || evt.getX() == 1106 && evt.getY() == 140 || evt.getX() == 1107 && evt.getY() == 140 || evt.getX() == 1108 && evt.getY() == 140 || evt.getX() == 1109 && evt.getY() == 140 || evt.getX() == 1110 && evt.getY() == 140 || evt.getX() == 1111 && evt.getY() == 140 || evt.getX() == 1112 && evt.getY() == 140 || evt.getX() == 1113 && evt.getY() == 140 || evt.getX() == 1114 && evt.getY() == 140 || evt.getX() == 1115 && evt.getY() == 140 || evt.getX() == 1116 && evt.getY() == 140 || evt.getX() == 1117 && evt.getY() == 140 || evt.getX() == 1118 && evt.getY() == 140 || evt.getX() == 1119 && evt.getY() == 140 || evt.getX() == 1120 && evt.getY() == 140 || evt.getX() == 1121 && evt.getY() == 140 || evt.getX() == 1122 && evt.getY() == 140 || evt.getX() == 1123 && evt.getY() == 140 || evt.getX() == 1124 && evt.getY() == 140 || evt.getX() == 1125 && evt.getY() == 140 || evt.getX() == 1126 && evt.getY() == 140 || evt.getX() == 1127 && evt.getY() == 140 || evt.getX() == 1128 && evt.getY() == 140 || evt.getX() == 1129 && evt.getY() == 140 || evt.getX() == 1130 && evt.getY() == 140 || 
           evt.getX() == 1130 && evt.getY() == -110 || evt.getX() == 1130 && evt.getY() == -109 || evt.getX() == 1130 && evt.getY() == -108 || evt.getX() == 1130 && evt.getY() == -107 || evt.getX() == 1130 && evt.getY() == -106 || evt.getX() == 1130 && evt.getY() == -105 || evt.getX() == 1130 && evt.getY() == -104 || evt.getX() == 1130 && evt.getY() == -103 || evt.getX() == 1130 && evt.getY() == -102 || evt.getX() == 1130 && evt.getY() == -101 || evt.getX() == 1130 && evt.getY() == -100 || evt.getX() == 1130 && evt.getY() == -99 || evt.getX() == 1130 && evt.getY() == -98 || evt.getX() == 1130 && evt.getY() == -97 || evt.getX() == 1130 && evt.getY() == -96 || evt.getX() == 1130 && evt.getY() == -95 || evt.getX() == 1130 && evt.getY() == -94 || evt.getX() == 1130 && evt.getY() == -93 || evt.getX() == 1130 && evt.getY() == -92 || evt.getX() == 1130 && evt.getY() == -91 || evt.getX() == 1130 && evt.getY() == -90 || evt.getX() == 1130 && evt.getY() == -89 || evt.getX() == 1130 && evt.getY() == -88 || evt.getX() == 1130 && evt.getY() == -87 || evt.getX() == 1130 && evt.getY() == -86 || evt.getX() == 1130 && evt.getY() == -85 || evt.getX() == 1130 && evt.getY() == -84 || evt.getX() == 1130 && evt.getY() == -83 || evt.getX() == 1130 && evt.getY() == -82 || evt.getX() == 1130 && evt.getY() == -81 || evt.getX() == 1130 && evt.getY() == -80 || evt.getX() == 1130 && evt.getY() == -79 || evt.getX() == 1130 && evt.getY() == -78 || evt.getX() == 1130 && evt.getY() == -77 || evt.getX() == 1130 && evt.getY() == -76 || evt.getX() == 1130 && evt.getY() == -75 || evt.getX() == 1130 && evt.getY() == -74 || evt.getX() == 1130 && evt.getY() == -73 || evt.getX() == 1130 && evt.getY() == -72 || evt.getX() == 1130 && evt.getY() == -71 || evt.getX() == 1130 && evt.getY() == -70 || evt.getX() == 1130 && evt.getY() == -69 || evt.getX() == 1130 && evt.getY() == -68 || evt.getX() == 1130 && evt.getY() == -67 || evt.getX() == 1130 && evt.getY() == -66 || evt.getX() == 1130 && evt.getY() == -65 || evt.getX() == 1130 && evt.getY() == -64 || evt.getX() == 1130 && evt.getY() == -63 || evt.getX() == 1130 && evt.getY() == -62 || evt.getX() == 1130 && evt.getY() == -61 || evt.getX() == 1130 && evt.getY() == -60 || evt.getX() == 1130 && evt.getY() == -59 || evt.getX() == 1130 && evt.getY() == -58 || evt.getX() == 1130 && evt.getY() == -57 || evt.getX() == 1130 && evt.getY() == -56 || evt.getX() == 1130 && evt.getY() == -55 || evt.getX() == 1130 && evt.getY() == -54 || evt.getX() == 1130 && evt.getY() == -53 || evt.getX() == 1130 && evt.getY() == -52 || evt.getX() == 1130 && evt.getY() == -51 || evt.getX() == 1130 && evt.getY() == -50 || evt.getX() == 1130 && evt.getY() == -49 || evt.getX() == 1130 && evt.getY() == -48 || evt.getX() == 1130 && evt.getY() == -47 || evt.getX() == 1130 && evt.getY() == -46 || evt.getX() == 1130 && evt.getY() == -45 || evt.getX() == 1130 && evt.getY() == -44 || evt.getX() == 1130 && evt.getY() == -43 || evt.getX() == 1130 && evt.getY() == -42 || evt.getX() == 1130 && evt.getY() == -41 || evt.getX() == 1130 && evt.getY() == -40 || evt.getX() == 1130 && evt.getY() == -39 || evt.getX() == 1130 && evt.getY() == -38 || evt.getX() == 1130 && evt.getY() == -37 || evt.getX() == 1130 && evt.getY() == -36 || evt.getX() == 1130 && evt.getY() == -35 || evt.getX() == 1130 && evt.getY() == -34 || evt.getX() == 1130 && evt.getY() == -33 || evt.getX() == 1130 && evt.getY() == -32 || evt.getX() == 1130 && evt.getY() == -31 || evt.getX() == 1130 && evt.getY() == -30 || evt.getX() == 1130 && evt.getY() == -29 || evt.getX() == 1130 && evt.getY() == -28 || evt.getX() == 1130 && evt.getY() == -27 || evt.getX() == 1130 && evt.getY() == -26 || evt.getX() == 1130 && evt.getY() == -25 || evt.getX() == 1130 && evt.getY() == -24 || evt.getX() == 1130 && evt.getY() == -23 || evt.getX() == 1130 && evt.getY() == -22 || evt.getX() == 1130 && evt.getY() == -21 || evt.getX() == 1130 && evt.getY() == -20 || evt.getX() == 1130 && evt.getY() == -19 || evt.getX() == 1130 && evt.getY() == -18 || evt.getX() == 1130 && evt.getY() == -17 || evt.getX() == 1130 && evt.getY() == -16 || evt.getX() == 1130 && evt.getY() == -15 || evt.getX() == 1130 && evt.getY() == -14 || evt.getX() == 1130 && evt.getY() == -13 || evt.getX() == 1130 && evt.getY() == -12 || evt.getX() == 1130 && evt.getY() == -11 || evt.getX() == 1130 && evt.getY() == -10 || evt.getX() == 1130 && evt.getY() == -9 || evt.getX() == 1130 && evt.getY() == -8 || evt.getX() == 1130 && evt.getY() == -7 || evt.getX() == 1130 && evt.getY() == -6 || evt.getX() == 1130 && evt.getY() == -5 || evt.getX() == 1130 && evt.getY() == -4 || evt.getX() == 1130 && evt.getY() == -3 || evt.getX() == 1130 && evt.getY() == -2 || evt.getX() == 1130 && evt.getY() == -1 || evt.getX() == 1130 && evt.getY() == 0 || evt.getX() == 1130 && evt.getY() == 1 || evt.getX() == 1130 && evt.getY() == 2 || evt.getX() == 1130 && evt.getY() == 3 || evt.getX() == 1130 && evt.getY() == 4 || evt.getX() == 1130 && evt.getY() == 5 || evt.getX() == 1130 && evt.getY() == 6 || evt.getX() == 1130 && evt.getY() == 7 || evt.getX() == 1130 && evt.getY() == 8 || evt.getX() == 1130 && evt.getY() == 9 || evt.getX() == 1130 && evt.getY() == 10 || evt.getX() == 1130 && evt.getY() == 11 || evt.getX() == 1130 && evt.getY() == 12 || evt.getX() == 1130 && evt.getY() == 13 || evt.getX() == 1130 && evt.getY() == 14 || evt.getX() == 1130 && evt.getY() == 15 || evt.getX() == 1130 && evt.getY() == 16 || evt.getX() == 1130 && evt.getY() == 17 || evt.getX() == 1130 && evt.getY() == 18 || evt.getX() == 1130 && evt.getY() == 19 || evt.getX() == 1130 && evt.getY() == 20 || evt.getX() == 1130 && evt.getY() == 21 || evt.getX() == 1130 && evt.getY() == 22 || evt.getX() == 1130 && evt.getY() == 23 || evt.getX() == 1130 && evt.getY() == 24 || evt.getX() == 1130 && evt.getY() == 25 || evt.getX() == 1130 && evt.getY() == 26 || evt.getX() == 1130 && evt.getY() == 27 || evt.getX() == 1130 && evt.getY() == 28 || evt.getX() == 1130 && evt.getY() == 29 || evt.getX() == 1130 && evt.getY() == 30 || evt.getX() == 1130 && evt.getY() == 31 || evt.getX() == 1130 && evt.getY() == 32 || evt.getX() == 1130 && evt.getY() == 33 || evt.getX() == 1130 && evt.getY() == 34 || evt.getX() == 1130 && evt.getY() == 35 || evt.getX() == 1130 && evt.getY() == 36 || evt.getX() == 1130 && evt.getY() == 37 || evt.getX() == 1130 && evt.getY() == 38 || evt.getX() == 1130 && evt.getY() == 39 || evt.getX() == 1130 && evt.getY() == 40 || evt.getX() == 1130 && evt.getY() == 41 || evt.getX() == 1130 && evt.getY() == 42 || evt.getX() == 1130 && evt.getY() == 43 || evt.getX() == 1130 && evt.getY() == 44 || evt.getX() == 1130 && evt.getY() == 45 || evt.getX() == 1130 && evt.getY() == 46 || evt.getX() == 1130 && evt.getY() == 47 || evt.getX() == 1130 && evt.getY() == 48 || evt.getX() == 1130 && evt.getY() == 49 || evt.getX() == 1130 && evt.getY() == 50 || evt.getX() == 1130 && evt.getY() == 51 || evt.getX() == 1130 && evt.getY() == 52 || evt.getX() == 1130 && evt.getY() == 53 || evt.getX() == 1130 && evt.getY() == 54 || evt.getX() == 1130 && evt.getY() == 55 || evt.getX() == 1130 && evt.getY() == 56 || evt.getX() == 1130 && evt.getY() == 57 || evt.getX() == 1130 && evt.getY() == 58 || evt.getX() == 1130 && evt.getY() == 59 || evt.getX() == 1130 && evt.getY() == 60 || evt.getX() == 1130 && evt.getY() == 61 || evt.getX() == 1130 && evt.getY() == 62 || evt.getX() == 1130 && evt.getY() == 63 || evt.getX() == 1130 && evt.getY() == 64 || evt.getX() == 1130 && evt.getY() == 65 || evt.getX() == 1130 && evt.getY() == 66 || evt.getX() == 1130 && evt.getY() == 67 || evt.getX() == 1130 && evt.getY() == 68 || evt.getX() == 1130 && evt.getY() == 69 || evt.getX() == 1130 && evt.getY() == 70 || evt.getX() == 1130 && evt.getY() == 71 || evt.getX() == 1130 && evt.getY() == 72 || evt.getX() == 1130 && evt.getY() == 73 || evt.getX() == 1130 && evt.getY() == 74 || evt.getX() == 1130 && evt.getY() == 75 || evt.getX() == 1130 && evt.getY() == 76 || evt.getX() == 1130 && evt.getY() == 77 || evt.getX() == 1130 && evt.getY() == 78 || evt.getX() == 1130 && evt.getY() == 79 || evt.getX() == 1130 && evt.getY() == 80 || evt.getX() == 1130 && evt.getY() == 81 || evt.getX() == 1130 && evt.getY() == 82 || evt.getX() == 1130 && evt.getY() == 83 || evt.getX() == 1130 && evt.getY() == 84 || evt.getX() == 1130 && evt.getY() == 85 || evt.getX() == 1130 && evt.getY() == 86 || evt.getX() == 1130 && evt.getY() == 87 || evt.getX() == 1130 && evt.getY() == 88 || evt.getX() == 1130 && evt.getY() == 89 || evt.getX() == 1130 && evt.getY() == 90 || evt.getX() == 1130 && evt.getY() == 91 || evt.getX() == 1130 && evt.getY() == 92 || evt.getX() == 1130 && evt.getY() == 93 || evt.getX() == 1130 && evt.getY() == 94 || evt.getX() == 1130 && evt.getY() == 95 || evt.getX() == 1130 && evt.getY() == 96 || evt.getX() == 1130 && evt.getY() == 97 || evt.getX() == 1130 && evt.getY() == 98 || evt.getX() == 1130 && evt.getY() == 99 || evt.getX() == 1130 && evt.getY() == 100 || evt.getX() == 1130 && evt.getY() == 101 || evt.getX() == 1130 && evt.getY() == 102 || evt.getX() == 1130 && evt.getY() == 103 || evt.getX() == 1130 && evt.getY() == 104 || evt.getX() == 1130 && evt.getY() == 105 || evt.getX() == 1130 && evt.getY() == 106 || evt.getX() == 1130 && evt.getY() == 107 || evt.getX() == 1130 && evt.getY() == 108 || evt.getX() == 1130 && evt.getY() == 109 || evt.getX() == 1130 && evt.getY() == 110 || evt.getX() == 1130 && evt.getY() == 111 || evt.getX() == 1130 && evt.getY() == 112 || evt.getX() == 1130 && evt.getY() == 113 || evt.getX() == 1130 && evt.getY() == 114 || evt.getX() == 1130 && evt.getY() == 115 || evt.getX() == 1130 && evt.getY() == 116 || evt.getX() == 1130 && evt.getY() == 117 || evt.getX() == 1130 && evt.getY() == 118 || evt.getX() == 1130 && evt.getY() == 119 || evt.getX() == 1130 && evt.getY() == 120 || evt.getX() == 1130 && evt.getY() == 121 || evt.getX() == 1130 && evt.getY() == 122 || evt.getX() == 1130 && evt.getY() == 123 || evt.getX() == 1130 && evt.getY() == 124 || evt.getX() == 1130 && evt.getY() == 125 || evt.getX() == 1130 && evt.getY() == 126 || evt.getX() == 1130 && evt.getY() == 127 || evt.getX() == 1130 && evt.getY() == 128 || evt.getX() == 1130 && evt.getY() == 129 || evt.getX() == 1130 && evt.getY() == 130 || evt.getX() == 1130 && evt.getY() == 131 || evt.getX() == 1130 && evt.getY() == 132 || evt.getX() == 1130 && evt.getY() == 133 || evt.getX() == 1130 && evt.getY() == 134 || evt.getX() == 1130 && evt.getY() == 135 || evt.getX() == 1130 && evt.getY() == 136 || evt.getX() == 1130 && evt.getY() == 137 || evt.getX() == 1130 && evt.getY() == 138 || evt.getX() == 1130 && evt.getY() == 139 || evt.getX() == 1130 && evt.getY() == 140 || 
           evt.getX() == 630 && evt.getY() == -110 || evt.getX() == 631 && evt.getY() == -109 || evt.getX() == 632 && evt.getY() == -108 || evt.getX() == 633 && evt.getY() == -107 || evt.getX() == 634 && evt.getY() == -106 || evt.getX() == 635 && evt.getY() == -105 || evt.getX() == 636 && evt.getY() == -104 || evt.getX() == 637 && evt.getY() == -103 || evt.getX() == 638 && evt.getY() == -102 || evt.getX() == 639 && evt.getY() == -101 || evt.getX() == 640 && evt.getY() == -100 || evt.getX() == 641 && evt.getY() == -99 || evt.getX() == 642 && evt.getY() == -98 || evt.getX() == 643 && evt.getY() == -97 || evt.getX() == 644 && evt.getY() == -96 || evt.getX() == 645 && evt.getY() == -95 || evt.getX() == 646 && evt.getY() == -94 || evt.getX() == 647 && evt.getY() == -93 || evt.getX() == 648 && evt.getY() == -92 || evt.getX() == 649 && evt.getY() == -91 || evt.getX() == 650 && evt.getY() == -90 || evt.getX() == 651 && evt.getY() == -89 || evt.getX() == 652 && evt.getY() == -88 || evt.getX() == 653 && evt.getY() == -87 || evt.getX() == 654 && evt.getY() == -86 || evt.getX() == 655 && evt.getY() == -85 || evt.getX() == 656 && evt.getY() == -84 || evt.getX() == 657 && evt.getY() == -83 || evt.getX() == 658 && evt.getY() == -82 || evt.getX() == 659 && evt.getY() == -81 || evt.getX() == 660 && evt.getY() == -80 || evt.getX() == 661 && evt.getY() == -79 || evt.getX() == 662 && evt.getY() == -78 || evt.getX() == 663 && evt.getY() == -77 || evt.getX() == 664 && evt.getY() == -76 || evt.getX() == 665 && evt.getY() == -75 || evt.getX() == 666 && evt.getY() == -74 || evt.getX() == 667 && evt.getY() == -73 || evt.getX() == 668 && evt.getY() == -72 || evt.getX() == 669 && evt.getY() == -71 || evt.getX() == 670 && evt.getY() == -70 || evt.getX() == 671 && evt.getY() == -69 || evt.getX() == 672 && evt.getY() == -68 || evt.getX() == 673 && evt.getY() == -67 || evt.getX() == 674 && evt.getY() == -66 || evt.getX() == 675 && evt.getY() == -65 || evt.getX() == 676 && evt.getY() == -64 || evt.getX() == 677 && evt.getY() == -63 || evt.getX() == 678 && evt.getY() == -62 || evt.getX() == 679 && evt.getY() == -61 || evt.getX() == 680 && evt.getY() == -60 || evt.getX() == 681 && evt.getY() == -59 || evt.getX() == 682 && evt.getY() == -58 || evt.getX() == 683 && evt.getY() == -57 || evt.getX() == 684 && evt.getY() == -56 || evt.getX() == 685 && evt.getY() == -55 || evt.getX() == 686 && evt.getY() == -54 || evt.getX() == 687 && evt.getY() == -53 || evt.getX() == 688 && evt.getY() == -52 || evt.getX() == 689 && evt.getY() == -51 || evt.getX() == 690 && evt.getY() == -50 || evt.getX() == 691 && evt.getY() == -49 || evt.getX() == 692 && evt.getY() == -48 || evt.getX() == 693 && evt.getY() == -47 || evt.getX() == 694 && evt.getY() == -46 || evt.getX() == 695 && evt.getY() == -45 || evt.getX() == 696 && evt.getY() == -44 || evt.getX() == 697 && evt.getY() == -43 || evt.getX() == 698 && evt.getY() == -42 || evt.getX() == 699 && evt.getY() == -41 || evt.getX() == 700 && evt.getY() == -40 || evt.getX() == 701 && evt.getY() == -39 || evt.getX() == 702 && evt.getY() == -38 || evt.getX() == 703 && evt.getY() == -37 || evt.getX() == 704 && evt.getY() == -36 || evt.getX() == 705 && evt.getY() == -35 || evt.getX() == 706 && evt.getY() == -34 || evt.getX() == 707 && evt.getY() == -33 || evt.getX() == 708 && evt.getY() == -32 || evt.getX() == 709 && evt.getY() == -31 || evt.getX() == 710 && evt.getY() == -30 || evt.getX() == 711 && evt.getY() == -29 || evt.getX() == 712 && evt.getY() == -28 || evt.getX() == 713 && evt.getY() == -27 || evt.getX() == 714 && evt.getY() == -26 || evt.getX() == 715 && evt.getY() == -25 || evt.getX() == 716 && evt.getY() == -24 || evt.getX() == 717 && evt.getY() == -23 || evt.getX() == 718 && evt.getY() == -22 || evt.getX() == 719 && evt.getY() == -21 || evt.getX() == 720 && evt.getY() == -20 || evt.getX() == 721 && evt.getY() == -19 || evt.getX() == 722 && evt.getY() == -18 || evt.getX() == 723 && evt.getY() == -17 || evt.getX() == 724 && evt.getY() == -16 || evt.getX() == 725 && evt.getY() == -15 || evt.getX() == 726 && evt.getY() == -14 || evt.getX() == 727 && evt.getY() == -13 || evt.getX() == 728 && evt.getY() == -12 || evt.getX() == 729 && evt.getY() == -11 || evt.getX() == 730 && evt.getY() == -10 || evt.getX() == 731 && evt.getY() == -9 || evt.getX() == 732 && evt.getY() == -8 || evt.getX() == 733 && evt.getY() == -7 || evt.getX() == 734 && evt.getY() == -6 || evt.getX() == 735 && evt.getY() == -5 || evt.getX() == 736 && evt.getY() == -4 || evt.getX() == 737 && evt.getY() == -3 || evt.getX() == 738 && evt.getY() == -2 || evt.getX() == 739 && evt.getY() == -1 || evt.getX() == 740 && evt.getY() == 0 || evt.getX() == 741 && evt.getY() == 1 || evt.getX() == 742 && evt.getY() == 2 || evt.getX() == 743 && evt.getY() == 3 || evt.getX() == 744 && evt.getY() == 4 || evt.getX() == 745 && evt.getY() == 5 || evt.getX() == 746 && evt.getY() == 6 || evt.getX() == 747 && evt.getY() == 7 || evt.getX() == 748 && evt.getY() == 8 || evt.getX() == 749 && evt.getY() == 9 || evt.getX() == 750 && evt.getY() == 10 || evt.getX() == 751 && evt.getY() == 11 || evt.getX() == 752 && evt.getY() == 12 || evt.getX() == 753 && evt.getY() == 13 || evt.getX() == 754 && evt.getY() == 14 || evt.getX() == 755 && evt.getY() == 15 || evt.getX() == 756 && evt.getY() == 16 || evt.getX() == 757 && evt.getY() == 17 || evt.getX() == 758 && evt.getY() == 18 || evt.getX() == 759 && evt.getY() == 19 || evt.getX() == 760 && evt.getY() == 20 || evt.getX() == 761 && evt.getY() == 21 || evt.getX() == 762 && evt.getY() == 22 || evt.getX() == 763 && evt.getY() == 23 || evt.getX() == 764 && evt.getY() == 24 || evt.getX() == 765 && evt.getY() == 25 || evt.getX() == 766 && evt.getY() == 26 || evt.getX() == 767 && evt.getY() == 27 || evt.getX() == 768 && evt.getY() == 28 || evt.getX() == 769 && evt.getY() == 29 || evt.getX() == 770 && evt.getY() == 30 || evt.getX() == 771 && evt.getY() == 31 || evt.getX() == 772 && evt.getY() == 32 || evt.getX() == 773 && evt.getY() == 33 || evt.getX() == 774 && evt.getY() == 34 || evt.getX() == 775 && evt.getY() == 35 || evt.getX() == 776 && evt.getY() == 36 || evt.getX() == 777 && evt.getY() == 37 || evt.getX() == 778 && evt.getY() == 38 || evt.getX() == 779 && evt.getY() == 39 || evt.getX() == 780 && evt.getY() == 40 || evt.getX() == 781 && evt.getY() == 41 || evt.getX() == 782 && evt.getY() == 42 || evt.getX() == 783 && evt.getY() == 43 || evt.getX() == 784 && evt.getY() == 44 || evt.getX() == 785 && evt.getY() == 45 || evt.getX() == 786 && evt.getY() == 46 || evt.getX() == 787 && evt.getY() == 47 || evt.getX() == 788 && evt.getY() == 48 || evt.getX() == 789 && evt.getY() == 49 || evt.getX() == 790 && evt.getY() == 50 || evt.getX() == 791 && evt.getY() == 51 || evt.getX() == 792 && evt.getY() == 52 || evt.getX() == 793 && evt.getY() == 53 || evt.getX() == 794 && evt.getY() == 54 || evt.getX() == 795 && evt.getY() == 55 || evt.getX() == 796 && evt.getY() == 56 || evt.getX() == 797 && evt.getY() == 57 || evt.getX() == 798 && evt.getY() == 58 || evt.getX() == 799 && evt.getY() == 59 || evt.getX() == 800 && evt.getY() == 60 || evt.getX() == 801 && evt.getY() == 61 || evt.getX() == 802 && evt.getY() == 62 || evt.getX() == 803 && evt.getY() == 63 || evt.getX() == 804 && evt.getY() == 64 || evt.getX() == 805 && evt.getY() == 65 || evt.getX() == 806 && evt.getY() == 66 || evt.getX() == 807 && evt.getY() == 67 || evt.getX() == 808 && evt.getY() == 68 || evt.getX() == 809 && evt.getY() == 69 || evt.getX() == 810 && evt.getY() == 70 || evt.getX() == 811 && evt.getY() == 71 || evt.getX() == 812 && evt.getY() == 72 || evt.getX() == 813 && evt.getY() == 73 || evt.getX() == 814 && evt.getY() == 74 || evt.getX() == 815 && evt.getY() == 75 || evt.getX() == 816 && evt.getY() == 76 || evt.getX() == 817 && evt.getY() == 77 || evt.getX() == 818 && evt.getY() == 78 || evt.getX() == 819 && evt.getY() == 79 || evt.getX() == 820 && evt.getY() == 80 || evt.getX() == 821 && evt.getY() == 81 || evt.getX() == 822 && evt.getY() == 82 || evt.getX() == 823 && evt.getY() == 83 || evt.getX() == 824 && evt.getY() == 84 || evt.getX() == 825 && evt.getY() == 85 || evt.getX() == 826 && evt.getY() == 86 || evt.getX() == 827 && evt.getY() == 87 || evt.getX() == 828 && evt.getY() == 88 || evt.getX() == 829 && evt.getY() == 89 || evt.getX() == 830 && evt.getY() == 90 || evt.getX() == 831 && evt.getY() == 91 || evt.getX() == 832 && evt.getY() == 92 || evt.getX() == 833 && evt.getY() == 93 || evt.getX() == 834 && evt.getY() == 94 || evt.getX() == 835 && evt.getY() == 95 || evt.getX() == 836 && evt.getY() == 96 || evt.getX() == 837 && evt.getY() == 97 || evt.getX() == 838 && evt.getY() == 98 || evt.getX() == 839 && evt.getY() == 99 || evt.getX() == 840 && evt.getY() == 100 || evt.getX() == 841 && evt.getY() == 101 || evt.getX() == 842 && evt.getY() == 102 || evt.getX() == 843 && evt.getY() == 103 || evt.getX() == 844 && evt.getY() == 104 || evt.getX() == 845 && evt.getY() == 105 || evt.getX() == 846 && evt.getY() == 106 || evt.getX() == 847 && evt.getY() == 107 || evt.getX() == 848 && evt.getY() == 108 || evt.getX() == 849 && evt.getY() == 109 || evt.getX() == 850 && evt.getY() == 110 || evt.getX() == 851 && evt.getY() == 111 || evt.getX() == 852 && evt.getY() == 112 || evt.getX() == 853 && evt.getY() == 113 || evt.getX() == 854 && evt.getY() == 114 || evt.getX() == 855 && evt.getY() == 115 || evt.getX() == 856 && evt.getY() == 116 || evt.getX() == 857 && evt.getY() == 117 || evt.getX() == 858 && evt.getY() == 118 || evt.getX() == 859 && evt.getY() == 119 || evt.getX() == 860 && evt.getY() == 120 || evt.getX() == 861 && evt.getY() == 121 || evt.getX() == 862 && evt.getY() == 122 || evt.getX() == 863 && evt.getY() == 123 || evt.getX() == 864 && evt.getY() == 124 || evt.getX() == 865 && evt.getY() == 125 || evt.getX() == 866 && evt.getY() == 126 || evt.getX() == 867 && evt.getY() == 127 || evt.getX() == 868 && evt.getY() == 128 || evt.getX() == 869 && evt.getY() == 129 || evt.getX() == 870 && evt.getY() == 130 || evt.getX() == 871 && evt.getY() == 131 || evt.getX() == 872 && evt.getY() == 132 || evt.getX() == 873 && evt.getY() == 133 || evt.getX() == 874 && evt.getY() == 134 || evt.getX() == 875 && evt.getY() == 135 || evt.getX() == 876 && evt.getY() == 136 || evt.getX() == 877 && evt.getY() == 137 || evt.getX() == 878 && evt.getY() == 138 || evt.getX() == 879 && evt.getY() == 139 || evt.getX() == 880 && evt.getY() == 140 || evt.getX() == 881 && evt.getY() == 141 || evt.getX() == 882 && evt.getY() == 142 || evt.getX() == 883 && evt.getY() == 143 || evt.getX() == 884 && evt.getY() == 144 || evt.getX() == 885 && evt.getY() == 145 || evt.getX() == 886 && evt.getY() == 146 || evt.getX() == 887 && evt.getY() == 147 || evt.getX() == 888 && evt.getY() == 148 || evt.getX() == 889 && evt.getY() == 149 || evt.getX() == 890 && evt.getY() == 150 || evt.getX() == 891 && evt.getY() == 151 || evt.getX() == 892 && evt.getY() == 152 || evt.getX() == 893 && evt.getY() == 153 || evt.getX() == 894 && evt.getY() == 154 || evt.getX() == 895 && evt.getY() == 155 || evt.getX() == 896 && evt.getY() == 156 || evt.getX() == 897 && evt.getY() == 157 || evt.getX() == 898 && evt.getY() == 158 || evt.getX() == 899 && evt.getY() == 159 || evt.getX() == 900 && evt.getY() == 160 || evt.getX() == 901 && evt.getY() == 161 || evt.getX() == 902 && evt.getY() == 162 || evt.getX() == 903 && evt.getY() == 163 || evt.getX() == 904 && evt.getY() == 164 || evt.getX() == 905 && evt.getY() == 165 || evt.getX() == 906 && evt.getY() == 166 || evt.getX() == 907 && evt.getY() == 167 || evt.getX() == 908 && evt.getY() == 168 || evt.getX() == 909 && evt.getY() == 169 || evt.getX() == 910 && evt.getY() == 170 || evt.getX() == 911 && evt.getY() == 171 || evt.getX() == 912 && evt.getY() == 172 || evt.getX() == 913 && evt.getY() == 173 || evt.getX() == 914 && evt.getY() == 174 || evt.getX() == 915 && evt.getY() == 175 || evt.getX() == 916 && evt.getY() == 176 || evt.getX() == 917 && evt.getY() == 177 || evt.getX() == 918 && evt.getY() == 178 || evt.getX() == 919 && evt.getY() == 179 || evt.getX() == 920 && evt.getY() == 180 || evt.getX() == 921 && evt.getY() == 181 || evt.getX() == 922 && evt.getY() == 182 || evt.getX() == 923 && evt.getY() == 183 || evt.getX() == 924 && evt.getY() == 184 || evt.getX() == 925 && evt.getY() == 185 || evt.getX() == 926 && evt.getY() == 186 || evt.getX() == 927 && evt.getY() == 187 || evt.getX() == 928 && evt.getY() == 188 || evt.getX() == 929 && evt.getY() == 189 || evt.getX() == 930 && evt.getY() == 190 || evt.getX() == 931 && evt.getY() == 191 || evt.getX() == 932 && evt.getY() == 192 || evt.getX() == 933 && evt.getY() == 193 || evt.getX() == 934 && evt.getY() == 194 || evt.getX() == 935 && evt.getY() == 195 || evt.getX() == 936 && evt.getY() == 196 || evt.getX() == 937 && evt.getY() == 197 || evt.getX() == 938 && evt.getY() == 198 || evt.getX() == 939 && evt.getY() == 199 || evt.getX() == 940 && evt.getY() == 200 || evt.getX() == 941 && evt.getY() == 201 || evt.getX() == 942 && evt.getY() == 202 || evt.getX() == 943 && evt.getY() == 203 || evt.getX() == 944 && evt.getY() == 204 || evt.getX() == 945 && evt.getY() == 205 || evt.getX() == 946 && evt.getY() == 206 || evt.getX() == 947 && evt.getY() == 207 || evt.getX() == 948 && evt.getY() == 208 || evt.getX() == 949 && evt.getY() == 209 || evt.getX() == 950 && evt.getY() == 210 || evt.getX() == 951 && evt.getY() == 211 || evt.getX() == 952 && evt.getY() == 212 || evt.getX() == 953 && evt.getY() == 213 || evt.getX() == 954 && evt.getY() == 214 || evt.getX() == 955 && evt.getY() == 215 || evt.getX() == 956 && evt.getY() == 216 || evt.getX() == 957 && evt.getY() == 217 || evt.getX() == 958 && evt.getY() == 218 || evt.getX() == 959 && evt.getY() == 219 || evt.getX() == 960 && evt.getY() == 220 || evt.getX() == 961 && evt.getY() == 221 || evt.getX() == 962 && evt.getY() == 222 || evt.getX() == 963 && evt.getY() == 223 || evt.getX() == 964 && evt.getY() == 224 || evt.getX() == 965 && evt.getY() == 225 || evt.getX() == 966 && evt.getY() == 226 || evt.getX() == 967 && evt.getY() == 227 || evt.getX() == 968 && evt.getY() == 228 || evt.getX() == 969 && evt.getY() == 229 || evt.getX() == 970 && evt.getY() == 230 || evt.getX() == 971 && evt.getY() == 231 || evt.getX() == 972 && evt.getY() == 232 || evt.getX() == 973 && evt.getY() == 233 || evt.getX() == 974 && evt.getY() == 234 || evt.getX() == 975 && evt.getY() == 235 || evt.getX() == 976 && evt.getY() == 236 || evt.getX() == 977 && evt.getY() == 237 || evt.getX() == 978 && evt.getY() == 238 || evt.getX() == 979 && evt.getY() == 239 || evt.getX() == 980 && evt.getY() == 240 || evt.getX() == 981 && evt.getY() == 241 || evt.getX() == 982 && evt.getY() == 242 || evt.getX() == 983 && evt.getY() == 243 || evt.getX() == 984 && evt.getY() == 244 || evt.getX() == 985 && evt.getY() == 245 || evt.getX() == 986 && evt.getY() == 246 || evt.getX() == 987 && evt.getY() == 247 || evt.getX() == 988 && evt.getY() == 248 || evt.getX() == 989 && evt.getY() == 249 || evt.getX() == 990 && evt.getY() == 250 || evt.getX() == 991 && evt.getY() == 251 || evt.getX() == 992 && evt.getY() == 252 || evt.getX() == 993 && evt.getY() == 253 || evt.getX() == 994 && evt.getY() == 254 || evt.getX() == 995 && evt.getY() == 255 || evt.getX() == 996 && evt.getY() == 256 || evt.getX() == 997 && evt.getY() == 257 || evt.getX() == 998 && evt.getY() == 258 || evt.getX() == 999 && evt.getY() == 259 || evt.getX() == 1000 && evt.getY() == 260 || evt.getX() == 1001 && evt.getY() == 261 || evt.getX() == 1002 && evt.getY() == 262 || evt.getX() == 1003 && evt.getY() == 263 || evt.getX() == 1004 && evt.getY() == 264 || evt.getX() == 1005 && evt.getY() == 265 || evt.getX() == 1006 && evt.getY() == 266 || evt.getX() == 1007 && evt.getY() == 267 || evt.getX() == 1008 && evt.getY() == 268 || evt.getX() == 1009 && evt.getY() == 269 || evt.getX() == 1010 && evt.getY() == 270 || evt.getX() == 1011 && evt.getY() == 271 || evt.getX() == 1012 && evt.getY() == 272 || evt.getX() == 1013 && evt.getY() == 273 || evt.getX() == 1014 && evt.getY() == 274 || evt.getX() == 1015 && evt.getY() == 275 || evt.getX() == 1016 && evt.getY() == 276 || evt.getX() == 1017 && evt.getY() == 277 || evt.getX() == 1018 && evt.getY() == 278 || evt.getX() == 1019 && evt.getY() == 279 || evt.getX() == 1020 && evt.getY() == 280 || evt.getX() == 1021 && evt.getY() == 281 || evt.getX() == 1022 && evt.getY() == 282 || evt.getX() == 1023 && evt.getY() == 283 || evt.getX() == 1024 && evt.getY() == 284 || evt.getX() == 1025 && evt.getY() == 285 || evt.getX() == 1026 && evt.getY() == 286 || evt.getX() == 1027 && evt.getY() == 287 || evt.getX() == 1028 && evt.getY() == 288 || evt.getX() == 1029 && evt.getY() == 289 || evt.getX() == 1030 && evt.getY() == 290 || evt.getX() == 1031 && evt.getY() == 291 || evt.getX() == 1032 && evt.getY() == 292 || evt.getX() == 1033 && evt.getY() == 293 || evt.getX() == 1034 && evt.getY() == 294 || evt.getX() == 1035 && evt.getY() == 295 || evt.getX() == 1036 && evt.getY() == 296 || evt.getX() == 1037 && evt.getY() == 297 || evt.getX() == 1038 && evt.getY() == 298 || evt.getX() == 1039 && evt.getY() == 299 || evt.getX() == 1040 && evt.getY() == 300 || evt.getX() == 1041 && evt.getY() == 301 || evt.getX() == 1042 && evt.getY() == 302 || evt.getX() == 1043 && evt.getY() == 303 || evt.getX() == 1044 && evt.getY() == 304 || evt.getX() == 1045 && evt.getY() == 305 || evt.getX() == 1046 && evt.getY() == 306 || evt.getX() == 1047 && evt.getY() == 307 || evt.getX() == 1048 && evt.getY() == 308 || evt.getX() == 1049 && evt.getY() == 309 || evt.getX() == 1050 && evt.getY() == 310 || evt.getX() == 1051 && evt.getY() == 311 || evt.getX() == 1052 && evt.getY() == 312 || evt.getX() == 1053 && evt.getY() == 313 || evt.getX() == 1054 && evt.getY() == 314 || evt.getX() == 1055 && evt.getY() == 315 || evt.getX() == 1056 && evt.getY() == 316 || evt.getX() == 1057 && evt.getY() == 317 || evt.getX() == 1058 && evt.getY() == 318 || evt.getX() == 1059 && evt.getY() == 319 || evt.getX() == 1060 && evt.getY() == 320 || evt.getX() == 1061 && evt.getY() == 321 || evt.getX() == 1062 && evt.getY() == 322 || evt.getX() == 1063 && evt.getY() == 323 || evt.getX() == 1064 && evt.getY() == 324 || evt.getX() == 1065 && evt.getY() == 325 || evt.getX() == 1066 && evt.getY() == 326 || evt.getX() == 1067 && evt.getY() == 327 || evt.getX() == 1068 && evt.getY() == 328 || evt.getX() == 1069 && evt.getY() == 329 || evt.getX() == 1070 && evt.getY() == 330 || evt.getX() == 1071 && evt.getY() == 331 || evt.getX() == 1072 && evt.getY() == 332 || evt.getX() == 1073 && evt.getY() == 333 || evt.getX() == 1074 && evt.getY() == 334 || evt.getX() == 1075 && evt.getY() == 335 || evt.getX() == 1076 && evt.getY() == 336 || evt.getX() == 1077 && evt.getY() == 337 || evt.getX() == 1078 && evt.getY() == 338 || evt.getX() == 1079 && evt.getY() == 339 || evt.getX() == 1080 && evt.getY() == 340 || evt.getX() == 1081 && evt.getY() == 341 || evt.getX() == 1082 && evt.getY() == 342 || evt.getX() == 1083 && evt.getY() == 343 || evt.getX() == 1084 && evt.getY() == 344 || evt.getX() == 1085 && evt.getY() == 345 || evt.getX() == 1086 && evt.getY() == 346 || evt.getX() == 1087 && evt.getY() == 347 || evt.getX() == 1088 && evt.getY() == 348 || evt.getX() == 1089 && evt.getY() == 349 || evt.getX() == 1090 && evt.getY() == 350 || evt.getX() == 1091 && evt.getY() == 351 || evt.getX() == 1092 && evt.getY() == 352 || evt.getX() == 1093 && evt.getY() == 353 || evt.getX() == 1094 && evt.getY() == 354 || evt.getX() == 1095 && evt.getY() == 355 || evt.getX() == 1096 && evt.getY() == 356 || evt.getX() == 1097 && evt.getY() == 357 || evt.getX() == 1098 && evt.getY() == 358 || evt.getX() == 1099 && evt.getY() == 359 || evt.getX() == 1100 && evt.getY() == 360 || evt.getX() == 1101 && evt.getY() == 361 || evt.getX() == 1102 && evt.getY() == 362 || evt.getX() == 1103 && evt.getY() == 363 || evt.getX() == 1104 && evt.getY() == 364 || evt.getX() == 1105 && evt.getY() == 365 || evt.getX() == 1106 && evt.getY() == 366 || evt.getX() == 1107 && evt.getY() == 367 || evt.getX() == 1108 && evt.getY() == 368 || evt.getX() == 1109 && evt.getY() == 369 || evt.getX() == 1110 && evt.getY() == 370 || evt.getX() == 1111 && evt.getY() == 371 || evt.getX() == 1112 && evt.getY() == 372 || evt.getX() == 1113 && evt.getY() == 373 || evt.getX() == 1114 && evt.getY() == 374 || evt.getX() == 1115 && evt.getY() == 375 || evt.getX() == 1116 && evt.getY() == 376 || evt.getX() == 1117 && evt.getY() == 377 || evt.getX() == 1118 && evt.getY() == 378 || evt.getX() == 1119 && evt.getY() == 379 || evt.getX() == 1120 && evt.getY() == 380 || evt.getX() == 1121 && evt.getY() == 381 || evt.getX() == 1122 && evt.getY() == 382 || evt.getX() == 1123 && evt.getY() == 383 || evt.getX() == 1124 && evt.getY() == 384 || evt.getX() == 1125 && evt.getY() == 385 || evt.getX() == 1126 && evt.getY() == 386 || evt.getX() == 1127 && evt.getY() == 387 || evt.getX() == 1128 && evt.getY() == 388 || evt.getX() == 1129 && evt.getY() == 389 || evt.getX() == 1130 && evt.getY() == 390)
        {
            JOptionPane.showMessageDialog(null, "asasdasd");
        }
        */
    }//GEN-LAST:event_lblMonoMouseDragged

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Dialogo.setSize(576, 259);
        Dialogo.setLocationRelativeTo(null);
        Dialogo.setVisible(true);
        Dialogo.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        Congratulation.setSize(300, 120);
        Congratulation.setLocationRelativeTo(null);
        Congratulation.setVisible(true);
        Congratulation.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Animales2 a = new Animales2();
        a.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Incorrect.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Right.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Congratulation.dispose();
        
        Facil F = new Facil();
        F.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void IncorrectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IncorrectKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Right.dispose();
        }
    }//GEN-LAST:event_IncorrectKeyPressed

    private void RightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RightKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Right.dispose();
        }
    }//GEN-LAST:event_RightKeyPressed

    private void CongratulationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CongratulationKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Congratulation.dispose();
            
            Facil F = new Facil();
            F.setVisible(true);
        
            this.dispose();
        }
    }//GEN-LAST:event_CongratulationKeyPressed

    private void DialogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DialogoKeyPressed
        if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_ENTER)
        {
            SplashSalir v = new SplashSalir();
            v.setVisible(true);

            Dialogo.dispose();
            this.dispose();
        }
    }//GEN-LAST:event_DialogoKeyPressed

    private void lblPaisaje1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaisaje1MouseClicked
        Incorrecto();
    }//GEN-LAST:event_lblPaisaje1MouseClicked

    private void lblPaisaje2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaisaje2MouseClicked
        Incorrecto();
    }//GEN-LAST:event_lblPaisaje2MouseClicked

    private void lblPaisaje3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaisaje3MouseClicked
        Correcto();
    }//GEN-LAST:event_lblPaisaje3MouseClicked

    private void lblPaisaje4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPaisaje4MouseClicked
        Incorrecto();
    }//GEN-LAST:event_lblPaisaje4MouseClicked

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
            java.util.logging.Logger.getLogger(Animales_Juego7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animales_Juego7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animales_Juego7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animales_Juego7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Animales_Juego7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Congratulation;
    private javax.swing.JDialog Dialogo;
    private javax.swing.JDialog Incorrect;
    private javax.swing.JDialog Right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMono;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPaisaje1;
    private javax.swing.JLabel lblPaisaje2;
    private javax.swing.JLabel lblPaisaje3;
    private javax.swing.JLabel lblPaisaje4;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblSiguiente;
    // End of variables declaration//GEN-END:variables
}
