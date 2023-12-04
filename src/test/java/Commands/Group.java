package Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group 
{
	@Test
	public void facebook ()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(groups = "Food")
	public void swigy ()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}
	
	@Test(groups = "Food")
	public void zomato ()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/india");
	}

}
