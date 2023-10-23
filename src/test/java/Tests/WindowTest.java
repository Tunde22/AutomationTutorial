package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {

    @Test
    public void testMethod() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsentElement();
        registerPage.navigateToWindows();

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.interactSingleTab();
        windowPage.interactSingleWindow();
        windowPage.interactMultipleWindow();

    }
}
