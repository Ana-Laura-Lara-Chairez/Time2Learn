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
public class Meses extends javax.swing.JFrame {
    int a = 0;
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";

    public Meses() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Levels");        
        
        
        ImageIcon Menu = new ImageIcon(RutaImagenes + "Icono_Menu.png");
        Icon ImageMenu = new ImageIcon(Menu.getImage().getScaledInstance(lblMenu.getWidth(), lblMenu.getHeight(), Image.SCALE_DEFAULT));
        lblMenu.setIcon(ImageMenu);
        
        //Imagen de Cerrar
        ImageIcon Cerrar = new ImageIcon(RutaImagenes + "Icono_Cerrar.png");
        Icon ImageCerrar = new ImageIcon(Cerrar.getImage().getScaledInstance(lblCerrar.getWidth(), lblCerrar.getHeight(), Image.SCALE_DEFAULT));
        lblCerrar.setIcon(ImageCerrar);
        
        //Imagen de Minimizar
        ImageIcon Minimizar = new ImageIcon(RutaImagenes + "Icono_Minimizar.png");
        Icon ImageMinimizar = new ImageIcon(Minimizar.getImage().getScaledInstance(lblMinimizar.getWidth(), lblMinimizar.getHeight(), Image.SCALE_DEFAULT));
        lblMinimizar.setIcon(ImageMinimizar);
        
        //Imagen de Vista
        ImageIcon Vista = new ImageIcon(RutaImagenes + "Meses_Enero.png");
        Icon ImageVista = new ImageIcon(Vista.getImage().getScaledInstance(lblEnero.getWidth(), lblEnero.getHeight(), Image.SCALE_DEFAULT));
        lblEnero.setIcon(ImageVista);
        
        //Imagen de Olfato
        ImageIcon Olfato = new ImageIcon(RutaImagenes + "Meses_Febrero.png");
        Icon ImageOlfato = new ImageIcon(Olfato.getImage().getScaledInstance(lblFebrero.getWidth(), lblFebrero.getHeight(), Image.SCALE_DEFAULT));
        lblFebrero.setIcon(ImageOlfato);
        
        //Imagen de Tacto
        ImageIcon Tacto = new ImageIcon(RutaImagenes + "Meses_Marzo.png");
        Icon ImageTacto = new ImageIcon(Tacto.getImage().getScaledInstance(lblMarzo.getWidth(), lblMarzo.getHeight(), Image.SCALE_DEFAULT));
        lblMarzo.setIcon(ImageTacto);
        
        //Imagen de Tacto
        ImageIcon Abril = new ImageIcon(RutaImagenes + "Meses_Abril.png");
        Icon ImageAbril = new ImageIcon(Abril.getImage().getScaledInstance(lblAbril.getWidth(), lblAbril.getHeight(), Image.SCALE_DEFAULT));
        lblAbril.setIcon(ImageAbril);
        
        //Imagen de Tacto
        ImageIcon Mayo = new ImageIcon(RutaImagenes + "Meses_Mayo.png");
        Icon ImageMayo = new ImageIcon(Mayo.getImage().getScaledInstance(lblMayo.getWidth(), lblMayo.getHeight(), Image.SCALE_DEFAULT));
        lblMayo.setIcon(ImageMayo);
        
        //Imagen de Tacto
        ImageIcon Junio = new ImageIcon(RutaImagenes + "Meses_Junio.png");
        Icon ImageJunio = new ImageIcon(Junio.getImage().getScaledInstance(lblJunio.getWidth(), lblJunio.getHeight(), Image.SCALE_DEFAULT));
        lblJunio.setIcon(ImageJunio);
        
        //Imagen de Julio
        ImageIcon Julio = new ImageIcon(RutaImagenes + "Meses_Julio.png");
        Icon ImageJulio = new ImageIcon(Julio.getImage().getScaledInstance(lblJulio.getWidth(), lblJulio.getHeight(), Image.SCALE_DEFAULT));
        lblJulio.setIcon(ImageJulio);
        
        //Imagen de Agosto
        ImageIcon Agosto = new ImageIcon(RutaImagenes + "Meses_Agosto.png");
        Icon ImageAgosto = new ImageIcon(Agosto.getImage().getScaledInstance(lblAgosto.getWidth(), lblAgosto.getHeight(), Image.SCALE_DEFAULT));
        lblAgosto.setIcon(ImageAgosto);
        
