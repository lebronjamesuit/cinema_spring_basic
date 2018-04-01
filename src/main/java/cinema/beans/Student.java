package cinema.beans;

import org.springframework.stereotype.Component;

@Component
public class Student implements People{

	private String firstName;
	private String lastName;
	
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
	
	public String getName() {
		return getFirstName() + " " + getLastName();
	}
	
}
