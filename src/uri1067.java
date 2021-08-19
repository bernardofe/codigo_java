import java.util.Locale;
import java.util.Scanner;
public class uri1067 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int num=sc.nextInt();
		for(int i=num;i>0;i--) {
          if (i%2==1) {
			System.out.println(+i);
          }
		}
		sc.close();
	}

}
