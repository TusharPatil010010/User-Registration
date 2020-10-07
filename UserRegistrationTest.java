import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserRegistrationJUnitTest {
	private static UserRegistration userRegistration;

	@BeforeAll
	static void initiate() {
		userRegistration = new UserRegistration();
	}

	@ParameterizedTest
	@ValueSource(strings = {"a", "b", "c", "d"})
	public void firstName_ifValid_shouldReturnValid(String validFirstNames) throws InvalidUserDetailsException {
		assertEquals("valid",userRegistration.validateFirstName.validate(validFirstNames));
	}
	@ParameterizedTest
	@ValueSource(strings = {"ab", "cd23", "e12", "hj"})
	public void firstName_ifInvalid_shouldReturnInvalid(String invalidFirstNames) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistration.validateFirstName.validate(invalidFirstNames);
		});
		System.out.println(exception);
	}
	@ParameterizedTest
	@ValueSource(strings = {"ab", "cd", "ef", "gh"})
	public void lastName_ifValid_shouldReturnValid(String validLastNames) throws InvalidUserDetailsException {
		assertEquals("valid", userRegistration.validateLastName.validate(validLastNames));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"ab23", "cd@", "efr34", "gh#"})
	public void lastName_ifInvalid_shouldReturnInvalid(String invalidLastNames) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistration.validateLastName.validate(invalidLastNames);
		});
		System.out.println(exception);
	}
	@ParameterizedTest
	@ValueSource(strings = {"95631654845", "91 9876543210", "254 4568523658"})
	public void mobile_ifValid_shouldReturnValid(String validMobile) throws InvalidUserDetailsException {
		assertEquals("valid", userRegistration.validateMobileNumber.validate(validMobile));
	}
	@ParameterizedTest
	@ValueSource(strings = {"23758964120", "000 8562358253"})
	public void mobile_ifInvalid_shouldReturnInvalid(String invalidMobile) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistration.validateMobileNumber.validate(invalidMobile);
		});
		System.out.println(exception);
	}
	@ParameterizedTest
	@ValueSource(strings = {"Qwerty@1234", "Vyuts#shs7"})
	public void password_ifValid_shouldReturnValid(String validPasswords) throws InvalidUserDetailsException {
		assertEquals("valid", userRegistration.validatePassword.validate(validPasswords));
	}
	@ParameterizedTest
	@ValueSource(strings = {"12@dhwd@vfnk", "huw&vdjsk%cbhdj231"})
	public void password_ifInvalid_shouldReturnInvalid(String invalidPasswords) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistration.validatePassword.validate(invalidPasswords);
		});
		System.out.println(exception);
	}
	@ParameterizedTest
	@ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
			"abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"})
	public void email_ifValid_shouldReturnValid(String validEmails) throws InvalidUserDetailsException {
		assertEquals("valid", userRegistration.validateEmail.validate(validEmails));
	}
	@ParameterizedTest
	@ValueSource(strings = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com", 
			"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
	public void email_ifInvalid_shouldReturnInvalid(String invalidEmails) {
		InvalidUserDetailsException exception = assertThrows(InvalidUserDetailsException.class, () -> {	
			userRegistration.validateEmail.validate(invalidEmails);
		});
		System.out.println(exception);
	}
		
}