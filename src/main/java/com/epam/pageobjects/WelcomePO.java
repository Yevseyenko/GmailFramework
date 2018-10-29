package com.epam.pageobjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePO extends BasePO {
    @FindBy(xpath = ("//*[@resource-id='com.google.android.gm:id/welcome_tour_got_it']"))
    public WebElement gotItBtn;
    @FindBy(xpath = ("//*[@resource-id='com.google.android.gm:id/setup_addresses_add_another']"))
    public WebElement addAnotherAdressBtn;
    @FindBy(xpath = ("//*[@resource-id='com.google.android.gm:id/google_option']"))
    public WebElement googleOptionRadioBtn;
    @FindBy(xpath = ("//*[@resource-id='com.google.android.gm:id/suw_navbar_next']"))
    public WebElement nextBtn;

    public WelcomePO(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnGotItBtn() {
        gotItBtn.click();
    }

    public void clickOnAddAnotherAdressBtn() {
        addAnotherAdressBtn.click();
    }

    public void clickOnGoogleOptionRadioBtn() {
        googleOptionRadioBtn.click();
    }

    public void clickNextBtn() {
        nextBtn.click();
    }

}
