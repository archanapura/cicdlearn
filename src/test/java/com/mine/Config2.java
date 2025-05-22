package com.mine;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import java.time.Duration;

class Config2
{
    WebDriver driver;
    ExtentReports extent;
    ExtentSparkReporter reporter;
    ExtentTest test;


   // @BeforeGroups("regression")
    @BeforeSuite
    public void initialSetup()
    {
        String reportPath = "./reports/index.html";
        reporter = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        
    }

    @Parameters("browser")
    @BeforeClass
    public void setupMethod(String browser)
    {
        if(browser.equals("Chrome"))
        {
            driver = new ChromeDriver();
        }
        System.out.println(System.getProperty("browser"));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

   // @AfterGroups("regression")
    @AfterClass
    public void finalMethod()
    {
        driver.quit();
    }
    @AfterSuite
    public void afterSuite() {
        extent.flush();
    }
}