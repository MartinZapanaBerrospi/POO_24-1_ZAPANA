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

} //class

