package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {

		// Download and set the path
		WebDriverManager.chromedriver().setup();

		// Launch a chrome browser
		ChromeDriver driver = new ChromeDriver();
		

		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// waits for 10 secs if the element not in DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize the browser
		driver.manage().window().maximize();

		// Locate the username and enter the username as
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");

		// locate the password and the enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// locate the login button and click on it
		driver.findElement(By.className("decorativeSubmit")).click();

		// click on crm/fsa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// verify if the landing page is correct
		String title = "My Home | opentaps CRM";
		String homeTitle = driver.getTitle();
		if (title.equals(homeTitle))
		{
			System.out.println("In the Homepage");
		}
		else
			System.out.println("Not in Homepage");
		}
		//webElement countryCode = driver.findElement(By.id(""));
		//countryCode.clear();
		
		
		

	}


