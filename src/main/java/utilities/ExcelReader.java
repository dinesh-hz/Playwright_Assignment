package utilities;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static String getCellDataByColumnName(int rowNum, String columnName)  {

		try {

			FileInputStream File = new FileInputStream("./src/test/resources/External_Data/ExcellData_utilies.xlsx");

			Workbook wb = WorkbookFactory.create(File);

			Sheet sheet = wb.getSheetAt(0);

			Row headerRow = sheet.getRow(0);

			Map<String, Integer> Map = new HashMap<>();

			for (int col = 0; col < headerRow.getPhysicalNumberOfCells(); col++) {

				Cell cell = headerRow.getCell(col);

				String trim = cell.getStringCellValue().trim();

				Map.put(trim, col);
			}

			int targetCol = Map.get(columnName);

			Row targetRow = sheet.getRow(rowNum);

			Cell cell = targetRow.getCell(targetCol);

			wb.close();

			return cell.toString();

		} catch (Exception e) {

			throw new RuntimeException();
		}

	}
}
