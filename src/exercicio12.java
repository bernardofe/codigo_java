import java.util.Locale;
import java.util.Scanner;
public class exercicio12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
	    int codigo,quantidade;
	    double total;
	    codigo=sc.nextInt();
	    quantidade=sc.nextInt();
	   
	    if (codigo==1) {
	    	total=quantidade*4.0;
	    			System.out.println("Total: R$"+total);
	    }
	    else if (codigo==2) {
	    total=quantidade*4.5;
	    System.out.println("Total: R$"+total);
	    }
	    else if (codigo==3) {
	    total=quantidade*5.0;
	    System.out.println("Total: R$"+total);
	    }
	    else if (codigo==4) {
	    	total=quantidade*2.0;
	    	System.out.println("Total: R$"+total);
	    }
	    else if (codigo==5) {
	    	total=quantidade*1.5;
	    	System.out.println("Total: R$"+total);
	    }
	    
	   
	    
	    
		
		
		
		
		
		
	sc.close();	
	}

}
