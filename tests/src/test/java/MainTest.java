import elements.PageElements;
import org.junit.jupiter.api.Test;

public class MainTest extends TestBase {

    @Test
    void checkDateTest() {
        System.out.println("555");


        web.onMasterPage().selectDate().verifyDate();

        System.out.println("999");
    }
    @Test
    void checkTimeBeltTest(){

        web.onMasterPage().selectTimeBelt()
                .saveTimeBelt()
                .verifyTimeBelt();
    }
    @Test
    void checkEventsInFavourites(){

        web.onMasterPage().selectEvents().selectEventTeam()
                .verifyEvensFavourites(PageElements.DENVER_IN_FAVOURITES,PageElements.NBA_DENVER_BUTTON);
        web.onMasterPage().selectEvents().selectEventTeam()
                .verifyEvensFavourites(PageElements.BOSTON_IN_FAVOURITES,PageElements.NBA_BOSTON_BUTTON);

    }

    @Test
    void checkLoginAndPasswordField(){

        web.onMasterPage().clickLoginButton()
                .checkNotError()
                .fillLoginForm()
                .clickConfirmButtonInLoginForm()
                .verifyError();
    }
}
