package com.mine;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.SearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import java.time.Duration;

public class MainTest2 extends Config2{

   @Test(groups={"sanity"})
    public void testfirstMethod()  throws InterruptedException
   {
       test = extent.createTest("Google search");
       SearchPage page=new SearchPage(driver);
       page.searchForName();
       test.log( Status.PASS,"Successfully searched data");
   }



}