package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zohomail {
	
	public static void main(String args[]) throws InterruptedException {
		String[] email= {"thavamani.v@zohocorp.com","venkat.m@zohocorp.com","gokul.krish@zohocorp.com","sathan.t@zohocorp.com","santhi.murugesan@zohocorp.com"};
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
		
		//wait for response
		//when it loaded the title will be printed
        WebDriverWait wait=new WebDriverWait(driver,100);
        WebElement ele;
		ele=wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("topbarlogoserviceName"))));
		System.out.println(ele.getText());
		System.out.println("We Entered Email page:- \n\n\n");
		
		
		//selecting iframs and compse mail
		WebElement iframe=driver.findElement(By.id("mailLoadFrame"));
		driver.switchTo().frame(iframe);
        
		//Sending emails for memebers in the email array;
		
		for(int i=0;i<email.length;i++) {
			//selecting compse button
			Thread.sleep(5000);
			List<WebElement> btn=driver.findElements(By.className("zmbtn__text"));
			btn.get(0).click();
			Thread.sleep(5000);
			
			//waiting for response;
			ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".zmCRcbWra>input")));
			ele.sendKeys(email[i]);
			driver.findElement(By.cssSelector(".zmCRow>input")).sendKeys("Thanks for Helping in Programming");
//			
//			//closing assistant
//			if(driver.findElement(By.cssSelector(".zmOneStopHdrAction>button[title=\"Close\"]")).isDisplayed()) {
//				driver.findElement(By.cssSelector(".zmOneStopHdrAction>button[title=\"Close\"]")).click();
//			}
//			
//			//Starting to write in text area
			WebElement mesgIfra=driver.findElement(By.className("ze_area"));
			driver.switchTo().frame(mesgIfra);
			WebElement textBody=driver.findElement(By.cssSelector("body[class=\"ze_body\"]"));
			  //writing js code for message in side
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].innerHTML+='<div>Hello i am vasanth</div>'",textBody);
			 js.executeScript("arguments[0].innerHTML+='<div>thank you "+email[i]+" for your help</div>'",textBody);
			 js.executeScript("arguments[0].innerHTML+='<div></div>'", textBody);
			 js.executeScript("arguments[0].innerHTML+='<div></div>'", textBody);
			 js.executeScript("arguments[0].innerHTML+='<div></div>'", textBody);
			 js.executeScript("arguments[0].innerHTML+='<div>&nbsp; &nbsp; &nbsp; Regards,</div>'", textBody);
			 js.executeScript("arguments[0].innerHTML+='<div>M.Vasantha kumar,</div>'", textBody);
			 js.executeScript("arguments[0].innerHTML+='<div>Zoho Schools,</div>'", textBody);
			 js.executeScript("arguments[0].innerHTML+='<div>Tenkasi.</div>'", textBody);
			 
			//Sending mail;
			 
			 driver.switchTo().parentFrame();
			 driver.findElement(By.cssSelector("button[aria-label='Send']")).click();
		}
		 
		
	}
}
