//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://www.edureka.co");
		//Thread.sleep(10000);
		 driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Java");
		 //Thread.sleep(10000);
		 driver.findElement(By.xpath("//div[@class='search_input_result']")).click();

	
		//driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Java");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='search_input_result']")).click();

		//WebElement course = driver.findElement(By.xpath("//a[@class='nav-link ga_category_upfront'][normalize-space()='Cloud Computing']"));
		//course.isDisplayed();
		//course.isEnabled();
		//course.click();

	}

}
