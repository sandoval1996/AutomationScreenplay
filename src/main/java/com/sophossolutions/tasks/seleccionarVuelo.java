package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.HomePageDepegar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class seleccionarVuelo implements Task {

    String origen;
    String destino;


    public seleccionarVuelo(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(origen).into(HomePageDepegar.ORIGEN).thenHit(Keys.ENTER), Enter.theValue(destino).into(HomePageDepegar.DESTINO).thenHit(Keys.ENTER));

    }

    public static seleccionarVuelo Seleccionarvuelo(String origen,String destino)
    {
       return Tasks.instrumented(seleccionarVuelo.class, origen, destino);
    }



}
