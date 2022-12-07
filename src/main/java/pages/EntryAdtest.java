package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EntryAdtest {
    private WebDriver driver;

    public EntryAdtest(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void testsuccesfulEntryAd() {
        homepage hp = new homepage(driver);
        hp.EntryAdtestclick();
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("hot-spot"))).perform();
        String message= driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        assertEquals(message, "You selected a context menu", "Popup message incorrect");

    }

}
