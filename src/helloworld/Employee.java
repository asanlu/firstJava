package helloworld;

public class Employee {
	private String firstName;
	private String lastName;
	private static int count = 0;
	
	public Employee(String first ){
		firstName = first;
		++count;
		System.out.println("Employee constructor:" + firstName + " "+ lastName);
	}
	
	public Employee(String first, String last) {
		firstName = first;
		lastName = last;
		++count;
		System.out.println("Employee constructor:" + firstName + " "+ lastName);
	}
	
	protected void finalize() {
		--count;
		System.out.println("Empolyee finalize:"+ firstName);
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public static int getCount() {
		return count;
	}
}
