import java.util.concurrent.ThreadLocalRandom; // importanto números aleatorios

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            double valorDoce = valorAleatorios();
            if (valorDoce > mesada)
                 valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;

        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joazinho gastou toda a sua mesada em doces!");
    }

    private static Double valorAleatorios() {
        return ThreadLocalRandom.current().nextDouble(2, 8); // dar um valor entre 2 e 8
    }
}
