package co.com.choucair.certificacion.Reto1ANER.stepdefinitions;

import co.com.choucair.certification.Reto1ANER.model.DataForm;
import co.com.choucair.certification.Reto1ANER.questions.Answer1;
import co.com.choucair.certification.Reto1ANER.tasks.OpenUp;
import co.com.choucair.certification.Reto1ANER.tasks.Registy;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomationDemoStepdefinitions {



    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Carlos wants to access the Web Automation Demo Site$")
    public void carlosWantsToAccessTheWebAutomationDemoSite()  {
       OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());

    }


    @When("^he performs the registration on the page$")
    public void hePerformsTheRegistrationOnThePage(List<DataForm> DataForm) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registy.the(DataForm));

    }


    @Then("^Verify that the screen loads with text (.*)$")
    public void verifyThatTheScreenLoadsWithTextDoubleClickOnEditIconToEDITTheTableRow(String question){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer1.toThe(question)));

    }



}
