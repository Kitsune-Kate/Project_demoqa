package page_objects;

import com.codeborne.selenide.Condition;
@SuppressWarnings("UnusedReturnValue")
public class ButtonsPage extends BasePage {
    public ButtonsPage clickOnButtonClickMe() {
        buttonsPageLocators.getButtonClickMe().click();
        return this;

    }

    public ButtonsPage checkDisplayedTextAfterClickMe(String expectedText) {
        buttonsPageLocators.getDynamicClickMessage().should(Condition.text(expectedText));
        return this;

    }

    public ButtonsPage clickOnButtonRightClickMe() {
        buttonsPageLocators.getButtonRightClickMe().contextClick();
        return this;

    }

    public ButtonsPage checkDisplayedTextAfterRightClickMe(String expectedText) {
        buttonsPageLocators.getRightClickMessage().should(Condition.text(expectedText));
        return this;

    }

    public ButtonsPage clickOnButtonDoubleClickMe() {
        buttonsPageLocators.getButtonDoubleClickMe().doubleClick();
        return this;

    }

    public ButtonsPage checkDisplayedTextAfterDoubleClickMe(String expectedText) {
        buttonsPageLocators.getDoubleClickMessage().should(Condition.text(expectedText));
        return this;

    }


}
