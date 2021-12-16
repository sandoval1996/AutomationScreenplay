package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Summary {

public static final Target QUALITY = Target.the("cantidad de vestidos comprados").locatedBy("#product_4_44_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey");

public static final Target TALLA =Target.the("talla selecionanda").locatedBy("#product_4_44_0_0 > td.cart_description > small:nth-child(3) > a");

public static final Target TOTAL = Target.the("total de la compra").locatedBy("//span[@id='total_price']");


}
