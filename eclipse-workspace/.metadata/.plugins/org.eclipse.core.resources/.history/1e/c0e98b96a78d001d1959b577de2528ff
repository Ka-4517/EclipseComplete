package NobelPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Karan Gupta\\OneDrive\\Desktop\\Webdriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://nobelpagedev.iworklab.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("karannp2@yopmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Karan123@");
			Thread.sleep(2000);
			driver.findElement(By.id("exampleCheck1")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Login to NobelPage']")).click();
			Thread.sleep(10000);
			driver.close();
			
			
		
		

	}

}
