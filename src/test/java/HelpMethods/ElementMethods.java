package HelpMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementMethods {

    private WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void moveToElement(WebElement element){
        Actions action = new Actions(this.driver);
        action.moveToElement(element).perform();
    }

    public void waitVisibleElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void fillElement(WebElement element,String text){
        waitVisibleElement(element);
        element.sendKeys(text);
    }

    public void validateTextElement(WebElement element, String expectedValue){
        waitVisibleElement(element);
        String actualValue = element.getText();
        Assert.assertEquals(actualValue,expectedValue);
    }

    public void selectByText(WebElement element,String text){
        Select skillsDropdown = new Select(element);
        skillsDropdown.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element,String text){
        Select skillsDropdown = new Select(element);
        skillsDropdown.selectByValue(text);
    }

    public void hitEnterOnElement(WebElement element){
        element.sendKeys(Keys.ENTER);
    }

}
