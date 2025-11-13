package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDatainSpecifRowAndCell {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "/testdata/data.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Data");
        // XSSFSheet sheet workbook.getSheetAt(0);
        XSSFRow row = sheet.createRow(3);
        XSSFCell cell = row.createCell(4);
        cell.setCellValue("WElcome");
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File is created");
    }
}