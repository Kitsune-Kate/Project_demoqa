package page_objects;

import com.codeborne.selenide.Condition;
import dto.UserData;
import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class TextBoxPage extends BasePage {

    @Step("Заполнить поля Full Name: '{userData.fullName}', Email: '{userData.email}', Current Address: '{userData.currentAddress}', Permanent Address: '{userData.permanentAddress}'")
    public TextBoxPage fillAllFields(UserData userData) {
        textBoxPageLocators.getFullName().setValue(userData.getFullName());
        textBoxPageLocators.getEmail().setValue(userData.getEmail());
        textBoxPageLocators.getCurrentAddress().setValue(userData.getCurrentAddress());
        textBoxPageLocators.getPermanentAddress().setValue(userData.getPermanentAddress());
        return this;
    }

    @Step("Нажать на кнопку 'Submit'")
    public TextBoxPage clickOnSubmit() {
        textBoxPageLocators.getButtonSubmit().click();
        return this;
    }

    @Step("Проверить, что данные в блоке сохранены корректно")
    public TextBoxPage checkSavedDataInBlock(UserData userData) {
        textBoxPageLocators.getOutputName().should(Condition.text(userData.getFullName()));
        textBoxPageLocators.getOutputEmail().should(Condition.text(userData.getEmail()));
        textBoxPageLocators.getOutputCurrentAddress().should(Condition.text(userData.getCurrentAddress()));
        textBoxPageLocators.getOutputPermanentAddress().should(Condition.text(userData.getPermanentAddress()));
        return this;
    }


}
