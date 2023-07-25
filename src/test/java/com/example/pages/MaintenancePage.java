package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaintenancePage extends BasePage {

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private  WebElement confirmButton;

    public MaintenancePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void administrator() throws InterruptedException {
        Thread.sleep(3000);
        password.sendKeys("admin123");
        confirmButton.click();
    }


}
