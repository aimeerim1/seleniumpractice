package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingData {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream((System.getProperty("user.dir")+"/testdata/Data.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Лист1");
        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(0).getLastCellNum();
        System.out.println("number of rows:"+totalRows);
        System.out.println("number of cells:"+totalCells);

        for(int r =0 ; r<=totalRows;r++){
            XSSFRow currentRow =sheet.getRow(r);
            for(int c =0 ;c<totalCells;c++){
                XSSFCell cell =currentRow.getCell(c);
                System.out.print(cell.toString()+"\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }
}
