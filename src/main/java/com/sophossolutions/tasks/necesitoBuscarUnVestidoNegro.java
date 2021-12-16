package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.HomePageYourLogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;


public class necesitoBuscarUnVestidoNegro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(MoveMouse.to(HomePageYourLogo.DRESSES),Click.on(HomePageYourLogo.EVENING_DRESSES));

    }

    public static necesitoBuscarUnVestidoNegro buscarUnVestidoNegro()
    {
        return Tasks.instrumented(necesitoBuscarUnVestidoNegro.class);
    }

}
