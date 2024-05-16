import java.text.NumberFormat;
import java.text.ParseException;

public class ExemplosExcessao {
    public static void main(String[] args)  {
        Number valor;

        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            System.out.println("Erro ao converter");
        }
        
       
    }
}
