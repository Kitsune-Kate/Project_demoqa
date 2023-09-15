package locators;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ButtonsPageLocators {
    private final SelenideElement buttonClickMe = $x("//button[text()='Click Me']");
    private final SelenideElement buttonRightClickMe = $x("//button[text()='Right Click Me']");
    private final SelenideElement buttonDoubleClickMe = $x("//button[text()='Double Click Me']");
    private final SelenideElement doubleClickMessage = $("#doubleClickMessage");
    private final SelenideElement dynamicClickMessage = $("#dynamicClickMessage");
    private final SelenideElement rightClickMessage = $("#rightClickMessage");


}
