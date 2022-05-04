package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] excelfile(String file) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+file+".xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(1); // row-->cell
		// XSSFCell cell = row.getCell(1);

		int RowCount = sheet.getLastRowNum();
		System.out.println(RowCount);

		int colCount = row.getLastCellNum();
		System.out.println(colCount);

		String[][] data = new String[RowCount][colCount];

		for (int i = 1; i <= RowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
				data[i - 1][j] = stringCellValue2;
				// data[0][0]

			}
		}

		wb.close();
		return data;
	}

}
