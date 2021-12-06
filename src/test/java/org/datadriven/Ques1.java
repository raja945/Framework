package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques1 {
	
public static void main(String[] args) throws IOException {
	int sum=0;
	
	File f=new File("C:\\Users\\Satz\\eclipse-workspace\\Framework\\Data\\Login_Details.xlsx");
	
	FileInputStream filein =new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(filein);
	
	Sheet sh = w.getSheet("ques1to3");
	
	int rownum = sh.getPhysicalNumberOfRows();
	System.out.println("Total No of Cells: "+rownum);
	
	for (int i = 0; i < rownum ; i++) {
		
		Row row = sh.getRow(i);
		int cellnum = row.getPhysicalNumberOfCells();
		sum=cellnum+sum;
	}
	System.out.println("Total No of Rows: "+sum);
	
}
}
