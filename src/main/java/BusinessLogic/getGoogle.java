package BusinessLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class getGoogle {
	
	WebDriver driver;
 
	public void getGooglepage()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}

	public void getYouTube()
	{
		System.out.println("It's You Tube");
	}
	
	public void getYahoo()
	{
		System.out.println("It's yahoo");
	}
	
	
}
