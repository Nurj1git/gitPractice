package com.digital.pages;

import com.digital.driver.Driver;
import com.digital.helper.AlertHelper;
import com.digital.helper.ElementActions;
import com.digital.helper.FrameHelper;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

   public ElementActions elementActions = new ElementActions();
    public AlertHelper alertHelper = new AlertHelper();
    public FrameHelper frameHelper = new FrameHelper();

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
