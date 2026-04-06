package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
      
	@DataProvider(name = "bookingData")
	 public Object[][] getExcelData() {

	        Object[][] data = null;
	        
	        String path = System.getProperty("user.dir") 
	                + "/src/test/resources/ExcelSheet/BookingData.xlsx";

	        try {
	            FileInputStream fis = new FileInputStream(path);
	            Workbook wb = WorkbookFactory.create(fis);
	            Sheet sheet = wb.getSheet("Sheet1");

	            int rowCount = sheet.getPhysicalNumberOfRows();
	            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

	            data = new Object[rowCount - 1][colCount];

	            for (int i = 1; i < rowCount; i++) {
	                Row row = sheet.getRow(i);

	                for (int j = 0; j < colCount; j++) {
	                    Cell cell = row.getCell(j);
	                    data[i - 1][j] = cell.toString();
	                }
	            }

	            wb.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return data;
	    }
}
