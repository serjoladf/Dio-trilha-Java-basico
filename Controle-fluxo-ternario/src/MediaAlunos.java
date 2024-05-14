public class MediaAlunos {
    public static void main(String[] args) throws Exception {
         
            double nota1 = 7.00;
            double nota2 = 4.00;
            double mediaNotas = ((nota1+nota2)/2);

            String resultado = mediaNotas >= 6? "Aluno Aprovado": "Aluno Reprovado";
            
            System.out.println(resultado);

        
    }
}
