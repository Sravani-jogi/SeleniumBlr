package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.setup.Reports;
import com.stepDefinitionTestNG.Hooks;

public class HomePage {



    private static WebDriver driver;
    private static WebDriverWait wait;
    static ExtentTest test;

    private static By homeRenovationLink = By.xpath("//a[text() = 'Home Renovation Queries']");
    private static By renovationTitle = By.xpath("/html/body/section[3]/div[2]/h1");

    //h1[contains(text(),'Home Renovation') or contains(text(),'Renovation')]
    public HomePage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public static boolean clickHomeRenovationQueries() {
        boolean actResult = true;
        try {
            WebElement link = wait.until(ExpectedConditions.presenceOfElementLocated(renovationTitle));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", link);
            wait.until(ExpectedConditions.elementToBeClickable(link));
            link.click();
            Reports.generateReport(driver, test, Status.PASS, "Clicked on Home Renovation Queries link");
        } catch (TimeoutException te) {
            actResult = false;
            Reports.generateReport(driver, test, Status.FAIL, "Home Renovation Queries link not found or clickable");
        }
        return actResult;
    }

    public static boolean verifyRenovationPageLoaded() {
        boolean actResult = true;
        try {
            wait.until(ExpectedConditions.urlContains("home-renovation"));
            Reports.generateReport(driver, test, Status.PASS, "Navigated to Home Renovation page");
        } catch (TimeoutException te) {
            actResult = false;
            Reports.generateReport(driver, test, Status.FAIL, "Failed to navigate to Home Renovation page");
        }
        return actResult;
    }

    public static boolean verifyRenovationTitleDisplayed() {
        boolean actResult = true;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(renovationTitle));
            Reports.generateReport(driver, test, Status.PASS, "Home Renovation title is displayed");
        } catch (TimeoutException te) {
            actResult = false;
            Reports.generateReport(driver, test, Status.FAIL, "Home Renovation title is not displayed");
        }
        return actResult;
    }

    


}