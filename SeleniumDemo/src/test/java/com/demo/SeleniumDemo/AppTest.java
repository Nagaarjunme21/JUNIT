package com.demo.SeleniumDemo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test  
    public void dispay() throws InterruptedException {
    	//System.out.println("print from test class");
    	
    	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.google.com/");
    	
    	
    	String url = driver.getCurrentUrl();
    	System.out.println(driver.getCurrentUrl());// URL
    	
    	System.out.println(driver.getTitle());//Title
    	
    	
    	driver.manage().window().maximize();
    	
    	Thread.sleep(5000);
    	
    	//driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
    	
    	driver.findElement(By.name("q")).sendKeys("amazon");
    	
    	//Thread.sleep(3000);
    	
    //	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul/li[2]/div/div[2]/div[1]/span")).click();  
    	
    	
    	
    	
    }
}
