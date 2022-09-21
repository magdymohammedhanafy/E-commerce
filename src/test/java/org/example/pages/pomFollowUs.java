package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class pomFollowUs {

    public WebElement clickOnFacebookTab()
    {
        WebElement clickOnFacebookTab =Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"]"));
        return clickOnFacebookTab;

    }

    public WebElement clickOnTwitterTab()
    {
        WebElement clickOnTwitterTab =Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"]"));
        return clickOnTwitterTab;

    }

    public WebElement clickOnRssTab()
    {
        WebElement clickOnRssTab =Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"]"));
        return clickOnRssTab;

    }

    public WebElement clickOnYoutubeTab()
    {
        WebElement clickOnYoutubeTab =Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"]"));
        return clickOnYoutubeTab;

    }

    public WebDriver moveBetweenTabs()
    {
        ArrayList<String> moveBetweenTabs =new ArrayList<String>(Hooks.driver.getWindowHandles());
        WebDriver tab=Hooks.driver.switchTo().window(moveBetweenTabs.get(1));
        return tab;

    }


    public String getCurrentUrl()
    {
        String getCurrentUrl =Hooks.driver.getCurrentUrl();
        return getCurrentUrl;

    }

    public String expectedResultScenario1()
    {
        String expectedResultScenario1 ="https://www.facebook.com/nopCommerce";
        return expectedResultScenario1;

    }

    public String expectedResultScenario2()
    {
        String expectedResultScenario2 ="https://twitter.com/nopCommerce";
        return expectedResultScenario2;

    }

    public String expectedResultScenario3()
    {
        String expectedResultScenario3 ="https://demo.nopcommerce.com/new-online-store-is-open";
        return expectedResultScenario3;

    }

    public String expectedResultScenario4()
    {
        String expectedResultScenario4 ="https://www.youtube.com/user/nopCommerce";
        return expectedResultScenario4;

    }
}
