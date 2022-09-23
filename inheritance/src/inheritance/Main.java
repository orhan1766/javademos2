package inheritance;

public class Main {

	public static void main(String[] args) {
		// Inheritence = Miras demektir.
		// Farklı classlardaki ortak özellikleri tek bir classta toplayarak "extends" yazarak 
		// o classın başka bir classtan miras aldığını belirtiriz.
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

	}

}
