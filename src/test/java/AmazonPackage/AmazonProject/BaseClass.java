package AmazonPackage.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	WebDriver driver;
	@BeforeMethod
	public void browserlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterMethod
	public void browserquit() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
