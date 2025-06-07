package Exercicio_1_4.core;

public class Conversor {
    private double celcius;
    private double fahrenheit;

    public double getCelcius(){
        return celcius;
    }

    public void setCelcius(double celcius){
        this.celcius = celcius;
    }

    public double getFahrenheit(){
        return fahrenheit;
    }
    
    public void setFahrenheit(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }

    public void celciusForFahrenheit(){
        this.fahrenheit = (celcius * 9/5) + 32;
    }

    public void fahrenheitForCelcius(){
        this.celcius = (fahrenheit - 32) * 5/9;
    }
}
