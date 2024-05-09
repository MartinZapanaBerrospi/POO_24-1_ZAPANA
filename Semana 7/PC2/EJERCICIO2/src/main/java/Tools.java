import java.io.RandomAccessFile;

public class Tools {

	//-------------------------------------------------
   public Tools() {
	}

    public int ValidarAcceso(String USER, String PASSWORD) {
        String FILENAME = "C:\\Users\\marzabe\\OneDrive - UNIVERSIDAD NACIONAL DE INGENIERIA\\Mi unidad (martin.zapana.b@uni.pe)\\4to Ciclo 2024-1\\3er_POO\\Semana 5\\Sesion5\\Data\\USUARIOS.txt";
        int EE = 0;
        USER = USER.trim();
        PASSWORD = PASSWORD.trim();

        if (USER.length() > 0 && PASSWORD.length() > 0) {
            try (RandomAccessFile file = new RandomAccessFile(FILENAME, "r")) {
                boolean Sw = false;
                String LINE;
                long position = 0;

                while ((LINE = file.readLine()) != null && !Sw) {
                    String trimmedLine = LINE.trim();
                    if (trimmedLine.length() > 0 && trimmedLine.charAt(0) != '*') {
                        String lineUser = trimmedLine.substring(51, 51 + 15).trim();
                        if (USER.equals(lineUser)) {
                            Sw = true;
                            file.seek(position + 78); // Move to the active flag position
                            byte isActive = file.readByte();
                            if (isActive == '1') {
                                file.seek(position + 67); // Move to the password position
                                byte[] passwordBytes = new byte[10];
                                file.read(passwordBytes);
                                String storedPassword = new String(passwordBytes).trim();
                                if (PASSWORD.equals(Transformer(storedPassword, -1))) {
                                    EE = 0;
                                } else {
                                    javax.swing.JOptionPane.showMessageDialog(null, "ERROR: El Password es Incorrecto");
                                    EE = 5;
                                }
                            } else {
                                javax.swing.JOptionPane.showMessageDialog(null, "ERROR: El Usuario no está activo");
                                EE = 4;
                            }
                        }
                    }
                    position = file.getFilePointer(); // Save current file pointer position
                }
            } catch (Exception EXC) {
                javax.swing.JOptionPane.showMessageDialog(null, EXC.toString());
                EXC.printStackTrace();
            }
        } else {
            if (USER.length() == 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "ERROR: No ha ingresado el Usuario");
                EE = 1;
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "ERROR: No ha ingresado el Password");
                EE = 2;
            }
        }
        return EE;
    }

   
   
        //-------------------------------------------------
	
public String Transformer(String CAD, int HH){
   String TMP="";
   int CC,LL;
   char EE;
    LL=CAD.length();
   for (int i=0;i<=LL-1 ;i++ ) {
      TMP = CAD.charAt(i) + TMP;
   }
   CAD=TMP;
   TMP="";
   for (int i=0;i<=LL-1 ;i++ ) {
      CC=((i+1)%2==0?1:-1);
      EE=CAD.charAt(i);
      TMP = TMP + (char) ((int)EE + CC*HH);
   }
   return TMP;
}	
	
} //clas
