package Data_Driven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data {


		
		public static void main(String[] args) throws IOException {
			FileOutputStream file= new FileOutputStream (System.getProperty("user.dir")+ "//Test data//Book2.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook();
			XSSFSheet sheet=workbook.createSheet("Sheet1");
		     
			//without for loop
			
			XSSFRow row1=sheet.createRow(0);
			row1.createCell(0).setCellValue("welcome");
			row1.createCell(1).setCellValue("1234");
			row1.createCell(2).setCellValue("automation");
			
			XSSFRow row2=sheet.createRow(1);
			row2.createCell(0).setCellValue("john");
			row2.createCell(1).setCellValue("core");
			row2.createCell(2).setCellValue("java");
			
			
			
			System.out.println("writing of file is completed");
			Scanner sc = new Scanner(System.in);
			
			for (int r=0;r<3;r++)
			{
				XSSFRow currentRow = sheet.createRow(r); 
			
				for (int c=0;c<2;c++)
				{
					System.out.println("Enter the value of cell: ");
					
					String data = sc.next();
					currentRow.createCell(c).setCellValue(data);
					
				}
				
			}
			
			// Printing Values 
			
			for (int a=0;a<3;a++)
			{
				XSSFRow currentRow = sheet.getRow(a);
			
			for (int b=0;b<2;b++)
			{
				
				String cellValue = currentRow.getCell(b).toString();
				System.out.println(cellValue + "      ");
				
			}
				System.out.println();
			}
			
			workbook.write(file);
			workbook.close();
			file.close();

//			workbook.write(file);
//			workbook.close();
//			file.close();

	}

}
