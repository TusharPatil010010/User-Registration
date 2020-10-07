public class InvalidUserDetailsException extends Exception {
	enum invalidInputs{
		invalidFirstName, invalidLastName, invalidEmail, invalidMobileNumber, invalidPassword
	}
	public invalidInputs type;
	public InvalidUserDetailsException(String message) {
		super(message);
	}
}