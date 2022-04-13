package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecutoeExample {
	
   public static void main(String args[]) {
	   WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://zohoschools.com");
		driver.findElement(By.className("close-modal")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement h=driver.findElement(By.linkText("Home"));
		js.executeScript("arguments[0].textContent='vasanth'", h);
		System.out.println(h);
   }
}
