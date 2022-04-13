package Cliq;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnteringCliq {
	public static void main(String args[]) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		WebDriver don=new ChromeDriver();
		don.manage().window().maximize();
		don.get("https://cliq.zoho.com");
		Thread.sleep(2000);
		don.findElement(By.linkText("SIGN IN")).click();
		don.findElement(By.id("login_id")).sendKeys("vasanthakumar.m@zohocorp.com");
		don.findElement(By.id("nextbtn")).click();
		WebDriverWait stop=new WebDriverWait(don,90);
		stop.until(ExpectedConditions.visibilityOfElementLocated(By.id("topbarlogoserviceName")));
		System.out.println(don.findElement(By.id("topbarlogoserviceName")).getText());
		don.switchTo().frame("chatLoadFrame");
		stop.until(ExpectedConditions.visibilityOfElementLocated(By.id("pinnedchatsheader")));
		if(don.findElement(By.id("pinnedchatsheader")).isDisplayed()) {
			System.out.println("in iframe :~)");
		}
		stop.until(ExpectedConditions.visibilityOfElementLocated(By.id("tab2198157490880360827")));
		don.findElement(By.id("tab2198157490880360827")).click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		//santhi
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		//san
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		//value entered
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("finished");
	}
}
