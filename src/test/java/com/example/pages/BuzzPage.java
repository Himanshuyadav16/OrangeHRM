package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPage extends BasePage{

    @FindBy(className = "oxd-buzz-post-input")
    private  WebElement feedBack;

    @FindBy(css = "button[type='submit']")
    private WebElement postButton;

    public BuzzPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void buzzNewsfeed() throws InterruptedException {
        Thread.sleep(3000);
        feedBack.sendKeys("posts are writing in this feed");
        postButton.click();
    }

}
