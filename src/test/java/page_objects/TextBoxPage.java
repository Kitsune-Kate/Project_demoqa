package page_objects;

import com.codeborne.selenide.Condition;
import dto.UserData;

@SuppressWarnings("UnusedReturnValue")
public class TextBoxPage extends BasePage {
    public TextBoxPage fillAllFields(UserData userData) {
        textBoxPageLocators.getFullName().setValue(userData.getFullName());
        textBoxPageLocators.getEmail().setValue(userData.getEmail());
        textBoxPageLocators.getCurrentAddress().setValue(userData.getCurrentAddress());
        textBoxPageLocators.getPermanentAddress().setValue(userData.getPermanentAddress());
        return this;
    }

    public TextBoxPage clickOnSubmit() {
        textBoxPageLocators.getButtonSubmit().click();
        return this;
    }

    public TextBoxPage checkSavedDataInBlock(UserData userData) {
        textBoxPageLocators.getOutputName().should(Condition.text(userData.getFullName()));
        textBoxPageLocators.getOutputEmail().should(Condition.text(userData.getEmail()));
        textBoxPageLocators.getOutputCurrentAddress().should(Condition.text(userData.getCurrentAddress()));
        textBoxPageLocators.getOutputPermanentAddress().should(Condition.text(userData.getPermanentAddress()));
        return this;
    }


}
