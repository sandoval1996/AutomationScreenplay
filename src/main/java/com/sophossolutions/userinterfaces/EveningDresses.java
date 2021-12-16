package com.sophossolutions.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class EveningDresses {

    public static final Target RESULT_DRESS = Target.the("Resultado de busqueda").locatedBy("//*[img[@title='Printed Dress']]");

    public static final Target BUTTON_ADD = Target.the("boton Add").locatedBy("//*[@title='Add to cart']");

    public static final Target BUTTON_MORE = Target.the("boton more").locatedBy("//span[contains(text(),'More')]");

    public static final Target QUANTITY = Target.the("Cantidad de vestidos agregados").locatedBy("#layer_cart_product_quantity");

    public static final Target ADD_QUANTITY = Target.the("agregar cantidad").locatedBy("#quantity_wanted_p > a.btn.btn-default.button-plus.product_quantity_up");

    public static final Target SELECTION_LIST = Target.the("lista de selecion de tallas").locatedBy("//select[@id='group_1']");

    public static final Target SELECTION_COLOR =Target.the("selecion color").locatedBy("//a[@id='color_24']");

    public static final Target BUTTON_ADD_DRESS = Target.the("boton Add Vestido").locatedBy("//p[@id='add_to_cart']");

    public static final Target PROCEED_TO_CHECKOUT = Target.the("pasar por caja").locatedBy("//a[@title='Proceed to checkout']");



}
