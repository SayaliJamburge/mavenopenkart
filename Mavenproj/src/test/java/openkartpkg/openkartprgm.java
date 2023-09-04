package openkartpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class openkartprgm {
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJar\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d;
		// d= new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--remote-allow-origins=*");
		d= new ChromeDriver(opt);
		d.get("https://www.opencart.com/");
		Thread.sleep(10000);
		
		
	}
	

}
