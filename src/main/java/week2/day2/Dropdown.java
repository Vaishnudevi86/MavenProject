package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Launch a chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// waits for 10 secs if the element not in DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		WebElement drop1 = driver
				.findElement(By.xpath("//option[text()='Get the number of dropdown options']/parent::select"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByIndex(3);
	}
}
