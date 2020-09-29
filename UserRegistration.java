import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	private String validateInput(String name) {
		String expression = "(^[A-Z]{1})[a-z]{2,}$"; // Pattern for Name
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(name);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	private String validateEmail(String Email) {
		String expression = "(abc?[.][A-Za-z]*@bl[.]co[.][A-Za-z]{2,})$"; // Pattern for Email
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(Email);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	private String validateNumber(String number) {
		String expression = "^[0-9]{2}?[ ][0-9]{4,13}";	// Pattern for Number
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(number);
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
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();
		System.out.println("Enter the Email Id");
		String Email = sc.nextLine();
		System.out.println("Enter the Phone Number");
		String Phone = sc.nextLine();
		
		System.out.println(firstName + " is " +user.validateInput(firstName)); //Validating firstName
		System.out.println(lastName + " is " +user.validateInput(lastName)); //Validating lastName
		System.out.println(Email + " is " +user.validateEmail(Email));	// Validating email Id
		System.out.println(Phone+ " is " +user.validateNumber(Phone));	// Validating Number
		
		sc.close();
	}	
}