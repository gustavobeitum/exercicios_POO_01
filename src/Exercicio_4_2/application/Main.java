package Exercicio_4_2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicio_4_2.core.Contato;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contato> contatos = new ArrayList<>();

        while (contatos.size() < 10) {
            System.out.print("Digite o nome do contato: ");
            String nome = sc.nextLine();

            System.out.print("Digite o telefone: ");
            String telefone = sc.nextLine();

            System.out.print("Digite o email: ");
            String email = sc.nextLine();

            contatos.add(new Contato(nome, telefone, email));

            System.out.print("Deseja adicionar outro contato? (s/n) ");
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Lista de contatos");
        for (int i = 0; i < contatos.size(); i++) {
            contatos.get(i).exibirContato();
        }

        System.out.print("Digite o nome do contato que deseja procurar: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for(int i = 0; i < contatos.size(); i++){
             if(searchName.equals(contatos.get(i).getNome())){
                System.out.println("Telefone: " + contatos.get(i).getTelefone());
                System.out.println("Email: " + contatos.get(i).getEmail());
                found = true;
             }
        }
        
        if (!found) {
            System.out.println("Contato não encontrado.");
        }

        sc.close();
    }
}
