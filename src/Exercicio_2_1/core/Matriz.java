package Exercicio_2_1.core;

import java.util.Scanner;

public class Matriz {
    Scanner sc = new Scanner(System.in);
    private int matriz[][];

    public Matriz(int m, int n){
        this.matriz = new int [m][n];
    }

    public void setMatriz(int m, int n){
        System.out.println("Digite os elementos da matriz:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void findNumbers(int m, int n){
        int bigNumber = matriz[0][0];
        int smallNumber = matriz[0][1];

         for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(bigNumber < matriz[i][j]){
                    bigNumber = matriz[i][j];
                }
                if(smallNumber > matriz[i][j]){
                    smallNumber = matriz[i][j];
                }
            }
        }
        System.out.println("Maior número da Matriz " + bigNumber);
        System.out.println("Menor número da Matriz " + smallNumber);
    }
}

