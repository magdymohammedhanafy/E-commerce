package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.pomHover;
import org.example.pages.pomRegister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class Hover {
    pomHover Hover=new  pomHover();
    @When("select random one of the three main categories")
    public void selectOneOfMainCategeries()
    {
        Hover.selectOneOfMainCategeries();

    }

    @Then("select sub-category and Assert that the sub-category title is \\(equal or contains) the one you get")
    public void selectSubCategoryAndAssertThatTheSubCategoryTitleIsEqualOrContainsTheOneYouGet() {
        Hover.selectSubCategoryAndDoAssertion();
    }
}


