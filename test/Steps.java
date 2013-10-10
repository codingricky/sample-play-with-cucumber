import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import play.test.TestBrowser;

import static org.fest.assertions.Assertions.assertThat;

public class Steps {

    @Inject
    private TestBrowser testBrowser;

    @Given("^I am a test$")
    public void I_am_a_test() throws Throwable {
        testBrowser.goTo("http://localhost:3333");
    }

    @When("^I test$")
    public void I_test() throws Throwable {
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void I_should_see(String title) throws Throwable {
        assertThat(testBrowser.title()).isEqualTo(title);
    }
}
