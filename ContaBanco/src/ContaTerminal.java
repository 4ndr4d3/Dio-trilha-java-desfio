import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do correntista:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o tipo da conta (corrente ou poupança):");
        String tipo = scanner.nextLine();

        // Cria uma nova instância da classe Conta
        Conta conta = new Conta(nome, numero, saldo, tipo);

        // Imprime os dados da conta
        System.out.println("Nome do correntista: " + conta.getNome());
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Tipo da conta: " + conta.getTipo());
    }
}
