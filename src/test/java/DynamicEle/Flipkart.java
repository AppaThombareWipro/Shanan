package DynamicEle;


import java.io.File;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

//import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//  TakesScreenshot sh=(TakesScreenshot)driver;
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 30k",Keys.ENTER);
		String Tx = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[10]")).getText();
		System.out.println(Tx);
		WebElement sh = driver.findElement(By.xpath("(//img[@class='_396cs4'])[3]"));
		File Fs = sh.getScreenshotAs(OutputType.FILE);
		File Ab=new File("C:\\Users\\admin\\Desktop\\Selenium Screenshot");
		Files.copy(Fs, Ab);
		
	}

}
