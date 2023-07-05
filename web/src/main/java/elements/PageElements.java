package elements;

import org.openqa.selenium.By;

public class PageElements {
    public static final UiElement FIRST = new UiElement(By.cssSelector(".push-confirm__title span.icon_close"));
    public static final UiElement RESULTS_BUTTON = new UiElement(By.cssSelector("[href='/ru/results']"));
    public static final UiElement CALENDAR_BUTTON = new UiElement(By.cssSelector(".icon_calendar"));
    public static final UiElement DATA = new UiElement(By.cssSelector("[aria-label*=' 1,']:not(.nextMonthDay)"));
    public static final UiElement DATA_PAGE = new UiElement(By.cssSelector(".datepicker__current-date"));

    public static final UiElement SETTINGS_BUTTON = new UiElement(By.cssSelector(".sub-header__icon-settings"));
    public static final UiElement TIME_BELT_BUTTON = new UiElement(By.xpath("//*[contains(text(),'UTC +3:00 ')]/.."));
    //$x("//*[@class='select-element'][contains(text(), 'UTC')]/..")
    public static final UiElement UTC_ALGIRIA_BUTTON = new UiElement(By.xpath("//*[contains(text(),'UTC +1:00 ')]"));
    public static final UiElement SAVE_BUTTON = new UiElement(By.cssSelector(".settings-footer-button_save"));
    public static final UiElement UTC_TIME = new UiElement(By.cssSelector(".datetime"));

    public static final UiElement LINE_BUTTON = new UiElement(By.cssSelector("*[href='/ru/line']"));
    public static final UiElement NBA_WINNER_BUTTON_28_06_23 = new UiElement(By.cssSelector(".champs__champ-name[href='/ru/line/basketball/325']"));
    public static final UiElement NBA_DENVER_BUTTON = new UiElement(By.cssSelector("*[href='/ru/line/basketball/325/13507579']"));
    public static final UiElement NBA_BOSTON_BUTTON = new UiElement(By.cssSelector("*[href='/ru/line/basketball/325/13507553']"));
    public static final UiElement ELEMENT_STAR_FAVORITES = new UiElement(By.cssSelector(".line-event__favorites .icon.icon_favorites"));
    public static final UiElement DENVER_IN_FAVOURITES=new UiElement(By.cssSelector(".left-filter__item-name[href='/ru/line/basketball/325/13507579']"));
    public static final UiElement BOSTON_IN_FAVOURITES=new UiElement(By.cssSelector(".left-filter__item-name[href='/ru/line/basketball/325/13507553']"));

    public static final UiElement ERROR_MESSAGE_FIELD =new UiElement(By.cssSelector(".login-row__error"));
    public static final UiElement LOGIN_BUTTON =new UiElement(By.cssSelector("#authSignIn"));
    public static final UiElement CONFIRM_BUTTON =new UiElement(By.cssSelector("#loginBtnSignIn"));
    public static final UiElement LOGIN_FIELD=new UiElement(By.cssSelector("[name='login']"));
    public static final UiElement PASSWORD_FIELD=new UiElement(By.cssSelector("[name='pass']"));
}
