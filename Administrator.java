package university;

public class Administrator implements Person{

	private String fName;
	private String lName;
	private String mInitial;
	private String position;
	private double salary = 0;
	private int adminID;
	
	
	public Administrator(String f, String l, String m, String p, double sal, int ID){
		fName = f;
		lName = l;
		mInitial = m;
		position = p;
		salary = sal;
		adminID = ID;
		
	}
	
	public String getName() {
		return fName + " " + mInitial + " " + lName;
	}

	public String getFName() {
		return fName;
	}

	public String getLName() {
		return lName;
	}

	public String getMInitial() {
		return mInitial;
	}

	public double getSalary() {
		return salary;
	}

	public void setFName(String f) {
		fName = f;
	}

	public void setLName(String l) {
		lName = l;
	}

	public void setMInitial(String m) {
		mInitial = m;
	}

	public String getPosition() {
		return position;
	}
	
	public int getAID(){
		return adminID;
	}
	
	public void setAID(int ID){
		adminID = ID;
	}

}
