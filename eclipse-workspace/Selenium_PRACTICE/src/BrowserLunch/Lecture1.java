package BrowserLunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Lecture1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Karan Gupta\\OneDrive\\Desktop\\Webdriver\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://nobelpagedev.iworklab.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());

	
	}

}
