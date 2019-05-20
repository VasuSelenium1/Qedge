package vasudeva.QedgeOJT;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest 
{
	@Test
	public void Sel()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Gmail.com");
	}
		
	
  
}
