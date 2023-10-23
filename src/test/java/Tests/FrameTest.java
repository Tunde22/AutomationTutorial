package Tests;

import ObjectData.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks {

    @Test
    public void testMethod() {
        FrameObject frameObject = new FrameObject(propertyUtility.getAllData());

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSingIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.clickConsentElement();
        registerPage.navigateToFrames();

        FramePage framePage = new FramePage(getDriver());
        framePage.interactSingleFrame(frameObject);
        framePage.interactMultipleFrame(frameObject);

    }
}
