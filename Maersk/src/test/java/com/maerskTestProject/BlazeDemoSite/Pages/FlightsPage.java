package com.maerskTestProject.BlazeDemoSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {

    private WebDriver driver;
    private String HomePageUrl = "http://blazedemo.com/";
    private By SelectFirstCity = By.xpath("/html/body/div[3]/form/select[1]/option[5]");
    private By SelectSecondCity = By.xpath("/html/body/div[3]/form/select[2]/option[5]");
    private By SelectFindFlights = By.xpath("/html/body/div[3]/form/div/input");
    private By ChooseThisFlight = By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[1]/input");

    //Details
    private By enterName = By.xpath("/html/body/div[2]/form/div[1]/div/input");
    private By enterAddress = By.xpath("/html/body/div[2]/form/div[2]/div/input");
    private By enterCity = By.xpath("/html/body/div[2]/form/div[3]/div/input");
    private By enterState = By.xpath("/html/body/div[2]/form/div[4]/div/input");
    private By enterZipCode = By.xpath("/html/body/div[2]/form/div[5]/div/input");
    private String cardSelector;
    private By selectCardPath;
    private By enterCardNumber = By.xpath("/html/body/div[2]/form/div[7]/div/input");
    private By enterCardMonth = By.xpath("/html/body/div[2]/form/div[8]/div/input");
    private By enterCardYear = By.xpath("/html/body/div[2]/form/div[9]/div/input");
    private By enterNameOnCard = By.xpath("/html/body/div[2]/form/div[10]/div/input");
    private By selectRememberMe = By.xpath("/html/body/div[2]/form/div[11]/div/label/input");
    private By sumbmitButton = By.xpath("/html/body/div[2]/form/div[11]/div/input");

    public FlightsPage(WebDriver driver) {
        this.driver = driver;

    }

    public FlightsPage goToHomepage() {
        driver.navigate().to(HomePageUrl);
        return this;
    }

    public FlightsPage selectFirstCity() {
        driver.findElement(SelectFirstCity).click();
        return this;
    }

    public FlightsPage selectSecondCity() {
        driver.findElement(SelectSecondCity).click();
        return this;
    }

    public FlightsPage selectFindFlights() {
        driver.findElement(SelectFindFlights).click();
        return this;
    }

    public FlightsPage chooseFlight() {
        driver.findElement(ChooseThisFlight).click();
        return this;
    }

    //Details

    public FlightsPage setCard(String randomCard) {
        cardSelector = randomCard;
        return this;
    }
    public FlightsPage setCardPath()
    {
        selectCardPath = By.xpath("/html/body/div[2]/form/div[6]/div/select/option["+cardSelector +"]");
        return this;
    }
    public FlightsPage fillInName(String name){
        driver.findElement(enterName).sendKeys(name);
        return this;
    }
    public FlightsPage fillInAddress(String address){
        driver.findElement(enterAddress).sendKeys(address);
        return this;
    }
    public FlightsPage fillCity(String city){
        driver.findElement(enterCity).sendKeys(city);
        return this;
    }
    public FlightsPage fillState(String state){
        driver.findElement(enterState).sendKeys(state);
        return this;
    }
    public FlightsPage fillZipcode(String zip){
        driver.findElement(enterZipCode).sendKeys(zip);
        return this;
    }
    public FlightsPage selectCard(){
        driver.findElement(selectCardPath).click();
        return this;
    }
    public FlightsPage fillCardNumber(String number){
        driver.findElement(enterCardNumber).sendKeys(number);
        return this;
    }
    public FlightsPage fillCardMonth(String number){
        driver.findElement(enterCardMonth).sendKeys(number);
        return this;
    }
    public FlightsPage fillCardYear(String number){
        driver.findElement(enterCardYear).sendKeys(number);
        return this;
    }
    public FlightsPage fillCardName(String name){
        driver.findElement(enterNameOnCard).sendKeys(name);
        return this;
    }
    public FlightsPage tickRememberMe(){
        driver.findElement(selectRememberMe).click();
        return this;
    }
    public FlightsPage submitForm(){
        driver.findElement(sumbmitButton).click();
        return this;
    }




}
