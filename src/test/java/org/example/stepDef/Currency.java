package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.pomCurrency;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Currency {
    pomCurrency pomCurrency=new pomCurrency();
    @When("user select euro")
    public void euroSelected() {
        pomCurrency.euroSelected();
    }

    @Then("we will see euro symbol on all products")
    public void weWillSeeEuroSymbolOnAllProducts() {
     pomCurrency.weWillSeeEuroSymbolOnAllProducts();
    }


}

