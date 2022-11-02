/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

import cjb.ci.*;
import datos.FerreteriaDAO;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class VtnProductoA extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();

    /**
     * Creates new form VtnProductoA
     */
    public VtnProductoA() {
        initComponents();
        this.setTitle("Altas");

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
        btnAceptar = new javax.swing.JButton();
        txtExistP = new javax.swing.JTextField();
        etqCantP = new javax.swing.JLabel();
        txtNomP = new javax.swing.JTextField();
        etqNomP = new javax.swing.JLabel();
        txtPrecioP = new javax.swing.JTextField();
        etqMonP = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etqAltasT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas");
        setBackground(new java.awt.Color(204, 255, 255));
        setIconImage(getIconImage());
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(204, 255, 255));
        panelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setBackground(new java.awt.Color(51, 153, 0));
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
        panelAzul.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 267, -1, -1));

        txtExistP.setToolTipText("Escribe las existencias del producto");
        txtExistP.setEnabled(false);
        txtExistP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExistPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExistPKeyTyped(evt);
            }
        });
        panelAzul.add(txtExistP, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 194, 140, -1));

        etqCantP.setForeground(new java.awt.Color(0, 0, 0));
        etqCantP.setText("Existencias:");
        panelAzul.add(etqCantP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        txtNomP.setToolTipText("Escribe el nombre del producto");
        txtNomP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNomP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomPKeyTyped(evt);
            }
        });
        panelAzul.add(txtNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 149, -1));

        etqNomP.setForeground(new java.awt.Color(0, 0, 0));
        etqNomP.setText("Nombre:");
        etqNomP.setToolTipText("Escribe el nombre del Producto");
        panelAzul.add(etqNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        txtPrecioP.setToolTipText("Escribe el precio del producto");
        txtPrecioP.setEnabled(false);
        txtPrecioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPKeyTyped(evt);
            }
        });
        panelAzul.add(txtPrecioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 194, 141, -1));

        etqMonP.setForeground(new java.awt.Color(0, 0, 0));
        etqMonP.setText("Precio:");
        etqMonP.setToolTipText("Escribe el precio del producto");
        panelAzul.add(etqMonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

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
        panelAzul.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 267, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        etqAltasT.setFont(new java.awt.Font("Broadway", 1, 36)); // NOI18N
        etqAltasT.setForeground(new java.awt.Color(255, 255, 255));
        etqAltasT.setText("Altas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(etqAltasT)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqAltasT)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelAzul.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 60));

        getContentPane().add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(txtNomP, txtPrecioP, txtExistP, btnAceptar);
        CtrlInterfaz.habilita(false, txtPrecioP, txtExistP, btnAceptar);
        CtrlInterfaz.cambia(txtNomP);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        try {

            if (Mensaje.pregunta(this, "Desea guardar esta informacion?") == 0) {
                int cveProd = idProducto();
                if (txtNomP.getText().equals("") || txtPrecioP.getText().equals("")
                        || txtExistP.getText().equals("")) {
                    Mensaje.error(this, "No se han llenado todos lo campos, verifique.");
                } else {
                    String nombre = txtNomP.getText();
                    double precio = Double.parseDouble(txtPrecioP.getText());
                    int cantidad = Integer.parseInt(txtExistP.getText());
                    int registro = this.ferrD.insertP(cveProd, nombre, precio, cantidad);
                    Mensaje.exito(this, registro + " registro insertado");
                    Mensaje.exito(this, "Producto dado de alta");
                    btnCancelarActionPerformed(evt);
                }
            } else {
                Mensaje.error(this, "Operacion cancelada");
                btnCancelarActionPerformed(evt);
            }
        } catch (Exception e) {
            Mensaje.error(this, "No se han llenado todos los campos, compruebe.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    public int idProducto() {
        List<Integer> list = this.ferrD.listaIdP();
        int id = 1;
        if (list.size() == 0) {
            return id;
        } else {
            id = this.ferrD.listaIdMax() + 1;
            return id;
        }
    }
    private void txtNomPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNomPKeyPressed
    {//GEN-HEADEREND:event_txtNomPKeyPressed
        String s = "";
        if (evt.getKeyChar() == '\n') {
            if (txtNomP.getText().equals(s)) {
                Mensaje.error(this, "El campo no puede estar vacío");
            } else {
                Validaciones.enter(this, evt, txtPrecioP);
            }
        }
    }//GEN-LAST:event_txtNomPKeyPressed

    private void txtPrecioPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPrecioPKeyPressed
    {//GEN-HEADEREND:event_txtPrecioPKeyPressed
        try {
            if (evt.getKeyChar() == '\n') {
                if (Double.parseDouble(txtPrecioP.getText()) <= 0) {
                    Mensaje.error(this, "El precio no puede ser cero");
                    CtrlInterfaz.cambia(txtPrecioP);
                } else {
                    Validaciones.enterFlotante(this, evt, txtPrecioP, txtExistP);
                }
            }

        } catch (Exception e) {
            Validaciones.enter(this, evt, txtPrecioP, txtPrecioP, "Capo vacío");
        }

    }//GEN-LAST:event_txtPrecioPKeyPressed

    private void txtExistPKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtExistPKeyPressed
    {//GEN-HEADEREND:event_txtExistPKeyPressed
        try {
            if (evt.getKeyChar() == '\n') {
                if (Integer.parseInt(txtExistP.getText()) <= 0) {
                    Mensaje.error(this, "Las existencias no pueden ser cero");
                    CtrlInterfaz.cambia(txtExistP);
                } else {
                    Validaciones.enterEntero(this, evt, txtExistP, btnAceptar);
                }
            }

        } catch (Exception e) {
            Validaciones.enter(this, evt, txtExistP, txtExistP, "Capo vacío");
        }
    }//GEN-LAST:event_txtExistPKeyPressed

    private void txtNomPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNomPKeyTyped
    {//GEN-HEADEREND:event_txtNomPKeyTyped
        Validaciones.validaAlfabeticos(evt, 12, txtNomP.getText());
    }//GEN-LAST:event_txtNomPKeyTyped

    private void txtPrecioPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPrecioPKeyTyped
    {//GEN-HEADEREND:event_txtPrecioPKeyTyped
        Validaciones.validaFlotantes(evt, 9, txtPrecioP.getText());
    }//GEN-LAST:event_txtPrecioPKeyTyped

    private void txtExistPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtExistPKeyTyped
    {//GEN-HEADEREND:event_txtExistPKeyTyped
        Validaciones.validaEntero(evt, 6, txtExistP.getText());
    }//GEN-LAST:event_txtExistPKeyTyped

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarKeyPressed
    {//GEN-HEADEREND:event_btnAceptarKeyPressed
        if (evt.getKeyChar() == '\n') {
            btnAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAceptarKeyPressed

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
            java.util.logging.Logger.getLogger(VtnProductoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnProductoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnProductoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnProductoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnProductoA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel etqAltasT;
    private javax.swing.JLabel etqCantP;
    private javax.swing.JLabel etqMonP;
    private javax.swing.JLabel etqNomP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JTextField txtExistP;
    private javax.swing.JTextField txtNomP;
    private javax.swing.JTextField txtPrecioP;
    // End of variables declaration//GEN-END:variables
}
