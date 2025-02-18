/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Equipo1
 */
public class VtnPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VtnProduto
     */
    public VtnPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Compra Venta");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        lbCliente = new javax.swing.JLabel();
        panelVentas = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        panelProductos = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        panelConsultas = new javax.swing.JPanel();
        btnConsultas = new javax.swing.JButton();
        armeirBlanco = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        madera3 = new javax.swing.JLabel();
        partesFerreteria = new javax.swing.JLabel();
        gabinete = new javax.swing.JLabel();
        FondoPrincipal = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuProd = new javax.swing.JMenu();
        itemAlta = new javax.swing.JMenuItem();
        itemModif = new javax.swing.JMenuItem();
        itemBajas = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenu();
        itemFactura = new javax.swing.JMenuItem();
        itemNota = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Alta = new javax.swing.JMenuItem();
        itemModificaciones = new javax.swing.JMenuItem();
        bajaCliente = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        itemProductoC = new javax.swing.JMenuItem();
        itemVentaC = new javax.swing.JMenuItem();
        consultaCliente = new javax.swing.JMenuItem();
        verOpc = new javax.swing.JMenu();
        checkP = new javax.swing.JCheckBoxMenuItem();
        checkV = new javax.swing.JCheckBoxMenuItem();
        checkCosulta = new javax.swing.JCheckBoxMenuItem();
        checkCliente = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(0, 102, 102));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        btnAgregar.setToolTipText("Da de alta un cliente");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        lbCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        getContentPane().add(lbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        panelVentas.setBackground(new java.awt.Color(51, 51, 51));
        panelVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelVentas.setForeground(new java.awt.Color(204, 255, 255));

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(0, 0, 0));
        btnVentas.setText("Ventas");
        btnVentas.setToolTipText("");
        btnVentas.setBorder(new javax.swing.border.MatteBorder(null));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 150, 60));

        panelProductos.setBackground(new java.awt.Color(51, 51, 51));
        panelProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnProductos.setText("Productos");
        btnProductos.setBorder(new javax.swing.border.MatteBorder(null));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        panelProductos.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));

        getContentPane().add(panelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 130, 60));

        panelConsultas.setBackground(new java.awt.Color(51, 51, 51));
        panelConsultas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnConsultas.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultas.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultas.setText("Consultas");
        btnConsultas.setBorder(new javax.swing.border.MatteBorder(null));
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConsultasLayout = new javax.swing.GroupLayout(panelConsultas);
        panelConsultas.setLayout(panelConsultasLayout);
        panelConsultasLayout.setHorizontalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultasLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelConsultasLayout.setVerticalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(panelConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 140, 60));

        armeirBlanco.setFont(new java.awt.Font("Castellar", 3, 54)); // NOI18N
        armeirBlanco.setForeground(new java.awt.Color(255, 255, 255));
        armeirBlanco.setText("ARMEIR");
        getContentPane().add(armeirBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        dinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dinero.png"))); // NOI18N
        getContentPane().add(dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        madera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera3.jpg"))); // NOI18N
        getContentPane().add(madera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        partesFerreteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/partesFerreteria.png"))); // NOI18N
        getContentPane().add(partesFerreteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 250, 140));

        gabinete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gabinete.png"))); // NOI18N
        getContentPane().add(gabinete, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPrincipal.jpg"))); // NOI18N
        getContentPane().add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        menuProd.setForeground(new java.awt.Color(0, 0, 0));
        menuProd.setText("Producto");
        menuProd.setToolTipText("");
        menuProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itemAlta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemAlta.setForeground(new java.awt.Color(0, 0, 0));
        itemAlta.setText("Alta");
        itemAlta.setToolTipText("Dar de alta producto");
        itemAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAltaActionPerformed(evt);
            }
        });
        itemAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemAltaKeyPressed(evt);
            }
        });
        menuProd.add(itemAlta);

        itemModif.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemModif.setForeground(new java.awt.Color(0, 0, 0));
        itemModif.setText("Modificaciones");
        itemModif.setToolTipText("Modifica algún producto en existencia");
        itemModif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModifActionPerformed(evt);
            }
        });
        menuProd.add(itemModif);

        itemBajas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemBajas.setForeground(new java.awt.Color(0, 0, 0));
        itemBajas.setText("Bajas");
        itemBajas.setToolTipText("Da de baja un producto");
        itemBajas.setActionCommand("Baja");
        itemBajas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajasActionPerformed(evt);
            }
        });
        menuProd.add(itemBajas);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setText("Compra de productos");
        jMenuItem2.setToolTipText("Compra más productos");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuProd.add(jMenuItem2);

        menuBar.add(menuProd);

        menuVenta.setForeground(new java.awt.Color(0, 0, 0));
        menuVenta.setText("Venta");
        menuVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        itemFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemFactura.setBackground(new java.awt.Color(0, 0, 0));
        itemFactura.setForeground(new java.awt.Color(0, 0, 0));
        itemFactura.setText("Factura");
        itemFactura.setToolTipText("Compra un producto por factura");
        itemFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFacturaActionPerformed(evt);
            }
        });
        menuVenta.add(itemFactura);

        itemNota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemNota.setBackground(new java.awt.Color(0, 0, 0));
        itemNota.setForeground(new java.awt.Color(0, 0, 0));
        itemNota.setText("Nota");
        itemNota.setToolTipText("Compra un producto por nota");
        itemNota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNotaActionPerformed(evt);
            }
        });
        menuVenta.add(itemNota);

        menuBar.add(menuVenta);

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Cliente");

        Alta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Alta.setForeground(new java.awt.Color(0, 0, 0));
        Alta.setText("Alta");
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });
        jMenu1.add(Alta);

        itemModificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemModificaciones.setForeground(new java.awt.Color(0, 0, 0));
        itemModificaciones.setText("Modificaciones");
        itemModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificacionesActionPerformed(evt);
            }
        });
        jMenu1.add(itemModificaciones);

        bajaCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        bajaCliente.setForeground(new java.awt.Color(0, 0, 0));
        bajaCliente.setText("Baja");
        bajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(bajaCliente);

        menuBar.add(jMenu1);

        menuConsultas.setBackground(new java.awt.Color(255, 255, 255));
        menuConsultas.setForeground(new java.awt.Color(0, 0, 0));
        menuConsultas.setText("Consulta");
        menuConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });

        itemProductoC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemProductoC.setBackground(new java.awt.Color(0, 0, 0));
        itemProductoC.setForeground(new java.awt.Color(0, 0, 0));
        itemProductoC.setText("Productos");
        itemProductoC.setToolTipText("Consulta tus productos");
        itemProductoC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemProductoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductoCActionPerformed(evt);
            }
        });
        menuConsultas.add(itemProductoC);

        itemVentaC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemVentaC.setBackground(new java.awt.Color(0, 0, 0));
        itemVentaC.setForeground(new java.awt.Color(0, 0, 0));
        itemVentaC.setText("Ventas");
        itemVentaC.setToolTipText("Consulta tus ventas");
        itemVentaC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemVentaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVentaCActionPerformed(evt);
            }
        });
        menuConsultas.add(itemVentaC);

        consultaCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        consultaCliente.setForeground(new java.awt.Color(0, 0, 0));
        consultaCliente.setText("Clientes");
        consultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaClienteActionPerformed(evt);
            }
        });
        menuConsultas.add(consultaCliente);

        menuBar.add(menuConsultas);

        verOpc.setForeground(new java.awt.Color(0, 0, 0));
        verOpc.setText("Ver");
        verOpc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        checkP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        checkP.setForeground(new java.awt.Color(0, 0, 0));
        checkP.setSelected(true);
        checkP.setText("Productos");
        checkP.setToolTipText("");
        checkP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPActionPerformed(evt);
            }
        });
        verOpc.add(checkP);

        checkV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        checkV.setForeground(new java.awt.Color(0, 0, 0));
        checkV.setSelected(true);
        checkV.setText("Ventas");
        checkV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVActionPerformed(evt);
            }
        });
        verOpc.add(checkV);

        checkCosulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        checkCosulta.setForeground(new java.awt.Color(0, 0, 0));
        checkCosulta.setSelected(true);
        checkCosulta.setText("Consultas");
        checkCosulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkCosulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCosultaActionPerformed(evt);
            }
        });
        verOpc.add(checkCosulta);

        checkCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        checkCliente.setForeground(new java.awt.Color(0, 0, 0));
        checkCliente.setSelected(true);
        checkCliente.setText("Cliente");
        checkCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkClienteActionPerformed(evt);
            }
        });
        verOpc.add(checkCliente);

        menuBar.add(verOpc);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
