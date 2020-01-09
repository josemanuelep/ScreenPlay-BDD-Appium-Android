package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.tasks.Login;
import co.com.choucair.automation.android.tasks.OpenThe;
import co.com.choucair.automation.android.questions.Verify;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class AuthenticationStepDefinitions {
    @Given("^that Brandon wants to enter the Wordpress application$")
    public void thatBrandonWantsToEnterTheWordpressApplication() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenThe.wordpressApp());
    }


    @When("^I login with the username \"([^\"]*)\" and the password \"([^\"]*)\"$")
    public void iLoginWithTheUsernameAndThePassword(String arg1, String arg2) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(arg1, arg2));
    }

    @Then("^you should see the login in the application with the message (.*)$")
    public void youShouldSeeTheLoginInTheApplicationWithTheMessageLoggedInAs(String label) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.the(label)));
    }

}
