import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	private String validateInput(String name) {
		String expression = "(^[A-Z]{1})[a-z]{2,}$";
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(name);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserRegistration user = new UserRegistration();

		System.out.println("Enter the first name");
		String firstName = sc.nextLine();

		System.out.println(firstName + " is " +user.validateInput(firstName));		
		sc.close();
	}

}