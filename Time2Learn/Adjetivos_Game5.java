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
public class Adjetivos_Game5 extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    
    public Adjetivos_Game5() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Adjetive - Game 5");     
        
        //Imagen de Regresar
        ImageIcon Regresar = new ImageIcon(RutaImagenes + "Icono_Regresar.png");
        Icon ImageRegresar = new ImageIcon(Regresar.getImage().getScaledInstance(lblRegresar.getWidth(), lblRegresar.getHeight(), Image.SCALE_DEFAULT));
        lblRegresar.setIcon(ImageRegresar);
        
        //Imagen de Verde
        ImageIcon Verde = new ImageIcon(RutaImagenes + "Adjetivos_Game5.png");
        Icon ImageVerde = new ImageIcon(Verde.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        lblImagen.setIcon(ImageVerde);
        
        //Imagen de Naranja
        ImageIcon Naranja = new ImageIcon(RutaImagenes + "Adjetivos_Caliente.png");
        Icon ImageNaranja = new ImageIcon(Naranja.getImage().getScaledInstance(lblOpcion1.getWidth(), lblOpcion1.getHeight(), Image.SCALE_DEFAULT));
        lblOpcion1.setIcon(ImageNaranja);
        
        //Imagen de Cafe
        ImageIcon Cafe = new ImageIcon(RutaImagenes + "Adjetivos_Pequeño.png");
        Icon ImageCafe = new ImageIcon(Cafe.getImage().getScaledInstance(lblOpcion2.getWidth(), lblOpcion2.getHeight(), Image.SCALE_DEFAULT));
        lblOpcion2.setIcon(ImageCafe);
        
        //Imagen de Todo
        ImageIcon Todo = new ImageIcon(RutaImagenes + "Adjetivos_Grande.png");
        Icon ImageTodo = new ImageIcon(Todo.getImage().getScaledInstance(lblOpcion3.getWidth(), lblOpcion3.getHeight(), Image.SCALE_DEFAULT));
        lblOpcion3.setIcon(ImageTodo);
        
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
        
        //Imagen de Siguiente
        ImageIcon Siguiente = new ImageIcon(RutaImagenes + "Icono_Siguiente.png");
        Icon ImageSiguiente = new ImageIcon(Siguiente.getImage().getScaledInstance(lblSiguiente.getWidth(), lblSiguiente.getHeight(), Image.SCALE_DEFAULT));
        lblSiguiente.setIcon(ImageSiguiente);
        
        //Icono
        setIconImage(Toolkit.getDefaultToolkit().getImage(RutaImagenes + "Icono.png"));
        
        lblSiguiente.setVisible(false);
    }
    
    public void Correcto(){
        String SQL;
        Conexion mibasededatos = new Conexion();
        Connection con=mibasededatos.getConnection();
        Statement st;
        
        Registro v = new Registro();
             //UPDATE `puntaje` SET `Animales` = '1' WHERE `puntaje`.`Nombre` = 'Usuario2'

        SQL = "UPDATE `puntaje` SET `Adjetivos` = '" + 5 + "' WHERE `puntaje`.`Nombre` = '" + v.Nombre + "'";  
        
        try {
            st = con.createStatement();
            st.executeUpdate(SQL);
            con.close();
            st.close();
           Mensaje1.setSize(300, 120);
           Mensaje1.setLocationRelativeTo(null);
           Mensaje1.setVisible(true);
           Mensaje1.setBackground(new Color (0, 0, 0, 0));
                    
        }catch (SQLException e){
            
            System.out.println("Error en la conexion"+ SQL + "y el error es "+ e);
            JOptionPane.showMessageDialog(null, "Ha habido un error al subir su progreso " + v.Nombre + ". El error es "+ e );
        }
            Right1.setSize(300, 120);
            Right1.setLocationRelativeTo(null);
            Right1.setVisible(true);
            Right1.setBackground(new Color (0, 0, 0, 0));
            
            lblSiguiente.setVisible(true);
    }
    
    public void Incorrecto(){
            ImageIcon Mensaje = new ImageIcon(RutaImagenes + "Carita Triste.png");
            Icon ImageMensaje = new ImageIcon(Mensaje.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        
            JOptionPane.showMessageDialog(null, "Try Again!!", "Warning!", JOptionPane.INFORMATION_MESSAGE, ImageMensaje);
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
        Mensaje1 = new javax.swing.JDialog();
        NOmbre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Right1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Congratulation = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblPalabra = new javax.swing.JLabel();
        lblOpcion1 = new javax.swing.JLabel();
        lblOpcion2 = new javax.swing.JLabel();
        lblOpcion3 = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();

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
        Mensaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mensaje1MouseClicked(evt);
            }
        });
        Mensaje1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Mensaje1InputMethodTextChanged(evt);
            }
        });
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

        Right1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Right1.setAlwaysOnTop(true);
        Right1.setModalExclusionType(null);
        Right1.setUndecorated(true);
        Right1.setResizable(false);
        Right1.setType(java.awt.Window.Type.POPUP);
        Right1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Right1KeyPressed(evt);
            }
        });
        Right1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel2KeyReleased(evt);
            }
        });
        Right1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 84, 50, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Right.png"))); // NOI18N
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel7KeyReleased(evt);
            }
        });
        Right1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        lblImagen.setText("Imagen");

        lblPalabra.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        lblPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPalabra.setText("My coffee is very...");

        lblOpcion1.setText("Opcion1");
        lblOpcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcion1MouseClicked(evt);
            }
        });

        lblOpcion2.setText("Opcion2");
        lblOpcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcion2MouseClicked(evt);
            }
        });

        lblOpcion3.setText("Opcion3");
        lblOpcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOpcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcion3MouseClicked(evt);
            }
        });

        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseReleased(evt);
            }
        });

        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1001, 1001, 1001)
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(558, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(528, 528, 528))
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

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
        Congratulation.setSize(300, 120);
        Congratulation.setLocationRelativeTo(null);
        Congratulation.setVisible(true);
        Congratulation.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblOpcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcion1MouseClicked
        Correcto();
    }//GEN-LAST:event_lblOpcion1MouseClicked

    private void lblOpcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcion2MouseClicked
        Incorrecto();
    }//GEN-LAST:event_lblOpcion2MouseClicked

    private void lblOpcion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcion3MouseClicked
        Incorrecto();
    }//GEN-LAST:event_lblOpcion3MouseClicked

    private void lblSiguienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseReleased
        
    }//GEN-LAST:event_lblSiguienteMouseReleased

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        Adjetivos_Game3 A = new Adjetivos_Game3();
        A.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Mensaje1.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void Mensaje1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mensaje1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Mensaje1MouseClicked

    private void Mensaje1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Mensaje1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Mensaje1InputMethodTextChanged

    private void Mensaje1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Mensaje1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Mensaje1.dispose();
        }
    }//GEN-LAST:event_Mensaje1KeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Right1.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyReleased

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyReleased

    }//GEN-LAST:event_jLabel7KeyReleased

    private void Right1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Right1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Right1.dispose();
        }
    }//GEN-LAST:event_Right1KeyPressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        Intermedio i = new Intermedio();
        i.setVisible(true);

        Congratulation.dispose();
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void CongratulationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CongratulationKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Intermedio i = new Intermedio();
            i.setVisible(true);

            this.dispose();
            Congratulation.dispose();

        }
    }//GEN-LAST:event_CongratulationKeyPressed

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
            java.util.logging.Logger.getLogger(Adjetivos_Game5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adjetivos_Game5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adjetivos_Game5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adjetivos_Game5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adjetivos_Game5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Congratulation;
    private javax.swing.JDialog Dialogo;
    private javax.swing.JDialog Mensaje1;
    private javax.swing.JLabel NOmbre;
    private javax.swing.JDialog Right;
    private javax.swing.JDialog Right1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblOpcion1;
    private javax.swing.JLabel lblOpcion2;
    private javax.swing.JLabel lblOpcion3;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblSiguiente;
    // End of variables declaration//GEN-END:variables
}
