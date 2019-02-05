package customExceptions;

public class CreditsTooSmallException extends Exception{
	
	public CreditsTooSmallException() {
		super("Too little credits");
	}
	
}
