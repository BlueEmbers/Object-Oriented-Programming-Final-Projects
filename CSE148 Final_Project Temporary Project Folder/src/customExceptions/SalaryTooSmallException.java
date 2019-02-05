package customExceptions;

public class SalaryTooSmallException extends Exception{

	public SalaryTooSmallException() {
		super("The Faculty Member is being paid too little");
	}
	
}
