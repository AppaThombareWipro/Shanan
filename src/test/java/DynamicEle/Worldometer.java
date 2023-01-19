package DynamicEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Worldometer {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.worldometers.info/coronavirus/country/uk");
		String Ab = dr.findElement(By.xpath("//div[@class='maincounter-number']")).getText();
	    System.out.println("Corona virus cases in UK");
	    System.out.println(Ab);
	    String Abc = dr.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
	    System.out.println("Corona virus deaths cases in UK");
	    System.out.println(Abc);
	    String Az = dr.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
	    System.out.println("Corona virus recover cases in UK");
	    System.out.println(Az);
	    
	}
	

}
