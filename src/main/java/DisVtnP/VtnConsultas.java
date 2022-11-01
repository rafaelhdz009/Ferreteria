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
 * @author Rafael
 */
public class VtnConsultas extends javax.swing.JFrame
{

    /**
     * Creates new form VtnProductosB
     */
    public VtnConsultas()
    {
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
        txtBajasTitulo = new javax.swing.JLabel();
        txtSelB = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        etqProd = new javax.swing.JLabel();
        etqV = new javax.swing.JLabel();
        btnTodP = new javax.swing.JButton();
        btnCveP = new javax.swing.JButton();
        btnFact = new javax.swing.JButton();
        btnNot = new javax.swing.JButton();
        btnVend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta");
        setIconImage(getIconImage());
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(211, 245, 245));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBajasTitulo.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        txtBajasTitulo.setForeground(new java.awt.Color(0, 102, 102));
        txtBajasTitulo.setText("Consulta");
        panelFondo.add(txtBajasTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        txtSelB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtSelB.setForeground(new java.awt.Color(51, 51, 51));
        txtSelB.setText("Selecciona tu tipo de consulta:");
        panelFondo.add(txtSelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 82, -1, -1));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        etqProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etqProd.setForeground(new java.awt.Color(0, 0, 0));
        etqProd.setText("Productos:");

        etqV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etqV.setForeground(new java.awt.Color(0, 0, 0));
        etqV.setText("Ventas:");

        btnTodP.setBackground(new java.awt.Color(204, 204, 204));
        btnTodP.setForeground(new java.awt.Color(0, 0, 0));
        btnTodP.setText("Todos los productos");
        btnTodP.setToolTipText("Cosulta todos lo productos");
        btnTodP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTodP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodPActionPerformed(evt);
            }
        });

        btnCveP.setBackground(new java.awt.Color(204, 204, 204));
        btnCveP.setForeground(new java.awt.Color(0, 0, 0));
        btnCveP.setText("Clave de producto");
        btnCveP.setToolTipText("Consulta un producto por clave del producto");
        btnCveP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCveP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCvePActionPerformed(evt);
            }
        });

        btnFact.setBackground(new java.awt.Color(204, 204, 204));
        btnFact.setForeground(new java.awt.Color(0, 0, 0));
        btnFact.setText("Factura");
        btnFact.setToolTipText("Consuta tus factura");
        btnFact.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });

        btnNot.setBackground(new java.awt.Color(204, 204, 204));
        btnNot.setForeground(new java.awt.Color(0, 0, 0));
        btnNot.setText("Nota");
        btnNot.setToolTipText("Consulta tus notas");
        btnNot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });

        btnVend.setBackground(new java.awt.Color(204, 204, 204));
        btnVend.setForeground(new java.awt.Color(0, 0, 0));
        btnVend.setText("Vendedor");
        btnVend.setToolTipText("Consulta tus facturas o notas por clave del vendedor");
        btnVend.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTodP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCveP)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                        .addComponent(btnFact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNot)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(etqV)))
                        .addGap(34, 34, 34)
                        .addComponent(btnVend)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqProd)
                .addGap(116, 116, 116))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTodP)
                    .addComponent(btnCveP))
                .addGap(38, 38, 38)
                .addComponent(etqV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFact)
                    .addComponent(btnNot)
                    .addComponent(btnVend))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelFondo.add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 190));

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 370));

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
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
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnConsultas().setVisible(true);
            }
        });
    }

//    @Override
//    public Image getIconImage()
//    {
//        Image obj = Toolkit.getDefaultToolkit().
//                getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
//
//        return obj;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCveP;
    private javax.swing.JButton btnFact;
    private javax.swing.JButton btnNot;
    private javax.swing.JButton btnTodP;
    private javax.swing.JButton btnVend;
    private javax.swing.JLabel etqProd;
    private javax.swing.JLabel etqV;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel txtBajasTitulo;
    private javax.swing.JLabel txtSelB;
    // End of variables declaration//GEN-END:variables
}
