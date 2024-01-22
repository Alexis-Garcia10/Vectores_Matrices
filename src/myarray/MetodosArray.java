package myarray;import java.util.Arrays;
import java.util.Scanner;

public class MetodosArray {

    // Constructor vacío
    public MetodosArray() {
    }

    // Método para insertar valores en el array
    public void InsertarArray(int array[], int tamaño) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tamaño; i++) {
            // Solicita al usuario ingresar el valor en la posición i
            System.out.println("Insertar el valor en la posición " + i);
            array[i] = sc.nextInt();
        }
    }

    // Método para mostrar los elementos del array
    public int MostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            // Imprime el valor en la posición i del array
            System.out.println("Array [" + i + "] = " + array[i]);
        }
        System.out.println(""); // Imprime una línea en blanco
        return 0; // Retorna 0 (no parece tener un propósito específico)
    }

    // Método para ordenar el array
    public void OrdenarArray(int array[]) {
        Arrays.sort(array); // Utiliza la función de ordenamiento de Java
    }

    // Método para contar la cantidad de números pares en el array
    public void ContarPares(int array[]) {
        int contador = 0;
        for (int num : array) {
            // Verifica si el número es par
            if (num % 2 == 0) {
                contador++;
            }
        }
        // Imprime la cantidad de números pares
        System.out.println("Número de pares: " + contador);
    }

    // Método para contar la cantidad de números impares en el array
    public void ContarImpares(int array[]) {
        int contador = 0;
        for (int num : array) {
            // Verifica si el número es impar
            if (num % 2 != 0) {
                contador++;
            }
        }
        // Imprime la cantidad de números impares
        System.out.println("Número de Impares: " + contador);
    }

    // Método para encontrar y mostrar el número mayor en el array
    public void MayorNumero(int array[]) {
        int numMaximo = array[0];
        for (int i = 1; i < array.length; i++) {
            // Compara y actualiza el número máximo
            if (array[i] > numMaximo) {
                numMaximo = array[i];
            }
        }
        // Imprime el número mayor
        System.out.println("Número Mayor: " + numMaximo);
    }

    // Método para contar la cantidad de números positivos en el array
    public void ContarPositivos(int array[]) {
        int contador = 0;
        for (int num : array) {
            // Verifica si el número es positivo
            if (num > 0) {
                contador++;
            }
        }
        // Imprime la cantidad de números positivos
        System.out.println("Números Positivos: " + contador);
    }

    // Método para contar la cantidad de números negativos en el array
    public void ContarNegativos(int array[]) {
        int contador = 0;
        for (int num : array) {
            // Verifica si el número es negativo
            if (num < 0) {
                contador++;
            }
        }
        // Imprime la cantidad de números negativos
        System.out.println("Números Negativos: " + contador);
    }

    // Método para sumar los números pares en el array
    public void SumaPares(int array[]) {
        int sumaPares = 0;
        for (int num : array) {
            // Suma los números pares
            if (num % 2 == 0) {
                sumaPares += num;
            }
        }
        // Imprime la suma de los números pares
        System.out.println("Suma de Números Pares: " + sumaPares);
    }

    // Método para sumar los números impares en el array
    public void SumaImpares(int array[]) {
        int sumaImpares = 0;
        for (int num : array) {
            // Suma los números impares
            if (num % 2 != 0) {
                sumaImpares += num;
            }
        }
        // Imprime la suma de los números impares
        System.out.println("Suma de Números Impares: " + sumaImpares);
    }
}
