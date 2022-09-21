package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class pomHomeSlider {
    public WebElement clickOnFirstSlider()
    {
        List<WebElement> clickOnFirstSlider= Hooks.driver.findElements(By.cssSelector("div[class=\"nivo-controlNav\"] a"));
       WebElement element1= clickOnFirstSlider.get(0);
        return element1;
    }
    public WebElement clickOnSecondSlider()
    {
        List<WebElement> clickOnFirstSlider= Hooks.driver.findElements(By.cssSelector("div[class=\"nivo-controlNav\"] a"));
        WebElement element2= clickOnFirstSlider.get(1);
        return element2;
    }

    public WebElement clickOnImage()
    {
        WebElement element3= Hooks.driver.findElement(By.id("nivo-slider"));
        return element3;
    }

    public void AssertionWithURLLinkFirstScenario()
    {

        Assert.assertEquals( Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }
    public void AssertionWithURLLinkSecondScenario()
    {

        Assert.assertEquals( Hooks.driver.getCurrentUrl()," https://demo.nopcommerce.com/iphone-6");
    }

}
