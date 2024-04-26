public class Transformar {
    public String Transformar(String CAD, int HH){
        String TMP ="";
        int CC;
        int LL = CAD.length();
        char EE;
        for (int i=0; i<=LL-1;i++){
            TMP = CAD.charAt(i) + TMP; //Esto captura el valor de la cadena de forma invertida
        }
        CAD = TMP;
        TMP = "";
        for (int i=0; i<=LL-1;i++){
            CC=((i+1)%2==0?1:-1);
            EE=CAD.charAt(i);
            TMP+= (char)((int)EE + CC * HH);
        }
        CAD = "";
        return TMP;
    }
    public String encriptar(String cadena, int factor) {
        StringBuilder encriptada = new StringBuilder();
        int longitud = cadena.length();
        
        for (int i = 0; i < longitud; i++) {
            char caracter = cadena.charAt(i);
            caracter = (char) (caracter + factor);
            encriptada.append(caracter);
        }
        
        return encriptada.toString();
    }
    
    public String desencriptar(String encriptada, int factor) {
        StringBuilder cadena = new StringBuilder();
        int longitud = encriptada.length();
        
        for (int i = 0; i < longitud; i++) {
            char caracter = encriptada.charAt(i);
            caracter = (char) (caracter - factor);
            cadena.append(caracter);
        }
        
        return cadena.toString();
    }

}
