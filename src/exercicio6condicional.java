import java.util.Locale;
import java.util.Scanner;
public class exercicio6condicional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double numero;
         numero=sc.nextDouble();
         if (numero < 0.0 || numero > 100.0) {
 			System.out.println("Fora de intervalo");
         }
         
         else if (numero<=25.0) {
        	 System.out.println("Intervalo (0,25]");
  }
         
         else if (numero<=50) {
        	 System.out.println("Intervalo (25,50]");
        }
         else if (numero<=75) {
        	 System.out.println("Intervalo (50,75]");
}
         else  {
        	 System.out.println("Intervalo (75,100]");
         }
	sc.close();
	}
}