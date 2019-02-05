package backend;

import java.io.Serializable;

public abstract class Person implements Serializable{
	private String firstName;
	private String lastName;
	private String id;
	private String phoneNumber;
	private Address address;
	private static int idIncrement=0;

	public Person(String firstName, String lastName, String phoneNumber, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = String.valueOf(idIncrement++);
		this.phoneNumber = phoneNumber;
		this.address = address;
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

	public String getId() {
		return id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return ", firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", phoneNumber="
				+ phoneNumber;
	}

}
