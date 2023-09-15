package test;

import dto.UserData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DemoQATest extends BaseTest {

    UserData userData = new UserData("Kate Kitsune K", "kate@mail.ru", "Moscow,street Arbat", "Moscow,FirstStreet");

    @BeforeEach
    void setUp() {
        open("https://demoqa.com/");
    }

    @Test
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
