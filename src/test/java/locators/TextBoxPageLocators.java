package locators;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class TextBoxPageLocators {

    private final SelenideElement fullName = $x("//input[@id='userName']");
    private final SelenideElement email = $x("//input[@id='userEmail']");
    private final SelenideElement currentAddress = $x("//textarea[@id='currentAddress']");
    private final SelenideElement permanentAddress = $x("//textarea[@id='permanentAddress']");
    private final SelenideElement buttonSubmit = $x("//button[@id='submit']");
    private final SelenideElement outputName = $("#output #name");
    private final SelenideElement outputEmail = $("#output #email");
    private final SelenideElement outputCurrentAddress = $("#output #currentAddress");
    private final SelenideElement outputPermanentAddress = $("#output #permanentAddress");


}
