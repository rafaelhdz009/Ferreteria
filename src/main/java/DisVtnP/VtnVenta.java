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
public class VtnVenta extends javax.swing.JFrame
{

    /**
     * Creates new form VtnVenta
     */
    public VtnVenta()
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

        panelVerdeF = new javax.swing.JPanel();
        panelBlanco = new javax.swing.JPanel();
        etqVenta = new javax.swing.JLabel();
        panelVerdeC = new javax.swing.JPanel();
        btnFactura = new javax.swing.JButton();
        btnNota = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        maderaClara = new javax.swing.JLabel();
        maderaOscura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venta");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVerdeF.setBackground(new java.awt.Color(51, 204, 0));
        panelVerdeF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBlanco.setBackground(new java.awt.Color(0, 0, 51));
        panelBlanco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBlanco.setForeground(new java.awt.Color(255, 255, 255));
        panelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqVenta.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        etqVenta.setForeground(new java.awt.Color(255, 255, 255));
        etqVenta.setText("Venta");
        panelBlanco.add(etqVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        panelVerdeF.add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 210, 50));

        panelVerdeC.setBackground(new java.awt.Color(204, 255, 204));
        panelVerdeC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelVerdeC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFactura.setBackground(new java.awt.Color(255, 255, 255));
        btnFactura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(0, 0, 0));
        btnFactura.setText("Factura");
        btnFactura.setToolTipText("Compra un producto por factura");
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        panelVerdeC.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        btnNota.setBackground(new java.awt.Color(255, 255, 255));
        btnNota.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNota.setForeground(new java.awt.Color(0, 0, 0));
        btnNota.setText("Nota");
        btnNota.setToolTipText("Compra un producto por venta");
        btnNota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaActionPerformed(evt);
            }
        });
        panelVerdeC.add(btnNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moneda.png"))); // NOI18N
        panelVerdeC.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        maderaClara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelVerdeC.add(maderaClara, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, 190));

        panelVerdeF.add(panelVerdeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 140));

        maderaOscura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maderaOscura.jpg"))); // NOI18N
        panelVerdeF.add(maderaOscura, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 530, 210));

        getContentPane().add(panelVerdeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFacturaActionPerformed
    {//GEN-HEADEREND:event_btnFacturaActionPerformed
        VtnFactura vtnFactura = new VtnFactura();
        vtnFactura.setVisible(true);
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnNotaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNotaActionPerformed
    {//GEN-HEADEREND:event_btnNotaActionPerformed
        VtnNota vtnNota = new VtnNota();
        vtnNota.setVisible(true);
    }//GEN-LAST:event_btnNotaActionPerformed

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
            java.util.logging.Logger.getLogger(VtnVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnNota;
    private javax.swing.JLabel etqVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel maderaClara;
    private javax.swing.JLabel maderaOscura;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JPanel panelVerdeC;
    private javax.swing.JPanel panelVerdeF;
    // End of variables declaration//GEN-END:variables
}
