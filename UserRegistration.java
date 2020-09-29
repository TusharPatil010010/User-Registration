import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Registration user = new Registration();
		
		System.out.println("Enter the first name");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();
		
		System.out.println(firstName + " is " +user.validateInput(firstName)); //Validating firstName
		System.out.println(lastName + " is " +user.validateInput(lastName)); //Validating lastName
		sc.close();
	}
	private String validateInput(String name) {
		String expression = "(^[A-Z]{1})[a-z]{2,}$"; // Pattern for Names
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(name);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
}