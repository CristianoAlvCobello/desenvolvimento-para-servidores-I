package com.mycompany.funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", 2500.00);
        Funcionario f2 = new Funcionario("Carlos", 3200.00);

        f1.consultarDados();
        f2.consultarDados();

        f1.aumentarSalario(500.00);
        f2.aumentarSalario(800.00);
        

        System.out.println("Apos aumento:");
        f1.consultarDados();
        f2.consultarDados();
    }
}

