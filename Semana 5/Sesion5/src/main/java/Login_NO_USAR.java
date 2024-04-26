
public class Login_NO_USAR extends javax.swing.JFrame {
private int TotalIntentos=3;
	public Login_NO_USAR() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      buttonGroup1 = new javax.swing.ButtonGroup();
      buttonGroup2 = new javax.swing.ButtonGroup();
      buttonGroup3 = new javax.swing.ButtonGroup();
      buttonGroup4 = new javax.swing.ButtonGroup();
      jLabel1 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      jComboBox1 = new javax.swing.JComboBox<>();
      jLabel3 = new javax.swing.JLabel();
      txtUSER = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      txtPASSWORD = new javax.swing.JPasswordField();
      jCheckBox1 = new javax.swing.JCheckBox();
      jRadioButton3 = new javax.swing.JRadioButton();
      jRadioButton4 = new javax.swing.JRadioButton();
      jRadioButton5 = new javax.swing.JRadioButton();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      btnACEPTAR = new javax.swing.JButton();
      btnCANCELAR = new javax.swing.JButton();
      jLabel7 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 255));
      jLabel1.setText("Control de Acceso");

      jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      jLabel2.setText("Unidad");

      jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad de Recursos Humanos", "Unidad de Logistica y Abastecimiento", "Unidad de Contabilidad", "Unidad de Administracion", "Unidad de Tesoreria", " ", " " }));

      jLabel3.setText("Usuario");

      txtUSER.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtUSERActionPerformed(evt);
         }
      });

      jLabel4.setText("Contraseña");

      jCheckBox1.setText("Guardar Contraseña");

      buttonGroup3.add(jRadioButton3);
      jRadioButton3.setText("Estudiante");

      buttonGroup3.add(jRadioButton4);
      jRadioButton4.setText("Administrativo");

      buttonGroup3.add(jRadioButton5);
      jRadioButton5.setText("Docente");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel3)
                     .addComponent(jLabel2))
                  .addGap(38, 38, 38)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(txtPASSWORD, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                           .addComponent(txtUSER))))
                  .addContainerGap(133, Short.MAX_VALUE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel4)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jCheckBox1)
                  .addGap(23, 23, 23))))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jRadioButton3)
            .addGap(18, 18, 18)
            .addComponent(jRadioButton4)
            .addGap(18, 18, 18)
            .addComponent(jRadioButton5)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(txtUSER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(txtPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jCheckBox1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jRadioButton3)
               .addComponent(jRadioButton4)
               .addComponent(jRadioButton5))
            .addGap(18, 18, 18))
      );

      jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(0, 51, 153));
      jLabel5.setText("Crear Nuevo Usuario");

      jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(0, 51, 153));
      jLabel6.setText("Recuperar Contraseña");

      btnACEPTAR.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
      btnACEPTAR.setText("Aceptar");
      btnACEPTAR.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnACEPTARActionPerformed(evt);
         }
      });

      btnCANCELAR.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
      btnCANCELAR.setText("Cancelar");
      btnCANCELAR.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCANCELARActionPerformed(evt);
         }
      });

      jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCB\\Downloads\\acceso.png")); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(20, 20, 20)
                  .addComponent(jLabel7)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6))
                     .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(layout.createSequentialGroup()
                  .addGap(234, 234, 234)
                  .addComponent(btnACEPTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(26, 26, 26)
                  .addComponent(btnCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(197, 197, 197)
                  .addComponent(jLabel1)))
            .addContainerGap(15, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(jLabel1)
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(jLabel6))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnACEPTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnCANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELARActionPerformed
      System.exit(0);
   }//GEN-LAST:event_btnCANCELARActionPerformed

   private void txtUSERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUSERActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtUSERActionPerformed

   private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACEPTARActionPerformed
   String Login,Password;
	Tools OBJ = new Tools();
	   Login    = txtUSER.getText();
	   Password = txtPASSWORD.getText();
		if(OBJ.ValidarAcceso(Login,Password)==0) {
		}
		else {
			TotalIntentos--;
			if(TotalIntentos==0) {
            System.exit(0);
			}
		}		
		
   }//GEN-LAST:event_btnACEPTARActionPerformed

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login_NO_USAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login_NO_USAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login_NO_USAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login_NO_USAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login_NO_USAR().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnACEPTAR;
   private javax.swing.JButton btnCANCELAR;
   private javax.swing.ButtonGroup buttonGroup1;
   private javax.swing.ButtonGroup buttonGroup2;
   private javax.swing.ButtonGroup buttonGroup3;
   private javax.swing.ButtonGroup buttonGroup4;
   private javax.swing.JCheckBox jCheckBox1;
   private javax.swing.JComboBox<String> jComboBox1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JRadioButton jRadioButton3;
   private javax.swing.JRadioButton jRadioButton4;
   private javax.swing.JRadioButton jRadioButton5;
   private javax.swing.JPasswordField txtPASSWORD;
   private javax.swing.JTextField txtUSER;
   // End of variables declaration//GEN-END:variables
}
