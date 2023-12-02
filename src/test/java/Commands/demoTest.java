package Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest 
{
	@Test
	public void facebookTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		System.out.println(driver.getTitle());
		
	}

}
