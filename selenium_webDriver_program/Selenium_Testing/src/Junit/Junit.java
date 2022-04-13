package Junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Junit {
	private static WebDriverWait wait;
	private static WebDriver driver ;

	@BeforeClass
	public static void init() { 
		System.out.println("in before class");
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,50);
		driver.get("https://youtube.com");
		
	}
	@Test
	public void playsong() throws InterruptedException, AWTException, IOException {
		System.out.println("in test");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#search-input>input")).sendKeys("Arabic kuthu song");
		Thread.sleep(1000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#contents>.ytd-item-section-renderer")));
		driver.findElement(By.cssSelector("#contents>.ytd-item-section-renderer")).click();
		Thread.sleep(2000); 
		if(driver.findElement(By.cssSelector(".ytp-ad-preview-image")).isDisplayed()) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ytp-ad-skip-button-container>button")));
			driver.findElement(By.cssSelector(".ytp-ad-skip-button-container>button")).click();
			Thread.sleep(2500);
			Robot x=new Robot();
			x.keyPress(KeyEvent.VK_SPACE);
			x.keyRelease(KeyEvent.VK_SPACE);
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("/home/vasanth-zstk257/Desktop/selinum/Youtubeplaying.png");
			FileUtils.copyFile(SrcFile, DestFile);
		}else {
			Thread.sleep(2500);
			Robot x=new Robot();
			x.keyPress(KeyEvent.VK_SPACE);
			x.keyRelease(KeyEvent.VK_SPACE);
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("/home/vasanth-zstk257/Desktop/selinum/Youtubeplaying.png");
			FileUtils.copyFile(SrcFile, DestFile);
		}

	}
	@Test
	public void DarkThemeChange() throws InterruptedException {
		System.out.println("in test of DarkTheme");
		List<WebElement> x=driver.findElements(By.cssSelector(".ytd-topbar-menu-button-renderer>#button"));
		x.get(3).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#items>.yt-multi-page-menu-section-renderer")).click();
		Thread.sleep(1000);
		x=driver.findElements(By.cssSelector(".ytd-compact-link-renderer"));
		x.get(101).click();
		}
	@Test
	public void openingShorts() throws InterruptedException, IOException {
		System.out.println("in test for shorts");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ytd-guide-entry-renderer")));
		List<WebElement> x=driver.findElements(By.className("ytd-guide-entry-renderer"));
		x.get(18).click();
		Thread.sleep(2000);
		x=driver.findElements(By.className("ytd-shorts"));
		x.get(18).click();;
		Thread.sleep(10000);
		x.get(18).click();
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("/home/vasanth-zstk257/Desktop/selinum/Youtubeshortsplaying.png");
		FileUtils.copyFile(SrcFile, DestFile);
		Thread.sleep(5000);
		driver.findElement(By.className("ytd-guide-entry-renderer")).click();
	}
	@Test
	public void openingExplore() throws InterruptedException {
		System.out.println("in test for explore");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ytd-guide-entry-renderer")));
		Thread.sleep(2000);
		List<WebElement> x=driver.findElements(By.className("ytd-guide-entry-renderer"));
		x.get(9).click();
		Thread.sleep(1500);
		List<WebElement> rend=driver.findElements(By.className("ytd-destination-shelf-renderer"));
		for(int i=1;i<=9;i++) {
			rend.get(i).click();
			Thread.sleep(1500);
			driver.navigate().back();
			Thread.sleep(1500);
		}
	}
	@AfterClass
	public static void closeAll() {
		driver.quit();
	}
 }
	

