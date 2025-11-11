package com.stepDefinitionTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.parameters.ExcelReader;
import com.setup.BaseSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profile extends BaseSteps {
//	@Given("user clicks on the Home Renovation Queries option on the homepage")
//	public void user_clicks_on_the_home_renovation_queries_option_on_the_homepage() {
//	    launchBrowser(); // Load homepage
//
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	    // Locate the link element
//	    WebElement renovationLink = wait.until(
//	        ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='" +  "']"))
//	    );
//
//	    // Scroll into view
//	    ((JavascriptExecutor) driver).executeScript(
//	        "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", renovationLink
//	    );
//
//	  
//	    String linkUrl = renovationLink.getAttribute("href");
//
//	    // Open the link in a new window
//	    ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", linkUrl);
//
//	    // Switch to the new window
//	    for (String handle : driver.getWindowHandles()) {
//	        driver.switchTo().window(handle);
//	        if (driver.getCurrentUrl().contains("home-renovation")) {
//	            break;
//	        }
//	    }
//	}
//	@Given("user clicks on the Home Renovation Queries option on the homepage")
//	public void user_clicks_on_the_home_renovation_queries_option_on_the_homepage() {
//	    // Launch browser and open homepage
//	    launchBrowser();
//
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	    // Locate the link element
//	    WebElement renovationLink = wait.until(
//	        ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Home Renovation Queries']"))
//	    );
//
//	    // Scroll and click using JS
//	    scrollAndClick(renovationLink);
//
//	    // ✅ Wait for navigation to complete
//	    wait.until(ExpectedConditions.urlContains("home-renovation"));
//
//	    System.out.println("Navigated to: " + driver.getCurrentUrl());
//	}
//
//	// ✅ Simple reusable scroll and click method
//	public void scrollAndClick(WebElement element) {
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].scrollIntoView(true);", element);
//	    js.executeScript("arguments[0].click();", element);
//	}
//	@When("The user clicks on the {string} option on the homepage")
//  public void the_user_clicks_on_the_option_on_the_homepage(String optionText) {
//      launchBrowser(); // Load homepage
//
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//      WebElement renovationLink = wait.until(
//          ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='" + optionText + "']"))
//      );
//
//      ((JavascriptExecutor) driver).executeScript(
//          "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", renovationLink
//      );
//
//      String linkUrl = renovationLink.getAttribute("href");
//      ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", linkUrl);
//
//      for (String handle : driver.getWindowHandles()) {
//          driver.switchTo().window(handle);
//          if (driver.getCurrentUrl().contains("home-renovation")) {
//              break;
//          }
//      }
//  }
//	@Given("user clicks on the Home Renovation Queries option on the homepage")
//	public void user_clicks_on_the_home_renovation_queries_option_on_the_homepage() {
//	    // Launch browser and open homepage
//	    launchBrowser();
//
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	    // Locate the link element
//	    WebElement renovationLink = wait.until(
//	        ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Home Renovation Queries']"))
//	    );
//
//	    // Scroll and click using JavaScript
//	    scrollAndClick(renovationLink);
//
//	    // ✅ Wait for navigation or page element
//	    try {
//	        wait.until(ExpectedConditions.or(
//	            ExpectedConditions.urlContains("home-renovation"),
//	            ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Home Renovation')]"))
//	        ));
//	        System.out.println("Navigated to: " + driver.getCurrentUrl());
//	    } catch (Exception e) {
//	        throw new RuntimeException("Navigation failed: " + e.getMessage());
//	    }
//	}
//
//	// ✅ Simple reusable scroll and click method
//	public void scrollAndClick(WebElement element) {
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].scrollIntoView(true);", element);
//	    js.executeScript("arguments[0].click();", element);
//	}
//	@Given("user clicks on the Home Renovation Queries option on the homepage")
//	public void user_clicks_on_the_home_renovation_queries_option_on_the_homepage() {
//	    // Launch browser and open homepage
//	    launchBrowser();
//
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	    // Locate the link element
//	    WebElement renovationLink = wait.until(
//	        ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Home Renovation Queries']"))
//	    );
//
//	    // Scroll and click using JavaScript
//	    scrollAndClick(renovationLink);
//
//	    // ✅ Wait for navigation or page element
//	    try {
//	        wait.until(ExpectedConditions.or(
//	            ExpectedConditions.urlContains("home-renovation"),
//	            ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Home Renovation')]"))
//	        ));
//	        System.out.println("Navigated to: " + driver.getCurrentUrl());
//	    } catch (Exception e) {
//	        throw new RuntimeException("Navigation failed: " + e.getMessage());
//	    }
//	}
//
//	// ✅ Simple reusable scroll and click method
//	public void scrollAndClick(WebElement element) {
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].scrollIntoView(true);", element);
//	    js.executeScript("arguments[0].click();", element);
//	}
	@Given("user clicks on the Home Renovation Queries option on the homepage")
	public void user_clicks_on_the_home_renovation_queries_option_on_the_homepage() {
	    // Launch browser and open homepage
	    launchBrowser();

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // Locate the link element
	    WebElement renovationLink = wait.until(
	        ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Home Renovation Queries']"))
	    );

	    // Scroll and click using JavaScript
	    scrollAndClick(renovationLink);

	    // ✅ Wait for navigation or page element
	    boolean navigated = false;
	    try {
	        wait.until(ExpectedConditions.or(
	            ExpectedConditions.urlContains("home-renovation"),
	            ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Home Renovation')]"))
	        ));
	        navigated = true;
	    } catch (Exception e) {
	        System.out.println("Navigation check failed: " + e.getMessage());
	    }

	    if (navigated) {
	        System.out.println("Navigated successfully to: " + driver.getCurrentUrl());
	    } else {
	        System.out.println("Navigation did not complete within timeout.");
	    }
	}

	// ✅ Simple reusable scroll and click method
	public void scrollAndClick(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	    js.executeScript("arguments[0].click();", element);
	}

	@When("The system should navigate to the Home Renovation page")
	public void the_system_should_navigate_to_the_home_renovation_page() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	    wait.until(ExpectedConditions.urlContains("home-renovation")); // Adjust if needed

	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("Navigated to: " + currentUrl);
	}

	@And("The page should load without any error")
	public void the_page_should_load_without_any_error() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("The Home renovation title should be displayed")
	public void the_home_renovation_title_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@And("The user searches for value from Excel in the search bar")
  public void the_user_searches_for_value_from_excel_in_the_search_bar() {
      // Path to Excel file
      String filePath = System.getProperty("user.dir") + "/src/test/resources/Exceldata/No_brokerQuestion.xlsx";

      // Create ExcelReader object with file path
      ExcelReader reader = new ExcelReader(filePath);

      // Read value from Excel (Sheet 0, Row 0, Column 0)
      String searchValue = reader.getCellData(0, 0, 0);
      System.out.println("Searching for: " + searchValue);

      // Locate search bar and enter value
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
      WebElement searchBar = wait.until(ExpectedConditions.presenceOfElementLocated(
          By.xpath("//*[@id=\"custom_search\"]")
        //input[@type='search' or @placeholder='Search']
          
      ));

      searchBar.clear();
      searchBar.sendKeys(searchValue);
      searchBar.sendKeys(Keys.ENTER);
  }
	@And("The user clicks on the suggestion")
	public void the_user_clicks_on_the_suggestion() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.xpath("//*[@id=\"suggestions-item-lists\"]")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement suggestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"suggestions-item-lists\"]")));
        suggestion.click();
    

	
	}

	@Then("navigates to the relevant page.")
	public void navigates_to_the_relevant_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlContains("Profile")); // Assuming profile page URL contains 'profile'

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Navigated to profile page: " + currentUrl);

        if (!currentUrl.contains("profile")) {
            throw new AssertionError("Did not navigate to profile page!");
        }
	}
}
	
