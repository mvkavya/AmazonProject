package AmazonPackage.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage 
{
	ChromeDriver driver;
	//step 1	
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(id="continue")
		WebElement continuebutton;

		
		@FindBy(id="ap_password")
		WebElement password;
		
		@FindBy(id="auth-signin-button")
		WebElement signinbutton;
		
	//step 2
		
		public void un()
		{
			username.sendKeys("9632551381");
		}
		
		public void continueUN() throws InterruptedException
		{
			continuebutton.click();
			Thread.sleep(3000);
			}
		
		public void pwd() throws InterruptedException
		{
			password.sendKeys("kavyamv123");
			Thread.sleep(3000);
		}
		
		public void signin() throws InterruptedException
		{
			signinbutton.click();
			Thread.sleep(3000);
		}
	//step 3
		
		public AmazonLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
}
