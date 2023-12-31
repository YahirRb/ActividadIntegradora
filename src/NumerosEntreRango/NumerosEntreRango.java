package NumerosEntreRango;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Yahir
 */


/**
 * Esta clase contiene un programa que toma dos números y muestra todos los números
 * entre ellos (sin incluir los números de entrada).
 */
public class NumerosEntreRango {

    /**
     * Método principal del programa.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        List<Integer> numerosEntreRango = obtenerNumerosEntreRango(numero1, numero2);

        System.out.println("Los números entre " + numero1 + " y " + numero2 + " son:");
        for (int numero : numerosEntreRango) {
            System.out.println(numero);
        }
    }

    /**
     * Método que devuelve una lista de números entre dos números dados.
     * @param numero1 El primer número.
     * @param numero2 El segundo número.
     * @return Una lista de números entre numero1 y numero2.
     */
    public static List<Integer> obtenerNumerosEntreRango(int numero1, int numero2) {

        List<Integer> numerosImpares = new ArrayList<>();
        // Verificar si el primer número es mayor o igual al segundo número
        if (numero1 >= numero2) {
            return numerosImpares;
        }
        
        // Iterar desde el primer número hasta el segundo número - 1
        for (int i = numero1 + 1; i < numero2; i++) {
            if (i % 2 != 0) { // Verificar si el número es impar
                numerosImpares.add(i);
            }
        }

        return numerosImpares;

    }
}

