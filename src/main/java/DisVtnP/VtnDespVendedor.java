/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

import cjb.ci.Mensaje;
import datos.FerreteriaDAO;
import domain.Vendedor;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class VtnDespVendedor extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();
    int idVend;

    /**
     * Creates new form VtnDespFac
     */
    public VtnDespVendedor() {
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

        panelAzul = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        txtVend = new javax.swing.JTextArea();
        panelBlanco = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtTitulo1 = new javax.swing.JLabel();
        maderaO = new javax.swing.JLabel();
        etqVend = new javax.swing.JLabel();
        comboBoxV = new javax.swing.JComboBox<>();
        maderaC = new javax.swing.JLabel();
        maderaC1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta por vendedor");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(214, 252, 252));
        panelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVend.setEditable(false);
        txtVend.setColumns(20);
        txtVend.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txtVend.setRows(5);
        scrollPane.setViewportView(txtVend);

        panelAzul.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 436, 190));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Consulta por vendedor");
        panelBlanco.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 10, -1, -1));

        txtTitulo1.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        txtTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo1.setText("Consulta por vendedor");
        panelBlanco.add(txtTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        maderaO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera4.jpg"))); // NOI18N
        panelBlanco.add(maderaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 660, 340));

        panelAzul.add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 70));

        etqVend.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqVend.setForeground(new java.awt.Color(0, 0, 0));
        etqVend.setText("Vendedor:");
        panelAzul.add(etqVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 90, -1));

        comboBoxV.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxV.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el vendedor" }));
        comboBoxV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVActionPerformed(evt);
            }
        });
        panelAzul.add(comboBoxV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 210, -1));

        maderaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelAzul.add(maderaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        maderaC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelAzul.add(maderaC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, -1, -1));

        getContentPane().add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            llenaCombo();
        } catch (Exception e) {
            Mensaje.error(this, "Aún no hay registros");
            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void comboBoxVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVActionPerformed
        try {
            if (this.comboBoxV.getSelectedIndex() != 0) {
                this.idVend = Integer.parseInt(String.valueOf(this.comboBoxV.getSelectedItem()));
                Vendedor v = this.ferrD.listaVendWhere(idVend);
                this.txtVend.setText(v.toString());
            } else {
                this.txtVend.setText("");
            }
        } catch (Exception e) {
            //e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_comboBoxVActionPerformed

    public void llenaCombo() {
        List<Integer> list = ferrD.listaVendId();
        for (int idV : list) {
            this.comboBoxV.addItem(String.valueOf(idV));
        }
    }

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
            java.util.logging.Logger.getLogger(VtnDespVendedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnDespVendedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnDespVendedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnDespVendedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VtnDespVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxV;
    private javax.swing.JLabel etqVend;
    private javax.swing.JLabel maderaC;
    private javax.swing.JLabel maderaC1;
    private javax.swing.JLabel maderaO;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTitulo1;
    private javax.swing.JTextArea txtVend;
    // End of variables declaration//GEN-END:variables
}
