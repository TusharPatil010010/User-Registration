public class UserRegistrationException extends Exception {
	enum invalidInputs{
		invalidFirstName, invalidLastName, invalidEmail, invalidMobileNumber, invalidPassword
	}
	public invalidInputs type;
	public UserRegistrationException(String message) {
		super(message);
	}
}