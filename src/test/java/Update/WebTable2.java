package Update;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		 String Ab = dr.findElement(By.xpath("//td[text()='Google']")).getText();
		System.out.println(Ab);
		String Cd = dr.findElement(By.xpath("//td[text()='Helen Bennett']")).getText();
		System.out.println(Cd);
		String Az = dr.findElement(By.xpath("//td[text()='Italy']")).getText();
		System.out.println(Az);
	
	}
	

}
