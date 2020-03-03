package executionEngine;

import java.lang.reflect.Method;
import config.ActionKeywords;
//import config.Constants;
import utility.ExcelUtils;


public class DriverScript {
	 public static String sActionKeyword;
	 public static Method method[];
	
	 public DriverScript() throws NoSuchMethodException, SecurityException{
		 actionKeywords = new ActionKeywords();
		 method = actionKeywords.getClass().getMethods();
		 }
	 
	 public static void main(String[] args) throws Exception {
		
		// Declaring the path of the Excel file with the name of the Excel file
	   //  String sPath = Constants.Path_TestData;
	     
	    // Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
	  //   ExcelUtils.setExcelFile(sPath, Constants.Sheet_TestSteps);
	     
	     for (int iRow=1;iRow<=9;iRow++){
	    	//Storing the value of excel cell in sActionKeyword string variable
	         sActionKeyword = ExcelUtils.getCellData(iRow, 3);
	         execute_Actions();
	         }
	}
	 
	 private static void execute_Actions() throws Exception {
		 //This is a loop which will run for the number of actions in the Action Keyword class 
		 //method variable contain all the method and method.length returns the total number of methods
		 for(int i = 0;i < method.length;i++){
		 //This is now comparing the method name with the ActionKeyword value got from excel
		 if(method[i].getName().equals(sActionKeyword)){
		 //In case of match found, it will execute the matched method
		 method[i].invoke(actionKeywords);
		 //Once any method is executed, this break statement will take the flow outside of for loop
		 break;
		 }
       }
	 }

}
