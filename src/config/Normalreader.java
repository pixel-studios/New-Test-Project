package config;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Normalreader {
	public static void main(String[] args) {
		try{
			File src=new File("D://Ashwin//workspace//NewTestNg//src//dataEngine//testdata.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh1=wb.getSheetAt(0);
			//XSSFSheet sh2=wb.getSheetAt(1);
			System.out.print(sh1.getRow(0).getCell(0).getStringCellValue()+"\t|");
			System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			System.out.print(sh1.getRow(1).getCell(0).getStringCellValue()+"\t|");
			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			
			/*System.out.print(sh2.getRow(0).getCell(0).getStringCellValue()+"\t|");
			System.out.println(sh2.getRow(0).getCell(1).getStringCellValue());
			System.out.print(sh2.getRow(1).getCell(0).getStringCellValue()+"\t|");
			System.out.println(sh2.getRow(1).getCell(1).getStringCellValue());*/
			wb.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		}

}
