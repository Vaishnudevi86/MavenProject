package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		// locate the username
		driver.findElement(By.xpath("//input [@name='USERNAME']")).sendKeys("demosalesmanager");

		// locate the password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");

		// locate login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		// click on crm/fsa link
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();

		// Click on leads tab
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();

		// click on create lead
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();

		// Enter the company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");

		// Enter the first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vaishnu");

		// Enter the last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Natarajan");
		
		// Enter the source
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']/option[2]"));
		Select dropdown1 = new Select(drop1);
		dropdown1.selectByIndex(2);
	}

}
