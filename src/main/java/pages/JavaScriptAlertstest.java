package pages;

import base.basetests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaScriptAlertstest extends basetests {
    private WebDriver driver;

    public JavaScriptAlertstest(WebDriver driver) {
        this.driver = driver;
    }

    public void clickforjsalert(WebDriver driver)
    {
        driver.findElement(By.xpath("(//button[text()='Click for JS Alert'])")).click();
        driver.switchTo().alert().accept();
        String teststring=driver.findElement(By.id("result")).getText();
        assertEquals(teststring,"You successfully clicked an alert","dont found text of alert");
    }
    public void clickforjsconfirm(WebDriver driver) {
        driver.findElement(By.xpath("(//button[text()='Click for JS Confirm'])")).click();
        String textofconfirm= driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        String teststring=driver.findElement(By.id("result")).getText();
        assertEquals(teststring,"You clicked: Cancel","dont found text of alert");
        assertEquals(textofconfirm,"I am a JS Confirm","dont found text of conifrem");}

    public void clickforjsprompt(WebDriver driver) {
        driver.findElement(By.xpath("(//button[text()='Click for JS Prompt'])")).click();
        String textofconfirm= "hi baby";
        driver.switchTo().alert().sendKeys(textofconfirm);
        driver.switchTo().alert().accept();
        String teststring=driver.findElement(By.id("result")).getText();
        assertEquals(teststring,"You entered: "+textofconfirm,"dont found text of alert");}

    @Test
    public void testsuccesfulJavaScriptAlerts() {

        homepage hp = new homepage(driver);
        hp.JavaScriptAlertsclick();
        //clickforjsalert(driver);
        //clickforjsconfirm(driver);
        clickforjsprompt(driver);
    }
}