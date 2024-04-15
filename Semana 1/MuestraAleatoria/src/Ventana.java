import static javax.swing.JOptionPane.showMessageDialog;
public class Ventana extends javax.swing.JFrame {
    
    int N;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        btnCALCULAR.setEnabled(false);
        btnORDENAR.setEnabled(false);
        txtRESULTADO.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRESULTADO = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMEDIANA = new javax.swing.JTextField();
        txtMINIMO = new javax.swing.JTextField();
        btnGENERAR = new javax.swing.JButton();
        btnLIMPIAR = new javax.swing.JButton();
        btnCALCULAR = new javax.swing.JButton();
        btnORDENAR = new javax.swing.JButton();
        txtA = new javax.swing.JTextField();
        txtMODA = new javax.swing.JTextField();
        txtMAXIMO = new javax.swing.JTextField();
        txtMEDIA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MUESTRA DE NÚMEROS ALEATORIOS CON SUS MEDIDAS DE TENDENCIA CENTRAL");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Muestra de Numeros Aleatorios");

        txtRESULTADO.setColumns(20);
        txtRESULTADO.setRows(5);
        jScrollPane1.setViewportView(txtRESULTADO);

        jLabel2.setText("Cantidad de Elementos");

        jLabel3.setText("Limite Inferior");

        jLabel4.setText("Limite Superior");

        jLabel5.setText("Media");

        jLabel6.setText("Mediana");

        jLabel7.setText("Moda");

        jLabel8.setText("Maximo");

        jLabel9.setText("Minimo");

        btnGENERAR.setText("Generar");
        btnGENERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENERARActionPerformed(evt);
            }
        });

        btnLIMPIAR.setText("Limpiar");
        btnLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIMPIARActionPerformed(evt);
            }
        });

        btnCALCULAR.setText("Calcular");
        btnCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCALCULARActionPerformed(evt);
            }
        });

        btnORDENAR.setText("Ordenar");
        btnORDENAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnORDENARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnORDENAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnGENERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(96, 96, 96)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMAXIMO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMINIMO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtMODA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtMEDIANA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtMEDIA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 0, Short.MAX_VALUE)))))
                                    .addComponent(btnCALCULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(btnGENERAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnORDENAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnLIMPIAR)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCALCULAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtMEDIA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtMEDIANA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtMODA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtMAXIMO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtMINIMO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGENERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGENERARActionPerformed
    Tools T = new Tools();
    String CadA,CadB,CadN;
        int A,B;
        CadA = txtA.getText().trim();
        CadB = txtB.getText().trim();
        CadN = txtN.getText().trim();
        Operacion OBJ = new Operacion();
        
        if (CadA.length()==0 || CadB.length()==0 || CadN.length()==0){
            txtRESULTADO.setText("");
            showMessageDialog(null, "No ha ingresado la cantidad de elementos o alguno de los límites");
        }else{
            if (T.EsCadenaNumerica(CadA) && T.EsCadenaNumerica(CadB) && T.EsCadenaNumerica(CadN)){
                if (CadA.length()<=5 && CadB.length()<=5 && CadN.length()<=5) {
                    N = Integer.parseInt(CadN);
                    A = Integer.parseInt(CadA);
                    B = Integer.parseInt(CadB);
                    if (A<=B){
                        OBJ.CargarNumerosAleatorios(txtRESULTADO, A, B, N);
                    }else{
                        txtRESULTADO.setText("");
                        showMessageDialog(null, "El límite inferior debe ser menor o igual al superior.");    
                    }
                }else {
                        showMessageDialog(null, "ERROR: Almenos uno de los valores ingresados es demasiado grande");
                        txtN.requestFocus();
                }
                btnORDENAR.setEnabled(true);
                btnCALCULAR.setEnabled(true);                                    
            }else{
                showMessageDialog(null, "ERROR: Almenos uno de los valores ingresados no es numérico");
                txtN.requestFocus();
            }
        }
    }//GEN-LAST:event_btnGENERARActionPerformed

    private void btnLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIMPIARActionPerformed
      txtA.setText("");
      txtB.setText("");
      txtN.setText("");
      txtRESULTADO.setText("");
      txtMEDIA.setText("");
      txtMEDIANA.setText("");
      txtMODA.setText("");
      txtMINIMO.setText("");
      txtMAXIMO.setText("");
      txtN.requestFocus();
    }//GEN-LAST:event_btnLIMPIARActionPerformed

    private void btnCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCALCULARActionPerformed
        Estadistica EST = new Estadistica();
        EST.calcularMedia(txtMEDIA, N);
        Operacion OBJ = new Operacion();
        int[] arrOrdenado = OBJ.ordenarArreglo(txtRESULTADO, N, false); // Obtener el array ordenado
        EST.calcularMediana(txtMEDIANA, arrOrdenado, N); // Pasar el array ordenado a calcularMediana
        EST.calcularModa(txtMODA);
        EST.calcularMaximo(txtMAXIMO, N);
        EST.calcularMinimo(txtMINIMO, N);    
    }//GEN-LAST:event_btnCALCULARActionPerformed

    private void btnORDENARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnORDENARActionPerformed
        Operacion OBJ = new Operacion();
        int[] arrOrdenado = OBJ.ordenarArreglo(txtRESULTADO, N, true); // Obtener el array ordenado
        StringBuilder sb = new StringBuilder();
        for (int num : arrOrdenado) {
            sb.append(num).append("\n");
        }
        txtRESULTADO.setText(sb.toString()); // Mostrar el array ordenado en el JTextArea
    }//GEN-LAST:event_btnORDENARActionPerformed

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
    private javax.swing.JButton btnCALCULAR;
    private javax.swing.JButton btnGENERAR;
    private javax.swing.JButton btnLIMPIAR;
    private javax.swing.JButton btnORDENAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtMAXIMO;
    private javax.swing.JTextField txtMEDIA;
    private javax.swing.JTextField txtMEDIANA;
    private javax.swing.JTextField txtMINIMO;
    private javax.swing.JTextField txtMODA;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextArea txtRESULTADO;
    // End of variables declaration//GEN-END:variables
}
