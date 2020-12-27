package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        //Path     : System.setProperty(“driver type","path to chrome driver");
        //What is the browser Type you want to use?????
        //Where is that driver ?????
        System.setProperty("webdriver.chrome.driver","/Users/techproed/Documents/selenium libraries/drivers/chromedriver");

//        Driver   : WebDriver driver=new ChromeDriver();
        WebDriver driver = new ChromeDriver();

//        Send command: driver.get("https://www.google.com/");
        driver.get("https://www.google.com/");

//        Print : This is my first class on the console
        System.out.println("This is my first class");

    }
}
