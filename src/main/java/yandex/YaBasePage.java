package yandex;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class YaBasePage {

    public final String BASE_URL = "https://ya.ru/";

    public SelenideElement yaLogo(){
        return $(".home-link2.headline__logo");
    }

    public SelenideElement inputField(){
        return $(".search3__input.mini-suggest__input");
    }

    public SelenideElement rickRollOriginalLink(){
        return $(".OrganicTitle-LinkText.Typo.Typo_text_l.Typo_line_m.organic__url-text");
    }

    public SelenideElement searchButton(){
        return $x("//*[contains(text(),'Найти')]");
    }

    public SelenideElement cityAtTheBottomOfSearchField(){
        return $x("//div[2]/div/a[3]");
    }

    public void openBasePage(){
        open(BASE_URL);
    }

    public void clickOnInputField(){
        inputField().click();
    }

    public void clickOnRickRollLink(){
        rickRollOriginalLink().click();
    }

    public void clickOnSearchButton(){
        searchButton().click();
    }

    public void clickOnYaLogo(){
        yaLogo().click();
    }
}
