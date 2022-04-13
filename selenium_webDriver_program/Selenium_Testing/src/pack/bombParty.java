package pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bombParty {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,50);
		driver.manage().window().maximize();
		driver.get("https://jklm.fun/");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(1000,0)");
		List <WebElement> bomb=driver.findElements(By.className("bombparty"));
		List <String> codes=new ArrayList<String>();
		for(int i=0;i<bomb.size();i++) {
			codes.add(bomb.get(i).getAttribute("href"));
		}
		for(int i=0;i<5;i++) {
			Robot x=new Robot();
			x.keyPress(KeyEvent.VK_CONTROL);
			x.keyPress(KeyEvent.VK_T);
			x.keyRelease(KeyEvent.VK_T);
			x.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		List<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		for(int i=1;i<7;i++) {
			Robot x=new Robot();
			driver.switchTo().window(tabs.get(i));
			driver.navigate().to(codes.get(i));
			x.keyPress(KeyEvent.VK_ENTER);
			x.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/div[2]/button")).click();
			Thread.sleep(2000);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("canvasArea")));
//			driver.findElement(By.className("canvasArea")).click();
			Thread.sleep(1000);
			if(driver.findElement(By.cssSelector(".input>textarea")).isDisplayed()) {
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(".input>textarea")).click();
				for(int j=0;j<5;j++) {
					
					driver.findElement(By.cssSelector(".input>textarea")).sendKeys("Nothing to say :(");
					driver.findElement(By.cssSelector(".input>textarea")).sendKeys(":D -----------:D");
					x.keyPress(KeyEvent.VK_ENTER);
					x.keyRelease(KeyEvent.VK_ENTER);
					Thread.sleep(750);
				}
				System.out.println("for loop ended");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[maxlength='4']")).sendKeys("bcus");
//		driver.findElement(By.cssSelector("button[data-text='join']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/div[2]/button")).click();
//		Thread.sleep(5000);
//		Robot x= new Robot();
//		driver.findElement(By.cssSelector(".input>textarea")).sendKeys("Surprise surprise mother fucker the the king Yash is back :-D");
//		x.keyPress(KeyEvent.VK_ENTER);
//		x.keyRelease(KeyEvent.VK_ENTER);
//		for(int i=0;i<200;i++) {
//			driver.findElement(By.cssSelector(".input>textarea")).click();
//			driver.findElement(By.cssSelector(".input>textarea")).sendKeys("Ban 'ana' i don't like him/her by yash :(");
//			driver.findElement(By.cssSelector(".input>textarea")).sendKeys(":D -----------:D");
////			x.keyPress(KeyEvent.VK_SHIFT);
////			x.keyPress(KeyEvent.VK_ENTER);
////			x.keyRelease(KeyEvent.VK_ENTER);
////			x.keyRelease(KeyEvent.VK_SHIFT);
////			driver.findElement(By.cssSelector(".input>textarea")).sendKeys("\nking");
//			x.keyPress(KeyEvent.VK_ENTER);
//			x.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(1000);
//		}
//		driver.findElement(By.cssSelector(".input>textarea")).sendKeys("i am Don !!!!!");
//		x.keyPress(KeyEvent.VK_ENTER);
//		x.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
