package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Emprego {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        List<Employee2> list = new ArrayList<>();
        
        System.out.print("How many employees will be registered?");
        int n=sc.nextInt();
    
        for (int i=0;i<n;i++) {
            
        	System.out.println("Employoee #"+(i+1)+":");
        	System.out.print("Id:");
        	Integer id= sc.nextInt();
        	System.out.print("Name:");
            sc.nextLine();
        	String name= sc.nextLine();
        	System.out.print("Salary: ");
        	Double salary = sc.nextDouble();
        	
        	Employee2 emp = new Employee2(id,name ,salary);
        	
        	list.add(emp);
        
        }
        
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list,idsalary);
        if (pos == null) {
          System.out.println("This id does not exist");
        }
        else {
         System.out.print("Enter the percentagem:");
         double percent = sc.nextDouble();
         list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employee");
        for (Employee2 emp: list) {
        System.out.println(emp);
        }
        
        sc.close();
	}

	public static Integer position(List<Employee2> list, int id) {
	     for (int i = 0; i < list.size();i++) {
	    	 if (list.get(i).getId() == id) {
	    		return i; 
	    	 }
	    	 }
	    	 return null;
	}
}
	
