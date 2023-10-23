package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public ElementMethods elementMethods;

    public AlertMethods alertMethods;
    public WindowMethods windowMethods;

    public FrameMethods frameMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this); // Makes sure all @FindBys are initialized... this stands for this Page.
        elementMethods = new ElementMethods(driver);
        alertMethods = new AlertMethods(driver);
        windowMethods = new WindowMethods(driver);
        frameMethods = new FrameMethods(driver);
    }


}
