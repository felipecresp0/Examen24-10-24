import java.util.Scanner;
import java.util.Random;
public class Main {
    static final int MAX_FILA=10;
    static final int MAX_COLUMNA=10;
    static char aleatorio;
    static Scanner lector;


    static int intentos = 10;
    Scanner leer = new Scanner(System.in);
    // 1º Tablero de 10x10
    static char[][] tablero = new char[MAX_FILA][MAX_COLUMNA];


    public static void RellenartableroAle(){
// 2º Relleno el tablero de numeros aleatorios
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = aleatorio;
            }

        }

// 3º Hago el segundo tablero
        char[][] tablero2 = new char[MAX_FILA][MAX_COLUMNA];

        public static void Rellenartablero2(){
// 4º Relleno el tablero
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tablero2[i][j] = 'X';
                }
            }
            private static void imprimirTablero2(){
                for (int i = 0; i <MAX_FILA ; i++) {
                    for (int j = 0; j < MAX_COLUMNA; j++) {
                        System.out.print(tablero2[i][j] + "");
                    }
                    System.out.println();
                }

            }

        }
// Hacer que el usuario introduzca los numeros
        System.out.println("Escoge tu número a ver si aciertas");
        String num1 = lector.next();
        if (num1 !=   ) {

        }

    }


}