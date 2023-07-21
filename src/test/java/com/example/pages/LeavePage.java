package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage extends BasePage{

    //@FindBy(className = "oxd-icon bi-calendar oxd-date-input-icon")
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/i")
    private WebElement fromDate;

    @FindBy(xpath = "//*[contains(text(),'Today')]")
    private WebElement todayDate;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")
    private WebElement leaveType;

    @FindBy(xpath = "//*[contains(text(),'CAN - Personal')]")
    private WebElement canPersonal;

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement employeeName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")
    private WebElement subUnit;

    @FindBy(xpath = "//*[contains(text(),'Administration')]")
    private WebElement administration;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/label/span")
    private WebElement includePassEmployees;

    public LeavePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void leaveList() throws InterruptedException {
        Thread.sleep(3000);
        fromDate.click();
        Thread.sleep(3000);
        todayDate.click();
        leaveType.click();
        canPersonal.click();
        employeeName.sendKeys("employeeName");
        subUnit.click();
        Thread.sleep(3000);
        administration.click();
        includePassEmployees.click();
    }


}
