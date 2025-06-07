package Exercicio_1_1.view;

public class Menu {
    private int option;

    public void setOption(int option) {
        this.option = option;
    }

    public int getOption(){
        return option;
    }

    public void showMenu() {
        System.out.println("=== Operações ===");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha uma opção: ");
    }
}
