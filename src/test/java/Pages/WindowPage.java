package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WindowPage extends BasePage{

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "analystic")
    private List<WebElement> windowListElement;

    @FindBy(css = "#Tabbed button")
    private WebElement tabOptionElement;

    @FindBy(css = "#Seperate>button")
    private WebElement windowOptionElement;

    @FindBy(css = "#Multiple>button")
    private WebElement windowMultipleOptionElement;

    public void interactSingleTab(){
        elementMethods.clickElement(windowListElement.get(0));
        System.out.println(driver.getTitle());
        elementMethods.clickElement(tabOptionElement);
        System.out.println(driver.getTitle());
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);
    }

    public void interactSingleWindow(){
        elementMethods.clickElement(windowListElement.get(1));
        System.out.println(driver.getTitle());
        elementMethods.clickElement(windowOptionElement);
        System.out.println(driver.getTitle());
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);
    }

    public void interactMultipleWindow(){
        elementMethods.clickElement(windowListElement.get(2));
        System.out.println(driver.getTitle());
        elementMethods.clickElement(windowMultipleOptionElement);
        System.out.println(driver.getTitle());
        windowMethods.moveFocusSpecificTab(2);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);
    }


}
