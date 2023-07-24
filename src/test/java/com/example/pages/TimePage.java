package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimePage extends BasePage {

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement employeeName;

    @FindBy(xpath = "//*[contains(span,'Project Info ')]")
    private WebElement projectInfo;

    @FindBy(xpath = "//*[contains(a,'Projects')]")
    private WebElement project;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    private WebElement customerName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    private WebElement  projectName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div/div[2]/div/div/input")
    private WebElement projectAdmin;

    public TimePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void timeSheet() throws InterruptedException {
        Thread.sleep(3000);
        employeeName.sendKeys("Charlie Carter");
        Thread.sleep(3000);
        projectInfo.click();
        project.click();
        Thread.sleep(3000);
        customerName.sendKeys("customerName");
        projectName.sendKeys("HealthCare");
        projectAdmin.sendKeys("user");
    }

}