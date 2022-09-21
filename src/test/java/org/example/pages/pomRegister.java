package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class pomRegister {
    public WebElement loginRegister()
    {
       WebElement loginRegister= Hooks.driver.findElement(By.className("ico-register"));
       return loginRegister;
    }
    public WebElement selectGender()
    {
        WebElement selectGender= Hooks.driver.findElement(By.id("gender-male"));
        return selectGender;
    }
    public WebElement enterFirstName()
    {
        WebElement enterFirstName= Hooks.driver.findElement(By.id("FirstName"));
        return enterFirstName;
    }
    public WebElement enterSecondName()
    {
        WebElement enterSecondName= Hooks.driver.findElement(By.id("LastName"));
        return enterSecondName;
    }
    public void dateOfBirthDay()
    {
        WebElement dateOfBirthDay= Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select selected = new Select(dateOfBirthDay);
        selected.selectByVisibleText("18");
    }
    public void dateOfBirthMonth()
    {
        WebElement dateOfBirthMonth= Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select selected = new Select(dateOfBirthMonth);
        selected.selectByVisibleText("January");

    }
    public void dateOfBirthYear()
    {
        WebElement dateOfBirthYear= Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select selected = new Select(dateOfBirthYear);
        selected.selectByVisibleText("1995");
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
    public WebElement confirmPassowrd()
    {
        WebElement confirmPassowrd= Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirmPassowrd;
    }
    public WebElement enterButton()
    {
        WebElement enterButton= Hooks.driver.findElement(By.id("register-button"));
        return enterButton;
    }

    public void appliedSoftAssertionAsRequiredForAllScenarios()
    {
        SoftAssert softAssertion=new SoftAssert();
        WebElement assertion= Hooks.driver.findElement(By.className("result"));
        String color=  assertion.getCssValue("color");
        System.out.println(color);
        String expetedResult = "(76, 177, 124, 1)";
        String actualResult = color;
        softAssertion.assertEquals(actualResult.contains(expetedResult),true);
        softAssertion.assertAll();

    }
}
