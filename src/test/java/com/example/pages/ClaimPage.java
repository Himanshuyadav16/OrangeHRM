package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ClaimPage extends BasePage{
    @FindBy(css = "input[placeholder='Type for hints...']")
    private List<WebElement> employeeId;

    @FindBy(className = "oxd-select-text-input")
    private List<WebElement> eventName;

    @FindBy(xpath = "//*[contains(text(),'Medical Reimbursement')]")
    private WebElement selectEvent;

    @FindBy(xpath = "//*[contains(text(),'Initiated')]")
    private WebElement selectStatus;

    @FindBy(css = "input[placeholder='yyyy-mm-dd']")
    private List<WebElement> date;

    @FindBy(xpath = "//*[contains(text(),'Current and Past Employees')]")
    private WebElement include;

    public ClaimPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void employeeClaims() throws InterruptedException {
        Thread.sleep(3000);
        employeeId.get(0).sendKeys("userData");
        employeeId.get(1).sendKeys("123");
        eventName.get(0).click();
        selectEvent.click();
        eventName.get(1).click();
        selectStatus.click();
        date.get(0).sendKeys("2023-07-25");
        date.get(1).sendKeys("2023-08-25");
        eventName.get(2).click();
        include.click();

    }



}
