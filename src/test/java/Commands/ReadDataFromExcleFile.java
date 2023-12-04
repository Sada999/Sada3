package Commands;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcleFile 
{
	@Test
	public void data() throws EncryptedDocumentException, IOException
	{
		FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\VtigerOrganization.xlsx");
	
		Workbook work = WorkbookFactory.create(fileInputStream);
		
		Sheet sh = work.getSheet("Sheet1");
		Row r = sh.getRow(1);
		Cell  c = r.getCell(1);
		
		String data = c.getStringCellValue();
		System.out.println(data);
	
	}
}
