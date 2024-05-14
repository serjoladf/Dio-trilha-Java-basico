public class App {
    public static void main(String[] args) throws Exception {
         
            double nota1 = 7.00;
            double nota2 = 4.00;
            double mediaNotas = ((nota1+nota2)/2);

            if (mediaNotas >= 6){
                System.out.println("Aluno Aprovado");
            }
            else if (mediaNotas < 6 && mediaNotas > 5){
                System.out.println("Aluno em Recuperação");
            }
            else {
                System.out.println("Aluno Reprovado");
            }

        
    }
}
