package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {

By customerlogin = By.xpath("//button[contains(text(),'Customer Login')]");
public void clickOnCustomerLoginTab(){
    clickOnElement(customerlogin);
}

By bankmanagerlogin =By.xpath("//button[contains(text(),'Bank Manager Login')]");
public void clickOnBankManagerLogintab(){
    clickOnElement(bankmanagerlogin);
}

}
