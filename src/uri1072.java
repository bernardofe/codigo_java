import java.util.Locale;
import java.util.Scanner;
public class uri1072 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Locale.setDefault(Locale.US);
		int dentro=0;
		int fora=0;
		int num=sc.nextInt();
		
		for (int i=0;i<num;i++) {
			int x=sc.nextInt();
		if (x>=10 && x<=20) {	
			dentro=dentro+1;
		}
		else {
		fora=fora+1;
		}
		System.out.println("in:"+dentro);
		System.out.println("out:"+fora);
		}
		
    sc.close();
	}

}
