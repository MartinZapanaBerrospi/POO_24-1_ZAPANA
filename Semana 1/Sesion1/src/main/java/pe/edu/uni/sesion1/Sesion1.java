package pe.edu.uni.sesion1;

import java.util.Scanner;
/**
 *
 * @author MARTIN
 */
public class Sesion1 {
private static Scanner OBJ = new Scanner(System.in);
    
    //--------------------------------------
    public static void Divisores (int num){
        for(int i=1;i<=num;i++){
            if(num%i==0)
                System.out.println("\t" + i);
        }
    }
    //--------------------------------------
    public static void main (String args[]){
        int N,numero;
        System.out.print("Ingrese la cantidad de elementos: ");
        N = OBJ.nextInt();
        for(int i=1;i<=N;i++){
                //System.out.println(i);
                numero = 10 + (int) (90*Math.random());
                System.out.println("-------------------------");
                System.out.println(numero);
                Divisores(numero);
        }
    }
    //--------------------------------------
}
