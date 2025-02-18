/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

/**
 *
 * @author Equipo1
 */
public class VtnConsultas extends javax.swing.JFrame {

    /**
     * Creates new form VtnProductosB
     */
    public VtnConsultas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelBlanco = new javax.swing.JPanel();
        etqProd = new javax.swing.JLabel();
        etqC = new javax.swing.JLabel();
        btnTodP = new javax.swing.JButton();
        btnCveP = new javax.swing.JButton();
        btnFact = new javax.swing.JButton();
        btnNot = new javax.swing.JButton();
        btnVend = new javax.swing.JButton();
        etqV1 = new javax.swing.JLabel();
        btnTodosClientes = new javax.swing.JButton();
        btnRC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtBajasTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSelB = new javax.swing.JLabel();
        maderaBlanca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta");
        setIconImage(getIconImage());
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(211, 245, 245));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqProd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqProd.setForeground(new java.awt.Color(0, 0, 0));
        etqProd.setText("Productos:");
        panelBlanco.add(etqProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, 30));

        etqC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqC.setForeground(new java.awt.Color(0, 0, 0));
        etqC.setText("Cliente:");
        panelBlanco.add(etqC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        btnTodP.setBackground(new java.awt.Color(102, 0, 0));
        btnTodP.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTodP.setForeground(new java.awt.Color(255, 255, 255));
        btnTodP.setText("Todos los productos");
        btnTodP.setToolTipText("Cosulta todos lo productos");
        btnTodP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTodP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodPActionPerformed(evt);
            }
        });
        panelBlanco.add(btnTodP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        btnCveP.setBackground(new java.awt.Color(102, 0, 0));
        btnCveP.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCveP.setForeground(new java.awt.Color(255, 255, 255));
        btnCveP.setText("Clave de producto");
        btnCveP.setToolTipText("Consulta un producto por clave del producto");
        btnCveP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCveP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCvePActionPerformed(evt);
            }
        });
        panelBlanco.add(btnCveP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        btnFact.setBackground(new java.awt.Color(102, 0, 0));
        btnFact.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnFact.setForeground(new java.awt.Color(255, 255, 255));
        btnFact.setText("Factura");
        btnFact.setToolTipText("Consuta tus factura");
        btnFact.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });
        panelBlanco.add(btnFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        btnNot.setBackground(new java.awt.Color(102, 0, 0));
        btnNot.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNot.setForeground(new java.awt.Color(255, 255, 255));
        btnNot.setText("Nota");
        btnNot.setToolTipText("Consulta tus notas");
        btnNot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });
        panelBlanco.add(btnNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        btnVend.setBackground(new java.awt.Color(102, 0, 0));
        btnVend.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVend.setForeground(new java.awt.Color(255, 255, 255));
        btnVend.setText("Vendedor");
        btnVend.setToolTipText("Consulta tus facturas o notas por clave del vendedor");
        btnVend.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendActionPerformed(evt);
            }
        });
        panelBlanco.add(btnVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        etqV1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqV1.setForeground(new java.awt.Color(0, 0, 0));
        etqV1.setText("Ventas:");
        panelBlanco.add(etqV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        btnTodosClientes.setBackground(new java.awt.Color(102, 0, 0));
        btnTodosClientes.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTodosClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnTodosClientes.setText("Todos los clientes");
        btnTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosClientesActionPerformed(evt);
            }
        });
        panelBlanco.add(btnTodosClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        btnRC.setBackground(new java.awt.Color(102, 0, 0));
        btnRC.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRC.setForeground(new java.awt.Color(255, 255, 255));
        btnRC.setText("RFC/Correo del cliente");
        btnRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCActionPerformed(evt);
            }
        });
        panelBlanco.add(btnRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        panelFondo.add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 420, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBajasTitulo.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        txtBajasTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txtBajasTitulo.setText("Consulta");
        jPanel1.add(txtBajasTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        panelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 300, 60));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSelB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtSelB.setForeground(new java.awt.Color(255, 255, 255));
        txtSelB.setText("Selecciona tu tipo de consulta");
        jPanel2.add(txtSelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        panelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 270, 40));

        maderaBlanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maderaOscura2.jpg"))); // NOI18N
        panelFondo.add(maderaBlanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 630, 430));

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnTodPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTodPActionPerformed
    {//GEN-HEADEREND:event_btnTodPActionPerformed
        VtnCosultaP vtnConsP = new VtnCosultaP();
        vtnConsP.setVisible(true);
    }//GEN-LAST:event_btnTodPActionPerformed

    private void btnCvePActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCvePActionPerformed
    {//GEN-HEADEREND:event_btnCvePActionPerformed
        VtnCosultaCveP vtnConsCveP = new VtnCosultaCveP();
        vtnConsCveP.setVisible(true);
    }//GEN-LAST:event_btnCvePActionPerformed

    private void btnFactActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFactActionPerformed
    {//GEN-HEADEREND:event_btnFactActionPerformed
        VtnDespFac vtnDespF = new VtnDespFac();
        vtnDespF.setVisible(true);
    }//GEN-LAST:event_btnFactActionPerformed

    private void btnNotActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNotActionPerformed
    {//GEN-HEADEREND:event_btnNotActionPerformed
        VtnDespNot vtnDepNot = new VtnDespNot();
        vtnDepNot.setVisible(true);
    }//GEN-LAST:event_btnNotActionPerformed

    private void btnVendActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVendActionPerformed
    {//GEN-HEADEREND:event_btnVendActionPerformed
        VtnDespVendedor vtnDespV = new VtnDespVendedor();
        vtnDespV.setVisible(true);
    }//GEN-LAST:event_btnVendActionPerformed

    private void btnTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosClientesActionPerformed
        VtnCosultaCl vtnConsultaTodosCliente = new VtnCosultaCl();
        vtnConsultaTodosCliente.setVisible(true);
    }//GEN-LAST:event_btnTodosClientesActionPerformed

    private void btnRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCActionPerformed
        VtnCosultaRCliente vtnCosultaRFC = new VtnCosultaRCliente();
        vtnCosultaRFC.setVisible(true);
    }//GEN-LAST:event_btnRCActionPerformed

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
            java.util.logging.Logger.getLogger(VtnConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VtnConsultas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCveP;
    private javax.swing.JButton btnFact;
    private javax.swing.JButton btnNot;
    private javax.swing.JButton btnRC;
    private javax.swing.JButton btnTodP;
    private javax.swing.JButton btnTodosClientes;
    private javax.swing.JButton btnVend;
    private javax.swing.JLabel etqC;
    private javax.swing.JLabel etqProd;
    private javax.swing.JLabel etqV1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel maderaBlanca;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel txtBajasTitulo;
    private javax.swing.JLabel txtSelB;
    // End of variables declaration//GEN-END:variables
}
