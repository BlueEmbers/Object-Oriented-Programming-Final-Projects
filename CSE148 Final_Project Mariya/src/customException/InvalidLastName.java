package customException;

public class InvalidLastName extends Exception
{
	public InvalidLastName() 
	{
		super("Invalid Last Name: Last name cannot be more than one word");
	}

}
