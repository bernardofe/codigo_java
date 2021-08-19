import java.util.Locale;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if (a % b ==0 || b % a==0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
	}

}
