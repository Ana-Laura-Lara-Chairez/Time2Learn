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
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dee Dee Gtz
 */
public class DiasSemana_Jueves extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    String RutaAudios = "C:/Time 2 Learn/src/Audios/";
    
    public DiasSemana_Jueves() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Days of the Week");     
        
        //Imagen del Dia
        ImageIcon Dia = new ImageIcon(RutaImagenes + "DiasSemana_Jueves.jpg");
        Icon ImageDia = new ImageIcon(Dia.getImage().getScaledInstance(lblDia.getWidth(), lblDia.getHeight(), Image.SCALE_DEFAULT));
        lblDia.setIcon(ImageDia);
        
        //Imagen de Dias
        ImageIcon Dias = new ImageIcon(RutaImagenes + "Dias de la Semana.png");
        Icon ImageDias = new ImageIcon(Dias.getImage().getScaledInstance(lblDias.getWidth(), lblDias.getHeight(), Image.SCALE_DEFAULT));
        lblDias.setIcon(ImageDias);
        
        //Imagen de Comprobar
        ImageIcon Comprobar = new ImageIcon(RutaImagenes + "Comprobar.png");
        Icon ImageComprobar = new ImageIcon(Comprobar.getImage().getScaledInstance(lblComprobar.getWidth(), lblComprobar.getHeight(), Image.SCALE_DEFAULT));
        lblComprobar.setIcon(ImageComprobar);
        
        //Imagen de Siguiente
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
        
        lblSiguiente.setVisible(false);
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
        Mensaje1 = new javax.swing.JDialog();
        NOmbre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Right = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        lblDias = new javax.swing.JLabel();
        lblDia1 = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        lblComprobar = new javax.swing.JLabel();

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

        Mensaje1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Mensaje1.setAlwaysOnTop(true);
        Mensaje1.setModalExclusionType(null);
        Mensaje1.setUndecorated(true);
        Mensaje1.setResizable(false);
        Mensaje1.setType(java.awt.Window.Type.POPUP);
        Mensaje1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Mensaje1KeyPressed(evt);
            }
        });
        Mensaje1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NOmbre.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        NOmbre.setText(" ");
        Mensaje1.getContentPane().add(NOmbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        Mensaje1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 50, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mensaje_Dias.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Mensaje1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 120));

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
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel1KeyReleased(evt);
            }
        });
        Right.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 84, 50, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Right.png"))); // NOI18N
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel7KeyReleased(evt);
            }
        });
        Right.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        lblDia.setText("jLabel1");

        txt1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt3.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt4.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });

        txt5.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt6.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt6KeyPressed(evt);
            }
        });

        lblDias.setText("jLabel1");

        lblDia1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDia1.setText("Complete the boxes with the traslation of each day of the week.");

        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });

        lblComprobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprobarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(lblDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSiguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblComprobar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(403, 403, 403)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDias, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1093, 1093, 1093)
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(530, Short.MAX_VALUE))
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
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblDias, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(lblComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(lblSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Intermedio D = new Intermedio();
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

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
            DiasSemana_Viernes D = new DiasSemana_Viernes();
            D.setVisible(true);
            
            this.dispose();
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblComprobarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprobarMouseClicked
        if(txt1.getText().equals("J") || txt1.getText().equals("j"))
        {
            txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt2.getText().equals("U") || txt2.getText().equals("u"))
        {
            txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt3.getText().equals("E") || txt3.getText().equals("e"))
        {
            txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt4.getText().equals("V") || txt4.getText().equals("v") )
        {
            txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt5.getText().equals("E") || txt5.getText().equals("e"))
        {
            txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt6.getText().equals("S") || txt6.getText().equals("s"))
        {
            txt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt1.getText().equals("J") || txt1.getText().equals("j") &&
                txt2.getText().equals("U") || txt2.getText().equals("u") &&
                txt3.getText().equals("E") || txt3.getText().equals("e") &&
                txt4.getText().equals("V") || txt4.getText().equals("v") &&
                txt5.getText().equals("E") || txt5.getText().equals("e") &&
                txt6.getText().equals("S") || txt6.getText().equals("s"))
        {
        String SQL;
        Conexion mibasededatos = new Conexion();
        Connection con=mibasededatos.getConnection();
        Statement st;
        
        Registro v = new Registro();
             //UPDATE `puntaje` SET `Animales` = '1' WHERE `puntaje`.`Nombre` = 'Usuario2'

        SQL = "UPDATE `puntaje` SET `DiasSemana` = '" + 5 + "' WHERE `puntaje`.`Nombre` = '" + v.Nombre + "'";  
        
        try {
            st = con.createStatement();
            st.executeUpdate(SQL);
            con.close();
            st.close();
           
           Mensaje1.setSize(300, 120);
           Mensaje1.setLocationRelativeTo(null);
           Mensaje1.setVisible(true);
           Mensaje1.setBackground(new Color (0, 0, 0, 0));
            
           NOmbre.setText(v.Nombre);
                    
        }catch (SQLException e){
            
            System.out.println("Error en la conexion"+ SQL + "y el error es "+ e);
            JOptionPane.showMessageDialog(null, "Ha habido un error al subir su progreso " + v.Nombre + ". El error es "+ e );
        }
        String Archivo = RutaAudios + "Correcto.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
            Right.setSize(300, 120);
            Right.setLocationRelativeTo(null);
            Right.setVisible(true);
            Right.setBackground(new Color (0, 0, 0, 0));
            
            lblSiguiente.setVisible(true);
        }
        else
        {
            ImageIcon Mensaje = new ImageIcon(RutaImagenes + "Carita Triste.png");
            Icon ImageMensaje = new ImageIcon(Mensaje.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        
            JOptionPane.showMessageDialog(null, "Try Again!!", "Warning!", JOptionPane.INFORMATION_MESSAGE, ImageMensaje);
        }
    }//GEN-LAST:event_lblComprobarMouseClicked

    private void lblNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNoMouseClicked
        Dialogo.dispose();
    }//GEN-LAST:event_lblNoMouseClicked

    private void lblSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiMouseClicked
        SplashSalir v = new SplashSalir();
        v.setVisible(true);

        Dialogo.dispose();
        this.dispose();
    }//GEN-LAST:event_lblSiMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void txt6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txt1.getText().equals("J") || txt1.getText().equals("j"))
        {
            txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt2.getText().equals("U") || txt2.getText().equals("u"))
        {
            txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt3.getText().equals("E") || txt3.getText().equals("e"))
        {
            txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt4.getText().equals("V") || txt4.getText().equals("v") )
        {
            txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt5.getText().equals("E") || txt5.getText().equals("e"))
        {
            txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt6.getText().equals("S") || txt6.getText().equals("s"))
        {
            txt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        }
        else{txt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));}

        if(txt1.getText().equals("J") || txt1.getText().equals("j") &&
                txt2.getText().equals("U") || txt2.getText().equals("u") &&
                txt3.getText().equals("E") || txt3.getText().equals("e") &&
                txt4.getText().equals("V") || txt4.getText().equals("v") &&
                txt5.getText().equals("E") || txt5.getText().equals("e") &&
                txt6.getText().equals("S") || txt6.getText().equals("s"))
        {
        String SQL;
        Conexion mibasededatos = new Conexion();
        Connection con=mibasededatos.getConnection();
        Statement st;
        
        Registro v = new Registro();
             //UPDATE `puntaje` SET `Animales` = '1' WHERE `puntaje`.`Nombre` = 'Usuario2'

        SQL = "UPDATE `puntaje` SET `DiasSemana` = '" + 5 + "' WHERE `puntaje`.`Nombre` = '" + v.Nombre + "'";  
        
        try {
            st = con.createStatement();
            st.executeUpdate(SQL);
            con.close();
            st.close();
           //System.out.println("Insertado con exito");
           Mensaje1.setSize(300, 120);
           Mensaje1.setLocationRelativeTo(null);
           Mensaje1.setVisible(true);
           Mensaje1.setBackground(new Color (0, 0, 0, 0));
            
           NOmbre.setText(v.Nombre);
                    
        }catch (SQLException e){
            
            System.out.println("Error en la conexion"+ SQL + "y el error es "+ e);
            JOptionPane.showMessageDialog(null, "Ha habido un error al subir su progreso " + v.Nombre + ". El error es "+ e );
        }
        String Archivo = RutaAudios + "Correcto.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
            Right.setSize(300, 120);
            Right.setLocationRelativeTo(null);
            Right.setVisible(true);
            Right.setBackground(new Color (0, 0, 0, 0));
            
            lblSiguiente.setVisible(true);
        }
        else
        {
            ImageIcon Mensaje = new ImageIcon(RutaImagenes + "Carita Triste.png");
            Icon ImageMensaje = new ImageIcon(Mensaje.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        
            JOptionPane.showMessageDialog(null, "Try Again!!", "Warning!", JOptionPane.INFORMATION_MESSAGE, ImageMensaje);
        }
        }
    }//GEN-LAST:event_txt6KeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Right.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1KeyReleased

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyReleased

    }//GEN-LAST:event_jLabel7KeyReleased

    private void RightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RightKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Right.dispose();
        }
    }//GEN-LAST:event_RightKeyPressed

    private void Mensaje1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Mensaje1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Mensaje1.dispose();
        }
    }//GEN-LAST:event_Mensaje1KeyPressed

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
            java.util.logging.Logger.getLogger(DiasSemana_Jueves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiasSemana_Jueves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiasSemana_Jueves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiasSemana_Jueves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiasSemana_Jueves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JDialog Mensaje1;
    private javax.swing.JLabel NOmbre;
    private javax.swing.JDialog Right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblComprobar;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDia1;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    // End of variables declaration//GEN-END:variables
}
