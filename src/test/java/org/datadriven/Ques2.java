package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques2 {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\Satz\\eclipse-workspace\\Framework\\Data\\Login_Details.xlsx");
	
	FileInputStream filein=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(filein);
	
	Sheet sh = w.getSheet("ques1to3");
	
	int rownum = sh.getPhysicalNumberOfRows();
	
	for (int i = 0; i < rownum; i++) {
		
		Row row = sh.getRow(i);
		
		int cellnum = row.getPhysicalNumberOfCells();
		
		for (int j = 0; j < cellnum ; j++) {
			
			Cell cell = row.getCell(j);
			System.out.println(cell);
		}
	}
}
}
