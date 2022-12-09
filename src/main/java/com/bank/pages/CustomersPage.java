package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
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

    By login = By.xpath("//button[@type='submit']");

    public void clickOnLogin() {
        clickOnElement(login);
    }

    By welcomeText = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/strong[1]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    By account1008 = By.xpath("//select[@id='accountSelect']");

    public String getaccount1008text() {
        return getTextFromElement(account1008);
    }

    By Deposit = By.xpath("//button[@ng-class='btnClass2']");

    public void clickOnDeposit() {
        clickOnElement(Deposit);
    }

    By enteramount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");

    public void amountfield(String amount) {
        sendTextToElement(enteramount,"100");
    }
    By Deposit1 = By.xpath("//button[@type='submit']");
    public void clickOnDeposittab(){
        clickOnElement(Deposit1);
    }
    By verifyMessage1 = By.xpath("//span[contains(text(),'Deposit Successful')]");
    public String getverifyMesssage1(){
        return getTextFromElement(verifyMessage1);}

    }







