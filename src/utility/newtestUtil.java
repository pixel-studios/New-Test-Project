package utility;

import java.util.ArrayList;

import newutilpackage.Xls_Reader;

public class newtestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try{
			reader=new Xls_Reader("D://Ashwin//workspace//NewTestNg//src//dataEngine//Crmcalendardata.xlsx");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		for(int rowCnt=2;rowCnt<=reader.getRowCount("testdata");rowCnt++){
				String Titlecrm=reader.getCellData("testdata","Title",rowCnt);
				String Descriptioncrm=reader.getCellData("testdata","Description",rowCnt);
				String startdatecrm=reader.getCellData("testdata","startdates",rowCnt);
				String enddatecrm=reader.getCellData("testdata","enddates",rowCnt);
				Object ob[]={Titlecrm,Descriptioncrm,startdatecrm,enddatecrm};
				myData.add(ob);
			}
		return myData;
	}
}
