import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.RandomAccessFile;  
import java.io.IOException; 
  
public class ProcessFileText { 
private static final int RECORD_SIZE = 100;
private static final String FICHERO1 = "ESTABLECIMIENTOS.txt";
private static final String FICHERO2 = "ESTABLECIMIENTOS.dat";
   //------------------------------------------------------------
   public static void ViewDataBinary(String FICHERO2) throws FileNotFoundException, IOException { 
   String LINE; 
   RandomAccessFile RAF = new RandomAccessFile(FICHERO2, "rw");
   int T;
   byte[] RECORD = new byte[RECORD_SIZE];
      T = (int)(RAF.length()/RECORD_SIZE);
      for(int k=0;k<=T-1;k++) {
          RAF.seek(k*RECORD_SIZE);
          RAF.read(RECORD);
          PrintRecordBinary(RECORD);
      }
      RAF.close();
   }
   //------------------------------------------------------------
   public static void CopyTextToBinary(String FICHERO1, String FICHERO2) throws FileNotFoundException, IOException { 
   String LINE; 
   RandomAccessFile RAF = new RandomAccessFile(FICHERO2, "rw");
   FileReader       FR  = new FileReader(FICHERO1); 
   BufferedReader   BR = new BufferedReader(FR); 
      while((LINE = BR.readLine())!=null) { 
         if(LINE.charAt(0)!='*') {
//System.out.println(RAF.length() + " --- " + LINE); 
            RAF.seek(RAF.length());
            RAF.writeBytes(LINE);
         }
      } 
      BR.close(); 
      RAF.close();
   }
   //------------------------------------------------------------
   public static void GetRecordBinary(int position, int size) throws FileNotFoundException, IOException {
   byte[] RECORD = new byte[size];
        RandomAccessFile RAF = new RandomAccessFile(FICHERO2, "r");
        RAF.seek(position);
        RAF.read(RECORD);
        RAF.close();
        PrintRecordBinary(RECORD);
   }
   //------------------------------------------------------------
   public static void PrintRecordBinary(byte[] RECORD)  {
   String CADENA;
      CADENA = "";
      for(int i=0;i<=RECORD_SIZE-1;i++) {
          CADENA = CADENA + (char)RECORD[i];
      }
      System.out.println(CADENA.trim());
   }
   //------------------------------------------------------------
   public static void ReadFileBinary() throws FileNotFoundException, IOException { 
      GetRecordBinary(0, 100);
      GetRecordBinary(1, 100);
      GetRecordBinary(2, 100);
      GetRecordBinary(3, 100);
      GetRecordBinary(4, 100);
      GetRecordBinary(5, 100);
   }  
   //------------------------------------------------------------
   public static void ReadFileText(String FICHERO) throws FileNotFoundException, IOException { 
   String LINE; 
      FileReader     FR = new FileReader(FICHERO); 
      BufferedReader BR = new BufferedReader(FR); 
      while((LINE = BR.readLine())!=null) { 
         if(LINE.charAt(0)!='*') {
            System.out.println(LINE); 
         }
      } 
      BR.close(); 
   }
   //------------------------------------------------------------
   //------------------------------------------------------------
   public static void main(String[] args) throws IOException {
       //ReadFileText(FICHERO1);
       CopyTextToBinary(FICHERO1,FICHERO2);
       ViewDataBinary(FICHERO2);
   }
   //------------------------------------------------------------
}

