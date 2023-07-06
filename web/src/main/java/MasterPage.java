import elements.UiElement;
import org.assertj.core.api.Assertions;
import org.jetbrains.annotations.NotNull;

import static elements.PageElements.*;
import static elements.PageElements.DATE_PAGE;
import static elements.RandomElements.login;

public class MasterPage {

    public MasterPage onResultsPage() {
        RESULTS_BUTTON.get().click();
        return this;
    }

    public MasterPage selectDate() {
        CALENDAR_BUTTON.get().click();
        DATE.get().click();
        return this;
    }

    public void verifyDate() {
        System.out.println(DATE_PAGE.get().getAttribute("innerText"));
        Assertions.assertThat(DATE_PAGE.get().getAttribute("innerText")).isEqualTo(Parametrs.DATE_TEMPLATE);
    }

    public MasterPage clickSettingButton() {
        SETTINGS_BUTTON.get().click();
        return this;
    }

    public MasterPage selectTimeBelt() {
        TIME_BELT_BUTTON.get().click();
        UTC_ALGIRIA_BUTTON.get().click();
        return this;
    }

    public MasterPage saveTimeBelt() {
        SAVE_BUTTON.get().click();
        return this;
    }

    public void verifyTimeBelt() {
        System.out.println(UTC_TIME.get().getAttribute("innerText"));
        Assertions.assertThat(UTC_TIME.get().getAttribute("innerText")).contains("UTC +1");
    }

    public MasterPage onLinePage() {
        LINE_BUTTON.get().click();
        return this;
    }

    public MasterPage selectNBA() {
        NBA_WINNER_BUTTON_28_06_23.get().click();
        return this;
    }

    public void verifyEvensFavourites(@NotNull UiElement selectorTeamInFavorites, @NotNull UiElement selectorTeam) {
        System.out.println(selectorTeamInFavorites.get().getAttribute("href"));
        System.out.println(selectorTeam.get().getAttribute("href"));
        Assertions.assertThat(selectorTeamInFavorites.get().getAttribute("href"))
                .isEqualTo(selectorTeam.get().getAttribute("href"));

    }

    public void addTeamInFavouritesAndVerifyTeamInFavourites() {
        NBA_BOSTON_BUTTON.get().click();
        ELEMENT_STAR_FAVORITES.get().click();
        verifyEvensFavourites(BOSTON_IN_FAVOURITES, NBA_BOSTON_BUTTON);
    }

    public MasterPage clickLoginButton() {
        LOGIN_BUTTON.get().click();
        return this;
    }

    public MasterPage fillLoginForm() {
        LOGIN_FIELD.get().sendKeys(login());
        PASSWORD_FIELD.get().sendKeys(login());
        return this;
    }

    public MasterPage clickConfirmButtonInLoginForm() {
        CONFIRM_BUTTON.get().click();
        return this;
    }

    public void verifyError() {
        Assertions.assertThat(!(ERROR_MESSAGE_FIELD.get().getText().isEmpty()));
    }

    public MasterPage checkNotError() {
        Assertions.assertThat(ERROR_MESSAGE_FIELD.get().getText()).isEmpty();
        return this;
    }

}