        //Imagen de Septiembre
        ImageIcon Septiembre = new ImageIcon(RutaImagenes + "Meses_Septiembre.png");
        Icon ImageSeptiembre = new ImageIcon(Septiembre.getImage().getScaledInstance(lblSeptiembre.getWidth(), lblSeptiembre.getHeight(), Image.SCALE_DEFAULT));
        lblSeptiembre.setIcon(ImageSeptiembre);
        
        //Imagen de Octubre
        ImageIcon Octubre = new ImageIcon(RutaImagenes + "Meses_Octubre.png");
        Icon ImageOctubre = new ImageIcon(Octubre.getImage().getScaledInstance(lblOctubre.getWidth(), lblOctubre.getHeight(), Image.SCALE_DEFAULT));
        lblOctubre.setIcon(ImageOctubre);
        
        //Imagen de Noviembre
        ImageIcon Noviembre = new ImageIcon(RutaImagenes + "Meses_Noviembre.png");
        Icon ImageNoviembre = new ImageIcon(Noviembre.getImage().getScaledInstance(lblNoviembre.getWidth(), lblNoviembre.getHeight(), Image.SCALE_DEFAULT));
        lblNoviembre.setIcon(ImageNoviembre);
        
        //Imagen de Diciembre
        ImageIcon Diciembre = new ImageIcon(RutaImagenes + "Meses_Diciembre.png");
        Icon ImageDiciembre = new ImageIcon(Diciembre.getImage().getScaledInstance(lblDiciembre.getWidth(), lblDiciembre.getHeight(), Image.SCALE_DEFAULT));
        lblDiciembre.setIcon(ImageDiciembre);
        
        //Imagen de Check
        ImageIcon Check = new ImageIcon(RutaImagenes + "Comprobar.png");
        Icon ImageCheck = new ImageIcon(Check.getImage().getScaledInstance(lblCheck.getWidth(), lblCheck.getHeight(), Image.SCALE_DEFAULT));
        lblCheck.setIcon(ImageCheck);
        
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

        Congratulation = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Dialogo = new javax.swing.JDialog();
        lblNo = new javax.swing.JLabel();
        lblSi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Mensaje1 = new javax.swing.JDialog();
        NOmbre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblInstrucciones = new javax.swing.JLabel();
        lblEnero = new javax.swing.JLabel();
        cboEnero = new javax.swing.JComboBox<>();
        lblFebrero = new javax.swing.JLabel();
        cboFebrero = new javax.swing.JComboBox<>();
        lblMarzo = new javax.swing.JLabel();
        cboMarzo = new javax.swing.JComboBox<>();
        lblAbril = new javax.swing.JLabel();
        cboAbril = new javax.swing.JComboBox<>();
        lblMayo = new javax.swing.JLabel();
        cboMayo = new javax.swing.JComboBox<>();
        lblJunio = new javax.swing.JLabel();
        cboJunio = new javax.swing.JComboBox<>();
        lblJulio = new javax.swing.JLabel();
        cboJulio = new javax.swing.JComboBox<>();
        lblAgosto = new javax.swing.JLabel();
        cboAgosto = new javax.swing.JComboBox<>();
        lblSeptiembre = new javax.swing.JLabel();
        cboSeptiembre = new javax.swing.JComboBox<>();
        lblOctubre = new javax.swing.JLabel();
        cboOctubre = new javax.swing.JComboBox<>();
        lblNoviembre = new javax.swing.JLabel();
        cboNoviembre = new javax.swing.JComboBox<>();
        lblDiciembre = new javax.swing.JLabel();
        cboDiciembre = new javax.swing.JComboBox<>();
        lblCheck = new javax.swing.JLabel();

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
        lblSi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblSiKeyPressed(evt);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

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

        lblMenu.setText("jLabel1");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        lblInstrucciones.setBackground(new java.awt.Color(204, 204, 255));
        lblInstrucciones.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblInstrucciones.setText("<html><body><p>Select the name of the month as appropriate.</p></body></html>");

