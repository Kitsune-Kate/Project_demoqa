package page_objects;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class ButtonsPage extends BasePage {
    @Step("Нажать на кнопку 'Click me'")
    public ButtonsPage clickOnButtonClickMe() {
        buttonsPageLocators.getButtonClickMe().click();
        return this;

    }

    @Step("Проверить, что появился текст '{expectedText}'")
    public ButtonsPage checkDisplayedTextAfterClickMe(String expectedText) {
        buttonsPageLocators.getDynamicClickMessage().should(Condition.text(expectedText));
        return this;

    }

    @Step("Нажать на кнопку 'Right Click me'")
    public ButtonsPage clickOnButtonRightClickMe() {
        buttonsPageLocators.getButtonRightClickMe().contextClick();
        return this;

    }

    @Step("Проверить, что появился текст '{expectedText}'")
    public ButtonsPage checkDisplayedTextAfterRightClickMe(String expectedText) {
        buttonsPageLocators.getRightClickMessage().should(Condition.text(expectedText));
        return this;

    }

    @Step("Нажать на кнопку 'Double Click me'")
    public ButtonsPage clickOnButtonDoubleClickMe() {
        buttonsPageLocators.getButtonDoubleClickMe().doubleClick();
        return this;

    }

    @Step("Проверить, что появился текст '{expectedText}'")
    public ButtonsPage checkDisplayedTextAfterDoubleClickMe(String expectedText) {
        buttonsPageLocators.getDoubleClickMessage().should(Condition.text(expectedText));
        return this;

    }


}
