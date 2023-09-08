import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.close();

        System.out.println();

        System.out.println("Olá, " + nome + "!");
        System.out.println("Bem-vindo à disciplina de Engenharia Econômica para Software.");

        // Substituímos o loop for por um bloco if para verificar a idade e exibir mensagens diferentes
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um(a) idoso(a).");
        }
    }
}
