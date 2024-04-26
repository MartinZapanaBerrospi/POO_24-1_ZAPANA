public class Prueba {
    public static void main(String[] args) {
        Transformar OBJ = new Transformar();
        String A = "banana";
        System.out.println(A);
//        "nitram"                   "AMETSIS"
//        "mjss`n"                   "@NDURJR"
//        "n`ssjm"                   "RJRUDN@"
//        "o                         "SISTEMA"   
//        String B = OBJ.Transformar(A, 1);
        String B = OBJ.encriptar(A, 1);
        System.out.println(B);
//        String C = OBJ.Transformar(B, -1);
        String C = OBJ.desencriptar(B, -1);
        System.out.println(C);
        
        //Repasar RandomAccessFile
    }
}
