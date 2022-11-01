/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

import cjb.ci.*;
import datos.FerreteriaDAO;
import domain.Productos;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class VtnCompra extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();
    int prod_idP;

    /**
     * Creates new form VtnCompra
     */
    public VtnCompra() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        maderaOscura = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etqCant = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        txtAreaC = new javax.swing.JTextArea();
        comboBoxP = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        maderaSuave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra");
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 255, 235));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqTitulo.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Compra");
        jPanel2.add(etqTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        maderaOscura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maderaOscura.jpg"))); // NOI18N
        jPanel2.add(maderaOscura, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 520, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Clave del producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        etqCant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCant.setForeground(new java.awt.Color(0, 0, 0));
        etqCant.setText("Cantidad: ");
        jPanel1.add(etqCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        txtCant.setEnabled(false);
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantKeyTyped(evt);
            }
        });
        jPanel1.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 100, -1));

        txtAreaC.setEditable(false);
        txtAreaC.setColumns(20);
        txtAreaC.setRows(5);
        jScrollPane.setViewportView(txtAreaC);

        jPanel1.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 390, 140));

        comboBoxP.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBoxP.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona clave del producto" }));
        comboBoxP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBoxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 210, -1));

        btnAceptar.setBackground(new java.awt.Color(0, 153, 0));
        btnAceptar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptarKeyPressed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 0));
        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        maderaSuave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        jPanel1.add(maderaSuave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCantKeyPressed
    {//GEN-HEADEREND:event_txtCantKeyPressed
        try {
            if (evt.getKeyChar() == '\n') {
                if (Integer.parseInt(txtCant.getText()) <= 0) {
                    Mensaje.error(this, "Las existencias no pueden ser cero");
                    CtrlInterfaz.cambia(txtCant);
                } else {
                    Validaciones.enterEntero(this, evt, txtCant, btnAceptar);
                }
            }

        } catch (Exception e) {
            Validaciones.enter(this, evt, txtCant, txtCant, "Capo vacío");
        }
    }//GEN-LAST:event_txtCantKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(txtCant, txtAreaC, btnAceptar);
        CtrlInterfaz.habilita(false, txtCant, btnAceptar);
        this.comboBoxP.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        try {
            if (Integer.parseInt(this.txtCant.getText()) <= 0) {
                Mensaje.error(this, "Cantidad incorrecta (No puede ser menor o igual a 0)");
                CtrlInterfaz.cambia(txtCant);
                CtrlInterfaz.habilita(false, btnAceptar);
            } else {
                if (Mensaje.pregunta(this, "Desea guardar esta informacion?") == 0) {
                    int cant = this.ferrD.cantidadP(this.prod_idP) + Integer.parseInt(this.txtCant.getText());
                    int registro = this.ferrD.actualizarPcant(cant, this.prod_idP);
                    Mensaje.exito(this, registro + " registro actualizado");
                    Mensaje.exito(this, "Compra exitosa");
                    btnCancelarActionPerformed(evt);
                } else {
                    Mensaje.error(this, "Operacion cancelada");
                    btnCancelarActionPerformed(evt);
                }
            }
        } catch (Exception e) {
            Mensaje.error(this, "Verifique los datos, no esta seleccionando producto o no esta llenando el campo de cantidad");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCantKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCantKeyTyped
    {//GEN-HEADEREND:event_txtCantKeyTyped
        Validaciones.validaEntero(evt, 6, txtCant.getText());
    }//GEN-LAST:event_txtCantKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void comboBoxPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboBoxPActionPerformed
    {//GEN-HEADEREND:event_comboBoxPActionPerformed
        try {
            if (this.comboBoxP.getSelectedIndex() != 0) {
                prod_idP = Integer.parseInt(String.valueOf(this.comboBoxP.getSelectedItem()));
                Productos p = this.ferrD.listaPWhere(prod_idP);
                String desp = p.toString();
                this.txtAreaC.setText(desp);
                CtrlInterfaz.habilita(true, txtCant);
            } else {
                btnCancelarActionPerformed(evt);
            }
        } catch (Exception e) {
            //e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_comboBoxPActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try {
            llenaComboCve();
        } catch (Exception e) {
            Mensaje.error(this, "Aún no hay registros");
            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarKeyPressed
    {//GEN-HEADEREND:event_btnAceptarKeyPressed
        if (evt.getKeyChar() == '\n') {
            btnAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAceptarKeyPressed

    public void llenaComboCve() {
        List<Integer> arr = ferrD.listaIdP();
        for (int idP : arr) {
            this.comboBoxP.addItem(String.valueOf(idP));
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
            java.util.logging.Logger.getLogger(VtnCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboBoxP;
    private javax.swing.JLabel etqCant;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel maderaOscura;
    private javax.swing.JLabel maderaSuave;
    private javax.swing.JTextArea txtAreaC;
    private javax.swing.JTextField txtCant;
    // End of variables declaration//GEN-END:variables
}
