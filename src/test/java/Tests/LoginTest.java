package Tests;

import ObjectData.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class LoginTest extends Hooks { //Demo Automation Login page

    @Test
    public void testMethod(){

        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSingIn();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.invalidLogin(loginObject);

    }
}
