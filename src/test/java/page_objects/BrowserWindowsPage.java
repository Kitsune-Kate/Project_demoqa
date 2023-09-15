package page_objects;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class BrowserWindowsPage extends BasePage {

    @Step("Нажать на кнопку 'New Tab'")
    public BrowserWindowsPage clickOnButtonNewTab() {
        browserWindowsPageLocators.getButtonNewTab().click();
        return this;
    }

    @Step("Закрыть новую вкладку")
    public BrowserWindowsPage closeNewTab() {
        Selenide.switchTo().window(1).close();
        Selenide.switchTo().window(0);
        return this;
    }

    @Step("Нажать на кнопку 'New window'")
    public BrowserWindowsPage clickOnButtonNewWindow() {
        browserWindowsPageLocators.getButtonNewWindow().click();
        return this;
    }

    @Step("Закрыть новое окно")
    public BrowserWindowsPage closeNewWindow() {
        Selenide.switchTo().window(1).close();
        Selenide.switchTo().window(0);
        return this;
    }
}
