package page_objects;

import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class LeftPanel extends BasePage {

    @Step("Нажать на 'Text Box'")
    public LeftPanel clickOnTextBox() {
        leftPanelLocators.getTextBox().click();
        return this;

    }

    @Step("Нажать на 'Buttons'")
    public LeftPanel clickOnButtons() {
        leftPanelLocators.getButtons().click();
        return this;

    }

    @Step("Нажать на 'Alerts, Frame & Windows'")
    public LeftPanel clickOnAlertsFrameWindows() {
        leftPanelLocators.getAlertsFrameWindows().scrollIntoView(true).click();
        return this;

    }

    @Step("Нажать на 'Browser Windows'")
    public LeftPanel clickOnBrowserWindows() {
        leftPanelLocators.getBrowserWindows().click();
        return this;

    }

    @Step("Нажать на 'Alerts'")
    public LeftPanel clickOnAlerts() {
        leftPanelLocators.getAlerts().click();
        return this;

    }


}
