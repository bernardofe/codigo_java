import java.util.Locale;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num=sc.nextInt();
		if (num>0) {
		System.out.printf("NAO NEGATIVO",num);

	}
		else {
			System.out.printf("NEGATIVO",num);
		}
		sc.close();
}
}
