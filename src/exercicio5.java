import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero,horas;
		float salario;
        float valor_hora;
        numero=sc.nextInt();
        horas=sc.nextInt();
        valor_hora=sc.nextFloat();
        salario=valor_hora*horas;
        System.out.println("NUMBER="+numero);
        System.out.printf("Salary U$=%.2f%n",salario);
        
        
       sc.close();
	} 

}
