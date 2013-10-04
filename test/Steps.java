import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.fest.assertions.Assertions.assertThat;


public class Steps {

    @Given("^I am a test$")
    public void I_am_a_test() throws Throwable {
        Hooks.browser.goTo("http://localhost:3333");
    }

    @When("^I test$")
    public void I_test() throws Throwable {
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void I_should_see(String arg1) throws Throwable {
        assertThat(Hooks.browser.title()).isEqualTo("Welcome to Play");
    }
}
