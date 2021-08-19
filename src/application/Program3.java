package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
	    Student student = new Student();	
	    
	    student.name=sc.nextLine();
	    student.n1=sc.nextDouble();
	    student.n2=sc.nextDouble();
	    student.n3=sc.nextDouble();
	    
	    System.out.printf("FINAL GRADE: %.2f%n  ", student.nota());
	    
	    if (student.nota()<60) {
          System.out.println("FAILED");
          System.out.printf("MISSING %.2f POINTS%n ", student.missingPoints());
	}
	    else {
	       System.out.println("PASS");
	    }
	    
	   sc.close();
	}
}
