package test;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import page_objects.*;

import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.PageLoadStrategy.EAGER;


public class BaseTest {
    AlertsPage alertsPage = new AlertsPage();
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();
    ButtonsPage buttonsPage = new ButtonsPage();
    LeftPanel leftPanel = new LeftPanel();
    MainPage mainPage = new MainPage();
    TextBoxPage textBoxPage = new TextBoxPage();


    @BeforeAll
    static void beforeAll() {
        Configuration.browser = Browsers.CHROME;
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = EAGER.toString();
    }


    @Step("Перейти на '{url}'")
    public static void openUrl(String url) {
        open(url);
    }

}
