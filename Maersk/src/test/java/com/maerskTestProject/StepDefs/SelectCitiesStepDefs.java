package com.maerskTestProject.StepDefs;

import com.maerskTestProject.BlazeDemoSite.BlazeDemoSite;
import com.maerskTestProject.BlazeDemoSite.Pages.FlightsPage;
import com.maerskTestProject.SeleniumConfig.SeleniumConfig;
import io.cucumber.java.en.Given;

public class SelectCitiesStepDefs {

    private static SeleniumConfig seleniumConfig = new SeleniumConfig("chrome","C:\\Users\\Nikolay\\Downloads\\chromedriver.exe");
    private static BlazeDemoSite blazeDemoSite = new BlazeDemoSite(seleniumConfig.getDriver());
    private static FlightsPage flightsPage;


}
