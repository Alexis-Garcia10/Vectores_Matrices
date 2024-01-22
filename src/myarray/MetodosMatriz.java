package myarray;

import java.util.Scanner;

public class MetodosMatriz {

    public MetodosMatriz() {
        // Constructor vacío
    }

    // Método para insertar valores en una matriz
    public void InsertarMatriz(int matriz1[][], int columna, int fila) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("Ingrese el valor en la posición [" + i + "][" + j + "]");
                matriz1[i][j] = sc.nextInt();
            }
        }
    }

    // Método para mostrar una matriz en consola
    public void MostrarMatriz(int matriz1[][], int columna, int fila) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(" Array [" + i + "][" + j + "] =  " + matriz1[i][j]);
            }
            System.out.println();
        }
    }

    // Método para sumar dos matrices
    public int[][] SumarMatrices(int matriz1[][], int matriz2[][], int columna, int fila) {
        int suma[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return suma;
    }

    // Método para multiplicar dos matrices
    public int[][] MultiplicarMatrices(int matriz1[][], int matriz2[][], int columna1, int fila1, int columna2, int fila2) {
        if (columna1 != fila2) {
            System.out.println("No se pueden multiplicar las matrices. Las dimensiones no son compatibles.");
            return null;
        }

        int resultado[][] = new int[fila1][columna2];
        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna2; j++) {
                for (int k = 0; k < columna1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    // Método para encontrar el número mayor en una matriz
    public void EncontrarMayorNumero(int matriz1[][], int columna, int fila) {
        int numMaximo = matriz1[0][0];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz1[i][j] > numMaximo) {
                    numMaximo = matriz1[i][j];
                }
            }
        }
        System.out.println("Numero Mayor: " + numMaximo);
    }

    // Método para sumar los números pares en una matriz
    public void SumaPares(int matriz1[][], int columna, int fila) {
        int sumaPares = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz1[i][j] % 2 == 0) {
                    sumaPares += matriz1[i][j];
                }
            }
        }
        System.out.println("Suma de Números Pares: " + sumaPares);
    }

    // Método para sumar los números impares en una matriz
    public void SumaImpares(int matriz1[][], int columna, int fila) {
        int sumaImpares = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz1[i][j] % 2 != 0) {
                    sumaImpares += matriz1[i][j];
                }
            }
        }
        System.out.println("Suma de Números Impares: " + sumaImpares);
    }

    // Método para contar los números positivos en una matriz
    public void ContarPositivos(int matriz1[][], int columna, int fila) {
        int contador = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz1[i][j] > 0) {
                    contador++;
                }

            }
        }
    }
    public void ContarNegativos(int matriz1[][], int columna, int fila) {
        int contador = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                // Verifica si el número es negativo
                if (matriz1[i][j] < 0) {
                    contador++;
                }
            }
        }
        // Imprime la cantidad de numeros negativos
         System.out.println("Números Negativos: " + contador);
    }

}
