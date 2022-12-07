package pages;

import base.basetests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class homepage extends  basetests {
    private WebDriver driver;
    public homepage(WebDriver driver){
        this.driver = driver;
    }
    public void loginpageclick(){
        driver.findElement(By.linkText("Form Authentication")).click();

    }
    public void Dropdownclick(){
        driver.findElement(By.linkText("Dropdown")).click();
    }
    public void forgetpasswordclick(){
        driver.findElement(By.linkText("Forgot Password")).click();
    }
    public void hoverclick(){
        driver.findElement(By.linkText("Hovers")).click();
    }
    public void keypressclick(){
        driver.findElement(By.linkText("Key Presses")).click();
    }
    public void HorizontalSliderclick(){
        driver.findElement(By.linkText("Horizontal Slider")).click();
    }
    public void JavaScriptAlertsclick(){
        driver.findElement(By.linkText("JavaScript Alerts")).click();
    }

    public void uploadfileclick(){
        driver.findElement(By.linkText("File Upload")).click();
    }
    public void EntryAdtestclick(){
        driver.findElement(By.linkText("Context Menu")).click();
    }
    public void WYSIWYGEditorclick(){
        driver.findElement(By.linkText("WYSIWYG Editor")).click();
    }
    public void dynamicLoadingclick(){driver.findElement(By.linkText("Dynamic Loading")).click();
    }



}
