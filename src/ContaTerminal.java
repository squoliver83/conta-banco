import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o número da conta:");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, informe o saldo da conta:");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco! " +
                "Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
