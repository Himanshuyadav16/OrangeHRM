package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    public String userName = ApplicationProperties.INSTANCE.getName();
    public String password = ApplicationProperties.INSTANCE.getPassword();

    @FindBy(name = "username")
    private WebElement loginUserName;
    @FindBy(name = "password")
    private WebElement loginPassword;
    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void login() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(3000);
        loginUserName.sendKeys(userName);
        Assert.assertEquals(true, loginUserName.isDisplayed());
        Assert.assertEquals("Admin", userName);
        loginPassword.sendKeys(password);
        Assert.assertEquals("admin123", password);
        Assert.assertEquals(true, loginPassword.isDisplayed());
        loginButton.click();
    }

}