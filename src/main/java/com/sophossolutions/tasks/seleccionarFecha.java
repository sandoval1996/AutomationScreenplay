package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.HomePageDepegar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class seleccionarFecha implements Task {

      String ida;
      String regreso;

    public seleccionarFecha(String ida, String regreso) {
        this.ida = ida;
        this.regreso = regreso;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

      String [] diaIda = ida.split("/");
      String [] diaRegreso = regreso.split("/");


      actor.attemptsTo(Click.on(HomePageDepegar.FECHA),Click.on(HomePageDepegar.getDia(diaIda[0])),Click.on(HomePageDepegar.getDia(diaRegreso[0])),Click.on(HomePageDepegar.BUSCAR));



    }

    public static seleccionarFecha Seleccionarfecha(String ida, String regreso)
    {
        return Tasks.instrumented(seleccionarFecha.class, ida, regreso);

    }

}
