package utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	
	public static void SetExcelFile(String Path,String SheetName){
		try{
			//Open the Excel File
			FileInputStream ExcelFile=new FileInputStream(Path);
			//Access the required test data from excel
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	 
    public static String getCellData(int RowNum, int ColNum) throws Exception{

    	try{

    		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

    		String CellData = Cell.getStringCellValue();

    		return CellData;

    	}catch (Exception e){
	   
	   return"";

    }

  }
}
