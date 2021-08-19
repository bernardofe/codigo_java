package application;

import java.util.Locale;
import java.util.Scanner;

import entities.room;

public class student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		room[] vect = new room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Rent #"+i+":");
			System.out.println("Name:");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Email:");
			String email=sc.nextLine();
			System.out.print("Room: ");
			int quarto=sc.nextInt();
			vect[quarto]=new room(name,email);
		}	
			System.out.println("Busy rooms:");
			for (int i=0;i<10;i++) {
			 if (vect[i] !=null) {
				System.out.println(i+" : "+vect[i]); 
			 }
			}
		
	sc.close();
	}

}
