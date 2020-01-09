package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class AuthenticationStepDefinitions {
    @Given("^that Brandon wants to enter the Wordpress application$")
    public void thatBrandonWantsToEnterTheWordpressApplication() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenThe.wordpressApp());
    }


    @When("^I login with the username \"([^\"]*)\" and the password \"([^\"]*)\"$")
    public void iLoginWithTheUsernameAndThePassword(String arg1, String arg2) {

    }

    @Then("^you should see the login in the application with the message Logged in as$")
    public void youShouldSeeTheLoginInTheApplicationWithTheMessageLoggedInAs() {

    }

}
