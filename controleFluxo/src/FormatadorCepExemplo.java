public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23223323");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Não corresponde");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.756-064"; // exemplo CEP formatado
    }
}
