package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UiElement {
    private final By selector;

    public UiElement(By selector) {
        this.selector = selector;
    }

    public SelenideElement get() {
        return $(selector);
    }
}
