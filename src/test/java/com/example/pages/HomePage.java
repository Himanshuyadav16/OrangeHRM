package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(css = "button[title='Assign Leave']")
    private WebElement assignButton;

    @FindBy(xpath = "//*[contains(span,'Admin')]")
    private WebElement admin;

    @FindBy(xpath = "//*[contains(span,'PIM')]")
    private WebElement pim;

    @FindBy(xpath = "//*[contains(span,'Leave')]")
    private WebElement leave;

    @FindBy(xpath = "//*[contains(span,'Time')]")
    private WebElement time;

    @FindBy(xpath = "//*[contains(span,'Recruitment')]")
    private WebElement recruitment;

    @FindBy(xpath = "//*[contains(span,'My Info')]")
    private WebElement myInfo;

    @FindBy(xpath = "//*[contains(span,'Performance')]")
    private WebElement performance;


    @FindBy(xpath = "//*[contains(span,'Directory')]")
    private WebElement directory;

    @FindBy(xpath = "//*[contains(span,'Maintenance')]")
    private WebElement maintenance;

    @FindBy(xpath = "//*[contains(span,'Claim')]")
    private WebElement claim;

    @FindBy(xpath = "//*[contains(span,'Buzz')]")
    private WebElement buzz;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void assignLeave() throws InterruptedException {
        Thread.sleep(3000);
        assignButton.click();
    }

    public void admin() throws InterruptedException {
        Thread.sleep(3000);
        admin.click();
    }

    public void pim() throws InterruptedException {
        Thread.sleep(3000);
        pim.click();
    }

    public void leave() throws InterruptedException {
        Thread.sleep(3000);
        leave.click();
    }

    public void time() throws InterruptedException {
        Thread.sleep(3000);
        time.click();
    }

    public void recruitment() throws InterruptedException {
        Thread.sleep(3000);
        recruitment.click();
    }

    public void myInfo() throws InterruptedException {
        Thread.sleep(3000);
        myInfo.click();
    }

    public void performance() throws InterruptedException {
        Thread.sleep(3000);
        performance.click();
    }

    public void directory() throws InterruptedException {
        Thread.sleep(3000);
        directory.click();
    }

    public void maintenance() throws InterruptedException {
        Thread.sleep(3000);
        maintenance.click();
    }

    public void claim() throws InterruptedException {
        Thread.sleep(3000);
        claim.click();
    }

    public void buzz() throws InterruptedException {
        Thread.sleep(3000);
        buzz.click();
    }
}