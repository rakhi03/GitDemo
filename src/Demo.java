import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo {


	WebDriver driver;
	
	public void invokeBrowser() {
	
		// TODO Auto-generated method stub
		
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\work chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co");

		
		
		SearchCourse();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void SearchCourse() {
		
		
				
				try {
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
					
					 //driver.findElement(By.xpath("//input[@id='search-input']")).isDisplayed();
				driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Java");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='search_input_result']")).click();
				
				}
				catch(InterruptedException e)
				{
				
					e.printStackTrace();
				}
		
				

	}
public static void main(String[] args)  {
	
	Demo myobj1 = new Demo();
	myobj1.invokeBrowser();
	//myobj1.SeachCourse();
}
	

}
