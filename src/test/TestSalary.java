package test;

public class TestSalary {

	public static void main(String[] args) {
		
		Salary salary = new Salary();
		
		double vittorio = salary.salarySellers(15000);
		double teresa = salary.salaryTechnician();
		double mario = salary.salaryManager(vittorio, teresa);
		double virma = salary.salarySellers(17000);
		double maria = salary.salaryManager(mario, virma);
		
		System.out.println("The total salary of Vittorio is " + vittorio);
		System.out.println("The total salary of Teresa is " + teresa);
		System.out.println("The total salary of Mario is " + mario);
		System.out.println("The total salary of Virma is " + virma);
		System.out.println("The total salary of Maria is " + maria);
		
	}

}
