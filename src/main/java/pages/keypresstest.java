package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class keypresstest {
    private WebDriver driver;
    public keypresstest(WebDriver driver){
        this.driver = driver;
    }
    @Test
    public void testsuccesfulkeypress (){

        homepage hp=new homepage(driver);
        hp.keypressclick();
        String pi_test=Keys.chord(Keys.SHIFT,"/"); //to press two keybtn in same time.
        driver.findElement(By.id("target")).sendKeys(pi_test);
        String re= driver.findElement(By.id("result")).getText();
        System.out.println(re);
//        assertEquals(re,"You entered: BACK_SPACE","invaliddddd");
//       assertTrue(driver.findElement(By.id("flash")).getText()
//                        .contains("You logged into a secure area!")
//                , "Alert text is incorrect");
    }
}
