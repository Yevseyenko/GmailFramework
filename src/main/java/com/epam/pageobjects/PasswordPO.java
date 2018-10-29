package com.epam.pageobjects;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPO extends BasePO {
    private static final Logger log = Logger.getLogger(PasswordPO.class);
    @FindBy(xpath = ("//*[@class='android.widget.EditText']"))
    WebElement passwordLine;
    @FindBy(id = "headingText")
    WebElement headingLabel;
    @FindBy(id = "passwordNext")
    WebElement passwordNextBtn;
    @FindBy(id = "signinconsentNext")
    WebElement nextSignButtton;

    public PasswordPO(AppiumDriver driver) {
        super(driver);
    }

    public void enterPassword(String password, WebDriver driver) {
        log.info("Entering password" + password);
        waitForClickable(passwordLine, driver);
        passwordLine.sendKeys(password);
    }

    public void clickOnHeader() {
        headingLabel.click();
    }

    public void clickNextBtn() {
        passwordNextBtn.click();
    }

    public boolean nextClickButtonExist(WebDriver driver) {
        waitForVisibility(nextSignButtton, driver);
        if (nextSignButtton.isDisplayed()) {
            return true;
        } else
            return false;
    }
}
