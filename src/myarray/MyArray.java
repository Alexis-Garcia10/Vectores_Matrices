package myarray;

import java.util.Scanner;

/*
               AUTOR:
    - LEIKER ALEXIS GARCÍA ESPINOZA.

 */
public class MyArray {

    public static void main(String[] args) {
        int _tamaño, _fila, _columna, _opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("...BIENVENIDO AL PROGRAMA...");
        do {
            System.out.println("-- MENÚ --");
            System.out.println("1. VECTOR");
            System.out.println("2. MATRIZ");
            System.out.println("3. SALIR");
            _opc = sc.nextInt();
            switch (_opc) {
                case 1:
                    System.out.println("Ingrese el tamaño del Array: ");
                    _tamaño = sc.nextInt();
                    int array[] = new int[_tamaño]; //Creacion de Array
                    System.out.println("Vector");
                    MetodosArray vector = new MetodosArray();
                    vector.InsertarArray(array, _tamaño);
                    System.out.println("Array ingresado:");
                    vector.MostrarArray(array);
                    vector.OrdenarArray(array);
                    System.out.println("Array ordenado:");
                    vector.MostrarArray(array); // Array Ordenado
                    vector.ContarPares(array);
                    vector.ContarImpares(array);
                    vector.MayorNumero(array);
                    vector.ContarPositivos(array);
                    vector.ContarNegativos(array);
                    vector.SumaPares(array);
                    vector.SumaImpares(array);
                    break;
                case 2:
                    System.out.println("MATRIZ");
                    System.out.println("Ingrese el número de filas de la matriz: ");
                    _fila = sc.nextInt();
                    System.out.println("Ingrese el número de columnas de la matriz: ");
                    _columna = sc.nextInt();
                    int matriz1[][] = new int[_fila][_columna];
                    int matriz2[][] = new int[_fila][_columna]; // Crear la segunda matriz 
                    System.out.println("Matriz");
                    MetodosMatriz matriz = new MetodosMatriz();
                    // Insertar valores en ambas matrices
                    matriz.InsertarMatriz(matriz1, _columna, _fila);
                    System.out.println("Matriz ingresada:");
                    matriz.MostrarMatriz(matriz1, _columna, _fila);
                    matriz.InsertarMatriz(matriz2, _columna, _fila); // Insertar valores en la segunda matriz
                    System.out.println("Segunda matriz ingresada:");
                    matriz.MostrarMatriz(matriz2, _columna, _fila);
                    int[][] suma = matriz.SumarMatrices(matriz1, matriz2, _columna, _fila);
                    System.out.println("Suma de matrices:");
                    matriz.MostrarMatriz(suma, _columna, _fila);
                    int[][] producto = matriz.MultiplicarMatrices(matriz1, matriz2, _columna, _fila, _columna, _fila);
                    System.out.println("Producto de matrices:");
                    matriz.MostrarMatriz(producto, _columna, _fila);
                    matriz.EncontrarMayorNumero(matriz1, _columna, _fila);
                    matriz.SumaPares(matriz1, _columna, _fila);
                    matriz.SumaImpares(matriz1, _columna, _fila);
                    matriz.ContarPositivos(matriz1, _columna, _fila);
                    matriz.ContarNegativos(matriz1, _columna, _fila);
                    break;
                case 3:
                    System.out.println("Saliendo del Programa.....");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (_opc != 3);

    }
}
