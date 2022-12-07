package pages;

import base.basetests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class loginpagetest extends basetests {
    private WebDriver driver;
    public loginpagetest(WebDriver driver){
        this.driver = driver;
    }
    @Test
    public void testsuccesfullogin(){

        //homepage hp=new homepage(driver);
        //hp.loginpageclick();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("#login button")).click();
        assertTrue(driver.findElement(By.id("flash")).getText()
                        .contains("You logged into a secure area!")
                , "Alert text is incorrect");
    }
}
