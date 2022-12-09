package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By CustomerLogin = By.xpath("//button[contains(text(),'Customer Login')]");

    public void clickOnCustomerLogin() {
        clickOnElement(CustomerLogin);
    }

    By yourname = By.xpath("//select[@id='userSelect']");

    public void clickOnyourname() {
        clickOnElement(yourname);
    }

    By RonWeasly = By.xpath("//option[contains(text(),'Ron Weasly')]");

    public void setSelectRonWeasly() {
        clickOnElement(RonWeasly);
    }

    By login = By.xpath("//button[contains(text(),'Login')]");

    public void clickOnLogin() {
        clickOnElement(login);
    }

    By welcomeText = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/strong[1]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    By setSelectaccount1008= By.xpath("//select[@id='accountSelect']");

   public String getaccount1008text() {
       return getTextFromElement(setSelectaccount1008);
   }
    By enteramount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");

    public void amountfield(String amount) {
        sendTextToElement(enteramount, "50");
    }

    By Transactions = By.xpath("//button[@ng-class='btnClass1']");

    public void clickOnTransactions() {
        clickOnElement(Transactions);
    }

    By Deposit = By.xpath("//button[@ng-class='btnClass2']");

    public void clickOnDeposit() {
        clickOnElement(Deposit);
    }

    By Withdrawl = By.xpath("//button[@ng-class='btnClass3']");

    public void clickOnWithdrawl() {
        clickOnElement(Withdrawl);
    }

    By Withdraw = By.xpath("//button[@type='submit']");

    public void click0nWithdraw() {
        clickOnElement(Withdraw);
    }

    By verifyMessage2 = By.xpath("//span[contains(text(),'Transaction successful')]");

    public String getverifyMesssage2() {
        return getTextFromElement(verifyMessage2);
    }

}

