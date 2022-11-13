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
 * @author Equipo1
 */
public class VtnClienteM extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();
    int cliente_idC;

    /**
     * Creates new form VtnProductoA
     */
    public VtnClienteM() {
        initComponents();
        this.setTitle("Actualizar cliente");
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
        etqNomP = new javax.swing.JLabel();
        etqMonP = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etqAltasT = new javax.swing.JLabel();
        maderaOsucra = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtApPat = new javax.swing.JTextField();
        txtApMat = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        etqCantP1 = new javax.swing.JLabel();
        etqCantP2 = new javax.swing.JLabel();
        etqCantP3 = new javax.swing.JLabel();
        etqCantP4 = new javax.swing.JLabel();
        etqOpcional1 = new javax.swing.JLabel();
        comboBoxCve = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        maderaClara = new javax.swing.JLabel();
        maderaClara1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar cliente");
        setBackground(new java.awt.Color(204, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
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
        panelAzul.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

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
        panelAzul.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 130, -1));

        etqNomP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqNomP.setForeground(new java.awt.Color(0, 0, 0));
        etqNomP.setText("Nombre:");
        etqNomP.setToolTipText("Escribe el nombre del Producto");
        panelAzul.add(etqNomP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        etqMonP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqMonP.setForeground(new java.awt.Color(0, 0, 0));
        etqMonP.setText("Apellido Paterno:");
        etqMonP.setToolTipText("Escribe el precio del producto");
        panelAzul.add(etqMonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

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
        panelAzul.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqAltasT.setFont(new java.awt.Font("Broadway", 1, 36)); // NOI18N
        etqAltasT.setForeground(new java.awt.Color(255, 255, 255));
        etqAltasT.setText("Actualizar Cliente");
        jPanel1.add(etqAltasT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        maderaOsucra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maderaOscura2.jpg"))); // NOI18N
        jPanel1.add(maderaOsucra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 460, 100));

        panelAzul.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        txtNom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNom.setToolTipText("");
        txtNom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNom.setEnabled(false);
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });
        panelAzul.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, -1));

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
        panelAzul.add(txtApPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, -1));

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
        panelAzul.add(txtApMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, -1));

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
        panelAzul.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, -1));

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
        panelAzul.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 240, -1));

        etqCantP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCantP1.setForeground(new java.awt.Color(0, 0, 0));
        etqCantP1.setText("Apellido Materno:");
        panelAzul.add(etqCantP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        etqCantP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCantP2.setForeground(new java.awt.Color(0, 0, 0));
        etqCantP2.setText("RFC:");
        panelAzul.add(etqCantP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        etqCantP3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCantP3.setForeground(new java.awt.Color(0, 0, 0));
        etqCantP3.setText("Correo:");
        panelAzul.add(etqCantP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        etqCantP4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCantP4.setForeground(new java.awt.Color(0, 0, 0));
        etqCantP4.setText("Teléfono:");
        panelAzul.add(etqCantP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        etqOpcional1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etqOpcional1.setForeground(new java.awt.Color(0, 0, 0));
        etqOpcional1.setText("(Opcional)");
        panelAzul.add(etqOpcional1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        comboBoxCve.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxCve.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxCve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona clave del cliente" }));
        comboBoxCve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCveActionPerformed(evt);
            }
        });
        panelAzul.add(comboBoxCve, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Escoge la clave del cliente que deseas modificar: ");
        panelAzul.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        maderaClara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelAzul.add(maderaClara, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 190, -1, -1));

        maderaClara1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelAzul.add(maderaClara1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 50, -1, -1));

        getContentPane().add(panelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(txtNom, txtApPat, txtApMat, txtRFC, txtCorreo, txtTel);
        CtrlInterfaz.habilita(false, btnAceptar, txtNom, txtApPat, txtApMat, txtRFC, txtCorreo, txtTel);
        this.comboBoxCve.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        try {
            if (Mensaje.pregunta(this, "Desea guardar esta informacion?") == 0) {
                boolean b = validarCompra();
                boolean ban = validaRFCorreo();
                if (b) {
                    if (txtCorreo.getText().equals("")) {
                        Mensaje.error(this, "El correo no puede ser nulo.");
                    } else if (txtRFC.getText().length() < 12) {
                        Mensaje.error(this, "Faltan digitos en el rfc, compruebe.");
                    } else if (!txtTel.getText().equals("") && txtTel.getText().length() < 10) {
                        Mensaje.error(this, "Faltan digitos en el teléfono, compruebe.");
                    } else {
                        if (!ban) {
                            String rfc = this.txtRFC.getText().toUpperCase();
                            String correo = this.txtCorreo.getText();
                            String tel = this.txtTel.getText();
                            if (tel.equals("")) {
                                tel = "NULL";
                            } else if (rfc.equals("")) {
                                rfc = "NULL";
                            }
                            int registro = this.ferrD.actualizarCliente(rfc, correo, tel, cliente_idC);
                            Mensaje.exito(this, "Cliente actualizado");
                            btnCancelarActionPerformed(evt);
                        } else {
                            Mensaje.error(this, "El correo y el RFC son unicos, verifique.");
                        }
                    }
                } else {
                    if (txtNom.getText().equals("") || txtApPat.getText().equals("")
                            || txtApMat.getText().equals("") || txtRFC.getText().equals("")
                            || txtCorreo.getText().equals("")) {
                        Mensaje.error(this, "No se han llenado todos lo campos, verifique.");
                    } else if (txtRFC.getText().length() < 12) {
                        Mensaje.error(this, "Faltan digitos en el rfc, compruebe.");
                    } else if (!txtTel.getText().equals("") && txtTel.getText().length() < 10) {
                        Mensaje.error(this, "Faltan digitos en el teléfono, compruebe.");
                    } else {
                        if (!ban) {
                            String nombre = this.txtNom.getText();
                            String apPat = this.txtApPat.getText();
                            String apMat = this.txtApMat.getText();
                            String rfc = this.txtRFC.getText().toUpperCase();
                            String correo = this.txtCorreo.getText();
                            String tel = this.txtTel.getText();
                            if (tel.equals("")) {
                                tel = "NULL";
                            } else if (rfc.equals("")) {
                                rfc = "NULL";
                            }
                            int registro = this.ferrD.actualizarCliente(nombre, apPat, apMat, rfc, correo, tel, cliente_idC);
                            Mensaje.exito(this, registro + " registro actualizado");
                            Mensaje.exito(this, "Cliente actualizado");
                            btnCancelarActionPerformed(evt);
                        } else {
                            Mensaje.error(this, "El correo y el RFC son unicos, verifique.");
                        }
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

    public boolean validaRFCorreo() {
        boolean ban = false;
        List<Cliente> cliente = this.ferrD.listaCliente();
        for (Cliente c : cliente) {
            if (c.getIdCliente() != this.cliente_idC) {
                if (c.getRfc().equals(this.txtRFC.getText()) || c.getCorreo().equals(this.txtCorreo.getText())) {
                    ban = true;
                    break;
                }
            }
        }
        return ban;
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

    private void comboBoxCveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCveActionPerformed
        try {
            if (this.comboBoxCve.getSelectedIndex() != 0) {
                CtrlInterfaz.limpia(txtNom, txtApPat, txtApMat, txtRFC, txtCorreo, txtTel);
                CtrlInterfaz.habilita(false, btnAceptar, txtNom, txtApPat, txtApMat, txtRFC, txtCorreo, txtTel);
                this.cliente_idC = Integer.parseInt(String.valueOf(this.comboBoxCve.getSelectedItem()));
                Cliente p = this.ferrD.listaClienteWhere(cliente_idC);
                this.txtNom.setText(p.getNombre());
                this.txtApPat.setText(p.getApPat());
                this.txtApMat.setText(p.getApMat());
                String rfc = !p.getRfc().equals("NULL") ? p.getRfc() : "";
                this.txtRFC.setText(rfc);
                this.txtCorreo.setText(p.getCorreo());
                String tel = !p.getTelefono().equals("NULL") ? p.getTelefono() : "";
                this.txtTel.setText(tel);
                boolean ban = validarCompra();
                if (ban) {
                    Mensaje.error(this, "Solo puede modificar los siguientes campos debido"
                            + " a que el cliente ya ha realizado una compra");
                    CtrlInterfaz.habilita(true, txtRFC);
                    CtrlInterfaz.cambia(txtRFC);
                } else {
                    CtrlInterfaz.habilita(true, txtNom);
                    CtrlInterfaz.cambia(txtNom);
                }
            } else {
                btnCancelarActionPerformed(evt);
            }
        } catch (Exception e) {
            //e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_comboBoxCveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            llenaComboCve();
        } catch (Exception e) {
            Mensaje.error(this, "Aún no hay registros");
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    public void llenaComboCve() {
        List<Integer> arr = ferrD.listaIdCliente();
        for (int idCl : arr) {
            this.comboBoxCve.addItem(String.valueOf(idCl));
        }
    }

    public boolean validarCompra() {
        boolean ban = false;
        List<Integer> listaPV = this.ferrD.listaClienteFN();
        cliente_idC = Integer.parseInt(String.valueOf(comboBoxCve.getSelectedItem()));
        for (int idCliente : listaPV) {
            if (idCliente == cliente_idC) {
                ban = true;
                break;
            }
        }
        return ban;
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
            java.util.logging.Logger.getLogger(VtnClienteM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnClienteM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnClienteM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnClienteM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VtnClienteM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboBoxCve;
    private javax.swing.JLabel etqAltasT;
    private javax.swing.JLabel etqCantP1;
    private javax.swing.JLabel etqCantP2;
    private javax.swing.JLabel etqCantP3;
    private javax.swing.JLabel etqCantP4;
    private javax.swing.JLabel etqMonP;
    private javax.swing.JLabel etqNomP;
    private javax.swing.JLabel etqOpcional1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maderaClara;
    private javax.swing.JLabel maderaClara1;
    private javax.swing.JLabel maderaOsucra;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
