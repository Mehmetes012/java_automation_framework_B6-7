package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntro {
//    Create main method and complete the following task.
//    user goes to http://a.testaddressbook.com/sign_in

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",
            "/Users/techproed/Documents/selenium libraries/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://a.testaddressbook.com/sign_in");
    //    Locate the elements of email textbox, password textbox, and signin button
    //    Enter below username and password then click sign in button
    //    Username :testtechproed@gmail.com
    //    Password : Test1234!
    Thread.sleep(3000);
    WebElement sessionEmail=driver.findElement(By.id("session_email"));//findElement returns a WebElement
    sessionEmail.sendKeys("testtechproed@gmail.com");//sendKeys types in the input

    WebElement sessionPassword=driver.findElement(By.id("session_password"));
    sessionPassword.sendKeys("Test1234!");

    WebElement signInButton=driver.findElement(By.name("commit"));
    signInButton.click();
    Thread.sleep(3000);

    //    Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page) 
    WebElement currentUserId= driver.findElement(By.className("navbar-text"));
//    System.out.println(currentUserId);//[[ChromeDriver: chrome on MAC (4f1e8299d3984771a7d98bf0217fee6f)] -> class name: navbar-text]
    String actualCurrentUserId=currentUserId.getText();//getText() return the text of an element as String
//    System.out.println(actualCurrentUserId);//testtechproed@gmail.com
    String expectedCurrentUserId="testtechproed@gmail.com";

    if (actualCurrentUserId.equals(expectedCurrentUserId)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("Actual : "+actualCurrentUserId);
        System.out.println("Expected : "+expectedCurrentUserId);
    }
//    PASSED: Working as expected. It means This story is ready for demo. There is no bug.

//    Verify the Addresses and Sign Out texts are displayed correctly
    //WebElement addresses=driver.findElement(By.linkText("Addresses"));//I must pass the exact text of the link by spaces and all
    WebElement addresses=driver.findElement(By.partialLinkText("Addresses"));
    if (addresses.getText().equals("Addresses")){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("Actual : "+addresses.getText());
        System.out.println("Expected : Addresses");
    }

    WebElement signOut=driver.findElement(By.linkText("Sign out"));
    if (signOut.getText().equals("Sign Out")){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("Actual : "+signOut.getText());
        System.out.println("Expected : Sign Out");
    }
//    This step fails. Check with dev and BA to understand if this is a valid bug or not.

//    Find the number of total link on the page.
    //a tag creates a link
    List<WebElement> links=driver.findElements(By.tagName("a"));//Give me ALL elements with a tag.findElements returns a List of WebElement
    int linksNumber=links.size();
    System.out.println("Number Of Link : "+linksNumber);
//    Sign out from the page
    driver.findElement(By.linkText("Sign out")).click();

    //VERIFY IF SIGN IN SUCCESSFULL:
    //We can use different ways to verify sign out
    //My strategy is to check if Sign in test is on the page.
    //If Sign in text is visible, that means i am on the sign in page
    WebElement signInElement=driver.findElement(By.tagName("h2"));
    if (signInElement.isDisplayed()){//isDisplayed ==>> return true if the element is displayed. It returns false if element is not displayed on hte page
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }
}
}
