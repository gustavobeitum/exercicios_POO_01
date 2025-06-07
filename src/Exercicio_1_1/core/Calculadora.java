package Exercicio_1_1.core;

public class Calculadora {
    private int numberOne;
    private int numberTwo;

    public Calculadora(int a, int b){
        this.numberOne = a;
        this.numberTwo = b;
    }

    public int sum(){
        return numberOne + numberTwo;
    }

    public int subtraction(){
        return numberOne - numberTwo;
    }

    public int multiplication(){
        return numberOne * numberTwo;
    }

    public double division(){
        if(numberTwo == 0){
            System.out.println("Erro: Divisão por 0.");
            return 0.0;
        }
        return numberOne / numberTwo;
    }
}
