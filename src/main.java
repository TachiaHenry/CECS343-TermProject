import java.util.Scanner;
public class main {
	static Scanner reader = new Scanner(System.in);
	public static void main ( String args[]) {
		menu();
		System.out.println(Databases.tblColleges.get(1));
		System.out.println(Databases.tblColleges.get(1).tblDepartments.get(1));
		
		
	}
	
	public static void menu() {
		int input = -1;
		while (input != 0) {
			System.out.println("Press 0 to end\n"
					+ "Press 1 to create a new college\n"
					+ "Press 2 to create a new employee\n"
					+ "Press 3 to create a new department\n");
			input = reader.nextInt();
			if(input == 1) {
				createCollege();
			}
			if(input == 2) {
				createEmployee();
			}
			if(input == 3) {
				createDepartment();
			}
		}
	}
	
	public static void createEmployee() {
		System.out.println("Assign new employee ID");
		int employeeID = reader.nextInt();
		reader.nextLine();
		System.out.println("Enter first name");
		String fName = reader.nextLine();
		System.out.println("Enter last name");
		String lName = reader.nextLine();
		System.out.println("Enter middle Initial");
		String mInitial = reader.nextLine();
		System.out.println("Enter employee salary");
		double salary = reader.nextDouble();
		System.out.println("Enter employee job position");
		reader.nextLine();
		String position = reader.nextLine();
		Databases.tblEmployees.put(employeeID, new Employee(employeeID, fName, lName, mInitial, salary, position));
	}
	
	public static void createCollege() {
		reader.nextLine();
		System.out.println("Please enter new College Name");
		String name = reader.nextLine();
		System.out.println("Please enter the employee ID to assign the college head");
		int employeeID = reader.nextInt();
		Databases.tblColleges.put(1, new College(1, name, employeeID));
		
	}
	
	public static void createDepartment() {
		//need to add list of current colleges here 
		System.out.println("Please enter college ID or select a college to create department under");
		int collegeID = reader.nextInt();
		System.out.println("Please enter department ID");
		int departmentID = reader.nextInt();
		reader.nextLine();
		System.out.println("Please enter department name");
		String departmentName = reader.nextLine();
		System.out.println("Please enter department head employee ID");
		int departmentHeadID = reader.nextInt();
		Databases.tblColleges.get(collegeID).tblDepartments.put(departmentID, new Department(departmentID, departmentName, departmentHeadID));
	}
}
