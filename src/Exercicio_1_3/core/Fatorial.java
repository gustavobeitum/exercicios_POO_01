package Exercicio_1_3.core;

public class Fatorial {
    private int number;

    public Fatorial(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public int fatorial(int number){
        if(this.number < 0){
            return 0;
        }
        if(number == 0){
            return 1;
        } else{
            return number * fatorial(number - 1);
        }
    }
}
