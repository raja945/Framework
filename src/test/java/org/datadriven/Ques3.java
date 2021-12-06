package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques3 {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\Satz\\eclipse-workspace\\Framework\\Data\\Login_Details.xlsx");
	
	FileInputStream fIn=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(fIn);
	Sheet sh = w.getSheet("ques1to3");
	int rownum = sh.getPhysicalNumberOfRows();
	
	sh.createRow(rownum);
	FileOutputStream fOut=new FileOutputStream(f);
	w.write(fOut);
}
}
