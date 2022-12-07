package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class forgetpasswordtest {
    private WebDriver driver;
    public forgetpasswordtest(WebDriver driver){
        this.driver = driver;
    }
    @Test
    public void testsuccesfulforget (){

        homepage hp=new homepage(driver);
        hp.forgetpasswordclick();
        driver.findElement(By.id("email")).sendKeys("abdoali7j@gmail.com");
        driver.findElement(By.id("form_submit")).click();
        assertTrue(driver.findElement(By.cssSelector("h1")).getText()
                        .contains("Internal Server Error")
                , "Alert text is incorrect");
    }
}
