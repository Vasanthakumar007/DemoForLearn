package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorCorrectiovel {
	public static void main(String[] args) {									
        String baseUrl = "http://automationpractice.com/index.php?id_category=5&controller=category";					
        System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");					
        WebDriver driver = new ChromeDriver();		
        // driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
        
        WebDriverWait temp=new WebDriverWait(driver,20);
       
        
        driver.get(baseUrl);					
      	driver.manage().window().maximize();
      	if(driver.findElement(By.id("productsSortForm")).isDisplayed()) {
      		Select drop=new Select(driver.findElement(By.id("selectProductSort")));
    	    System.out.println("hai");
            drop.selectByIndex(2);  
            //Thread.sleep(10000);
            driver.close();
      	}
      	
	    
    }
}
