import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "JOAQUIM"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando =!atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while(continuarTentando && tentativasRealizadas <3);
            if(atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + "NA " + tentativasRealizadas);
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "JOAQUIM"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n " + (indice+1)  + " é " + candidatos[indice]);
        }

        System.out.println("Forma abrevida de interação for each");

        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCanditados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "JOAQUIM", "LUIS", "JOSÉ", "MARCELO", "MACIEL", "CASIMIRO", "GABI"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0; // i do array
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorAleatorio();

            System.out.println("o candidato " + candidato + " Solicitou este valor de salário" + salarioPretendido );

            if(salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
//            else {
//                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
//            }
            candidatosAtual++;
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static int valorAleatorioLigacao() {
        return ThreadLocalRandom.current().nextInt(1, 3);
    }
}