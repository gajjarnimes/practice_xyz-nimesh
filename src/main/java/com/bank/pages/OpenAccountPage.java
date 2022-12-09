package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

import java.util.Currency;

public class OpenAccountPage extends Utility {
    By openAccount = By.xpath("//button[@ng-class='btnClass2']");

    public void clickOnopenAccount() {
        clickOnElement(openAccount);
    }

    By CustomerName = By.xpath("//select[@id='userSelect']");

    public void clickOnCustomerName() {
        clickOnElement(CustomerName);
    }

    By selectRoanWeasly = By.xpath("//option[@value='3']");

    public void setSelectRoanWeasly() {
        clickOnElement(selectRoanWeasly);
    }

    By Currency = By.xpath("//select[@id='currency']");

    public void clickOnCurrency() {
        clickOnElement(Currency);
    }

    By selectCurrency = By.xpath("//option[contains(text(),'Pound')]");

    public void setSelectCurrency() {
        clickOnElement(selectCurrency);
    }
    By Process = By.xpath("//button[contains(text(),'Process')]");

    public void clickOnProcess() {
        clickOnElement(Process);
    }

    By Popup = By.id("1016");

    public void isDisplayed() {
        boolean diplayed;
    }

    By verifyMessage = By.name("Account created successfully with account Number :1016");

    public String getVerifyMessage() {
        return getTextFromElement(verifyMessage);
    }
     By acceptAlert = By.id("OK");
    public void setAcceptAlert(){
        return;
        //switchToParentWindow("www.way2automation.com/angularjs-protractor/banking/#/login");
    }
}
