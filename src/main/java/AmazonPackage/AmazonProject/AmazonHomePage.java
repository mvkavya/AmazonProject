package AmazonPackage.AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage 
{
	WebDriver driver;
//step 1	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement accountandlist;
	
	@FindBy(xpath="//span[.='Sign in'][1]")
	WebElement signin_link;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout_link;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	
	
//step 2
	public void hoveroveraccountandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void signin() throws InterruptedException
	{
		Thread.sleep(2000);
		signin_link.click();
	}
	
	public void searchingtheproduct()
	{
		search.sendKeys("shoe"+Keys.ENTER);
	}
	public void logout() throws InterruptedException
	{
		signout_link.click();
		Thread.sleep(3000);
	}
	
	
//step 3
	
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
}
