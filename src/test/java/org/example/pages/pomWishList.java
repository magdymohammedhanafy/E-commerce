package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class pomWishList {
    public  WebElement findWishListButtonOfM8()
    {
        List<WebElement> items= Hooks.driver.findElements(By.className("add-to-wishlist-button"));
        WebElement item3=items.get(2);
        return item3;

    }
    public  WebElement mainWishlistButton()
    {
        WebElement mainWishlistButton= Hooks.driver.findElement(By.className("wishlist-label"));
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return mainWishlistButton;

    }
   public void assertionWithColor ()
   {
       WebElement assertion= Hooks.driver.findElement(By.cssSelector("div[id=\"bar-notification\"] div[class]"));
       String color=  assertion.getCssValue("background-color");
       System.out.println(color);
       String expetedResult = "rgba(75, 176, 122, 1)";
       String actualResult = color;
       Assert.assertEquals(actualResult.contains(expetedResult),true);
   }

   public void getQTY()
   {
       WebElement getQTY=Hooks.driver.findElement(By.className("qty-input"));
       String value= getQTY.getAttribute("value");
       System.out.println(value);
       String actualResult=value;
       String expectedResult="0";
       Assert.assertEquals(actualResult.contains(expectedResult),false);


   }


}
