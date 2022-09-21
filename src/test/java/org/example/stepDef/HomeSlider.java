package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.pomHomeSlider;

public class HomeSlider {
    pomHomeSlider slider=new pomHomeSlider();
    @Given("click on first slider")
    public void clickOnFirstSlider() throws InterruptedException {
    slider.clickOnFirstSlider().click();
    Thread.sleep(1000);
    slider.clickOnImage().click();

    }
    @When("Assertion with URL link first scenario")
    public void assertionWithURLLinkFirstScenario() {
        slider.AssertionWithURLLinkFirstScenario();
    }


    @Given("click on second slider")
    public void clickOnSecondSlider() throws InterruptedException {
     slider.clickOnSecondSlider().click();
     Thread.sleep(1000);
     slider.clickOnImage().click();
    }



    @When("Assertion with URL link second scenario")
    public void assertionWithURLLinkSecondScenario() {
        slider.AssertionWithURLLinkSecondScenario();
    }


}
