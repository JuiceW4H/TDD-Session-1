//package tdd.cucumber;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import tdd.cucumber.calc.Calculator;
//
//import static org.junit.Assert.assertEquals;
//
//public class CalculatorSteps {
//
//    private int total;
//
//    private Calculator calculator;
//
//    @Before
//    private void init() {
//        total = -999;
//    }
//
//    @Given("^I have a calculator$")
//    public void initializeCalculator() throws Throwable {
//        calculator = new Calculator();
//    }
//
//    @When("^I add (-?\\d+) and (-?\\d+)$")
//    public void testAdd(int num1, int num2) throws Throwable {
//        total = calculator.add(num1, num2);
//    }
//
//    @Then("^the result should be (-?\\d+)$")
//    public void validateResult(int result) throws Throwable {
//        assertEquals(total, result);
//    }
//}