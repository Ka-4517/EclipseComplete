import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheet {

//	public static void main(String[] args) 
//		// TODO Auto-generated method stub
	@Test
	public void dataReadTest() throws IOException {
		File src = new File("C:\\Users\\Karan Gupta\\Downloads\\Dubai_Police_Test case.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook xsf = new XSSFWorkbook(fis);

		XSSFSheet sheet = xsf.getSheetAt(0);
		String entry = sheet.getRow(1).getCell(1).getStringCellValue();
		

		System.out.println("The access value is " + entry);

		xsf.close();

	}
}
