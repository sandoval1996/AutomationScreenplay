package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.HomePageParaBank;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {
    String username;
    String password;

    public IniciarSesion(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(username).into(HomePageParaBank.USERNAME),Enter.theValue(password).into(HomePageParaBank.PASSWORD),Click.on(HomePageParaBank.BTN_LOGIN));



    }

    public static IniciarSesion iniciarSesion(String username, String password)
    {
        return Tasks.instrumented(IniciarSesion.class,username, password);
    }
}
