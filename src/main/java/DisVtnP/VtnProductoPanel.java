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
public class VtnProductoPanel extends javax.swing.JFrame
{

    /**
     * Creates new form VtnProductoPanel
     */
    public VtnProductoPanel()
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

        panelBlanco = new javax.swing.JPanel();
        panelAzul = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        persona = new javax.swing.JLabel();
        madera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productos");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(255, 255, 255));
        panelAzul.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Compra de productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelAzul.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        btnAlta.setBackground(new java.awt.Color(0, 51, 51));
        btnAlta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAlta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlta.setText("Altas");
        btnAlta.setToolTipText("De de alta un producto");
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        panelAzul.add(btnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        btnBaja.setBackground(new java.awt.Color(0, 51, 51));
        btnBaja.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBaja.setForeground(new java.awt.Color(255, 255, 255));
        btnBaja.setText("Bajas");
        btnBaja.setToolTipText("Da de baja un producto");
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });
        panelAzul.add(btnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 80, -1));

        btnMod.setBackground(new java.awt.Color(0, 51, 51));
        btnMod.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnMod.setForeground(new java.awt.Color(255, 255, 255));
        btnMod.setText("Modificaciones");
        btnMod.setToolTipText("Modifica algún producto");
        btnMod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        panelAzul.add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));
        panelAzul.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 39, 45, 30));

        persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona.jpg"))); // NOI18N
        panelAzul.add(persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        panelBlanco.add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 440, 210));

        madera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera4.jpg"))); // NOI18N
        panelBlanco.add(madera, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 590, 310));

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed
        VtnProductoA vtnProdA = new VtnProductoA();
        vtnProdA.setVisible(true);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBajaActionPerformed
    {//GEN-HEADEREND:event_btnBajaActionPerformed
        VtnBajaCve vtnBajaCv = new VtnBajaCve();
        vtnBajaCv.setVisible(true);
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModActionPerformed
    {//GEN-HEADEREND:event_btnModActionPerformed
        VtnProductoM vtnProdM = new VtnProductoM();
        vtnProdM.setVisible(true);
    }//GEN-LAST:event_btnModActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
       VtnCompra vtnCompra = new VtnCompra();
       vtnCompra.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VtnProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnProductoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnProductoPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel madera;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JLabel persona;
    // End of variables declaration//GEN-END:variables
}
