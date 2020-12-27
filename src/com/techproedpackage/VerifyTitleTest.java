package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
//    Create a new class: VerifyTitleTest
//    Navigate to google homepage
//    Verify if google title is “google” -> Compare actual and expected result
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
            "/Users/techproed/Documents/selenium libraries/drivers/chromedriver");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    String actualGoogleTitle=driver.getTitle();//We get the title of the page. getTitle(); returns a String
    String expectedGoogleTitle="google";

    //Use if else statement to compare actual and expected result
    if(actualGoogleTitle.equals(expectedGoogleTitle)){
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
        System.out.println("Actual : "+actualGoogleTitle);
        System.out.println("Expected : "+expectedGoogleTitle);
    }
//    google != Google
    // This may or may not be a bug
//    As tester, I need to verify if this is considered as a bug or not.
//    --Check with BA, or Developer, or PO
//    I cannot directly say this is not a bug

//    Should I open a JIRA ticket?
    //If this is accepted as a bug, it is minor bug.
//    First contact with Dev to check the test case, Then we(tester + dev) talk to BA
//    If this defect can be fixed before the sprint, then I don't raise defect. I tell the dev to fix it
//    If This story is developed in previous sprints,then I raise a defect ticket to tract this defect.

}
}
