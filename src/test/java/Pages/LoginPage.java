package Pages;

import Logger.LoggerUtility;
import ObjectData.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[placeholder='E mail")
    private WebElement emailElement;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordElement;
    @FindBy(id = "enterbtn")
    private WebElement enterBtnElement;
    @FindBy(id = "errormsg")
    private WebElement errorMsgElement;

    public void invalidLogin(LoginObject loginObject){
        elementMethods.fillElement(emailElement,loginObject.getEmail());
        LoggerUtility.infoTest("The user fills emailElement with the value: " + loginObject.getEmail());
        elementMethods.fillElement(passwordElement,loginObject.getPassword());
        LoggerUtility.infoTest("The user fills passwordElement with the value: " + loginObject.getPassword());
        elementMethods.clickElement(enterBtnElement);
        LoggerUtility.infoTest("The user clicked on the enterBtnElement");
        elementMethods.validateTextElement(errorMsgElement,loginObject.getErrorMessage());
        LoggerUtility.infoTest("The user validates errorMsgElement field to have value: " + loginObject.getErrorMessage());

    }


}
