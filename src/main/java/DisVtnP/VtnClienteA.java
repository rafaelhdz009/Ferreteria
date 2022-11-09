/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

import cjb.ci.*;
import datos.FerreteriaDAO;
import domain.Cliente;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class VtnClienteA extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();

    /**
     * Creates new form VtnProductoA
     */
    public VtnClienteA() {
        initComponents();
        this.setTitle("Altas clientes");

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
        txtTel = new javax.swing.JTextField();
        etqNom = new javax.swing.JLabel();
        etqApPat = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etqAltasT = new javax.swing.JLabel();
        maderaOscura = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApPat = new javax.swing.JTextField();
        txtApMat = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        etqApMat = new javax.swing.JLabel();
        etqRFC = new javax.swing.JLabel();
        etqCorreo = new javax.swing.JLabel();
        etqTel = new javax.swing.JLabel();
        etqOpcional1 = new javax.swing.JLabel();
        maderaClara = new javax.swing.JLabel();
        maderaClara1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas");
        setBackground(new java.awt.Color(204, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul.setBackground(new java.awt.Color(204, 255, 255));
        panelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setBackground(new java.awt.Color(51, 153, 0));
        btnAceptar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
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
        panelAzul.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTel.setToolTipText("");
        txtTel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtTel.setEnabled(false);
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        panelAzul.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 130, -1));

        etqNom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqNom.setForeground(new java.awt.Color(0, 0, 0));
        etqNom.setText("Nombre:");
        etqNom.setToolTipText("Escribe el nombre del Producto");
        panelAzul.add(etqNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        etqApPat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqApPat.setForeground(new java.awt.Color(0, 0, 0));
        etqApPat.setText("Apellido Paterno:");
        etqApPat.setToolTipText("Escribe el precio del producto");
        panelAzul.add(etqApPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelAzul.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqAltasT.setFont(new java.awt.Font("Broadway", 1, 36)); // NOI18N
        etqAltasT.setForeground(new java.awt.Color(255, 255, 255));
        etqAltasT.setText("Cliente");
        jPanel1.add(etqAltasT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        maderaOscura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maderaOscura2.jpg"))); // NOI18N
        jPanel1.add(maderaOscura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 450, 80));

        panelAzul.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        txtNom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNom.setToolTipText("");
        txtNom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });
        panelAzul.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, -1));

        txtApPat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApPat.setToolTipText("");
        txtApPat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtApPat.setEnabled(false);
        txtApPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApPatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApPatKeyTyped(evt);
            }
        });
        panelAzul.add(txtApPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, -1));

        txtApMat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApMat.setToolTipText("");
        txtApMat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtApMat.setEnabled(false);
        txtApMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApMatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApMatKeyTyped(evt);
            }
        });
        panelAzul.add(txtApMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, -1));

        txtRFC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRFC.setToolTipText("");
        txtRFC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtRFC.setEnabled(false);
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRFCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        panelAzul.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, -1));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setToolTipText("");
        txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCorreo.setEnabled(false);
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        panelAzul.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 240, -1));

        etqApMat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqApMat.setForeground(new java.awt.Color(0, 0, 0));
        etqApMat.setText("Apellido Materno:");
        panelAzul.add(etqApMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        etqRFC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqRFC.setForeground(new java.awt.Color(0, 0, 0));
        etqRFC.setText("RFC:");
        panelAzul.add(etqRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        etqCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCorreo.setForeground(new java.awt.Color(0, 0, 0));
        etqCorreo.setText("Correo:");
        panelAzul.add(etqCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        etqTel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqTel.setForeground(new java.awt.Color(0, 0, 0));
        etqTel.setText("Teléfono:");
        panelAzul.add(etqTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        etqOpcional1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etqOpcional1.setForeground(new java.awt.Color(0, 0, 0));
        etqOpcional1.setText("(Opcional)");
        panelAzul.add(etqOpcional1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        maderaClara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelAzul.add(maderaClara, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 450, 240));

        maderaClara1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelAzul.add(maderaClara1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 340));

        getContentPane().add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(txtNom, txtApPat, txtApMat, txtRFC, txtCorreo, txtTel);
        CtrlInterfaz.habilita(false, btnAceptar, txtApPat, txtApMat, txtRFC, txtCorreo, txtTel);
        CtrlInterfaz.cambia(txtNom);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        try {
            if (Mensaje.pregunta(this, "Desea guardar esta informacion?") == 0) {
                int cveProd = idCliente();
                if (txtNom.getText().equals("") || txtApPat.getText().equals("")
                        || txtApMat.getText().equals("") || txtRFC.getText().equals("")
                        || txtCorreo.getText().equals("")) {
                    Mensaje.error(this, "No se han llenado todos lo campos, verifique.");
                } else if (txtRFC.getText().length() < 12) {
                    Mensaje.error(this, "Faltan digitos en el rfc, compruebe.");
                } else if (!txtTel.getText().equals("") && txtTel.getText().length() < 10) {
                    Mensaje.error(this, "Faltan digitos en el teléfono, compruebe.");
                } else {
                    boolean ban = false;
                    List<Cliente> cliente = this.ferrD.listaCliente();
                    for (Cliente c : cliente) {
                        if (c.getRfc().equals(this.txtRFC.getText()) || c.getCorreo().equals(this.txtCorreo.getText())) {
                            ban = true;
                            break;
                        }
                    }
                    if (!ban) {
                        String nombre = this.txtNom.getText();
                        String apPat = this.txtApPat.getText();
                        String apMat = this.txtApMat.getText();
                        String rfc = this.txtRFC.getText().toUpperCase();
                        String correo = this.txtCorreo.getText();
                        String tel = this.txtTel.getText();
                        if (tel.equals("")) {
                            tel = "NULL";
                        }
                        int registro = this.ferrD.insertCliente(cveProd, nombre, apPat, apMat, rfc, correo, tel);
                        Mensaje.exito(this, registro + " registro insertado");
                        Mensaje.exito(this, "Cliente dado de alta");
                        btnCancelarActionPerformed(evt);
                    } else {
                        Mensaje.error(this, "El correo y el RFC son unicos, verifique.");
                    }
                }
            } else {
                Mensaje.error(this, "Operacion cancelada");
                btnCancelarActionPerformed(evt);
            }
        } catch (Exception e) {
            Mensaje.error(this, "No se han llenado todos los campos, compruebe.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    public int idCliente() {
        List<Integer> list = this.ferrD.listaIdCliente();
        int id = 1027;
        if (list.size() == 0) {
            return id;
        } else {
            id = this.ferrD.listaIdMaxCliente() + 1;
            return id;
        }
    }


    private void txtTelKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTelKeyPressed
    {//GEN-HEADEREND:event_txtTelKeyPressed
        String s = "";
        if (evt.getKeyChar() == '\n') {
            if (!txtTel.getText().equals(s)) {
                if (txtTel.getText().length() < 10) {
                    Mensaje.error(this, "No puede ser menor a 10 digitos");
                } else {
                    Validaciones.enter(this, evt, btnAceptar);
                }
            } else {
                Validaciones.enter(this, evt, btnAceptar);
            }
        }
    }//GEN-LAST:event_txtTelKeyPressed

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtTelKeyTyped
    {//GEN-HEADEREND:event_txtTelKeyTyped
        Validaciones.validaEntero(evt, 10, txtTel.getText());
    }//GEN-LAST:event_txtTelKeyTyped

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnAceptarKeyPressed
    {//GEN-HEADEREND:event_btnAceptarKeyPressed
        if (evt.getKeyChar() == '\n') {
            btnAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void txtNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyPressed
        String s = "";
        if (evt.getKeyChar() == '\n') {
            if (txtNom.getText().equals(s)) {
                Mensaje.error(this, "El campo no puede estar vacío");
            } else {
                Validaciones.enter(this, evt, txtApPat);
            }
        }
    }//GEN-LAST:event_txtNomKeyPressed

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, txtNom.getText());
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtApPatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPatKeyPressed
        String s = "";
        if (evt.getKeyChar() == '\n') {
            if (txtApPat.getText().equals(s)) {
                Mensaje.error(this, "El campo no puede estar vacío");
            } else {
                Validaciones.enter(this, evt, txtApMat);
            }
        }
    }//GEN-LAST:event_txtApPatKeyPressed

    private void txtApPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPatKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, txtApPat.getText());
    }//GEN-LAST:event_txtApPatKeyTyped

    private void txtApMatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMatKeyPressed
        String s = "";
        if (evt.getKeyChar() == '\n') {
            if (txtApMat.getText().equals(s)) {
                Mensaje.error(this, "El campo no puede estar vacío");
            } else {
                Validaciones.enter(this, evt, txtRFC);
            }
        }
    }//GEN-LAST:event_txtApMatKeyPressed

    private void txtApMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMatKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, txtApMat.getText());
    }//GEN-LAST:event_txtApMatKeyTyped

    private void txtRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyPressed
        String s = "";
        if (evt.getKeyChar() == '\n') {
            if (txtRFC.getText().equals(s)) {
                Mensaje.error(this, "El campo no puede estar vacío");
            } else if (txtRFC.getText().length() < 12) {
                Mensaje.error(this, "Faltan digitos, compruebe.");
            } else {
                Validaciones.enter(this, evt, txtCorreo);
            }
        }
    }//GEN-LAST:event_txtRFCKeyPressed

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        Validaciones.validaAlfanumerico(evt, 13, txtRFC.getText());
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        String s = "";
        if (evt.getKeyChar() == '\n') {
            if (txtCorreo.getText().equals(s)) {
                Mensaje.error(this, "El campo no puede estar vacío");
            } else {
                Validaciones.enter(this, evt, txtTel);
            }
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        if (txtCorreo.getText().length() >= 38) {
            Mensaje.error(this, "El correo demasiados caracteres, verifique.");
            CtrlInterfaz.limpia(txtCorreo);
            CtrlInterfaz.cambia(this.txtCorreo);
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

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
            java.util.logging.Logger.getLogger(VtnClienteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnClienteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnClienteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnClienteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnClienteA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel etqAltasT;
    private javax.swing.JLabel etqApMat;
    private javax.swing.JLabel etqApPat;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqNom;
    private javax.swing.JLabel etqOpcional1;
    private javax.swing.JLabel etqRFC;
    private javax.swing.JLabel etqTel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maderaClara;
    private javax.swing.JLabel maderaClara1;
    private javax.swing.JLabel maderaOscura;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
