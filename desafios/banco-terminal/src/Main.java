import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Banco terminal");

        System.out.println("Digite o número da agencia: ");
        agencia = sc.nextLine();

        System.out.println("Digite o numero da conta: ");
        numero = sc.nextInt();

        sc.nextLine();
        System.out.println("digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo de R$%.2f já está disponivel para saque! " , nomeCliente, agencia, numero, saldo);


    }
}