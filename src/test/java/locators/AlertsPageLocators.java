package locators;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class AlertsPageLocators {
    private final SelenideElement buttonAlertClickMe = $("#alertButton");
    private final SelenideElement buttonTimerAlertClickMe = $("#timerAlertButton");
    private final SelenideElement buttonConfirmClickMe = $("#confirmButton");
    private final SelenideElement buttonPromptClickMe = $("#promtButton");
    private final SelenideElement textConfirmResult = $("#confirmResult");
    private final SelenideElement textPromptResult = $("#promptResult");
}
