import java.util.Scanner;

public class CadastroPessoa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao sistema de cadastro! ===");

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Digite seu estado civil: ");
        String estadoCivil = scanner.nextLine();

        System.out.println("\n=== Dados cadastrados ===");
        System.out.println("Nome completo: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Estado civil: " + estadoCivil);

        scanner.close();
    }
}
