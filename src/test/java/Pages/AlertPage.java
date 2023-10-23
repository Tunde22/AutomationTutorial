package Pages;

import ObjectData.AlertObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "analystic")
    private List<WebElement> alertOptions;

    @FindBy(css = ".btn-danger")
    private WebElement buttonOKAlert;

    @FindBy(css = ".btn-primary")
    private WebElement buttonOKCancelAlert;

    @FindBy(css = ".btn-info")
    private WebElement buttonTextAlert;

    public void interactOkAlert(){
        elementMethods.clickElement(alertOptions.get(0));
        elementMethods.clickElement(buttonOKAlert);
        alertMethods.alertOK();
    }

    public void interactOkCancelAlert(){
        elementMethods.clickElement(alertOptions.get(1));
        elementMethods.clickElement(buttonOKCancelAlert);
        alertMethods.alertOKCancel();
    }

    public void interactTextAlert(AlertObject alertObject){
        elementMethods.clickElement(alertOptions.get(2));
        elementMethods.clickElement(buttonTextAlert);
        alertMethods.alertText(alertObject.getAlertText());
    }


}
