package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	/**
	 * This method is used to fetch data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @author DELL
	 */
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		 FileInputStream fes=new FileInputStream("./src/test/resources/ExcelsheetData.xlsx");
		    Workbook book = WorkbookFactory.create(fes) ;
		    Sheet sheet = book.getSheet(sheetName);
			Row Row = sheet.getRow(rowNum);
			Cell cell = Row.getCell(cellNum);
			String value = cell.getStringCellValue();
		
		return value;
		
	}


	public String getExcelDataFormatter(String sheetName,int rowNum,int cellNum) throws Throwable
	{
		 FileInputStream fes=new FileInputStream("./src/test/resources/ExcelSheetData.xlsx");
	        Workbook book = WorkbookFactory.create(fes);
	        DataFormatter format=new DataFormatter();
	       String data = format.formatCellValue(book.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
	        return data;
		
}
	public Object[][] readMultipleData(String SheetName) throws Throwable{
		FileInputStream fis1=new FileInputStream("src/test/resources/ExcelSheetData.xlsx");
        Workbook book=WorkbookFactory.create(fis1);
       
        Sheet sh = book.getSheet(SheetName);
        int lastRow = sh.getLastRowNum()+1;
        int lastCell = sh.getRow(0).getLastCellNum();
        
//        Sheet sheet = book.getSheet(SheetName);
//      int numrow = sheet.getPhysicalNumberOfRows();//num of rows
//      int numcel = sheet.getRow(0).getLastCellNum();

  	Object[][] obj = new Object[lastRow][lastCell];
	
	for(int i=0;i<lastRow;i++)
	{
		for(int j=0;j<lastCell;j++)
		{
			obj[i][j]	=sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return obj ;
		}
	}
