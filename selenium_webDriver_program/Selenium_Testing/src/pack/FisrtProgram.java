package pack;



import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FisrtProgram {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.manage().window().maximize();
        String baseUrl = "http://youtube.com/";
        driver.get(baseUrl);
        Scanner in=new Scanner(System.in);
        
        System.out.println("in test for explore");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ytd-guide-entry-renderer")));
		Thread.sleep(5000);
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
      
        
        
        
//        System.out.println("enter song name:");
//        String sname="anbe anbe song";
//        Thread.sleep(4000);
//        //way for arabic kuthu and comments
//         driver.findElement(By.cssSelector("#search-input>#search")).sendKeys(sname);
//         Thread.sleep(2000);
//         driver.findElement(By.id("search-icon-legacy")).click();
//         System.out.println("started");
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//         System.out.println("ended");
//         List<WebElement> listItems = driver.findElements(By.className("ytd-video-renderer"));
//         listItems.get(0).click();
//         @SuppressWarnings("deprecation")
//		WebDriverWait wait=new WebDriverWait(driver,20);
//         WebElement ele;
// 		 ele=wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("ytp-ad-skip-button"))));
// 		 ele.click();
//         Thread.sleep(10000);
//         JavascriptExecutor js=(JavascriptExecutor)driver;
//         js.executeScript("window.scrollBy(0,15000)","");
//         Thread.sleep(5000);
//         driver.close();
	}

}
