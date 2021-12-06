package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingDataFromExcel {
	public static void main(String[] args) throws IOException {
		
	File f=new File("C:\\Users\\Satz\\eclipse-workspace\\Framework\\Data\\Login_Details.xlsx");
	FileInputStream fIn=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fIn);
	
	Sheet sh = w.getSheet("adactin_login_details");
	int rowcount = sh.getPhysicalNumberOfRows();
	for (int i = 0; i < rowcount; i++) {
		Row row = sh.getRow(i);
		int cellcount = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cellcount; j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
	
	if (cellType==1) {
		String stringCellValue = cell.getStringCellValue();
		System.out.println(i+" "+j+" "+stringCellValue);
	}else if (cellType==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
		Date d= cell.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
		String format = sim.format(d);
		System.out.println(i+" "+j+" "+format);
	}else {
		double doub = cell.getNumericCellValue();
		long l=(long)doub;
		String valueOf = String.valueOf(l);
		System.out.println(i+" "+j+" "+valueOf);
	}}
	}}}}

