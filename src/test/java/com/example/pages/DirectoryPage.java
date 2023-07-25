package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DirectoryPage extends  BasePage{
    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement employeeName;

    @FindBy(className = "oxd-select-text-input")
    private List<WebElement> jobTitle;

    @FindBy(xpath = "//*[contains(text(),'Chief Financial Officer')]")
    private WebElement jobSelect;

    @FindBy(xpath = "//*[contains(text(),'New York Sales Office')]")
    private WebElement location;

    public DirectoryPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void directory() throws InterruptedException {
        Thread.sleep(3000);
        employeeName.sendKeys("userName");
        jobTitle.get(0).click();
        jobSelect.click();
        jobTitle.get(1).click();
        location.click();

    }


}
