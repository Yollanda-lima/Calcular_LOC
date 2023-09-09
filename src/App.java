import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita ao usuário que insira sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Fecha o Scanner para liberar recursos
        scanner.close();

        // Imprime uma linha em branco para melhorar a legibilidade do código
        System.out.println();

        // Exibe uma mensagem de boas-vindas com o nome do usuário e a disciplina
        System.out.println("Olá, " + nome + "!");
        System.out.println("Bem-vindo à disciplina de Engenharia Econômica para Software.");

        String resposta = scanner.nextLine();

        System.out.println(resposta);

        // Verifica a idade do usuário e exibe uma mensagem apropriada
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um(a) idoso(a).");
        }
    }
}