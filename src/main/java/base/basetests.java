package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;
public class basetests {
    private WebDriver driver;
    protected homepage hp;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
         homepage hp = new homepage(driver);
    }
    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

}

