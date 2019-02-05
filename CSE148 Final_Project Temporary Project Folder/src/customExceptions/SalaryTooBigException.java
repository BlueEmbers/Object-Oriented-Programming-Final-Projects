package customExceptions;

public class SalaryTooBigException extends Exception{

	public SalaryTooBigException() {
		super("The Faculty member is being paid too much");
	}
	
}
