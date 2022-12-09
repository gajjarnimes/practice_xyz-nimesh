package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By AddCustomer = By.xpath("//button[@ng-click='addCust()']");
    public void clickOnAddCustomer(){
        clickOnElement(AddCustomer);
    }
    By FirstName = By.xpath("//input[@placeholder='First Name']");
    public void enterFirstName(String Name){
        sendTextToElement(FirstName,Name);
    }
    By LastName =By.xpath("//input[@placeholder='Last Name']");
    public void enterLastName(String lastname){
        sendTextToElement(LastName,lastname);
    }
    By PostCode = By.xpath("//input[@placeholder='Post Code']");
    public void enterPostCode(String postcode){
        sendTextToElement(PostCode,postcode);
    }
    By addCustomer = By.xpath("//button[@type='submit']");
    public void clickOnaddCustomer(){
        clickOnElement(addCustomer);
    }
}
