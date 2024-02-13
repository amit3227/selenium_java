package DataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Browser Launched",true);
	}
	
	@BeforeMethod
	public void Login() {
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("User Login",true);
	}
	
	@AfterMethod
	public void Logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("User Logout",true);
	}
	@AfterClass
	public void quitBrowser() {
		Reporter.log("Browser Closed",true);
		driver.quit();
	}
	
	

}
