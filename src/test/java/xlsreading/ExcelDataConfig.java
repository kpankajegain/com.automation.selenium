package xlsreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataConfig {
	XSSFWorkbook wbook;
	static XSSFSheet sheet1;
@Test
	public ExcelDataConfig (String ExcelPath) throws IOException{
			File src = new File("D:\\QAWorkspace\\TestingData\\Demo.xlsx");
			FileInputStream fis = new FileInputStream(src); 
			XSSFWorkbook wbook = new XSSFWorkbook(fis);
			sheet1=wbook.getSheetAt(0);	
			String agentname;
			agentname=sheet1.getRow(0).getCell(0).getStringCellValue();
			System.out.println(agentname);
			System.out.println(sheet1.getRow(0).getCell(1).getStringCellValue());	
			System.out.println(sheet1.getRow(1).getCell(0).getStringCellValue());	
			System.out.println(sheet1.getRow(1).getCell(1).getStringCellValue());	
		}}

		
		
