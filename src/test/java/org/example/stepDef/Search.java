package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.pomCurrency;
import org.example.pages.pomSearch;
import org.testng.Assert;

public class Search {
    pomSearch search=new pomSearch();
    @When("click on search field")
    public void clickOnSearchField()
    {
    search.clickOnSearch().click();
    }

    @And("search with {string}")
    public void searchWith(String arg0) {
        search.clickOnSearch().sendKeys(arg0);
        search.clickOnSearchButton().click();

    }

    @Then("user could find {string}")
    public void userCouldFind(String arg0) throws InterruptedException {


            if(arg0.contains("book"))
            {
                System.out.println("finally");
                search.Elements(arg0);
                Thread.sleep(500);
            }
            else if (arg0.contains("laptop"))

            {

                System.out.println("finally2");
                search.Elements(arg0);
                Thread.sleep(500);
            }
            else if (arg0.contains("nike"))

            {
                System.out.println("finally3");
                search.Elements(arg0);
                Thread.sleep(500);
            }


    }


    @And("search with SKU and click on product {string}")
    public void searchWithSKUAndClickOnProduct(String arg0) throws InterruptedException {
        search.clickOnSearch().sendKeys(arg0);
        search.clickOnSearchButton().click();
        search.clickOnProduct().click();
        Thread.sleep(500);

    }


    @Then("do assertion with SKU {string}")
    public void doAssertionWithSKU(String arg0) {
        search.doAssertionWithSKU(arg0);
    }
}