//        p = (Producto[]) ManipulaArchivos.cargaArchivoArrObj("productos.dat");
//        v = (Venta[]) ManipulaArchivos.cargaArchivoArrObj("ventas.dat");
//        dd = (Detalle[][]) ManipulaArchivos.cargaArchivoArrObj("detalles.dat");
    }//GEN-LAST:event_formWindowOpened

    private void itemAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemAltaActionPerformed
    {//GEN-HEADEREND:event_itemAltaActionPerformed
        VtnProductoA vtnPA = new VtnProductoA();
        vtnPA.setVisible(true);
    }//GEN-LAST:event_itemAltaActionPerformed

    private void itemAltaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_itemAltaKeyPressed
    {//GEN-HEADEREND:event_itemAltaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAltaKeyPressed

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuConsultasActionPerformed
    {//GEN-HEADEREND:event_menuConsultasActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_menuConsultasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        // ManipulaArchivos.guardaArchivo("../Proyecto/productos.dat", VtnPrincipal.p);
    }//GEN-LAST:event_formWindowClosing

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConsultasActionPerformed
    {//GEN-HEADEREND:event_btnConsultasActionPerformed
        VtnConsultas vtnCons = new VtnConsultas();
        vtnCons.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVentasActionPerformed
    {//GEN-HEADEREND:event_btnVentasActionPerformed
        VtnVenta vtnVenta = new VtnVenta();
        vtnVenta.setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void itemProductoCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemProductoCActionPerformed
    {//GEN-HEADEREND:event_itemProductoCActionPerformed
        VtnConsulPItem vtnConsulProdI = new VtnConsulPItem();
        vtnConsulProdI.setVisible(true);
    }//GEN-LAST:event_itemProductoCActionPerformed

    private void itemVentaCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemVentaCActionPerformed
    {//GEN-HEADEREND:event_itemVentaCActionPerformed
        VtnConsulVItem vtnConsVenI = new VtnConsulVItem();
        vtnConsVenI.setVisible(true);
    }//GEN-LAST:event_itemVentaCActionPerformed

    private void itemModifActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemModifActionPerformed
    {//GEN-HEADEREND:event_itemModifActionPerformed
        VtnProductoM vtProdM = new VtnProductoM();
        vtProdM.setVisible(true);
    }//GEN-LAST:event_itemModifActionPerformed

    private void itemBajasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemBajasActionPerformed
    {//GEN-HEADEREND:event_itemBajasActionPerformed
        VtnBajaCve vtnBajaCv = new VtnBajaCve();
        vtnBajaCv.setVisible(true);
    }//GEN-LAST:event_itemBajasActionPerformed

    private void checkPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_checkPActionPerformed
    {//GEN-HEADEREND:event_checkPActionPerformed
        if (panelProductos.isVisible()) {
            panelProductos.setVisible(false);
        } else {
            panelProductos.setVisible(true);
        }
    }//GEN-LAST:event_checkPActionPerformed

    private void checkVActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_checkVActionPerformed
    {//GEN-HEADEREND:event_checkVActionPerformed
        if (panelVentas.isVisible()) {
            panelVentas.setVisible(false);
        } else {
            panelVentas.setVisible(true);
        }
    }//GEN-LAST:event_checkVActionPerformed

    private void checkCosultaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_checkCosultaActionPerformed
    {//GEN-HEADEREND:event_checkCosultaActionPerformed
        if (panelConsultas.isVisible()) {
            panelConsultas.setVisible(false);
        } else {
            panelConsultas.setVisible(true);
        }
    }//GEN-LAST:event_checkCosultaActionPerformed

    private void itemFacturaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemFacturaActionPerformed
    {//GEN-HEADEREND:event_itemFacturaActionPerformed
        VtnFactura vtnFactura = new VtnFactura();
        vtnFactura.setVisible(true);
    }//GEN-LAST:event_itemFacturaActionPerformed

    private void itemNotaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemNotaActionPerformed
    {//GEN-HEADEREND:event_itemNotaActionPerformed
        VtnNota vtnNota = new VtnNota();
        vtnNota.setVisible(true);
    }//GEN-LAST:event_itemNotaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem2ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem2ActionPerformed
        VtnCompra vtCompra = new VtnCompra();
        vtCompra.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        VtnProductoPanel vtnProdPan = new VtnProductoPanel();
        vtnProdPan.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaActionPerformed
        VtnClienteA vtnClienteA = new VtnClienteA();
        vtnClienteA.setVisible(true);
    }//GEN-LAST:event_AltaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        VtnClienteA vtnClienteA = new VtnClienteA();
        vtnClienteA.setVisible(true);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void bajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaClienteActionPerformed
        VtnClienteBajaCve vtnClienteBajaCve = new VtnClienteBajaCve();
        vtnClienteBajaCve.setVisible(true);
    }//GEN-LAST:event_bajaClienteActionPerformed

    private void consultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaClienteActionPerformed
        VtnConsulCItem vtnCosultaClMnu = new VtnConsulCItem();
        vtnCosultaClMnu.setVisible(true);
    }//GEN-LAST:event_consultaClienteActionPerformed

    private void checkClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkClienteActionPerformed
        if (this.lbCliente.isVisible() && this.btnAgregar.isVisible()) {
            this.lbCliente.setVisible(false);
            this.btnAgregar.setVisible(false);
        } else {
            this.lbCliente.setVisible(true);
            this.btnAgregar.setVisible(true);
        }
    }//GEN-LAST:event_checkClienteActionPerformed

    private void itemModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificacionesActionPerformed
        VtnClienteM vtnClienteM = new VtnClienteM();
        vtnClienteM.setVisible(true);
    }//GEN-LAST:event_itemModificacionesActionPerformed

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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    @Override
    public Image getIconImage() {
        Image obj = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));

        return obj;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Alta;
    private javax.swing.JLabel FondoPrincipal;
    private javax.swing.JLabel armeirBlanco;
    private javax.swing.JMenuItem bajaCliente;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnVentas;
    private javax.swing.JCheckBoxMenuItem checkCliente;
    private javax.swing.JCheckBoxMenuItem checkCosulta;
    private javax.swing.JCheckBoxMenuItem checkP;
    private javax.swing.JCheckBoxMenuItem checkV;
    private javax.swing.JMenuItem consultaCliente;
    private javax.swing.JLabel dinero;
    private javax.swing.JLabel gabinete;
    private javax.swing.JMenuItem itemAlta;
    private javax.swing.JMenuItem itemBajas;
    private javax.swing.JMenuItem itemFactura;
    private javax.swing.JMenuItem itemModif;
    private javax.swing.JMenuItem itemModificaciones;
    private javax.swing.JMenuItem itemNota;
    private javax.swing.JMenuItem itemProductoC;
    private javax.swing.JMenuItem itemVentaC;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel madera3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuProd;
    private javax.swing.JMenu menuVenta;
    private javax.swing.JPanel panelConsultas;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JLabel partesFerreteria;
    private javax.swing.JMenu verOpc;
    // End of variables declaration//GEN-END:variables
}
