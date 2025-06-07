package Exercicio_2_2.core;

import java.util.Scanner;

public class Matriz {
    Scanner sc = new Scanner(System.in);
    private int matriz[][];

    public Matriz(int n){
        this.matriz = new int [n][n];
    }

    public void setMatriz(int n){
        System.out.println("Digite os elementos da matriz:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void sumDiagonal(int n){
        int sumDiagPrinc = 0;
        int sumDiagSec = 0;
        for(int i = 0; i < n; i++){
                sumDiagPrinc += matriz[i][i];
                sumDiagSec += matriz[i][n -1 -i];
        }
        System.out.println("Soma da diagonal principal " + sumDiagPrinc);
        System.out.println("Soma da diagonal secundária " + sumDiagSec);
    }
}

