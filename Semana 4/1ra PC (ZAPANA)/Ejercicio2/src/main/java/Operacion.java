import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Operacion {
    public static int X[];
    public static int arr[];
    
    // ITEM A) VALORES MÍNIMO Y MÁXIMO

    // ------------------------------------------------------------------
    public void calcularMinimo(JTextField txtMIN, int N) {
    int minimo = X[0];
        for (int i = 1; i < N; i++) {
            if (X[i] < minimo) {
                minimo = X[i];
            }
        }
        txtMIN.setText(String.valueOf(minimo));
    }
    // ------------------------------------------------------------------
    public void calcularMaximo(JTextField txtMAX, int N) {
    int maximo = X[0];
        for (int i = 1; i < N; i++) {
            if (X[i] > maximo) {
                maximo = X[i];
            }
        }
        txtMAX.setText(String.valueOf(maximo));
    }
    // ------------------------------------------------------------------
    // ITEM B) VALORES MEDIA Y VARIANZA
    
    // ------------------------------------------------------------------
    private double obtenerMedia(int N) {
        int suma = 0;
        for (int i = 0; i < N; i++) {
            suma += X[i];
        }
        return (double) suma / N;
    }
    
    public void calcularMedia(JTextField txtMED, int N) {
        double MED = obtenerMedia(N);
        DecimalFormat df = new DecimalFormat("#.###");
        String MEDIA_FORMAT = df.format(MED);
        txtMED.setText(MEDIA_FORMAT);
    }
    // ------------------------------------------------------------------
    
    
    public void calcularVarianza(JTextField txtVAR, int N) {
    double media = obtenerMedia(N);
    double sumatoria = 0;
    for (int i = 0; i < N; i++) {
        sumatoria += Math.pow(X[i] - media, 2);
    }
    double varianza = sumatoria / N;
    DecimalFormat df = new DecimalFormat("#.###");
    String VAR_FORMAT = df.format(varianza);
    txtVAR.setText(VAR_FORMAT);
}

    

    // ------------------------------------------------------------------
    // ITEM C) FRECUENCIA MÍNIMA Y MÁXIMA
    
    // ------------------------------------------------------------------
    public void calcularFrecuenciaMinima(JTextField txtFRECMIN, int N) {
    int[] frequency = new int[X.length];
    int minFrequency = Integer.MAX_VALUE;
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X.length; j++) {
                if (X[i] == X[j]) {
                    frequency[i]++;
                }
            }
        }
        for (int freq : frequency) {
            if (freq < minFrequency) {
                minFrequency = freq;
            }
        }
        txtFRECMIN.setText(String.valueOf(minFrequency));
    }
    // ------------------------------------------------------------------
    public void calcularFrecuenciaMaxima(JTextField txtFRECMAX, int N) {
    int[] frequency = new int[X.length];
    int maxFrequency = 0;
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X.length; j++) {
                if (X[i] == X[j]) {
                    frequency[i]++;
                }
            }
        }
        for (int freq : frequency) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        txtFRECMAX.setText(String.valueOf(maxFrequency));
    }
    // ------------------------------------------------------------------
    public void generarTablaFrecuenciasAleatorias(JTable tDISTRIBUCION, int N) {
        DefaultTableModel model = (DefaultTableModel) tDISTRIBUCION.getModel();
        model.setRowCount(0); // Limpia la tabla antes de cargar nuevos datos
        X = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            X[i] = (int) (Math.random() * 1000 + 1);
            model.addRow(new Object[]{X[i]});
        }
    // Obtener el número máximo de la tabla
    int maximo = obtenerMaximo(model);

    // Contar las frecuencias utilizando un array
    int[] frecuencias = new int[maximo + 1]; // El índice 0 no se usa

        for (int i = 0; i < N; i++) {
            int dato = (int) model.getValueAt(i, 0); // Obtener el dato de la fila
            frecuencias[dato]++;
        }

        // Limpiar la tabla antes de agregar nuevas filas
        model.setRowCount(0);

        // Agregar las filas a la tabla con números y sus frecuencias
        for (int numero = 1; numero <= maximo; numero++) { // Iniciar desde 1 según el rango
            int frecuencia = frecuencias[numero];
            if (frecuencia > 0) {
                model.addRow(new Object[]{numero, frecuencia});
            }
        }
    }

    // Función para obtener el número máximo en la tabla
    private int obtenerMaximo(DefaultTableModel model) {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < model.getRowCount(); i++) {
            int dato = (int) model.getValueAt(i, 0);
            if (dato > maximo) {
                maximo = dato;
            }
        }
        return maximo;
    }


}
