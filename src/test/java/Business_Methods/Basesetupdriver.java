package Business_Methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.Browserconfig;
import Utilities.DataProvider;

public class Basesetupdriver extends Browserconfig {
	public static Properties prop;
	public static Properties prop1;
	public static WebDriver driver;
	public static DataProvider obj = new DataProvider();
	// public static String testCaseID="TC001";
	public static String sheetName = "Sheet1";

	public static HashMap<String, String> excelHashMapValues = new HashMap<String, String>();

	public static void ReadPropertyfile_and_OpenBrowser() throws IOException, Exception {

		prop = new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("PropertiesList/Config.properties"));
		prop.load(reader);
		BufferedReader reader_1 = new BufferedReader(new FileReader(prop.getProperty("roles")));
		prop.load(reader_1);
		BufferedReader reader_2 = new BufferedReader(new FileReader(prop.getProperty("DB_Data")));
		prop.load(reader_2);
		BufferedReader reader_3 = new BufferedReader(new FileReader(prop.getProperty("Directory")));
		prop.load(reader_3);
		driver = choosebrowser("chrome",
			"https://s2bssotest.standardchartered.com/unifiedlogin/v2.0/login/index.html?language=en");

	}

	public static void ReadPropertyfile_and_OpenBrowser1() throws IOException, Exception {

		prop1 = new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("PropertiesList/Config.properties"));
		prop1.load(reader);
		BufferedReader reader_1 = new BufferedReader(new FileReader(prop1.getProperty("roles")));
		prop1.load(reader_1);
		BufferedReader reader_2 = new BufferedReader(new FileReader(prop1.getProperty("DB_Data")));
		prop1.load(reader_2);
		BufferedReader reader_3 = new BufferedReader(new FileReader(prop1.getProperty("Directory")));
		prop1.load(reader_3);
		driver = choosebrowser("chrome", "https://www.amazon.com/");

	}

	public static void tkscr(WebDriver driver, String fileWithPath) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);

	}

}
