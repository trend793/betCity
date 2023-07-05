import elements.PageElements;
import elements.UiElement;
import org.assertj.core.api.Assertions;
import org.jetbrains.annotations.NotNull;

import static elements.PageElements.*;
import static elements.PageElements.DATA_PAGE;

public class OnMasterPage {
    public OnMasterPage selectDate() {
        RESULTS_BUTTON.get().click();
        CALENDAR_BUTTON.get().click();
        DATA.get().click();
        return this;
    }

    public void verifyDate() {
        if (DATA_PAGE.get().getAttribute("innerText").equals("01.07"))
            System.out.println("correct");
        else System.out.println("not correct");
        System.out.println(DATA_PAGE.get().getAttribute("innerText"));
        Assertions.assertThat(DATA_PAGE.get().getAttribute("innerText")).isEqualTo("01.07.2023");
    }

    public OnMasterPage selectTimeBelt() {
        SETTINGS_BUTTON.get().click();
        TIME_BELT_BUTTON.get().click();
        UTC_ALGIRIA_BUTTON.get().click();
        return this;
    }

    public OnMasterPage saveTimeBelt() {
        SAVE_BUTTON.get().click();
        return this;
    }

    public void verifyTimeBelt() {
        System.out.println(UTC_TIME.get().getAttribute("innerText"));
        Assertions.assertThat(UTC_TIME.get().getAttribute("innerText")).contains("UTC +1");
    }

    public OnMasterPage selectEvents() {
        LINE_BUTTON.get().click();
        NBA_WINNER_BUTTON_28_06_23.get().click();
        return this;
    }

    public OnMasterPage selectEventTeam() {

        STAR_FAVORITES.get().click();
        return this;
    }

    public void verifyEvensFavourites(@NotNull UiElement selectorTeamInFavorites, @NotNull UiElement selectorTeam) {
        System.out.println(selectorTeamInFavorites.get().getAttribute("href"));
        System.out.println(selectorTeam.get().getAttribute("href"));
        Assertions.assertThat(selectorTeamInFavorites.get().getAttribute("href"))
                .isEqualTo(selectorTeam.get().getAttribute("href"));

    }

    public OnMasterPage clickLoginButton() {
        LOGIN_BUTTON.get().click();
        return this;
    }

    public OnMasterPage fillLoginForm() {

        String login = "ejkfjoipreijr";
        LOGIN_FIELD.get().sendKeys(login);
        PASSWORD_FIELD.get().sendKeys(login);
        return this;
    }
    public OnMasterPage clickConfirmButtonInLoginForm(){
        CONFIRM_BUTTON.get().click();
        return this;
    }


    public void verifyError() {
        Assertions.assertThat(LOGIN_ERROR.get().getText()).isNotEmpty();
    }

    public OnMasterPage checkNotError() {
        Assertions.assertThat(LOGIN_ERROR.get().getText()).isEmpty();
        return this;
    }
}
