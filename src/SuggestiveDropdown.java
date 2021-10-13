//import java.awt.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise");
driver.findElement(By.id("autosuggest")).sendKeys("ind");
Thread.sleep(3000);
  List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
  
  for (WebElement Option:options)
  {
	  if(Option.getText().equalsIgnoreCase("India"))
	  {
		  
		  Option.click();
		  //when option is found as India break the iteration and come out of for loop
		  break;
	  }
	  
	}

}
}
