import java.io.*;
import javax.swing.JOptionPane;

public class Tools {

	//-------------------------------------------------
   public Tools() {
	}
	//-------------------------------------------------
   public int ValidarAcceso(String USER,String PASSWORD) {
   String LINE="", FILENAME = "C:\\Users\\marzabe\\OneDrive - UNIVERSIDAD NACIONAL DE INGENIERIA\\Mi unidad (martin.zapana.b@uni.pe)\\4to Ciclo 2024-1\\3er_POO\\Semana 5\\Sesion5\\Data\\USUARIOS.txt";
   boolean Sw;
   int EE=0;
       USER     = USER.trim();
       PASSWORD = PASSWORD.trim();
       if(USER.length()>0) {
          if(PASSWORD.length()>0) {
             try(FileReader fr = new FileReader(FILENAME)) {
                 //------------------------------------
                 BufferedReader BR = new BufferedReader(fr);
                 Sw = false;
                 LINE = "";
                 EE = 3;
                 while(((LINE=BR.readLine())!=null)&&(Sw==false)) {
                    LINE = LINE.trim();
                    if(LINE.length()>0) {
                       if(LINE.charAt(0)!='*') {
                          if(USER.equals(LINE.substring(51,51+15).trim())) {
                             Sw = true;
                             if(LINE.charAt(78)=='1') {
                                if(PASSWORD.equals(Transformer(LINE.substring(67,67+10).trim(),-1))) {
                                   EE = 0;
                                }
                                else {
                                  JOptionPane.showMessageDialog(null,"ERROR: El Password es Incorrecto");
                                  EE = 5;
                                }
                             }
                             else {
                                JOptionPane.showMessageDialog(null,"ERROR: El Usuario no está activo");
                                EE = 4;
                             }
                          }
                       }
                    }
                 }
                 //------------------------------------
             }
             catch(Exception EXC){
               javax.swing.JOptionPane.showMessageDialog(null,LINE + "\n" + EXC.toString());
               EXC.printStackTrace();
             }
          }
          else {
             JOptionPane.showMessageDialog(null,"ERROR: No ha ingresado el Password");
             EE = 2;
          }
       }
       else {
          JOptionPane.showMessageDialog(null,"ERROR: No ha ingresado el Usuario");
          EE = 1;
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
