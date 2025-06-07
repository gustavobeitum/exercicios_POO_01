package Exercicio_4_1.core;

public class Funcionario {
    private String nome;
    private int id;
    private double salario;
    private String departamento;

    public Funcionario(String nome, int id, double salario, String departamento){
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "ID " + id + ", Nome " + nome +  ", Salário R$" + salario + ", Departamento " + departamento;
    }
}
