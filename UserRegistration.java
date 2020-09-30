import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	private String validateEmail(String check) {
		String regex = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(check);
		if(matcher.find()) {
			return "valid";
		}
		return "invalid";
	}
	
	public static void main(String[] args) {
		UserRegistration patternMatcher = new UserRegistration();

		String a1 = abc@yahoo.com;
		System.out.println(a1 + "----->" + patternMatcher.validateEmail(a));
		String a2 = abc-100@yahoo.com,;
		System.out.println(a2 + "----->" + patternMatcher.validateEmail(a));
		String a3 = abc.100@yahoo.com;
		System.out.println(a3 + "----->" + patternMatcher.validateEmail(a));
		String a4 = abc111@abc.com;
		System.out.println(a4 + "----->" + patternMatcher.validateEmail(a));
		String a5 = abc-100@abc.net;
		System.out.println(a5 + "----->" + patternMatcher.validateEmail(a));
		String a6 = abc.100@abc.com.au;
		System.out.println(a6 + "----->" + patternMatcher.validateEmail(a));
		String a7 = abc@1.com;
		System.out.println(a7 + "----->" + patternMatcher.validateEmail(a));
		String a8 = abc@gmail.com.com;
		System.out.println(a8 + "----->" + patternMatcher.validateEmail(a));
		String a9 = abc+100@gmail.com;	
		System.out.println(a9 + "----->" + patternMatcher.validateEmail(a));

	}
	
}