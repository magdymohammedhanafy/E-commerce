package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class pomHover {
    int randomNo,randomNO1,randomNo2,randomNo3;
    public void selectOneOfMainCategeries()
    {
        List<WebElement> Categeries= Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        randomNo=new Random().nextInt(3);
        Actions action=new Actions(Hooks.driver);
        action.moveToElement(Categeries.get(randomNo)).perform();

        }

        public void selectSubCategoryAndDoAssertion()
        {
            if(randomNo==0)
            {
                List<WebElement> sub1= Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] li ul[class=\"sublist first-level\"] li a[href]"));
                int randomNo1=new Random().nextInt(3);
                Actions action1=new Actions(Hooks.driver);
                action1.moveToElement(sub1.get(randomNo1)).perform();
                String text1=sub1.get(randomNo1).getText();
                sub1.get(randomNo1).click();
                String text2 =Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1")).getText();
                String expectedResult =text1.toLowerCase();
                String actualResult =text2.toLowerCase();
                System.out.println(expectedResult);
                System.out.println(actualResult);
                Assert.assertEquals(actualResult.contains(expectedResult),true);
            }
            if(randomNo==1)
            {
                List<WebElement> sub2= Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] li ul[class=\"sublist first-level\"] li a[href]"));
                int randomNo2=new Random().nextInt(6);
                while((randomNo2<=2)||(randomNo2>=6))
                {
                    randomNo2=new Random().nextInt(6);
                }
                Actions action2=new Actions(Hooks.driver);
                action2.moveToElement(sub2.get(randomNo2)).perform();
                String text1=sub2.get(randomNo2).getText();
                sub2.get(randomNo2).click();
                String text2 =Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1")).getText();
                String expectedResult =text1.toLowerCase();
                String actualResult =text2.toLowerCase();
                System.out.println(expectedResult);
                System.out.println(actualResult);
                Assert.assertEquals(actualResult.contains(expectedResult),true);
            }
            if(randomNo==2)
            {
                List<WebElement> sub3= Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] li ul[class=\"sublist first-level\"] li a[href]"));
                int randomNo3=new Random().nextInt(9);
                while((randomNo3<=5))
                {
                    randomNo3=new Random().nextInt(9);
                }
                Actions action3=new Actions(Hooks.driver);
                action3.moveToElement(sub3.get(randomNo3)).perform();
                String text1=sub3.get(randomNo3).getText();
                sub3.get(randomNo3).click();
                String text2 =Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1")).getText();
                String expectedResult =text1.toLowerCase();
                String actualResult =text2.toLowerCase();
                System.out.println(expectedResult);
                System.out.println(actualResult);
                Assert.assertEquals(actualResult.contains(expectedResult),true);
            }
        }


    }

