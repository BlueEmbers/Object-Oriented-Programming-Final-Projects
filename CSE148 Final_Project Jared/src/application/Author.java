package application;

public class Author {
	private String authorFirstName;
	private String authorLastName;
	
	public Author(String firstname, String lastname){
		this.authorFirstName = firstname;
		this.authorLastName = lastname;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}
}
