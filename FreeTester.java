package university;

public class FreeTester {

	public static void main(String[] args){
		System.out.println("Hello");
		Employee test = new Employee("Tom", "Tanks", "T", "Teacher", 1000);
		System.out.println(test.getName());
		System.out.println("Their position: " + test.getPosition());
		test.setSalary(100000);
		System.out.println("Salary: $" + test.getSalary());
		
		System.out.println();
		
		Student test2 = new Student("Hung", "Nguyen", "H", "Student", 0, 12031, 111000);
		System.out.println(test2.getName());
		System.out.println("SID: " + test2.getSID());
		System.out.println("Paid Tuition Amount: $" + test2.getPaidTuition());
		
		System.out.println();
		
		Administrator test3 = new Administrator("Justin", "Ten", "T", "Admin", 120000, 99999);
		System.out.println(test3.getName());		
		System.out.println("AID: " + test3.getAID());
		System.out.println("Salary: " + test3.getSalary());
		
	}
}
