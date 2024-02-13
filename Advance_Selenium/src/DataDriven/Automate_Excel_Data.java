package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Objects;



public class Automate_Excel_Data extends Base {
	
	@Test(dataProvider="credential")
	public void testCase(String username,String password) {
		driver.findElement(By.id("Email")).sendKeys(username,Keys.TAB,password,Keys.ENTER);
		
	}
	
	
	@DataProvider(name="credential")
	public Object[][]data() throws EncryptedDocumentException, IOException  {
	
		return ExcelUtility.fetchdata("Sheet2");
	}

}
