package Log_In;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_In {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	
	
	}
}
