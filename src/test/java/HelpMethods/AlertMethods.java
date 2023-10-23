package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethods {

    private WebDriver driver;



    public AlertMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void alertOK(){
        Alert alertOk = this.driver.switchTo().alert();
        alertOk.accept();
    }
    public void alertOKCancel(){
        Alert alertOkCancel = this.driver.switchTo().alert();
        alertOkCancel.dismiss();
    }

    public void alertText(String value){
        Alert alertText = this.driver.switchTo().alert();
        alertText.sendKeys(value);
        alertText.accept();
    }

}
