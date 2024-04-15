import java.util.Scanner;

public class Persona {
//----------------------------------------------------------------
//PROPIEDADES O ATRIBUTOS
//----------------------------------------------------------------
private String DNI;
private String NomApe;
private int    Edad;
private String Direccion;
private String Telefono;
private String FecNac;
//----------------------------------------------------------------
// METODOS CONSTRUCTORES
//----------------------------------------------------------------
public Persona() {
}
//----------------------------------	
public Persona(String xDNI,String xNOMAPE,int xEDAD,String xDIRECCION,String xTELEFONO,String xFECNAC) {
   this.DNI       = xDNI;
   this.NomApe    = xNOMAPE;
   this.Edad      = xEDAD;
   this.Direccion = xDIRECCION;
   this.Telefono  = xTELEFONO;
   this.FecNac    = xFECNAC;
}
//----------------------------------------------------------------
//Metodos SET
//----------------------------------------------------------------
public void Establecer_DNI(String xDNI) {
   this.DNI = xDNI;
}
//----------------------------------------------------------------
public void Establecer_NomApe(String xNOMAPE) {
   this.NomApe = xNOMAPE;
}
//----------------------------------------------------------------
public void Establecer_Edad(int xEDAD) {
   this.Edad = xEDAD;
}
//----------------------------------------------------------------
public void Establecer_Direccion(String xDIRECCION) {
   this.Direccion = xDIRECCION;
}
//----------------------------------------------------------------
public void Establecer_Telefono(String xTELEFONO) {
   this.Telefono = xTELEFONO;
}
//----------------------------------------------------------------
public void Establecer_FecNac(String xFECNAC) {
   this.FecNac = xFECNAC;
}
//----------------------------------------------------------------
//Metodos GET
//----------------------------------------------------------------
public String Obtener_DNI() {
   return this.DNI;
}
//----------------------------------------------------------------
public String Obtener_NomApe() {
   return this.NomApe;
}
//----------------------------------------------------------------
public int Obtener_Edad() {
   return this.Edad;
}
//----------------------------------------------------------------
public String Obtener_Direccion() {
   return this.Direccion;
}
//----------------------------------------------------------------
public String Obtener_Telefono() {
   return this.Telefono;
}
//----------------------------------------------------------------
public String Obtener_FecNac() {
   return this.FecNac;
}
//----------------------------------------------------------------
//-----------------------------------------------
//-----------------------------------------------
public void IngresarDatosGenerales() {
Tools   TLS = new Tools();
Scanner SCN = new Scanner(System.in);
String zDNI;
String zNomApe;
String zEdad;
String zDireccion;
String zTelefono;
String zFecNac;

   System.out.println("=========================");
   System.out.println("Ingreso de Datos");
   System.out.println("=========================");
       
   do {
     System.out.print("DNI                : ");
     zDNI = SCN.nextLine();
   } while(TLS.DNI_Ok(zDNI)==false);
     

   do {
     System.out.print("Nombres y Apellidos: ");
     zNomApe = SCN.nextLine();
   } while(TLS.NomApe_Ok(zNomApe)==false);

     
   do {
     System.out.print("Edad               : ");
     zEdad = SCN.nextLine();
   } while(TLS.Edad_Ok(zEdad)==false);
       
   System.out.print("Direccion          : ");
   zDireccion = SCN.nextLine();

   do {
      System.out.print("Telefono           : ");
      zTelefono = SCN.nextLine();
   } while(TLS.Telefono_Ok(zTelefono)==false);
     
   do {
      System.out.print("Fecha de Nacimiento: ");
      zFecNac = SCN.nextLine();
   } while(TLS.FecNac_Ok(zFecNac)==false);
}
//-----------------------------------------------
} //class

