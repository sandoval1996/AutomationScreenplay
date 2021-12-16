package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.EveningDresses;
import com.sophossolutions.userinterfaces.HomePageYourLogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AgregarVestidoColorTallaPreferencia implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(EveningDresses.RESULT_DRESS), Click.on(EveningDresses.BUTTON_MORE));
        actor.attemptsTo(Click.on(EveningDresses.ADD_QUANTITY));
        actor.attemptsTo(SelectFromOptions.byValue("2").from(EveningDresses.SELECTION_LIST));
        actor.attemptsTo(Click.on(EveningDresses.SELECTION_COLOR));
        actor.attemptsTo(Click.on(EveningDresses.BUTTON_ADD_DRESS));
        actor.attemptsTo(Click.on(EveningDresses.PROCEED_TO_CHECKOUT));
    }

    public static AgregarVestidoColorTallaPreferencia agregarvestidoTyC()
    {
        return Tasks.instrumented(AgregarVestidoColorTallaPreferencia.class);
    }


}
