import org.junit.jupiter.api.Test;

public class MainTest extends TestBase {

    @Test
    void checkDateTest() {
        web.onMasterPage().clickResultsButton()
                .selectDate()
                .verifyDate();
    }

    @Test
    void checkTimeBeltTest() {
        web.onMasterPage().clickSettingButton()
                .selectTimeBelt()
                .saveTimeBelt()
                .verifyTimeBelt();
    }

    @Test
    void checkEventsInFavourites() {
        web.onMasterPage().clickLineButton()
                .selectNBA()
                .addAndVerifyTeamInFavourites();
    }

    @Test
    void checkLoginAndPasswordField() {
        web.onMasterPage().clickLoginButton();
        web.entranceInAccountDialog().checkNotError()
                .fillLoginForm()
                .clickConfirmButtonInLoginForm()
                .verifyError();
    }
}
