package page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import java.time.Duration;

@SuppressWarnings("UnusedReturnValue")
public class AlertsPage extends BasePage {
    public AlertsPage clickOnButtonClickMeToSeeAlert() {
        alertsPageLocators.getButtonAlertClickMe().click();
        return this;

    }

    public AlertsPage closeAlert() {
        Selenide.switchTo().alert(Duration.ofSeconds(5)).accept();
        return this;
    }

    public AlertsPage clickOnButtonClickMeToSeeTimerAlert() {
        alertsPageLocators.getButtonTimerAlertClickMe().click();
        return this;
    }

    public AlertsPage clickOnButtonClickMeToSeeConfirmBox() {
        alertsPageLocators.getButtonConfirmClickMe().click();
        return this;
    }

    public AlertsPage acceptConfirmBox() {
        Selenide.confirm();
        return this;
    }

    public AlertsPage checkDisplayedConfirmResultText(String expected) {
        alertsPageLocators.getTextConfirmResult().should(Condition.text(expected));
        return this;
    }

    public AlertsPage clickOnButtonClickMeToSeePrompt() {
        alertsPageLocators.getButtonPromptClickMe().click();
        return this;
    }

    public AlertsPage fillFieldPrompt(String name) {
        Selenide.prompt(name);
        return this;
    }

    public AlertsPage checkDisplayedPromptResultText(String expected) {
        alertsPageLocators.getTextPromptResult().should(Condition.text(expected));
        return this;
    }


}
