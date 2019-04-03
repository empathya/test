package test;

public class Salary {
	
	private double basicSalary;
	private double x;
	private double y;
	private double commissions;
	private double salary;

	public double salarySellers(int x) {
		this.x = x;
		basicSalary = 500;
		commissions = x / 10;
		salary = basicSalary + commissions;
		return salary;
	}
	
	public double salaryTechnician(){
		salary = 1400;
		return salary;
	}
	
	public double salaryManager(double x, double teresa) {
		this.x=x;
		this.y=teresa;
		basicSalary = 1500;
		commissions = (x / 200) + (teresa / 200);
		salary = basicSalary + commissions;
		return salary;
	}
}
