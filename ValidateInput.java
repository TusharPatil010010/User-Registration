@FunctionalInterface
interface ValidateInput {
	String validate(String check) throws UserRegistrationException;
}