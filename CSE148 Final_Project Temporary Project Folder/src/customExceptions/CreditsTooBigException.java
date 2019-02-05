package customExceptions;

public class CreditsTooBigException extends Exception{
	
	public CreditsTooBigException() {
		super("Too many credits");
	}
	
}
