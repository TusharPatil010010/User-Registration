package com.Assignment.Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenEntry_whenAllDataValid_thenReturnHappyMood() {
		
		UserRegistration obj = new UserRegistration();
		
		String name = obj.validateInput("Tushar");
		String email = obj.validateEmail("abc.xyz@bl.co.in");
		String number = obj.validateNumber("919876543210");
		String password = obj.validatePassword("Qwerty@123");		
	
		assertTrue(name == "valid" && email == "valid" && number == "valid" && password == "valid");
		System.out.println("Happy Mood");
		
			
	}
	
	@Test
	public void givenEntry_whenAllDataInalid_thenReturnSadMood() {
		
		UserRegistration obj = new UserRegistration();
		
		String name = obj.validateInput("Tushar");
		String email = obj.validateEmail("abc.xyz@bl.co.in");
		String number = obj.validateNumber("919876543210");
		String password = obj.validatePassword("Qwerty@123");		
	
		assertTrue(name == "invalid" || email == "invalid" || number == "invalid" || password == "invalid");
		System.out.println("Sad Mood");
		
			
	}
}
