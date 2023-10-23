package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage{
    public IndexPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "btn1")
    private WebElement signInElement;

    @FindBy(id = "btn2")
    private WebElement skipSignInElement;

    public void clickSingIn(){
        elementMethods.clickElement(signInElement);
        LoggerUtility.infoTest("The user clicked on the signInElement");
    }

    public void clickSkipSingIn(){
        elementMethods.clickElement(skipSignInElement);
    }





}
