package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
//    Create a new class under : BasicNavigations
//    Create main method
public static void main(String[] args) throws InterruptedException {
//    Set Path
    System.setProperty("webdriver.chrome.driver","/Users/techproed/Documents/selenium libraries/drivers/chromedriver");
//    Create chrome driver
    WebDriver driver = new ChromeDriver();
//    Open google home page https://www.google.com/
    driver.get("https://www.google.com/");//get takes us to a website
    //get is the most popular one.
    Thread.sleep(3000);
//    On the same class, Navigate to amazon home page https://www.amazon.com/
    driver.navigate().to("https://www.amazon.com/");//takes us to a website.
    // navigate() gives more options
    // if we want to navigate back and forward or refresh the page, then use navigate
    Thread.sleep(3000);
//    Navigate back to google
    driver.navigate().back();//This takes us to previous page
    Thread.sleep(3000);
//    Navigate forward to amazon
    driver.navigate().forward();//This takes us to the next page
    Thread.sleep(3000);
//    Refresh the page
    driver.navigate().refresh();
//    Maximize the window
    driver.manage().window().maximize();//This will give us full screen
    Thread.sleep(3000);
//    Close/Quit the browser
   // driver.close();//Closing the current working browser
    driver.quit();
    //What is the difference between close and quit?
    //close method closes the current single browser.
    //quit method closes all working browsers.quit is stronger.
}
}
