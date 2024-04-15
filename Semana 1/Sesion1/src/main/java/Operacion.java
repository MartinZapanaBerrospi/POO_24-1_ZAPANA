import javax.swing.*;

public class Operacion {

    public Operacion() { // Es un constructor
    }
    public Operacion(int m) { // Polimorfismo: varias formas del mismo método
    }

    //-----------------------------------------------------------------------
    public void CargarSecuenciaEnteros(JTextArea txtRESULTADO, int N){
        txtRESULTADO.setText("");
        for(int i=1;i<=N;i++) {
            txtRESULTADO.append(i + "\n");
        }
    }
    //-----------------------------------------------------------------------
    public void CargarNumerosAleatorios(JTextArea txtRESULTADO, int N){
        txtRESULTADO.setText("");
        int numero;
        for(int i=1;i<=N;i++) {
            numero = 10 + (int) (90*Math.random());
            txtRESULTADO.append(numero + "\n");
        }
    }
    //-----------------------------------------------------------------------
    public void CargarLetrasAleatorias(JTextArea txtRESULTADO, int N){
        txtRESULTADO.setText("");
        int CC;
        for(int i=1;i<=N;i++) {
            CC = 65 + (int) (26*Math.random());
            txtRESULTADO.append((char) CC + "\n");
        }
    }
}
