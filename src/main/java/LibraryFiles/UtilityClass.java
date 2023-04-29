package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	//fetch data from excel sheet
	
		public static String getData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\Kiran Chandgude\\eclipse-workspace\\EcommerceSauceDemo\\Test Data\\saucedemo.xlsx");
			String value=WorkbookFactory.create(file).getSheet("sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
			return value;
			
		}
		
		//fetch property filedata
		
		public static String getPfData(String key) throws IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\Kiran Chandgude\\eclipse-workspace\\EcommerceSauceDemo\\Properties.properties");
			Properties p=new Properties();
			p.load(file);
			String value=p.getProperty(key);
		    return value;
		}
		
		//capture Screenshot for fail test
		
		public static void captureScreenshot(WebDriver driver,int TCID) throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Kiran Chandgude\\eclipse-workspace\\EcommerceProject\\ScreenShots\\"+TCID+".jpg");
			FileHandler.copy(src,dest);
		}

		//select option from search filter

}
