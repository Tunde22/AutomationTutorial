package SharedData;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;

    public void initiateDriver(){
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Index.html");

        //Bring Browser controlled by Selenium to the desktop
        Point otherDesktopPoint = new Point(2000,0);
        driver.manage().window().setPosition(otherDesktopPoint);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//10 seconds to indentify elements
    }

    public void closeDriver(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
