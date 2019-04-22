package university;

public class Student implements Person {

	private String fName;
	private String lName;
	private String mInitial;
	private String position;
	private double salary = 0;
	private double paidTuition = 0;
	private int SID;
	
	
	public Student(String f, String l, String m, String p, double sal, double paid, int ID){
		fName = f;
		lName = l;
		mInitial = m;
		position = p;
		salary = sal;
		paidTuition = paid;
		SID = ID;
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

	public void setMInitial(String m){
		mInitial = m;
	}

	public String getPosition() {
		return position;
	}
	
	public void setPaidTuition(double paid){
		paidTuition = paid;
	}
	
	public double getPaidTuition(){
		return paidTuition;
	}
	
	public void setSID(int ID){
		SID = ID;
	}
	
	public int getSID(){
		return SID;
	}
	
	
}
