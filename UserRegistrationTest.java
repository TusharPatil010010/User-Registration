package com.Assignment.Demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	
	private String email;
	private String expectedValue;
	
	public UserRegistrationTest(String email, String expectedValue) {
		
		super();
		this.email = email;
		this.expectedValue = expectedValue;
	}
	
	@Before
	public void initialize() {
		UserRegistration obj = new UserRegistration();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"abc-100@yahoo.com", "valid"}, {"abc@yahoo.com", "valid"}, {"abc.100@yahoo.com", "valid"}, 
		{"abc111@abc.com", "valid"}, {"abc-100@abc.net", "valid"}, {"abc.100@abc.com.au", "valid"}, {"abc@1.com", "valid"}, {"abc@gmail.com.com", "valid"}, 
		{"abc+100@gmail.com", "valid"}});
	}	

	@Test
	public void givenSamples_whenExpectedIsTrue_returnTrue() {
		UserRegistration obj1 = new UserRegistration();
		
	    assertEquals(expectedValue, obj1.validateEmail(email));
	        
    }
}

