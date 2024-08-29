import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Candidato candidato = new Candidato();

        System.out.println("Digite o nome do candidato: ");
        candidato.nome = sc.nextLine();

        System.out.println("Digite a idade do candidato: ");
        candidato.idade = sc.nextInt();

        System.out.println("Digite o salário pretendido: ");
        double salario = sc.nextDouble();


        candidato.verificarSalario(salario);
        System.out.println("Candidato: " + candidato.nome + ", Idade: " + candidato.idade);







    }
}
