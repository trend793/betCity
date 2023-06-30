import com.codeborne.selenide.Selenide;

public class BrowserManager {

    public static void openPage(String url) {
        Selenide.open(url);
    }
}
