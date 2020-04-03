package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;

import Business_Methods.Basesetupdriver;
import Object_Repository.TranslateCode;
import Utilities.Commonmethods;
import Utilities.DataProvider;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TranslateStepDef {
	DataProvider obj = new DataProvider();
	public static String testCaseId = "";
	public static String sheetName = "Sheet1";
	public static String Logintext = "";
	public static String device = "";
	public static String textlogo = "";
	public static String outputtext1 = "";
	public static String outputtext2 = "";
	public static String outputtext3 = "";

	@Given("User is on S{int}bNG page")
	public void user_is_on_S_bNG_page(Integer int1) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		Basesetupdriver.driver = new ChromeDriver();
		Basesetupdriver.driver.manage().window().maximize();
		Basesetupdriver.driver
				.get("https://s2bssotest.standardchartered.com/unifiedlogin/v2.0/login/index.html?language=es");
		WebElement Logintitle = Basesetupdriver.driver.findElement(TranslateCode.LoginTitle);
		Logintext = Logintitle.getText();
		WebElement activedevice = Basesetupdriver.driver.findElement(TranslateCode.Activedevice);
		device = activedevice.getText();
		WebElement Logotext = Basesetupdriver.driver.findElement(TranslateCode.LogoText);
		textlogo = Logotext.getText();
		Basesetupdriver.driver.close();

	}

	@When("User navigate S{int}Bngpage to google translator page")
	public void user_navigate_S_Bngpage_to_google_translator_page(Integer int1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		Basesetupdriver.driver = new ChromeDriver();
		Basesetupdriver.driver.manage().window().maximize();
		Basesetupdriver.driver.get("https://translate.google.co.in/");

	}

	@When("user enter the text in translate page")
	public void user_enter_the_text_in_translate_page() throws Throwable {
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(TranslateCode.Translateinputtext),
				"Inicio de sesión");
		Thread.sleep(5000);
		WebElement Translateoutputtext1 = Basesetupdriver.driver.findElement(TranslateCode.Translateoutputtext);
		outputtext1 = Translateoutputtext1.getText();
		System.out.println(outputtext1);
		Basesetupdriver.driver.findElement(TranslateCode.Translateinputtext).clear();
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(TranslateCode.Translateinputtext),
				"Active Su Dispositivo Ahora");
		Thread.sleep(5000);
		WebElement Translateoutputtext2 = Basesetupdriver.driver.findElement(TranslateCode.Translateoutputtext);
		outputtext2 = Translateoutputtext2.getText();
		System.out.println(outputtext2);
		Basesetupdriver.driver.findElement(TranslateCode.Translateinputtext).clear();
		Commonmethods.sendKeys(Basesetupdriver.driver.findElement(TranslateCode.Translateinputtext),
				"La plataforma bancaria digital de Standard Chartered para clientes empresariales globales");
		Thread.sleep(5000);
		WebElement Translateoutputtext3 = Basesetupdriver.driver.findElement(TranslateCode.Translateoutputtext);
		outputtext3 = Translateoutputtext3.getText();
		System.out.println(outputtext3);
		Basesetupdriver.driver.findElement(TranslateCode.Translateinputtext).clear();

	}

	@Then("user get the output translate text")
	public void user_get_the_output_translate_text() {
		System.out.println("Success");

	}

	@Then("user verify the translated text from datasheet {string}")
	public void user_verify_the_translated_text_from_datasheet(String string) throws FilloException, IOException {

		testCaseId = string;
		obj.writeExcelData(testCaseId, sheetName, "Text1", Logintext);
		obj.writeExcelData(testCaseId, sheetName, "Text2", device);
		obj.writeExcelData(testCaseId, sheetName, "Text3", textlogo);
		obj.writeExcelData(testCaseId, sheetName, "TranslatedText1", outputtext1);
		obj.writeExcelData(testCaseId, sheetName, "TranslatedText2", outputtext2);
		obj.writeExcelData(testCaseId, sheetName, "TranslatedText3", outputtext3);

		Basesetupdriver.excelHashMapValues = obj.extractExcelData(testCaseId, sheetName);
		String Actualtxt1 = Business_Methods.Basesetupdriver.excelHashMapValues.get("ActualText1");
		String Actualtxt2 = Business_Methods.Basesetupdriver.excelHashMapValues.get("ActualText2");
		String Actualtxt3 = Business_Methods.Basesetupdriver.excelHashMapValues.get("ActualText3");

		String ExpectedMessage1 = Business_Methods.Basesetupdriver.excelHashMapValues.get("TranslatedText1");
		if (Actualtxt1.equals(ExpectedMessage1)) {
			obj.writeExcelData(testCaseId, "Sheet1", "Result1", "Pass");
		} else {
			obj.writeExcelData(testCaseId, "Sheet1", "Result1", "Fail");
		}

		String ExpectedMessage2 = Business_Methods.Basesetupdriver.excelHashMapValues.get("TranslatedText2");
		if (Actualtxt2.equals(ExpectedMessage2)) {
			obj.writeExcelData(testCaseId, "Sheet1", "Result2", "Pass");
		} else {
			obj.writeExcelData(testCaseId, "Sheet1", "Result2", "Fail");
		}
		String ExpectedMessage3 = Business_Methods.Basesetupdriver.excelHashMapValues.get("TranslatedText3");
		if (Actualtxt3.equals(ExpectedMessage3)) {
			obj.writeExcelData(testCaseId, "Sheet1", "Result3", "Pass");
		} else {
			obj.writeExcelData(testCaseId, "Sheet1", "Result3", "Fail");
		}
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		Basesetupdriver.driver.close();
	}

}
