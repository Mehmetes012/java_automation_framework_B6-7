package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
//    Create a new class under : FirefoxBrowserDemo
//    Create main method
public static void main(String[] args) throws InterruptedException {
    //    Set Path
//    webdriver.gecko.driver   is used as teh first parameter
    System.setProperty("webdriver.gecko.driver","/Users/techproed/Documents/selenium libraries/drivers/geckodriver");
    //    Create gecko driver
    WebDriver driver= new FirefoxDriver();
//    What is polymorphism???
//    Where did you use it???
//    I used polymorphism when I create driver object. I can create ChromeDriver or FirefoxDriver
//    using the same WebDriver API
//    Open google home page https://www.google.com/
    driver.get("https://www.google.com/");
    Thread.sleep(3000);
//    Maximize the window
    driver.manage().window().maximize();
    Thread.sleep(3000);
    //    Close/Quit the browser
    driver.close();
}
}
