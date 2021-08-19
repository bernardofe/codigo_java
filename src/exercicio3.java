import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d,diferenca;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		
		diferenca=a*b-c*d;
		System.out.println("Diferenca="+diferenca);
		sc.close();
	
	
	}

}
