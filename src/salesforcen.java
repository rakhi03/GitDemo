import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforcen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=en");
		driver.findElement(By.id("username")).sendKeys("xyz");
		driver.findElement(By.name("pw")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
				//*[@id="Login"]
		//$x("//*[@id='Login']")
		//#Login
		//*[@id="Login"]
		//#Login
	}

}