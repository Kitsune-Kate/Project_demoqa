package page_objects;
@SuppressWarnings("UnusedReturnValue")
public class LeftPanel extends BasePage {
    public LeftPanel clickOnTextBox() {
        leftPanelLocators.getTextBox().click();
        return this;

    }

    public LeftPanel clickOnButtons() {
        leftPanelLocators.getButtons().click();
        return this;

    }

    public LeftPanel clickOnAlertsFrameWindows() {
        leftPanelLocators.getAlertsFrameWindows().scrollIntoView(true).click();
        return this;

    }

    public LeftPanel clickOnBrowserWindows() {
        leftPanelLocators.getBrowserWindows().click();
        return this;

    }

    public LeftPanel clickOnAlerts() {
        leftPanelLocators.getAlerts().click();
        return this;

    }


}
