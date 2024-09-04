public class Candidato {
    public String nome;
    public int idade = 0;
    public double salario = 0;

    private double baseSalarial = 2000;

    public void verificarSalario(double salario) {


        if (salario > baseSalarial) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salario == baseSalarial) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDAR RESULTADOS");
        }
    }

}