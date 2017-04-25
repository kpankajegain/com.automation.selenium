package xlsreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class ReadXlsFile {
	public static void fn_xlsread() throws IOException {
	{
	//public void fn_readXlsFile() throws IOException
//	{
		File src = new File("D:\\QAWorkspace\\TestingData\\Data.xlsx");
		System.out.println("Excel loaded");
		FileInputStream fis = new FileInputStream(src); 
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		int rowcount=sh.getLastRowNum();
		System.out.println("The rowcount is:" + rowcount);
		for (int i=0;i<rowcount;i++)
		{
			Row row=sh.getRow(i);
			{
				for(int j=0;j<row.getLastCellNum();j++)
				
					 System.out.print(row.getCell(j).getStringCellValue()+"|| ");
						}
			System.out.println();
		}
						
		wb.close();
	}
	}
}