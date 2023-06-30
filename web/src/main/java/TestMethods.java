import elements.PageElements;
import elements.UiElement;
import org.assertj.core.api.Assertions;

import static elements.PageElements.*;
import static elements.PageElements.DATA_PAGE;

public class TestMethods {
    public TestMethods selectDate() {
        RESULTS_BUTTON.get().click();
        CALENDAR_BUTTON.get().click();
        DATA.get().click();
        return this;
    }

    public void verifyDate() {
        if (DATA_PAGE.get().getAttribute("innerText").equals("01.06"))
            System.out.println("correct");
        else System.out.println("not correct");
        System.out.println(DATA_PAGE.get().getAttribute("innerText"));
        Assertions.assertThat(DATA_PAGE.get().getAttribute("innerText")).isEqualTo("01.06.2023");
    }

    public TestMethods selectTimeBelt() {
        SETTINGS_BUTTON.get().click();
        TIME_BELT_BUTTON.get().click();
        UTC_ALGIRIA_BUTTON.get().click();
        return this;
    }

    public TestMethods saveTimeBelt() {
        SAVE_BUTTON.get().click();
        return this;
    }

    public void verifyTimeBelt() {
        System.out.println(UTC_TIME.get().getAttribute("innerText"));
        Assertions.assertThat(UTC_TIME.get().getAttribute("innerText")).contains("UTC +1");
    }

    public TestMethods selectEvents() {
        LINE_BUTTON.get().click();
        NBA_WINNER_BUTTON_28_06_23.get().click();
        return this;
    }
    public TestMethods selectEventTeam(UiElement selectorTeam){
        selectorTeam.get().click();
        STAR_FAVORITES.get().click();
        return this;
    }
    public void verifyEvensFavourites(UiElement selectorTeamInFavorites, UiElement selectorTeam){
        System.out.println(selectorTeamInFavorites.get().getAttribute("href"));
        System.out.println(selectorTeam.get().getAttribute("href"));
        Assertions.assertThat(selectorTeamInFavorites.get().getAttribute("href"))
                .isEqualTo(selectorTeam.get().getAttribute("href"));

    }
}