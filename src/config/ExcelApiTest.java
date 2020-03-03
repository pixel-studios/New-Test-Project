package config;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelApiTest {
	   public FileInputStream fis = null;
	   public static XSSFWorkbook workbook = null;
	   public static XSSFSheet sheet = null;
	   public static XSSFRow row = null;
	   public XSSFCell cell = null;
	   String xlFilePath;
	   
	 public static void main(String[] args) throws Exception {
		   ExcelApiTest eat = new ExcelApiTest("D:\\Ashwin\\workspace\\NewTestNg\\src\\dataEngine\\testdata.xlsx");
	       int colCount = eat.getColumnCount("Sheet1");
	       System.out.println("Total Columns in the Excel : "+colCount);
	       int rowCount = eat.getRowCount("Sheet1");
	       System.out.println("Total Rows in the Excel : "+rowCount);
	       
	       for(int i=1;i<rowCount;i++)
	       {
	    	   for(int j=0;j<colCount;j++)
	    	   {
	    		   System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
	    	   }
	    	   System.out.println();
	       }
	 }
	 
	 public ExcelApiTest(String xlFilePath) throws Exception
	   {
	       this.xlFilePath = xlFilePath;
	       fis = new FileInputStream(xlFilePath);
	       workbook = new XSSFWorkbook(fis);
	       fis.close();
	   }
	 
	 public int getRowCount(String sheetName)
	   {
	       sheet = workbook.getSheet(sheetName);
	       int rowCount = sheet.getLastRowNum()+1;
	       return rowCount;
	   }
	 public int getColumnCount(String sheetName)
	   {
	       sheet = workbook.getSheet(sheetName);
	       row = sheet.getRow(0);
	       int colCount = row.getLastCellNum();
	       return colCount;
	   }

	}
