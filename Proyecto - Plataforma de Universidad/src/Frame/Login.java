package Frame;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class Login extends javax.swing.JFrame {

    boolean Animacion = false;
    boolean AnimacionRegistro = false;
    


    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setOpacity(0.90f);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIngreso_y_registro = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        psContraseña = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JButton();
        btnMaximize = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtRegistroUsuario = new javax.swing.JTextField();
        psRegistroContraseña = new javax.swing.JPasswordField();
        pnlLineaIzquierda = new javax.swing.JPanel();
        pnlLindeaDerecha = new javax.swing.JPanel();
        pnlLineaAbajo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIngreso_y_registro.setBackground(new java.awt.Color(12, 12, 12));
        pnlIngreso_y_registro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlIngreso_y_registroMouseDragged(evt);
            }
        });
        pnlIngreso_y_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlIngreso_y_registroMousePressed(evt);
            }
        });
        pnlIngreso_y_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUser.setBackground(new java.awt.Color(153, 153, 153));
        lblUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(153, 153, 153));
        lblUser.setText("User:");
        pnlIngreso_y_registro.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 275, 30, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setText("admin");
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pnlIngreso_y_registro.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 160, 20));

        psContraseña.setBackground(new java.awt.Color(255, 255, 255));
        psContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        psContraseña.setForeground(new java.awt.Color(51, 51, 51));
        psContraseña.setText("12345");
        psContraseña.setBorder(null);
        pnlIngreso_y_registro.add(psContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, 20));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Facebook.gif"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlIngreso_y_registro.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 160, 46));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Misfits", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        pnlIngreso_y_registro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        pnlIngreso_y_registro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        pnlIngreso_y_registro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 64, -1, -1));
        pnlIngreso_y_registro.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        pnlIngreso_y_registro.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        pnlIngreso_y_registro.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SignUp.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnlIngreso_y_registro.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 110, 40));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SignIn.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton7MouseMoved(evt);
            }
        });
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnlIngreso_y_registro.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 40));

        jPanel1.setBackground(new java.awt.Color(219, 219, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(219, 219, 219));

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Minimize (2).png"))); // NOI18N
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setFocusable(false);
        btnMinimize.setOpaque(true);
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });
        jPanel3.add(btnMinimize);

        btnMaximize.setBackground(new java.awt.Color(255, 255, 255));
        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Maximize (2).png"))); // NOI18N
        btnMaximize.setContentAreaFilled(false);
        btnMaximize.setFocusable(false);
        btnMaximize.setOpaque(true);
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseExited(evt);
            }
        });
        btnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizeActionPerformed(evt);
            }
        });
        jPanel3.add(btnMaximize);

        btnExit.setBackground(new java.awt.Color(232, 17, 35));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Salir.png"))); // NOI18N
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusable(false);
        btnExit.setOpaque(true);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 160, 40));

        pnlIngreso_y_registro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Siguenos en,");
        pnlIngreso_y_registro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, 20));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Terminos y Condiciones");
        pnlIngreso_y_registro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, -1, -1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Plataforma desarrollada por estudiantes de");
        pnlIngreso_y_registro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Acepta,");
        pnlIngreso_y_registro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, -1));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("la facultad de Ing en sistemas");
        pnlIngreso_y_registro.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 180, 20));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bloggif_5ac0610bac74f.png"))); // NOI18N
        pnlIngreso_y_registro.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 50, 130, 130));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nombre.png"))); // NOI18N
        pnlIngreso_y_registro.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 60));

        txtRegistroUsuario.setBackground(new java.awt.Color(51, 51, 51));
        txtRegistroUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRegistroUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtRegistroUsuario.setText("Ingrese Usuario");
        txtRegistroUsuario.setBorder(null);
        pnlIngreso_y_registro.add(txtRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 160, 20));

        psRegistroContraseña.setBackground(new java.awt.Color(51, 51, 51));
        psRegistroContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        psRegistroContraseña.setForeground(new java.awt.Color(153, 153, 153));
        psRegistroContraseña.setBorder(null);
        pnlIngreso_y_registro.add(psRegistroContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 160, 20));

        pnlLineaIzquierda.setBackground(new java.awt.Color(219, 219, 219));
        pnlIngreso_y_registro.add(pnlLineaIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 2, 620));

        pnlLindeaDerecha.setBackground(new java.awt.Color(219, 219, 219));
        pnlIngreso_y_registro.add(pnlLindeaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 40, 2, 620));

        pnlLineaAbajo.setBackground(new java.awt.Color(219, 219, 219));
        pnlIngreso_y_registro.add(pnlLineaAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 659, 390, 2));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(219, 219, 219));
        jLabel4.setText("Contraseña: ");
        pnlIngreso_y_registro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(219, 219, 219));
        jLabel5.setText("Usuario: ");
        pnlIngreso_y_registro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 290, -1, -1));

        jLabel3.setBackground(new java.awt.Color(14, 82, 128));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/8fc30b97d6a429d6d9b0179ed3cf5447.jpg"))); // NOI18N
        pnlIngreso_y_registro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 390, 620));

        getContentPane().add(pnlIngreso_y_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlIngreso_y_registroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngreso_y_registroMousePressed
        //  setOpacity((float)0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnlIngreso_y_registroMousePressed

    private void pnlIngreso_y_registroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngreso_y_registroMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnlIngreso_y_registroMouseDragged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          
      
       /* SignUp PF = new SignUp();
        PF.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        

            String Usuario = "admin";
            String contraseña = "12345";

            String Pass = new String(psContraseña.getPassword());

            if (txtUsuario.getText().equals(Usuario) && Pass.equals(contraseña)) {

                Animacion = false;
                Plataforma PF = new Plataforma();

                PF.setVisible(true);

                dispose();

            } else {

                JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrecta");

            }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setBackground(new Color(229, 229, 229));
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        btnMinimize.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnMaximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseEntered
        btnMaximize.setBackground(new Color(229, 229, 229));
    }//GEN-LAST:event_btnMaximizeMouseEntered

    private void btnMaximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseExited
        btnMaximize.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnMaximizeMouseExited

    private void btnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizeActionPerformed
        /*if(maximized){
            //handle fullscreen - taskbar
            Plataforma.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Plataforma.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }*/
    }//GEN-LAST:event_btnMaximizeActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
         btnExit.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseMoved
     jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Signwhite.png")));
        
    }//GEN-LAST:event_jButton7MouseMoved

    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseMoved
      jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Signupwhite.png")));
    }//GEN-LAST:event_jButton5MouseMoved

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SignIn.png")));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SignUp.png")));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
    
    }//GEN-LAST:event_jButton7MousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
       
    }//GEN-LAST:event_txtUsuarioActionPerformed
    int xy, xx;

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMaximize;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlIngreso_y_registro;
    private javax.swing.JPanel pnlLindeaDerecha;
    private javax.swing.JPanel pnlLineaAbajo;
    private javax.swing.JPanel pnlLineaIzquierda;
    private javax.swing.JPasswordField psContraseña;
    private javax.swing.JPasswordField psRegistroContraseña;
    private javax.swing.JTextField txtRegistroUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
