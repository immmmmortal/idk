package com.cucumber.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By welcomeMessage = By.id("welcome-message");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAt() {
        return driver.getCurrentUrl().equals("http://localhost:7000/home") &&
                driver.findElement(welcomeMessage).getText().equals("Welcome to the Home Page!");
    }
}
