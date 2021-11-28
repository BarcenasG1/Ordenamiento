package programas;

import datos.DatosDesordenados;
import datos.DatosOrdenados;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Home extends javax.swing.JFrame {

    DatosDesordenados dD;
    DatosOrdenados dO;
    int num2, num1;
    long t, t1, t2;
    int[] arreglo;
    int tf;

    public Home() {
        initComponents();

        jTextField7.setBackground(new Color(0, 0, 0, 0));

        jLabel46.setVisible(false);
        jLabel47.setVisible(false);
        jLabel48.setVisible(false);
        jLabel49.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField10 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField11 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Generar Lista");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, 40));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("0");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 50, 40));

        jLabel51.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(178, 223, 219));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Clean");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel51MouseMoved(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 40));

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("0");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 50, 40));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero de Datos: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Maximo Aceptado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 3.png"))); // NOI18N
        jLabel13.setToolTipText("");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel13MouseMoved(evt);
            }
        });
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 30, 20));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 4.png"))); // NOI18N
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel14MouseMoved(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 30, 20));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 4.png"))); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel15MouseMoved(evt);
            }
        });
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 30, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 3.png"))); // NOI18N
        jLabel16.setToolTipText("");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel16MouseMoved(evt);
            }
        });
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 30, 20));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 3.png"))); // NOI18N
        jLabel46.setToolTipText("");
        jLabel46.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel46.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel46MouseMoved(evt);
            }
        });
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel46MouseExited(evt);
            }
        });
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 30, 20));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 4.png"))); // NOI18N
        jLabel47.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel47.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel47MouseMoved(evt);
            }
        });
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel47MouseExited(evt);
            }
        });
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 30, 20));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 3.png"))); // NOI18N
        jLabel48.setToolTipText("");
        jLabel48.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel48.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel48MouseMoved(evt);
            }
        });
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel48MouseExited(evt);
            }
        });
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 30, 20));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 4.png"))); // NOI18N
        jLabel49.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel49.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel49MouseMoved(evt);
            }
        });
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel49MouseExited(evt);
            }
        });
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 30, 20));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 158, 141)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 270));

        jLabel50.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Exit");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Recurso 1-8.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 107));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(201, 225, 222));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BubbleSort");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 110, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Comparisons:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 90, 20));

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Exchanges:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 90, 20));

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(178, 223, 219));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("---");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 90, 20));

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Time: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 90, 20));

        jLabel18.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(178, 223, 219));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("---");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 90, 20));

        jLabel19.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(178, 223, 219));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("---");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, 90, 20));

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 158, 141)));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 110, 160));

        jLabel21.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(201, 225, 222));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("QuickSort");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 110, 30));

        jLabel22.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Comparisons:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 90, 20));

        jLabel23.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Exchanges:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 90, 20));

        jLabel24.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(178, 223, 219));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("---");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 90, 20));

        jLabel25.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Time: ");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 90, 20));

        jLabel26.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(178, 223, 219));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("---");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 90, 20));

        jLabel27.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(178, 223, 219));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("---");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 90, 20));

        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 158, 141)));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 110, 160));

        jLabel29.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(178, 223, 219));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("---");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 90, 20));

        jLabel30.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(178, 223, 219));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("---");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 90, 20));

        jLabel31.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(201, 225, 222));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("ShellSort");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 110, 30));

        jLabel32.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(178, 223, 219));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("---");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 90, 20));

        jLabel33.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Time: ");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 90, 20));

        jLabel35.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Exchanges:");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 90, 20));

        jLabel36.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Comparisons:");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 90, 20));

        jLabel37.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(178, 223, 219));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("---");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 90, 20));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 158, 141)));
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 110, 160));

        jLabel38.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(178, 223, 219));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("---");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 90, 20));

        jLabel39.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(201, 225, 222));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Radix");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 110, 30));

        jLabel40.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(178, 223, 219));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("---");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 90, 20));

        jLabel41.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Time: ");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 90, 20));

        jLabel43.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Exchanges:");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 90, 20));

        jLabel44.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Comparisons:");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 90, 20));

        jLabel45.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Datos sin ordenar");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 170, -1));

        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 158, 141)));
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 110, 160));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 510, 10));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setAutoscrolls(false);
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField7.setOpaque(false);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 510, 20));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 510, 10));

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setAutoscrolls(false);
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField8.setOpaque(false);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 510, 20));

        jLabel52.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Ordenacion por BubbleSort");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 180, 170, -1));

        jLabel53.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Ordenacion por ShellSort");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 170, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 510, 10));

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setAutoscrolls(false);
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField9.setOpaque(false);
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 510, 20));

        jLabel54.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Ordenacion por Radix");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 170, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 510, 10));

        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.setAutoscrolls(false);
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField10.setOpaque(false);
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 510, 20));

        jLabel55.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Ordenacion por QuickSort");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 170, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 510, 10));

        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setAutoscrolls(false);
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField11.setOpaque(false);
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 510, 20));

        jLabel56.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Ordenar");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel56.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel56MouseMoved(evt);
            }
        });
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel56MouseExited(evt);
            }
        });
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 190, 40));

        jLabel57.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Ordenar Decendentemente");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel57.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel57MouseMoved(evt);
            }
        });
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel57MouseExited(evt);
            }
        });
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 190, 40));

        jLabel59.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Reordenar");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel59.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel59MouseMoved(evt);
            }
        });
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel59MouseExited(evt);
            }
        });
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 190, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Recurso 4-8.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 780, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 154, 141)));
        jLabel5.setForeground(new java.awt.Color(2, 154, 141));


    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jTextField7.setText("");
        dD = new DatosDesordenados(num1, num2);
        dD.generarValores();

        jTextField8.setText("" + dD);

        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);

        jLabel46.setVisible(true);
        jLabel47.setVisible(true);
        jLabel48.setVisible(true);
        jLabel49.setVisible(true);

        num2 = 0;
        num1 = 0;


    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel13MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseMoved
        jLabel13.setIcon(new ImageIcon("D:/Documents/NetBeansProjects/A3.5Ordenamiento/src/imagenes/Recurso 5.png"));
    }//GEN-LAST:event_jLabel13MouseMoved

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        num2 += 100;

        if (num2 <= 1000) {
            jLabel12.setText(num2 + "");
        } else {
            num2 = 1000;

        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel13.setIcon(new ImageIcon("D:/Documents/NetBeansProjects/A3.5Ordenamiento/src/imagenes/Recurso 3.png"));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
        jLabel14.setIcon(new ImageIcon("D:/Documents/NetBeansProjects/A3.5Ordenamiento/src/imagenes/Recurso 6.png"));
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        num2 -= 100;
        if (num2 > 0) {
            jLabel12.setText(num2 + "");

        } else {
            num2 = 0;
            jLabel12.setText("0");
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setIcon(new ImageIcon("D:/Documents/NetBeansProjects/A3.5Ordenamiento/src/imagenes/Recurso 4.png"));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseMoved
        jLabel15.setIcon(new ImageIcon("D:/Documents/NetBeansProjects/A3.5Ordenamiento/src/imagenes/Recurso 6.png"));
    }//GEN-LAST:event_jLabel15MouseMoved

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        num1 -= 100;
        if (num1 > 0) {
            jLabel17.setText(num1 + "");

        } else {
            num1 = 0;
            jLabel17.setText("0");
        }


    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setIcon(new ImageIcon("D:/Documents/NetBeansProjects/A3.5Ordenamiento/src/imagenes/Recurso 4.png"));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseMoved
        jLabel16.setIcon(new ImageIcon("D:/Documents/NetBeansProjects/A3.5Ordenamiento/src/imagenes/Recurso 5.png"));
    }//GEN-LAST:event_jLabel16MouseMoved

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        num1 += 100;

        if (num1 <= 2500) {
            jLabel17.setText(num1 + "");
        } else {
            num1 = 2500;

        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setIcon(new ImageIcon("D:/Documents/NetBeansProjects/A3.5Ordenamiento/src/imagenes/Recurso 3.png"));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel46MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseMoved

    }//GEN-LAST:event_jLabel46MouseMoved

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel46MouseExited

    private void jLabel47MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel47MouseMoved

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel47MouseExited

    private void jLabel48MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel48MouseMoved

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel48MouseExited

    private void jLabel49MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseMoved

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseExited

    private void jLabel56MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseMoved
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 214, 201)));
        jLabel56.setForeground(new java.awt.Color(113, 214, 201));
    }//GEN-LAST:event_jLabel56MouseMoved

    private void jLabel56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseExited
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel56MouseExited

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked

        //BubbleSort----------------------------------------
        t1 = System.nanoTime();   // start
        dO = dD.bubbleSort();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
        arreglo = new int[dO.getSize()];
        System.arraycopy(dO.getArray(), 0, arreglo, 0, dO.getSize());

        jTextField7.setText("" + dO);
        jLabel11.setText(t + " ns");
        jLabel18.setText("" + dD.dataBubbleSort1());
        jLabel19.setText("" + dD.dataBubbleSort2());
        //--------------------------------------------------

        //Quicksort----------------------------------------
        t1 = System.nanoTime();   // start
        dO = dD.Quicksort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField11.setText("" + dO);
        jLabel24.setText(t + " ns");
        jLabel26.setText("" + dD.dataquicksort2());
        jLabel27.setText("" + dD.dataquicksort1());
        //--------------------------------------------------

        //ShellSort----------------------------------------
        t1 = System.nanoTime();   // start
        dO = dD.ShellSort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField9.setText("" + dO);
        jLabel32.setText(t + " ns");
        jLabel29.setText("" + dD.datashellsort2());
        jLabel30.setText("" + dD.datashellsort1());
        //--------------------------------------------------

        //Radix----------------------------------------
        t1 = System.nanoTime();   // start
        dO = dD.RadixSort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField10.setText("" + dO);
        jLabel40.setText(t + " ns");
        // jLabel29.setText("" + dD.datashellsort2());
        //jLabel30.setText("" + dD.datashellsort1());
        //--------------------------------------------------


    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel59MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseMoved
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 214, 201)));
        jLabel59.setForeground(new java.awt.Color(113, 214, 201));
    }//GEN-LAST:event_jLabel59MouseMoved

    private void jLabel59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseExited
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel59MouseExited

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked

        //BubbleSort----------------------------------------
        t1 = System.nanoTime();   // start
        dO = dD.bubbleSortMC(arreglo);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField7.setText("" + dO);
        jLabel11.setText(t + " ns");
        jLabel18.setText("" + dD.dataBubbleSort1());
        jLabel19.setText("" + dD.dataBubbleSort2());
        //---------------------------------------------------

        //Quicksort------------------------------------------
        tf = 2;
        t1 = System.nanoTime();   // start
        dO = dD.Quicksort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField11.setText("" + dO);
        jLabel24.setText(t + " ns");
        jLabel26.setText("" + dD.dataquicksort2());
        jLabel27.setText("" + dD.dataquicksort1());
        tf = 0;
        //--------------------------------------------------

        //ShellSort----------------------------------------
        tf = 2;
        t1 = System.nanoTime();   // start
        dO = dD.ShellSort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField9.setText("" + dO);
        jLabel32.setText(t + " ns");
        jLabel29.setText("" + dD.datashellsort2());
        jLabel30.setText("" + dD.datashellsort1());
        tf = 0;
        //--------------------------------------------------

        //Radix----------------------------------------
        tf = 2;
        t1 = System.nanoTime();   // start
        dO = dD.RadixSort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField10.setText("" + dO);
        jLabel40.setText(t + " ns");
        // jLabel29.setText("" + dD.datashellsort2());
        //jLabel30.setText("" + dD.datashellsort1());
        tf = 0;
        //--------------------------------------------------


    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked

        jTextField7.setText("");
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel57MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseMoved
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 214, 201)));
        jLabel57.setForeground(new java.awt.Color(113, 214, 201));
    }//GEN-LAST:event_jLabel57MouseMoved

    private void jLabel57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseExited
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel57MouseExited

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        //BubbleSort----------------------------------------

        t1 = System.nanoTime();   // start
        dO = dD.bubbleSortDes();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField7.setText("" + dO);
        jLabel11.setText(t + " ns");
        jLabel18.setText("" + dD.dataBubbleSort1());
        jLabel19.setText("" + dD.dataBubbleSort2());
        //--------------------------------------------------

        //Quicksort------------------------------------------
        tf = 1;
        t1 = System.nanoTime();   // start
        dO = dD.Quicksort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField11.setText("" + dO);
        jLabel24.setText(t + " ns");
        jLabel26.setText("" + dD.dataquicksort2());
        jLabel27.setText("" + dD.dataquicksort1());
        tf = 0;
        //--------------------------------------------------

        //ShellSort----------------------------------------
        tf = 1;
        t1 = System.nanoTime();   // start
        dO = dD.ShellSort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField9.setText("" + dO);
        jLabel32.setText(t + " ns");
        jLabel29.setText("" + dD.datashellsort2());
        jLabel30.setText("" + dD.datashellsort1());
        tf = 0;
        //--------------------------------------------------

        //Radix----------------------------------------
        tf = 1;
        t1 = System.nanoTime();   // start
        dO = dD.RadixSort(arreglo, tf);
        t2 = System.nanoTime();   // stop
        t = t2 - t1;

        jTextField10.setText("" + dO);
        jLabel40.setText(t + " ns");
        //jLabel29.setText("" + dD.datashellsort2());
        //jLabel30.setText("" + dD.datashellsort1());
        tf = 0;
        //--------------------------------------------------

    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel51MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseMoved
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 154, 141)));
        jLabel51.setForeground(new java.awt.Color(2, 154, 141));
    }//GEN-LAST:event_jLabel51MouseMoved

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel51MouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
