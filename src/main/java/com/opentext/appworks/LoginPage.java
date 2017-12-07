package com.opentext.appworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tibi on 12/7/2017.
 */
public class LoginPage {

    static WebDriver driver;

    @FindBy(xpath = "")
    public static WebElement btn_Submit;

    @FindBy(id="")
    public static WebDriver txt_Password;

    @FindBy(id="")
    public static WebDriver txt_Username;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void populatingFields (WebElement element, String txt){
        element.sendKeys(txt);
    }

    public static Boolean submitButtonCheck (){
        Boolean disabled = btn_Submit.isDisplayed();
        return disabled;
    }

    public static void textFieldCheck(){
        String s = driver.findElement(By.id("")).getText();
    }
}
