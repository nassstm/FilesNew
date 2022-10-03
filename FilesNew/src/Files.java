import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Files {
    public static void readFromExcel() throws IOException {

            // Reading file from local directory
            FileInputStream file = new FileInputStream(new File("C:\\Users\\nasss\\java.xls"));
            Workbook wb = new HSSFWorkbook(file);
            String res = wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
            System.out.println(res);
            file.close();

    }
}