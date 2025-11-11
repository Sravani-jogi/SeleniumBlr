//package com.stepDefinitionTestNG;
//
//import com.aventstack.extentreports.ExtentReports;
////import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.setup.BaseSteps;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterAll;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeAll;
//import io.cucumber.java.Scenario;
//
//public class Hooks extends BaseSteps {
//
//    public static ExtentSparkReporter spark;
//    public static ExtentReports extReports;
//    public static ExtentTest test;
//
//    @BeforeAll
//    public static void beforeAll() {
//        spark = new ExtentSparkReporter("target/ExtentReport.html");
//        extReports = new ExtentReports();
//        extReports.attachReporter(spark);
//    }
//
//    @AfterAll
//    public static void afterAll() {
//        extReports.flush();
//    }
//
//    @Before
//    public void beforeScenario(Scenario scenario) {
//        test = extReports.createTest(scenario.getName());
//       // launchBrowser(); // Launch fresh browser before each scenario
//    }
//
//    @After
//    public void afterScenario() {
////        if (driver != null) {
////            driver.quit(); // Clean up browser after each scenario;
//    	sleep(4000);
//    	driver.quit();;
//        }
//    }

package com.stepDefinitionTestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.setup.BaseSteps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseSteps {

    public static ExtentSparkReporter spark;
    public static ExtentReports extReports;
    public static ExtentTest test;

    @BeforeAll
    public static void beforeAll() {
        spark = new ExtentSparkReporter("target/ExtentReport.html");
        extReports = new ExtentReports();
        extReports.attachReporter(spark);
    }

    @AfterAll
    public static void afterAll() {
        extReports.flush();
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        test = extReports.createTest(scenario.getName());

        // ✅ Initialize WebDriver before each scenario
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario() {
        try {
            Thread.sleep(4000); // Optional wait
            if (driver != null) {
                driver.quit(); // ✅ Safe quit
            }
        } catch (Exception e) {
            System.out.println("Error during driver quit: " + e.getMessage());
        }
    }
}
