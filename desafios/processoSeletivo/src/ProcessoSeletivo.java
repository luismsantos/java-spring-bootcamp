import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Candidato candidato = new Candidato();


         candidato.nome = sc.nextLine();
         candidato.idade = sc.nextInt();

        double salario = sc.nextDouble();
        candidato.verificarSalario(salario);







    }
}