        cboEnero.setBackground(new java.awt.Color(255, 153, 255));
        cboEnero.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboEnero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboEnero.setBorder(null);
        cboEnero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboEnero.setDoubleBuffered(true);
        cboEnero.setName(""); // NOI18N
        cboEnero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEneroActionPerformed(evt);
            }
        });

        cboFebrero.setBackground(new java.awt.Color(255, 153, 255));
        cboFebrero.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboFebrero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboFebrero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboFebrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFebreroActionPerformed(evt);
            }
        });

        cboMarzo.setBackground(new java.awt.Color(255, 153, 255));
        cboMarzo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboMarzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboMarzo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboMarzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarzoActionPerformed(evt);
            }
        });

        cboAbril.setBackground(new java.awt.Color(255, 153, 255));
        cboAbril.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboAbril.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboAbril.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboAbril.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAbrilActionPerformed(evt);
            }
        });

        cboMayo.setBackground(new java.awt.Color(255, 153, 255));
        cboMayo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboMayo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboMayo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboMayo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMayoActionPerformed(evt);
            }
        });

        cboJunio.setBackground(new java.awt.Color(255, 153, 255));
        cboJunio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboJunio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboJunio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboJunio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJunioActionPerformed(evt);
            }
        });

        cboJulio.setBackground(new java.awt.Color(255, 153, 255));
        cboJulio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboJulio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboJulio.setBorder(null);
        cboJulio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboJulio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJulioActionPerformed(evt);
            }
        });

        cboAgosto.setBackground(new java.awt.Color(255, 153, 255));
        cboAgosto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboAgosto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboAgosto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboAgosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAgostoActionPerformed(evt);
            }
        });

        cboSeptiembre.setBackground(new java.awt.Color(255, 153, 255));
        cboSeptiembre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboSeptiembre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboSeptiembre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboSeptiembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSeptiembreActionPerformed(evt);
            }
        });

        cboOctubre.setBackground(new java.awt.Color(255, 153, 255));
        cboOctubre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboOctubre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboOctubre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboOctubre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOctubreActionPerformed(evt);
            }
        });

        cboNoviembre.setBackground(new java.awt.Color(255, 153, 255));
        cboNoviembre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboNoviembre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboNoviembre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboNoviembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNoviembreActionPerformed(evt);
            }
        });

        cboDiciembre.setBackground(new java.awt.Color(255, 153, 255));
        cboDiciembre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cboDiciembre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        cboDiciembre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboDiciembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiciembreActionPerformed(evt);
            }
        });

        lblCheck.setText("jLabel1");
        lblCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCheckMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1102, 1102, 1102)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboJulio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblJulio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboAgosto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboSeptiembre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSeptiembre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblOctubre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboOctubre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNoviembre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboNoviembre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDiciembre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboDiciembre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboEnero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEnero, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboFebrero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboMarzo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAbril, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cboAbril, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMayo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cboMayo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblJunio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cboJunio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2651, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbril, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMayo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJunio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboEnero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboAbril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboMayo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboJunio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJulio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeptiembre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOctubre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoviembre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiciembre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboJulio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboSeptiembre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboOctubre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboNoviembre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboDiciembre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(lblCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(838, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
      this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Dificil v = new Dificil();
        v.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        Dialogo.setSize(576, 259);
        Dialogo.setLocationRelativeTo(null);
        Dialogo.setVisible(true);
        Dialogo.setBackground(new Color (0, 0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void cboEneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEneroActionPerformed

    private void cboFebreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFebreroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboFebreroActionPerformed

    private void cboMarzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMarzoActionPerformed

    private void lblCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMouseClicked
        a = 0;
        switch (cboEnero.getSelectedIndex()) {
        case 0:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 2:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
       case 5:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 6:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboEnero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break; 
        }
        
        switch (cboFebrero.getSelectedIndex()) {
        case 0:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 3:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;  
        case 6:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboFebrero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break; 
        }
        
        switch (cboMarzo.getSelectedIndex()) {
        case 0:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 4:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboMarzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboAbril.getSelectedIndex()) {
        case 0:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 5:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboAbril.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboMayo.getSelectedIndex()) {
        case 0:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;   
        case 6:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboMayo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboJunio.getSelectedIndex()) {
        case 0:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 7:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboJunio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboJulio.getSelectedIndex()) {
        case 0:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;    
        case 8:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboJulio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboAgosto.getSelectedIndex()) {
        case 0:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 9:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboAgosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboSeptiembre.getSelectedIndex()) {
        case 0:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 10:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboSeptiembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboOctubre.getSelectedIndex()) {
        case 0:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 11:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboOctubre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboNoviembre.getSelectedIndex()) {
        case 0:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;
        case 12:
            cboNoviembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;     
        }
        
        switch (cboDiciembre.getSelectedIndex()) {
        case 0:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 1:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 2:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 3:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 4:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 5:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;   
        case 6:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 7:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;    
        case 8:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 9:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 10:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 11:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
            break;
        case 12:
            cboDiciembre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
            a = a + 1;
            break;     
        }
        
        
        if (a == 12)
        {
            String SQL;
        Conexion mibasededatos = new Conexion();
        Connection con=mibasededatos.getConnection();
        Statement st;
        
        Registro v = new Registro();
        
        SQL = "UPDATE `puntaje` SET `Meses` = '" + 12 + "' WHERE `puntaje`.`Nombre` = '" + v.Nombre + "'";  
        
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
        
            Congratulation.setSize(300, 120);
            Congratulation.setLocationRelativeTo(null);
            Congratulation.setVisible(true);
            Congratulation.setBackground(new Color (0, 0, 0, 0));
        }
        
        else
        {
            String SQL;
        Conexion mibasededatos = new Conexion();
        Connection con=mibasededatos.getConnection();
        Statement st;
        
        Registro v = new Registro();
             

        SQL = "UPDATE `puntaje` SET `Meses` = '" + a + "' WHERE `puntaje`.`Nombre` = '" + v.Nombre + "'";  
        
        try {
            st = con.createStatement();
            st.executeUpdate(SQL);
            con.close();
            st.close();
           NOmbre.setText(v.Nombre);
                    
        }catch (SQLException e){
            
            System.out.println("Error en la conexion"+ SQL + "y el error es "+ e);
            JOptionPane.showMessageDialog(null, "Ha habido un error al subir su progreso " + v.Nombre + ". El error es "+ e );
        }
        
            ImageIcon Mensaje = new ImageIcon(RutaImagenes + "Carita Triste.png");
            Icon ImageMensaje = new ImageIcon(Mensaje.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
        
            JOptionPane.showMessageDialog(null, "Try Again!!", "Warning!", JOptionPane.INFORMATION_MESSAGE, ImageMensaje);
        }
    }//GEN-LAST:event_lblCheckMouseClicked

    private void cboAbrilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAbrilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAbrilActionPerformed

    private void cboMayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMayoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMayoActionPerformed

    private void cboJunioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJunioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboJunioActionPerformed

    private void cboOctubreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOctubreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboOctubreActionPerformed

    private void cboSeptiembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSeptiembreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSeptiembreActionPerformed

    private void cboDiciembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiciembreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDiciembreActionPerformed

    private void cboNoviembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNoviembreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNoviembreActionPerformed

    private void cboJulioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJulioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboJulioActionPerformed

    private void cboAgostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAgostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAgostoActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Congratulation.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
        Mensaje1.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void Mensaje1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Mensaje1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Mensaje1.dispose();
        }
    }//GEN-LAST:event_Mensaje1KeyPressed

    private void lblSiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblSiKeyPressed
        
    }//GEN-LAST:event_lblSiKeyPressed

    private void DialogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DialogoKeyPressed
        if (evt.getKeyCode() == com.sun.glass.events.KeyEvent.VK_ENTER)
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
            java.util.logging.Logger.getLogger(Meses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Congratulation;
    private javax.swing.JDialog Dialogo;
    private javax.swing.JDialog Mensaje1;
    private javax.swing.JLabel NOmbre;
    private javax.swing.JComboBox<String> cboAbril;
    private javax.swing.JComboBox<String> cboAgosto;
    private javax.swing.JComboBox<String> cboDiciembre;
    private javax.swing.JComboBox<String> cboEnero;
    private javax.swing.JComboBox<String> cboFebrero;
    private javax.swing.JComboBox<String> cboJulio;
    private javax.swing.JComboBox<String> cboJunio;
    private javax.swing.JComboBox<String> cboMarzo;
    private javax.swing.JComboBox<String> cboMayo;
    private javax.swing.JComboBox<String> cboNoviembre;
    private javax.swing.JComboBox<String> cboOctubre;
    private javax.swing.JComboBox<String> cboSeptiembre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbril;
    private javax.swing.JLabel lblAgosto;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCheck;
    private javax.swing.JLabel lblDiciembre;
    private javax.swing.JLabel lblEnero;
    private javax.swing.JLabel lblFebrero;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblJulio;
    private javax.swing.JLabel lblJunio;
    private javax.swing.JLabel lblMarzo;
    private javax.swing.JLabel lblMayo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblNoviembre;
    private javax.swing.JLabel lblOctubre;
    private javax.swing.JLabel lblSeptiembre;
    private javax.swing.JLabel lblSi;
    // End of variables declaration//GEN-END:variables
}


