package bankexception;

public class NegativeAccountNumberException extends Exception {

	public NegativeAccountNumberException(String message) {
		super(message);
	}

}
