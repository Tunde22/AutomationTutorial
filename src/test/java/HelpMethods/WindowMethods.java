package HelpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    private WebDriver driver;

    public WindowMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void moveFocusSpecificTab(int index){
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(index));
        System.out.println(driver.getTitle());
    }

    public void closeCurrentTab(){
        driver.close();
    }
}
