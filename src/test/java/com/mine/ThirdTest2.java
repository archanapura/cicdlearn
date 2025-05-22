package com.mine;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import java.time.Duration;

public class ThirdTest2 extends Config2{

    @Test(groups={"regression"})
    public void testthirdMethod()  throws InterruptedException
    {
        driver.findElement(By.cssSelector("a[aria-label='Google apps']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='Images']")).click();

    }


}