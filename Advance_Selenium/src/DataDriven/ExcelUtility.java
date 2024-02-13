package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public static Object[][] fetchdata(String sheet) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("D:\\amitworkspace\\Advance_Selenium\\test_data\\Demowebshop.xlsx");
		//create obj of Workbook
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet s = workbook.getSheet(sheet);
		int rowsize = s.getPhysicalNumberOfRows();
		int cellsize = s.getRow(0).getPhysicalNumberOfCells();
		
		
		Object[][] d = new Object[rowsize][cellsize];
		
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<cellsize;j++) {
				d[i][j]=s.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return d;
	}

}
