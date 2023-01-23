package SbiCollectTestC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ActiPomC.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestC {
	LoginPage l;
	WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/sbicollect/");
		l=new LoginPage(driver);
		
		
	}
	@BeforeMethod
	
	public void login() {
		Reporter.log("Login Sbi collect App");
		
		
	}
	@Test
	public void loginapp() {
		l.checkbox();
		l.proceedbox();
	}
	
	@AfterMethod
	public void closeapp() {
		Reporter.log("close the app",true);
		
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the browser",true);
		System.out.println("I am comming from github");

		
		
	}
	
}
