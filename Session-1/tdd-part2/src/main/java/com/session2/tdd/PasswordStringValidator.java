package com.session2.tdd;

import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;

public class PasswordStringValidator {
    public ValidationResult validate(String password){

        ValidationResult result = new ValidationResult();


        if(password.length() < 8){
            result.getViolations().add("Password must be at least 8 characters.");
            result.setValid(false);
        }
        if(password.matches(".*\\d.*") == false){
            result.getViolations().add("Password must contain at least 1 number.");
            result.setValid(false);
        }
        if(password.matches(".*[A-Z].*") == false){
            result.getViolations().add("Password must contain at least one capital letter.");
            result.setValid(false);
        }
        if(password.matches(".*[^A-Za-z0-1\\s].*") == false){
            result.getViolations().add("Password must contain at least one special character.");
            result.setValid(false);
        }

        return result;
    }

}
