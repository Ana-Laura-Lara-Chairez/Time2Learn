package Time2Learn;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dee Dee Gtz
 */
public class Profesiones_Game extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    
    public Profesiones_Game() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Professions");
        
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
        
        //Imagen de Regresar
        ImageIcon Regresar = new ImageIcon(RutaImagenes + "Icono_Regresar.png");
        Icon ImageRegresar = new ImageIcon(Regresar.getImage().getScaledInstance(lblRegresar.getWidth(), lblRegresar.getHeight(), Image.SCALE_DEFAULT));
        lblRegresar.setIcon(ImageRegresar);
        
        //Imagen del Cruci
        ImageIcon Cruci = new ImageIcon(RutaImagenes + "Cruci.png");
        Icon ImageCruci = new ImageIcon(Cruci.getImage().getScaledInstance(lblCruci.getWidth(), lblCruci.getHeight(), Image.SCALE_DEFAULT));
        lblCruci.setIcon(ImageCruci);
        
        //Imagen del Uno
        ImageIcon Uno = new ImageIcon(RutaImagenes + "Crucigrama_Uno.png");
        Icon ImageUno = new ImageIcon(Uno.getImage().getScaledInstance(lblUno.getWidth(), lblUno.getHeight(), Image.SCALE_DEFAULT));
        lblUno.setIcon(ImageUno);

        //Imagen del Dos
        ImageIcon Dos = new ImageIcon(RutaImagenes + "Crucigrama_Dos.png");
        Icon ImageDos = new ImageIcon(Dos.getImage().getScaledInstance(lblDos.getWidth(), lblDos.getHeight(), Image.SCALE_DEFAULT));
        lblDos.setIcon(ImageDos);
        
        //Imagen del Tres
        ImageIcon Tres = new ImageIcon(RutaImagenes + "Crucigrama_Tres.png");
        Icon ImageTres = new ImageIcon(Tres.getImage().getScaledInstance(lblTres.getWidth(), lblTres.getHeight(), Image.SCALE_DEFAULT));
        lblTres.setIcon(ImageTres);
        
        //Imagen del Cuatro
        ImageIcon Cuatro = new ImageIcon(RutaImagenes + "Crucigrama_Cuatro.png");
        Icon ImageCuatro = new ImageIcon(Cuatro.getImage().getScaledInstance(lblCuatro.getWidth(), lblCuatro.getHeight(), Image.SCALE_DEFAULT));
        lblCuatro.setIcon(ImageCuatro);
        
        //Imagen del Cinco
        ImageIcon Cinco = new ImageIcon(RutaImagenes + "Crucigrama_Cinco.png");
        Icon ImageCinco = new ImageIcon(Cinco.getImage().getScaledInstance(lblCinco.getWidth(), lblCinco.getHeight(), Image.SCALE_DEFAULT));
        lblCinco.setIcon(ImageCinco);
        
        //Imagen del Seis
        ImageIcon Seis = new ImageIcon(RutaImagenes + "Crucigrama_Seis.png");
        Icon ImageSeis = new ImageIcon(Seis.getImage().getScaledInstance(lblSeis.getWidth(), lblSeis.getHeight(), Image.SCALE_DEFAULT));
        lblSeis.setIcon(ImageSeis);
        
        //Imagen del Siete
        ImageIcon Siete = new ImageIcon(RutaImagenes + "Crucigrama_Siete.png");
        Icon ImageSiete = new ImageIcon(Siete.getImage().getScaledInstance(lblSiete.getWidth(), lblSiete.getHeight(), Image.SCALE_DEFAULT));
        lblSiete.setIcon(ImageSiete);
        
        //Imagen del Ocho
        ImageIcon Ocho = new ImageIcon(RutaImagenes + "Crucigrama_Ocho.png");
        Icon ImageOcho = new ImageIcon(Ocho.getImage().getScaledInstance(lblOcho.getWidth(), lblOcho.getHeight(), Image.SCALE_DEFAULT));
        lblOcho.setIcon(ImageOcho);
        
        //Imagen de Comprobar
        ImageIcon Comprobar = new ImageIcon(RutaImagenes + "Comprobar.png");
        Icon ImageComprobar = new ImageIcon(Comprobar.getImage().getScaledInstance(lblComprobar.getWidth(), lblComprobar.getHeight(), Image.SCALE_DEFAULT));
        lblComprobar.setIcon(ImageComprobar);
        
        //Imagen de Instrucciones
        ImageIcon Instrucciones = new ImageIcon(RutaImagenes + "Crucigrama_Palabras.png");
        Icon ImageInstrucciones = new ImageIcon(Instrucciones.getImage().getScaledInstance(lblInstrucciones.getWidth(), lblInstrucciones.getHeight(), Image.SCALE_DEFAULT));
        lblInstrucciones.setIcon(ImageInstrucciones);
        
        //Imagen de Instrucciones
        ImageIcon Instrucciones2 = new ImageIcon(RutaImagenes + "Instrucciones.png");
        Icon ImageInstrucciones2 = new ImageIcon(Instrucciones2.getImage().getScaledInstance(lblInstrucciones2.getWidth(), lblInstrucciones2.getHeight(), Image.SCALE_DEFAULT));
        lblInstrucciones2.setIcon(ImageInstrucciones2);
        
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

        Instrucciones = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        lblInstruccion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Dialogo = new javax.swing.JDialog();
        lblNo = new javax.swing.JLabel();
        lblSi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Congratulation = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        txt24 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        txt28 = new javax.swing.JTextField();
        txt29 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt31 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt34 = new javax.swing.JTextField();
        txt35 = new javax.swing.JTextField();
        txt36 = new javax.swing.JTextField();
        txt37 = new javax.swing.JTextField();
        txt38 = new javax.swing.JTextField();
        txt39 = new javax.swing.JTextField();
        txt40 = new javax.swing.JTextField();
        txt41 = new javax.swing.JTextField();
        txt42 = new javax.swing.JTextField();
        txt43 = new javax.swing.JTextField();
        txt44 = new javax.swing.JTextField();
        txt45 = new javax.swing.JTextField();
        txt46 = new javax.swing.JTextField();
        txt47 = new javax.swing.JTextField();
        txt48 = new javax.swing.JTextField();
        txt49 = new javax.swing.JTextField();
        txt50 = new javax.swing.JTextField();
        txt51 = new javax.swing.JTextField();
        txt52 = new javax.swing.JTextField();
        txt53 = new javax.swing.JTextField();
        txt54 = new javax.swing.JTextField();
        txt55 = new javax.swing.JTextField();
        txt56 = new javax.swing.JTextField();
        txt57 = new javax.swing.JTextField();
        txt58 = new javax.swing.JTextField();
        txt59 = new javax.swing.JTextField();
        txt61 = new javax.swing.JTextField();
        txt62 = new javax.swing.JTextField();
        txt60 = new javax.swing.JTextField();
        txt64 = new javax.swing.JTextField();
        txt66 = new javax.swing.JTextField();
        txt63 = new javax.swing.JTextField();
        lblCruci = new javax.swing.JLabel();
        lblUno = new javax.swing.JLabel();
        lblDos = new javax.swing.JLabel();
        lblTres = new javax.swing.JLabel();
        lblCuatro = new javax.swing.JLabel();
        lblCinco = new javax.swing.JLabel();
        lblSeis = new javax.swing.JLabel();
        lblSiete = new javax.swing.JLabel();
        lblOcho = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        lblComprobar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblInstrucciones = new javax.swing.JLabel();
        lblInstrucciones2 = new javax.swing.JLabel();

        Instrucciones.setModal(true);
        Instrucciones.setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        lblInstruccion.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        lblInstruccion.setText("<html><body><p align='center'>Complete the crossword with the words in the right, you have to put the answer in english and with CAPITAL LETTERS.</p>");

        jButton1.setText("Okey");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstruccion, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout InstruccionesLayout = new javax.swing.GroupLayout(Instrucciones.getContentPane());
        Instrucciones.getContentPane().setLayout(InstruccionesLayout);
        InstruccionesLayout.setHorizontalGroup(
            InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InstruccionesLayout.setVerticalGroup(
            InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        Congratulation.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Congratulation.setAlwaysOnTop(true);
        Congratulation.setModalExclusionType(null);
        Congratulation.setUndecorated(true);
        Congratulation.setResizable(false);
        Congratulation.setType(java.awt.Window.Type.POPUP);
        Congratulation.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        Congratulation.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 50, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Congratulations.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        Congratulation.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 120));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 217, 234));

        lblMenu.setText("Menu");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setBorder(null);

        txt3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt12.setEditable(false);
        txt12.setBackground(new java.awt.Color(255, 217, 102));
        txt12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt15ActionPerformed(evt);
            }
        });

        txt16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt20KeyPressed(evt);
            }
        });

        txt21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt27.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt28ActionPerformed(evt);
            }
        });

        txt29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt29.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt30.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt30.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt31.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt32.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt33.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt33.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt34.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt34.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt35.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt35.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt36.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt36.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt37.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt37.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt38.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt38.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt39.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt39.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt40.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt40.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt41.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt41.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt42.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt42.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt43.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt43.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt44.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt44.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt45.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt45ActionPerformed(evt);
            }
        });
        txt45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt45KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt45KeyReleased(evt);
            }
        });

        txt46.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt46.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt47.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt47.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt48.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt48.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt49.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt49.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt50.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt50.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt51.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt51.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt52.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt52.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt53.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt53.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt54.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt54.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt55.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt55.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt56.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt56.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt57.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt57.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt58.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt58.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt59.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt59.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt61.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt61.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt62.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt62.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt60.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt60.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt64.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt64.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt66.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt66.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt63.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt63.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCruci.setText("jLabel1");

        lblUno.setText("1");

        lblDos.setText("2");

        lblTres.setText("3");

        lblCuatro.setText("4");

        lblCinco.setText("5");

        lblSeis.setText("6");

        lblSiete.setText("7");

        lblOcho.setText("8");

        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        lblComprobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprobarMouseClicked(evt);
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

        lblInstrucciones2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInstrucciones2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInstrucciones2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(278, 278, 278)
                        .addComponent(lblCruci, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lblCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTres, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(txt64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)
                                        .addComponent(txt59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblInstrucciones2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(1148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCruci, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txt58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(96, 96, 96)
                                        .addComponent(lblInstrucciones2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
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

    private void txt45KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt45KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt45KeyReleased

    private void txt45KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt45KeyPressed
        
    }//GEN-LAST:event_txt45KeyPressed

    private void txt20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt20KeyPressed
        
    }//GEN-LAST:event_txt20KeyPressed

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        Profesiones v = new Profesiones();
        v.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Dialogo.setSize(576, 259);
        Dialogo.setLocationRelativeTo(null);
        Dialogo.setVisible(true);
        Dialogo.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void txt45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt45ActionPerformed

    private void txt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt15ActionPerformed

    private void txt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt28ActionPerformed

    private void lblComprobarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprobarMouseClicked
        if(txt2.getText().equals("C"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt3.getText().equals("O"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt4.getText().equals("N"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt5.getText().equals("S"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt6.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt7.getText().equals("R"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt8.getText().equals("U"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt9.getText().equals("C"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt10.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt11.getText().equals("N"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt13.getText().equals("W"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt14.getText().equals("O"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        
        if(txt15.getText().equals("F"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        
        if(txt16.getText().equals("R"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt17.getText().equals("R"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt20.getText().equals("I"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt21.getText().equals("A"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt22.getText().equals("R"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt23.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt24.getText().equals("N"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt25.getText().equals("D"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt26.getText().equals("U"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt27.getText().equals("A"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt28.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        
        if(txt29.getText().equals("O"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt30.getText().equals("C"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt31.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt32.getText().equals("O"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt33.getText().equals("R"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt34.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt35.getText().equals("I"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt36.getText().equals("S"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt37.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt38.getText().equals("A"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt39.getText().equals("E"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt40.getText().equals("E"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt41.getText().equals("C"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt42.getText().equals("C"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt43.getText().equals("I"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt44.getText().equals("L"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt45.getText().equals("E"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
                
        if(txt46.getText().equals("P"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt47.getText().equals("F"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt48.getText().equals("I"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt49.getText().equals("E"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt50.getText().equals("S"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt51.getText().equals("R"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt52.getText().equals("U"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt53.getText().equals("O"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt54.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt55.getText().equals("E"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt56.getText().equals("E"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt57.getText().equals("G"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt58.getText().equals("H"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt59.getText().equals("K"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt60.getText().equals("R"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt61.getText().equals("T"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt62.getText().equals("I"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt63.getText().equals("H"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt64.getText().equals("E"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt66.getText().equals("R"))
        {
            //JOptionPane.showMessageDialog(null, "Asdasd");
            txt66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}
        
        if(txt2.getText().equals("C") && txt3.getText().equals("O") && txt4.getText().equals("N") && txt5.getText().equals("S") && txt6.getText().equals("T")  && txt7.getText().equals("R") && txt8.getText().equals("U") && txt9.getText().equals("C") && txt10.getText().equals("T") && txt11.getText().equals("N") && txt13.getText().equals("W") && txt14.getText().equals("O") && txt15.getText().equals("F") && txt16.getText().equals("R") && txt17.getText().equals("R") && txt20.getText().equals("I") && txt21.getText().equals("A") && txt22.getText().equals("R") && txt23.getText().equals("T") && txt24.getText().equals("N") && txt25.getText().equals("D") && txt26.getText().equals("U") && txt27.getText().equals("A") && txt28.getText().equals("T") && txt29.getText().equals("O") && txt30.getText().equals("C") && txt31.getText().equals("T") && txt32.getText().equals("O") && txt33.getText().equals("R") && txt34.getText().equals("T") && txt35.getText().equals("I") && txt36.getText().equals("S") && txt37.getText().equals("T") && txt38.getText().equals("A") && txt39.getText().equals("E") && txt40.getText().equals("E") && txt41.getText().equals("C") && txt42.getText().equals("C") && txt43.getText().equals("I") && txt44.getText().equals("L") && txt45.getText().equals("E") && txt46.getText().equals("P") && txt47.getText().equals("F") && txt48.getText().equals("I") && txt49.getText().equals("E") && txt50.getText().equals("S") && txt51.getText().equals("R") && txt52.getText().equals("U") && txt53.getText().equals("O") && txt54.getText().equals("T") && txt55.getText().equals("E") && txt56.getText().equals("E") && txt57.getText().equals("G") && txt58.getText().equals("H") && txt59.getText().equals("K") && txt60.getText().equals("R") && txt61.getText().equals("T") && txt62.getText().equals("I") && txt63.getText().equals("H") && txt64.getText().equals("E") && txt66.getText().equals("R"))
        {
            String SQL;
        Conexion mibasededatos = new Conexion();
        Connection con=mibasededatos.getConnection();
        Statement st;
        
        Registro v = new Registro();
             //UPDATE `puntaje` SET `Animales` = '1' WHERE `puntaje`.`Nombre` = 'Usuario2'

        SQL = "UPDATE `puntaje` SET `Profesiones` = '" + 1 + "' WHERE `puntaje`.`Nombre` = '" + v.Nombre + "'";  
        
        try {
            st = con.createStatement();
            st.executeUpdate(SQL);
            con.close();
            st.close();
           //System.out.println("Insertado con exito");
           JOptionPane.showMessageDialog(null, "Your progress has been increased " + v.Nombre);
                    
        }catch (SQLException e){
            
            System.out.println("Error en la conexion"+ SQL + "y el error es "+ e);
            JOptionPane.showMessageDialog(null, "Ha habido un error al subir su progreso " + v.Nombre + ". El error es "+ e );
        }
        
            Congratulation.setSize(300, 120);
            Congratulation.setLocationRelativeTo(null);
            Congratulation.setVisible(true);
            Congratulation.setBackground(new Color (0, 0, 0, 0));
        }
        else
        {
            ImageIcon Mensaje = new ImageIcon(RutaImagenes + "Carita Triste.png");
            Icon ImageMensaje = new ImageIcon(Mensaje.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        
            JOptionPane.showMessageDialog(null, "Try Again!!", "Warning!", JOptionPane.INFORMATION_MESSAGE, ImageMensaje);
        }
        
        
    }//GEN-LAST:event_lblComprobarMouseClicked

    private void lblInstrucciones2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInstrucciones2MouseClicked
        Instrucciones.setLocation(500, 300);
        Instrucciones.setSize(450, 157);
        Instrucciones.setVisible(true);
    }//GEN-LAST:event_lblInstrucciones2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Instrucciones.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Congratulation.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Profesiones_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesiones_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesiones_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesiones_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Profesiones_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Congratulation;
    private javax.swing.JDialog Dialogo;
    private javax.swing.JDialog Instrucciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCinco;
    private javax.swing.JLabel lblComprobar;
    private javax.swing.JLabel lblCruci;
    private javax.swing.JLabel lblCuatro;
    private javax.swing.JLabel lblDos;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblInstrucciones2;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblOcho;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSeis;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblSiete;
    private javax.swing.JLabel lblTres;
    private javax.swing.JLabel lblUno;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt37;
    private javax.swing.JTextField txt38;
    private javax.swing.JTextField txt39;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt40;
    private javax.swing.JTextField txt41;
    private javax.swing.JTextField txt42;
    private javax.swing.JTextField txt43;
    private javax.swing.JTextField txt44;
    private javax.swing.JTextField txt45;
    private javax.swing.JTextField txt46;
    private javax.swing.JTextField txt47;
    private javax.swing.JTextField txt48;
    private javax.swing.JTextField txt49;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt50;
    private javax.swing.JTextField txt51;
    private javax.swing.JTextField txt52;
    private javax.swing.JTextField txt53;
    private javax.swing.JTextField txt54;
    private javax.swing.JTextField txt55;
    private javax.swing.JTextField txt56;
    private javax.swing.JTextField txt57;
    private javax.swing.JTextField txt58;
    private javax.swing.JTextField txt59;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt60;
    private javax.swing.JTextField txt61;
    private javax.swing.JTextField txt62;
    private javax.swing.JTextField txt63;
    private javax.swing.JTextField txt64;
    private javax.swing.JTextField txt66;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
