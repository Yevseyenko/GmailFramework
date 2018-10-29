package com.epam;

import com.epam.businessobjects.LoginBO;
import com.epam.driver.DriverConfiguration;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailTest {
    private static final Logger log = Logger.getLogger(GmailTest.class);
    LoginBO loginBO;
    AppiumDriver driver;
    final String email = "surfakeemail@gmail.com";
    final String password = "Fake123456";

    @BeforeMethod
    public void start() {
        DriverConfiguration driverConfiguration = new DriverConfiguration();
        this.driver = driverConfiguration.configureDriver();
    }

    @Test
    public void testMail() {
        log.info("Test start");
        loginBO = new LoginBO(driver);
        log.info("Creating account");
        loginBO.creatingAccount();
        loginBO.enteringEmail(email);
        loginBO.enteringPassword(password);
        log.info("Verify if next Sign Button Exist");
        Assert.assertTrue(loginBO.nextSignButtonExist(), "Login successful");
        log.info("Test passed");
    }

    @AfterMethod
    public void finish() {
        driver.quit();
    }
}

