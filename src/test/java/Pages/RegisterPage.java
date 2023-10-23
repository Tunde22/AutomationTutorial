package Pages;

import Logger.LoggerUtility;
import ObjectData.RegisterObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[text()='Consent']")
    private WebElement consentElement;
    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement switchToElement;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertElement;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement frameElement;

    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowElement;

    @FindBy(css = "input[placeholder='First Name']")
    private WebElement firstNameElement;

    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameElement;

    @FindBy(css = "textarea[ng-model='Adress']")
    private WebElement addressElement;

    @FindBy(css = "input[ng-model='EmailAdress']")
    private WebElement emailElement;

    @FindBy(css = "input[ng-model='Phone']")
    private WebElement phoneElement;

    @FindBy(css = "input[value='Male']")
    private WebElement maleElement;

    @FindBy(css = "input[value='FeMale']")
    private WebElement femaleElement;

    @FindBy(css = "input[type='checkbox']")
    private List<WebElement> hobbyOptions;

    @FindBy(id = "msdd")
    private WebElement languageElement;

    @FindBy(css = ".ui-corner-all")
    private List<WebElement> languageElements;

    @FindBy(id = "Skills")
    private WebElement skillsElement;

    @FindBy(className = "select2-selection__arrow")
    private WebElement countryElement;

    @FindBy(className = "select2-search__field")
    private WebElement countryInputElement;

    @FindBy(id = "yearbox")
    private WebElement yearElement;

    @FindBy(css = "select[ng-model='monthbox']")
    private WebElement monthElement;

    @FindBy(id = "daybox")
    private WebElement dayElement;


    public void navigateToAlerts(){
        elementMethods.moveToElement(switchToElement);
        LoggerUtility.infoTest("User moves focus to Alerts");
        elementMethods.clickElement(alertElement);
        LoggerUtility.infoTest("User clicks on Alert element");
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
        LoggerUtility.infoTest("User navigates to Alerts page");
    }

    public void navigateToFrames(){
        elementMethods.moveToElement(switchToElement);
        LoggerUtility.infoTest("User moves focus to Frames");
        elementMethods.clickElement(frameElement);
        LoggerUtility.infoTest("User clicks on Frames element");
        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
        LoggerUtility.infoTest("User navigates to Frames page");

    }

    public void navigateToWindows(){
        elementMethods.moveToElement(switchToElement);
        LoggerUtility.infoTest("User moves focus to Windows");
        elementMethods.clickElement(windowElement);
        LoggerUtility.infoTest("User clicks on Windows element");
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");
        LoggerUtility.infoTest("User navigates to Windows page");

    }

    public void fillRegisterFields(RegisterObject registerObject){//until Date of Birth
        elementMethods.fillElement(firstNameElement,registerObject.getFirstName());
        elementMethods.fillElement(lastNameElement,registerObject.getLastName());
        elementMethods.fillElement(addressElement,registerObject.getAddress());
        elementMethods.fillElement(emailElement,registerObject.getEmail());
        elementMethods.fillElement(phoneElement,registerObject.getPhoneNumber());

        if(maleElement.getText().equals(registerObject.getGender())){
            elementMethods.clickElement(maleElement);
        }
        else {
            elementMethods.clickElement(femaleElement);
        }

        for (WebElement hobbyOption : hobbyOptions) {
            if (registerObject.getHobbyValues().contains(hobbyOption.getText())) {
                elementMethods.clickElement(hobbyOption);
            }
        }

        elementMethods.clickElement(languageElement);
        for (WebElement element : languageElements) {
            if (registerObject.getLanguageValues().contains(element.getText())) {
                elementMethods.clickElement(element);
            }
        }

        elementMethods.clickElement(femaleElement);

        elementMethods.selectByText(skillsElement,registerObject.getSkills());

        elementMethods.clickElement(countryElement);
        elementMethods.fillElement(countryInputElement,registerObject.getCountry());
        //countryInputElement.sendKeys(Keys.ENTER);
        elementMethods.hitEnterOnElement(countryInputElement);

        elementMethods.selectByValue(yearElement,registerObject.getYear());
        elementMethods.selectByText(monthElement,registerObject.getMonth());
        elementMethods.selectByValue(dayElement,registerObject.getDay());

    }

    public void clickConsentElement(){
        elementMethods.clickElement(consentElement);
        LoggerUtility.infoTest("User clicks on consentElement");
    }

}
