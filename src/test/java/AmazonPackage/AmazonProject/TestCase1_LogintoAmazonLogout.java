package AmazonPackage.AmazonProject;

import org.testng.annotations.Test;

public class TestCase1_LogintoAmazonLogout extends BaseClass
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
		
		Thread.sleep(2000);
		homepage.hoveroveraccountandlist(driver);
		homepage.logout();
	}
	
}
