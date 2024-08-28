import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        sc.nextLine();
        System.out.println("Digite seu sexo: ");
        String sexo = sc.nextLine();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        // exibindo informações
        System.out.println("Olá, me chamo: " + nome.toUpperCase());
        System.out.println("Tenho: " + idade + " anos");
        System.out.println("Sou do sexo " + sexo.toUpperCase());
        System.out.println("Tenho " + altura + " de altura.");

        } catch (InputMismatchException e) { // exeção
            System.out.println("O campos idade e altura precisam ser numericos");
            // System.err.println("O campos idade e altura precisam ser numericos");
        }
    }
}
