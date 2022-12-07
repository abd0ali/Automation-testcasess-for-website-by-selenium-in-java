package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class navigate {
    private WebDriver driver;
    WebDriver.Navigation navi;

    public navigate(WebDriver driver) {
        this.driver = driver;
         navi = driver.navigate();
    }

    public void testsuccesfulnavigate() {
        homepage hp = new homepage(driver);
        hp.dynamicLoadingclick();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        navi.back();
        navi.refresh();
        navi.forward();
        navi.to("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.Navigation");


    }
}