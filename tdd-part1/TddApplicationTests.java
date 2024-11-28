package com.session2.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class TddApplicationTests {

	private String password = "Password091";

	@Test
	void teststringLength() {
		assertTrue(password.length() >= 8, "Password must be at least 8 characters.");

	}

	@Test
	void testContainNumber() {
		assertTrue(password.matches(".*\\d.*"), "Password must contain at least one special character.");
	}

	@Test
	void testValidationCount() {
		assertAll();
	}

	@Test
	void testContainUpperCase() {
		assertTrue(password.matches(".*[A-Z].*"), "Password must contain at least one capital letter.");
	}

	@Test
	void testContainSpecialCharacter() {
		assertTrue(password.matches(".*[^A-Za-z0-1\\s].*"), "Password must contain at least one special character.");
	}
}



