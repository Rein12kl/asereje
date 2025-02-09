package asereje;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el numero de filas y columnas: ");
        int f = sc.nextInt();
        int c = sc.nextInt();
        int[][] matriz = new int [f][c];
        main m = new main();
        m.llenarmatriz(matriz, f, c, sc);
        m.mostrarmatriz(matriz);
    }
    public void llenarmatriz (int[][] matriz, int f, int c, Scanner sc){
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void mostrarmatriz (int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}