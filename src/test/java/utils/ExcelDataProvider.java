package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

public class ExcelDataProvider {
	WebDriver driver=null;
	@BeforeTest
	public void setUpTest() {
		//String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guest1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(dataProvider ="test1data")
	public void test1(String firstName, String lastName, String email, String password ) throws InterruptedException {
		driver.get("https://signup.ebay.com.au/pa/crte");
		driver.findElement(By.id("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2500);
		
		
	}
	
	@DataProvider(name ="test1data")
	public  Object[][] getData() {
	   String excelPath = "C:\\Users\\Guest1\\eclipse-workspace\\MavenDemoTest\\Excel\\data.xlsx";
	   Object data[][] = testData(excelPath, "Sheet1");
	   return data;
	}
public Object[][] testData(String excelPath, String sheetName) {
	ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
	int rowCount = excel.getRowCount();
	int colCount = excel.getColCount();
	Object data[][] = new Object[rowCount-1][colCount];
	for(int i=1; i<rowCount; i++) {
		for(int j=0; j<colCount; j++) {
		String cellData = excel.getCellDataString(i,j);
		//System.out.print(cellData+"  | ");
		data[i-1][j] = cellData;
		}
		//System.out.println();
	}
	return data;
}

}
