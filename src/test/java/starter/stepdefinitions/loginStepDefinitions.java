package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStepDefinitions {

    String name;
    String email;
    String clave;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) (.*) (.*) has an active account")
    public void has_an_active_account(String name, String email, String clave) {
        this.name = name;
        this.email = email;
        this.clave = clave;
    }
    @When("he sends his valid credentials")
    public void he_sends_his_valid_credentials() {
        theActorCalled(this.name).attemptsTo(
                NavigateTo.theSauceDemoGoHomePage(),
                DoLogin.withredentials(this.email,this.clave));

    }
    @Then("he should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {
    }
}
