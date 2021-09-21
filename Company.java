package OOPS;

public class Company {
	String name;
	String location;
	int noOfBranches;
	int noOfEmployee;
	String workingHours;
	
	public void openingTime() {
		System.out.println("Company open at 7 AM");
	}
	public void closingTime() {
		System.out.println("Company close at 11 PM");
	}
	public void punchCard() {
		System.out.println("Daily Entry");
	}
	public void login() {
		System.out.println("employee login");
	}
	public void logout() {
		System.out.println("employee logout");
	}
}

