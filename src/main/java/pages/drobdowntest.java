package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class drobdowntest {
    private WebDriver driver;
    public drobdowntest(WebDriver driver){
        this.driver = driver;
    }
    @Test
    public void testsuccesfuloption (){

        homepage hp=new homepage(driver);
        hp.Dropdownclick();

        Select se =new Select(driver.findElement(By.id("dropdown")));
        se.selectByVisibleText("Option 1");
        assertEquals(se.getAllSelectedOptions().size(),1,"incorrect chosee");
        System.out.println(se.getAllSelectedOptions());
        assertTrue(se.getAllSelectedOptions().contains("Option 1"),"Alert text is incorrect");//buggggg

    }
}
