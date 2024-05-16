public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("122545678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
    
            e.printStackTrace(); // Observação o tratamento foi colocado em outra classe
            System.out.println("Cep não correspondente"); // O tratamento foi colocado aqui neste bloco
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }      
}


