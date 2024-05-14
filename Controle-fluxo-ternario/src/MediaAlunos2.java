public class MediaAlunos2 {
    public static void main(String[] args) {
        double nota1 = 6.50;
        double nota2= 7.20;
        double mediaNotas = ((nota1+nota2)/2);

       String resultado = mediaNotas > 6 ? "Aluno Aprovado" : (mediaNotas > 5 && mediaNotas > 6)?"Aluno em Recuperação" : "Aluno Reprovado" ;     
        System.out.println(resultado);

    }
}
