package com.mine;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import java.time.Duration;

public class SecondTest2 extends Config2{



    @Test(groups={"smoke","sanity"})
    public void testsecondMethod()  throws InterruptedException
    {
        driver.findElement(By.xpath("//a[text()='Gmail']")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector("a[aria-label='Google apps']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Images']")).click();

    }



}