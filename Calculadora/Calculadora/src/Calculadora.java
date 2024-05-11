import java.util.Scanner;
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gleyson Sampaio
* @version 1.0
* @since   01/01/2022
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public static int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
    public static int multiplicar(int numeroUm, int numeroDois) {
        return  (int) (numeroUm * numeroDois);
    }
    public static void main(String[] args) {
        System.out.println(somar(2,3));

        System.out.println(multiplicar(9,3));

        Scanner ler = new Scanner(System.in);

        int a;
        int b;

        System.out.printf("Informe um número para a tabuada:\n");
        a = ler.nextInt();

        System.out.printf("Informe um número para a tabuada:\n");
        b = ler.nextInt();

        System.out.println(multiplicar(a, b));
}
}