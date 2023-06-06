package com.akakce.pages;

import com.akakce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {


    public SearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='q']")
    public WebElement searchBox;

    @FindBy(xpath = "//i[normalize-space()='Ara']")
    public WebElement searchBoxButton;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/span[5]/b[1]")
    public WebElement uruneGit;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]")
    public WebElement takipEtButton;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[2]/a[1]")
    public WebElement takipEtPageButton;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/h1[1]")
    public WebElement expextedIphoneName;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/ul[1]/li[2]/a[1]/span[1]/h3[1]")
    public WebElement actualIphoneName;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[3]/div[1]/p[1]/b[1]")
    public WebElement scroll;

    //Akakce WebElements Page









}

