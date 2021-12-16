package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://parabank.parasoft.com/parabank/index.htm")
public class HomePageParaBank extends PageObject {


    public static final Target USERNAME = Target.the("campo de usuario").locatedBy("//input[@name='username']");

    public static final Target PASSWORD = Target.the("campo de contraseña").locatedBy("//input[@name='password']");

    public static final Target BTN_LOGIN = Target.the("boton de login").locatedBy("//*[@id=\"loginPanel\"]/form/div[3]/input");






}
