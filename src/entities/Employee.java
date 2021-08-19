package entities;

public class Employee {
	public double gross_salary;
	public double tax;
	public String name;
	

	public double netsalary() {
	return gross_salary-tax;
	} 
	public void increaseSalary(double percentage) {
	gross_salary+=gross_salary * percentage/100.0;
}

	public String toString() {
      return name + ", $"+ String.format("%.2f", netsalary());
		
	}
}