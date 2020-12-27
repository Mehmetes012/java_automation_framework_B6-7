package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
//    Create main method and complete the following task.
//    user goes to http://a.testaddressbook.com/sign_in
//    Locate the elements of email textbox, password textbox, and signin button
//    Enter below username and password then click sign in button
//    Username :testtechproed@gmail.com
//    Password : Test1234!
//    Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page) 
//    Verify the Addresses and Sign Out texts are displayed
//    Find the number of total link on the page
//    Sign out from the page
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
            "/Users/techproed/Documents/selenium libraries/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://a.testaddressbook.com/sign_in");
    WebElement sessionEmail=driver.findElement(By.id("session_email"));//findElement returns a WebElement
    sessionEmail.sendKeys("testtechproed@gmail.com");//sendKeys types in the input

    WebElement sessionPassword=driver.findElement(By.id("session_password"));
    sessionPassword.sendKeys("Test1234!");

    WebElement signInButton=driver.findElement(By.name("commit"));
    signInButton.click();

}
}
