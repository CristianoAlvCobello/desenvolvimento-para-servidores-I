package com.mycompany.funcionario;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double valor) {
        this.salario += valor;
    }

    public void consultarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: R$ " + this.salario);
    }
}
