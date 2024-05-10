public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final int NUMBER = 4;
        
        String nomeCompleto = "LINGUAGEM " + "JAVA";
    
        String concatenacao = "?"; 

        concatenacao = 1 + 1 + 1 + "1"; // Correção na concatenação
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + ("1") + 1 + ("1");
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int number13 = 5;

        System.out.println(number13 + 1);

        System.out.println(number13 + 1);
        System.out.println(number13);
        System.out.println(++number13); // Correção do incremento
        System.out.println(number13);
        System.out.println(++ number13);
        System.out.println(number13);
        System.out.println(number13--); // Correção do decremento

        int numero1 = 9;

        System.out.println(-numero1);

        numero1 = -numero1 * -numero1;

        boolean sujeiro = true;

        System.out.println(!sujeiro);
        System.out.println(sujeiro);

        System.out.println(numero1);

        System.out.println(+numero1);

        System.out.println(NUMBER);
        System.out.println(numeroNormal);
        System.out.println(nomeCompleto);
        System.out.println(numeroCurto2 + 1);

        double nota3 = 6.9;
        double nota1 = 9.6;

        if (nota1 >= nota3){
            System.err.println("Nota 1 é maior que 3");
        }
        else
        {
            System.err.println("Nota 3 é maior que 1");
        }

        String notas = nota3 >= nota1 ?
            "Nota 1 é maior que 3"
        :
            "Nota 3 é maior que 1";

        System.out.println(notas);
        
    }

}
