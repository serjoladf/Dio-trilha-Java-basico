/**
 * ExemploForArray
 */
public class ExemploForArray {
    public static void main(String[] args) {
     String alunos[] = {"Angelo","Sergio","Marina", "Elisangela","Marta","Ana Carolina","Marta" };
         System.out.println(alunos.length); // length tamanho do array de indices, o ideice inicia com zero(0)
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

    }
}