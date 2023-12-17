package stepsdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {
    @Given("Customer_process workflow is invoked in LMS with correct data")
    public void Method1() {
        System.out.println("HI");
    }
    @Then("Customer_process workflow will complete successfully")
    public void Method2() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("HI");
    }
}
