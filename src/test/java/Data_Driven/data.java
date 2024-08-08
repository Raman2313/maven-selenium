package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//Test data//Book1.xlsx");

		//FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Documents\\Java Programs\\maven_selenium");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//by index
		//XSSFWorkbook sheet = workbook.getSheetAt(0);
		
		
		
		int rows = sheet.getLastRowNum();
	//	int cols = sheet.getRow(1).getCell(rows);
	int col=	sheet.getRow(1).getLastCellNum();
	System.out.println("The number of is " +  rows);
	System.out.println("The number col "  + col);
	for (int r=0; r<=rows; r++) 
	{// rows
		XSSFRow currentRow=sheet.getRow(r) ;
		for (int c=0; c<col; c++) 
		{
		String cellvalue=currentRow.getCell(c) .toString();
		System.out.println(cellvalue+ " ");

		}
		System.out. println();

	}
	}

}
