import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("http://google.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());
driver.get("http://yahoo.com");
driver.navigate().back();
driver.close();
driver.get("http://facebook.com");
	}


}
