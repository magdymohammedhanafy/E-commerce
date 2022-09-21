package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.example.pages.pomWishList;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class WishList {
    pomWishList wishlist =new pomWishList();
    @Given("Click on wishlist button of HTC one M8 android")
    public void clickOnWishlistButton () throws InterruptedException {
     wishlist.findWishListButtonOfM8().click();
   //  Thread.sleep(3000);

    // System.out.println(Hooks.driver.findElement(By.className("content")).getText());

    }

    @When("asser background color of message is green")
    public void asserBackgroundColorOfMessageIsGreen() throws InterruptedException {
        Thread.sleep(500);
        wishlist.assertionWithColor();

    }

    @When("click on main wish list button")
    public void clickOnMainWishListButton() {

     wishlist.mainWishlistButton().click();

    }


    @Then("get QTY value and verify its bigger than zero")
    public void getQTYValueAndVerifyItsBiggerThanZero()
    {
     wishlist.getQTY();
    }
}
