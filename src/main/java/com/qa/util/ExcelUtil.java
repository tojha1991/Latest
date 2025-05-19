package com.qa.util;



	
	

	import java.io.FileInputStream;
	import java.util.HashMap;
	import java.util.Map;

	import org.apache.poi.ss.usermodel.*;

	public class ExcelUtil {

	    public static Map<String, String> getLoginData(String sheetName) {
	        Map<String, String> data = new HashMap<>();
	        try {
	            FileInputStream fis = new FileInputStream("src/test/resources/TestData.xlsx");
	            Workbook workbook = WorkbookFactory.create(fis);
	            Sheet sheet = workbook.getSheet(sheetName);

	            for (Row row : sheet) {
	                Cell keyCell = row.getCell(0);
	                Cell valueCell = row.getCell(1);
	                if (keyCell != null && valueCell != null) {
	                    data.put(keyCell.getStringCellValue(), valueCell.getStringCellValue());
	                }
	            }

	            workbook.close();
	            fis.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return data;
	    }
	}


