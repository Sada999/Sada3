package Commands;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataFromPropertyFile 
{
	WebDriver driver;
	
	@Test
	public void read() throws IOException
	{
		FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\vtigerCrdentials.properties");
		
		Properties properties = new Properties();
		properties.load(fileInputStream);
		
		String browser = properties.getProperty("browser");
		String url1 = properties.getProperty("url");
		String user = properties.getProperty("username");
		String pass = properties.getProperty("password");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url1);
		driver.findElement(By.name("user_name")).sendKeys(user);
		driver.findElement(By.name("user_password")).sendKeys(pass);
		driver.findElement(By.id("submitButton")).click();
	}

}
