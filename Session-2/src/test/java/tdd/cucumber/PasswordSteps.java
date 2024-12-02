package tdd.cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tdd.cucumber.pass.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PasswordSteps {

    private PasswordStringValidator passwordValidation;
    private ValidationResult result;


    @Given("^I have a password$")
    public void initializePasswordValidator() throws Throwable {
        passwordValidation = new PasswordStringValidator();
    }

    @When("^I use \"([^\"]*)\"$")
    public void testPassword(String passwordValue) throws Throwable {
        result = passwordValidation.validate(passwordValue);
    }

    @Then("^the result should be (true|false)$")
    public void validateResult(boolean expectedResult) throws Throwable {
        assertEquals(expectedResult,result.isValid());
    }
}

