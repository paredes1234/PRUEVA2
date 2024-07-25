
package laboratorio143;
import java.util.*;
public class Laboratorio143 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de lansamientos");
        int dado = sc.nextInt(); 
        int[] frecuencias = simularLanzamientos(dado);
        mostrarFrecuencias(frecuencias);
        int valorMayorFrecuencia = MayorFrecuencia(frecuencias);
        System.out.println("El valor con mayor frecuencia es: " + valorMayorFrecuencia);
    }
    public static int[] simularLanzamientos(int n) {
        int[] frecuencias = new int[6];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int lanzamiento = random.nextInt(6) + 1;
            frecuencias[lanzamiento - 1]++;
        }

        return frecuencias;
    }
    public static void mostrarFrecuencias(int[] frecuencias) {
        System.out.println("Frecuencias de cada lanzamiento:");
        for (int i = 0; i < frecuencias.length; i++) {
            System.out.println((i + 1) +  " = " + frecuencias[i]);
        }
    }
    public static int MayorFrecuencia(int[] frecuencias) {
        int maxFrecuencia = frecuencias[0];
        int valorConMayorFrecuencia = 1;
        for (int a = 1; a < frecuencias.length; a++) {
            if (frecuencias[a] > maxFrecuencia) {
                maxFrecuencia = frecuencias[a];
                valorConMayorFrecuencia = a + 1;
            }
        }
        return valorConMayorFrecuencia;
    }
}
    

