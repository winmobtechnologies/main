package selenium.framework.operation;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;

import org.apache.poi.xssf.usermodel.XSSFCell;

public class ReadExcel {

	Workbook wbWorkbook;
	XSSFSheet shSheet;

	public void openSheet(String filePath) {
		FileInputStream ExcelFileToRead;
		try {
		
			ExcelFileToRead = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		 	shSheet= wb.getSheetAt(0);
		 	
		} catch (FileNotFoundException e) {
			System.out.println("Please make sure the input file is present Test.xls \n");

			e.printStackTrace();
		}  catch (IOException e) {
		
		System.out.println("Please make sure the input file is present Test.xls \n");
			e.printStackTrace();
		}
	
	
	}

	public String getValueFromCell(int iColNumber, int iRowNumber) {
	
		XSSFRow row; 
		XSSFCell cell;
		row = shSheet.getRow(iRowNumber);
		if (row != null) {
			  cell = row.getCell(iColNumber);
			if ( cell != null)
			{
			 return cell.getStringCellValue();
			}  
			else
			{
			return null;
			}
		}
		else
		{
		return null;
		}
		
	}

	public int getRowCount() {
	 try
	 {
		return shSheet.getLastRowNum();
	 }
	 catch (NullPointerException e)
	 {
		 e.printStackTrace();
		 return 0;
		 
	 }
	 
	 	
	}

}