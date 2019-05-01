import java.util.*;
public class College {
	private int collegeID;
	private String collegeName;
	private int collegeDeanID;
	Map<Integer, Department> tblDepartments = new HashMap<Integer, Department>();
	
	public College(int collegeID, String collegeName, int employeeID) {
		this.collegeID = collegeID;
		this.collegeName = collegeName;
		this.collegeDeanID = employeeID;
	}
	public void setCollegeName(String CollegeName) {
		collegeName = CollegeName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public int getDean() {
		return collegeDeanID;
	}
	public void deleteCollege() {
		//college map by ID and delete
	}
	public String toString() {
		return collegeName+"\nCollege Dean: "+ Databases.tblEmployees.get(collegeDeanID);
	}
	
}
