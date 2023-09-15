package page_objects;

import com.codeborne.selenide.Selenide;

@SuppressWarnings("UnusedReturnValue")
public class BrowserWindowsPage extends BasePage {


    public BrowserWindowsPage clickOnButtonNewTab() {
        browserWindowsPageLocators.getButtonNewTab().click();
        return this;
    }

    public BrowserWindowsPage closeNewTab() {
        Selenide.switchTo().window(1).close();
        Selenide.switchTo().window(0);
        return this;
    }

    public BrowserWindowsPage clickOnButtonNewWindow() {
        browserWindowsPageLocators.getButtonNewWindow().click();
        return this;
    }

    public BrowserWindowsPage closeNewWindow() {
        Selenide.switchTo().window(1).close();
        Selenide.switchTo().window(0);
        return this;
    }
}
