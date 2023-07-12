package dialogs;

import com.codeborne.selenide.Condition;
import elements.UiElement;
import org.assertj.core.api.Assertions;

import static elements.PageElements.*;
import static elements.PageElements.CONFIRM_BUTTON;
import static elements.RandomElements.login;

public class EntranceInAccountDialog {
    public EntranceInAccountDialog(UiElement selector) {
    }

    public EntranceInAccountDialog checkNotError() {
        Assertions.assertThat(ERROR_MESSAGE_FIELD.get().getAttribute("innerText")).isEmpty();
        return this;
    }

    public EntranceInAccountDialog fillLoginForm() {
        LOGIN_FIELD.get().sendKeys(login());
        PASSWORD_FIELD.get().sendKeys(login());
        return this;
    }

    public EntranceInAccountDialog clickConfirmButtonInLoginForm() {
        CONFIRM_BUTTON.get().click();
        return this;
    }

    public void verifyError() {
        ENTRANCE_APP_PRELOADER.get().should(Condition.disappear);
        Assertions.assertThat(ERROR_MESSAGE_FIELD.get().getAttribute("innerText")).isNotEmpty();
    }
}
