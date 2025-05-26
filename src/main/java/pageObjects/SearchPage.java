package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	WebElement element;
	@FindBy(xpath="//textarea[@aria-label='Search']")
	private WebElement searchBox;
	
	
	public SearchPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void searchForName() throws InterruptedException 
	{
		   element = searchBox;
		   System.out.println("Success");
	       element.sendKeys("Bubu");
	       element.sendKeys(Keys.ENTER);
	       Thread.sleep(200);
	       driver.navigate().back();
	}

}
