import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        selecaoCanditados();
//        Candidato candidato = new Candidato();
//
//        System.out.println("Digite o nome do candidato: ");
//        candidato.nome = sc.nextLine();
//
//        System.out.println("Digite a idade do candidato: ");
//        candidato.idade = sc.nextInt();
//
//        System.out.println("Digite o salário pretendido: ");
//        double salario = sc.nextDouble();
//
//        candidato.verificarSalario(salario);
//        System.out.println("Candidato: " + candidato.nome + ", Idade: " + candidato.idade);

    }

     static void selecaoCanditados() {
         String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "JOAQUIM", "LUIS", "JOSÉ", "MARCELO", "MACIEL", "CASIMIRO", "GABI"};

         int candidatosSelecionados = 0;
         int candidatosAtual = 0; // i do array
         double salarioBase = 2000.0;

         while(candidatosSelecionados < 5) {
             String candidato = candidatos[candidatosAtual];
             double salarioPretendido = valorAleatorio();

             System.out.println("o candidato " + candidato + " Solicitou este valor de salário" + salarioPretendido );

             if(salarioBase > salarioPretendido) {
                 System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                 candidatosSelecionados++;
             } else {
                 System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
             }
             candidatosAtual++;
         }
    }

     static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
