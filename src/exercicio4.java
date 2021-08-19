import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double raio,area,a;
		a=3.14;
		raio=sc.nextDouble();
		
		area=Math.pow(raio,2)*a;
		System.out.println("Área="+area);
        sc.close();
	}

}
