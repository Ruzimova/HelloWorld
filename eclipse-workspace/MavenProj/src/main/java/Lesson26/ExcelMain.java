package Lesson26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream readFile = new FileInputStream("src/test/java/Excel/MyExcel.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(readFile);
		XSSFSheet sheet = workbook.getSheet("naza");
		// XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.rowIterator();
		Row row;
		Cell cell;

		while (rowIterator.hasNext()) {
			row = rowIterator.next();

			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				cell = cellIterator.next();

				String data = cell.getStringCellValue();
				System.out.println(data);
			}

		}
	}

}
