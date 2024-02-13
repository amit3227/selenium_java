package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcel {
	
	
	public static void data(String sheet,int row, int column) throws EncryptedDocumentException, IOException {
		try {
			FileInputStream fis=new FileInputStream("./test_data/Demoebshop.xlsx");
			//create obj of Workbook
			Workbook workbook=WorkbookFactory.create(fis);
			Sheet sheet1 = workbook.getSheet(sheet);
			
			String cell_value=sheet1.getRow(row).getCell(column).getStringCellValue();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
