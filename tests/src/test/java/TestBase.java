import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;

import static elements.PageElements.FIRST;

public class TestBase {
     WebBot web=new WebBot();
    @BeforeEach
    void openURL(){
        BrowserManager.openPage(Parametrs.URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        FIRST.get().click();
    }
}
