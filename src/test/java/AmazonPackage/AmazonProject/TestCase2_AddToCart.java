package AmazonPackage.AmazonProject;

import org.testng.annotations.Test;

public class TestCase2_AddToCart extends BaseClass
{
	@Test
	public void withvalidcredentials() throws InterruptedException
	{
		AmazonHomePage homepage=new AmazonHomePage(driver);
		homepage.hoveroveraccountandlist(driver);
		homepage.signin();
	
		AmazonLoginPage login=new AmazonLoginPage(driver);
		login.un();
		login.continueUN();
		login.pwd();
		login.signin();
		
		homepage.searchingtheproduct();
		
		AmazonAddToCart searchresultpage=new AmazonAddToCart(driver); 
		searchresultpage.addingfirstproducttocart();
		searchresultpage.clickaddtocart();
		
		Thread.sleep(3000);
		homepage.hoveroveraccountandlist(driver);
		homepage.logout();
		
	}

}
