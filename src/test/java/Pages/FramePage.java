package Pages;

import Logger.LoggerUtility;
import ObjectData.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "analystic")
    private List<WebElement> frameOptions;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputSingleElement;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputMultipleElement;

    public void interactSingleFrame(FrameObject frameObject){
        elementMethods.clickElement(frameOptions.get(0));
        LoggerUtility.infoTest("User clicks on fisrt Frame option");
        frameMethods.switchToFrame("singleframe");
        LoggerUtility.infoTest("User moves focus to Single Frame");
        elementMethods.fillElement(inputSingleElement,frameObject.getSingleIFrame());
        LoggerUtility.infoTest("User fills the first text box");
        frameMethods.switchToDefaultFrame();
        LoggerUtility.infoTest("User moves focus to Default Frame");
    }

    public void interactMultipleFrame(FrameObject frameObject){
        elementMethods.clickElement(frameOptions.get(1));
        LoggerUtility.infoTest("User clicks on second Frame option");
        frameMethods.switchToFrame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        LoggerUtility.infoTest("User moves focus to Multiple iFrame");
        frameMethods.switchToFrame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        LoggerUtility.infoTest("User moves focus to Single iFrame");
        elementMethods.fillElement(inputMultipleElement,frameObject.getMultipleIFrame());
        LoggerUtility.infoTest("User fills the second text box");

    }


}
