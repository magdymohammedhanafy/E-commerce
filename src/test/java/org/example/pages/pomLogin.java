package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class pomLogin {

    public WebElement loginPage()
    {
        WebElement loginPage= Hooks.driver.findElement(By.className("ico-login"));
        return loginPage;
    }
    public WebElement enterEmail()
    {
        WebElement enterEmail= Hooks.driver.findElement(By.id("Email"));
        return enterEmail;
    }
    public WebElement enterPassowrd()
    {
        WebElement enterPassowrd= Hooks.driver.findElement(By.id("Password"));
        return enterPassowrd;
    }

    public WebElement pressLoginButton()
    {
        WebElement pressLoginButton= Hooks.driver.findElement(By.className("login-button"));
        return pressLoginButton;
    }

    public void assertionValidLogin()
    {
        SoftAssert softAssertion=new SoftAssert();
        Hooks.driver.getCurrentUrl();
        softAssertion.assertEquals( Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        softAssertion.assertAll();

    }

    public void assertionInvalidLogin()
    {
        SoftAssert softAssertion=new SoftAssert();
        WebElement assertion= Hooks.driver.findElement(By.className("validation-summary-errors"));
        String color=  assertion.getCssValue("color");
        System.out.println(color);
        String expetedResult = "(228, 67, 75, 1)";
        String actualResult = color;
        softAssertion.assertEquals(actualResult.contains(expetedResult),true);
        softAssertion.assertAll();

    }


}
