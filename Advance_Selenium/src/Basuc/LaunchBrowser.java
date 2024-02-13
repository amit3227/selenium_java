package Basuc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void Launchbrowser() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://filmyfly.ink/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}

}
