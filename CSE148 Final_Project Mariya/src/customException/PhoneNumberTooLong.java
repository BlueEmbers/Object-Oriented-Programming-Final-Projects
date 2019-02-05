package customException;

public class PhoneNumberTooLong extends Exception
{
	public PhoneNumberTooLong()
	{
		super("Phone Number is too long");
	}

}
