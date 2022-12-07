package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WYSIWYGEditor {
    private WebDriver driver;

    public WYSIWYGEditor(WebDriver driver) {
        this.driver = driver;
    }

    public void switchtoframe(){
        driver.switchTo().frame("mce_0_ifr");//go to aframe.
    }
    public void backfromframe(){
        driver.switchTo().parentFrame();//getout from the frame.
    }
    @Test
    public void testsuccesfulWYSIWYGEditor() {
        homepage hp = new homepage(driver);
        hp.WYSIWYGEditorclick();
        switchtoframe();
        driver.findElement(By.id("tinymce")).clear();//get the text from the frame.
        backfromframe();
        switchtoframe();
        driver.findElement(By.id("tinymce")).sendKeys("hello");//get the text from the frame.
        backfromframe();
        driver.findElement(By.xpath("//button[contains(@title,'Increase indent')]")).click();
        switchtoframe();
        driver.findElement(By.id("tinymce")).sendKeys("world");//get the text from the frame.
        backfromframe();
        switchtoframe();
        String T=  driver.findElement(By.id("tinymce")).getText();//get the text from the frame.
        backfromframe();
        assertEquals(T,"helloworld","INCORRECT TEXT");


    }
}
