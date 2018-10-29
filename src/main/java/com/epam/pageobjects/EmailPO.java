package com.epam.pageobjects;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EmailPO extends BasePO {
    private static final Logger log = Logger.getLogger(EmailPO.class);
    @FindBy(id = "identifierId")
    WebElement emailLine;
    @FindBy(id = "headingText")
    WebElement headingText;
    @FindBy(id = "identifierNext")
    WebElement nextBtn;

    public EmailPO(AppiumDriver driver) {
        super(driver);
    }

    public void enterEmail(String email, WebDriver driver) {
        log.info("Entering email" + email);
        waitForClickable(emailLine, driver);
        emailLine.sendKeys(email);
    }

    public void clickOnHeader() {
        headingText.click();
    }

    public void clickNextBtn() {
        nextBtn.click();
    }
}
