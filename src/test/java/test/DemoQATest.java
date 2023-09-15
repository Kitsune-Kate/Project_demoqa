package test;

import dto.UserData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DemoQATest extends BaseTest {

    UserData userData = new UserData("Kate Kitsune K", "kate@mail.ru", "Moscow,street Arbat", "Moscow,FirstStreet");

    @BeforeEach
    void setUp() {
        openUrl("https://demoqa.com/");
    }

    @Test
    @DisplayName("Проверки demoqa.com")
    void checkMainPage() {
        mainPage
                .clickOnElements();
        leftPanel
                .clickOnTextBox();
        textBoxPage
                .fillAllFields(userData)
                .clickOnSubmit()
                .checkSavedDataInBlock(userData);
        leftPanel
                .clickOnButtons();
        buttonsPage
                .clickOnButtonClickMe()
                .checkDisplayedTextAfterClickMe("You have done a dynamic click")
                .clickOnButtonRightClickMe()
                .checkDisplayedTextAfterRightClickMe("You have done a right click")
                .clickOnButtonDoubleClickMe()
                .checkDisplayedTextAfterDoubleClickMe("You have done a double click");
        leftPanel
                .clickOnAlertsFrameWindows()
                .clickOnBrowserWindows();
        browserWindowsPage
                .clickOnButtonNewTab()
                .closeNewTab()
                .clickOnButtonNewWindow()
                .closeNewWindow();
        leftPanel
                .clickOnAlerts();
        alertsPage
                .clickOnButtonClickMeToSeeAlert()
                .closeAlert()
                .clickOnButtonClickMeToSeeTimerAlert()
                .closeAlert()
                .clickOnButtonClickMeToSeeConfirmBox()
                .acceptConfirmBox()
                .checkDisplayedConfirmResultText("You selected Ok")
                .clickOnButtonClickMeToSeePrompt()
                .fillFieldPrompt("Test name")
                .checkDisplayedPromptResultText("You entered Test name");

    }
}
