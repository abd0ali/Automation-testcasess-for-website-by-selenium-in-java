package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HorizontalSlidertest {
    private WebDriver driver;
    public HorizontalSlidertest(WebDriver driver){
        this.driver = driver;
    }
    @Test
    public void testsuccesfulHorizontalSlidertest (){

        homepage hp=new homepage(driver);
        hp.HorizontalSliderclick();
        WebElement w=driver.findElement(By.tagName("input"));
        w.click();
       
        while(!(driver.findElement(By.id("range")).getText()).equals("4")) {
            w.sendKeys(Keys.ARROW_RIGHT);
        }

    }
}
