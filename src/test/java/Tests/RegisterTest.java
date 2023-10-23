package Tests;

import ObjectData.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class RegisterTest extends Hooks {

    @Test
    public void testMethod() {

        RegisterObject registerObject = new RegisterObject(propertyUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsentElement();
        registerPage.fillRegisterFields(registerObject);

    }
}
