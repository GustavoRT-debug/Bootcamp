package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando objetos Pessoa
        Pessoa p1 = new Pessoa("Ana", 25, "ana@email.com");
        Pessoa p2 = new Pessoa();
        p2.setNome("Carlos");
        p2.setIdade(30);
        p2.setEmail("carlos@email.com");

        // Exibindo informações
        System.out.println("=== Pessoa 1 ===");
        p1.exibirInformacoes();

        System.out.println("\n=== Pessoa 2 ===");
        p2.exibirInformacoes();

        // Testando métodos extras
        p1.fazerAniversario();
        p2.setIdade(-5); // Teste de validação
        p2.setEmail("emailInvalido"); // Teste de validação
    }
}
