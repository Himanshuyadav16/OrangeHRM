package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends BasePage {

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement employeeName;

    //@FindBy(className = "oxd-input--active" )
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement employeeId;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    private WebElement employeeStatus;

    // @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    @FindBy(xpath = "//*[contains(text(),'Freelance')]")
    private WebElement freelance;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")
    private WebElement include;

    @FindBy(xpath = "//*[contains(text(),'Current and Past Employees')]")
    private WebElement currentPastEmployees;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")
    private WebElement supervisorName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]")
    private WebElement jobTitle;

    @FindBy(xpath = "//*[contains(text(),'Account Assistant')]")
    private WebElement accountAssistant;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[1]")
    private WebElement subUnit;

    @FindBy(xpath = "//*[contains(text(),'Administration')]")
    private WebElement administration;

    @FindBy(css = "button[type='button']")
    private WebElement resetButton;

    public PimPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void employeeInformation() throws InterruptedException {
        Thread.sleep(2000);
        employeeName.sendKeys("EmployeeName");
        employeeId.sendKeys("1002");
        employeeStatus.click();
        Thread.sleep(3000);
        freelance.click();
        include.click();
        currentPastEmployees.click();
        supervisorName.sendKeys("SupervisorName");
        jobTitle.click();
        accountAssistant.click();
        subUnit.click();
        Thread.sleep(3000);
        administration.click();
        Thread.sleep(3000);
        resetButton.click();
        //driver.close();
    }
}