package Sprint_01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce_S06 {

	public static void main(String[] args) {
		
		//Test Steps:
		//	1. Launch Salesforce application https://login.salesforce.com/
		
		WebDriverManager.chromedriver().setup();
		
		// Disable Notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//ChromeDriver driver = new ChromeDriver(options);
		ChromeDriver  driver =new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//	2. Login with username as "makaia@testleaf.com" and password as "India@123"
		
		driver.findElement(By.id("username")).sendKeys("mars@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("BootcampSel$123");
		driver.findElement(By.id("Login")).click();
		
		
		//	3. Click on Learn More link in Mobile Publisher
		//driver.findElementbyxpath
		
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		
		
		//	4. MouseHover on Products and Select Service 
		
		
		
		//	5. Verify the tabs displayed in the page
		
		//	Expected Result:
		//	Below tabs should be displayed
		//	1. Products
		//	2. Company
		//	3. Support & Services
		//	4. Resources
		//	5. COVID-19
		
		

	}
}

