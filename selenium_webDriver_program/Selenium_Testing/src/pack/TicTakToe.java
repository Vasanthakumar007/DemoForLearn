package pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicTakToe {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/vasanth-zstk257/Desktop/selinum/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=tic+tac+toe+game&oq=tic+&aqs=chrome.3.69i57j46i175i199i433i512j0i131i433i512j0i512l3j0i457i512j0i402j0i433i512j46i512.3664j0j15&sourceid=chrome&ie=UTF-8");
		Thread.sleep(5000);
		System.out.println("zooming");
		Robot robot = new Robot();
		System.out.println("About to zoom in");
		for (int i = 0; i < 3; i++) {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		}
	}

}
