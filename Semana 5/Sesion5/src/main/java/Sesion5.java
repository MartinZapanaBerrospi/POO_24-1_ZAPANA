import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Sesion5 extends JFrame {
private JButton btnACEPTAR;
private JButton btnCANCELAR;
private ButtonGroup buttonGroup1;
private ButtonGroup buttonGroup2;
private ButtonGroup buttonGroup3;
private ButtonGroup buttonGroup4;
private JCheckBox jCheckBox1;
private JComboBox<String> jComboBox1;
private JLabel jLabel1;
private JLabel jLabel2;
private JLabel jLabel3;
private JLabel jLabel4;
private JLabel jLabel5;
private JLabel jLabel6;
private JLabel jLabel7;
private JPanel jPanel1;
private JRadioButton jRadioButton3;
private JRadioButton jRadioButton4;
private JRadioButton jRadioButton5;
private JPasswordField txtPASSWORD;
private JTextField txtUSER;
private Tools OBJ = new Tools();
private int TotalIntentos=3;

   //===============================================================
   public Sesion5() {


      //-----------------------------------------------+
    String A,B,C;
    A="20225510K";
    B = OBJ.Transformer(A, -1);
    C = OBJ.Transformer(B, 1);
    System.out.println( A+" │ "+B+" │ "+C);
//    System.exit(0);
      //-----------------------------------------------+
		
		initComponents();
   }
   //===============================================================
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

        //CONFIGURACION DE LA VENTANA
        this.setTitle("Modulo de Control de Acceso");
        this.setExtendedState(6);
        this.setResizable(false);
        this.setLocation(100,200);
		
        //CONTROLES
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel3 = new JLabel();
        txtUSER = new JTextField();
        jLabel4 = new JLabel();
        txtPASSWORD = new JPasswordField();
        jCheckBox1 = new JCheckBox();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        btnACEPTAR = new JButton();
        btnCANCELAR = new JButton();
        jLabel7 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Control de Acceso");

        jPanel1.setBorder(BorderFactory.createEtchedBorder());

        jLabel2.setText("Unidad");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Unidad de Recursos Humanos", "Unidad de Logistica y Abastecimiento", "Unidad de Contabilidad", "Unidad de Administracion", "Unidad de Tesoreria", " ", " " }));

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

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel3)
                     .addComponent(jLabel2))
                  .addGap(38, 38, 38)
                  .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                     .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                           .addComponent(txtPASSWORD, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                           .addComponent(txtUSER))))
                  .addContainerGap(133, Short.MAX_VALUE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel4)
                  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
         jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(txtUSER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(txtPASSWORD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addComponent(jCheckBox1))
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
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

      jLabel7.setIcon(new ImageIcon("C:\\Users\\PCB\\Downloads\\acceso.png")); // NOI18N

      GroupLayout layout = new GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(20, 20, 20)
                  .addComponent(jLabel7)
                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6))
                     .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
               .addGroup(layout.createSequentialGroup()
                  .addGap(234, 234, 234)
                  .addComponent(btnACEPTAR, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                  .addGap(26, 26, 26)
                  .addComponent(btnCANCELAR, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(197, 197, 197)
                  .addComponent(jLabel1)))
            .addContainerGap(15, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(jLabel1)
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(jLabel6))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
               .addComponent(btnACEPTAR, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
               .addComponent(btnCANCELAR, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }
   //===============================================================
   private void btnCANCELARActionPerformed(java.awt.event.ActionEvent evt) {                                            
      System.exit(0);
   }                                           
   //===============================================================
   private void txtUSERActionPerformed(java.awt.event.ActionEvent evt) {                                        
   }                                       
   //===============================================================
   private void btnACEPTARActionPerformed(java.awt.event.ActionEvent evt) {                                           
   String Login,Password;
   
      Login    = txtUSER.getText();
      Password = txtPASSWORD.getText();
      if(OBJ.ValidarAcceso(Login,Password)==0) {
          showMessageDialog(null,"Registro exitoso");
      }
      else {
         TotalIntentos--;
         if(TotalIntentos==0) {
            System.exit(0);
         }
      }     
   }                                          
   //===============================================================
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                   UIManager.setLookAndFeel(info.getClassName());
                   break;
                }
            }
        } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(Login_NO_USAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(Login_NO_USAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(Login_NO_USAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(Login_NO_USAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion5().setVisible(true);
            }
        });
    }
    //===============================================================
    //===============================================================
    //===============================================================
} //class