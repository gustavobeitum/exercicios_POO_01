package Exercicio_1_4.application;

import java.util.Locale;
import java.util.Scanner;

import Exercicio_1_4.core.Conversor;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conversor temperature = new Conversor();

        System.out.print("Digite 1 para converter de Celcius para Fahrenheit ou digite 2 para converter de Fahrenheit para Celcius ");
        int option = sc.nextInt();

        switch (option) {
            case 1:{
                System.out.print("Digite sua temperatura em Celcius para convertermos em Fahrenheit ");
                double celcius = sc.nextDouble();

                temperature.setCelcius(celcius);
                temperature.celciusForFahrenheit();
                System.out.println("A temperatura de " + temperature.getCelcius() + "C para fahrenheit é de " + String.format("%.2f", temperature.getFahrenheit()) + "F.");
                break;
            }
            case 2:{
                System.out.print("Digite sua temperatura em Fahrenheit para convertermos em Celcius ");
                double fahrenheit = sc.nextDouble();

                temperature.setFahrenheit(fahrenheit);
                temperature.fahrenheitForCelcius();
                System.out.println("A temperatura de " + temperature.getFahrenheit() + "F para celcius é de " + String.format("%.2f", temperature.getCelcius()) + "C.");
                break;
            }        
            default:
                System.out.println("opção inválida.");
                break;
        }
        sc.close();
    }
}
