package com.selenium.instagram;

import com.selenium.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstagramSeleniumTesting {

    public static final String SEARCH_FIELD_LOGIN = "username";
    public static final String SEARCH_FIELD_PASSWORD = "password";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.instagram.com/");

        WebElement searchFieldLogin = driver.findElement(By.name(SEARCH_FIELD_LOGIN));
        searchFieldLogin.sendKeys("Login");

        WebElement searchFieldPassword = driver.findElement(By.name(SEARCH_FIELD_PASSWORD));
        searchFieldPassword.sendKeys("********");

    }
}
