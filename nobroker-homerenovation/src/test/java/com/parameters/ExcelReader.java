//
//package com.parameters;
//
//import java.io.File;
//import java.io.FileInputStream;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//public class ExcelReader {
//
//    public static String readEmailFromExcel(String fileName, String sheetName, int rowNum) {
//        String email = "";
//        try {
//            // Correct path to Exceldata folder
//            String filePath = "src/test/resources/Exceldata/" + fileName;
//            FileInputStream fis = new FileInputStream(new File(filePath));
//
//            Workbook workbook = WorkbookFactory.create(fis);
//            Sheet sheet = workbook.getSheet(sheetName);
//
//            Row row = sheet.getRow(rowNum); // Row index starts from 0
//            if (row != null && row.getCell(0) != null) {
//                email = row.getCell(0).getStringCellValue();
//            }
//
//            workbook.close();
//            fis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return email;
//    }
//
//	
//}



//package com.parameters;
//	import java.io.File;
//	import java.io.FileInputStream;
//	import java.io.IOException;
// 
//	import org.apache.poi.ss.usermodel.DataFormatter;
//	import org.apache.poi.xssf.usermodel.XSSFSheet;
//	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// 
//	public class ExcelReader {
//		File f;
//		FileInputStream fis ;
//		XSSFWorkbook wb;
//		 XSSFSheet sh ;
//		
//	//path of file -- parametrized constructor
//		public ExcelReader(String filepath)
//		{		
//			 try {
//				 f= new File(filepath);
//				fis = new FileInputStream(f);
//				wb= new XSSFWorkbook(fis);
//				
//			} catch (IOException e)
//			 {			
//				e.printStackTrace();
//			}
//		}
//		//data from cell
//		public String getCellData(int sheetno , int row , int col)
//		{
//			sh = wb.getSheetAt(sheetno);
//			
//			 DataFormatter formatter = new DataFormatter();
//			 String value=formatter.formatCellValue(sh.getRow(row).getCell(col));
//			
//			//String value=sh.getRow(row).getCell(col).getStringCellValue();
//			return value;
//		}
//		
//		//count of rows
//		public int getRowcount(int sheetno)
//		{
//			sh = wb.getSheetAt(sheetno);
//			int rows=sh.getLastRowNum();
//			return rows;
//		}
//		
//		//count of columns
//		public int getColcount(int sheetno)
//		{
//			sh = wb.getSheetAt(sheetno);
//			int cols=sh.getRow(0).getLastCellNum();
//			return cols;
//		}
//	
//	
//		
// 
//	}
//package com.parameters;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelReader {
//    File f;
//    FileInputStream fis;
//    XSSFWorkbook wb;
//    XSSFSheet sh;
//
//    public ExcelReader(String filepath) {
//        try {
//            f = new File(filepath);
//            fis = new FileInputStream(f);
//            wb = new XSSFWorkbook(fis);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public String getCellData(int sheetno, int row, int col) {
//        sh = wb.getSheetAt(sheetno);
//        DataFormatter formatter = new DataFormatter();
//        return formatter.formatCellValue(sh.getRow(col).getCell(row));
//    }
//}
// 
//	
// 
// 
// 
// 



package com.parameters;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelReader {
    private String filePath;

    public ExcelReader(String filePath) {
        this.filePath = filePath;
    }

    public String getCellData(int sheetIndex, int rowIndex, int colIndex) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(colIndex);
            return cell.toString();
        } catch (Exception e) {
            throw new RuntimeException("Failed to read Excel: " + e.getMessage());
        }
    }
}