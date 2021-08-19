import java.util.Locale;
import java.util.Scanner;
public class uri1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		double renda,imposto;
		renda=sc.nextDouble();
		
		if (renda<=2000) {
		imposto=0.0;
		
		}
		else if (renda<=3000){
	    
		imposto=(renda-2000)*0.08;
		
		}
		else if (renda<=4500) {
		  imposto=(renda-3000)*0.18+0.08*1000;
		}
		else { 
			imposto=(renda-4500)*0.28+1500*0.18+0.08*1000;
		}
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$%.2f%n",imposto);
		}
		
		sc.close();
	}

}
