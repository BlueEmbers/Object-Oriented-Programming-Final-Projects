package customExceptions;

public class PriceTooBigException extends Exception{
	
	public PriceTooBigException() {
		super("Price is too high");
	}
	
}
