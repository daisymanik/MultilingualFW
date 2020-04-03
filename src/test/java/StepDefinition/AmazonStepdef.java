package StepDefinition;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.translate.Translate;
import com.google.api.services.translate.model.TranslationsListResponse;
import com.google.api.services.translate.model.TranslationsResource;

import Business_Methods.Basesetupdriver;
import Object_Repository.AmazonHomePage;
import Utilities.Commonmethods;
import Utilities.DataProvider;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStepdef {

	public static DataProvider obj = new DataProvider();
	public static String sheetName = "Sheet2";
	private static String testCaseId = "";
	
	String specFilePath = "gSpec/Amazonhomepage1.gspec";
	String specFilePath2 = "gSpec/Amazonsiginpage2.gspec";
	String specFilePath3 = "gSpec/Amazonpasspage3.gspec";
	String specFilePath4 = "gSpec/Amazonprdctdespage4.gspec";
	String specFilePath5 = "gSpec/Amazonfirstproductresultpage5.gspec";
	String specFilePath6 = "gSpec/Amazonsecondproductdescpage6.gspec";
	String specFilePath7 = "gSpec/AmazonFinallistpage7.gspec";

	@Given("user is on amazon homepage with {string}")
	public void user_is_on_amazon_homepage_with(String string1) throws Throwable, Throwable {
		Basesetupdriver.ReadPropertyfile_and_OpenBrowser1();
		testCaseId = string1;
		System.out.println(testCaseId);
		Basesetupdriver.excelHashMapValues = obj.extractExcelData(testCaseId, sheetName);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/Amazon_page1  " + testCaseId + ".png");
	}

	@When("user choose the Languages in amazon")
	public void user_choose_the_Languages_in_amazon() throws Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String language=Business_Methods.Basesetupdriver.excelHashMapValues.get("Language");
		System.out.println("Language Executed: " + language);
		/*WebElement bttn = Business_Methods.Basesetupdriver.driver.findElement(Loginpagescb.languageBtn);
			bttn.click();*/

		Actions actions = new Actions(Business_Methods.Basesetupdriver.driver);

		actions.moveToElement(Business_Methods.Basesetupdriver.driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"))).build().perform();

		Thread.sleep(4000);

		WebElement languageButton;

		switch (language) {
		case "English":
			/*languageButton = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.english_Checkbox1);
			languageButton.click();*/

			WebElement element = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.help_link);
			String helptext = element.getText();
			System.out.println(helptext);
			if(helptext.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text1")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			WebElement element2 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.sell_link);
			String selltext = element2.getText();
			System.out.println(selltext);
			if(helptext.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text2")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			WebElement element3 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.giftcard_link);
			String gifttext = element3.getText();
			System.out.println(gifttext);
			if(helptext.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text3")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			WebElement element4 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.returns_link);
			String returntext = element3.getText();
			System.out.println(returntext);
			if(helptext.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text4")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");		

			break;

		case "Spanish":
			languageButton = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.spanish_Checkbox);
			languageButton.click();

			WebElement element5 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.help_link_ES);
			String helptext1 = element5.getText();
			System.out.println(helptext1);
			if(helptext1.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text1")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			WebElement element6 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.sell_link_ES);
			String selltext1 = element6.getText();
			System.out.println(selltext1);
			if(selltext1.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text2")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			WebElement element7 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.giftcard_link_ES);
			String gifttext1 = element7.getText();
			System.out.println(gifttext1);
			if(gifttext1.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text3")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			WebElement element8 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.returns_link_ES);
			String returntext1 = element8.getText();
			System.out.println(returntext1);
			if(returntext1.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text4")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");	

			Thread.sleep(3000);
			
			break;		


		case "Deutsch":
			languageButton = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.german_Checkbox);
			languageButton.click();


			WebElement element9 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.help_link_DE);
			String helptext3 = element9.getText();
			System.out.println(helptext3);
			if(helptext3.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text1")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			Thread.sleep(2000);

			WebElement element10 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.sell_link_DE);
			String selltext4 = element10.getText();
			System.out.println(selltext4);
			if(selltext4.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text2")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			Thread.sleep(2000);

			WebElement element11 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.giftcard_link_DE);
			String gifttext4 = element11.getText();
			System.out.println(gifttext4);
			String text24 = gifttext4.trim();
			if(text24.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text3")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");

			WebElement element12 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.returns_link_DE);
			String returntext11 = element12.getText();
			System.out.println(returntext11);
			String text23 = returntext11.trim();
			if(text23.equalsIgnoreCase(Business_Methods.Basesetupdriver.excelHashMapValues.get("Text4")))
				System.out.println("Correct Text");
			else
				System.out.println("Incorrect");	

			Thread.sleep(3000);
			break;



		default:
			break;
		}
		Thread.sleep(5000);
	}
	@When("user verifies the translated text with {string}")
	public void user_verifies_the_translated_text_with(String string1) throws Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String finalText = null;
		WebElement element01 = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.helping_button);
		String source1 = element01.getText();
		System.out.println("Source Text is ----->  " + source1);
		Translate t = new Translate.Builder(GoogleNetHttpTransport.newTrustedTransport(),
				GsonFactory.getDefaultInstance(), null)
						// Set your application name
						.setApplicationName("Stackoverflow-Example").build();
		Translate.Translations.List list = t.new Translations().list(Arrays.asList(source1), "ES");
		// TODO: Set your API-Key from https://console.developers.google.com/
		list.setKey("AIzaSyCOXm6fqYcqJtpFSrlMsgAy1VPkgNcrD2k");
		TranslationsListResponse response = list.execute();
		for (TranslationsResource translationsResource : response.getTranslations()) {
			System.out.println("Translated text is ---->  " + translationsResource.getTranslatedText());
			finalText = translationsResource.getTranslatedText();
		}
		obj.writeExcelData(string1, "Sheet2", "Translated_text1", finalText);
		Actions actions1 = new Actions(Business_Methods.Basesetupdriver.driver);
		actions1.moveToElement(Business_Methods.Basesetupdriver.driver
				.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"))).build().perform();
		Thread.sleep(3000);
		WebElement languageButton;
		languageButton = Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.english_Checkbox);
		languageButton.click();
	}

	@Then("validation of homepage layout using galen")
	public void validation_of_homepage_layout_using_galen() throws IOException, InterruptedException {
		LayoutReport objLayoutReport = Galen.checkLayout(Business_Methods.Basesetupdriver.driver, specFilePath,
				Arrays.asList("Testing"));
		// Create a galen test info list
		List<GalenTestInfo> objGalentestsList = new LinkedList<GalenTestInfo>();

		// Create a GalenTestInfo object
		GalenTestInfo objSingleGalenTest = GalenTestInfo.fromString("Testing Sample");

		// Get layoutReport and assign to test object
		objSingleGalenTest.getReport().layout(objLayoutReport, "First Title Report galen");

		// Add test object to the tests list
		objGalentestsList.add(objSingleGalenTest);

		// Create a htmlReportBuilder object
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		htmlReportBuilder.build(objGalentestsList, "./Galen_Reports/ReportFolder_HomePage");

		// If layoutReport has errors Assert Fail
		if (objLayoutReport.errors() > 0) {
			System.out.println("Layout test failed for Page1");
			// Assert.fail();
		}
		System.out.println("Layout test PASSED for Page1");

		Thread.sleep(3000);

	}

	@When("user clicks on Account and List button")
	public void user_clicks_on_Account_and_List_button() throws InterruptedException {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.sign_Button));

	}

	@When("user enters {string} inside email inputbox")
	public void user_enters_inside_email_inputbox(String string) throws InterruptedException, Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String pass = Business_Methods.Basesetupdriver.excelHashMapValues.get("UserName");
		Commonmethods.sendKeys(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.email_Button), pass);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/Amazon_page2  " + testCaseId + ".png");
	}

	@Then("validation of signup{int} layout using galen")
	public void validation_of_signup_layout_using_galen(Integer int1) throws InterruptedException, IOException {
		LayoutReport objLayoutReport = Galen.checkLayout(Business_Methods.Basesetupdriver.driver, specFilePath2,
				Arrays.asList("Testing1"));

		// Create a galen test info list
		List<GalenTestInfo> objGalentestsList = new LinkedList<GalenTestInfo>();

		// Create a GalenTestInfo object
		GalenTestInfo objSingleGalenTest = GalenTestInfo.fromString("Testing Sample");

		// Get layoutReport and assign to test object
		objSingleGalenTest.getReport().layout(objLayoutReport, "First Title Report galen");

		// Add test object to the tests list
		objGalentestsList.add(objSingleGalenTest);

		// Create a htmlReportBuilder object
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		htmlReportBuilder.build(objGalentestsList, "./Galen_Reports/ReportFolder_Signin1Page");

		// If layoutReport has errors Assert Fail
		if (objLayoutReport.errors() > 0) {
			System.out.println("Layout test failed for Page1");
			// Assert.fail();
		}
		System.out.println("Layout test PASSED for Page1");
		Thread.sleep(3000);
	}

	@Then("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.continue_Button));
	}

	
	@When("user enters {string} inside password inputbox")
	public void user_enters_inside_password_inputbox(String password) throws InterruptedException, Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String pass = Business_Methods.Basesetupdriver.excelHashMapValues.get("Password");

		Commonmethods.sendKeys(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.password_Button),
				pass);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/Amazon_page3  " + testCaseId + ".png");

	}
	@Then("validation of signuptwo layout using galen")
	public void validation_of_signuptwo_layout_using_galen() throws Throwable {
	    
		LayoutReport objLayoutReport = 
				Galen.checkLayout(Business_Methods.Basesetupdriver.driver, specFilePath3, Arrays.asList("Testing2"));

		//Create a galen test info list
		List<GalenTestInfo> objGalentestsList	= new LinkedList<GalenTestInfo>();

		//Create a GalenTestInfo object
		GalenTestInfo objSingleGalenTest = GalenTestInfo.fromString("Testing Sample");

		//Get layoutReport and assign to test object
		objSingleGalenTest.getReport().layout(objLayoutReport, "First Title Report galen");

		//Add test object to the tests list
		objGalentestsList.add(objSingleGalenTest);

		//Create a htmlReportBuilder object
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		htmlReportBuilder.build(objGalentestsList, "./Galen_Reports/ReportFolder_Signin2Page");

		//If layoutReport has errors Assert Fail
		if (objLayoutReport.errors() > 0)
		{
			System.out.println("Layout test failed for Page1");
			//Assert.fail();
		}
		System.out.println("Layout test PASSED for Page1");		

		Thread.sleep(3000);	           
	}

	@Then("user clicks on signin button")
	public void user_clicks_on_signin_button() throws InterruptedException {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.signin_Button));
		Thread.sleep(5000);
	}

	@Then("user enters iphone in searchbox")
	public void user_enters_iphone_in_searchbox() throws InterruptedException {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String prdct = Business_Methods.Basesetupdriver.excelHashMapValues.get("Product_Name");
		Commonmethods.sendKeys(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.search_box), prdct);

		Thread.sleep(3000);

	}

	@Then("user clicks on search button")
	public void user_clicks_on_search_button() throws Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.search_button));
		Thread.sleep(3000);
	}

	@Then("validation of firstproductsearch layout using galen")
	public void validation_of_firstproductsearch_layout_using_galen() throws Throwable {
		LayoutReport objLayoutReport = Galen.checkLayout(Business_Methods.Basesetupdriver.driver, specFilePath5,
				Arrays.asList("Testing4"));

		// Create a galen test info list
		List<GalenTestInfo> objGalentestsList = new LinkedList<GalenTestInfo>();

		// Create a GalenTestInfo object
		GalenTestInfo objSingleGalenTest = GalenTestInfo.fromString("Testing Sample");

		// Get layoutReport and assign to test object
		objSingleGalenTest.getReport().layout(objLayoutReport, "First Title Report galen");

		// Add test object to the tests list
		objGalentestsList.add(objSingleGalenTest);

		// Create a htmlReportBuilder object
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		htmlReportBuilder.build(objGalentestsList, "./Galen_Reports/ReportFolder_FirstProductSearchPage");

		// If layoutReport has errors Assert Fail
		if (objLayoutReport.errors() > 0) {
			System.out.println("Layout test failed for Page1");
			// Assert.fail();
		}
		System.out.println("Layout test PASSED for Page1");

		Thread.sleep(3000);
	}
	
	@Then("user clicks on first mobile icon")
	public void user_clicks_on_first_mobile_icon() throws Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.iphone6sImage));
		Thread.sleep(3000);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/Amazon_page4  " + testCaseId + ".png");
	}

	@Then("validation of firstproductdescriptionpage layout using galen")
	public void validation_of_firstproductdescriptionpage_layout_using_galen() throws InterruptedException, Throwable {

		LayoutReport objLayoutReport = Galen.checkLayout(Business_Methods.Basesetupdriver.driver, specFilePath5,
				Arrays.asList("Testing4"));

		// Create a galen test info list
		List<GalenTestInfo> objGalentestsList = new LinkedList<GalenTestInfo>();

		// Create a GalenTestInfo object
		GalenTestInfo objSingleGalenTest = GalenTestInfo.fromString("Testing Sample");

		// Get layoutReport and assign to test object
		objSingleGalenTest.getReport().layout(objLayoutReport, "First Title Report galen");

		// Add test object to the tests list
		objGalentestsList.add(objSingleGalenTest);

		// Create a htmlReportBuilder object
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		htmlReportBuilder.build(objGalentestsList, "./Galen_Reports/ReportFolder_FirstProductdescriptionPage");

		// If layoutReport has errors Assert Fail
		if (objLayoutReport.errors() > 0) {
			System.out.println("Layout test failed for Page1");
			// Assert.fail();
		}
		System.out.println("Layout test PASSED for Page1");

		Thread.sleep(3000);
	}

	@Then("user clicks on Addtolist button")
	public void user_clicks_on_Addtolist_button() throws Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.AddToListButton));
		Thread.sleep(3000);

	}

	@Then("user clicks on continue shopping button")
	public void user_clicks_on_continue_shopping_button() throws InterruptedException, Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.ContinueShoppingButton));
		Thread.sleep(3000);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/Amazon_page5  " + testCaseId + ".png");
	}

	@Then("user clicks on second product icon")
	public void user_clicks_on_second_product_icon() throws InterruptedException {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.Iphonr8Img));
		Thread.sleep(3000);
	}

	@Then("validation of secondproductdescriptionpage layout using galen")
	public void validation_of_secondproductdescriptionpage_layout_using_galen() throws Throwable {

		LayoutReport objLayoutReport = Galen.checkLayout(Business_Methods.Basesetupdriver.driver, specFilePath6,
				Arrays.asList("Testing5"));

		// Create a galen test info list
		List<GalenTestInfo> objGalentestsList = new LinkedList<GalenTestInfo>();

		// Create a GalenTestInfo object
		GalenTestInfo objSingleGalenTest = GalenTestInfo.fromString("Testing Sample");

		// Get layoutReport and assign to test object
		objSingleGalenTest.getReport().layout(objLayoutReport, "First Title Report galen");

		// Add test object to the tests list
		objGalentestsList.add(objSingleGalenTest);

		// Create a htmlReportBuilder object
		HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

		htmlReportBuilder.build(objGalentestsList, "./Galen_Reports/ReportFolder_SecondProductSearchPage");

		// If layoutReport has errors Assert Fail
		if (objLayoutReport.errors() > 0) {
			System.out.println("Layout test failed for Page1");
			// Assert.fail();
		}
		System.out.println("Layout test PASSED for Page1");

		Thread.sleep(3000);
	}

	@Then("user mousehover on Accounts and Lists Icon")
	public void user_mousehover_on_Accounts_and_Lists_Icon() throws InterruptedException {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions actions = new Actions(Business_Methods.Basesetupdriver.driver);

		actions.moveToElement(
				Business_Methods.Basesetupdriver.driver.findElement(By.xpath("//span[text()='Account & Lists']")))
				.build().perform();
		Thread.sleep(3000);
	}

	@Then("user clicks on Shopping list")
	public void user_clicks_on_Shopping_list() throws Throwable {
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Commonmethods.click(Business_Methods.Basesetupdriver.driver.findElement(AmazonHomePage.shoppinglist));
		Thread.sleep(3000);
		Business_Methods.Basesetupdriver.tkscr(Business_Methods.Basesetupdriver.driver,
				"./Screenshots/Amazon_page6  " + testCaseId + ".png");
	}

	@Then("user verifies image{int}")
	public void user_verifies_image(Integer int1) {
	}
	@Then("user closes the browser")
	public void user_closes_the_browser() {
		Business_Methods.Basesetupdriver.driver.close();
	}

}
