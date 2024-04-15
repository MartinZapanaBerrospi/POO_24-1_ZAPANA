import javax.swing.*;
import java.util.Arrays;
public class Operacion {
    // -----------------------------------------------------------------------
    public static int X[];
    public static int arr[];

    public void CargarNumerosAleatorios(JTextArea txtRESULTADO, int A, int B, int N) {
        txtRESULTADO.setText("");
        X = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            X[i] = (int) (Math.random() * (B - A + 1) + A);
            txtRESULTADO.append(X[i] + "\n");
        }
    }

    // -----------------------------------------------------------------------
    public int[] ordenarArreglo(JTextArea txtRESULTADO, int N, boolean show) {
        arr = X.clone(); // Clonar el arreglo original para no modificarlo directamente
        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar elementos
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        // Mostrar el arreglo ordenado en el JTextArea
        if (show == true) {
            txtRESULTADO.setText("");
            for (int num : arr) {
                txtRESULTADO.append(num + "\n");
            }
        }
        return arr; // Devolver el array ordenado
    }

    // -----------------------------------------------------------------------
    // Constructor y otros métodos aquí...

    

    int[] encontrarModa() {
    // Contar la frecuencia de cada elemento
    int[] frequency = new int[X.length];
    for (int i = 0; i < X.length; i++) {
        for (int j = 0; j < X.length; j++) {
            if (X[i] == X[j]) {
                frequency[i]++;
            }
        }
    }

    // Encontrar la máxima frecuencia
    int maxFrequency = 0;
    for (int freq : frequency) {
        if (freq > maxFrequency) {
            maxFrequency = freq;
        }
    }

    // Crear un arreglo para almacenar las modas
    int modeCount = 0;
    for (int freq : frequency) {
        if (freq == maxFrequency) {
            modeCount++;
        }
    }

    int[] mode = new int[modeCount];
    int index = 0;
    for (int i = 0; i < X.length; i++) {
        if (frequency[i] == maxFrequency) {
            mode[index] = X[i];
            index++;
        }
    }

    // Ordenar el arreglo y remover duplicados
    Arrays.sort(mode);
    int uniqueCount = 1;
    for (int i = 1; i < mode.length; i++) {
        if (mode[i] != mode[i - 1]) {
            uniqueCount++;
        }
    }
    int[] uniqueModes = new int[uniqueCount];
    uniqueModes[0] = mode[0];
    index = 1;
    for (int i = 1; i < mode.length; i++) {
        if (mode[i] != mode[i - 1]) {
            uniqueModes[index] = mode[i];
            index++;
        }
    }
    return uniqueModes;
    }
}
