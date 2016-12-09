
public class Assignment1 {
	/*
	 * Create a encapsulation class for employee details.
	 */
	public static void main(String[] args) {
		EmployeeDetails john = new EmployeeDetails();
	}
}

class EmployeeDetails {
	private int employeeID;
	private String firstName;
	private String lastName;

	public EmployeeDetails() {

	}

	public EmployeeDetails(int id, String fName, String lName) {
		employeeID = id;
		firstName = fName;
		lastName = lName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
