package locators;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class BrowserWindowsPageLocators {

    private final SelenideElement buttonNewTab = $x("//button[@id='tabButton']");
    private final SelenideElement buttonNewWindow = $x("//button[@id='windowButton']");


}
