import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise");

WebElement checkbox =  driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount"));
Assert.assertFalse(checkbox.isSelected());
System.out.println(checkbox.isSelected());
checkbox.click();
Assert.assertTrue(checkbox.isSelected());
//taskkill /F /IM iexplore.exe.click();
System.out.println(checkbox.isSelected());
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


	}

}
