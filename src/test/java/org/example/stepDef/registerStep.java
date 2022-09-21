package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.pomRegister;
import org.openqa.selenium.By;
import org.testng.Assert;

public class registerStep {
    pomRegister register=new pomRegister();

    @Given("user goto register page")
    public void register()
    {
        register.loginRegister().click();
    }


    @When("user select gender type")
    public void userSelectGenderType() {
        register.selectGender().click();

    }

    @Then("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        register.enterFirstName().sendKeys(arg0);
        register.enterSecondName().sendKeys(arg1);
    }

    @Then("user enter date of birth")
    public void userEnterDateOfBirth() throws InterruptedException {
        register.dateOfBirthDay();
        register.dateOfBirthMonth();
        register.dateOfBirthYear();
        Thread.sleep(3000);

    }

    @Then("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        register.enterEmail().sendKeys(arg0);
    }

    @Then("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        register.enterPassowrd().sendKeys(arg0);
        register.confirmPassowrd().sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.enterButton().click();
    }

    @And("applied Soft assertion as required for all scenarios")
    public void appliedSoftAssertionAsRequiredForAllScenarios() {
    register.appliedSoftAssertionAsRequiredForAllScenarios();

    }
}
