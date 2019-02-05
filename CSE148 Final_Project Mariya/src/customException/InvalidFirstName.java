package customException;

public class InvalidFirstName extends Exception
{
	public InvalidFirstName() 
	{
		super("Invalid First Name: First name should be one word");

	}

}
