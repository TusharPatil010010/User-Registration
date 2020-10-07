import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	// GLOBAL CONSTANTS
	private static String NAME = "^([A-Z]{1}[A-Za-z]{2,})$";
	private static String MOBILE = "^([0-9]{1,4}[ ][0-9]{10})$";
	private static String EMAIL = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
	private static String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";
	

	ValidateInput validateFirstName = (String firstName) -> {
	if(matchingWithPattern(firstName, NAME)) 
		return "valid"; 
	else
		throw new UserRegistrationException("Invalid first name");
	};
	
	ValidateInput validateLastName = (String lastName) -> {
	if(matchingWithPattern(lastName, NAME)) 
		return "valid"; 
	else
		throw new UserRegistrationException("Invalid first name");
	};
		
	ValidateInput validateEmail = (String email) -> {
		if(matchingWithPattern(email, EMAIL))
				return "valid";
		else
			throw new UserRegistrationException("Invalid email");
	};
	
	ValidateInput validateMobileNumber = (String mobile) -> {
		if(matchingWithPattern(mobile, MOBILE))
			return "valid";
		else
			throw new UserRegistrationException("Invalid mobile number");
	};

	ValidateInput validatePassword = (String password) -> {
		if(matchingWithPattern(password, PASSWORD))
			return "valid";
		else
			throw new UserRegistrationException("Invalid password");
	};

	public boolean matchingWithPattern(String check, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if (matcher.find()) {
			return true;
		}
		return false;
	}
}