package AmazonPackage.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAddToCart 
{
	WebDriver driver;
	//step 1	
		
		@FindBy(xpath="//span[@id='a-autoid-1']//button[@id='a-autoid-1-announce']")	
		WebElement addtocart1;
		
		@FindBy(xpath="(//div[@class='a-row a-size-medium']//button[.='Add to cart'])[1]")	
		WebElement addtocart2;
		
		@FindBy(xpath="(//i[@class='a-icon a-icon-close'])[2]")	
		WebElement close;
		
	//step 2
		
		public void addingfirstproducttocart() throws InterruptedException
		{
			Thread.sleep(2000);
			addtocart1.click();
		}
                      //using waits		
/*		public void addingfirstproducttocart()
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addtocart1));
		button.click();
		System.out.println("Clicked on first Add to Cart button.");
		}
*/
		
	public void clickaddtocart() 
	{
		addtocart2.click();
		System.out.println("Clicked on second Add to Cart button.");
		close.click();
	}
	
//step 3
		
		public AmazonAddToCart(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
