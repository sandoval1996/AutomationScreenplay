package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.seleccionarFecha;
import com.sophossolutions.tasks.seleccionarVuelo;
import com.sophossolutions.userinterfaces.HomePageDepegar;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReservaVueloStepDefinitions {

    @Before
    public void setup()
    {
        setTheStage(new OnlineCast());
    }


    @Given("necesito reservar un vuelo")
    public void necesitoReservarUnVuelo() {

        theActorCalled("Jhon").wasAbleTo(Open.browserOn(new HomePageDepegar()));

    }
    @When("Seleciono {string} y {string}")
    public void selecionoY(String origen, String destino) {
        theActorInTheSpotlight().attemptsTo(seleccionarVuelo.Seleccionarvuelo(origen, destino));
    }


    @When("ingresa fechas {string} y {string}")
    public void ingresaFechasY(String ida, String regreso) {
      theActorInTheSpotlight().attemptsTo(seleccionarFecha.Seleccionarfecha(ida,regreso));
    }

    @Then("valido que el vuelo selecionado esta entre {string}")
    public void validoQueElVueloSelecionadoEstaEntre(String string) {


    }

}
