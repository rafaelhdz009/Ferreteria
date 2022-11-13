/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

import cjb.ci.*;
import datos.FerreteriaDAO;
import domain.*;
import java.util.*;

/**
 *
 * @author Equipo1
 */
public class VtnBajaCve extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();
    int prod_idP;

    /**
     * Creates new form VtnBajaCve
     */
    public VtnBajaCve() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAB = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptarBajaCve = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        comboBoxCve = new javax.swing.JComboBox<>();
        maderaOscura = new javax.swing.JLabel();
        madera = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Baja por clave del producto");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto para dar de baja");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txtAB.setEditable(false);
        txtAB.setColumns(20);
        txtAB.setRows(5);
        jScrollPane1.setViewportView(txtAB);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 304, 196));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave:");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 36, -1, 30));

        btnAceptarBajaCve.setBackground(new java.awt.Color(0, 153, 0));
        btnAceptarBajaCve.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAceptarBajaCve.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarBajaCve.setText("Aceptar");
        btnAceptarBajaCve.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptarBajaCve.setEnabled(false);
        btnAceptarBajaCve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarBajaCveActionPerformed(evt);
            }
        });
        btnAceptarBajaCve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptarBajaCveKeyPressed(evt);
            }
        });
        jPanel2.add(btnAceptarBajaCve, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        comboBoxCve.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxCve.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        comboBoxCve.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxCve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clave del producto" }));
        comboBoxCve.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBoxCve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCveActionPerformed(evt);
            }
        });
        jPanel2.add(comboBoxCve, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 170, -1));

        maderaOscura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maderaOscura.jpg"))); // NOI18N
        jPanel2.add(maderaOscura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        madera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        jPanel1.add(madera, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, -1, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarBajaCveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarBajaCveActionPerformed
    {//GEN-HEADEREND:event_btnAceptarBajaCveActionPerformed
        if (Mensaje.pregunta(this, "¿Estás seguro de eliminar el producto?") == 0) {
            int registro = this.ferrD.deletePW(this.prod_idP);
            CtrlInterfaz.limpia(txtAB);
            Mensaje.exito(this, "Producto eliminado");
            CtrlInterfaz.limpia(comboBoxCve);
            comboBoxCve.removeAllItems();
            comboBoxCve.addItem("Clave del producto");
            llenaComboCve();
            comboBoxCve.setSelectedIndex(0);
            btnCancelarActionPerformed(evt);

        } else {
            Mensaje.error(this, "Operacion cancelada");
            btnCancelarActionPerformed(evt);
        }
    }//GEN-LAST:event_btnAceptarBajaCveActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(btnAceptarBajaCve, txtAB);
        CtrlInterfaz.habilita(false, btnAceptarBajaCve);
        CtrlInterfaz.cambia(comboBoxCve);
        this.comboBoxCve.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarBajaCveKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarBajaCveKeyPressed
    {//GEN-HEADEREND:event_btnAceptarBajaCveKeyPressed
        if (evt.getKeyChar() == '\n') {
            btnAceptarBajaCveActionPerformed(null);
        }
    }//GEN-LAST:event_btnAceptarBajaCveKeyPressed

    private void comboBoxCveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboBoxCveActionPerformed
    {//GEN-HEADEREND:event_comboBoxCveActionPerformed
        try {
            if (this.comboBoxCve.getSelectedIndex() != 0) {
                boolean ban = false;
                List<Integer> listaPV = this.ferrD.listaProdIdP();
                prod_idP = Integer.parseInt(String.valueOf(comboBoxCve.getSelectedItem()));

                for (int pv : listaPV) {
                    if (pv == prod_idP) {
                        ban = true;
                        break;
                    }
                }

                if (ban) {
                    Mensaje.error(this, "El producto con ID: " + prod_idP + " ya se ha vendido, "
                            + "no se puede borrar");
                    comboBoxCve.setSelectedIndex(0);
                    btnCancelarActionPerformed(evt);
                } else {
                    Productos p = this.ferrD.listaPWhere(prod_idP);
                    txtAB.setText(p.toString());
                    CtrlInterfaz.cambia(btnAceptarBajaCve);
                }
            } else {
                btnCancelarActionPerformed(evt);
            }
        } catch (Exception e) {
            //e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_comboBoxCveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try {
            llenaComboCve();
        } catch (Exception e) {
            Mensaje.error(this, "Aún no hay registros");
            this.dispose();
        }

    }//GEN-LAST:event_formWindowOpened

    public void llenaComboCve() {
        List<Integer> arr = ferrD.listaIdP();
        for (int idP : arr) {
            this.comboBoxCve.addItem(String.valueOf(idP));
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
            java.util.logging.Logger.getLogger(VtnBajaCve.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnBajaCve.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnBajaCve.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnBajaCve.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnBajaCve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarBajaCve;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboBoxCve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel madera;
    private javax.swing.JLabel maderaOscura;
    private javax.swing.JTextArea txtAB;
    // End of variables declaration//GEN-END:variables
}
