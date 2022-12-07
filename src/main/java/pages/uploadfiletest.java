package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class uploadfiletest {
    private WebDriver driver;

    public uploadfiletest(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void testsuccesfulkeypress() {

        homepage hp = new homepage(driver);
        hp.uploadfileclick();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Abdo Ali\\IdeaProjects\\untitled2\\resources\\chromedriver.exe");
        driver.findElement(By.id("file-submit")).click();
        driver.findElement(By.id("uploaded-files")).getText();
        assertEquals(driver.findElement(By.id("uploaded-files")).getText(),"chromedriver.exe","incorrect file");
    }
}