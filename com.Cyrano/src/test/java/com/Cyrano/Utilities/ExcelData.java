package com.Cyrano.Utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {

	XSSFWorkbook wb;
	public ExcelData() {
		
		File src = new File("./TestData/Data.xlsx");
		try {
		
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
	
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getStringData(int sheet, int row, int column) {
		return wb.getSheetAt(sheet).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheet, int row, int column) {
		return wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		
	}
	public double getNumericData(String sheet, int row, int column) {
		return wb.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue();
	}
	
}
