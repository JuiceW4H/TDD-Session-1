package com.session2.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;


public class PasswordStringValidatorTest {

    List<String> errorMessages;

    @Nested
    class Position {

        @BeforeEach
        void setup() {
            errorMessages = new ArrayList<>();;

            errorMessages.add("Password must be at least 8 characters.");
            errorMessages.add("Password must contain at least 1 number.");
            errorMessages.add("Password must contain at least one capital letter.");
            errorMessages.add("Password must contain at least one special character.");
        }

        @Test
        void testValidate_inputHasViolation() {

            PasswordStringValidator password = new PasswordStringValidator();
            ValidationResult result = password.validate("Pass9@");

            assertEquals(List.of(errorMessages.get(0)),result.getViolations());
            assertFalse(result.isValid);
        }
    }

    @Nested
    class Negative{

        @Test
        void testValidate_failedResult(){
            fail();
        }
    }
}
