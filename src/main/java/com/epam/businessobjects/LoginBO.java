package com.epam.businessobjects;


import com.epam.driver.DriverConfiguration;
import com.epam.pageobjects.EmailPO;
import com.epam.pageobjects.PasswordPO;
import com.epam.pageobjects.WelcomePO;
import io.appium.java_client.AppiumDriver;

public class LoginBO {
    AppiumDriver driver;
    DriverConfiguration driverConfiguration;
    WelcomePO welcomePO;
    EmailPO emailPO;
    PasswordPO passwordPO;

    public LoginBO(AppiumDriver driver) {
        this.driver = driver;
        this.welcomePO = new WelcomePO(driver);
        this.emailPO = new EmailPO(driver);
        this.passwordPO = new PasswordPO(driver);

    }

    public LoginBO creatingAccount() {
        welcomePO.clickOnGotItBtn();
        welcomePO.clickOnAddAnotherAdressBtn();
        welcomePO.clickOnGoogleOptionRadioBtn();
        welcomePO.clickNextBtn();
        return new LoginBO(driver);
    }

    public LoginBO enteringEmail(String email) {
        emailPO.enterEmail(email, driver);
        emailPO.clickOnHeader();
        emailPO.clickNextBtn();
        return new LoginBO(driver);
    }

    public LoginBO enteringPassword(String password) {
        passwordPO.enterPassword(password, driver);
        passwordPO.clickOnHeader();
        passwordPO.clickNextBtn();
        return new LoginBO(driver);
    }

    public boolean nextSignButtonExist() {
        return passwordPO.nextClickButtonExist(driver);
    }
}
