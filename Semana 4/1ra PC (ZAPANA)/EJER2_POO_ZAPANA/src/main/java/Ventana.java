import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
public class Ventana extends javax.swing.JFrame {
private int N;
private int[] V;
    public Ventana() {
        initComponents();
        txtN.requestFocus();
        txtMIN.setEditable(false);
        txtMAX.setEditable(false);
        txtMED.setEditable(false);
        txtVAR.setEditable(false);
        txtFRECMIN.setEditable(false);
        txtFRECMAX.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMAX = new javax.swing.JTextField();
        txtMIN = new javax.swing.JTextField();
        txtMED = new javax.swing.JTextField();
        txtVAR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFRECMIN = new javax.swing.JTextField();
        txtFRECMAX = new javax.swing.JTextField();
        btnGENERAR = new javax.swing.JButton();
        btnLIMPIAR = new javax.swing.JButton();
        btnSALIR = new javax.swing.JButton();
        spTABLA = new javax.swing.JScrollPane();
        tDISTRIBUCION = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESTADÍSTICA DESCRIPTIVA DE N DATOS ALEATORIOS");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ESTADÍSTICA DESCRIPTIVA DE N DATOS ALEATORIOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad de elementos");

        txtN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mínimo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Máximo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Media");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Varianza");

        txtMAX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtMIN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtMED.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtVAR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Frecuencia Mínima");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Frecuencia Máxima");

        txtFRECMIN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtFRECMAX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnGENERAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGENERAR.setText("GENERAR");
        btnGENERAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGENERAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGENERAR.setFocusPainted(false);
        btnGENERAR.setPreferredSize(new java.awt.Dimension(120, 40));
        btnGENERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENERARActionPerformed(evt);
            }
        });

        btnLIMPIAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLIMPIAR.setText("LIMPIAR");
        btnLIMPIAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIMPIARActionPerformed(evt);
            }
        });

        btnSALIR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSALIR.setText("SALIR");
        btnSALIR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });

        tDISTRIBUCION.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tDISTRIBUCION.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valor", "Frecuencia"
            }
        ));
        spTABLA.setViewportView(tDISTRIBUCION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMED, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(btnGENERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMAX, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57)
                        .addComponent(spTABLA, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFRECMAX, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFRECMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGENERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtMAX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtMED, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFRECMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFRECMAX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(spTABLA, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIMPIARActionPerformed
        txtN.setText("");
        txtMIN.setText("");
        txtMAX.setText("");
        txtMED.setText("");
        txtVAR.setText("");
        txtFRECMIN.setText("");
        txtFRECMAX.setText("");
        DefaultTableModel model = (DefaultTableModel) tDISTRIBUCION.getModel();
        model.setRowCount(0);
        txtN.requestFocus();
    }//GEN-LAST:event_btnLIMPIARActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSALIRActionPerformed

    private void btnGENERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGENERARActionPerformed
    Tools T = new Tools();
    Operacion OBJ = new Operacion();
    String SS;
//        txtTABLA.setText("");
        SS = txtN.getText();
        SS = SS.trim();
        if (SS.length()==0){
            showMessageDialog(null, "ERROR: No ha ingresado ningún valor");
        }else{
            if (T.EsCadenaNumerica(SS)){
                N = Integer.parseInt(SS);
                if (N==0){
                    showMessageDialog(null, "ERROR: Ingrese una cantidad distinto de cero");
                    txtN.requestFocus();
                }else{
                    if (SS.length()<=5) {
                        V = new int [N];
                        OBJ.generarTablaFrecuenciasAleatorias(tDISTRIBUCION, N);
                        OBJ.calcularMinimo(txtMIN, N);
                        OBJ.calcularMaximo(txtMAX, N);
                        OBJ.calcularMedia(txtMED, N);
                        OBJ.calcularVarianza(txtVAR, N);
                        OBJ.calcularFrecuenciaMinima(txtFRECMIN, N);
                        OBJ.calcularFrecuenciaMaxima(txtFRECMAX, N);
                    }else {
                            showMessageDialog(null, "ERROR: El valor ingresado es demasiado grande");
                            txtN.requestFocus();
                    }
                }
            }else{
                showMessageDialog(null, "ERROR: El valor ingresado no es numérico");
                txtN.requestFocus();
                }
            }
    }//GEN-LAST:event_btnGENERARActionPerformed

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
    private javax.swing.JButton btnGENERAR;
    private javax.swing.JButton btnLIMPIAR;
    private javax.swing.JButton btnSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane spTABLA;
    private javax.swing.JTable tDISTRIBUCION;
    private javax.swing.JTextField txtFRECMAX;
    private javax.swing.JTextField txtFRECMIN;
    private javax.swing.JTextField txtMAX;
    private javax.swing.JTextField txtMED;
    private javax.swing.JTextField txtMIN;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtVAR;
    // End of variables declaration//GEN-END:variables
}
