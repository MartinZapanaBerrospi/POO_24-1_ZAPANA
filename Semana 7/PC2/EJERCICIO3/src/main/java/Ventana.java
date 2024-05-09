import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;
public class Ventana extends javax.swing.JFrame {
private int N;
private int[] V;
private Color CLR;
    public Ventana() {
        initComponents();
        txtRESULTADO.setEditable(false);
        txtDATOS.setEditable(false);
        txtCANTIDAD.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCOLORES = new javax.swing.ButtonGroup();
        bgORDEN = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        cbxSELECCION = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtCANTIDAD = new javax.swing.JTextField();
        btnGENERAR = new javax.swing.JButton();
        btnMOVER = new javax.swing.JButton();
        btnLIMPIAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRESULTADO = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDATOS = new javax.swing.JTextArea();
        rbAMARILLO = new javax.swing.JRadioButton();
        rbCELESTE = new javax.swing.JRadioButton();
        rbASC = new javax.swing.JRadioButton();
        rbDESC = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ORDENAR NÚMEROS");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Seleccionar Tipo");

        cbxSELECCION.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbxSELECCION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Números fibonacci", "Números primos", "Números triangulares", "Números pares", "Números impares" }));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad de elementos");

        txtCANTIDAD.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        btnGENERAR.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGENERAR.setText("GENERAR");
        btnGENERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGENERARActionPerformed(evt);
            }
        });

        btnMOVER.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnMOVER.setText("MOVER");
        btnMOVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMOVERActionPerformed(evt);
            }
        });

        btnLIMPIAR.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnLIMPIAR.setText("LIMPIAR");
        btnLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLIMPIARActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("ORDENAR NÚMEROS");

        txtRESULTADO.setColumns(20);
        txtRESULTADO.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtRESULTADO.setRows(5);
        jScrollPane1.setViewportView(txtRESULTADO);

        txtDATOS.setColumns(20);
        txtDATOS.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDATOS.setRows(5);
        jScrollPane2.setViewportView(txtDATOS);

        bgCOLORES.add(rbAMARILLO);
        rbAMARILLO.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbAMARILLO.setText("Amarillo");
        rbAMARILLO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAMARILLOActionPerformed(evt);
            }
        });

        bgCOLORES.add(rbCELESTE);
        rbCELESTE.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbCELESTE.setText("Celeste");
        rbCELESTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCELESTEActionPerformed(evt);
            }
        });

        bgORDEN.add(rbASC);
        rbASC.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbASC.setText("Ascendente");
        rbASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbASCActionPerformed(evt);
            }
        });

        bgORDEN.add(rbDESC);
        rbDESC.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rbDESC.setText("Descendente");
        rbDESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDESCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbAMARILLO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbCELESTE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMOVER, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGENERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSELECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbASC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbDESC))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxSELECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(btnGENERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnMOVER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCELESTE)
                            .addComponent(rbAMARILLO)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbDESC)
                            .addComponent(rbASC))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // --------------------------------------
    private void GenerarNumerosNaturales() {
        txtRESULTADO.setText("");
        for (int i = 1; i<=N; i++) {
            V[i-1] = i;
            txtRESULTADO.append(i + "\n");
        }
    }
    //---------------------------------------
    private void GenerarNumerosFibonacci() {
    txtRESULTADO.setText("");
    int a = 0, b = 1;
    for (int i = 0; i < N; i++) {
        V[i] = a;
        txtRESULTADO.append(a + "\n");
        int sum = a + b;
        a = b;
        b = sum;
    }
    }
    //---------------------------------------
    private void GenerarNumerosTriangulares() {
    txtRESULTADO.setText("");
    int sum = 0;
    for (int i = 1; i <= N; i++) {
        sum += i;
        V[i-1] = sum;
        txtRESULTADO.append(sum + "\n");
    }
    }
    
    // --------------------------------------
    private void GenerarNumerosPrimos() {
    int k, NUM = 1, CONT = 0;
    boolean Sw;
        txtRESULTADO.setText("");
        while(CONT<N) {
            NUM++;
            //------------------------
            Sw = true;
            k=2;
            while((k<=NUM-1)&&(Sw == true)){
                if (NUM % k == 0){
                    Sw = false;
                }
                k++;
            }
            //------------------------
            if (Sw == true){
                CONT++;
                V[CONT-1] = NUM;
                txtRESULTADO.append(NUM + "\n");
            }
        }
        
    }
    // --------------------------------------
    private void GenerarNumerosAleatorios() {
    double x;
        txtRESULTADO.setText("");
        for (int i = 1; i<=N; i++) {
            x = Math.random()*5000;
            V[i-1] = (int)x;
            txtRESULTADO.append((int)x + "\n");
        }        
    }
    // --------------------------------------
    private void GenerarNumerosPares() {
        txtRESULTADO.setText("");
        for (int i = 1; i<=N; i++) {
            V[i-1] = i*2;
            txtRESULTADO.append(i*2 + "\n");
        }        
    }
    private void GenerarNumerosImpares() {
        txtRESULTADO.setText("");
        for (int i = 1; i<=N; i++) {
            V[i-1] = i*2-1;
            txtRESULTADO.append(i*2-1 + "\n");
        }        
    }
    private int[] ordenarArregloAscendente() {
        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (V[j] < V[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar elementos
            int temp = V[minIndex];
            V[minIndex] = V[i];
            V[i] = temp;
        }
        // Mostrar el arreglo ordenado en el JTextArea
        txtDATOS.setText("");
        for (int num : V) {
            txtDATOS.append(num + "\n");
        }
        return V;
    }
    
        private int[] ordenarArregloDescendente() {
        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (V[j] > V[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar elementos
            int temp = V[minIndex];
            V[minIndex] = V[i];
            V[i] = temp;
        }
        // Mostrar el arreglo ordenado en el JTextArea
        txtDATOS.setText("");
        for (int num : V) {
            txtDATOS.append(num + "\n");
        }
        return V;
    }
    
    private void btnGENERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGENERARActionPerformed
        Tools OBJ = new Tools();
        String SS;
        txtDATOS.setText("");
        bgORDEN.clearSelection();
        SS = txtCANTIDAD.getText();
        SS = SS.trim();
        if (SS.length()==0){
            showMessageDialog(null, "ERROR: No ha ingresado ningún valor");
        }else{
            if (OBJ.EsCadenaNumerica(SS)){
                if (SS.length()<=5) {
                    N = Integer.parseInt(SS);
                    V = new int [N];
                    switch (cbxSELECCION.getSelectedIndex()) {
                        case 0 -> GenerarNumerosFibonacci();
                        case 1 -> GenerarNumerosPrimos();
                        case 2 -> GenerarNumerosTriangulares();
                        case 3 -> GenerarNumerosPares();
                        case 4 -> GenerarNumerosImpares();
                        default -> {
                        }
                    }
                }else {
                    showMessageDialog(null, "ERROR: El valor ingresado es demasiado grande");
                    txtCANTIDAD.requestFocus();
                }
            }else{
                showMessageDialog(null, "ERROR: El valor ingresado no es numérico");
                txtCANTIDAD.requestFocus();
            }
        }
    }//GEN-LAST:event_btnGENERARActionPerformed

    private void btnMOVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMOVERActionPerformed
        String Resultado = txtRESULTADO.getText();
        String Datos = txtDATOS.getText();
        txtDATOS.setText(Resultado);
        txtRESULTADO.setText(Datos);
        if (!Datos.isEmpty() && Resultado.isEmpty()){
            bgORDEN.clearSelection();
        }else if (Datos.isEmpty() && Resultado.isEmpty()) {
            showMessageDialog(null, "ERROR: No hay datos para mover");
            txtCANTIDAD.requestFocus();
        }
    }//GEN-LAST:event_btnMOVERActionPerformed

    private void btnLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLIMPIARActionPerformed
        txtRESULTADO.setText("");
        txtCANTIDAD.setText("");
        txtDATOS.setText("");
        txtRESULTADO.setBackground(Color.WHITE);
        bgORDEN.clearSelection();
        bgCOLORES.clearSelection();
        txtCANTIDAD.requestFocus();
    }//GEN-LAST:event_btnLIMPIARActionPerformed

    private void rbAMARILLOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAMARILLOActionPerformed
        CLR = new Color(255,255,0);
        txtRESULTADO.setBackground(CLR);
    }//GEN-LAST:event_rbAMARILLOActionPerformed

    private void rbCELESTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCELESTEActionPerformed
        CLR = new Color(0,255,255);
        txtRESULTADO.setBackground(CLR);
    }//GEN-LAST:event_rbCELESTEActionPerformed

    private void rbASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbASCActionPerformed
        String Datos = txtDATOS.getText();
        if (rbASC.isSelected() && !Datos.isEmpty()){
            ordenarArregloAscendente();
        }else {
            showMessageDialog(null, "ERROR: No hay datos para ordenar");
            bgORDEN.clearSelection();
            txtCANTIDAD.requestFocus();
        }
    }//GEN-LAST:event_rbASCActionPerformed

    private void rbDESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDESCActionPerformed
        String Datos = txtDATOS.getText();
        if (rbDESC.isSelected() && !Datos.isEmpty()){
            ordenarArregloDescendente();
        }else {
            showMessageDialog(null, "ERROR: No hay datos para ordenar");
            bgORDEN.clearSelection();
            txtCANTIDAD.requestFocus();
        }
    }//GEN-LAST:event_rbDESCActionPerformed

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
    private javax.swing.ButtonGroup bgCOLORES;
    private javax.swing.ButtonGroup bgORDEN;
    private javax.swing.JButton btnGENERAR;
    private javax.swing.JButton btnLIMPIAR;
    private javax.swing.JButton btnMOVER;
    private javax.swing.JComboBox<String> cbxSELECCION;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbAMARILLO;
    private javax.swing.JRadioButton rbASC;
    private javax.swing.JRadioButton rbCELESTE;
    private javax.swing.JRadioButton rbDESC;
    private javax.swing.JTextField txtCANTIDAD;
    private javax.swing.JTextArea txtDATOS;
    private javax.swing.JTextArea txtRESULTADO;
    // End of variables declaration//GEN-END:variables
}
