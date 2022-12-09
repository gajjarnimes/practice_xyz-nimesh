package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By CustomerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    public void clickOnCustomerLogin(){
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

    By loginLink= By.xpath("//button[@type='submit']");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
    By verifylogouttab = By.xpath("//button[@class='btn logout']");
    public void isDisplayed(){
        boolean isdisplayed;
    }
    By logout = By.xpath("//button[@class='btn logout']");
    public void clickOnLogut(){
        clickOnElement(logout);
    }
    By verifyYourName = By.xpath("//select[@name='userSelect']");
    public String getverifyMessage(){
        return getTextFromElement(verifyYourName);
    }


    }

