package com.example.testCases;

import com.example.BaseClass;
import com.example.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseClass {
    @Test
    public void loginPageTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        //driver.close();
    }

    @Test
    public void assignLeaveTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.assignLeave();
        //driver.close();
    }

    @Test
    public void adminTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.admin();
        AdminPage adminPage=new AdminPage(driver);
        adminPage.userManagement();

        //driver.close();
    }

    @Test
    public void pimTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.pim();
        PimPage pimPage=new PimPage(driver);
        pimPage.employeeInformation();
        //driver.close();
    }

    @Test
    public void leaveTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.leave();
        LeavePage leavePage =new LeavePage(driver);
        leavePage.leaveList();
        //driver.close();
    }

    @Test
    public void timeTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.time();
        TimePage timePage=new TimePage(driver);
        timePage.timeSheet();
        //driver.close();
    }

    @Test
    public void recruitmentTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.recruitment();
        RecruitmentPage recruitmentPage=new RecruitmentPage(driver);
        recruitmentPage.candidates();
        //driver.close();
    }

    @Test
    public void myInfoTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.myInfo();
        //driver.close();
    }

    @Test
    public void performanceTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.performance();
        //driver.close();
    }

    @Test
    public void directoryTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.directory();
        //driver.close();
    }

    @Test
    public void maintenanceTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.maintenance();
        //driver.close();
    }

    @Test
    public void claimTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.claim();
        //driver.close();
    }

    @Test
    public void buzzTest() throws InterruptedException {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        HomePage homePage = new HomePage(driver);
        homePage.buzz();
        //driver.close();
    }
}