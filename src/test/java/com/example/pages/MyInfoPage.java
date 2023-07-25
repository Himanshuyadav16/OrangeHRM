package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyInfoPage extends BasePage {

    @FindBy(name = "firstName")
    private WebElement firstName;

    @FindBy(name = "middleName")
    private WebElement middleName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
    private WebElement nickName;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
    private WebElement employeeId;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
    private WebElement drivingLicense;

    @FindBy(css = "input[placeholder='yyyy-mm-dd']")
    private List<WebElement> date;

    @FindBy(className = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input")
    private WebElement  ssnNumber;

    @FindBy(className = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input")
    private WebElement sipNumber;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div")
    private  WebElement country;

    @FindBy(css = "div[clear='false']")
    private List<WebElement> nationality;

    public MyInfoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void personalDetails() throws InterruptedException {
        Thread.sleep(3000);
        firstName.clear();
        firstName.sendKeys("joe");
        middleName.clear();
        middleName.sendKeys("Root");
        lastName.clear();
        lastName.sendKeys("stokes");
        nickName.clear();
        nickName.sendKeys("ben");
        employeeId.clear();
        employeeId.sendKeys("89");
        drivingLicense.clear();
        drivingLicense.sendKeys("1234");
        date.get(0).sendKeys("2023-07-30");
        Thread.sleep(3000);
        country.click();
        nationality.get(1).click();
        date.get(1).sendKeys("2023-07-28");
    }

}