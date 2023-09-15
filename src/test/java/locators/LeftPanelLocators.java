package locators;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class LeftPanelLocators {
    private final SelenideElement textBox = $x("//span[text()='Text Box']");
    private final SelenideElement buttons = $x("//span[text()='Buttons']");
    private final SelenideElement alertsFrameWindows = $x("//div[text()='Alerts, Frame & Windows']/span");
    private final SelenideElement browserWindows = $x("//span[text()='Browser Windows']");
    private final SelenideElement alerts = $x("//span[text()='Alerts']");


}
