package com.sophossolutions.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.stepdefinitions",
        features = "src/test/resources/com/sophossolutions/features/Compra_Vestido.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
public class CompraVestido {


}
