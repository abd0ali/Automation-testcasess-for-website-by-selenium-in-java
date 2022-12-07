package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class dynamicLoading {
    private WebDriver driver;

    public dynamicLoading(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void testsuccesfuldynamicLoading() {
        homepage hp = new homepage(driver);
        hp.dynamicLoadingclick();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.cssSelector("div>button")).click();
          WebDriverWait wait=new WebDriverWait(driver,5);
          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
//        FluentWait wait =new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
        String s=   driver.findElement(By.id("finish")).getText();
        assertEquals(s,"Hello World!","inncorect text");

    }
}