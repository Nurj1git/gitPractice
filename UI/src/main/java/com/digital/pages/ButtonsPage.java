package com.digital.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ButtonsPage extends BasePage {
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;
    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;
    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickMe;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickText;
    @FindBy(id = "rightClickMessage")
    public WebElement rightClickText;
    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;

    public ButtonsPage clickDoubleBtn() {
        elementActions.doubleClick(doubleClickBtn);
        Assert.assertTrue(doubleClickText.getText().contains("You have done a double click"));
        return this;
    }

    public ButtonsPage clickRightBtn() {
        elementActions.rightClick(rightClickBtn);
        Assert.assertTrue(rightClickText.getText().contains("You have done a right click"));
        return this;
    }

    public ButtonsPage clickMe() {
        elementActions.clickTheButton(clickMe);
        Assert.assertTrue(dynamicClickMessage.getText().contains("You have done a dynamic click"));
        return this;
    }
}