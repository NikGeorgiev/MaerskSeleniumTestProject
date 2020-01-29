package com.maerskTestProject.Tests;

import com.maerskTestProject.BlazeDemoSite.BlazeDemoSite;
import com.maerskTestProject.SeleniumConfig.SeleniumConfig;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {

    private static SeleniumConfig seleniumConfig;
    private static BlazeDemoSite blazeDemoSite;

    @BeforeClass
    public static void setup(){
        seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\Nikolay\\Downloads\\chromedriver.exe");

        blazeDemoSite = new BlazeDemoSite(seleniumConfig.getDriver());
    }

    @Test
    public void goToLoginPage(){
        blazeDemoSite.loginPage().goToWebsite().goToLoginPage();
    }

    @Test
    public void goToFlightsPage(){
        blazeDemoSite.flightsPage()
                .goToHomepage()
                .selectFirstCity()
                .selectSecondCity()
                .selectFindFlights()
                .chooseFlight()


                .setCard("2")
                .setCardPath()
                .fillInName("Nik")
                .fillInAddress("120 Coconut Street")
                .fillCity("NYC")
                .fillState("New York")
                .fillZipcode("200")
                .selectCard()
                .fillCardNumber("23312313113156")
                .fillCardMonth("10")
                .fillCardYear("2020")
                .fillCardName("Nik")
                .tickRememberMe()
                .submitForm();




    }




}
