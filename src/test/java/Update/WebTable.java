package Update;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/admin/AppData/Local/Microsoft/Windows/INetCache/IE/I9AQI8CM/table[1].html");
	String Ab = driver.findElement(By.xpath("//td[text()='Germany']")).getText();
	System.out.println(Ab);
	String Az = driver.findElement(By.xpath("//td[text()='Centro comercial Moctezuma']")).getText();
	System.out.println(Az);
	String ABd = driver.findElement(By.xpath("//td[text()='Maria Anders']")).getText();
	System.out.println(ABd);

}
}