package customExceptions;

public class PriceTooSmallException extends Exception{
	
	public PriceTooSmallException() {
		super("Price is too little");
	}
	
}
