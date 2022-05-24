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
 * @author Susy
 */
public class ABC extends javax.swing.JFrame {
    String RutaImagenes = "C:/Time 2 Learn/src/Imagenes/";
    String RutaAudios = "C:/Time 2 Learn/src/Audios";
    /**
     * Creates new form Animales1
     */
    public ABC() {
        initComponents();
        
        
        this.setLocationRelativeTo(null);
        this.setTitle("ABC");        
        
        //Imagen de Minimizar
        ImageIcon Minimizar = new ImageIcon(RutaImagenes + "Icono_Minimizar.png");
        Icon ImageMinimizar = new ImageIcon(Minimizar.getImage().getScaledInstance(lblMinimizar.getWidth(), lblMinimizar.getHeight(), Image.SCALE_DEFAULT));
        lblMinimizar.setIcon(ImageMinimizar);
        
        //Imagen de Cerrar
        ImageIcon Cerrar = new ImageIcon(RutaImagenes + "Icono_Cerrar.png");
        Icon ImageCerrar = new ImageIcon(Cerrar.getImage().getScaledInstance(lblCerrar.getWidth(), lblCerrar.getHeight(), Image.SCALE_DEFAULT));
        lblCerrar.setIcon(ImageCerrar);
        
        //Imagen de Menu
        ImageIcon Menu = new ImageIcon(RutaImagenes + "Icono_Menu.png");
        Icon ImageMenu = new ImageIcon(Menu.getImage().getScaledInstance(lblMenu.getWidth(), lblMenu.getHeight(), Image.SCALE_DEFAULT));
        lblMenu.setIcon(ImageMenu);

        //Imagen de Regresar
        ImageIcon Regresar = new ImageIcon(RutaImagenes + "Icono_Regresar.png");
        Icon ImageRegresar = new ImageIcon(Regresar.getImage().getScaledInstance(lblRegresar.getWidth(), lblRegresar.getHeight(), Image.SCALE_DEFAULT));
        lblRegresar.setIcon(ImageRegresar);


        ImageIcon Repeat = new ImageIcon(RutaImagenes + "Repeat.png");
        Icon ImageRepeat = new ImageIcon(Repeat.getImage().getScaledInstance(lblRepeat.getWidth(), lblRepeat.getHeight(), Image.SCALE_DEFAULT));
        lblRepeat.setIcon(ImageRepeat);
        
        ImageIcon A = new ImageIcon(RutaImagenes + "Letras_A.png");
        Icon ImageA = new ImageIcon(A.getImage().getScaledInstance(lblA.getWidth(), lblA.getHeight(), Image.SCALE_DEFAULT));
        lblA.setIcon(ImageA);
        
        ImageIcon B = new ImageIcon(RutaImagenes + "Letras_B.png");
        Icon ImageB = new ImageIcon(B.getImage().getScaledInstance(lblB.getWidth(), lblB.getHeight(), Image.SCALE_DEFAULT));
        lblB.setIcon(ImageB);
        
        ImageIcon C = new ImageIcon(RutaImagenes + "Letras_C.png");
        Icon ImageC = new ImageIcon(C.getImage().getScaledInstance(lblC.getWidth(), lblC.getHeight(), Image.SCALE_DEFAULT));
        lblC.setIcon(ImageC);
        
        ImageIcon D = new ImageIcon(RutaImagenes + "Letras_D.png");
        Icon ImageD = new ImageIcon(D.getImage().getScaledInstance(lblD.getWidth(), lblD.getHeight(), Image.SCALE_DEFAULT));
        lblD.setIcon(ImageD);
        
        ImageIcon E = new ImageIcon(RutaImagenes + "Letras_E.png");
        Icon ImageE = new ImageIcon(E.getImage().getScaledInstance(lblE.getWidth(), lblE.getHeight(), Image.SCALE_DEFAULT));
        lblE.setIcon(ImageE);
        
        ImageIcon F = new ImageIcon(RutaImagenes + "Letras_F.png");
        Icon ImageF = new ImageIcon(F.getImage().getScaledInstance(lblF.getWidth(), lblF.getHeight(), Image.SCALE_DEFAULT));
        lblF.setIcon(ImageF);
        
        ImageIcon G = new ImageIcon(RutaImagenes + "Letras_G.png");
        Icon ImageG = new ImageIcon(G.getImage().getScaledInstance(lblG.getWidth(), lblG.getHeight(), Image.SCALE_DEFAULT));
        lblG.setIcon(ImageG);
        
        ImageIcon H = new ImageIcon(RutaImagenes + "Letras_H.png");
        Icon ImageH = new ImageIcon(H.getImage().getScaledInstance(lblH.getWidth(), lblH.getHeight(), Image.SCALE_DEFAULT));
        lblH.setIcon(ImageH);
        
        ImageIcon I = new ImageIcon(RutaImagenes + "Letras_I.png");
        Icon ImageI = new ImageIcon(I.getImage().getScaledInstance(lblI.getWidth(), lblI.getHeight(), Image.SCALE_DEFAULT));
        lblI.setIcon(ImageI);
        
        ImageIcon J = new ImageIcon(RutaImagenes + "Letras_J.png");
        Icon ImageJ = new ImageIcon(J.getImage().getScaledInstance(lblJ.getWidth(), lblJ.getHeight(), Image.SCALE_DEFAULT));
        lblJ.setIcon(ImageJ);
        
        ImageIcon K = new ImageIcon(RutaImagenes + "Letras_K.png");
        Icon ImageK = new ImageIcon(K.getImage().getScaledInstance(lblK.getWidth(), lblK.getHeight(), Image.SCALE_DEFAULT));
        lblK.setIcon(ImageK);
        
        ImageIcon L = new ImageIcon(RutaImagenes + "Letras_L.png");
        Icon ImageL = new ImageIcon(L.getImage().getScaledInstance(lblL.getWidth(), lblL.getHeight(), Image.SCALE_DEFAULT));
        lblL.setIcon(ImageL);
        
        ImageIcon M = new ImageIcon(RutaImagenes + "Letras_M.png");
        Icon ImageM = new ImageIcon(M.getImage().getScaledInstance(lblM.getWidth(), lblM.getHeight(), Image.SCALE_DEFAULT));
        lblM.setIcon(ImageM);
        
        ImageIcon N = new ImageIcon(RutaImagenes + "Letras_N.png");
        Icon ImageN = new ImageIcon(N.getImage().getScaledInstance(lblN.getWidth(), lblN.getHeight(), Image.SCALE_DEFAULT));
        lblN.setIcon(ImageN);
        
        ImageIcon O = new ImageIcon(RutaImagenes + "Letras_O.png");
        Icon ImageO = new ImageIcon(O.getImage().getScaledInstance(lblO.getWidth(), lblO.getHeight(), Image.SCALE_DEFAULT));
        lblO.setIcon(ImageO);
        
        ImageIcon P = new ImageIcon(RutaImagenes + "Letras_P.png");
        Icon ImageP = new ImageIcon(P.getImage().getScaledInstance(lblP.getWidth(), lblP.getHeight(), Image.SCALE_DEFAULT));
        lblP.setIcon(ImageP);
        
        ImageIcon Q = new ImageIcon(RutaImagenes + "Letras_Q.png");
        Icon ImageQ = new ImageIcon(Q.getImage().getScaledInstance(lblQ.getWidth(), lblQ.getHeight(), Image.SCALE_DEFAULT));
        lblQ.setIcon(ImageQ);
        
        ImageIcon R = new ImageIcon(RutaImagenes + "Letras_R.png");
        Icon ImageR = new ImageIcon(R.getImage().getScaledInstance(lblR.getWidth(), lblR.getHeight(), Image.SCALE_DEFAULT));
        lblR.setIcon(ImageR);
        
        ImageIcon S = new ImageIcon(RutaImagenes + "Letras_S.png");
        Icon ImageS = new ImageIcon(S.getImage().getScaledInstance(lblS.getWidth(), lblS.getHeight(), Image.SCALE_DEFAULT));
        lblS.setIcon(ImageS);
        
        ImageIcon T = new ImageIcon(RutaImagenes + "Letras_T.png");
        Icon ImageT = new ImageIcon(T.getImage().getScaledInstance(lblT.getWidth(), lblT.getHeight(), Image.SCALE_DEFAULT));
        lblT.setIcon(ImageT);
        
        ImageIcon U = new ImageIcon(RutaImagenes + "Letras_U.png");
        Icon ImageU = new ImageIcon(U.getImage().getScaledInstance(lblU.getWidth(), lblU.getHeight(), Image.SCALE_DEFAULT));
        lblU.setIcon(ImageU);
        
        ImageIcon V = new ImageIcon(RutaImagenes + "Letras_V.png");
        Icon ImageV = new ImageIcon(V.getImage().getScaledInstance(lblV.getWidth(), lblV.getHeight(), Image.SCALE_DEFAULT));
        lblV.setIcon(ImageV);
        
        ImageIcon W = new ImageIcon(RutaImagenes + "Letras_W.png");
        Icon ImageW = new ImageIcon(W.getImage().getScaledInstance(lblW.getWidth(), lblW.getHeight(), Image.SCALE_DEFAULT));
        lblW.setIcon(ImageW);
        
        ImageIcon X = new ImageIcon(RutaImagenes + "Letras_X.png");
        Icon ImageX = new ImageIcon(X.getImage().getScaledInstance(lblX.getWidth(), lblX.getHeight(), Image.SCALE_DEFAULT));
        lblX.setIcon(ImageX);
        
        ImageIcon Y = new ImageIcon(RutaImagenes + "Letras_Y.png");
        Icon ImageY = new ImageIcon(Y.getImage().getScaledInstance(lblY.getWidth(), lblY.getHeight(), Image.SCALE_DEFAULT));
        lblY.setIcon(ImageY);
        
        ImageIcon Z = new ImageIcon(RutaImagenes + "Letras_Z.png");
        Icon ImageZ = new ImageIcon(Z.getImage().getScaledInstance(lblZ.getWidth(), lblZ.getHeight(), Image.SCALE_DEFAULT));
        lblZ.setIcon(ImageZ);
        
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
        lblD = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblH = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblI = new javax.swing.JLabel();
        lblE = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        lblL = new javax.swing.JLabel();
        lblG = new javax.swing.JLabel();
        lblJ = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        lblN = new javax.swing.JLabel();
        lblO = new javax.swing.JLabel();
        lblK = new javax.swing.JLabel();
        lblQ = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();
        lblS = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();
        lblU = new javax.swing.JLabel();
        lblV = new javax.swing.JLabel();
        lblW = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        lblY = new javax.swing.JLabel();
        lblZ = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();
        lblRepeat = new javax.swing.JLabel();
        lblRegresar = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblD.setText("D");
        lblD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDMouseClicked(evt);
            }
        });

        lblA.setText("A");
        lblA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAMouseClicked(evt);
            }
        });

        lblC.setText("C");
        lblC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCMouseClicked(evt);
            }
        });

        lblH.setText("H");
        lblH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHMouseClicked(evt);
            }
        });

        lblB.setText("B");
        lblB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBMouseClicked(evt);
            }
        });

        lblI.setText("I");
        lblI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIMouseClicked(evt);
            }
        });

        lblE.setText("E");
        lblE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEMouseClicked(evt);
            }
        });

        lblF.setText("F");
        lblF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFMouseClicked(evt);
            }
        });

        lblL.setText("L");
        lblL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLMouseClicked(evt);
            }
        });

        lblG.setText("G");
        lblG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGMouseClicked(evt);
            }
        });

        lblJ.setText("J");
        lblJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJMouseClicked(evt);
            }
        });

        lblM.setText("M");
        lblM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMMouseClicked(evt);
            }
        });

        lblN.setText("N");
        lblN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNMouseClicked(evt);
            }
        });

        lblO.setText("O");
        lblO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOMouseClicked(evt);
            }
        });

        lblK.setText("K");
        lblK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblKMouseClicked(evt);
            }
        });

        lblQ.setText("Q");
        lblQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQMouseClicked(evt);
            }
        });

        lblR.setText("R");
        lblR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRMouseClicked(evt);
            }
        });

        lblS.setText("S");
        lblS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSMouseClicked(evt);
            }
        });

        lblT.setText("T");
        lblT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTMouseClicked(evt);
            }
        });

        lblU.setText("U");
        lblU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblU.setMaximumSize(new java.awt.Dimension(8, 14));
        lblU.setMinimumSize(new java.awt.Dimension(8, 14));
        lblU.setPreferredSize(new java.awt.Dimension(8, 14));
        lblU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUMouseClicked(evt);
            }
        });

        lblV.setText("V");
        lblV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVMouseClicked(evt);
            }
        });

        lblW.setText("W");
        lblW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblWMouseClicked(evt);
            }
        });

        lblX.setText("X");
        lblX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXMouseClicked(evt);
            }
        });

        lblY.setText("Y");
        lblY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblYMouseClicked(evt);
            }
        });

        lblZ.setText("Z");
        lblZ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblZMouseClicked(evt);
            }
        });

        lblP.setText("P");
        lblP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPMouseClicked(evt);
            }
        });

        lblRepeat.setText("Repeat");

        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblZ, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblU, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblO, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblI, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJ, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQ, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblE, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblW, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblR, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblE, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblG, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblH, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblJ, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblK, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblL, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQ, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblS, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblU, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblW, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblZ, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(226, 226, 226)
                        .addComponent(lblRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAMouseClicked
    
        //Letra A
        String Archivo = RutaAudios + "/ABC/A.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblAMouseClicked

    private void lblBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBMouseClicked
    
        //Letra B
        String Archivo = RutaAudios + "/ABC/B.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblBMouseClicked

    private void lblCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCMouseClicked
        
        //Letra C
        String Archivo = RutaAudios + "/ABC/C.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblCMouseClicked

    private void lblDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDMouseClicked
        
        //Letra D
        String Archivo = RutaAudios + "/ABC/D.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblDMouseClicked

    private void lblEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEMouseClicked
        
        //Letra E
        String Archivo = RutaAudios + "/ABC/E.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblEMouseClicked

    private void lblFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFMouseClicked
        
        //Letra F
        String Archivo = RutaAudios + "/ABC/F.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblFMouseClicked

    private void lblGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGMouseClicked
         
        //Letra G
        String Archivo = RutaAudios + "/ABC/G.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblGMouseClicked

    private void lblHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHMouseClicked
        
        //Letra H
        String Archivo = RutaAudios + "/ABC/H.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblHMouseClicked

    private void lblIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIMouseClicked
        
        //Letra I
        String Archivo = RutaAudios + "/ABC/I.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblIMouseClicked

    private void lblJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJMouseClicked
         
        //Letra J
        String Archivo = RutaAudios + "/ABC/J.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblJMouseClicked

    private void lblKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKMouseClicked
        
        //Letra K
        String Archivo = RutaAudios + "/ABC/K.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblKMouseClicked

    private void lblLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLMouseClicked
        
        //Letra L
        String Archivo = RutaAudios + "/ABC/L.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblLMouseClicked

    private void lblMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMMouseClicked
        
        //Letra M
        String Archivo = RutaAudios + "/ABC/M.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblMMouseClicked

    private void lblNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNMouseClicked
        
         //Letra N
        String Archivo = RutaAudios + "/ABC/N.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblNMouseClicked

    private void lblOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOMouseClicked
        
         //Letra O
        String Archivo = RutaAudios + "/ABC/O.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblOMouseClicked

    private void lblPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPMouseClicked
        
         //Letra P
        String Archivo = RutaAudios + "/ABC/P.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblPMouseClicked

    private void lblQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQMouseClicked
       
         //Letra Q
        String Archivo = RutaAudios + "/ABC/Q.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblQMouseClicked

    private void lblRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRMouseClicked
        
         //Letra R
        String Archivo = RutaAudios + "/ABC/R.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblRMouseClicked

    private void lblSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSMouseClicked
         // TODO add your handling code here:
         //Letra S
        String Archivo = RutaAudios + "/ABC/S.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblSMouseClicked

    private void lblTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTMouseClicked
        // TODO add your handling code here:
         //Letra T
        String Archivo = RutaAudios + "/ABC/T.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblTMouseClicked

    private void lblUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUMouseClicked
        // TODO add your handling code here:
         //Letra U
        String Archivo = RutaAudios + "/ABC/U.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblUMouseClicked

    private void lblVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVMouseClicked
         // TODO add your handling code here:
         //Letra V
        String Archivo = RutaAudios + "/ABC/V.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblVMouseClicked

    private void lblWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWMouseClicked
        
         //Letra W
        String Archivo = RutaAudios + "/ABC/W.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblWMouseClicked

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        
         //Letra X
        String Archivo = RutaAudios + "/ABC/X.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblXMouseClicked

    private void lblYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYMouseClicked
        // TODO add your handling code here:
         //Letra E
        String Archivo = RutaAudios + "/ABC/Y.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblYMouseClicked

    private void lblZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblZMouseClicked
        
         //Letra Z
        String Archivo = RutaAudios + "/ABC/Z.wav";
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File (Archivo)));
            sonido.start();
        }catch (Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_lblZMouseClicked

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        Facil F = new Facil();
        F.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        Niveles N = new Niveles();
        N.setVisible(true);

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
            java.util.logging.Logger.getLogger(ABC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ABC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblE;
    private javax.swing.JLabel lblF;
    private javax.swing.JLabel lblG;
    private javax.swing.JLabel lblH;
    private javax.swing.JLabel lblI;
    private javax.swing.JLabel lblJ;
    private javax.swing.JLabel lblK;
    private javax.swing.JLabel lblL;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblO;
    private javax.swing.JLabel lblP;
    private javax.swing.JLabel lblQ;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblRepeat;
    private javax.swing.JLabel lblS;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblT;
    private javax.swing.JLabel lblU;
    private javax.swing.JLabel lblV;
    private javax.swing.JLabel lblW;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblY;
    private javax.swing.JLabel lblZ;
    // End of variables declaration//GEN-END:variables
}
