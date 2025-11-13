package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDynamicDataIntoExel {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "/testdata/myfile_dynamic.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("DynamicData");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many rows?");
        int noOfRows = sc.nextInt();

        System.out.println("Enter how many cells?");
        int noOfCells = sc.nextInt();

        for (int r = 0; r < noOfRows; r++) {
            XSSFRow row = sheet.createRow(r);

            for (int c = 0; c < noOfCells; c++) {
                XSSFCell cell = row.createCell(c);
                cell.setCellValue(sc.next());
            }
        }

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("Excel file created successfully!");
    }
}
