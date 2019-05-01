
public class Employee {
	private int employeeID;
	private String fName;
	private String lName;
	private String mInitial;
	private double salary;
	private String position;
	
	public Employee(int employeeID, String fName, String lName, String mInitial,
			double salary, String position) {
		this.employeeID = employeeID;
		this.fName = fName;
		this.lName = lName;
		this.mInitial = mInitial;
		this.salary = salary;
		this.position = position;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	
	}
	
	public String getFname() {
		return fName;
	}

	public void setFname(String fname) {
		this.fName = fname;
	}
	
	public String getLname() {
		return lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}
	
	public String getmInitial() {
		return mInitial;
	}

	public void setmInitial(String mInitial) {
		this.mInitial = mInitial;
	}
	
	public String getName() {
		return this.fName + " " +  this.mInitial + " " + this.lName;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	public String toString() {
		return "Employee ID: "+employeeID+"\n"+fName+" "+mInitial+" "+lName+"\nJob: "+position;
	}


	
}
