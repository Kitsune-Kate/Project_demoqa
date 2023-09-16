package page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import java.time.Duration;

@SuppressWarnings("UnusedReturnValue")
public class AlertsPage extends BasePage {

    @Step("Нажать на кнопку 'Click me'  рядом с Click Button to see alert")
    public AlertsPage clickOnButtonClickMeToSeeAlert() {
        alertsPageLocators.getButtonAlertClickMe().click();
        return this;

    }

    @Step("Закрыть уведомление")
    public AlertsPage closeAlert() {
        Selenide.switchTo().alert(Duration.ofSeconds(5)).accept();
        return this;
    }

    @Step("Нажать на кнопку 'Click me'  рядом с On button click, alert will appear after 5 seconds")
    public AlertsPage clickOnButtonClickMeToSeeTimerAlert() {
        alertsPageLocators.getButtonTimerAlertClickMe().click();
        return this;
    }

    @Step("Нажать на кнопку 'Click me'  рядом с On button click, confirm box will appear")
    public AlertsPage clickOnButtonClickMeToSeeConfirmBox() {
        alertsPageLocators.getButtonConfirmClickMe().click();
        return this;
    }

    @Step("Нажать на кнопку 'Да' в уведомление")
    public AlertsPage acceptConfirmBox() {
        Selenide.confirm();
        return this;
    }

    @Step("Проверить, что появился текст '{expected}' ")
    public AlertsPage checkDisplayedConfirmResultText(String expected) {
        alertsPageLocators.getTextConfirmResult().should(Condition.text(expected));
        return this;
    }

    @Step("Нажать на кнопку «Click me»  рядом с On button click, prompt box will appear'")
    public AlertsPage clickOnButtonClickMeToSeePrompt() {
        alertsPageLocators.getButtonPromptClickMe().click();
        return this;
    }

    @Step("Заполнить поле в уведомление данными: '{name}'")
    public AlertsPage fillFieldPrompt(String name) {
        Selenide.prompt(name);
        return this;
    }

    @Step("Проверить, что появился текст '{expected}'")
    public AlertsPage checkDisplayedPromptResultText(String expected) {
        alertsPageLocators.getTextPromptResult().should(Condition.text(expected));
        return this;
    }


}
