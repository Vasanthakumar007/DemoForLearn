package DonPkg;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CliqTests {
	private static WebDriver don;
	private static WebDriverWait stop;
	private static JavascriptExecutor js;
	@BeforeClass
	public static void initiate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		don=new ChromeDriver();
		don.manage().window().maximize();
		don.get("https://cliq.zoho.com");
		Thread.sleep(2000);
		don.findElement(By.linkText("SIGN IN")).click();
		don.findElement(By.id("login_id")).sendKeys("vasanthakumar.m@zohocorp.com");
		don.findElement(By.id("nextbtn")).click();
	}
	@Before
	public void wat() {
		stop=new WebDriverWait(don,90);
		stop.until(ExpectedConditions.visibilityOfElementLocated(By.id("topbarlogoserviceName")));
		System.out.println(don.findElement(By.id("topbarlogoserviceName")).getText());
		don.switchTo().frame("chatLoadFrame");
		stop.until(ExpectedConditions.visibilityOfElementLocated(By.id("pinnedchatsheader")));
		if(don.findElement(By.id("pinnedchatsheader")).isDisplayed()) {
			System.out.println("in iframe :~)");
		}
	}
	@Test
	public void groupCall() throws InterruptedException {
		stop.until(ExpectedConditions.visibilityOfElementLocated(By.id("tab2198175564783417980")));
//		don.switchTo().frame("chatLoadFrame");
		don.findElement(By.id("tab2198175564783417980")).click();
		System.out.println("elements text: "+don.findElement(By.id("tab2198175564783417980")).getText());
		Thread.sleep(2000);
		js=(JavascriptExecutor)don;
		WebElement inpbox=don.findElement(By.id("composer2198175564783417980"));
		js.executeScript("arguments[0].innerHTML='All come for group call'", inpbox);
		inpbox.click();
		inpbox.sendKeys(Keys.ENTER);
	}
	@Before
	public void aft() throws InterruptedException {
		don.switchTo().parentFrame();
		Thread.sleep(10000);
	}
	@AfterClass
	public static void closeAll() {
		don.close();
	}
//not finished	
}
