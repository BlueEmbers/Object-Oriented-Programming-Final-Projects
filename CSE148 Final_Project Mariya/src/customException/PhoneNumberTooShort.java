package customException;

public class PhoneNumberTooShort extends Exception
{
	public PhoneNumberTooShort()
	{
		super("Phone Number is too short");
	}

}
