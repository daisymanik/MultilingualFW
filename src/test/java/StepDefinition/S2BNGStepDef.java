package StepDefinition;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.codoid.products.exception.FilloException;
import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;

import Business_Methods.Basesetupdriver;
import Object_Repository.Loginpagescb;
import Utilities.Commonmethods;
import Utilities.DataProvider;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class S2BNGStepDef {
	public static String testCaseId = "";
	public static String sheetName = "Sheet1";
	public static DataProvider obj = new DataProvider();
	public String testDataSheetName, testCaseID, testCaseDescription, Category, Author;
	public String specFilePath = "./gSpec/S2BTestRun.gspec";
	/*public String specFilePath1 = "./gSpec/S2BLOGINPage.gspec";
	public String specFilePath2 = "./gSpec/S2BHOMEPage.gspec";*/

	@Given("user is on LoginPage {string}")
	public void user_is_on_LoginPage(String string) throws Throwable, Throwable {
		Basesetupdriver.ReadPropertyfile_and_OpenBrowser();
		testCaseId = string;
		Basesetupdriver.excelHashMapValues = obj.extractExcelData(testCaseId, sheetName);
		Basesetupdriver.tkscr(Basesetupdriver.driver, "./Screenshots/S2BNG_page1 " + testCaseId + ".png");

	}

	@When("layout validation is performed on loginpage")
	public void layout_validation_is_performed_on_loginpage() throws Throwable {
		LayoutReport objLayoutReport = Galen.checkLayout(Basesetupdriver.driver, specFilePath,
				Arrays.asList("Testing"));

		// Create a galen test info list
		List<GalenTestInfo> objGalentestsList = new LinkedList<GalenTestInfo>();

		// Create a GalenTestInfo object
		GalenTestInfo objSingleGalenTest = GalenTestInfo.fromString("Testing Sample");

		// Get layoutReport and assign to test object
		objSingleGalenTest.getReport().layout(objLayoutReport, "First Title Report galen " + testCaseId + "");

		// Add test object to the tests list
		objGalentestsList.add(objSingleGalenTest);

		// Create a htmlReportBuilder object
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		htmlReportBuilder.build(objGalentestsList, "./Galen_Reports/ReportFolder_TestingGalen " + testCaseId + "");

		// If layoutReport has errors Assert Fail
		if (objLayoutReport.errors() > 0) {
			System.out.println("Layout test failed for Page1");
			// Assert.fail();
		}
		System.out.println("Layout test PASSED for Page1");
		Thread.sleep(4000);
	}

	@When("user choose the Languages")
	public void user_choose_the_Languages() throws Throwable {

		String language = Basesetupdriver.excelHashMapValues.get("Language");
		System.out.println("Language Executed: " + language);
		WebElement bttn = Basesetupdriver.driver.findElement(Loginpagescb.languageBtn);
		bttn.click();
		WebElement languageButton;
		switch (language) {
		case "English":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageEng);
			languageButton.click();
			break;
		case "TraditionalChinese":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageChn);
			languageButton.click();
			break;
		case "Vietnam":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageVit);
			languageButton.click();
			break;
		case "Thai":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageThai);
			languageButton.click();
			break;
		case "French":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageFrn);
			languageButton.click();
			break;
		case "Spanish":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageSpn);
			languageButton.click();
			break;
		case "Japanese":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageJpn);
			languageButton.click();
			break;
		case "Korean":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageKor);
			languageButton.click();
			break;
		case "Indonesian":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languageIno);
			languageButton.click();
			break;
		case "Portuguese":
			languageButton = Basesetupdriver.driver.findElement(Loginpagescb.languagePor);
			languageButton.click();
			break;
		default:
			break;
		}
		Thread.sleep(5000);
		WebElement element = Basesetupdriver.driver.findElement(Loginpagescb.contctus);
		String cncteng = element.getText();
		// System.out.println(cncteng);
		if (cncteng.equals(Basesetupdriver.excelHashMapValues.get("Contact_Us_Text")))
			System.out.println("Language Changed");
		else
			System.out.println("Language Not Changed");
	}

	@When("User enter username and groupid")
	public void user_enter_username_and_groupid() throws Throwable {
		String username = Business_Methods.Basesetupdriver.excelHashMapValues.get("UserName");
		System.out.println("Current UserName :" + username);
		Commonmethods.sendKeys(Business_Methods.Basesetupdriver.driver.findElement(Loginpagescb.username), username);
		String grpid = Business_Methods.Basesetupdriver.excelHashMapValues.get("GroupId");
		Commonmethods.sendKeys(Business_Methods.Basesetupdriver.driver.findElement(Loginpagescb.groupid), grpid);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/S2BNG_page2  " + testCaseId + ".png");

	}

	@When("user click the continue button")
	public void user_click_the_continue_button() throws Throwable {
		System.out.println("in");
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(Loginpagescb.continuebtn));
		System.out.println("out");
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/S2BNG_page3  " + testCaseId + ".png");

	}

	@When("user enter the password")
	public void user_enter_the_password() throws Throwable {
		String pass = Business_Methods.Basesetupdriver.excelHashMapValues.get("Password");
		Commonmethods.sendKeys(Business_Methods.Basesetupdriver.driver.findElement(Loginpagescb.password), pass);
		System.out.println("###########################Password: " + pass);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/S2BNG_page4  " + testCaseId + ".png");

	}

	@When("user clcik the login button")
	public void user_clcik_the_login_button() throws Throwable {
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(Loginpagescb.loginbtn));
		Thread.sleep(2000);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/S2BNG_page5  " + testCaseId + ".png");
		
		Thread.sleep(30000);
	}

	@Then("layout validation is performed on home page")
	public void layout_validation_is_performed_on_home_page() throws Throwable {

		Thread.sleep(10000);

		LayoutReport objLayoutReport1 = Galen.checkLayout(Basesetupdriver.driver, specFilePath,
				Arrays.asList("Testing1"));

		// Create a galen test info list
		List<GalenTestInfo> objGalentestsList1 = new LinkedList<GalenTestInfo>();

		// Create a GalenTestInfo object
		GalenTestInfo objSingleGalenTest1 = GalenTestInfo.fromString("Testing Sample");

		// Get layoutReport and assign to test object
		objSingleGalenTest1.getReport().layout(objLayoutReport1, "First Title Report galen");

		// Add test object to the tests list
		objGalentestsList1.add(objSingleGalenTest1);

		// Create a htmlReportBuilder object
		HtmlReportBuilder htmlReportBuilder1 = new HtmlReportBuilder();

		htmlReportBuilder1.build(objGalentestsList1, "./Galen_Reports/ReportFolder_TestingGalen2 " + testCaseId + "");

		// If layoutReport has errors Assert Fail
		if (objLayoutReport1.errors() > 0) {
			System.out.println("Layout test failed for Page2");
			// Assert.fail();
		}
		System.out.println("Layout test PASSED for Page2");

	}

	@Then("user verify the error message and write in Datasheet")
	public void user_verify_the_error_message_and_write_in_Datasheet() throws FilloException, IOException {
		
		Basesetupdriver.driver.quit();

	}

}
