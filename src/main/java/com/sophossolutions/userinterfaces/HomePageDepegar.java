package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.despegar.com.co/")
public class HomePageDepegar extends PageObject {


    public static final Target ORIGEN = Target.the("Origen del vuelo").locatedBy("//html/body/div[3]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");

    public static final Target DESTINO = Target.the("Destino del vuelo").locatedBy("/html/body/div[3]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");


    public static Target getDia(String dia)
    {
        return  Target.the("Fecha de ida del vuelo").locatedBy(String.format("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[%s]", dia));
    }

    public static final Target FECHA = Target.the("Fecha de ida del vuelo").locatedBy("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");

    public static  final Target BUSCAR = Target.the("Buscar vuelo").locatedBy("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button");


}
