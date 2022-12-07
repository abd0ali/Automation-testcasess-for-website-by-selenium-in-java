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

//        WebElement searchInput = driver.findElement(By.name("q"));
//        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//        wait();
//        WebElement searchInput = driver.findElement(By.name("q"));
//
//        searchInput.sendKeys("giant panda");
//        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
//
//        searchButton.click();
//        List<WebElement> resultLinks = driver.findElements(By.cssSelector("div.results_links_deep a.result__a"));
//
//       // wait.until(ExpectedConditions.titleContains("giant panda"));
//      //  wait.until(ExpectedConditions.titleContains("giant panda"));
//
//      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.results_links_deep a.result__a")));
//
//        for (WebElement link : resultLinks) {
//            assertTrue(link.getText().matches("(?i).*panda.*"));
//        }

//            driver.get("https://the-internet.herokuapp.com/");
//                    driver.manage().window().maximize();
//                    System.out.println(driver.getTitle());
//                    WebElement A= driver.findElement(By.linkText("Shifting Content"));
//                    A.click();
//                    WebElement B= driver.findElement(By.linkText("Example 1: Menu Element"));
//                    B.click();
//                    List<WebElement>links = driver.findElements(By.cssSelector("ul > li"));
//        System.out.println(links.size());