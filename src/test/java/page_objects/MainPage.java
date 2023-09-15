package page_objects;

import io.qameta.allure.Step;

public class MainPage extends BasePage {

    @Step("Нажать на 'Elements'")
    public void clickOnElements() {
        mainPageLocators.getElements().click();
    }
}
