package Exercicio_4_1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicio_4_1.core.Funcionario;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário ");

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            sc.nextLine();

            System.out.print("Departamento: ");
            String departamento = sc.nextLine();

            funcionarios.add(new Funcionario(nome, id, salario, departamento));

            System.out.println("");
        }

        System.out.println("De qual departamento você deseja exibir o total de salários?");
        String departamento = sc.nextLine();

        double sum = 0;
        for(int i = 0; i < funcionarios.size(); i++){
            if(departamento.equalsIgnoreCase(funcionarios.get(i).getDepartamento())){
                sum += funcionarios.get(i).getSalario();
            }
        }

        System.out.println("O valor total dos salários do departamento " + departamento + " é de R$" + sum);

        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println("");
            System.out.println("Funcionario: " + funcionarios.get(i).toString());
        }

        sc.close();
    }

}
