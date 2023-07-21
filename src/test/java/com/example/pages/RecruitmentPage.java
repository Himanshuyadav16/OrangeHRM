package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RecruitmentPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(),'Vacancies')]")
    private WebElement vacancies;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div")
    private WebElement jobTitle;

    @FindBy(xpath = "//*[contains(text(),'Chief Executive Officer')]")
    private WebElement chiefExecutiveOfficer;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
     private WebElement  vacancy;

    @FindBy(xpath = "//*[contains(text(),'Associate IT Manager')]")
    private WebElement associateITManager;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    private WebElement hiringManager;

    @FindBy(xpath = "//*[contains(text(),'Odis Adalwin')]")
    private WebElement odisAdalwin;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div")
    private WebElement status;

    @FindBy(xpath = "//*[contains(text(),'Active')]")
    private WebElement active;

    @FindBy(tagName = "h5")
    private WebElement vacancyText;

    public RecruitmentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void candidates() throws InterruptedException {
        Thread.sleep(3000);

        assertThat(vacancyText.getText(),is("Candidates"));

        vacancies.click();
        Thread.sleep(3000);
        jobTitle.click();
        chiefExecutiveOfficer.click();
        vacancy.click();
        associateITManager.click();
        hiringManager.click();
        odisAdalwin.click();
        status.click();
        active.click();
    }

}