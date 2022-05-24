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
 
 */
public class Numeros extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    String RutaAudios = "C:/Time 2 Learn/src/Audios/Numeros/";
    
    public Numeros() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Numbers");        
        
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
        
        ImageIcon Uno = new ImageIcon(RutaImagenes + "1.png");
        Icon Numero1 = new ImageIcon(Uno.getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_DEFAULT));
        lbl1.setIcon(Numero1);
        
        ImageIcon Dos = new ImageIcon(RutaImagenes + "2.png");
        Icon Numero2= new ImageIcon(Dos.getImage().getScaledInstance(lbl2.getWidth(), lbl2.getHeight(), Image.SCALE_DEFAULT));
        lbl2.setIcon(Numero2);
        
        ImageIcon Tres = new ImageIcon(RutaImagenes + "3.png");
        Icon Numero3 = new ImageIcon(Tres.getImage().getScaledInstance(lbl3.getWidth(), lbl3.getHeight(), Image.SCALE_DEFAULT));
        lbl3.setIcon(Numero3);
        
        ImageIcon Cuatro = new ImageIcon(RutaImagenes + "4.png");
        Icon Numero4 = new ImageIcon(Cuatro.getImage().getScaledInstance(lbl4.getWidth(), lbl4.getHeight(), Image.SCALE_DEFAULT));
        lbl4.setIcon(Numero4);
        
        ImageIcon Cinco = new ImageIcon(RutaImagenes + "5.png");
        Icon Numero5 = new ImageIcon(Cinco.getImage().getScaledInstance(lbl5.getWidth(), lbl5.getHeight(), Image.SCALE_DEFAULT));
        lbl5.setIcon(Numero5);
        
        ImageIcon Seis = new ImageIcon(RutaImagenes + "6.png");
        Icon Numero6 = new ImageIcon(Seis.getImage().getScaledInstance(lbl6.getWidth(), lbl6.getHeight(), Image.SCALE_DEFAULT));
        lbl6.setIcon(Numero6);
        
        ImageIcon Siete = new ImageIcon(RutaImagenes + "7.png");
        Icon Numero7 = new ImageIcon(Siete.getImage().getScaledInstance(lbl7.getWidth(), lbl7.getHeight(), Image.SCALE_DEFAULT));
        lbl7.setIcon(Numero7);
        
        ImageIcon Ocho = new ImageIcon(RutaImagenes + "8.png");
        Icon Numero8 = new ImageIcon(Ocho.getImage().getScaledInstance(lbl8.getWidth(), lbl8.getHeight(), Image.SCALE_DEFAULT));
        lbl8.setIcon(Numero8);
        
        ImageIcon Nueve = new ImageIcon(RutaImagenes + "9.png");
        Icon Numero9 = new ImageIcon(Nueve.getImage().getScaledInstance(lbl9.getWidth(), lbl9.getHeight(), Image.SCALE_DEFAULT));
        lbl9.setIcon(Numero9);
        
        ImageIcon Diez = new ImageIcon(RutaImagenes + "10.png");
        Icon Numero10 = new ImageIcon(Diez.getImage().getScaledInstance(lbl10.getWidth(), lbl10.getHeight(), Image.SCALE_DEFAULT));
        lbl10.setIcon(Numero10);
        
        ImageIcon Veinte = new ImageIcon(RutaImagenes + "20.png");
        Icon Numero20 = new ImageIcon(Veinte.getImage().getScaledInstance(lbl20.getWidth(), lbl20.getHeight(), Image.SCALE_DEFAULT));
        lbl20.setIcon(Numero20);
        
        ImageIcon Treinta = new ImageIcon(RutaImagenes + "30.png");
        Icon Numero30 = new ImageIcon(Treinta.getImage().getScaledInstance(lbl30.getWidth(), lbl30.getHeight(), Image.SCALE_DEFAULT));
        lbl30.setIcon(Numero30);
        
        ImageIcon Cuarenta = new ImageIcon(RutaImagenes + "40.png");
        Icon Numero40 = new ImageIcon(Cuarenta.getImage().getScaledInstance(lbl40.getWidth(), lbl40.getHeight(), Image.SCALE_DEFAULT));
        lbl40.setIcon(Numero40);
        
        ImageIcon Cincuenta = new ImageIcon(RutaImagenes + "50.png");
        Icon Numero50 = new ImageIcon(Cincuenta.getImage().getScaledInstance(lbl50.getWidth(), lbl50.getHeight(), Image.SCALE_DEFAULT));
        lbl50.setIcon(Numero50);
        
        ImageIcon Sesenta = new ImageIcon(RutaImagenes + "60.png");
        Icon Numero60 = new ImageIcon(Sesenta.getImage().getScaledInstance(lbl60.getWidth(), lbl60.getHeight(), Image.SCALE_DEFAULT));
        lbl60.setIcon(Numero60);
        
        ImageIcon Setenta = new ImageIcon(RutaImagenes + "70.png");
        Icon Numero70 = new ImageIcon(Setenta.getImage().getScaledInstance(lbl70.getWidth(), lbl70.getHeight(), Image.SCALE_DEFAULT));
        lbl70.setIcon(Numero70);
        
        ImageIcon Ochenta = new ImageIcon(RutaImagenes + "80.png");
        Icon Numero80 = new ImageIcon(Ochenta.getImage().getScaledInstance(lbl80.getWidth(), lbl80.getHeight(), Image.SCALE_DEFAULT));
        lbl80.setIcon(Numero80);
        
        ImageIcon Noventa = new ImageIcon(RutaImagenes + "90.png");
        Icon Numero90 = new ImageIcon(Noventa.getImage().getScaledInstance(lbl90.getWidth(), lbl90.getHeight(), Image.SCALE_DEFAULT));
        lbl90.setIcon(Numero90);
        
        ImageIcon Cien = new ImageIcon(RutaImagenes + "100.png");
        Icon Numero100 = new ImageIcon(Cien.getImage().getScaledInstance(lbl100.getWidth(), lbl100.getHeight(), Image.SCALE_DEFAULT));
        lbl100.setIcon(Numero100);
        
        ImageIcon Mil = new ImageIcon(RutaImagenes + "1000.png");
        Icon Numero1000 = new ImageIcon(Mil.getImage().getScaledInstance(lbl1000.getWidth(), lbl1000.getHeight(), Image.SCALE_DEFAULT));
        lbl1000.setIcon(Numero1000);
        
        ImageIcon DiezM = new ImageIcon(RutaImagenes + "10000.png");
        Icon Numero10000 = new ImageIcon(DiezM.getImage().getScaledInstance(lbl10000.getWidth(), lbl10000.getHeight(), Image.SCALE_DEFAULT));
        lbl10000.setIcon(Numero10000);
        
        //Icono
        setIconImage(Toolkit.getDefaultToolkit().getImage(RutaImagenes + "Icono.png"));
    }
    
     public void lanzarSplash(){ 
        SplashSalir S = new SplashSalir();
        S.setVisible(true);
        
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialogo = new javax.swing.JDialog();
        lblNo = new javax.swing.JLabel();
        lblSi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl70 = new javax.swing.JLabel();
        lbl90 = new javax.swing.JLabel();
        lbl60 = new javax.swing.JLabel();
        lbl80 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lbl1000 = new javax.swing.JLabel();
        lbl100 = new javax.swing.JLabel();
        lbl10000 = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();

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

        lbl1.setText("1");
        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });

        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });

        lbl2.setText("2");
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });

        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });

        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });

        lbl6.setText("6");
        lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });

        lbl10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });

        lbl7.setText("7");
        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });

        lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });

        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });

        lbl50.setText("50");
        lbl50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl50MouseClicked(evt);
            }
        });

        lbl20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl20MouseClicked(evt);
            }
        });

        lbl40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl40MouseClicked(evt);
            }
        });

        lbl30.setText("30");
        lbl30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl30MouseClicked(evt);
            }
        });

        lbl70.setText("70");
        lbl70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl70MouseClicked(evt);
            }
        });

        lbl90.setText("90");
        lbl90.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl90MouseClicked(evt);
            }
        });

        lbl60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl60MouseClicked(evt);
            }
        });

        lbl80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl80MouseClicked(evt);
            }
        });

        lblNumero.setBackground(new java.awt.Color(204, 204, 255));
        lblNumero.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(204, 0, 153));
        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumero.setText("Print the Number");
        lblNumero.setToolTipText("");
        lblNumero.setAutoscrolls(true);
        lblNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl1000.setText("1000");
        lbl1000.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1000MouseClicked(evt);
            }
        });

        lbl100.setText("100");
        lbl100.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl100MouseClicked(evt);
            }
        });

        lbl10000.setText("10000");
        lbl10000.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl10000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10000MouseClicked(evt);
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

        lblMenu.setText("Menu");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl100, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lbl1000, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lbl10000, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(lbl30, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(lbl40, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl60, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(lbl70, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(lbl80, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl90, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl50, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(419, 419, 419)
                        .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl70, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl60, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl80, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbl90, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1000, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl100, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl10000, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl100MouseClicked
         lblNumero.setText("");
        lblNumero.setText("ONE HUNDRED");
        
        //Audio uno
        String Archivo = RutaAudios + "100.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl100MouseClicked

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        lblNumero.setText("");
        lblNumero.setText("ONE");
        
        //Audio uno
        String Archivo = RutaAudios + "1.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        lblNumero.setText("");
        lblNumero.setText("TWO");
        
        //Audio uno
        String Archivo = RutaAudios + "2.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
        lblNumero.setText("");
        lblNumero.setText("FIVE");
        
        //Audio uno
        String Archivo = RutaAudios + "5.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
        lblNumero.setText("");
        lblNumero.setText("FOUR");
        
        //Audio uno
        String Archivo = RutaAudios + "4.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl4MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        
        lblNumero.setText("");
        lblNumero.setText("THREE");
        
        //Audio uno
        String Archivo = RutaAudios + "3.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        // TODO add your handling code here:
        lblNumero.setText("");
        lblNumero.setText("TEN");
        
        //Audio uno
        String Archivo = RutaAudios + "10.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl10MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
        // TODO add your handling code here:
        lblNumero.setText("");
        lblNumero.setText("SIX");
        
        //Audio uno
        String Archivo = RutaAudios + "6.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        
        lblNumero.setText("");
        lblNumero.setText("SEVEN");
        
        //Audio uno
        String Archivo = RutaAudios + "7.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        
        lblNumero.setText("");
        lblNumero.setText("NINE");
        
        //Audio uno
        String Archivo = RutaAudios + "9.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl9MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
        // TODO add your handling code here:
        lblNumero.setText("");
        lblNumero.setText("EIGHT");
        
        //Audio uno
        String Archivo = RutaAudios + "8.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl20MouseClicked
        lblNumero.setText("");
        lblNumero.setText("TWENTY");  
        
//Audio uno
        String Archivo = RutaAudios + "20.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl20MouseClicked

    private void lbl40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl40MouseClicked
        lblNumero.setText("");
        lblNumero.setText("FORTY"); 
        
//Audio uno
        String Archivo = RutaAudios + "40.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_lbl40MouseClicked

    private void lbl70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl70MouseClicked
        // TODO add your handling code here:
        lblNumero.setText("");
        lblNumero.setText("SEVENTY");
        
        //Audio uno
        String Archivo = RutaAudios + "70.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl70MouseClicked

    private void lbl30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl30MouseClicked
        lblNumero.setText("");
        lblNumero.setText("THIRTY"); 
        
//Audio uno
        String Archivo = RutaAudios + "30.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_lbl30MouseClicked

    private void lbl90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl90MouseClicked
        // TODO add your handling code here:
        
        lblNumero.setText("");
        lblNumero.setText("NINETY");
        
        //Audio uno
        String Archivo = RutaAudios + "90.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl90MouseClicked

    private void lbl60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl60MouseClicked
        // TODO add your handling code here:
        lblNumero.setText("");
        lblNumero.setText("SIXTY");
        
        //Audio uno
        String Archivo = RutaAudios + "60.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl60MouseClicked

    private void lbl1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1000MouseClicked
        lblNumero.setText("");
        lblNumero.setText("ONE THOUSAND"); 
        
//Audio uno
        String Archivo = RutaAudios + "1000.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_lbl1000MouseClicked

    private void lbl10000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10000MouseClicked
        // TODO add your handling code here:
        lblNumero.setText("");
        lblNumero.setText("TEN THOUSAND");
        
        //Audio uno
        String Archivo = RutaAudios + "10000.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl10000MouseClicked

    private void lbl80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl80MouseClicked
        // TODO add your handling code here:
        lblNumero.setText("");
        lblNumero.setText("EIGHTY");
        
        //Audio uno
        String Archivo = RutaAudios + "80.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl80MouseClicked

    private void lbl50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl50MouseClicked
        // TODO add your handling code here:
        lblNumero.setText("");
        lblNumero.setText("FIFTY");
        
        //Audio uno
        String Archivo = RutaAudios + "50.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lbl50MouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Dialogo.setSize(576, 259);
        Dialogo.setLocationRelativeTo(null);
        Dialogo.setVisible(true);
        Dialogo.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Facil D = new Facil();
        D.setVisible(true);

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
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl100;
    private javax.swing.JLabel lbl1000;
    private javax.swing.JLabel lbl10000;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl60;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl70;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl80;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbl90;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSi;
    // End of variables declaration//GEN-END:variables
}
