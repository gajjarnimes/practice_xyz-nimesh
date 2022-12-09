package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    Homepage hompage = new Homepage();
    BankManagerLoginPage bankManagerloginpage = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerloginpage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();



    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        hompage.clickOnBankManagerLogintab();
        bankManagerloginpage.clickOnAddCustomer();
        bankManagerloginpage.enterFirstName("Nash");
        bankManagerloginpage.enterLastName("Purohit");
        bankManagerloginpage.enterPostCode("Ha9 6pu");
        bankManagerloginpage.clickOnaddCustomer();
        bankManagerloginpage.isDisplayed();
        bankManagerloginpage.setAcceptAlert();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        hompage.clickOnBankManagerLogintab();
        openAccountPage.clickOnopenAccount();
        openAccountPage.clickOnCustomerName();
        openAccountPage.setSelectRoanWeasly();
        openAccountPage.clickOnCurrency();
        openAccountPage.setSelectCurrency();
        openAccountPage.clickOnProcess();
        openAccountPage.isDisplayed();
        openAccountPage.setAcceptAlert();

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        customerloginpage.clickOnCustomerLogin();
        customerloginpage.clickOnyourname();
        customerloginpage.setSelectRonWeasly();
        customerloginpage.clickOnLoginLink();
        customerloginpage.isDisplayed();
        customerloginpage.clickOnLogut();
        String expectedMessage = "Your Name:";
        String actualMessage = customerloginpage.getverifyMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Your Name:");

    }
    @Test
    public void customerShouldDepositMoneySuccessfully() {
        customersPage.clickOnCustomerLogin();
        customersPage.clickOnyourname();
        customersPage.setSelectRonWeasly();
        customersPage.clickOnLogin();
        customersPage.getWelcomeText();
        customersPage.getaccount1008text();
        customersPage.clickOnDeposit();
        customersPage.amountfield("100");
        customersPage.clickOnDeposittab();
        customersPage.getverifyMesssage1();
        String expectedMessage = "Deposit Successful";
        String actualMessage = customersPage.getverifyMesssage1();
        Assert.assertEquals(actualMessage, expectedMessage, "Deposit Successful");

    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        accountPage.clickOnCustomerLogin();
        accountPage.clickOnyourname();
        accountPage.setSelectRonWeasly();
        accountPage.clickOnLogin();
        accountPage.getWelcomeText();
        accountPage.getaccount1008text();
        accountPage.clickOnWithdrawl();
        accountPage.amountfield("50");
        accountPage.click0nWithdraw();
        accountPage.getverifyMesssage2();
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.getverifyMesssage2();
        Assert.assertEquals(actualMessage,expectedMessage,"Transaction successful");
    }
}
