package pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFormMulti {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] x1= {"admin","venkat","jk","harish","ramana"};
		String[] x2= {"king","sumo","army","hacker","romiyo"};
		String email= "xdon_wqq23sd_scsd69";
		String pass= "Don987xdrt@#/";
		String no="6382452934";
		String[] gend= {"Superior","Don","Bodyguard","WayBig","LoveGod"};

		for(int i=0;i<5;i++) {
			System.out.println("\n\nFor "+x1[i]);
			driver.get("https://bit.ly/3szc9PZ");
			Thread.sleep(1000);
			driver.findElement(By.id("usernamereg-firstName")).sendKeys(x1[i]);
			Thread.sleep(1000);
			driver.findElement(By.id("usernamereg-lastName")).sendKeys(x2[i]);
			Thread.sleep(1000);
			driver.findElement(By.id("usernamereg-yid")).sendKeys(email);
			Thread.sleep(1000);
			driver.findElement(By.id("usernamereg-password")).sendKeys(pass);
			Thread.sleep(1000);
			driver.findElement(By.id("usernamereg-phone")).sendKeys(no);
			Thread.sleep(1000);
			Select x= new Select(driver.findElement(By.id("usernamereg-month")));
			x.selectByValue("4");
			Thread.sleep(1000);
			driver.findElement(By.id("usernamereg-day")).sendKeys("12");
			Thread.sleep(1000);
			driver.findElement(By.id("usernamereg-year")).sendKeys("2003");
			Thread.sleep(1000);
			driver.findElement(By.id("usernamereg-freeformGender")).sendKeys(gend[i]);
			Thread.sleep(1000);
			
			System.out.println("screen shot stored in compputer");
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("/home/vasanth-zstk257/Desktop/selinum/"+x1[i]+".png");
			FileUtils.copyFile(SrcFile, DestFile);
			driver.findElement(By.id("reg-submit-button")).click();
			
		}
		
		System.out.println("\n\n all inputs are placed and screeshot is stored in computer");

	}

}
