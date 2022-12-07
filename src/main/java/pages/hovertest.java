package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class hovertest  {
    private WebDriver driver;
    public hovertest(WebDriver driver){
        this.driver = driver;
    }
    public boolean isCaptionDisplayed(WebElement cap ){
        return cap.isDisplayed();
    }
    private By boxCaption = By.className("figcaption");
    @Test
    public void testsuccesfullogin (){

        homepage hp=new homepage(driver);
        hp.hoverclick();
        for(char i='1';i<='3';i++) {
            Actions action = new Actions(driver);
            WebElement find = driver.findElement(By.xpath("(//div[contains(@class, 'figure')])[" + i + "]"));
            action.moveToElement(find).perform();
            WebElement caption = find.findElement(boxCaption);

            String gettitle = caption.findElement(By.tagName("h5")).getText();
            String getlinktesxt = caption.findElement(By.tagName("a")).getText();
            String getlink = caption.findElement(By.tagName("a")).getAttribute("href");

            assertTrue(isCaptionDisplayed(caption), "Caption not displayed");
            assertEquals(gettitle, "name: user"+i, "Caption title incorrect");
            assertEquals(getlinktesxt, "View profile", "Caption link text incorrect");
            assertTrue(getlink.endsWith("/users/"+i), "Link incorrect");
        }





        /*
        anther way to get the element
        private By figureBox = By.className("figure");
         WebElement figure = driver.findElements(figureBox).get(index - 1);
         Actions actions = new Actions(driver);
          actions.moveToElement(figure)
         */



    }
}
