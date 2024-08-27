public class BreakEContinue {
    public static void main(String[] args) {

        // USANDO BREAK
//        for (int i = 1; i <= 10; i++) {
//            if (i == 3 )
//                break;
//
//            System.out.println(i);
//        }

        // USANDO CONTINUE
        // nao imprimiu o número 3, pois a excecao foi atendida e continou o loop
        for (int i = 1; i <= 10; i++) {
            if ( i == 3 )
                continue;

            System.out.println(i);
        }
    }
}
