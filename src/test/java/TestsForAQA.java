import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static org.testng.Assert.*;

public class TestsForAQA {

    @Test
    public void openYandexMainPageTest(){
        HubFromAllTests start = new HubFromAllTests();
        start.getYandexPage().openBasePage();
        assertTrue(start.getYandexPage().yaLogo().shouldBe(Condition.visible).isDisplayed());
    }

    @Test
    public void searchYoutubeLinkTest(){
        HubFromAllTests start = new HubFromAllTests();
        start.getYandexPage().openBasePage();
        start.getYandexPage().clickOnInputField();
        start.getYandexPage().inputField().sendKeys("rickroll youtube original");
        start.getYandexPage().clickOnSearchButton();
        start.getYandexPage().rickRollOriginalLink().shouldBe(Condition.visible);
    }

    @Test
    public void clickOnYaLogoTest(){
        HubFromAllTests start = new HubFromAllTests();
        start.getYandexPage().openBasePage();
        start.getYandexPage().clickOnYaLogo();
        webdriver().shouldHave(urlContaining("https://ya.ru/"));
    }

    @Test
    public void clickBackButtonBrowserTest(){
        HubFromAllTests start = new HubFromAllTests();
        start.getYandexPage().openBasePage();
        start.getYandexPage().clickOnInputField();
        start.getYandexPage().inputField().sendKeys("тестовый текст");
        start.getYandexPage().clickOnSearchButton();
        Selenide.back();
        webdriver().shouldHave(urlContaining("https://ya.ru/"));
    }

    @Test
    public void checkTheCityNameAtTheBottomOfSearchFieldTest(){
        HubFromAllTests start = new HubFromAllTests();
        start.getYandexPage().openBasePage();
        assertTrue(start.getYandexPage().cityAtTheBottomOfSearchField().shouldHave(text("Москва")).isDisplayed());
    }
}
