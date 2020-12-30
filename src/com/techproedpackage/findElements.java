package com.techproedpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/techproed/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //TC01_As user I want to know how many item are there on amazon in the first page after I search porcelain teapot?
        //TC02_Order the the tea pot prices and find the min, max, and average price to the nearest cent.
        driver.get("https://amazon.com");
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("porcelain teapot"+ Keys.ENTER);

        List<WebElement> wholePartPrice=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        //findElements command returns a LIST of web elements.
        //It returns an empty list if there are no elements found.
        //Below is the syntax of find elements command.
        //List<WebElement> elementName = driver.findElements(By.locatorname("LocatorValue"));
        List<WebElement> decimalPartPrice=driver.findElements(By.xpath("//span[@class='a-price-fraction']"));

        //How many priced item are there in the first page?
        int numberOfPrice=wholePartPrice.size();
        System.out.println(numberOfPrice);

        //Print all prices.
        //Below won't print the texts. This prints the references
        System.out.println(wholePartPrice);

        // We get the elements inside a list using get(index). getText() is used to get the text of an element
        for (int i=0;i<numberOfPrice;i++){

            System.out.print(wholePartPrice.get(i).getText()+"."+decimalPartPrice.get(i).getText()+", ");
        }
        System.out.println();


        List<String> priceList=new ArrayList<>();
        for (int i=0;i<numberOfPrice;i++){
            if(!wholePartPrice.get(i).getText().isEmpty()){
            priceList.add(wholePartPrice.get(i).getText()+"."+decimalPartPrice.get(i).getText());
        }}
        System.out.println("Unsorted price list : "+priceList);

        //Find the cheapest and most expensive teapot
        Collections.sort(priceList);
        System.out.println("Sorted price list : "+priceList);
        System.out.println("Max Price is "+priceList.get(priceList.size()-1));
        System.out.println("Min Price is "+priceList.get(0));


        //Find the average price and round to the nearest cent.
        List<Double> doubleList=new ArrayList<>();
        for(String s : priceList) {

            if (Double.valueOf(s)>0) {
                doubleList.add(Double.valueOf(s));
            }
        }
        System.out.println("Integer list : "+doubleList);
        double sum=0;
        double average=0;
        for (Double d:doubleList){
            sum+=d;
        }

        average=sum/doubleList.size();
        DecimalFormat roundToCent = new DecimalFormat("0.00");
        System.out.println("Average price is to nearest cent : "+roundToCent.format(average)+
                "\nAverage price is to nearest dollar :"+Math.round(average));

    }
}

