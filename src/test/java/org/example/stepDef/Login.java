package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.pomLogin;
import org.example.pages.pomRegister;

public class Login {
    pomLogin login=new pomLogin();

    @Given("user go to login page")
    public void gotoLoginPage()
    {
     login.loginPage().click();
    }


    @When("user login with valid  {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {
        login.enterEmail().sendKeys(arg0);
        login.enterPassowrd().sendKeys(arg1);
    }

    @Then("user press on login button")
    public void userPressOnLoginButton() {
        login.pressLoginButton().click();

    }




    @And("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        login.assertionValidLogin();
    }

    @And("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
    login.assertionInvalidLogin();
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        login.enterEmail().sendKeys(arg0);
        login.enterPassowrd().sendKeys(arg1);
    }
}

