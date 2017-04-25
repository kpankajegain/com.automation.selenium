package xlsreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {

	@Test
	public static void fn_writeread() throws IOException {
		{
		//public void fn_readXlsFile() throws IOException
//		{
			File src = new File("D:\\QAWorkspace\\TestingData\\Data.xlsx");
			System.out.println("Excel loaded");
			FileInputStream fis = new FileInputStream(src); 
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheetAt(0);
			sh.getRow(0).createCell(2).setCellValue("egain");
			sh.getRow(1).createCell(2).setCellValue("Pune");
			FileOutputStream fout = new FileOutputStream(src);
			wb.write(fout);
			wb.close();
}
}
}