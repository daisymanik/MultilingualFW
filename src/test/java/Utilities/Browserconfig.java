package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Business_Methods.Basesetupdriver;

public class Browserconfig {
	
	public static WebDriver choosebrowser(String key, String url) {
		if (key.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			Basesetupdriver.driver = new ChromeDriver();
			System.out.println("Passed");
		} else if (key.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette", "./Driver/geckodriver.exe");
			Basesetupdriver.driver = new FirefoxDriver();
		} else if (key.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			Basesetupdriver.driver = new InternetExplorerDriver();
		}

		Basesetupdriver.driver.get(url);
		Basesetupdriver.driver.manage().window().maximize();
		Basesetupdriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return Basesetupdriver.driver;

	}

}
