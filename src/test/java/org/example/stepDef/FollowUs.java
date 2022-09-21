package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.pomFollowUs;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FollowUs {
    pomFollowUs followUs=new pomFollowUs();


    @Given("click on facebook tab")
    public void clickOnFacebookTab() throws InterruptedException {
        followUs.clickOnFacebookTab().click();
        System.out.println(followUs.getCurrentUrl());
        Thread.sleep(2000);
    }

    @When("moves between two tabs")
    public void movesBetweenTwoTabs() throws InterruptedException {
        followUs.moveBetweenTabs();
        System.out.println(followUs.getCurrentUrl());
        Thread.sleep(2000);
    }

    @Then("Assertion with Url link on facebook tab")
    public void assertionWithUrlLinkOnFacebookTab() {
        String actualResult=followUs.getCurrentUrl();
        String expectedResult=followUs.expectedResultScenario1();
        Assert.assertEquals( actualResult,expectedResult);

    }

    @Given("click on twitter tab")
    public void clickOnTwitterTab() throws InterruptedException {
        followUs.clickOnTwitterTab().click();
        System.out.println(followUs.getCurrentUrl());
        Thread.sleep(2000);
    }

    @Then("Assertion with Url link on twitter tab")
    public void assertionWithUrlLinkOnTwitterTab() {
        String actualResult=followUs.getCurrentUrl();
        String expectedResult=followUs.expectedResultScenario2();
        Assert.assertEquals( actualResult,expectedResult);
    }

    @Given("click on rss tab")
    public void clickOnRssTab() throws InterruptedException {
        followUs.clickOnRssTab().click();
        System.out.println(followUs.getCurrentUrl());
        Thread.sleep(2000);
        
    }

    @Then("Assertion with Url link on rss tab")
    public void assertionWithUrlLinkOnRssTab() {
        String actualResult=followUs.getCurrentUrl();
        String expectedResult=followUs.expectedResultScenario3();
        Assert.assertEquals( actualResult,expectedResult);
    }

    @Given("click on youtube tab")
    public void clickOnYoutubeTab() throws InterruptedException {
        followUs.clickOnYoutubeTab().click();
        System.out.println(followUs.getCurrentUrl());
        Thread.sleep(2000);
        
    }

    @Then("Assertion with Url link on youtube tab")
    public void assertionWithUrlLinkOnYoutubeTab() {
        SoftAssert softAssertion=new SoftAssert();
        String actualResult=followUs.getCurrentUrl();
        String expectedResult=followUs.expectedResultScenario4();
        softAssertion.assertEquals( actualResult,expectedResult);
        softAssertion.assertAll();
    }
}
