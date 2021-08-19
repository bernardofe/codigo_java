import java.util.Locale;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		Locale.setDefault(Locale.US);
		int num=sc.nextInt();
		if (num%2==0) {
		System.out.printf("Par",num);

	}
		else {
			System.out.printf("Impar",num);
		}
		sc.close();

	}

}
