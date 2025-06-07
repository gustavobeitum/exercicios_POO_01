package Exercicio_1_1.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_1_1.core.Calculadora;
import Exercicio_1_1.view.Menu;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
            System.out.print("Digite o primeiro valor: ");
            int numberOne = sc.nextInt();

            System.out.print("Digite o segundo valor: ");
            int numberTwo = sc.nextInt();

            Calculadora calculo = new Calculadora(numberOne, numberTwo);

            menu.showMenu();

            int option = sc.nextInt();
            menu.setOption(option);

            switch (menu.getOption()) {
                case 1:
                    System.out.println("Resultado da soma " + calculo.sum());
                    break;
                case 2:
                    System.out.println("Resultado da subtração " + calculo.subtraction());
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação " + calculo.multiplication());
                    break;
                case 4:
                    System.out.println("Resultado da divisão " + calculo.division());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        
        sc.close();
    }
}
