package Tests;

import ObjectData.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {

    @Test
    public void testMethod() {
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsentElement();
        registerPage.navigateToAlerts();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interactOkAlert();
        alertPage.interactOkCancelAlert();
        alertPage.interactTextAlert(alertObject);

    }
}
