package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.RegisterPageParaBank;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistroDeCuentaParaBank implements Task {

    String firstname;
    String lastname;
    String adress;
    String city;
    String state;
    String zipcode;
    String phone;
    String ssn;
    String username;
    String password;
    String rPassword;

    public RegistroDeCuentaParaBank(String firstname, String lastname, String adress, String city, String state, String zipcode, String phone, String ssn, String username, String password, String rPassword) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone = phone;
        this.ssn = ssn;
        this.username = username;
        this.password = password;
        this.rPassword = rPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPageParaBank.LINK_REGISTER),Enter.theValue(firstname).into(RegisterPageParaBank.FIRST_NAME),Enter.theValue(lastname).into(RegisterPageParaBank.LAST_NAME),Enter.theValue(adress).into(RegisterPageParaBank.ADRESS),
                Enter.theValue(city).into(RegisterPageParaBank.CITY),Enter.theValue(state).into(RegisterPageParaBank.STATE),Enter.theValue(zipcode).into(RegisterPageParaBank.ZIPCODE),
                Enter.theValue(phone).into(RegisterPageParaBank.PHONE),Enter.theValue(ssn).into(RegisterPageParaBank.SSN),Enter.theValue(username).into(RegisterPageParaBank.USERNAME),
                Enter.theValue(password).into(RegisterPageParaBank.PASSWORD),Enter.theValue(rPassword).into(RegisterPageParaBank.RPASSWORD), Click.on(RegisterPageParaBank.BTN_REGISTER),Click.on(RegisterPageParaBank.LOG_OUT));
    }


    public static RegistroDeCuentaParaBank registroDeCuentaParaBank(String firstname, String lastname, String adress, String city, String state, String zipcode, String phone, String ssn, String username, String password, String rPassword)
    {
        return Tasks.instrumented(RegistroDeCuentaParaBank.class,firstname, lastname, adress, city, state, zipcode, phone, ssn, username, password, rPassword);
    }



}
