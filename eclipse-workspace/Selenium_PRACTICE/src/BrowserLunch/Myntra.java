package BrowserLunch;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karan Gupta\\OneDrive\\Desktop\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Scroll code
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		
 		
		driver.findElement(By.xpath("(//img[contains(@class,'image-image undefined image-hand')])[13]")).click();  //first product details selected
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//img[@title='Roadster Men Blue Printed Casual Sustainable Shirt']")).click(); //In product -> item selected
		Thread.sleep(2000);
		System.out.println(driver.getTitle()); 

		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		driver.navigate().to("https://www.myntra.com/shirts/roadster/roadster-men-blue-printed-casual-sustainable-shirt/1364628/buy");//Link changes
		

		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='sizeButtonsContainer']//div[1]//div[1]//button[1]//p[1]")).click(); //click to size
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click(); //click to add to cart
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click(); //click to go to cart
		//driver.get("https://www.myntra.com/checkout/cart"); //shopping cart 

		Thread.sleep(2000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));

		System.out.println(driver.getTitle());

	}

}
