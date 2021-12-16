package com.sophossolutions.stepdefinitions;

import com.sophossolutions.questions.ValidateTextField;
import com.sophossolutions.tasks.AgregarVestidoColorTallaPreferencia;
import com.sophossolutions.tasks.necesitoBuscarUnVestidoNegro;
import com.sophossolutions.userinterfaces.HomePageYourLogo;
import com.sophossolutions.userinterfaces.Summary;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.sophossolutions.userinterfaces.Summary.QUALITY;
import static net.serenitybdd.screenplay.targets.Target.the;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.hasValue;

public class CompraVestidoStepDefinitions {


    @Before
    public void setup()
    {
        setTheStage(new OnlineCast());
    }


    @Given("Necesito buscar un vestido negro")
    public void necesitoBuscarUnVestidoNegro() {
       theActorCalled("Jhon").wasAbleTo(Open.browserOn(new HomePageYourLogo()));
       theActorInTheSpotlight().attemptsTo(necesitoBuscarUnVestidoNegro.buscarUnVestidoNegro());


    }
    @When("Agregar vestidos de color y talla de preferencia")
    public void agregarVestidosDeColorYTallaDePreferencia() {
    theActorInTheSpotlight().attemptsTo(AgregarVestidoColorTallaPreferencia.agregarvestidoTyC());

    }
    @Then("Valido que el vestido sea agregado al carrito de compras")
    public void validoQueElVestidoSeaAgregadoAlCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(QUALITY).value().isEqualTo("2"));
        theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(Summary.TALLA),equalTo("Color : Pink, Size : M")));
        theActorInTheSpotlight().should(seeThat(ValidateTextField.getText(Summary.TOTAL),equalTo("$103.98")));

    }


}
