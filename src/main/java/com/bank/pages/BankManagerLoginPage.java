package com.bank.pages;

import com.bank.utility.Utility;
import javafx.geometry.Pos;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By AddCustomer = By.xpath("//button[@ng-class='btnClass1']");

    public void clickOnAddCustomer() {
        clickOnElement(AddCustomer);
    }

    By FirstName = By.xpath("//input[@placeholder='First Name']");

    public void enterFirstName(String firstname) {
        sendTextToElement(FirstName, firstname);
    }

    By LastName = By.xpath("//input[@placeholder='Last Name']");

    public void enterLastName(String lastname) {
        sendTextToElement(LastName, lastname);
    }

    By PostCode = By.xpath("//input[@placeholder='Post Code']");

    public void enterPostCode(String postcode) {
        sendTextToElement(PostCode, postcode);
    }

    By addCustomer = By.xpath("//button[@type='submit']");

    public void clickOnaddCustomer() {
        clickOnElement(addCustomer);
    }

    By Popup = By.id("7");

    public void isDisplayed() {
        boolean diplayed;
    }

    By verifyMessage = By.name("Customer added successfully ");

    public String getVerifyMessage() {
        return getTextFromElement(verifyMessage);
    }

    By acceptAlert = By.id("OK");

    public void setAcceptAlert() {
      return;
    }

    By openAccount = By.xpath("//button[@ng-class='btnClass2']");

    public void clickOnopenAccount() {
        clickOnElement(openAccount);
    }

    By CustomerName = By.xpath("//select[@id='userSelect']");

    public void clickOnCustomerName() {
        clickOnElement(CustomerName);
    }

    By Currency = By.xpath("//select[@id='currency']");

    public void clickOnCurrency() {
        clickOnElement(Currency);
    }

    By Process = By.xpath("//button[contains(text(),'Process')]");

    public void clickOnProcess() {
        clickOnElement(Process);
    }

    By Customers = By.xpath("//button[@ng-class='btnClass3']");

    public void clickOnCustomers() {
        clickOnElement(Customers);
    }

    By SearchCustomer = By.xpath("//input[@placeholder='Search Customer']");

    public void clickOnSearchCustomer() {
        clickOnElement(SearchCustomer);
    }

    By verifyAccountNumber = By.xpath("//thead/tr/td[4]");

    public void clickOnAccountNumber() {
        clickOnElement(verifyAccountNumber);
    }

    By DeleteCustomer = By.xpath("//thead/tr/td[5]");


}

