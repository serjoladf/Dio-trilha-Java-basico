public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 234.00;
        double valorSaque = 20.00;

        if (saldo > valorSaque){
            System.out.println("Seu saldo é de R$ "+ saldo);
                 saldo = saldo - valorSaque;
            System.out.println("Valor de saque R$ "+ valorSaque);
            System.out.println("Seu novo saldo é de R$ " + saldo);

        }else{
            System.out.println("Seu saldo é negativo");
        }
    }
}
