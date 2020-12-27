package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
//    Create a new class: VerifyURLTest 
//    Navigate to google homepage 
//    Verify if google homepage url is “www.google.com”
//    driver.getCurrentUrl();// return the current URL
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
            "/Users/techproed/Documents/selenium libraries/drivers/chromedriver");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    String actualGoogleURL=driver.getCurrentUrl();//Return the URL as a string
    String expectedGoogleURL="www.google.com";
    if (actualGoogleURL.equals(expectedGoogleURL)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("Actual : " +actualGoogleURL);
        System.out.println("Expected : "+expectedGoogleURL);
    } }
//    TESTERS DON'T WRITE THE CODE JUST TO PASS.
//    MY GOAL IS TO WRITE A CODE TO CATCH AS MANY BUG AS POSSIBLE
}
