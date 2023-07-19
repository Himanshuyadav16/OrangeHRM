package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AdminPage extends BasePage{

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement userName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    private WebElement userRole;

    @FindBy(xpath =" //*[contains(text(),'Admin')]")
    private WebElement selectAdmin;

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement  employeeName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")
    private WebElement Status;

    @FindBy(xpath = "//*[contains(text(),'Disabled')]")
    private WebElement disable;

    @FindBy(css = "button[type='button']")
    private WebElement resetButton;

    public AdminPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void userManagement() throws InterruptedException {
        Thread.sleep(3000);
        userName.sendKeys("Cheeku");
        userRole.click();
        Thread.sleep(3000);
        selectAdmin.click();
        employeeName.sendKeys("Virat Kohli");
        Status.click();
        disable.click();
        Thread.sleep(10000);
        resetButton.click();

    }

}