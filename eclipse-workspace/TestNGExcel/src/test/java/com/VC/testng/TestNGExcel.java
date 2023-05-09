package com.VC.testng;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestNGExcel {
	static XSSFSheet SheetReference;
	static XSSFWorkbook objwb;
	static int rowcount;

	public static void main(String[] args) throws IOException {
		
		RowDataCount();
		//CellDataCount();
	}

	public static void RowDataCount() {
//		creates an excel file at the specified location 
		try {
			
		
		String projectPath = System.getProperty("user.dir");
		objwb = new XSSFWorkbook(projectPath+"//Excel/Data.xlsx");
		SheetReference = objwb.getSheet("Mobile App Checklist");
		rowcount = SheetReference.getPhysicalNumberOfRows();
		System.out.println("No. of rows " + rowcount);
		
		}catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

//	public static void CellDataCount() throws IOException {
//		objwb = new XSSFWorkbook("C:/Users/Karan Gupta/eclipse-workspace/TestNGExcel/Excel/Data.xls.et");
//		SheetReference = objwb.getSheet("Sheet1");
//		String Cell = SheetReference.getRow(0).getCell(0).getStringCellValue();
//		System.out.println("No. of cells " + Cell);
//
//	}

}
