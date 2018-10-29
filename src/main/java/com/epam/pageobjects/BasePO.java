package com.epam.pageobjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePO {
    BasePO (AppiumDriver driver){
        PageFactory.initElements(driver,this);
    }
    void waitForClickable(WebElement element, WebDriver driver) {
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(element));
    }
 void waitForVisibility(WebElement element, WebDriver driver) throws Error {
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(element));
    }
}
