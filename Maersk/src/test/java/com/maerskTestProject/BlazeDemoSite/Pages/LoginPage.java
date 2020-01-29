package com.maerskTestProject.BlazeDemoSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private String HomePageUrl = "http://blazedemo.com/";
    private By accessLoginPage = By.xpath("/html/body/div[1]/div/div/a[3]");


    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage goToWebsite(){
            driver.navigate().to(HomePageUrl);
            return this;
    }
    public LoginPage goToLoginPage(){
        driver.findElement(accessLoginPage).click();
        return this;
    }





}
