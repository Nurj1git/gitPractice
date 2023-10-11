package com.digital.homeWork;

import com.digital.helper.FrameHelper;
import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NestedFramesPage extends BasePage {
    @FindBy(id = "frame1")
    public WebElement Frame1;
    @FindBy(xpath= "//*[text() = 'Parent frame']")
    public WebElement Frametxt1;
    @FindBy(xpath= "//*[text() = 'Child Iframe']")
    public WebElement Frametxt2;
    @FindBy(xpath= "//*[text() = 'Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.']")
    public WebElement Frametxt3;



    public NestedFramesPage switchToSwitch(){
        frameHelper.switchToFrameWebElement(Frame1);
        Assert.assertTrue(Frametxt1.getText().contains("Parent frame"));
        System.out.println(Frametxt1.getText());
        frameHelper.switchToFrameWithIndex(0);
        Assert.assertTrue(Frametxt2.getText().contains("Child Iframe"));

        frameHelper.switchToDefaultContent();
        Assert.assertTrue(Frametxt3.getText().contains( "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame"));
        System.out.println(Frametxt3.getText());
//        Assert.assertEquals(Frametxt2, "Child Iframe");
        return this;
    }

}
