import com.google.inject.Inject;
import com.google.inject.name.Named;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import play.test.TestBrowser;

import static org.fest.assertions.Assertions.assertThat;

public class Steps {

    @Inject
    private TestBrowser testBrowser;

    @Inject
    @Named("PORT")
    private Integer port;

    @Given("^I have setup Play$")
    public void I_have_setup_Play() throws Throwable {
    }

    @When("^I go to the landing page$")
    public void I_go_to_the_landing_page() throws Throwable {
        testBrowser.goTo("http://localhost:" + port);
    }

    @Then("^the title should be \"([^\"]*)\"$")
    public void the_title_should_be(String title) throws Throwable {
        assertThat(testBrowser.title()).isEqualTo(title);
    }

}
