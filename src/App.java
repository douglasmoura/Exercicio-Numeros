
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Informe os números: ");

       String numero= scanner.nextLine();
       Integer numeroMaior = 0;
       Integer numeroMenor = 999999999;
       Integer numeroMedia = 0;

       String[] numeroSplit = numero.split(" ");

       for (int i = 0; i < numeroSplit.length; i++){
           Integer numberConvertido = Integer.parseInt(numeroSplit[i]);
        
        if (numberConvertido >= numeroMaior){
            numeroMaior = numberConvertido;
        }
        if (numberConvertido <= numeroMenor){
            numeroMenor = numberConvertido;
        }
        
        numeroMedia += numberConvertido;
       }

       numeroMedia = numeroMedia/numeroSplit.length;
       System.out.println("Número maior: "+ numeroMaior);
       System.out.println("Número menor: "+ numeroMenor);
       System.out.println("Número média: "+ numeroMedia);
       scanner.close();
    }
}
