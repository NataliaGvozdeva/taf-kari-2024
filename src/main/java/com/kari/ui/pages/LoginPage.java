package com.kari.ui.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    public LoginPage() {
        this.driver = Driver.getDriver();
    }
    public static final String HEADING_INPUT_XPATH ="//h2/span[text()='Вход для зарегистрированных']";

    public static final String BUTTON_INPUT_XPATH ="//input[@value=\"Войти\"]";

    public static final String MESSAGE_ERROR_XPATH ="//div[@class=\"error\"]";

    public String getHeadingText() {
        return driver.findElement(By.xpath(HEADING_INPUT_XPATH)).getText();
    }

    public void clickButtonInput() {
        driver.findElement(By.xpath(BUTTON_INPUT_XPATH)).click();
    }

    public String getErrorText() {
        return driver.findElement(By.xpath(MESSAGE_ERROR_XPATH)).getText();
    }

}
