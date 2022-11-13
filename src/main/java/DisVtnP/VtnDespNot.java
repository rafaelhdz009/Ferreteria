/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisVtnP;

import cjb.ci.Mensaje;
import datos.FerreteriaDAO;
import domain.*;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class VtnDespNot extends javax.swing.JFrame {

    FerreteriaDAO ferrD = new FerreteriaDAO();
    int IdFN;

    /**
     * Creates new form VtnDespFac
     */
    public VtnDespNot() {
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

        panelAmarillo = new javax.swing.JPanel();
        comboBoxN = new javax.swing.JComboBox<>();
        scrollPane = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        panelBlanco = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        maderaO = new javax.swing.JLabel();
        etqNota = new javax.swing.JLabel();
        maderaC = new javax.swing.JLabel();
        maderaC1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de notas");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAmarillo.setBackground(new java.awt.Color(255, 255, 222));
        panelAmarillo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBoxN.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxN.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tu nota" }));
        comboBoxN.setToolTipText("Selecciona una nota");
        comboBoxN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBoxN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNActionPerformed(evt);
            }
        });
        panelAmarillo.add(comboBoxN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 86, 170, 30));

        txtNota.setEditable(false);
        txtNota.setColumns(20);
        txtNota.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtNota.setRows(5);
        scrollPane.setViewportView(txtNota);

        panelAmarillo.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 136, 436, 220));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Broadway", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Consulta tu nota");
        panelBlanco.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        maderaO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maderaOscura2.jpg"))); // NOI18N
        panelBlanco.add(maderaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 590, 90));

        panelAmarillo.add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 70));

        etqNota.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etqNota.setForeground(new java.awt.Color(0, 0, 0));
        etqNota.setText("Nota:");
        panelAmarillo.add(etqNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 50, -1));

        maderaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelAmarillo.add(maderaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        maderaC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/madera.jpg"))); // NOI18N
        panelAmarillo.add(maderaC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, -1, -1));

        getContentPane().add(panelAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxNActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboBoxNActionPerformed
    {//GEN-HEADEREND:event_comboBoxNActionPerformed
        try {
            if (this.comboBoxN.getSelectedIndex() != 0) {
                int cantidad;
                this.IdFN = Integer.parseInt(String.valueOf(comboBoxN.getSelectedItem()));
                FacturaNota fn = this.ferrD.listaFacturaNotaWhere(IdFN);
                Ventas vent = this.ferrD.listaFNotaWhereVent(IdFN);
                List<Productos> prod = this.ferrD.listaFNotaWhereP(IdFN);
                Vendedor vend = this.ferrD.listaFNotaWhereVend(IdFN);

                String desp = "Num. de Nota: " + fn.getIdFacturaNota() + "\n"
                        + "Fecha: " + vent.getFecha() + "\n"
                        + "Clave del vendedor: " + vend.getIdVend() + "\n"
                        + "Nombre del vendedor: " + vend.getNombre() + " " + vend.getApellido()
                        + "\n--------------------------------------\n\tProductos\n\n";
                for (int i = 0; i < prod.size(); i++) {
                    cantidad = this.ferrD.listaProdVentCant(vent.getIdVenta(), prod.get(i).getIdP());
                    desp += "Nombre: " + prod.get(i).getNombre() + "\n"
                            + "Clave del producto: " + prod.get(i).getIdP() + "\n"
                            + "Cantidad: " + cantidad + "\n"
                            + "Precio: " + prod.get(i).getPrecio() + "\n\n";
                }
                desp += "--------------------------------------\n"
                        + "Descuento: " + fn.getDescuento() + "%\n"
                        + "Monto: " + vent.getMonto() + "\n"
                        + "Total: " + vent.getTotal();
                this.txtNota.setText(desp);
            } else {
                this.txtNota.setText("");
            }
        } catch (Exception e) {
            //e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_comboBoxNActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try {
            llenaCombo();
        } catch (Exception e) {
            Mensaje.error(this, "Aún no hay registros");
            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    public void llenaCombo() {
        List<Integer> arr = ferrD.listaFacNotIsNotNull();
        for (int idF : arr) {
            this.comboBoxN.addItem(String.valueOf(idF));
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
            java.util.logging.Logger.getLogger(VtnDespNot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnDespNot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnDespNot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnDespNot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnDespNot().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxN;
    private javax.swing.JLabel etqNota;
    private javax.swing.JLabel maderaC;
    private javax.swing.JLabel maderaC1;
    private javax.swing.JLabel maderaO;
    private javax.swing.JPanel panelAmarillo;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
