/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

import cjb.ci.Mensaje;
import datos.FerreteriaDAO;
import domain.Productos;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class VtnCosultaCveP extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();

    /**
     * Creates new form VtnCosultaP
     */
    public VtnCosultaCveP() {
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

        etqConsulta = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        etqPorCve = new javax.swing.JLabel();
        panelAmarillo = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        txtConsultaClv = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        comoBoxProd = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta por clave");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqConsulta.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        etqConsulta.setText("Consulta");
        getContentPane().add(etqConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 199, -1));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etqPorCve.setFont(new java.awt.Font("Brush Script MT", 0, 24)); // NOI18N
        etqPorCve.setText("Por clave");

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(etqPorCve)
                .addGap(21, 21, 21))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(etqPorCve))
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 270, 60));

        panelAmarillo.setBackground(new java.awt.Color(255, 255, 204));

        txtConsultaClv.setEditable(false);
        txtConsultaClv.setColumns(20);
        txtConsultaClv.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtConsultaClv.setRows(5);
        scrollPane.setViewportView(txtConsultaClv);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Clave del producto: ");

        comoBoxProd.setBackground(new java.awt.Color(255, 255, 153));
        comoBoxProd.setForeground(new java.awt.Color(0, 0, 0));
        comoBoxProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona clave de producto" }));
        comoBoxProd.setToolTipText("Selecciona un producto");
        comoBoxProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comoBoxProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comoBoxProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAmarilloLayout = new javax.swing.GroupLayout(panelAmarillo);
        panelAmarillo.setLayout(panelAmarilloLayout);
        panelAmarilloLayout.setHorizontalGroup(
            panelAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAmarilloLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comoBoxProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAmarilloLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        panelAmarilloLayout.setVerticalGroup(
            panelAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAmarilloLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(panelAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comoBoxProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        getContentPane().add(panelAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try {
            llenaComboCve();
        } catch (Exception e) {
            Mensaje.error(this, "Aún no hay registros");
            dispose();
        }

    }//GEN-LAST:event_formWindowOpened

    private void comoBoxProdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comoBoxProdActionPerformed
    {//GEN-HEADEREND:event_comoBoxProdActionPerformed
        if (this.comoBoxProd.getSelectedIndex() != 0) {
            int idProducto = Integer.parseInt(String.valueOf(this.comoBoxProd.getSelectedItem()));
            Productos p = this.ferrD.listaPWhere(idProducto);
            String desp = p.toString();
            this.txtConsultaClv.setText(desp);
        } else {
            this.txtConsultaClv.setText("");
        }
    }//GEN-LAST:event_comoBoxProdActionPerformed

    public void llenaComboCve() {
        List<Integer> arr = ferrD.listaIdP();
        for (int idP : arr) {
            this.comoBoxProd.addItem(String.valueOf(idP));
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
            java.util.logging.Logger.getLogger(VtnCosultaCveP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnCosultaCveP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnCosultaCveP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnCosultaCveP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnCosultaCveP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comoBoxProd;
    private javax.swing.JLabel etqConsulta;
    private javax.swing.JLabel etqPorCve;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelAmarillo;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea txtConsultaClv;
    // End of variables declaration//GEN-END:variables
}
