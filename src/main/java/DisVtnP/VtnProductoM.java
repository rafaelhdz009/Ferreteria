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
 * @author Rafael
 */
public class VtnProductoM extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();
    int pos, prod_idP;

    /**
     * Creates new form VtnProductoM
     */
    public VtnProductoM() {
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

        panelNaranja = new javax.swing.JPanel();
        etqSubtitulo = new javax.swing.JLabel();
        comboBoxP = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        etqModif = new javax.swing.JLabel();
        maderaO = new javax.swing.JLabel();
        etqNomP = new javax.swing.JLabel();
        txtNomP = new javax.swing.JTextField();
        txtPrecioP = new javax.swing.JTextField();
        etqMonP = new javax.swing.JLabel();
        etqCantP = new javax.swing.JLabel();
        txtExistP = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        maderaC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Productos");
        setIconImage(getIconImage());
        setResizable(false);
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

        panelNaranja.setBackground(new java.awt.Color(255, 204, 153));
        panelNaranja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqSubtitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        etqSubtitulo.setText("Escoge la clave del producto que deseas modificar: ");
        panelNaranja.add(etqSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        comboBoxP.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxP.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        comboBoxP.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona clave del producto" }));
        comboBoxP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBoxP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPActionPerformed(evt);
            }
        });
        panelNaranja.add(comboBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 220, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqModif.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        etqModif.setForeground(new java.awt.Color(255, 255, 255));
        etqModif.setText("Actualizar Producto");
        jPanel1.add(etqModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        maderaO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maderaOscura.jpg"))); // NOI18N
        jPanel1.add(maderaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 490, 130));

        panelNaranja.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 80));

        etqNomP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqNomP.setForeground(new java.awt.Color(0, 0, 0));
        etqNomP.setText("Nombre:");
        etqNomP.setToolTipText("Escribe el nombre del Producto");
        panelNaranja.add(etqNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        txtNomP.setToolTipText("Escribe el nombre del producto");
        txtNomP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNomP.setEnabled(false);
        txtNomP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomPActionPerformed(evt);
            }
        });
        txtNomP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomPKeyTyped(evt);
            }
        });
        panelNaranja.add(txtNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 120, -1));

        txtPrecioP.setToolTipText("Escribe el precio del producto");
        txtPrecioP.setEnabled(false);
        txtPrecioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioPActionPerformed(evt);
            }
        });
        txtPrecioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPKeyTyped(evt);
            }
        });
        panelNaranja.add(txtPrecioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 80, -1));

        etqMonP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqMonP.setForeground(new java.awt.Color(0, 0, 0));
        etqMonP.setText("Precio:");
        etqMonP.setToolTipText("Escribe el precio del producto");
        panelNaranja.add(etqMonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        etqCantP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etqCantP.setForeground(new java.awt.Color(0, 0, 0));
        etqCantP.setText("Existencias:");
        panelNaranja.add(etqCantP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        txtExistP.setToolTipText("Escribe las existencias del producto");
        txtExistP.setEnabled(false);
        txtExistP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistPActionPerformed(evt);
            }
        });
        txtExistP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExistPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExistPKeyTyped(evt);
            }
        });
        panelNaranja.add(txtExistP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 100, -1));

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
        panelNaranja.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

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
        panelNaranja.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        maderaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelNaranja.add(maderaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 460, 310));

        getContentPane().add(panelNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 440, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        try {
            if (Mensaje.pregunta(this, "Esta seguro de modificar el producto") == 0) {
                if (txtNomP.getText().equals("") || txtPrecioP.getText().equals("")
                        || txtExistP.getText().equals("")) {
                    Mensaje.error(this, "No se han llenado todos lo campos, verifique.");
                } else {
                    int registro = ferrD.actualizarP(txtNomP.getText(),
                            Double.parseDouble(txtPrecioP.getText()),
                            Integer.parseInt(txtExistP.getText()), prod_idP);
                    Mensaje.exito(this, registro + " registro actualizado");
                    Mensaje.exito(this, "Producto Modificado");
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(txtNomP, txtPrecioP, txtExistP, btnAceptar);
        CtrlInterfaz.habilita(false, txtPrecioP, txtExistP, btnAceptar, txtNomP);
        CtrlInterfaz.cambia(comboBoxP);
        comboBoxP.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNomPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNomPKeyTyped
    {//GEN-HEADEREND:event_txtNomPKeyTyped
        Validaciones.validaAlfabeticos(evt, 12, txtNomP.getText());
    }//GEN-LAST:event_txtNomPKeyTyped

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

    private void txtNomPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtNomPActionPerformed
    {//GEN-HEADEREND:event_txtNomPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomPActionPerformed

    private void txtPrecioPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPrecioPKeyTyped
    {//GEN-HEADEREND:event_txtPrecioPKeyTyped
        Validaciones.validaFlotantes(evt, 9, txtPrecioP.getText());
    }//GEN-LAST:event_txtPrecioPKeyTyped

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

    private void txtPrecioPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtPrecioPActionPerformed
    {//GEN-HEADEREND:event_txtPrecioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioPActionPerformed

    private void txtExistPKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtExistPKeyTyped
    {//GEN-HEADEREND:event_txtExistPKeyTyped
        Validaciones.validaEntero(evt, 6, txtExistP.getText());
    }//GEN-LAST:event_txtExistPKeyTyped

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

    private void txtExistPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtExistPActionPerformed
    {//GEN-HEADEREND:event_txtExistPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExistPActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void comboBoxPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboBoxPActionPerformed
    {//GEN-HEADEREND:event_comboBoxPActionPerformed
        try {
            if (this.comboBoxP.getSelectedIndex() != 0) {
                boolean ban = false;
                List<Integer> listaPV = this.ferrD.listaProdIdP();
                prod_idP = Integer.parseInt(String.valueOf(comboBoxP.getSelectedItem()));
                this.pos = this.comboBoxP.getSelectedIndex() - 1;

                for (int pv : listaPV) {
                    if (pv == prod_idP) {
                        ban = true;
                        break;
                    }
                }

                if (ban) {
                    Mensaje.error(this, "El producto con ID: " + prod_idP + " ya se ha vendido, "
                            + "no se puede modificar");
                    btnCancelarActionPerformed(evt);
                } else {
                    Productos p = this.ferrD.listaPWhere(prod_idP);
                    txtNomP.setText(p.getNombre());
                    txtPrecioP.setText(String.valueOf(p.getPrecio()));
                    txtExistP.setText(String.valueOf(p.getCantidad()));
                    CtrlInterfaz.cambia(this.txtNomP);
                }
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
            java.util.logging.Logger.getLogger(VtnProductoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnProductoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnProductoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnProductoM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnProductoM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboBoxP;
    private javax.swing.JLabel etqCantP;
    private javax.swing.JLabel etqModif;
    private javax.swing.JLabel etqMonP;
    private javax.swing.JLabel etqNomP;
    private javax.swing.JLabel etqSubtitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maderaC;
    private javax.swing.JLabel maderaO;
    private javax.swing.JPanel panelNaranja;
    private javax.swing.JTextField txtExistP;
    private javax.swing.JTextField txtNomP;
    private javax.swing.JTextField txtPrecioP;
    // End of variables declaration//GEN-END:variables
}
