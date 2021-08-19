import java.util.Locale;
import java.util.Scanner;
public class exercicio11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
        Locale.setDefault(Locale.US);
        int hora_inicio,hora_termino,duracao;
        hora_inicio=sc.nextInt();
        hora_termino=sc.nextInt();
        if (hora_inicio>=hora_termino) {
        	duracao= 24-hora_inicio+hora_termino;
        	  
        }
        else {
             duracao=hora_termino-hora_inicio;
       
	}
        System.out.println("O JOGO DUROU" +duracao+ "HORA(S)");
        sc.close();
	}
}
