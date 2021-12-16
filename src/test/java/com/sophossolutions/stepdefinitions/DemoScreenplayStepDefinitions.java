package com.sophossolutions.stepdefinitions;

import com.sophossolutions.questions.ValidateTextField;
import com.sophossolutions.tasks.AgregarVestidoACarrito;
import com.sophossolutions.tasks.BuscarVestido;
import com.sophossolutions.userinterfaces.EveningDresses;
import com.sophossolutions.userinterfaces.HomePageYourLogo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class DemoScreenplayStepDefinitions {

    @Before
    public void setup()
    {
        setTheStage(new OnlineCast());
    }


    @Given("^Necesito buscar un vestido$")
    public void necesitoBuscarUnVestido() {

         theActorCalled("Practicante").wasAbleTo(Open.browserOn(new HomePageYourLogo()));
         theActorInTheSpotlight().attemptsTo(BuscarVestido.buscarvestido());


    }
    @When("^el tipo de vestido es nocturno$")
    public void elTipoDeVestidoEsNocturno() {

        theActorInTheSpotlight().attemptsTo(AgregarVestidoACarrito.agregar());


    }
    @Then("^valido que el vestido sea agregado al carrito de compras$")
    public void validoQueElVestidoSeaAgregadoAlCarritoDeCompras() {

  theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(EveningDresses.QUANTITY),equalTo("1")));


    }



}
