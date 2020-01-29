package com.maerskTestProject.BlazeDemoSite;

import com.maerskTestProject.BlazeDemoSite.Pages.FlightsPage;
import com.maerskTestProject.BlazeDemoSite.Pages.HomePage;
import com.maerskTestProject.BlazeDemoSite.Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class BlazeDemoSite {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private FlightsPage flightsPage;

    public BlazeDemoSite(WebDriver driver){
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
        //this.homePage = new HomePage(driver);
        this.flightsPage = new FlightsPage(driver);

    }
    public LoginPage loginPage(){
        return loginPage;
    }

    public HomePage homePage() {
        return homePage;
    }
    public FlightsPage flightsPage(){
        return flightsPage;
    }
}
