package locators;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class MainPageLocators {
    private final SelenideElement elements = $x("//h5[text()='Elements']");

}
