package Object_Repository;

import org.openqa.selenium.By;

public class Loginpagescb {
	
	public static final By contctus =By.xpath("//*[@class='ul-header-contactus']/div/a/span[1]");
	public static final By username = By.id("userid_email-name");
	public static final By groupid = By.id("group_id-name");
	//public static final By continuebtn = By.xpath("//button[@class='s2b-button-primary  ul-full'])[1]");	
	public static final By languageBtn = By.xpath("//*[@class='ul-header-language']");
    public static final By continuebtn = By.id("-name");
	public static final By password = By.id("unified_password-name");
	public static final By loginbtn = By.id("login-btn-name");
	public static final By languageEng = By.xpath("//a[text()='English (UK)']");
	public static final By languageVit = By.xpath("//a[text()='Tiếng Việt']");
	public static final By languageSpn = By.xpath("//a[text()='Spanish']");
	public static final By languageFrn = By.xpath("//a[text()='Français']");
	public static final By languageChn = By.xpath("//a[text()='简体中文']");
	public static final By languageThai =By.xpath("//a[text()='ไทย']");
	public static final By languageKor =By.xpath("//a[text()='한국어']");
	public static final By languagePor =By.xpath("//a[text()='Portuguese']");
	public static final By languageIno =By.xpath("//a[text()='Bahasa']");
	public static final By languageJpn =By.xpath("//a[text()='日本語']");
	public static final By errormsg = By.xpath("//div[@class='error-message']/p");
}
