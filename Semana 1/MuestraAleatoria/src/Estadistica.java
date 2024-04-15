import java.text.DecimalFormat;
import javax.swing.*;

public class Estadistica {
    public int[] X = Operacion.X;
    Operacion OBJ = new Operacion();

    // ------------------------------------------------------------------
    public void calcularMedia(JTextField txtMEDIA, int N) {
        int SUM;
        double MEDIA;
        SUM = 0;
        for (int i = 0; i <= N - 1; i++) {
            SUM += X[i];
        }
        MEDIA = (double) SUM / N;
        DecimalFormat df = new DecimalFormat("#.###");
        String MEDIA_FORMAT = df.format(MEDIA);
        txtMEDIA.setText(MEDIA_FORMAT);
    }

    // ------------------------------------------------------------------
    public void calcularMediana(JTextField txtMEDIANA, int[] arrOrdenado, int N) {
        double MEDIANA;
        if (N % 2 != 0) {
            MEDIANA = arrOrdenado[N / 2];
        } else {
            MEDIANA = (double) (arrOrdenado[N / 2 - 1] + arrOrdenado[N / 2]) / 2;
        }

        DecimalFormat df = new DecimalFormat("#.#");
        String MEDIANA_FORMAT = df.format(MEDIANA);
        txtMEDIANA.setText(MEDIANA_FORMAT);
    }

    // ------------------------------------------------------------------
    public void calcularModa(JTextField txtMODA) {
    int[] modas = OBJ.encontrarModa();
    if (modas.length == X.length) {
        txtMODA.setText("No existe");
    } else {
        String MODA = "";
        for (int i = 0; i < modas.length; i++) {
            if (i > 0) {
                MODA += ", ";
            }
            MODA += modas[i];
        }
        txtMODA.setText(MODA);
    }
    }



    // ------------------------------------------------------------------
    public void calcularMaximo(JTextField txtMAXIMO, int N) {
        int maximo = X[0];
        for (int i = 1; i < N; i++) {
            if (X[i] > maximo) {
                maximo = X[i];
            }
        }
        txtMAXIMO.setText(String.valueOf(maximo));
    }

    // ------------------------------------------------------------------
    public void calcularMinimo(JTextField txtMINIMO, int N) {
        int minimo = X[0];
        for (int i = 1; i < N; i++) {
            if (X[i] < minimo) {
                minimo = X[i];
            }
        }
        txtMINIMO.setText(String.valueOf(minimo));
    }
    // ------------------------------------------------------------------

}
