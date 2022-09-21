package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class pomSearch {
    public WebElement clickOnSearch()
    {
        WebElement clickOnSearch= Hooks.driver.findElement(By.id("small-searchterms"));
        return clickOnSearch;
    }
    public WebElement clickOnSearchButton()
    {
        WebElement clickOnSearchButton= Hooks.driver.findElement(By.className("search-box-button"));
        return clickOnSearchButton;
    }

    public void Elements(String arg) {
            List<WebElement> Elements = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
            for (int i = 0; i < Elements .size(); i++) {
                String Element = Elements .get(i).getText();
                String expetedResult = arg;
                String actualResult = Element;
                String actualResultLowerCase=actualResult.toLowerCase();
                System.out.println(actualResultLowerCase);
                Assert.assertEquals(actualResultLowerCase.contains(expetedResult),true);
            }

        }
        public WebElement clickOnProduct()
        {
            WebElement clickOnProduct=Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"]"));
            return clickOnProduct;
        }
       public void doAssertionWithSKU(String arg)
        {
           WebElement element= Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));
           String elementString=element.getText();
           String actualResult=elementString;
           String expectedResult=arg;
            Assert.assertEquals(actualResult.contains(expectedResult),true);

        }







}
