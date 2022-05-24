/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time2Learn;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dee Dee Gtz
 */
public class Consultar extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    
    public Consultar() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Colors");     
        
        ImageIcon Menu = new ImageIcon(RutaImagenes + "Icono_Menu.png");
        Icon ImageMenu = new ImageIcon(Menu.getImage().getScaledInstance(lblMenu.getWidth(), lblMenu.getHeight(), Image.SCALE_DEFAULT));
        lblMenu.setIcon(ImageMenu);
        
        ImageIcon Logo = new ImageIcon(RutaImagenes + "Time2Learn.png");
        Icon ImageLogo = new ImageIcon(Logo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
        lblLogo.setIcon(ImageLogo);
        
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
        
        /*Registro v = new Registro();
        txtNombre2.setText(v.Nombre);*/
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
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAnimales = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiasSemana = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAdjetivos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAdivinanzas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProfesiones = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mensaje_Salir.png"))); // NOI18N
        Dialogo.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel1.setText("Name:");

        txtNombre.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Animals:");

        txtAnimales.setEditable(false);
        txtAnimales.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtAnimales.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Days of the Week:");

        txtDiasSemana.setEditable(false);
        txtDiasSemana.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtDiasSemana.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasSemanaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Adjectives:");

        txtAdjetivos.setEditable(false);
        txtAdjetivos.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtAdjetivos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Riddles:");

        txtAdivinanzas.setEditable(false);
        txtAdivinanzas.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtAdivinanzas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Professions:");

        txtProfesiones.setEditable(false);
        txtProfesiones.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        txtProfesiones.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblLogo.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1075, 1075, 1075)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdjetivos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiasSemana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtAdivinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtProfesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(59, 59, 59)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(530, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiasSemana)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAdjetivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdivinanzas)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProfesiones)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Niveles D = new Niveles();
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

    private void txtDiasSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasSemanaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Nombre;
        Nombre = String.format(txtNombre.getText());
        String A1, D1, A2, A3, P1;
        int C1,C2,C3,C4,C5;
        
        Conexion mibasededatos = new Conexion();
        Connection con = mibasededatos.getConnection();
        Connection con2 = mibasededatos.getConnection();
        Statement st, sa, st2, sa2;
        
        String SQL = "SELECT * FROM `puntaje` WHERE `Nombre` = '" + Nombre + "'" ;
            
            try {
            st= con.createStatement();
           ResultSet datos= st.executeQuery(SQL);
           
           while (datos.next()){
               A1 = String.format(datos.getString("Animales"));
               D1 = String.format(datos.getString("DiasSemana"));
               A2 = String.format(datos.getString("Adjetivos"));
               A3 = String.format(datos.getString("Adivinanzas"));
               P1 = String.format(datos.getString("Profesiones"));
               
               /*C1 = (100/7)*A1;
               C2 = (100/7)*D1;
               C3 = (100/5)*A2;
               C4 = (100/4)*A3;
               C5 = (100/100)*100;*/
               
               txtAnimales.setText(A1 + "/7");
               txtDiasSemana.setText(D1 + "/7");
               txtAdjetivos.setText(A2 + "/5");
               txtAdivinanzas.setText(A3 + "/4");
               txtProfesiones.setText(P1 + "/1");
            }
           
        } catch (SQLException e){
            System.out.println("Error en la conexión y el error es "+e);
            JOptionPane.showMessageDialog(null, "Ha habido un error al insertar el regristo. El error es "+ e );
        }
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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblSi;
    private javax.swing.JTextField txtAdivinanzas;
    private javax.swing.JTextField txtAdjetivos;
    private javax.swing.JTextField txtAnimales;
    private javax.swing.JTextField txtDiasSemana;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesiones;
    // End of variables declaration//GEN-END:variables
}
