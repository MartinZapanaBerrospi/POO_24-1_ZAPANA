import java.awt.Color;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.event.*;
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        txtDNI.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                validarDNI(txtDNI.getText());
            }
            public void removeUpdate(DocumentEvent e) {
                validarDNI(txtDNI.getText());
            }
            public void changedUpdate(DocumentEvent e) {
                // Este método se usa para detectar cambios en atributos del documento, no es relevante para validaciones de texto
            }
        });
        
        txtNOMAPE.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                validarNOMAPE(txtNOMAPE.getText());
            }
            public void removeUpdate(DocumentEvent e) {
                validarNOMAPE(txtNOMAPE.getText());
            }
            public void changedUpdate(DocumentEvent e) {
                // Este método se usa para detectar cambios en atributos del documento, no es relevante para validaciones de texto
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTITULO = new javax.swing.JLabel();
        lblTIPO = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblNOMAPE = new javax.swing.JLabel();
        lblEDAD = new javax.swing.JLabel();
        lblDIREC = new javax.swing.JLabel();
        lblTEL = new javax.swing.JLabel();
        lblFECNAC = new javax.swing.JLabel();
        lblESPECoAREA = new javax.swing.JLabel();
        lblVALIDAR_DNI = new javax.swing.JLabel();
        cbTIPOEMPLEADO = new javax.swing.JComboBox<>();
        txtDNI = new javax.swing.JTextField();
        txtNOMAPE = new javax.swing.JTextField();
        txtEDAD = new javax.swing.JTextField();
        txtDIRECCION = new javax.swing.JTextField();
        txtTELEFONO = new javax.swing.JTextField();
        txtFECNAC = new javax.swing.JTextField();
        txtESPECoAREA = new javax.swing.JTextField();
        btnACEPTAR = new javax.swing.JButton();
        btnCANCELAR = new javax.swing.JButton();
        lblVALIDAR_NOMAPE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE EMPLEADOS");

        lblTITULO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTITULO.setText("REGISTRO DE EMPLEADOS DEL ÁREA DE RECURSOS HUMANOS");

        lblTIPO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTIPO.setText("Seleccione TIpo");

        lblDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDNI.setText("DNI");

        lblNOMAPE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNOMAPE.setText("Nombres y apellidos");

        lblEDAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEDAD.setText("Edad");

        lblDIREC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDIREC.setText("Dirección");

        lblTEL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTEL.setText("Teléfono");

        lblFECNAC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFECNAC.setText("Fecha de nacimiento");

        lblESPECoAREA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblESPECoAREA.setText("Especialidad");

        lblVALIDAR_DNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVALIDAR_DNI.setForeground(new java.awt.Color(255, 0, 0));
        lblVALIDAR_DNI.setText("*Campo requerido");

        cbTIPOEMPLEADO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTIPOEMPLEADO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal de salud", "Personal administrativo" }));
        cbTIPOEMPLEADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTIPOEMPLEADOActionPerformed(evt);
            }
        });

        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNOMAPE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEDAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDIRECCION.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTELEFONO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtFECNAC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnACEPTAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnACEPTAR.setText("Aceptar");
        btnACEPTAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACEPTARActionPerformed(evt);
            }
        });

        btnCANCELAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCANCELAR.setText("Cancelar");
        btnCANCELAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELARActionPerformed(evt);
            }
        });

        lblVALIDAR_NOMAPE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVALIDAR_NOMAPE.setForeground(new java.awt.Color(255, 0, 0));
        lblVALIDAR_NOMAPE.setText("*Campo requerido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblTITULO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblTIPO)
                        .addGap(50, 50, 50)
                        .addComponent(cbTIPOEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblDNI)
                        .addGap(116, 116, 116)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblVALIDAR_DNI))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblNOMAPE)
                        .addGap(19, 19, 19)
                        .addComponent(txtNOMAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVALIDAR_NOMAPE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblEDAD)
                        .addGap(113, 113, 113)
                        .addComponent(txtEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblDIREC)
                        .addGap(87, 87, 87)
                        .addComponent(txtDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblTEL)
                        .addGap(91, 91, 91)
                        .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblFECNAC)
                        .addGap(18, 18, 18)
                        .addComponent(txtFECNAC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblESPECoAREA)
                        .addGap(70, 70, 70)
                        .addComponent(txtESPECoAREA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnACEPTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btnCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTITULO)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblTIPO))
                    .addComponent(cbTIPOEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblDNI))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVALIDAR_DNI)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblNOMAPE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNOMAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVALIDAR_NOMAPE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblEDAD))
                    .addComponent(txtEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblDIREC))
                    .addComponent(txtDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblTEL))
                    .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblFECNAC))
                    .addComponent(txtFECNAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblESPECoAREA))
                    .addComponent(txtESPECoAREA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnACEPTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void actualizarIndicadorVisual(JLabel indicador, boolean esValido) {
        if (esValido) {
            indicador.setText("Válido");
            indicador.setForeground(Color.GREEN);
        } else {
            indicador.setText("Inválido");
            indicador.setForeground(Color.RED);
        }
    }

    private void validarDNI(String dni) {
    Tools tools = new Tools();
    boolean esValido = tools.DNI_Ok(dni);
        actualizarIndicadorVisual(lblVALIDAR_DNI, esValido);
    }

    private void validarNOMAPE(String nomape) {
    Tools tools = new Tools();
    boolean esValido = tools.NomApe_Ok(nomape);
        actualizarIndicadorVisual(lblVALIDAR_NOMAPE, esValido);
    }
    
    private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed
    Tools TLS = new Tools();
    String DNI,NomApe,Direccion,Edad,Telefono,FecNac, Espec, Area;
        DNI          = txtDNI.getText().trim();
        NomApe       = txtNOMAPE.getText().trim();
        Edad         = txtEDAD.getText().trim();
        Direccion    = txtDIRECCION.getText().trim();
        Telefono     = txtTELEFONO.getText().trim();
        FecNac       = txtFECNAC.getText().trim();
        Espec       = txtESPECoAREA.getText().trim();
        Area       = txtESPECoAREA.getText().trim();
        
    if (DNI.length()==0 || NomApe.length()==0 || Edad.length()==0 || Direccion.length()==0 || Telefono.length()==0 || FecNac.length()==0 || Espec.length()== 0 || Area.length()==0){
        showMessageDialog(null, "Existe algún campo que se encuentra vacío.");
    }else{
        boolean registroExitoso = true;
        if (!TLS.DNI_Ok(DNI)) {
            txtDNI.setText("");
            registroExitoso = false;
        }

        if (!TLS.Edad_Ok(Edad)) {
            txtEDAD.setText("");
            registroExitoso = false;
        }

        if (!TLS.NomApe_Ok(NomApe)) {
            txtNOMAPE.setText("");
            registroExitoso = false;
        }

        if (!TLS.Telefono_Ok(Telefono)) {
            txtTELEFONO.setText("");
            registroExitoso = false;
        }

        if (!TLS.FecNac_Ok(FecNac)) {
            txtFECNAC.setText("");
            registroExitoso = false;
        }
        if (registroExitoso) {
            showMessageDialog(null, "Personal registrado correctamente.");
        }
    }

    switch (cbTIPOEMPLEADO.getSelectedIndex()){
        case 0 -> {
            Personal_Salud PS = new Personal_Salud(DNI, NomApe, Integer.parseInt(Edad), Direccion, Telefono, FecNac, Espec);
            
        }
        case 1 -> {
            Personal_Admin PA = new Personal_Admin(DNI, NomApe, Integer.parseInt(Edad), Direccion, Telefono, FecNac, Area);
        }
    }
    }//GEN-LAST:event_btnACEPTARActionPerformed

    private void btnCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELARActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCANCELARActionPerformed

    private void cbTIPOEMPLEADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTIPOEMPLEADOActionPerformed
        int tipoEmpleado = cbTIPOEMPLEADO.getSelectedIndex(); // 0 para Personal_Salud, 1 para Personal_Admin
        switch (tipoEmpleado) {
            case 0 -> lblESPECoAREA.setText("Especialidad");
            case 1 -> lblESPECoAREA.setText("Área           ");
        }        
    }//GEN-LAST:event_cbTIPOEMPLEADOActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACEPTAR;
    private javax.swing.JButton btnCANCELAR;
    private javax.swing.JComboBox<String> cbTIPOEMPLEADO;
    private javax.swing.JLabel lblDIREC;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEDAD;
    private javax.swing.JLabel lblESPECoAREA;
    private javax.swing.JLabel lblFECNAC;
    private javax.swing.JLabel lblNOMAPE;
    private javax.swing.JLabel lblTEL;
    private javax.swing.JLabel lblTIPO;
    private javax.swing.JLabel lblTITULO;
    private javax.swing.JLabel lblVALIDAR_DNI;
    private javax.swing.JLabel lblVALIDAR_NOMAPE;
    private javax.swing.JTextField txtDIRECCION;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEDAD;
    private javax.swing.JTextField txtESPECoAREA;
    private javax.swing.JTextField txtFECNAC;
    private javax.swing.JTextField txtNOMAPE;
    private javax.swing.JTextField txtTELEFONO;
    // End of variables declaration//GEN-END:variables
}
