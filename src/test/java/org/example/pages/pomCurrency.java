package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class pomCurrency {

    public void euroSelected() {
        WebElement currencyList = Hooks.driver.findElement(By.id("customerCurrency"));
        Select selected = new Select(currencyList);
        selected.selectByVisibleText("Euro");
    }
    public void weWillSeeEuroSymbolOnAllProducts() {

        for (int i = 0; i < pomCurrency.Elemnts().size(); i++) {
            SoftAssert softAssertion=new SoftAssert();
            String Element = pomCurrency.Elemnts().get(i).getText();
            System.out.println(Element);
            String expetedResult = "€";
            String actualResult = Element;
            softAssertion.assertEquals(actualResult.contains(expetedResult),true);
            softAssertion.assertAll();
        }

    }
    public static List<WebElement> Elemnts()
    {
        List<WebElement> Elemnts =  Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return Elemnts;
    }
}