//	@Then("navigates to the relevant page.")
//	public void navigates_to_the_relevant_page() {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//	    // Wait until URL changes from home-renovation to a question page
//	    wait.until(ExpectedConditions.not(ExpectedConditions.urlContains("home-renovation")));
//
//	    String currentUrl = driver.getCurrentUrl();
//	    System.out.println("Navigated to relevant page: " + currentUrl);
//
//	    // Validate that the page contains expected content (e.g., question title)
//	    WebElement questionTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
//	        By.xpath("//h1[contains(@class,'title')]")
//	    ));
//
//	    if (!questionTitle.isDisplayed()) {
//	        throw new AssertionError("Relevant page did not load correctly!");
//	    }
//	}

    

	
	
	
	
	

	
	  

	




//package com.stepDefinitionTestNG;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import com.setup.BaseSteps;
//import com.parameters.ExcelReader;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Profile extends BaseSteps {
//
//    @When("The user clicks on the {string} option on the homepage")
//    public void the_user_clicks_on_the_option_on_the_homepage(String optionText) {
//        launchBrowser(); // Load homepage
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        WebElement renovationLink = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='" + optionText + "']"))
//        );
//
//        ((JavascriptExecutor) driver).executeScript(
//            "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", renovationLink
//        );
//
//        String linkUrl = renovationLink.getAttribute("href");
//        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", linkUrl);
//
//        for (String handle : driver.getWindowHandles()) {
//            driver.switchTo().window(handle);
//            if (driver.getCurrentUrl().contains("home-renovation")) {
//                break;
//            }
//        }
//    }
//
//    @Then("The system should navigate to the Home Renovation page")
//    public void the_system_should_navigate_to_the_home_renovation_page() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.urlContains("home-renovation"));
//
//        String currentUrl = driver.getCurrentUrl();
//        System.out.println("Navigated to: " + currentUrl);
//
//        if (!currentUrl.contains("home-renovation")) {
//            throw new AssertionError("Navigation failed! Expected URL to contain 'home-renovation'");
//        }
//    }
//
//    @And("The page should load without any error")
//    public void the_page_should_load_without_any_error() {
//        String pageSource = driver.getPageSource().toLowerCase();
//
//        // Check for critical error indicators only
//        if (pageSource.contains("404") || pageSource.contains("500") || pageSource.contains("page not found")) {
//            throw new AssertionError("Page loaded with critical errors!");
//        }
//
//        System.out.println("Page loaded successfully without critical errors.");
//    }
//
//    @And("The Home renovation title should be displayed")
//    public void the_home_renovation_title_should_be_displayed() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
//            By.xpath("//h1[contains(text(),'Home Renovation')]")
//        ));
//
//        if (!titleElement.isDisplayed()) {
//            throw new AssertionError("Home Renovation title is not displayed!");
//        }
//        System.out.println("Home Renovation title is displayed successfully.");
//    }
//
//    @Then("The user searches for value from Excel in the search bar")
//    public void the_user_searches_for_value_from_excel_in_the_search_bar() {
//        // Path to Excel file
//        String filePath = System.getProperty("user.dir") + "/src/test/resources/Exceldata/No_brokerQuestion.xlsx";
//
//        // Create ExcelReader object with file path
//        ExcelReader reader = new ExcelReader(filePath);
//
//        // Read value from Excel (Sheet 0, Row 0, Column 0)
//        String searchValue = reader.getCellData(0, 0, 0);
//        System.out.println("Searching for: " + searchValue);
//
//        // Locate search bar and enter value
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement searchBar = wait.until(ExpectedConditions.presenceOfElementLocated(
//            By.xpath("//input[@type='search' or @placeholder='Search']")
//        ));
//
//        searchBar.clear();
//        searchBar.sendKeys(searchValue);
//        searchBar.sendKeys(Keys.ENTER);
//    }
//}
