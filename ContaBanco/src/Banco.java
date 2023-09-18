import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

