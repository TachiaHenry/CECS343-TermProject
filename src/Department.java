
public class Department {
	private int departmentID;
	private String departmentName;
	private int departmentHeadID;
	
	public Department(int departmentID, String departmentName, int departmentHeadID) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.departmentHeadID = departmentHeadID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public int getDepartmentHeadID() {
		return departmentHeadID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentHeadID(int departmentHeadID) {
		this.departmentHeadID = departmentHeadID;
	}
	public String toString() {
		return departmentName+"\nDepartment Head: "+ Databases.tblEmployees.get(departmentHeadID);
	}
}
