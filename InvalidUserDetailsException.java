public class InvalidUserDetailsException extends Exception {
	
	enum invalidDetails{
		invalidName,invalidEmail,invalidNumber,invalidPassword;
	}

	public invalidDetails category;
	public InvalidUserDetailsException(invalidDetails category, String message) {
		super(message);
		this.category = category;
	}
}