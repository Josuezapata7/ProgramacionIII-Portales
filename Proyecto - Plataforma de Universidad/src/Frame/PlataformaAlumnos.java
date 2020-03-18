
package Frame;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author hp
 */
public class PlataformaAlumnos extends javax.swing.JFrame {
        boolean maximized = true;
       int[] color = {204, 204, 204};
   
    public PlataformaAlumnos() {
      initComponents();
        this.setOpacity(0.95f);
        this.setLocationRelativeTo(null);
        JButton[] botones = {btnHome, btnAjustes, btnCuenta, btnGrafica, btnCalculadora, btnPagina, btnInformacion, btnCerrar};
        for (JButton btn : botones) {
            btn.setBackground(new Color(12, 12, 12));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(0, 140, 255));

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(12, 12, 12));

                }

            });

        }
        Timer tiempoDeAnuncio = new Timer();

        TimerTask task = new TimerTask() {
            int tiempo = 0;

            @Override
            public void run() {

                if (tiempo % 2 == 0) {
                    pnlAnuncios3.removeAll();
                    pnlAnuncios3.repaint();
                    pnlAnuncios3.revalidate();
                    pnlAnuncios3.add(pnlAnuncios2);
                    pnlAnuncios3.repaint();
                    pnlAnuncios3.revalidate();
                } else if (tiempo == 0) {
                    tiempo = 0;
                } else {
                    pnlAnuncios3.removeAll();
                    pnlAnuncios3.repaint();
                    pnlAnuncios3.revalidate();
                    pnlAnuncios3.add(pnlAnuncios1);
                    pnlAnuncios3.repaint();
                    pnlAnuncios3.revalidate();
                }
                tiempo++;
            }
        };
        tiempoDeAnuncio.schedule(task, 10, 5000);
         pnlTemas.removeAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Plataforma = new javax.swing.JPanel();
        pnlizquierdo = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        btnGrafica = new javax.swing.JButton();
        btnCalculadora = new javax.swing.JButton();
        btnPagina = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlTemas = new javax.swing.JPanel();
        pnlOscuro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlClaro = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        pnlEncabezados = new javax.swing.JPanel();
        lblDatabase = new javax.swing.JLabel();
        lblMysql = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        lblEstudiantes = new javax.swing.JLabel();
        lblProfesores = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JButton();
        btnMaximize = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnNoticias = new javax.swing.JButton();
        lblNoticias = new javax.swing.JLabel();
        btnPagos = new javax.swing.JButton();
        lblPagos = new javax.swing.JLabel();
        btnNotas = new javax.swing.JButton();
        lblNotas = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCronograma = new javax.swing.JButton();
        lblCronograma = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlNoticias = new javax.swing.JPanel();
        pnlAdmisiones = new javax.swing.JPanel();
        Admisiones = new javax.swing.JLabel();
        lblAdmisiones = new javax.swing.JLabel();
        pnlFacultades = new javax.swing.JPanel();
        Facultades = new javax.swing.JLabel();
        lblFacultades = new javax.swing.JLabel();
        pnlRequisitos = new javax.swing.JPanel();
        Requisitos = new javax.swing.JLabel();
        lblRequisitos = new javax.swing.JLabel();
        pnlBiblioteca = new javax.swing.JPanel();
        Biblioteca = new javax.swing.JLabel();
        lblBiblioteca = new javax.swing.JLabel();
        pnlAnuncios3 = new javax.swing.JPanel();
        pnlAnuncios2 = new javax.swing.JPanel();
        lblAnuncio3 = new javax.swing.JLabel();
        lblAnuncio6 = new javax.swing.JLabel();
        lblAnuncio8 = new javax.swing.JLabel();
        pnlAnuncios1 = new javax.swing.JPanel();
        lblAnuncio1 = new javax.swing.JLabel();
        lblAnuncio2 = new javax.swing.JLabel();
        lblAnuncio4 = new javax.swing.JLabel();
        lblAnuncio5 = new javax.swing.JLabel();
        jspRegistro = new javax.swing.JScrollPane();
        pnlTimeline = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnlNotas = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlPagos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlCronograma = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        pnlMaestros = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1250, 790));

        jPanel_Plataforma.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_PlataformaMouseDragged(evt);
            }
        });
        jPanel_Plataforma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_PlataformaMousePressed(evt);
            }
        });
        jPanel_Plataforma.setLayout(new java.awt.BorderLayout());

        pnlizquierdo.setBackground(new java.awt.Color(12, 12, 12));
        pnlizquierdo.setPreferredSize(new java.awt.Dimension(160, 0));
        pnlizquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogo.setBackground(new java.awt.Color(12, 12, 12));
        pnlLogo.setPreferredSize(new java.awt.Dimension(70, 80));
        pnlLogo.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(30, 30, 30));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/UMGColor.png"))); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        pnlLogo.add(jLabel2, java.awt.BorderLayout.CENTER);

        pnlizquierdo.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 5, 80, 90));

        btnHome.setBackground(new java.awt.Color(12, 12, 12));
        btnHome.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(204, 204, 204));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.png"))); // NOI18N
        btnHome.setText(" Home");
        btnHome.setPreferredSize(new java.awt.Dimension(40, 40));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        pnlizquierdo.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, -1));

        btnAjustes.setBackground(new java.awt.Color(12, 12, 12));
        btnAjustes.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnAjustes.setForeground(new java.awt.Color(204, 204, 204));
        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings.png"))); // NOI18N
        btnAjustes.setText("Ajustes");
        btnAjustes.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        pnlizquierdo.add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, -1));

        btnCuenta.setBackground(new java.awt.Color(12, 12, 12));
        btnCuenta.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnCuenta.setForeground(new java.awt.Color(204, 204, 204));
        btnCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        btnCuenta.setText("Cuenta");
        btnCuenta.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlizquierdo.add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, -1));

        btnGrafica.setBackground(new java.awt.Color(12, 12, 12));
        btnGrafica.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnGrafica.setForeground(new java.awt.Color(204, 204, 204));
        btnGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Estadisticas.png"))); // NOI18N
        btnGrafica.setText("Grafica");
        btnGrafica.setPreferredSize(new java.awt.Dimension(40, 40));
        btnGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaActionPerformed(evt);
            }
        });
        pnlizquierdo.add(btnGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 160, -1));

        btnCalculadora.setBackground(new java.awt.Color(12, 12, 12));
        btnCalculadora.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnCalculadora.setForeground(new java.awt.Color(204, 204, 204));
        btnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/calc.png"))); // NOI18N
        btnCalculadora.setText("Calcula");
        btnCalculadora.setPreferredSize(new java.awt.Dimension(40, 40));
        btnCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalculadoraMouseClicked(evt);
            }
        });
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });
        pnlizquierdo.add(btnCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 160, -1));

        btnPagina.setBackground(new java.awt.Color(12, 12, 12));
        btnPagina.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnPagina.setForeground(new java.awt.Color(204, 204, 204));
        btnPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pagina.png"))); // NOI18N
        btnPagina.setText("Pagina");
        btnPagina.setPreferredSize(new java.awt.Dimension(40, 40));
        btnPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaginaMouseClicked(evt);
            }
        });
        btnPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaginaActionPerformed(evt);
            }
        });
        pnlizquierdo.add(btnPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 160, -1));

        btnInformacion.setBackground(new java.awt.Color(12, 12, 12));
        btnInformacion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(204, 204, 204));
        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Universidad.png"))); // NOI18N
        btnInformacion.setText("UMG   ");
        btnInformacion.setPreferredSize(new java.awt.Dimension(40, 40));
        btnInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformacionMouseClicked(evt);
            }
        });
        pnlizquierdo.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 160, -1));

        btnCerrar.setBackground(new java.awt.Color(12, 12, 12));
        btnCerrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(204, 204, 204));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.png"))); // NOI18N
        btnCerrar.setText("Cerrar ");
        btnCerrar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        pnlizquierdo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 160, -1));

        pnlTemas.setBackground(new java.awt.Color(12, 12, 12));

        pnlOscuro.setBackground(new java.awt.Color(51, 51, 51));
        pnlOscuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlOscuroMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Tema Oscuro");
        pnlOscuro.add(jLabel1);

        pnlClaro.setBackground(new java.awt.Color(204, 204, 204));
        pnlClaro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlClaroMousePressed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Tema Claro");
        pnlClaro.add(jLabel14);

        javax.swing.GroupLayout pnlTemasLayout = new javax.swing.GroupLayout(pnlTemas);
        pnlTemas.setLayout(pnlTemasLayout);
        pnlTemasLayout.setHorizontalGroup(
            pnlTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTemasLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pnlOscuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlClaro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTemasLayout.setVerticalGroup(
            pnlTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTemasLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pnlOscuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlClaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlizquierdo.add(pnlTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 100, 70));

        jPanel_Plataforma.add(pnlizquierdo, java.awt.BorderLayout.WEST);

        pnlCentro.setBackground(new java.awt.Color(25, 25, 25));
        pnlCentro.setPreferredSize(new java.awt.Dimension(700, 508));
        pnlCentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEncabezados.setBackground(new java.awt.Color(240, 240, 240));

        lblDatabase.setBackground(new java.awt.Color(0, 0, 0));
        lblDatabase.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        lblDatabase.setForeground(new java.awt.Color(0, 0, 0));
        lblDatabase.setText("DATABASE");

        lblMysql.setBackground(new java.awt.Color(0, 0, 0));
        lblMysql.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        lblMysql.setForeground(new java.awt.Color(0, 0, 0));
        lblMysql.setText("MYSQL");

        lblAdministrador.setBackground(new java.awt.Color(0, 0, 0));
        lblAdministrador.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        lblAdministrador.setForeground(new java.awt.Color(0, 0, 0));
        lblAdministrador.setText("ADMINISTRADOR");

        lblEstudiantes.setBackground(new java.awt.Color(0, 0, 0));
        lblEstudiantes.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        lblEstudiantes.setForeground(new java.awt.Color(0, 0, 0));
        lblEstudiantes.setText("ESTUDIANTES");

        lblProfesores.setBackground(new java.awt.Color(0, 0, 0));
        lblProfesores.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        lblProfesores.setForeground(new java.awt.Color(0, 0, 0));
        lblProfesores.setText("PROFESORES");

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        btnMinimize.setBackground(new java.awt.Color(240, 240, 240));
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
        jPanel1.add(btnMinimize);

        btnMaximize.setBackground(new java.awt.Color(240, 240, 240));
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
        jPanel1.add(btnMaximize);

        btnExit.setBackground(new java.awt.Color(240, 240, 240));
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
        jPanel1.add(btnExit);

        javax.swing.GroupLayout pnlEncabezadosLayout = new javax.swing.GroupLayout(pnlEncabezados);
        pnlEncabezados.setLayout(pnlEncabezadosLayout);
        pnlEncabezadosLayout.setHorizontalGroup(
            pnlEncabezadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadosLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(lblDatabase)
                .addGap(88, 88, 88)
                .addComponent(lblMysql)
                .addGap(87, 87, 87)
                .addComponent(lblAdministrador)
                .addGap(83, 83, 83)
                .addComponent(lblEstudiantes)
                .addGap(88, 88, 88)
                .addComponent(lblProfesores)
                .addGap(118, 118, 118)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEncabezadosLayout.setVerticalGroup(
            pnlEncabezadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlEncabezadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEncabezadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdministrador)
                    .addComponent(lblDatabase)
                    .addComponent(lblEstudiantes)
                    .addComponent(lblProfesores)
                    .addComponent(lblMysql))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlCentro.add(pnlEncabezados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 40));

        pnlMenu.setBackground(new java.awt.Color(204, 204, 204));
        pnlMenu.setPreferredSize(new java.awt.Dimension(1100, 40));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 80, 103));
        jLabel3.setText("Administrador");
        pnlMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 34, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(127, 140, 141));
        jLabel4.setText("ADMIN");
        pnlMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 63, 52, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 152, 219));
        jLabel5.setText("Aprende más");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 65, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(127, 140, 141));
        jLabel6.setText("256 Seguidores");
        pnlMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 87, -1, -1));

        btnNoticias.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnNoticias.setForeground(new java.awt.Color(54, 76, 98));
        btnNoticias.setText("NOTICIAS");
        btnNoticias.setContentAreaFilled(false);
        btnNoticias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNoticias.setFocusable(false);
        btnNoticias.setPreferredSize(new java.awt.Dimension(100, 27));
        btnNoticias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoticiasActionPerformed(evt);
            }
        });
        pnlMenu.add(btnNoticias, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 136, 125, 29));

        lblNoticias.setBackground(new java.awt.Color(0, 204, 106));
        lblNoticias.setOpaque(true);
        pnlMenu.add(lblNoticias, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 171, 125, 8));

        btnPagos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(54, 76, 98));
        btnPagos.setText("PAGOS");
        btnPagos.setContentAreaFilled(false);
        btnPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPagos.setFocusable(false);
        btnPagos.setPreferredSize(new java.awt.Dimension(100, 27));
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 86, -1));

        lblPagos.setBackground(new java.awt.Color(204, 204, 204));
        lblPagos.setOpaque(true);
        lblPagos.setPreferredSize(new java.awt.Dimension(100, 0));
        pnlMenu.add(lblPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 125, 8));

        btnNotas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnNotas.setForeground(new java.awt.Color(54, 76, 98));
        btnNotas.setText("NOTAS");
        btnNotas.setContentAreaFilled(false);
        btnNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNotas.setFocusable(false);
        btnNotas.setPreferredSize(new java.awt.Dimension(100, 27));
        btnNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotasActionPerformed(evt);
            }
        });
        pnlMenu.add(btnNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 87, -1));

        lblNotas.setBackground(new java.awt.Color(204, 204, 204));
        lblNotas.setOpaque(true);
        lblNotas.setPreferredSize(new java.awt.Dimension(100, 0));
        pnlMenu.add(lblNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 125, 8));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(127, 140, 141));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Usted inicia sesión como administrador,");
        pnlMenu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 275, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(52, 152, 219));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Cerrar sesión ?");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, -1));

        btnCronograma.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnCronograma.setForeground(new java.awt.Color(54, 76, 98));
        btnCronograma.setText("CRONOGRAMA");
        btnCronograma.setContentAreaFilled(false);
        btnCronograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCronograma.setFocusable(false);
        btnCronograma.setPreferredSize(new java.awt.Dimension(100, 27));
        btnCronograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronogramaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 142, -1));

        lblCronograma.setBackground(new java.awt.Color(204, 204, 204));
        lblCronograma.setOpaque(true);
        lblCronograma.setPreferredSize(new java.awt.Dimension(100, 0));
        pnlMenu.add(lblCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 125, 8));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-male-user-96.png"))); // NOI18N
        pnlMenu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 6, 100, 101));

        pnlCentro.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1090, 180));

        pnlBody.setLayout(new java.awt.CardLayout());

        pnlNoticias.setBackground(new java.awt.Color(255, 255, 255));
        pnlNoticias.setMinimumSize(new java.awt.Dimension(940, 60));
        pnlNoticias.setPreferredSize(new java.awt.Dimension(926, 700));
        pnlNoticias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAdmisiones.setBackground(new java.awt.Color(255, 204, 102));
        pnlAdmisiones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlAdmisionesMouseMoved(evt);
            }
        });
        pnlAdmisiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAdmisionesMouseExited(evt);
            }
        });

        Admisiones.setBackground(new java.awt.Color(255, 255, 255));
        Admisiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Admisiones.setForeground(new java.awt.Color(255, 255, 255));
        Admisiones.setText("Adminsiones");

        lblAdmisiones.setBackground(new java.awt.Color(255, 255, 255));
        lblAdmisiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAdmisiones.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmisiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Admisiones.png"))); // NOI18N

        javax.swing.GroupLayout pnlAdmisionesLayout = new javax.swing.GroupLayout(pnlAdmisiones);
        pnlAdmisiones.setLayout(pnlAdmisionesLayout);
        pnlAdmisionesLayout.setHorizontalGroup(
            pnlAdmisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdmisionesLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(pnlAdmisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdmisionesLayout.createSequentialGroup()
                        .addComponent(lblAdmisiones)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdmisionesLayout.createSequentialGroup()
                        .addComponent(Admisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        pnlAdmisionesLayout.setVerticalGroup(
            pnlAdmisionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdmisionesLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(lblAdmisiones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Admisiones)
                .addGap(58, 58, 58))
        );

        pnlNoticias.add(pnlAdmisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        pnlFacultades.setBackground(new java.awt.Color(0, 204, 255));
        pnlFacultades.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlFacultadesMouseMoved(evt);
            }
        });
        pnlFacultades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlFacultadesMouseExited(evt);
            }
        });

        Facultades.setBackground(new java.awt.Color(255, 255, 255));
        Facultades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Facultades.setForeground(new java.awt.Color(255, 255, 255));
        Facultades.setText("Facultades");

        lblFacultades.setBackground(new java.awt.Color(255, 255, 255));
        lblFacultades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFacultades.setForeground(new java.awt.Color(255, 255, 255));
        lblFacultades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Facultades.png"))); // NOI18N

        javax.swing.GroupLayout pnlFacultadesLayout = new javax.swing.GroupLayout(pnlFacultades);
        pnlFacultades.setLayout(pnlFacultadesLayout);
        pnlFacultadesLayout.setHorizontalGroup(
            pnlFacultadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFacultadesLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(pnlFacultadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Facultades, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFacultades))
                .addGap(92, 92, 92))
        );
        pnlFacultadesLayout.setVerticalGroup(
            pnlFacultadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacultadesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblFacultades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Facultades)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pnlNoticias.add(pnlFacultades, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        pnlRequisitos.setBackground(new java.awt.Color(166, 208, 0));
        pnlRequisitos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlRequisitosMouseMoved(evt);
            }
        });
        pnlRequisitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlRequisitosMouseExited(evt);
            }
        });

        Requisitos.setBackground(new java.awt.Color(255, 255, 255));
        Requisitos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Requisitos.setForeground(new java.awt.Color(255, 255, 255));
        Requisitos.setText("Requisitos de Admision");

        lblRequisitos.setBackground(new java.awt.Color(255, 255, 255));
        lblRequisitos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequisitos.setForeground(new java.awt.Color(255, 255, 255));
        lblRequisitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Requisitos.png"))); // NOI18N

        javax.swing.GroupLayout pnlRequisitosLayout = new javax.swing.GroupLayout(pnlRequisitos);
        pnlRequisitos.setLayout(pnlRequisitosLayout);
        pnlRequisitosLayout.setHorizontalGroup(
            pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRequisitosLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRequisitosLayout.createSequentialGroup()
                        .addComponent(Requisitos)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRequisitosLayout.createSequentialGroup()
                        .addComponent(lblRequisitos)
                        .addGap(98, 98, 98))))
        );
        pnlRequisitosLayout.setVerticalGroup(
            pnlRequisitosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRequisitosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblRequisitos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Requisitos)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pnlNoticias.add(pnlRequisitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        pnlBiblioteca.setBackground(new java.awt.Color(32, 73, 155));
        pnlBiblioteca.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlBibliotecaMouseMoved(evt);
            }
        });
        pnlBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBibliotecaMouseExited(evt);
            }
        });

        Biblioteca.setBackground(new java.awt.Color(255, 255, 255));
        Biblioteca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Biblioteca.setForeground(new java.awt.Color(255, 255, 255));
        Biblioteca.setText("Biblioteca");

        lblBiblioteca.setBackground(new java.awt.Color(255, 255, 255));
        lblBiblioteca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        lblBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Biblioteca.png"))); // NOI18N

        javax.swing.GroupLayout pnlBibliotecaLayout = new javax.swing.GroupLayout(pnlBiblioteca);
        pnlBiblioteca.setLayout(pnlBibliotecaLayout);
        pnlBibliotecaLayout.setHorizontalGroup(
            pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBibliotecaLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBiblioteca)
                    .addComponent(Biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        pnlBibliotecaLayout.setVerticalGroup(
            pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBibliotecaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblBiblioteca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Biblioteca)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pnlNoticias.add(pnlBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        pnlAnuncios2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAnuncio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3.jpg"))); // NOI18N
        lblAnuncio3.setToolTipText("");
        pnlAnuncios2.add(lblAnuncio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        lblAnuncio6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/umg000.jpg"))); // NOI18N
        pnlAnuncios2.add(lblAnuncio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 180));

        lblAnuncio8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edificio_Administrativo_Campus_Central.jpg"))); // NOI18N
        pnlAnuncios2.add(lblAnuncio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 600, 190));

        pnlAnuncios1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAnuncio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        pnlAnuncios1.add(lblAnuncio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 370));

        lblAnuncio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/umg003.jpg"))); // NOI18N
        pnlAnuncios1.add(lblAnuncio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 260));

        lblAnuncio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4.png"))); // NOI18N
        lblAnuncio4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlAnuncios1.add(lblAnuncio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 450, 110));

        lblAnuncio5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1.jpg"))); // NOI18N
        pnlAnuncios1.add(lblAnuncio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 200, 110));

        javax.swing.GroupLayout pnlAnuncios3Layout = new javax.swing.GroupLayout(pnlAnuncios3);
        pnlAnuncios3.setLayout(pnlAnuncios3Layout);
        pnlAnuncios3Layout.setHorizontalGroup(
            pnlAnuncios3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAnuncios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlAnuncios3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAnuncios3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlAnuncios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlAnuncios3Layout.setVerticalGroup(
            pnlAnuncios3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAnuncios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlAnuncios3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAnuncios3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlAnuncios1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlNoticias.add(pnlAnuncios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 370));

        pnlBody.add(pnlNoticias, "card4");

        jspRegistro.setBorder(null);
        jspRegistro.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspRegistro.setPreferredSize(new java.awt.Dimension(1090, 40));

        pnlTimeline.setBackground(new java.awt.Color(255, 255, 255));
        pnlTimeline.setMinimumSize(new java.awt.Dimension(940, 60));
        pnlTimeline.setPreferredSize(new java.awt.Dimension(926, 700));
        pnlTimeline.setRequestFocusEnabled(false);
        pnlTimeline.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setBackground(new java.awt.Color(0, 204, 106));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vista");
        jLabel7.setOpaque(true);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pnlTimeline.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setBackground(new java.awt.Color(52, 152, 219));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Manego");
        jLabel8.setOpaque(true);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlTimeline.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, 250));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setBackground(new java.awt.Color(243, 156, 18));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Personalizacion");
        jLabel9.setOpaque(true);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlTimeline.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        jspRegistro.setViewportView(pnlTimeline);

        pnlBody.add(jspRegistro, "card2");

        pnlNotas.setBackground(new java.awt.Color(255, 255, 255));
        pnlNotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(44, 62, 80));
        jLabel19.setText("NOTAS");
        pnlNotas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));
        pnlNotas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 870, 10));

        pnlBody.add(pnlNotas, "card5");

        pnlPagos.setBackground(new java.awt.Color(255, 255, 255));
        pnlPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(44, 62, 80));
        jLabel18.setText("PAGOS");
        pnlPagos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));
        pnlPagos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 870, 10));

        pnlBody.add(pnlPagos, "card4");

        pnlCronograma.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(44, 62, 80));
        jLabel20.setText("CRONOGRAMA");

        javax.swing.GroupLayout pnlCronogramaLayout = new javax.swing.GroupLayout(pnlCronograma);
        pnlCronograma.setLayout(pnlCronogramaLayout);
        pnlCronogramaLayout.setHorizontalGroup(
            pnlCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCronogramaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        pnlCronogramaLayout.setVerticalGroup(
            pnlCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCronogramaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        pnlBody.add(pnlCronograma, "card6");

        pnlMaestros.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(44, 62, 80));
        jLabel21.setText("REGISTRO MAESTROS");

        javax.swing.GroupLayout pnlMaestrosLayout = new javax.swing.GroupLayout(pnlMaestros);
        pnlMaestros.setLayout(pnlMaestrosLayout);
        pnlMaestrosLayout.setHorizontalGroup(
            pnlMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaestrosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        pnlMaestrosLayout.setVerticalGroup(
            pnlMaestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaestrosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        pnlBody.add(pnlMaestros, "card6");

        pnlCentro.add(pnlBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1090, 570));

        jPanel_Plataforma.add(pnlCentro, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_Plataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_Plataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved

    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited

    }//GEN-LAST:event_jLabel2MouseExited

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        lblNoticias.setBackground(new Color(0, 204, 106));
        lblPagos.setBackground(new Color(color[0], color[1], color[2]));
        lblNotas.setBackground(new Color(color[0], color[1], color[2]));
        lblCronograma.setBackground(new Color(color[0], color[1], color[2]));
     
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(pnlNoticias);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        pnlTemas.repaint();
        pnlTemas.revalidate();
        pnlTemas.add(pnlClaro);
        pnlTemas.add(pnlOscuro);
        pnlTemas.repaint();
        pnlTemas.revalidate();

    }//GEN-LAST:event_btnAjustesActionPerformed

    private void btnGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaActionPerformed

    }//GEN-LAST:event_btnGraficaActionPerformed

    private void btnCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculadoraMouseClicked
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnCalculadoraMouseClicked

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    private void btnPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaginaMouseClicked
        try {
            Desktop.getDesktop().browse(URI.create("https://umg.edu.gt/"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);

        }
    }//GEN-LAST:event_btnPaginaMouseClicked

    private void btnPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaginaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaginaActionPerformed

    private void btnInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionMouseClicked
        new Universidad().show();
    }//GEN-LAST:event_btnInformacionMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        Login PF = new Login();
        PF.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void pnlOscuroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOscuroMousePressed
        color[0] = 17;
        color[1] = 17;
        color[2] = 17;
        lblNoticias.setBackground(new Color(color[0], color[1], color[2]));
      
        lblPagos.setBackground(new Color(color[0], color[1], color[2]));
        lblNotas.setBackground(new Color(color[0], color[1], color[2]));
        lblCronograma.setBackground(new Color(color[0], color[1], color[2]));
     
        pnlMenu.setBackground(new java.awt.Color(color[0], color[1], color[2]));
        pnlTimeline.setBackground(new java.awt.Color(24,24,24));
        pnlNotas.setBackground(new java.awt.Color(24,24,24));
        pnlPagos.setBackground(new java.awt.Color(24,24,24));
        pnlCronograma.setBackground(new java.awt.Color(24,24,24));
        pnlMaestros.setBackground(new java.awt.Color(24,24,24));
        pnlTemas.removeAll();
        pnlTemas.repaint();
        pnlTemas.revalidate();

        pnlTemas.repaint();
        pnlTemas.revalidate();
    }//GEN-LAST:event_pnlOscuroMousePressed

    private void pnlClaroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlClaroMousePressed
        color[0] = 204;
        color[1] = 204;
        color[2] = 204;
        lblNoticias.setBackground(new Color(color[0], color[1], color[2]));
      
        lblPagos.setBackground(new Color(color[0], color[1], color[2]));
        lblNotas.setBackground(new Color(color[0], color[1], color[2]));
        lblCronograma.setBackground(new Color(color[0], color[1], color[2]));
      
        pnlMenu.setBackground(new java.awt.Color(color[0], color[1], color[2]));
        pnlTimeline.setBackground(new java.awt.Color(255,255,255));
        pnlNotas.setBackground(new java.awt.Color(255,255,255));
        pnlPagos.setBackground(new java.awt.Color(255,255,255));
        pnlCronograma.setBackground(new java.awt.Color(255,255,255));
        pnlMaestros.setBackground(new java.awt.Color(255,255,255));
        pnlTemas.removeAll();
        pnlTemas.repaint();
        pnlTemas.revalidate();

        pnlTemas.repaint();
        pnlTemas.revalidate();
    }//GEN-LAST:event_pnlClaroMousePressed

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
        if (maximized) {
            //handle fullscreen - taskbar
            PlataformaAlumnos.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            PlataformaAlumnos.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_btnMaximizeActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNoticiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoticiasActionPerformed
        lblNoticias.setBackground(new Color(0, 204, 106));

     
        lblPagos.setBackground(new Color(color[0], color[1], color[2]));
        lblNotas.setBackground(new Color(color[0], color[1], color[2]));
        lblCronograma.setBackground(new Color(color[0], color[1], color[2]));
      
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(pnlNoticias);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btnNoticiasActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        lblPagos.setBackground(new Color(0, 204, 106));

        lblNoticias.setBackground(new Color(color[0], color[1], color[2]));
       
        lblNotas.setBackground(new Color(color[0], color[1], color[2]));
        lblCronograma.setBackground(new Color(color[0], color[1], color[2]));
       

        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(pnlPagos);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        lblNotas.setBackground(new Color(0, 204, 106));

        lblNoticias.setBackground(new Color(color[0], color[1], color[2]));
      
        lblPagos.setBackground(new Color(color[0], color[1], color[2]));
        lblCronograma.setBackground(new Color(color[0], color[1], color[2]));
       
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(pnlNotas);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btnNotasActionPerformed

    private void btnCronogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronogramaActionPerformed
        lblCronograma.setBackground(new Color(0, 204, 106));

        lblNoticias.setBackground(new Color(color[0], color[1], color[2]));
     
        lblPagos.setBackground(new Color(color[0], color[1], color[2]));
        lblNotas.setBackground(new Color(color[0], color[1], color[2]));
        
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        pnlBody.add(pnlCronograma);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btnCronogramaActionPerformed

    private void pnlAdmisionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdmisionesMouseMoved
        pnlAdmisiones.setBackground(new java.awt.Color(255, 169, 0));
    }//GEN-LAST:event_pnlAdmisionesMouseMoved

    private void pnlAdmisionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAdmisionesMouseExited
        pnlAdmisiones.setBackground(new java.awt.Color(255, 204, 102));
    }//GEN-LAST:event_pnlAdmisionesMouseExited

    private void pnlFacultadesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFacultadesMouseMoved
        pnlFacultades.setBackground(new java.awt.Color(0, 155, 194));        // TODO add your handling code here:
    }//GEN-LAST:event_pnlFacultadesMouseMoved

    private void pnlFacultadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFacultadesMouseExited
        pnlFacultades.setBackground(new java.awt.Color(0, 204, 255));      // TODO add your handling code here:
    }//GEN-LAST:event_pnlFacultadesMouseExited

    private void pnlRequisitosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRequisitosMouseMoved
        pnlRequisitos.setBackground(new java.awt.Color(142, 178, 1));        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRequisitosMouseMoved

    private void pnlRequisitosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRequisitosMouseExited
        pnlRequisitos.setBackground(new java.awt.Color(166, 208, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRequisitosMouseExited

    private void pnlBibliotecaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBibliotecaMouseMoved
        pnlBiblioteca.setBackground(new java.awt.Color(68, 114, 205));       // TODO add your handling code here:
    }//GEN-LAST:event_pnlBibliotecaMouseMoved

    private void pnlBibliotecaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBibliotecaMouseExited
        pnlBiblioteca.setBackground(new java.awt.Color(32, 73, 155));       // TODO add your handling code here:
    }//GEN-LAST:event_pnlBibliotecaMouseExited

    private void jPanel_PlataformaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_PlataformaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel_PlataformaMouseDragged

    private void jPanel_PlataformaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_PlataformaMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel_PlataformaMousePressed
   
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PlataformaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlataformaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlataformaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlataformaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlataformaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admisiones;
    private javax.swing.JLabel Biblioteca;
    private javax.swing.JLabel Facultades;
    private javax.swing.JLabel Requisitos;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCronograma;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGrafica;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnMaximize;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnNoticias;
    private javax.swing.JButton btnPagina;
    private javax.swing.JButton btnPagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel_Plataforma;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JScrollPane jspRegistro;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblAdmisiones;
    private javax.swing.JLabel lblAnuncio1;
    private javax.swing.JLabel lblAnuncio2;
    private javax.swing.JLabel lblAnuncio3;
    private javax.swing.JLabel lblAnuncio4;
    private javax.swing.JLabel lblAnuncio5;
    private javax.swing.JLabel lblAnuncio6;
    private javax.swing.JLabel lblAnuncio8;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCronograma;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblEstudiantes;
    private javax.swing.JLabel lblFacultades;
    private javax.swing.JLabel lblMysql;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblNoticias;
    private javax.swing.JLabel lblPagos;
    private javax.swing.JLabel lblProfesores;
    private javax.swing.JLabel lblRequisitos;
    private javax.swing.JPanel pnlAdmisiones;
    private javax.swing.JPanel pnlAnuncios1;
    private javax.swing.JPanel pnlAnuncios2;
    private javax.swing.JPanel pnlAnuncios3;
    private javax.swing.JPanel pnlBiblioteca;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlClaro;
    private javax.swing.JPanel pnlCronograma;
    private javax.swing.JPanel pnlEncabezados;
    private javax.swing.JPanel pnlFacultades;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlMaestros;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JPanel pnlNoticias;
    private javax.swing.JPanel pnlOscuro;
    private javax.swing.JPanel pnlPagos;
    private javax.swing.JPanel pnlRequisitos;
    private javax.swing.JPanel pnlTemas;
    private javax.swing.JPanel pnlTimeline;
    private javax.swing.JPanel pnlizquierdo;
    // End of variables declaration//GEN-END:variables
}
