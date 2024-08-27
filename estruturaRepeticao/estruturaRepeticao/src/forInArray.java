public class forInArray {
    public static void main(String[] args) {

        String[] alunos = { "Luis", "Mateus", "Marcelo", "Thiago" };

//        for (int i = 0; i < alunos.length; i++) {
//            System.out.println(alunos[i]);
//        }

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}