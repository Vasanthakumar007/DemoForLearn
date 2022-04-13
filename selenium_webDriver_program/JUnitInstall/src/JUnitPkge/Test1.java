package JUnitPkge;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	static WebDriver driver;
	@BeforeClass
	public static void ts1() {
		System.setProperty("webdriver.gecko.driver","/home/vasanth-zstk257/Desktop/selinum/geckodriver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///home/vasanth-zstk257/Desktop/Note%20app/index.html");
	}
	@Test
	public void td1() {
		driver.findElement(By.id("creater")).click();
	}
	@Test
	public void td2() {
		driver.findElement(By.id("1")).click();
	}
	@Test
	public void td3() {
		driver.findElement(By.id("text_area")).sendKeys("i am vasanth");
	}
	@Test
	public void td4() {
		driver.findElement(By.id("save_btn")).click();
	}
	@AfterClass
	public static void ts2() {
		
//		driver.close();
	}
}
