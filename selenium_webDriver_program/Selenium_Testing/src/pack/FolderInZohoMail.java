package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FolderInZohoMail {
	
	public static void main(String args[]) throws InterruptedException {
		String baseUrl="https://mail.zoho.com";
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.linkText("SIGN IN")).click();
		driver.findElement(By.id("login_id")).sendKeys("vasanthakumar.m@zohocorp.com");
		driver.findElement(By.id("nextbtn")).click();
		Thread.sleep(2000);
		System.out.println("login clicked");
		
		
		//conformation of mail page and switching iframs for the operation
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver,100);
	    WebElement ele;
	    ele=wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("topbarlogoserviceName"))));
		System.out.println(ele.getText());
		System.out.println("We Entered Email page:- \n");
		WebElement iframe=driver.findElement(By.id("mailLoadFrame"));
		driver.switchTo().frame(iframe);
		
		//folder creation in taskbar
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("msi-plus")));
		Thread.sleep(10000);
		List<WebElement> itags=driver.findElements(By.className("msi-plus"));
		itags.get(1).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("zmtext__box")));
		List<WebElement> inputForFolder=driver.findElements(By.className("zmtext__box"));
		inputForFolder.get(0).sendKeys("sys_admin_mails");
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".zmbuttonbar>button[aria-label='Save']")).click();
		
		
		//go unread section to assign
		driver.findElement(By.id("zm_unread")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-ty='lt']")));
		List<WebElement> AllMails=driver.findElements(By.cssSelector("div[data-ty='lt']"));
		int noOfMails=AllMails.size();
		System.out.println("No of mails: "+noOfMails);
		for(int i=1;i<noOfMails;i++) {
			System.out.println("mail's outterText()--~");
			String titleOfMail=AllMails.get(i).getText().substring(0,8);
			System.out.println("titleOfMail :"+titleOfMail);
			String actualTitle="sysadmin";
			JavascriptExecutor js=(JavascriptExecutor)driver;
			if(titleOfMail.contentEquals(actualTitle)) {
				js.executeScript("arguments[0].classList+=' zmLCheck'",AllMails.get(i));
				System.out.println("Message was successfully selected :)");
				System.out.println("------------------------------\n");
			}else {
				System.out.println("the mail is not selected :(");
				System.out.println("------------------------------\n");
			}
		}
		//Selecting initiative message and sending to 
		driver.findElement(By.className("zmLChk")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("move")));
		driver.findElement(By.id("move")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".zmfolder-list>li")));
		List<WebElement> liTags=driver.findElements(By.cssSelector(".zmfolder-list>li"));
		liTags.get(6).click();
		
		//closing assistant
		if(driver.findElement(By.cssSelector(".zmbtn>.msi-close")).isDisplayed()) {
			driver.findElement(By.cssSelector(".zmbtn>.msi-close")).click();
		}
		
		
	}
}
