package DonPkg;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailJUnit {
	private static WebDriver don;
	private static WebDriverWait stop;
	private static JavascriptExecutor js;
	private static WebElement ele;
	private static WebElement iframe;
	@BeforeClass
	public static void entering() throws InterruptedException {
		String baseUrl="https://mail.zoho.com";
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		don= new ChromeDriver();
		stop=new WebDriverWait(don,90);
		don.manage().window().maximize();
		don.get(baseUrl);
		don.findElement(By.linkText("SIGN IN")).click();
		don.findElement(By.id("login_id")).sendKeys("vasanthakumar.m@zohocorp.com");
		don.findElement(By.id("nextbtn")).click();
		Thread.sleep(2000);
		System.out.println("login clicked");
		
		}
	    
	@Test
	public void mailsend() throws InterruptedException {
		ele=stop.until(ExpectedConditions.visibilityOfElementLocated((By.id("topbarlogoserviceName"))));
		System.out.println(ele.getText());
		System.out.println("We Entered Email page:- \n\n\n");
		don.manage().window().maximize();
		iframe=don.findElement(By.id("mailLoadFrame"));
		don.switchTo().frame(iframe);
        
		//selecting compse button
		Thread.sleep(5000);
		List<WebElement> btn=don.findElements(By.className("zmbtn__text"));
		btn.get(0).click();
		Thread.sleep(5000);
		
		//waiting for response;
		ele=stop.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".zmCRcbWra>input")));
		ele.sendKeys("sathan.t@zohocorp.com");
		don.findElement(By.cssSelector(".zmCRow>input")).sendKeys("Thanks for Helping in Programming");
	
		
		//Starting to write in text area
		WebElement mesgIfra=don.findElement(By.className("ze_area"));
		don.switchTo().frame(mesgIfra);
		WebElement textBody=don.findElement(By.cssSelector("body[class=\"ze_body\"]"));
		  //writing js code for message in side
		 js=(JavascriptExecutor)don;
		 js.executeScript("arguments[0].innerHTML+='<div>Hello i am vasanth</div>'",textBody);
		 js.executeScript("arguments[0].innerHTML+='<div>thank you Sathan Raj for your help in programming</div>'",textBody);
		 js.executeScript("arguments[0].innerHTML+='<div></div>'", textBody);
		 js.executeScript("arguments[0].innerHTML+='<div></div>'", textBody);
		 js.executeScript("arguments[0].innerHTML+='<div></div>'", textBody);
		 js.executeScript("arguments[0].innerHTML+='<div>&nbsp; &nbsp; &nbsp; Regards,</div>'", textBody);
		 js.executeScript("arguments[0].innerHTML+='<div>M.Vasantha kumar,</div>'", textBody);
		 js.executeScript("arguments[0].innerHTML+='<div>Zoho Schools,</div>'", textBody);
		 js.executeScript("arguments[0].innerHTML+='<div>Tenkasi.</div>'", textBody);
		//Sending mail;
		 don.switchTo().parentFrame();
		 don.findElement(By.cssSelector("button[aria-label='Send']")).click();
	   }
	   @Before
       public void bef() {
	   don.switchTo().parentFrame();
       }
	   @Test
	   public void changingMailView() throws InterruptedException {
		   ele=stop.until(ExpectedConditions.visibilityOfElementLocated((By.id("topbarlogoserviceName"))));
			System.out.println(ele.getText());
			System.out.println("We Entered Email page:- \n\n\n");
		   don.switchTo().frame(iframe);
			//closing assistant
//			if(don.findElement(By.cssSelector(".zmOneStopHdrAction>button[title=\"Close\"]")).isDisplayed()) {
//				don.findElement(By.cssSelector(".zmOneStopHdrAction>button[title=\"Close\"]")).click();
//			}
		   don.findElement(By.cssSelector("li[data-tooltip=\"Integration Settings\"]")).click();
		   List<WebElement> settings=don.findElements(By.className("zmSetCard"));
		   settings.get(3).click();
		   //selecting vertical preview
		   Thread.sleep(3000);
		   don.findElement(By.className("zmSetImgTxtBox")).click();
		   Thread.sleep(1000);
		   don.findElement(By.cssSelector(".jsTabDragDrop>.msi-close")).click();
		   don.switchTo().parentFrame();
	   }
	   @Test
	   public void changeingCompse() throws InterruptedException{
		   ele=stop.until(ExpectedConditions.visibilityOfElementLocated((By.id("topbarlogoserviceName"))));
			System.out.println(ele.getText());
			System.out.println("We Entered Email page:- \n\n\n");
		   don.switchTo().frame(iframe);
		   don.findElement(By.cssSelector("li[data-tooltip=\"Integration Settings\"]")).click();
		   List<WebElement> settings=don.findElements(By.className("zmSetCard"));
		   settings.get(4).click();
		   Thread.sleep(3000);
		   ele=don.findElement(By.className("SC_pageHolder"));
		   js.executeScript("window.scrollBy(0,900)");
		   don.findElement(By.cssSelector("span[data-val=\"Courier\"]")).click();
		   Thread.sleep(1000);
		   don.findElement(By.cssSelector("span[data-val=\"14\"]")).click();
		   Thread.sleep(1000);
		   don.findElement(By.cssSelector("li>i[class=\"msi-close\"]")).click();
		   don.switchTo().parentFrame();
	   }
	   
	   
}
