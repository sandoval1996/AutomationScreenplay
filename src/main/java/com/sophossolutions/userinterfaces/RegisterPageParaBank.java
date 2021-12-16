package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPageParaBank extends PageObject {

    public static final Target FIRST_NAME = Target.the("campo de nombre").locatedBy("//*[@name='customer.firstName']");

    public static final Target LAST_NAME = Target.the("campo de apellido").locatedBy("//*[@id=\"customer.lastName\"]");

    public static final Target ADRESS = Target.the("campo de direccion").locatedBy("//*[@id=\"customer.address.street\"]");

    public static final Target CITY = Target.the("campo de ciudad").locatedBy("//*[@id=\"customer.address.city\"]");

    public static final Target STATE = Target.the("campo de estado").locatedBy("//*[@name='customer.address.state']");

    public static final Target ZIPCODE = Target.the("campo de zipcode").locatedBy("//*[@name='customer.address.zipCode']");

    public static final Target PHONE = Target.the("campo de telefono").locatedBy("//*[@name='customer.phoneNumber']");

    public static final Target SSN = Target.the("link de registro para la cuenta").locatedBy("//*[@name='customer.ssn']");

    public static final Target USERNAME = Target.the("link de registro para la cuenta").locatedBy("//*[@name='customer.username']");

    public static final Target PASSWORD = Target.the("link de registro para la cuenta").locatedBy("//*[@name='customer.password']");

    public static final Target RPASSWORD = Target.the("link de registro para la cuenta").locatedBy("//*[@name='repeatedPassword']");

    public static final Target BTN_REGISTER = Target.the("link de registro para la cuenta").locatedBy("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    public static final Target LINK_REGISTER = Target.the("link de registro para la cuenta").locatedBy("//*[@id=\"loginPanel\"]/p[2]/a");

    public static final Target LOG_OUT = Target.the("cerrar sesion").locatedBy("//*[@id=\"leftPanel\"]/ul/li[8]/a");









}
