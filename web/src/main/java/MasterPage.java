import elements.UiElement;
import org.assertj.core.api.Assertions;
import org.jetbrains.annotations.NotNull;

import static elements.PageElements.*;
import static elements.PageElements.DATE_PAGE;

public class MasterPage {

    public MasterPage clickResultsButton() {
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

    public MasterPage clickLineButton() {
        LINE_BUTTON.get().click();
        return this;
    }

    public MasterPage selectNBA() {
        NBA_WINNER_BUTTON.get().click(); //28/06/23
        return this;
    }

    public void verifyEvensFavourites(@NotNull UiElement selectorTeamInFavorites, @NotNull UiElement selectorTeam) {
        Assertions.assertThat(selectorTeamInFavorites.get().getAttribute("href"))
                .isEqualTo(selectorTeam.get().getAttribute("href"));
    }

    public void addAndVerifyTeamInFavourites() {
        NBA_BOSTON_BUTTON.get().click();
        ELEMENT_STAR_FAVORITES.get().click();
        verifyEvensFavourites(BOSTON_IN_FAVOURITES, NBA_BOSTON_BUTTON);
    }

    public MasterPage clickLoginButton() {
        LOGIN_BUTTON.get().click();
        return this;
    }
}
